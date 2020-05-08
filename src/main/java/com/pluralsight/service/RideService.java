package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Ride;

public interface RideService {

    Ride CreateRide(Ride ride);
	List<Ride> getRides();

}