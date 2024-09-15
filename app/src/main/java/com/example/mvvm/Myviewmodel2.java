package com.example.mvvm;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mvvm.Model2.Mymodel;

public class Myviewmodel2 extends ViewModel {

    public MutableLiveData<String> mutableLiveData=new MutableLiveData<>();

    public Mymodel getappname(){
       return new Mymodel("kahledassidi");
    }

    public void setmutablelivedata(){
        String name=getappname().getAppname();
        mutableLiveData.setValue(name);

    }

    public MutableLiveData<String> getMutableLiveData(){
        return mutableLiveData;
    }
}
