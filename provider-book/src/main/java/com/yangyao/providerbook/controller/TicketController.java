package com.yangyao.providerbook.controller;


import com.yangyao.providerbook.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {
    @Autowired
    TicketService ticketService;

    @RequestMapping("/ticket")
    public String getTicket(){
        String ticket = ticketService.getTicket();
        return ticket;
    }
}
