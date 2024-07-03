package com.E_Commerce.com.project.Ecommerce.Service;

import java.util.List;
import com.E_Commerce.com.project.Ecommerce.Entity.Customer;

public interface CustomerService {
    List<Customer> getAllCustomers();
    Customer getCustomerById(Integer id);
    Customer addCustomer(Customer customer);
    Customer updateCustomer(Integer id, Customer customer);
    void deleteCustomer(Integer id);
}
