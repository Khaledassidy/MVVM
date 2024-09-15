package com.example.mvvm.Repository;

import androidx.lifecycle.MutableLiveData;

import com.example.mvvm.Model.Person;

public interface CalculateAgeRepository {

    MutableLiveData<Person> calculateYourAge(String name, String age);
}
