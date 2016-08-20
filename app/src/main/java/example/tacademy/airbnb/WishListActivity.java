package example.tacademy.airbnb;

import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class WishListActivity extends AppCompatActivity {

    DrawerLayout drawer;
    NavigationView naviView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wish_list);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));

        drawer = (DrawerLayout) findViewById(R.id.drawer);
        naviView = (NavigationView) findViewById(R.id.navi_menu);
       // naviView.setNavigationItemSelectedListener(this);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.sample_hamburger);
    }
}
