package com.thinkConstructive.restdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class CloudVendor {
    @Id
    private  String VenderId;
    private  String VenderName;
    private  String VenderAddress;
    private  String VenderPhonNumber;

    public String getVenderId() {
        return VenderId;
    }

    public void setVenderId(String venderId) {
        VenderId = venderId;
    }

    public String getVenderName() {
        return VenderName;
    }

    public void setVenderName(String venderName) {
        VenderName = venderName;
    }

    public String getVenderAddress() {
        return VenderAddress;
    }

    public void setVenderAddress(String venderAddress) {
        VenderAddress = venderAddress;
    }

    public String getVenderPhonNumber() {
        return VenderPhonNumber;
    }

    public void setVenderPhonNumber(String venderPhonNumber) {
        VenderPhonNumber = venderPhonNumber;
    }



    public CloudVendor() {
    }

    public CloudVendor(String venderId, String venderName, String venderAddress, String venderPhonNumber) {
        VenderId = venderId;
        VenderName = venderName;
        VenderAddress = venderAddress;
        VenderPhonNumber = venderPhonNumber;
    }


}
