package com.consumer.consumeruser.controller;

import org.bouncycastle.jcajce.provider.asymmetric.dh.BCDHPublicKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * create by
 *
 * @author dingxu
 * @date 2018/9/24 14:25
 */
@RestController
public class UserController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/buy")
    public String getTicket(String name){
        String s = restTemplate.getForObject("http://PROVIDER-TICKET/ticket", String.class);
        return name+"购买了"+s;
    }
}
