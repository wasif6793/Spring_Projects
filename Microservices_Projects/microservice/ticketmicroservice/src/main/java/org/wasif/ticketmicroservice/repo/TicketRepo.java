package org.wasif.ticketmicroservice.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.wasif.ticketmicroservice.model.TicketModel;

public interface TicketRepo extends MongoRepository<TicketModel, String> {


}
