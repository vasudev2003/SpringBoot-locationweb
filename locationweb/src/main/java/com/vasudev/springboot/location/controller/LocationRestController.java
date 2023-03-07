package com.vasudev.springboot.location.controller;

import com.vasudev.springboot.location.interfaces.LocationRepository;
import com.vasudev.springboot.location.models.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/locations")
public class LocationRestController {
    @Autowired
    LocationRepository locationRepository;
    @GetMapping
    public List<Location> getLocations()
    {
        return locationRepository.findAll();
    }
    @PostMapping
    public Location createLocations(@RequestBody Location location)
    {
        return locationRepository.save(location);
    }
    public Location updateLocations(@RequestBody Location location)
    {
        return locationRepository.save(location);
    }
    @DeleteMapping("/{id}")
    public void deleteLocations(@PathVariable("id") long id)
    {
       locationRepository.deleteById(id);
    }
    @GetMapping("/{id}")
    public Optional<Location> getLocation(@PathVariable("id") long id)
    {
       return locationRepository.findById(id);
    }


}
