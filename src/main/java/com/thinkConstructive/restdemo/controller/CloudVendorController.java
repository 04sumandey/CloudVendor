package com.thinkConstructive.restdemo.controller;

import com.thinkConstructive.restdemo.model.CloudVendor;
import com.thinkConstructive.restdemo.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {

    CloudVendorService cloudVendorService;
    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

//  Read Specific Cloud Vendor Details from DB

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId){

        return cloudVendorService.getCloudVendor(vendorId);
//                new CloudVendor("C1","Vendor 1",
//                "Address one","XYZ");
    }

    //  Read All Cloud Vendor Details from DB
    @GetMapping()
    public List<CloudVendor> getAllCloudVendorDetails(){

        return cloudVendorService.getAllCloudVendors();
    }

    @PostMapping   //create vendor details
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.createCloudVendor(cloudVendor);
        return "Cloud Vendor is Created Successfully.";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud Vendor is Updated Successfully.";
    }
    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId){
        cloudVendorService.deleteCloudVendor(vendorId);
        return "Cloud Vendor is Deleted Successfully.";
    }

}
