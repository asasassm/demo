package com.example.demo.controller;

import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TmapController {
//    @GetMapping("/tmap")
//    public String callTmapAPI() throws Exception {
//        String apiKey = "YOUR_API_KEY";
//        String url = "https://apis.openapi.sk.com/tmap/..."; // Tmap API 엔드포인트와 필요한 파라미터 설정
//
//        OkHttpClient client = new OkHttpClient();
//        Request request = new Request.Builder()
//                .url(url)
//                .build();
//        Response response = client.newCall(request).execute();
//        String responseBody = response.body().string();
//
//        return responseBody;
//    }
}