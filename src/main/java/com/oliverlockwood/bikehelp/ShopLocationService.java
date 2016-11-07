package com.oliverlockwood.bikehelp;

import com.google.android.gms.maps.model.LatLng;
import com.oliverlockwood.bikehelp.domain.Shop;

import java.util.Collection;

/**
 * Service for locating bike shops.
 *
 * The Google Maps API {@link LatLng} class is used to identify geo points.
 */
public interface ShopLocationService {

    /**
     * Gets the bike shops which are located within a specified boundary box
     *
     * @param bottomLeft the {@link LatLng} identifying the bottom left of the boundary box
     * @param topRight the {@link LatLng} identifying the top right of the boundary box
     *
     * @return a collection of bike shops within the boundary box
     */
    Collection<Shop> getShopsInBox(LatLng bottomLeft, LatLng topRight);
}
