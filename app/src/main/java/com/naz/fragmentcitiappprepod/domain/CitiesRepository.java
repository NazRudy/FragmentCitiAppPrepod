package com.naz.fragmentcitiappprepod.domain;

/**
 * 2. Репозиторий
 */

import java.util.List;

public interface CitiesRepository {

    List<City> getAll();   // Метод получения всех городов

    void add(City city);   // Метод добавления города

}
