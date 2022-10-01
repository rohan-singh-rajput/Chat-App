package com.example.chatapp.util;

import androidx.annotation.NonNull;

import java.net.CookieManager;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;

public class JavaNetCookieJar<cookieManager> implements CookieJar {

    private final List<Cookie> storage = new ArrayList<>();

    @Override
    public void saveFromResponse(@NonNull HttpUrl url, List<Cookie> cookies) {
        storage.addAll(cookies);
    }

    @NonNull
    @Override
    public List<Cookie> loadForRequest(@NonNull HttpUrl url) {

        // Remove expired Cookies
        storage.removeIf(cookie -> cookie.expiresAt() < System.currentTimeMillis());

        // Only return matching Cookies
        return storage.stream().filter(cookie -> cookie.matches(url)).collect(Collectors.toList());
    }
}
