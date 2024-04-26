package com.example.springboot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "users")
public class User {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String fName;
    @Column
    private String lName;
    @Column(unique = true)
    private String emailAddress;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Column
    private String password;



    @OneToMany(mappedBy = "user", orphanRemoval = true)
    @Column
    @JsonIgnore
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<TravelPlanner> travelPlanners;


    public User() {
    }

    public User(Long id, String fName, String lName, String emailAddress, String password, List<TravelPlanner> travelPlanners) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.emailAddress = emailAddress;
        this.password = password;
        this.travelPlanners = travelPlanners;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public List<TravelPlanner> getTravelPlanners() {
        return travelPlanners;
    }

    public void setTravelPlanners(List<TravelPlanner> travelPlanners) {
        this.travelPlanners = travelPlanners;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", password='" + password + '\'' +
                ", travelPlanners=" + travelPlanners +
                '}';
    }
}