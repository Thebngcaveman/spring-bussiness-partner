package com.thecaveman.bussinesspartner.springbussinesspartner.model;

import java.util.UUID;
import javax.persistence.*;


@Entity()
@Table(name = "partner")
public class BussinessPartner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "companyType")
    private String companyType;
    @Column(name = "partnerBound")
    private String partnerBound;

    public BussinessPartner(Long id, String name, String companyType,String partnerBound) {
        this.id = id;
        this.name = name;
        this.companyType = companyType;
        this.partnerBound = partnerBound;
    }

    public BussinessPartner() {
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getPartnerBound() {
        return partnerBound;
    }

    public void setPartnerBound(String partnerBound) {
        this.partnerBound = partnerBound;
    }
}
