package org.wasif.monolithic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.wasif.monolithic.model.TicketModel;
import org.wasif.monolithic.service.TicketServices;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    private TicketServices services;

    @PostMapping()
    public TicketModel addUser(@RequestBody TicketModel model) {

        return services.createUser(model);
    }

    @GetMapping()
    public List<TicketModel> getAllUsers() {
        return services.getAllUsers();
    }

    @GetMapping("/{userId}")
    public TicketModel getUserById(@PathVariable("ticketId") String ticketId) {
        return services.getUserById(ticketId);
    }





}
