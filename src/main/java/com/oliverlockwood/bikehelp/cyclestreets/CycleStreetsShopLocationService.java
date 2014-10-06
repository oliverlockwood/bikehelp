package com.oliverlockwood.bikehelp.cyclestreets;

import com.google.android.gms.maps.model.LatLng;
import com.oliverlockwood.bikehelp.ShopLocationService;
import com.oliverlockwood.bikehelp.domain.Shop;

import java.util.Collection;

/**
 * CycleStreets API implementation of {@link ShopLocationService}
 */
public class CycleStreetsShopLocationService implements ShopLocationService {

    @Override
    public Collection<Shop> getShopsInBox(LatLng bottomLeft, LatLng topRight) {
        throw new UnsupportedOperationException("Not yet implemented");
        // TODO implement this.  For example, can call something like the below (which is a valid API key)
        // http://www.cyclestreets.net/api/pois.json?key=f2568fc87a54c48d&type=bikeshops&n=52.219285&e=0.125325&s=52.201395&w=0.101035
    }
}
