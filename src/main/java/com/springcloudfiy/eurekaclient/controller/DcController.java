package com.springcloudfiy.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wj42134
 * @date 2017 12 29 12:51
 */
@RestController
public class DcController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public String dc() {
        return "Services: " + discoveryClient.getServices();
    }

}
