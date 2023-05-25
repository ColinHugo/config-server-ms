package com.aleal.hotels.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@Data
public class PropertiesHotels {

    private String msg;
    private String buildVersion;
    private Map< String, String > mailDetails;

}
