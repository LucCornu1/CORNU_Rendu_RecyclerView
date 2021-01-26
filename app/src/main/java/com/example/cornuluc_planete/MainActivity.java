package com.example.cornuluc_planete;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView monRecyclerView;
    private RecyclerView.Adapter monAdapter;
    private RecyclerView.LayoutManager monLayoutManager;
    private String[] monDataset = {"Terre", "Mars", "Saturne", "Pluton", "Uranus",
            "Neptune"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        monRecyclerView = (RecyclerView) findViewById(R.id.recyclerview_planetelist);
        monRecyclerView.setHasFixedSize(true); //Taille fixe des éléments de la liste = optimisation du recyclerView

        monLayoutManager = new LinearLayoutManager(this);
        monRecyclerView.setLayoutManager(monLayoutManager);

        ArrayList<Planete> planeteList = new ArrayList<Planete>();
        initList(planeteList);

        monAdapter = new rec_adapter(planeteList); //cf. rec_adapter.java, classe de l’adaptateur
        monRecyclerView.setAdapter(monAdapter);
    }

    private void initList(ArrayList<Planete> planeteList) {
        Planete planete = new Planete();
        planete.setPlaneteName("Mercure");
        planete.setPlaneteDescription("0");
        planeteList.add(planete);

        planete = new Planete();
        planete.setPlaneteName("Venus");
        planete.setPlaneteDescription("1");
        planeteList.add(planete);

        planete = new Planete();
        planete.setPlaneteName("Terre");
        planete.setPlaneteDescription("3");
        planeteList.add(planete);

        planete = new Planete();
        planete.setPlaneteName("Mars");
        planete.setPlaneteDescription("4");
        planeteList.add(planete);

        planete = new Planete();
        planete.setPlaneteName("Jupiter");
        planete.setPlaneteDescription("5");
        planeteList.add(planete);

        planete = new Planete();
        planete.setPlaneteName("Saturne");
        planete.setPlaneteDescription("6");
        planeteList.add(planete);

        planete = new Planete();
        planete.setPlaneteName("Uranus");
        planete.setPlaneteDescription("7");
        planeteList.add(planete);

        planete = new Planete();
        planete.setPlaneteName("Neptune");
        planete.setPlaneteDescription("8");
        planeteList.add(planete);
    }
}