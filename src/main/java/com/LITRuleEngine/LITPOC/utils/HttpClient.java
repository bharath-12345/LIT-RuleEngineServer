package com.LITRuleEngine.LITPOC.utils;

import okhttp3.*;

import java.io.FileWriter;
import java.io.IOException;


public class HttpClient {
    private final OkHttpClient httpClient = new OkHttpClient();

    public String getDroolFile(String drlFilename) throws Exception {
        Request request = new Request.Builder()
                .url("http://localhost:3000/file/" + drlFilename)
                .build();

        try (Response response = httpClient.newCall(request).execute()) {

            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);

            return response.body().string();

        }
    }
}
