package ru.vtb.dz4.services;

import ru.vtb.dz4.entity.PremiereEntity;

import java.util.List;

public interface PremiereRepoMethods {
    PremiereEntity addPremiere(PremiereEntity premiereEntity);

    void deletePremiere(String premiereName);

    PremiereEntity changePremiere(PremiereEntity premiereEntity);

    List<PremiereEntity> findAll();

    PremiereEntity findByName(String name);

}
