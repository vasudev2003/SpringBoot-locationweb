package com.vasudev.springboot.location.service;

import com.vasudev.springboot.location.models.Location;

import java.util.List;

public interface LocationService {
   Location saveLocation(Location location);
   Location updateLocation(Location location);
   void deleteLocation(Location location);
   Location getLocationById(long id);
   List<Location>getAllLocations();
}
