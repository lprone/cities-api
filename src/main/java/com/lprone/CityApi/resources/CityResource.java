package com.lprone.CityApi.resources;

import com.lprone.CityApi.domain.City;
import com.lprone.CityApi.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CityResource {

    @Autowired
    CityRepository repository;

    @GetMapping("/cities")
    public List<City> retrieveAllCities() {
        return repository.getAll();
    }

    @GetMapping("/city")
    public City retrieveCity(String name) {
        return repository.get(name);
    }
}
