package com.example;

public class Customer {
    private Long id;

    private String firstName;
    private String lastName;

    public Customer(long id, String content) {
        this.id = id;
        content = firstName+lastName;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getName(){
    	return firstName + lastName;
    }

}
