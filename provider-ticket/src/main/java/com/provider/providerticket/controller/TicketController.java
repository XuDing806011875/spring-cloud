package com.provider.providerticket.controller;

import com.provider.providerticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * create by
 *
 * @author dingxu
 * @date 2018/9/24 14:19
 */
@RestController
public class TicketController {
    @Autowired
    TicketService ticketService;

    @RequestMapping("/ticket")
    public String getTicket(){
        return  ticketService.getTicket();
    }
}
