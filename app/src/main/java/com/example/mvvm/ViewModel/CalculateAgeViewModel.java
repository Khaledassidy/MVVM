package com.example.mvvm.ViewModel;

import android.view.View;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mvvm.Model.Person;
import com.example.mvvm.Repository.Implemnation;

public class CalculateAgeViewModel extends ViewModel {

    Implemnation repository;
    public CalculateAgeViewModel() {
        repository=new Implemnation();
    }

    public MutableLiveData<Person> calculateAge( String name, String age){
        return repository.calculateYourAge(name,age);
    }


}
