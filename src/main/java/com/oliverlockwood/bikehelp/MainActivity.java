package com.oliverlockwood.bikehelp;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends Activity {

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_actions, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_search:
                // TODO something
                return true;
            case R.id.action_compose:
                // TODO something
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    /**
     * Set up the map, if it is not already done.
     */
    private void setUpMapIfNeeded() {
        if (mMap != null) {
            return;
        }
        mMap = ((MapFragment)getFragmentManager().findFragmentById(R.id.map)).getMap();
        if (mMap == null) {
            return;
        }

        // Initialize map options. For example:
        // mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(LONDON, 12));
        MarkerOptions markerOptions = new MarkerOptions().position(LONDON).visible(true).title("Marker 1");
        mMap.addMarker(markerOptions);

        ActionBar actionBar = getActionBar();
        //actionBar.
    }
}
