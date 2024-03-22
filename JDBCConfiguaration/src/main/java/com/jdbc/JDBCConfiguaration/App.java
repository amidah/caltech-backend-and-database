package com.jdbc.JDBCConfiguaration;

import java.util.ArrayList;

import com.jdbc.JDBCConfiguaration.db.DB;
import com.jdbc.JDBCConfiguaration.model.Customer;
import com.jdbc.JDBCConfiguaration.model.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        // "John", "+12-123456789", "john@gmail.com", "1-APR-1990", 33, "12-MAY-2020:14:00", "12-MAY-2020:14:30", 100.5f
        Customer cust1 = new Customer(); 
        cust1.setCid(1);
        cust1.setName("John");
        cust1.setPhone("+12-123456789");
        cust1.setEmail("john@gmail.com");
        cust1.setAge(33);
        cust1.setBirthDate("1990-07-20");
        cust1.setInDateTime("2023-01-01 12:01:00");
        cust1.setOutDateTime("2023-01-01 12:30:00");
        cust1.setTemperature(98.6f);
        
        DB db = new DB();
        
        db.createConnection();
        
//        db.createCustomer(cust1);
//        db.updateCustomer(cust1);
//        ArrayList<Customer> customerList = db.getAllCustomers();
//        for(Customer cust : customerList) {
//        	System.out.println(cust);
//        }
//        db.deleteCustomer(4);
//        Customer customer = db.getCustomerById(1);
//        System.out.println(customer);
        
        User user = new User();
        user.setUid(2);
        user.setName("Sam Smith");
        user.setPassword("sam.smith@1234");
        
//        db.executeStoredProcedure(user);
        db.executeUpdateStoredProcedure(user);
        
        db.closeConnection();
    }
    
}
