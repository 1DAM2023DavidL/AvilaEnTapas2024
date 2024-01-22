package com.iesam.avillaEnTapas.features.tapas.data;

import com.iesam.avillaEnTapas.features.tapas.domain.Tapa;
import com.iesam.avillaEnTapas.features.tapas.domain.TapaRepository;

import java.util.ArrayList;

public class TapaDataRepository implements TapaRepository {
    public static TapaDataRepository instance = null;

    private ArrayList<Tapa> localTapas = new ArrayList<>();

    private TapaDataRepository() {
        initData();
    }
    public void initData() {
        localTapas.add(new Tapa("1","Albóndiga de faisán","Vermuteria el Atrio","0","0.0","24","0","faisán, gambón","https://Albóndiga_de_faisán.es"));
        localTapas.add(new Tapa("2","Cerdecería la bruja", "Restaurante la bruja","0","0.0","28","0","cerdo, cerveza","https://Cerdecería_la_bruja.es"));
    }

    public static TapaDataRepository newInstance() {
        if (instance==null) {
            instance = new TapaDataRepository();
        }
        return instance;
    }

    @Override
    public ArrayList<Tapa> obtainTapas() {
        return localTapas;
    }

    @Override
    public void createTapa(Tapa tapa) {
        localTapas.add(tapa);
    }

    @Override
    public void deleteTapa(String tapaId) {
        localTapas.removeIf(Tapa -> Tapa.getId() == tapaId);
    }

    @Override
    public Tapa obtainTapa(String tapaId) {
        for (Tapa tapa : localTapas) {
            if (tapa.getId().equals(tapaId)) {
                return tapa;
            }
        }
        return null;
    }

    @Override
    public void updateTapa(Tapa tapa) {
        deleteTapa(tapa.getId());
        createTapa(tapa);
    }
}
