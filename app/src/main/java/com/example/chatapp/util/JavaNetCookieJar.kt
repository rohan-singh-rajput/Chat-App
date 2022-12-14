package com.example.chatapp.util

import okhttp3.CookieJar
import okhttp3.Cookie
import okhttp3.HttpUrl
import java.net.CookieManager
import java.util.ArrayList
import java.util.stream.Collectors

class JavaNetCookieJar(cookieManager : CookieManager) : CookieJar {
    private val storage : MutableList<Cookie> = ArrayList()
    override fun saveFromResponse(url : HttpUrl, cookies : List<Cookie>) {
        storage.addAll(cookies)
    }

    override fun loadForRequest(url : HttpUrl) : List<Cookie> {

        // Remove expired Cookies
        storage.removeIf { cookie : Cookie -> cookie.expiresAt < System.currentTimeMillis() }

        // Only return matching Cookies
        return storage.stream().filter { cookie : Cookie -> cookie.matches(url) }
            .collect(Collectors.toList())
    }
}