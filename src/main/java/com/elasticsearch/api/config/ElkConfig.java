package com.elasticsearch.api.config;

import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.rest_client.RestClientTransport;
import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ElkConfig {
    @Bean
    public RestClient getRestClient(){
        RestClient restClient = RestClient.builder(
                new HttpHost("10.11.200.117",9201)

        ).build();
        return restClient;
    }

    @Bean
    public ElasticsearchTransport getElasticsearchTransport(){
        return new RestClientTransport(getRestClient(), new JacksonJsonpMapper());
    }
}
