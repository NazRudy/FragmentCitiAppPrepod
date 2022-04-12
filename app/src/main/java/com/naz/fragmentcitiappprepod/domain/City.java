package com.naz.fragmentcitiappprepod.domain;

import androidx.annotation.DrawableRes;

/**
 * 1. Класс для создания обьекта города
 */
public class City {
    private final String name;                  // Название города
    @DrawableRes
    private final int icon;                      // Иконка города

    public City(String name, int icon) {        // Конструктор по умолчанию
        this.name = name;
        this.icon = icon;
    }

    public String getName() {                   // Геттер названия города
        return name;
    }

    public int getIcon() {                      // Геттер иконкт города
        return icon;
    }
}