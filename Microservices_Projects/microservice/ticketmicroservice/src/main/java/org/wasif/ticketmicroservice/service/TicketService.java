package org.wasif.ticketmicroservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wasif.ticketmicroservice.model.TicketModel;
import org.wasif.ticketmicroservice.repo.TicketRepo;

import java.util.List;

@Service
public class TicketService {
    @Autowired

    private TicketRepo repo;

    // create ticket
    public TicketModel createTicket(TicketModel model) {
        return repo.save(model);
    }



    //get all ticket
    public List<TicketModel> getAllTickets() {
        return repo.findAll();
    }



    //get ticket by id
    public TicketModel getTicketById(String ticketId) {
        return repo.findById(ticketId).get();
    }

}
