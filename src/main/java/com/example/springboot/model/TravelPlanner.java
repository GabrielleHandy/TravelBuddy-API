package com.example.springboot.model;

import jakarta.persistence.*;
import javax.print.attribute.standard.Destination;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "travelplanners")
public class  TravelPlanner {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;


    @OneToMany(mappedBy = "travelplanner")
    private Set<Destination> dests = new HashSet<Destination>();



    @Column
    private Date dateLastAccessed;
    @Column
    private Date dateCreated;

    public TravelPlanner() {
        this.dateCreated = new Date();
        this.dateLastAccessed = this.dateCreated;

    }

    public TravelPlanner(Long id, String name, User user, Set<Destination> dests, Date dateLastAccessed, Date dateCreated) {
        this.id = id;
        this.name = name;
        this.user = user;
        this.dests = dests;
        this.dateLastAccessed = dateLastAccessed;
        this.dateCreated = dateCreated;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Destination> getDests() {
        return dests;
    }

    public void setDests(Set<Destination> dests) {
        this.dests = dests;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateLastAccessed() {
        return dateLastAccessed;
    }

    public void setDateLastAccessed(Date dateLastAccessed) {
        this.dateLastAccessed = dateLastAccessed;
    }

    @Override
    public String toString() {
        return "TravelPlanner{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", user=" + user +
                ", dests=" + dests +
                ", dateLastAccessed=" + dateLastAccessed +
                ", dateCreated=" + dateCreated +
                '}';
    }
}