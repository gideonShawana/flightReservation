package com.gideonshawana.spring.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ReservationRepository extends CrudRepository<Reservation, Long> {

}
