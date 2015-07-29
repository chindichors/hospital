package com.chindichors.search.persistence;

import com.chindichors.search.api.Hospital;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by suvisavi on 29/07/15.
 */
public class HospitalData {
    private static HospitalData ourInstance = null;

    public static HospitalData getInstance() {

        if(ourInstance == null){
            ourInstance = new HospitalData();
        }
        return ourInstance;
    }

    private static Map<String, Hospital> mapOfHospitals ;

    private HospitalData() {
        mapOfHospitals = new HashMap<String, Hospital>();
    }

    private static Map<String, Hospital> getMapOfHospitals() {
        return ourInstance.mapOfHospitals;
    }

    private static void setMapOfHospitals(Map<String, Hospital> mapOfHospitals) {
        ourInstance.mapOfHospitals = mapOfHospitals;
    }

    public static Hospital saveHospitalData(String id, Hospital hospital){
        ourInstance.mapOfHospitals.put(id, hospital);

        return hospital;
    }

    public static Hospital getHospitalData(String id){
        return ourInstance.mapOfHospitals.get(id);
    }

}
