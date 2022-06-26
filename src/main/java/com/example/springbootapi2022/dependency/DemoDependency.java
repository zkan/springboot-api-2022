package com.example.springbootapi2022.dependency;

public class DemoDependency {
    public static void main(String[] args) {

        {
            System.out.println("==================== Setter Injection ====================");
            Customer customer = new Customer();
            customer.setName("Kan Ouivirach");

            Address address = new Address();
            address.setAddressNo("99/999");
            address.setAddressName("Tiwanon Village");

            customer.setAddress(address);  // setter injection

            System.out.println("customer name: " + customer.getName());
            System.out.println("customer address: " + customer.getAddress().getAddressNo());
            System.out.println("customer address: " + customer.getAddress().getAddressName());
        }

        {
            System.out.println("==================== Constructor Injection ====================");
            Address address = new Address();
            address.setAddressNo("99/999");
            address.setAddressName("Tiwanon Village");

            Customer customer = new Customer(address);  // constructor injection
            customer.setName("Kan Ouivirach");

            System.out.println("customer name: " + customer.getName());
            System.out.println("customer address: " + customer.getAddress().getAddressNo());
            System.out.println("customer address: " + customer.getAddress().getAddressName());
        }

    }
}
