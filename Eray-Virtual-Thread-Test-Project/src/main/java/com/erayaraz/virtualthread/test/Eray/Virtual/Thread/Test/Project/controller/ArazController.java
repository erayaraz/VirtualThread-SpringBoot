package com.erayaraz.virtualthread.test.Eray.Virtual.Thread.Test.Project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@RestController
@RequestMapping("/virtual")
public class ArazController {

    /**
     * Apache Benchmark Test
     * ab -c 10000 -n 10000 http://localhost:8080/virtual/thread/delay/service?second=3
     */

    private static final HttpClient client = HttpClient.newHttpClient();

    @GetMapping("/thread/delay/service")
    public String testVirtualThread(@RequestParam String second) throws Exception {

        try {
            Thread.sleep(2000);
            //sendRequestToDelayService(second);
            return "Test";
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    private String sendRequestToDelayService(String second) throws URISyntaxException, IOException, InterruptedException {
        URI uri = new URI("http://httpbin.org/delay/" + second);
        HttpRequest request = HttpRequest.newBuilder().GET().uri(uri).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

}
