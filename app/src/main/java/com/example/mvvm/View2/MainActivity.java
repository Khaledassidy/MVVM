package com.example.mvvm.View2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.mvvm.Myviewmodel2;
import com.example.mvvm.databinding.ActivityMain2Binding;


//tare2et mvvm best3mel l databnding
public class MainActivity extends AppCompatActivity {

    ActivityMain2Binding binding;
    Myviewmodel2 myviewmodel2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        myviewmodel2=new ViewModelProvider(this).get(Myviewmodel2.class);
        //houn 3am ta3te l data bindig hayde l object l viewmodel
        binding.setViewmodel(myviewmodel2);

        //hyde bt5le data binding bta3mel observing lal livedata ya3ne hayde ka2no 3mlt method l observe bas houn 3am n2ol lal databinding eno observe live data bhyde l activity w 3meel update lal view le e5de exeprtion btrje3 live data ya3ne l2n2ol l live data btrje3 houn string fa 7a ta3mel observe 2awl ma t8ayer data w w t3del ui le 2e5de method le btrje3 live data
        //hyde btest3mal to observe livedata in binding
        binding.setLifecycleOwner(this);





    }
}