package com.example.mongo;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.Collections;

@Configuration
@EnableMongoRepositories
public class MongoConfig {

    @Bean
    public MongoDbFactory mongoDbFactory() throws Exception {
        MongoCredential user = MongoCredential.createCredential("ukasz", "spejd", "ukasz".toCharArray());
        ServerAddress serverAddress = new ServerAddress("ds013206.mlab.com", 13206);
        MongoClient mongoClient = new MongoClient(serverAddress, Collections.singletonList(user));
        return new SimpleMongoDbFactory(mongoClient, "spejd");
    }

    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongoDbFactory());
    }
}
