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
        String names [] = {"sdm","kmc","kle","jayadeva","kims"};
        String ids [] = {"1","2","3","4","5"};
        String descriptions [] = {"charity", "govt", "partially funded", "private", "govt"};
        String cities[] = {"dharwad","hubli","belgaum","bangalore","hubballi"};
        String levels[] = {"medium","low","high","highest","lowest"};

        for(int i=0;i<names.length;i++){
            Hospital hospital = new Hospital();
            hospital.setId(ids[i]);
            hospital.setName(names[i]);
            hospital.setCity(cities[i]);
            hospital.setDesc(descriptions[i]);
            hospital.setLevel(levels[i]);
            mapOfHospitals.put(ids[i],hospital);

        }

    }

    public static Map<String, Hospital> getMapOfHospitals() {
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
