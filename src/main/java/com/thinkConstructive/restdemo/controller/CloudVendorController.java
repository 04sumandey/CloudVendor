package com.thinkConstructive.restdemo.controller;

import com.thinkConstructive.restdemo.model.CloudVendor;
import com.thinkConstructive.restdemo.model.ErrorResponse;
import com.thinkConstructive.restdemo.service.CloudVendorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<?> getCloudVendorDetails(@PathVariable("vendorId") String vendorId){

        CloudVendor cloudVendor =  cloudVendorService.getCloudVendor(vendorId);
        if (cloudVendor!=null){
            return ResponseEntity.ok(cloudVendor);
        }else{
            ErrorResponse errorResponse=new ErrorResponse("INVALID_ID", "Vendor Does not Exists");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
        }
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
