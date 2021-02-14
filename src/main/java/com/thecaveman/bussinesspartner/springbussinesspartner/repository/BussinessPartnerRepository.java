package com.thecaveman.bussinesspartner.springbussinesspartner.repository;

import com.thecaveman.bussinesspartner.springbussinesspartner.model.BussinessPartner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BussinessPartnerRepository extends JpaRepository<BussinessPartner, Long> {

}
