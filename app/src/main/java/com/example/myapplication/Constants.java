package com.example.myapplication;


import com.google.android.gms.location.Geofence;
import com.google.android.gms.maps.model.LatLng;

import java.util.HashMap;

/**
 * Constants used in this sample.
 */

final class Constants {

    private Constants() {
    }

    private static final String PACKAGE_NAME = "com.google.android.gms.location.Geofence";

    static final String GEOFENCES_ADDED_KEY = PACKAGE_NAME + ".GEOFENCES_ADDED_KEY";

    /**
     * Used to set an expiration time for a geofence. After this amount of time Location Services
     * stops tracking the geofence.
     */
    private static final long GEOFENCE_EXPIRATION_IN_HOURS = 12;

    /**
     * For this sample, geofences expire after twelve hours.
     */
    static final long GEOFENCE_EXPIRATION_IN_MILLISECONDS = Geofence.NEVER_EXPIRE;
    static final float GEOFENCE_RADIUS_IN_METERS = 50;

    /**
     * Map for storing information about airports in the San Francisco bay area.
     */
    static final HashMap<String, LatLng> GEOFENCE_LOCATIONS = new HashMap<>();

    static {
        GEOFENCE_LOCATIONS.put("B16", new LatLng(51.746411, 19.453246));
        GEOFENCE_LOCATIONS.put("CTI", new LatLng(51.747070, 19.455991));
        GEOFENCE_LOCATIONS.put("Rektorat", new LatLng(51.748550, 19.453121));
        GEOFENCE_LOCATIONS.put("Zatoka", new LatLng(51.746243, 19.451760));
        GEOFENCE_LOCATIONS.put("Biblioteka", new LatLng(51.745632, 19.454454));
    }
}
