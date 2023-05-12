package com.geekster.Employ.Address.Respository;

import com.geekster.Employ.Address.model.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployRepository extends JpaRepository<Employees,Long> {


}
