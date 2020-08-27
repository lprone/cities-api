package com.lprone.CityApi.repository;

import com.lprone.CityApi.domain.City;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CityRepository {

    private final List<City> cities = new ArrayList<>();

    {
        cities.add(new City("Buenos Aires", -34.61315, -58.37723));
        cities.add(new City("Córdoba", -31.4135, -64.18105));
        cities.add(new City("Rosario", -32.94682, -60.63932));
        cities.add(new City("Mendoza", -32.89084, -68.82717));
        cities.add(new City("San Miguel de Tucumán", -26.82414, -65.2226));
        cities.add(new City("La Plata", -34.92145, -57.95453));
        cities.add(new City("Mar del Plata", -38.00042, -57.5562));
        cities.add(new City("Salta", -24.7859, -65.41166));
        cities.add(new City("Santa Fe", -31.64881, -60.70868));
        cities.add(new City("San Juan", -31.5375, -68.53639));
        cities.add(new City("Resistencia", -27.46056, -58.98389));
        cities.add(new City("Santiago del Estero", -27.79511, -64.26149));
        cities.add(new City("Posadas", -27.36708, -55.89608));
        cities.add(new City("San Salvador de Jujuy", -24.19457, -65.29712));
        cities.add(new City("Bahía Blanca", -38.71959, -62.27243));
        cities.add(new City("Paraná", -31.73271, -60.52897));
    }

    public List<City> getAll() {
        return cities;
    }

    public City get(String cityName) {
        for (City city : cities) {
            if (city.getName().equals(cityName)) {
                return city;
            }
        }
        return null;
    }

}
