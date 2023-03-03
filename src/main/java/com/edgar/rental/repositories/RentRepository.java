package com.edgar.rental.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edgar.rental.models.Rent;

@Repository
public interface RentRepository extends JpaRepository<Rent, Long> {

}
