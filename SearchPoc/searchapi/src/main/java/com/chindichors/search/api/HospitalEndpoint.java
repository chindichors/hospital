package com.chindichors.search.api;

import com.chindichors.search.persistence.HospitalData;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import java.util.logging.Logger;

import javax.inject.Named;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "hospitalApi",
        version = "v1",
        resource = "hospital",
        namespace = @ApiNamespace(
                ownerDomain = "api.search.chindichors.com",
                ownerName = "api.search.chindichors.com",
                packagePath = ""
        )
)
public class HospitalEndpoint {

    private static final Logger logger = Logger.getLogger(HospitalEndpoint.class.getName());

    /**
     * This method gets the <code>Hospital</code> object associated with the specified <code>id</code>.
     *
     * @param id The id of the object to be returned.
     * @return The <code>Hospital</code> associated with <code>id</code>.
     */
    @ApiMethod(name = "getHospital")
    public Hospital getHospital(@Named("id") String id) {
        // TODO: Implement this function
        logger.info("Calling getHospital method");
        HospitalData hospitalData = HospitalData.getInstance();
        Hospital hospital = hospitalData.getHospitalData(id);
        logger.info("got details City== " + hospital.getCity() + " ***Name= " + hospital.getName());
        return hospital;
    }

    /**
     * This inserts a new <code>Hospital</code> object.
     *
     * @param hospital The object to be added.
     * @return The object to be added.
     */
    @ApiMethod(name = "insertHospital")
    public Hospital insertHospital(Hospital hospital) {
        // TODO: Implement this function
        logger.info("Calling insertHospital method");

        HospitalData hospitalData = HospitalData.getInstance();
        return hospitalData.saveHospitalData(hospital.getId(), hospital);

    }
}