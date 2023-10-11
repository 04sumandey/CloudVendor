package com.thinkConstructive.restdemo.repository;

import com.thinkConstructive.restdemo.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository<CloudVendor,String> {
}
