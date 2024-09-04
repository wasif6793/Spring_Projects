package org.wasif.monolithic.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wasif.monolithic.model.TicketModel;

public interface TicketRepo extends JpaRepository<TicketModel, String> {

    //create custom CRUD method



}
