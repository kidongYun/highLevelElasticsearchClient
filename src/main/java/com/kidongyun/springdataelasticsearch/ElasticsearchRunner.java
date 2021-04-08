package com.kidongyun.springdataelasticsearch;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@AllArgsConstructor
public class ElasticsearchRunner implements ApplicationRunner {
    private final RestHighLevelClient client;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("YKD : " + client.toString());
    }
}
