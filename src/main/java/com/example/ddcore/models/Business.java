package com.example.ddcore.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Business {
    private String name;
    private String description;
    private String type;
    private String address;
    private Float latitude;
    private Float longitude;
}

