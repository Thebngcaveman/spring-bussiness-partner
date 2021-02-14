package com.thecaveman.bussinesspartner.springbussinesspartner.service;

import com.thecaveman.bussinesspartner.springbussinesspartner.model.BussinessPartner;
import com.thecaveman.bussinesspartner.springbussinesspartner.repository.BussinessPartnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BussinessPartnerService {

    @Autowired
    BussinessPartnerRepository bussinessPartnerRepository;

    public List<BussinessPartner> getPartner(){
        return bussinessPartnerRepository.findAll();
    }

    public void save(BussinessPartner partner){
        bussinessPartnerRepository.save(partner);
    }

    public BussinessPartner getPartnerById(Long id){
        return bussinessPartnerRepository.findById(id).get();
    }

    public void deletePartnerById(Long id){
        bussinessPartnerRepository.deleteById(id);
    }
}
