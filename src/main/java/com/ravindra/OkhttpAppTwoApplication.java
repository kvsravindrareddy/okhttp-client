package com.ravindra;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@SpringBootApplication
@RestController
public class OkhttpAppTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(OkhttpAppTwoApplication.class, args);
	}
	
	@GetMapping(value="/testtwo")
	public String hello() throws IOException
	{
		OkHttpClient httpClient = new OkHttpClient();
		Request request = new Request.Builder().url("http://localhost:7001/testone").get().build();
		Response response = httpClient.newCall(request).execute();
		String serviceOneResponse = response.body().string();
		System.out.println("------------------"+serviceOneResponse);
		return "Service One";
	}
}