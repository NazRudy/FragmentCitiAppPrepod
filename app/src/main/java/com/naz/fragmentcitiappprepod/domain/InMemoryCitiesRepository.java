package com.naz.fragmentcitiappprepod.domain;

import android.content.Context;

import com.naz.fragmentcitiappprepod.R;

import java.util.ArrayList;
import java.util.List;

/**
 * 3. Реализация репозитория
 */
public class InMemoryCitiesRepository implements CitiesRepository {

    private static CitiesRepository INSTANCE;           // Класс синглтон

    public static CitiesRepository getInstance(Context context) {
        if (INSTANCE==null){
            INSTANCE=new InMemoryCitiesRepository(context);
        }
        return INSTANCE;
    }

    private Context context;

    private InMemoryCitiesRepository(Context context) {
        this.context = context;
    }

    @Override
    public List<City> getAll() {
        ArrayList<City> result = new ArrayList<>();     // Формируем список городов
        result.add(new City(context.getString(R.string.msk), R.drawable.msc));
        return result;
    }

    @Override
    public void add(City city) {

    }
}
