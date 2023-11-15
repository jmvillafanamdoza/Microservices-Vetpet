package pe.cibertec.ecommerc.ApiCustomer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.cibertec.ecommerc.ApiCustomer.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    
}
