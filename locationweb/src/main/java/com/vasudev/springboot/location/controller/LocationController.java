package com.vasudev.springboot.location.controller;

import com.vasudev.springboot.location.models.Location;
import com.vasudev.springboot.location.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Controller
public class LocationController {
    @Autowired
    LocationService locationService;
    @RequestMapping("/showCreate")
    public  String showCreate()
    {
        return "createLocation";
    }
    @RequestMapping("/saveLoc")
    public  String saveLocation(@ModelAttribute("location")Location location, ModelMap modelMap)
    {
         Location locationSaved = locationService.saveLocation(location);
         String msg="Location saved with id:"+locationSaved.getId();
         modelMap.addAttribute("msg", msg);
        return "createLocation";
    }
    @RequestMapping("/displayLocations")
    public String displayLocations(ModelMap modelMap)
    {
         List<Location> locations = locationService.getAllLocations();
         modelMap.addAttribute("locations", locations);
        return "displayLocations";
    }
    @RequestMapping("/deleteLocation")
    public String deleteLocations(@RequestParam("id") int id, ModelMap modelMap )
    {
        Location locationById = locationService.getLocationById(id);
        locationService.deleteLocation(locationById);
         List<Location> allLocations = locationService.getAllLocations();
         modelMap.addAttribute("allLocations",allLocations);

        return "displayLocations";
    }
    @RequestMapping("/showUpdate")
    public String editLocations(@RequestParam("id")int id,ModelMap modelMap)
    {
        Location locationById = locationService.getLocationById(id);
        modelMap.addAttribute("locationById", locationById);
        return "editLocation";
    }
    @RequestMapping("/updateLocation")
    public String updateLocations(@ModelAttribute("location") Location location,ModelMap modelMap)
    {
        locationService.updateLocation(location);
        List<Location> allLocations = locationService.getAllLocations();
        modelMap.addAttribute("allLocations", allLocations);

        return "displayLocations";
    }

}
