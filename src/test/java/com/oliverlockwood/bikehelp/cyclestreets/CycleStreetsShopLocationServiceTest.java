package com.oliverlockwood.bikehelp.cyclestreets;

import com.google.android.gms.maps.model.LatLng;
import com.oliverlockwood.bikehelp.ShopLocationService;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Tests for the {@link CycleStreetsShopLocationService} class.
 */
public class CycleStreetsShopLocationServiceTest {

    private ShopLocationService cycleStreetsShopLocationService = new CycleStreetsShopLocationService();

    // Can't enable this test at the moment - simply trying to create a new LatLng causes failures
    // similar to those described in https://github.com/orfjackal/retrolambda/issues/25
    @Ignore
    @Test(expected = UnsupportedOperationException.class)
    public void testGetShopsInBox() {
        LatLng londonBL = new LatLng(51.507354, -0.127730);
        LatLng londonTR = new LatLng(51.51, -0.12);

        cycleStreetsShopLocationService.getShopsInBox(londonBL, londonTR);
    }

}
