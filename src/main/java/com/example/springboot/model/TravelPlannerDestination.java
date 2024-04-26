package com.example.springboot.model;
import jakarta.persistence.*;

import javax.print.attribute.standard.Destination;
import java.util.Date;


public class TravelPlannerDestination {
    @EmbeddedId
    TravelPlannerDestinationKey id;

    @ManyToOne
    @MapsId("travelplannerId")
    @JoinColumn(name = "travelplanner_id")
    TravelPlanner travelPlanner;

    @ManyToOne
    @MapsId("destinationId")
    @JoinColumn(name = "dest_id")
    Destination destination;

    Date expectedTravelDate;

    // standard constructors, getters, and setters
}
