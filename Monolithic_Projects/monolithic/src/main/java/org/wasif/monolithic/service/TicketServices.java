package org.wasif.monolithic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wasif.monolithic.model.TicketModel;
import org.wasif.monolithic.repo.TicketRepo;

import java.util.List;
import java.util.UUID;

@Service
public class TicketServices {
    @Autowired

    private TicketRepo repo;


    //create user
    public TicketModel createUser(TicketModel model) {
        String ticketid = UUID.randomUUID().toString();
        model.setTicketId(ticketid);
        return repo.save(model);
    }


    //get user by id
    public TicketModel getUserById(String userId) {
        return repo.findById(userId).get();
    }


    //get all users
    public List<TicketModel> getAllUsers() {
        return repo.findAll();
    }





}
