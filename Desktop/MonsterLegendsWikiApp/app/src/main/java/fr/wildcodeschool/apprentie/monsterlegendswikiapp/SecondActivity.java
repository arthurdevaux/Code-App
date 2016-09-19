package fr.wildcodeschool.apprentie.monsterlegendswikiapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.*;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Shooty31 on 14/09/2016.
 */
public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Monster monMonstre = (Monster) getIntent().getSerializableExtra(MainActivity.MONSTER);


        final TextView txtPv = (TextView) findViewById(R.id.txtPv);
        final TextView txtPower = (TextView) findViewById(R.id.txtPower);
        final TextView txtSpeed = (TextView) findViewById(R.id.txtSpeed);
        final TextView txtEnergy = (TextView) findViewById(R.id.txtEnergy);

        TextView txtTitle = (TextView) findViewById(R.id.textTitle);
        ImageView imageEgg = (ImageView) findViewById(R.id.ImageEgg);
        TextView txtElem = (TextView) findViewById(R.id.txtElem);
        ImageView imageEvo = (ImageView) findViewById(R.id.ImageEvo);

        txtTitle.setText(monMonstre.getName());
        imageEgg.setImageResource(monMonstre.getEgg());
        txtElem.setText(monMonstre.getType());
        txtPv.setText(Integer.toString(monMonstre.getStats().getPv()));
        txtPower.setText(Integer.toString(monMonstre.getStats().getPower()));
        txtSpeed.setText(Integer.toString(monMonstre.getStats().getSpeed()));
        txtEnergy.setText(Integer.toString(monMonstre.getStats().getEnergy()));
        imageEvo.setImageResource(monMonstre.getEvo());

    }
}
