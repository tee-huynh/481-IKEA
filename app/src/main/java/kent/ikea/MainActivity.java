package kent.ikea;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton main_but_list; // make a button object
    ImageButton main_but_catalog;
    ImageButton main_but_checkout;
    ImageButton main_but_map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // list button
        main_but_list = (ImageButton) findViewById(R.id.button_list); // get list button id
        main_but_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(MainActivity.this, list.class); // change activity
                startActivity(intentLoadNewActivity);
            }
        });

        // catalog button
        main_but_catalog = (ImageButton) findViewById(R.id.catalogButton);
        main_but_catalog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.ikea.com/ms/en_CA/catalogue/catalogue_index.html")));
            }
        });


        // map button
        main_but_map = (ImageButton) findViewById(R.id.mapButton);
        main_but_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://s-media-cache-ak0.pinimg.com/originals/a7/b5/72/a7b572196c74e57c697b1db8052d56f3.jpg")));
            }
        });


    }


    public void scanit(View view) {
        Intent myIntent = new Intent(view.getContext(),scaner.class );
        startActivityForResult(myIntent,0);
    }


    public void checktimer(View view) {
        Intent myIntent = new Intent(view.getContext(),checkingout.class );
        startActivityForResult(myIntent,0);
    }
}

