package com.dronfieslabs.geo.data.kml;

import com.dronfieslabs.geo.data.Point;
import com.google.android.gms.maps.model.LatLng;

/**
 * Represents a KML Point. Contains a single coordinate.
 */
public class KmlPoint extends Point {
    private final Double mAltitude;

    /**
     * Creates a new KmlPoint
     *
     * @param coordinates coordinates of the KmlPoint
     */
    public KmlPoint(LatLng coordinates) {
        this(coordinates, null);
    }

    /**
     * Creates a new KmlPoint
     *
     * @param coordinates coordinates of the KmlPoint
     * @param altitude altitude of the KmlPoint
     */
    public KmlPoint(LatLng coordinates, Double altitude) {
        super(coordinates);

        this.mAltitude = altitude;
    }

    public Double getAltitude() {
        return mAltitude;
    }
}