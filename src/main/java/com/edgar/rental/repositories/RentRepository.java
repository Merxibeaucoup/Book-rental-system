package com.edgar.rental.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edgar.rental.models.Rent;

public interface RentRepository  extends JpaRepository<Rent, Long>{

}
