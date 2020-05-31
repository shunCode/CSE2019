package com.example.nalssyapp;

import com.example.nalssyapp.IFetchDataListener;

interface IFetchWeatherService {
    void retrieveWeatherData();
    void registerFetchDataListener(IFetchDataListener listener);
    void unregisterFetchDataListener(IFetchDataListener listener);
}

