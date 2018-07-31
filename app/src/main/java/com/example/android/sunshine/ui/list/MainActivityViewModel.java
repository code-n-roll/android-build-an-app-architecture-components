package com.example.android.sunshine.ui.list;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.example.android.sunshine.data.SunshineRepository;
import com.example.android.sunshine.data.database.ListViewWeatherEntry;

import java.util.List;

public class MainActivityViewModel extends ViewModel {

    private SunshineRepository mRepository;

    private LiveData<List<ListViewWeatherEntry>> mWeatherList;

    public MainActivityViewModel(SunshineRepository repository) {
        mRepository = repository;
        mWeatherList = mRepository.getCurrentWeatherForecasts();
    }

    public LiveData<List<ListViewWeatherEntry>> getWeatherList() {
        return mWeatherList;
    }
}
