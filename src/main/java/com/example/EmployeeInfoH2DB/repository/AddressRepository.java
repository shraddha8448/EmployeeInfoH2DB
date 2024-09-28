package com.example.EmployeeInfoH2DB.repository;

import com.example.EmployeeInfoH2DB.modal.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {
}
