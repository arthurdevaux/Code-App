package fr.wildcodeschool.apprentie.monsterlegendswikiapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.view.View;
import java.util.ArrayList;
import android.widget.Button;

import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public final static String MONSTER ="fr.wildcodeschool.apprenti.monsterproject.MONSTER";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Integer[] listPictures = {R.drawable.feu, R.drawable.terre, R.drawable.eau, R.drawable.nature, R.drawable.foudre, R.drawable.lumiere, R.drawable.mort, R.drawable.magie, R.drawable.feu, R.drawable.eau, R.drawable.nature, R.drawable.metal};

        final HashMap<String, Monster> monsterList = new HashMap<String, Monster>();

        final ArrayList<String> listMonsterNames = new ArrayList<String>();

        Monster firelion = new Monster("firelion", "Fire Lion", R.drawable.fire_lion_0, "Feu", new Stats(2480, 100, 875, 100), R.drawable.fire_lion_all);
        Monster rockylla = new Monster("rockylla", "Rockylla", R.drawable.rockilla_0, "Terre", new Stats(3521, 875, 875, 100), R.drawable.rockilla_all);
        Monster turtle = new Monster("turtle", "Turtle", R.drawable.turtle_0, "Eau", new Stats(2777, 1000, 1000, 100), R.drawable.turtle_all);
        Monster panda = new Monster("panda", "Panda", R.drawable.panda_0, "Nature", new Stats(2777, 1000, 950, 100), R.drawable.panda_all);
        Monster thundereagle = new Monster("thundereagle", "Thunder Eagle", R.drawable.thunder_eagle_0, "Foudre", new Stats(2480, 875, 1250, 100), R.drawable.thunder_eagle_all);
        Monster lightspirit = new Monster("lightspirit", "Light Spirit", R.drawable.light_spirit_0, "Lumière", new Stats(3521, 875, 875, 100), R.drawable.light_spirit_all);
        Monster tyrannoking = new Monster("tyrannoking", "Tyrannoking", R.drawable.tyrannoking_0, "Mort", new Stats(2480, 1150, 875, 100), R.drawable.tyrannoking_all);
        Monster genius = new Monster("genius", "Genius", R.drawable.genie_0, "Magie", new Stats(2480, 950, 1250, 100), R.drawable.genie_all);
        Monster firesaur = new Monster("firesaur", "Firesaur", R.drawable.firesaur_0, "Feu", new Stats(2480, 1375, 875, 100), R.drawable.firesaur_all);
        Monster mersnake = new Monster("mersnake", "Mersnake", R.drawable.mersnake_0, "Eau", new Stats(2777, 1125, 1000, 100), R.drawable.mersnake_all);
        Monster treezard = new Monster("treezard", "Treezard", R.drawable.treezard_0, "Nature", new Stats(2777, 1125, 1000, 100), R.drawable.treezard_all);
        Monster metalsaur = new Monster("metalsaur", "Metalsaur", R.drawable.metalsaur_0, "Métal", new Stats(2976, 1120, 1000, 100), R.drawable.metalsaur_all);

        monsterList.put("firelion", firelion);
        monsterList.put("rockylla", rockylla);
        monsterList.put("turtle", turtle);
        monsterList.put("panda", panda);
        monsterList.put("thundereagle", thundereagle);
        monsterList.put("lightspirit", lightspirit);
        monsterList.put("tyrannoking", tyrannoking);
        monsterList.put("genius", genius);
        monsterList.put("firesaur", firesaur);
        monsterList.put("mersnake", mersnake);
        monsterList.put("treezard", treezard);
        monsterList.put("metalsaur", metalsaur);

        final String[] arrayId = {
            firelion.getId(),
            rockylla.getId(),
            turtle.getId(),
            panda.getId(),
            thundereagle.getId(),
            lightspirit.getId(),
            tyrannoking.getId(),
            genius.getId(),
            firesaur.getId(),
            mersnake.getId(),
            treezard.getId(),
            metalsaur.getId(),

        };



        listMonsterNames.add(firelion.getName());
        listMonsterNames.add(rockylla.getName());
        listMonsterNames.add(turtle.getName());
        listMonsterNames.add(panda.getName());
        listMonsterNames.add(thundereagle.getName());
        listMonsterNames.add(lightspirit.getName());
        listMonsterNames.add(tyrannoking.getName());
        listMonsterNames.add(genius.getName());
        listMonsterNames.add(firesaur.getName());
        listMonsterNames.add(mersnake.getName());
        listMonsterNames.add(treezard.getName());
        listMonsterNames.add(metalsaur.getName());

        CustomAdapter adapter = new CustomAdapter(this, listMonsterNames, listPictures);
        ListView list = (ListView) findViewById(R.id.listview);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            //Au click
                String SelectedItem = arrayId[+position];
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                Bundle objetBunble = new Bundle();
                objetBunble.putSerializable(MONSTER, monsterList.get(SelectedItem));
                intent.putExtras(objetBunble);

                startActivity(intent);

            }
        });



    }
}