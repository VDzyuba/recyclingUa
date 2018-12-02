package com.vdzyuba.mapeco;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity2 extends AppCompatActivity implements OnMapReadyCallback {

    public GoogleMap mMap;
    Spinner mapSpinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Карта");
        setSupportActionBar(toolbar);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        mapSpinner = (Spinner) findViewById(R.id.map_spinner);
        ArrayAdapter<String> mapAdapter = new ArrayAdapter<String>(MapsActivity2.this, R.layout.map_spinner,
                getResources().getStringArray(R.array.city));

        mapAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mapSpinner.setAdapter(mapAdapter);

        mapSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int x = 0;
                x = position;

                if (x == 0) {
                    LatLng lviv = new LatLng(49.838, 24.023);
                    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(lviv, 12));
                } else if (x == 1) {
                    LatLng Zhitomir = new LatLng(50.2648700, 28.6766900);
                    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Zhitomir, 11));
                } else if (x == 2) {
                    LatLng odesa = new LatLng(46.477, 30.732);
                    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(odesa, 11));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.

    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

//імя маркерів складається з перших 3 букв назви вулиці
        LatLng Zal = new LatLng(49.839125, 24.000736);
        mMap.addMarker(new MarkerOptions()
                .position(Zal)
                .title("вул. Залізнична, 18 (Макулатура, пластик, скло, метал)")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker4)));

        LatLng Mor = new LatLng( 49.853469, 23.990654);
        mMap.addMarker(new MarkerOptions()
                .position(Mor)
                .title("вул. Моринецька, 14а (Макулатура, пластик, скло, метал)")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker4)));

        LatLng VolVel = new LatLng( 49.811514, 23.993658);
        mMap.addMarker(new MarkerOptions()
                .position(VolVel)
                .title("вул. Володимира Великого, 34 (Макулатура, пластик, скло, метал)")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker4)));

        LatLng Per = new LatLng(  49.809090, 24.029177);
        mMap.addMarker(new MarkerOptions()
                .position(Per)
                .title("вул. Персенківка, 2 (Макулатура, пластик, скло, метал)")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker4)));

        LatLng Stu = new LatLng( 49.830244, 24.046714);
        mMap.addMarker(new MarkerOptions()
                .position(Stu)
                .title("вул. Студентська, 3 (Макулатура, пластик, скло, метал)")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker4)));

        LatLng Zho = new LatLng( 49.856219, 24.036028);
        mMap.addMarker(new MarkerOptions()
                .position(Zho)
                .title("вул. Жовківська, 16 (Макулатура, пластик, скло)")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker3)));

        LatLng Pro = new LatLng( 49.861075, 24.044349);
        mMap.addMarker(new MarkerOptions()
                .position(Pro)
                .title("вул. Промислова, 52 (Макулатура, пластик, скло)")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker3)));

        LatLng DanApo = new LatLng(  49.831217, 23.946805);
        mMap.addMarker(new MarkerOptions()
                .position(DanApo)
                .title("вул. Данила Апостола, 6а (Макулатура, пластик, скло)")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker3)));

        LatLng Kur = new LatLng(   49.830480, 23.950774);
        mMap.addMarker(new MarkerOptions()
                .position(Kur)
                .title("вул. Курмановича, 9 (Макулатура, пластик, скло)")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker3)));

        LatLng Her = new LatLng(   49.827480, 23.990938);
        mMap.addMarker(new MarkerOptions()
                .position(Her)
                .title("вул. Героїв УПА, 73 (Макулатура, пластик, скло)")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker3)));

        LatLng Laz = new LatLng(   49.815451, 24.014074);
        mMap.addMarker(new MarkerOptions()
                .position(Laz)
                .title("вул. Лазаренка, 29 (Макулатура, пластик, скло)")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker3)));

        LatLng Pas = new LatLng(   49.806371, 24.071350);
        mMap.addMarker(new MarkerOptions()
                .position(Pas)
                .title("вул. Пасічна, 127 (Макулатура, пластик, скло)")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker3)));

        LatLng Shep = new LatLng(   49.836395, 24.006522);
        mMap.addMarker(new MarkerOptions()
                .position(Shep)
                .title("вул. Шептицьких, 45 (Макулатура, пластик, скло)")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker3)));


        LatLng SimPet = new LatLng(   49.823250, 23.978424);
        mMap.addMarker(new MarkerOptions()
                .position(SimPet)
                .title("вул. Симона Петлюри (Макулатура, пластик, скло)")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker3)));

        LatLng KnLev = new LatLng(   49.846217, 24.031000);
        mMap.addMarker(new MarkerOptions()
                .position(KnLev)
                .title("вул. Князя Лева, 4а (Макулатура, пластик, метал)")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker3)));

        LatLng Kon = new LatLng(   49.825177, 23.995159);
        mMap.addMarker(new MarkerOptions()
                .position(Kon)
                .title("вул. Коновальця, 103 (Макулатура, пластик, метал)")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker3)));

        LatLng Tru = new LatLng(   49.798678, 23.997264);
        mMap.addMarker(new MarkerOptions()
                .position(Tru)
                .title("вул. Трускавецька, 502 (Макулатура, пластик, метал)")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker3)));

        LatLng Lup = new LatLng(   49.855519, 24.018275);
        mMap.addMarker(new MarkerOptions()
                .position(Lup)
                .title("вул. Липинського, 4 (Макулатура, пластик, метал)")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker3)));

        LatLng Koz = new LatLng(   49.830484, 24.028767);
        mMap.addMarker(new MarkerOptions()
                .position(Koz)
                .title("вул. Коцюбинського, 7 (Макулатура, пластик, метал)")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker3)));

        LatLng IvFra = new LatLng(   49.832910, 24.034025);
        mMap.addMarker(new MarkerOptions()
                .position(IvFra)
                .title("вул. Івана Франка, 45 (Макулатура, скло, метал)")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker3)));

        LatLng HetMaz = new LatLng(   49.873036, 24.043592);
        mMap.addMarker(new MarkerOptions()
                .position(HetMaz)
                .title("вул. Гетьмана Мазепи, 27 (Макулатура, скло)")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker2)));

        LatLng Nuz = new LatLng(   49.842804, 23.971274);
        mMap.addMarker(new MarkerOptions()
                .position(Nuz)
                .title("вул. Низинна, 7 (Макулатура, скло)")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker2)));

        LatLng Sug = new LatLng(   49.824272, 23.960896);
        mMap.addMarker(new MarkerOptions()
                .position(Sug)
                .title("вул. Сигнівка, 11 (Макулатура, скло)")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker2)));

        LatLng Cos = new LatLng(   49.832509, 24.034103);
        mMap.addMarker(new MarkerOptions()
                .position(Cos)
                .title("вул. Костомарова, 14 (Макулатура, скло)")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker2)));

        LatLng Hli = new LatLng(   49.834323, 24.013945);
        mMap.addMarker(new MarkerOptions()
                .position(Hli)
                .title("вул. Глибока, 5 (Макулатура, скло)")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker2)));

        LatLng MitAn = new LatLng(   49.836274, 24.007194);
        mMap.addMarker(new MarkerOptions()
                .position(MitAn)
                .title("вул. Митрополита Ангеловича, 45 (Макулатура, скло)")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker2)));

        LatLng Ras1 = new LatLng(   49.869000, 23.956103);
        mMap.addMarker(new MarkerOptions()
                .position(Ras1)
                .title("Рясне-1 (Макулатура, метал)")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker2)));

        LatLng Ras2 = new LatLng(   49.877716, 23.939377);
        mMap.addMarker(new MarkerOptions()
                .position(Ras2)
                .title("Рясне-2 (Макулатура, метал)")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker2)));

        LatLng VolVel2 = new LatLng(   49.809083, 24.010538);
        mMap.addMarker(new MarkerOptions()
                .position(VolVel2)
                .title("вул. Володимира Великого, 25 (Макулатура, метал)")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker2)));

        LatLng Nay = new LatLng(   49.804702, 24.004976);
        mMap.addMarker(new MarkerOptions()
                .position(Nay)
                .title("вул. Наукова, 4 (Макулатура, метал)")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker2)));

        LatLng Zal2 = new LatLng(   49.841390, 23.999404);
        mMap.addMarker(new MarkerOptions()
                .position(Zal2)
                .title("вул. Залізнична, 42а (Макулатура, пластик)")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker2)));

        LatLng Yav = new LatLng(   49.824746, 23.974930);
        mMap.addMarker(new MarkerOptions()
                .position(Yav)
                .title("вул. Д. Яворницького, 3а (Макулатура, пластик)")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker2)));

        LatLng KnOl = new LatLng(   49.807133, 23.999784);
        mMap.addMarker(new MarkerOptions()
                .position(KnOl)
                .title("вул. Княгині Ольги, 69 (Скло, метал)")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker2)));

        LatLng RomDa = new LatLng(   49.855913, 24.029528);
        mMap.addMarker(new MarkerOptions()
                .position(RomDa)
                .title("вул. Романа Дашкевича, 3 (Макулатура)")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker1)));

        LatLng Hor = new LatLng(   49.859415, 24.029741);
        mMap.addMarker(new MarkerOptions()
                .position(Hor)
                .title("вул. Городницька, 16 (Макулатура)")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker1)));

        LatLng Zal3 = new LatLng(   49.839716, 24.000372);
        mMap.addMarker(new MarkerOptions()
                .position(Zal3)
                .title("вул. Залізнична, 24 (Скло)")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker1)));

        LatLng She = new LatLng(   49.859968, 23.970669);
        mMap.addMarker(new MarkerOptions()
                .position(She)
                .title("вул. Шевченка, 171 (Метал)")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker1)));
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item);
    }


}
