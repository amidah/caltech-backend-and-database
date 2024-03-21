package com.jdbc.JDBCConfiguaration;

import com.jdbc.JDBCConfiguaration.db.DB;
import com.jdbc.JDBCConfiguaration.model.Customer;

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
        cust1.setName("Sam");
        cust1.setPhone("+12-123456788");
        cust1.setEmail("sam@gmail.com");
        cust1.setAge(25);
        cust1.setTemperature(98.9f);
        
        DB db = new DB();
        
        db.createConnection();
        
        db.updateCustomer(cust1);
        
        db.closeConnection();
    }
}
