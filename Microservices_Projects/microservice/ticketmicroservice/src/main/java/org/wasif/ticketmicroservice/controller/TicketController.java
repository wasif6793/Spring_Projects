package org.wasif.ticketmicroservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.wasif.ticketmicroservice.model.TicketModel;
import org.wasif.ticketmicroservice.service.TicketService;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    //call create ticket
    @PostMapping()
    public TicketModel createTicket(@RequestBody TicketModel ticketModel) {
        return ticketService.createTicket(ticketModel);
    }

    @GetMapping()
    public List<TicketModel> getAllTickets() {
        return ticketService.getAllTickets();
    }

    @GetMapping("/{ticketId}")
    public TicketModel getTicketById(@PathVariable("ticketId") @RequestBody String ticketId) {
        return ticketService.getTicketById(ticketId);
    }
}
