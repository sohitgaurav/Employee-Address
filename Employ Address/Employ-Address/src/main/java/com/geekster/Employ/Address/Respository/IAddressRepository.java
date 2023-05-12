package com.geekster.Employ.Address.Respository;

import com.geekster.Employ.Address.model.Addresses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepository extends JpaRepository<Addresses,Long> {

}
