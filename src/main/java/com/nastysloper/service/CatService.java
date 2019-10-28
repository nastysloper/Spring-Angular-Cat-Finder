package com.nastysloper.service;

import com.nastysloper.model.Cat;

import java.util.List;
import java.util.Optional;

public interface CatService {

    Optional<Cat> findById(Long id);

    Optional<Cat> findByName(String name);

    List<Cat> findAllCats();

    Cat createNewCat(String name, String power, String weakness, String image);

    void delete(Long id);

    boolean catExists(Cat cat);
}
