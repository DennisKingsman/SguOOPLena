package main.task.three;

import dao.ConnectionBuilderImpl;
import dao.CustomerDao;
import entity.Customer;

import java.util.List;

public class MainCustomer {

    private static final String NAME = "some";
    private static final String NEW_NAME = "Z-corp";

    private static CustomerDao customerDao;

    public static void main(String[] args) {
        getAll();
        getByName();

        Customer customer = new Customer();
        customer.setCustomerName(NEW_NAME);
        customer.setBankRequisites("1234-3214-9876-1234");
        customer.setCustomerPhoneNumber("+7-987-912-1234");
        customer.setContactPerson("John");
        createCustomer(customer);
        getAll();
        delete();
        getAll();
        createCustomer(customer);
    }

    private static void delete(){
        System.out.println("Deleting " + NEW_NAME);
        customerDao.setConnectionBuilder(new ConnectionBuilderImpl());
        customerDao.delete(NEW_NAME);
        System.out.println("complete");
    }

    private static void createCustomer(Customer customer){
        System.out.println("Creating new customer");
        customerDao.setConnectionBuilder(new ConnectionBuilderImpl());
        customerDao.create(customer);
    }

    private static void getAll(){
        System.out.println("Get all customers");
        customerDao = new CustomerDao();
        customerDao.setConnectionBuilder(new ConnectionBuilderImpl());
        List<Customer> customers = customerDao.getAll();
        customers.forEach(System.out::println);
    }

    private static void getByName(){
        System.out.println("Get customer with name: " + NAME);
        customerDao.setConnectionBuilder(new ConnectionBuilderImpl());
        Customer customer = customerDao.getByName(NAME);
        System.out.println(customer);
    }

}
