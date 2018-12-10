package com.mohan.cloud.feign;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.mohan.cloud.pojo.User;
import com.mohan.config.FeignConfiguration;

import feign.Param;
import feign.RequestLine;

@FeignClient(name = "microservice-provider-user", configuration = FeignConfiguration.class)
public interface UserFeignClient {

    @RequestLine("GET /{id}")
    public User findById(@Param("id") Long id);
}
