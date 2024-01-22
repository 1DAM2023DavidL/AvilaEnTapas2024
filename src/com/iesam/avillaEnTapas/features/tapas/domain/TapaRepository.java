package com.iesam.avillaEnTapas.features.tapas.domain;

import java.util.ArrayList;
public interface TapaRepository {
    ArrayList<Tapa> obtainTapas();

    void createTapa(Tapa tapa);

    void deleteTapa(String tapaId);

    Tapa obtainTapa(String tapaId);

    void updateTapa(Tapa tapa);

}
