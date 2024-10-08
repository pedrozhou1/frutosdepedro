package cl.ipgv.frutossecoschillan2;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import cl.ipgv.frutossecoschillan2.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Ubicacion Actual y de las Sucursales
        LatLng miubicacion = new LatLng(-36.58997719937984, -72.08206983162127);
        LatLng frutodelosbosque1 = new LatLng(-36.583724244285065, -72.093627578303);
        LatLng frutodelosbosque2 = new LatLng(-36.58877891673049, -72.113597214213);
        LatLng frutodelosbosque3 = new LatLng(-36.59638016956375, -72.10565710662802);
        LatLng frutodelosbosque4 = new LatLng(-36.603509298587404, -72.09320451018851);

        mMap.addMarker(new MarkerOptions().position(miubicacion).title("Fruto de los bosque"));
        mMap.addMarker(new MarkerOptions().position(frutodelosbosque1).title("Fruto de los bosque"));
        mMap.addMarker(new MarkerOptions().position(frutodelosbosque2).title("Fruto de los bosque"));
        mMap.addMarker(new MarkerOptions().position(frutodelosbosque3).title("Fruto de los bosque"));
        mMap.addMarker(new MarkerOptions().position(frutodelosbosque4).title("Fruto de los bosque"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(miubicacion));
        mMap.setMinZoomPreference(4.0F);
        mMap.setMaxZoomPreference(18.0F);

    }
}