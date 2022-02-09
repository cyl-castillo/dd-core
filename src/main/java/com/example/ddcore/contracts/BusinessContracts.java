package com.example.ddcore.contracts;

import com.example.ddcore.commons.Condition;
import com.example.ddcore.models.Business;

import java.util.List;

public interface BusinessContracts {
    Business createBusiness(Business business);
    Business findByAddress(String address);
    Business findByLatitudeAndLongitude(Float latitude, Float longitude);
    List<Business> findAllByType(String type);
    List<Business>findAllByConditions(List<Condition> conditions);

}
