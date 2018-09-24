package com.provider.providerticket.service;

import org.springframework.stereotype.Service;

/**
 * create by
 *
 * @author dingxu
 * @date 2018/9/24 14:18
 */
@Service
public class TicketService {

    public String getTicket(){
        System.out.println("8002");
        return "《好声音》";
    }
}
