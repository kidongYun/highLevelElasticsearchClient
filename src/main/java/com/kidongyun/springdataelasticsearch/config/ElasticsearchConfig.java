package com.kidongyun.springdataelasticsearch.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ElasticsearchConfig {
    private final String host = "192.168.28.176";
    private final int port = 9300;

    @Bean
    public RestHighLevelClient client() throws Exception {
        return new RestHighLevelClient(RestClient.builder(new HttpHost(host, port, "http")));
    }
}
