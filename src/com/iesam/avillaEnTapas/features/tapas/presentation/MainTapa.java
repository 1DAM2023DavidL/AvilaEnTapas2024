package com.iesam.avillaEnTapas.features.tapas.presentation;

import com.iesam.avillaEnTapas.features.tapas.data.TapaDataRepository;
import com.iesam.avillaEnTapas.features.tapas.domain.*;

import java.util.ArrayList;

public class MainTapa {
    public static void printTapas() {
        GetTapasUseCase tapasUseCase = new GetTapasUseCase(TapaDataRepository.newInstance());
        ArrayList<Tapa> tapas = tapasUseCase.execute();

        System.out.println(tapas.toString());
    }

    public static void createTapa(Tapa tapa) {
        printTapas();
        CreateTapaUseCase createTapaUseCase = new CreateTapaUseCase(TapaDataRepository.newInstance());
        createTapaUseCase.execute(tapa);
        printTapas();
    }

    public static void deleteTapa(String tapaId) {
        printTapas();
        DeleteTapaUseCase deleteTapaUseCase = new DeleteTapaUseCase(TapaDataRepository.newInstance());
        deleteTapaUseCase.execute(tapaId);
        printTapas();
    }

    public static void printTapa(String tapaId) {
        GetTapaUseCase getTapaUseCase = new GetTapaUseCase(TapaDataRepository.newInstance());
        Tapa tapa = getTapaUseCase.execute(tapaId);
        System.out.println(tapa.toString());
    }

    public static void updateTapa(Tapa tapa) {
        printTapas();
        UpdateTapaUseCase updateTapaUseCase = new UpdateTapaUseCase(TapaDataRepository.newInstance());
        updateTapaUseCase.execute(tapa);
        printTapas();
    }
}
