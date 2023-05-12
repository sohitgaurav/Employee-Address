package com.geekster.Employ.Address.controller;

import com.geekster.Employ.Address.model.Addresses;
import com.geekster.Employ.Address.service.AddressService;
import io.micrometer.common.lang.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    AddressService addressServices;

    @PostMapping(value = "/addresses")
    public String addAddresses(@RequestBody List<Addresses> addresses) {
        return addressServices.addAddresses(addresses);
    }

    @GetMapping(value = "/addresses")
    public List<Addresses> getAddresses(@Nullable @RequestParam Long addressId) {
        return addressServices.getAddresses(addressId);
    }

    @DeleteMapping(value = "addresses/{addressId}")
    public String removeAddress(@PathVariable Long addressId) {
        return addressServices.removeAddress(addressId);
    }

    @PutMapping(value = "address/{addressId}")
    public String updateAddress(@PathVariable Long addressId, @RequestBody Addresses addresses) {
        return addressServices.updateAddress(addressId, addresses);
    }
}
