package com.oliverlockwood.bikehelp;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends FragmentActivity {

    /**
     * Default map start location
     */
    private static final LatLng LONDON = new LatLng(51.507354, -0.127730);

    /**
     * The map instance
     */
    private GoogleMap mMap;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        setUpMapIfNeeded();
    }

    @Override
    protected void onResume() {
        super.onResume();
        setUpMapIfNeeded();
    }

    /**
     * Set up the map, if it is not already done.
     */
    private void setUpMapIfNeeded() {
        if (mMap != null) {
            return;
        }
        mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
        if (mMap == null) {
            return;
        }

        // Initialize map options. For example:
        // mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(LONDON, 12));
        MarkerOptions markerOptions = new MarkerOptions().position(LONDON).visible(true).title("Marker 1");
        mMap.addMarker(markerOptions);
    }
}
