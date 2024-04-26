package com.example.springboot.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;


@Embeddable
public class TravelPlannerDestinationKey implements Serializable {

    @Column(name = "travelplanner_id")
    Long travelplannerId;

    @Column(name = "dest_id")
    Long destinationId;

    public TravelPlannerDestinationKey() {
    }

    public TravelPlannerDestinationKey(Long travelplannerId, Long destinationId) {
        this.travelplannerId = travelplannerId;
        this.destinationId = destinationId;
    }

    public Long getTravelplannerId() {
        return travelplannerId;
    }

    public void setTravelplannerId(Long travelplannerId) {
        this.travelplannerId = travelplannerId;
    }

    public Long getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(Long destinationId) {
        this.destinationId = destinationId;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
