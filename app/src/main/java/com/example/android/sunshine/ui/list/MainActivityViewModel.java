package com.example.android.sunshine.ui.list;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.example.android.sunshine.data.SunshineRepository;
import com.example.android.sunshine.data.database.WeatherEntry;

import java.util.List;

public class MainActivityViewModel extends ViewModel {

    private SunshineRepository mRepository;

    private LiveData<List<WeatherEntry>> mWeatherList;

    public MainActivityViewModel() {
        mWeatherList = new MutableLiveData<>();
    }

    public MainActivityViewModel(SunshineRepository repository) {
        mRepository = repository;
        mWeatherList = mRepository.getCurrentWeatherForecasts();
    }

    public LiveData<List<WeatherEntry>> getWeatherList() {
        return mWeatherList;
    }
}
