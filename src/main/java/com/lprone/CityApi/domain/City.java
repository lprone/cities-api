package com.lprone.CityApi.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class City {
    private String name;
    private double latitude;
    private double longitude;
}
