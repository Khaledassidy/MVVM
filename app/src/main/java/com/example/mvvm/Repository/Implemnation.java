package com.example.mvvm.Repository;

import android.view.View;

import androidx.lifecycle.MutableLiveData;

import com.example.mvvm.Model.Person;

import java.util.Calendar;

public class Implemnation implements CalculateAgeRepository{
    @Override
    public MutableLiveData<Person> calculateYourAge(String name, String age) {
        MutableLiveData<Person> mutableLiveData=new MutableLiveData<>();
        int currentyear=Calendar.getInstance().get(Calendar.YEAR);
        int yourage=currentyear-Integer.parseInt(age);
        Person person=new Person(name,yourage);
        mutableLiveData.postValue(person);
        return mutableLiveData;
    }


}
