package com.Andersen8.MetroTest.service;

import com.Andersen8.MetroTest.repository.MRepository;
import com.Andersen8.MetroTest.repository.entity.MyModel;
import com.Andersen8.MetroTest.util.CSV_Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class MyService implements MService {
    private MRepository repository;

    public MyService() {
    }

    @Autowired
    public MyService(MRepository repository) {
        this.repository = repository;
    }

    public String saveData(String name, int age, int mobile) throws IOException {
        repository.save(name, age, mobile);
        return String.valueOf(mobile);
    }

    public MyModel gettingData(int number) throws IOException {
        return CSV_Util.takeDataFromCSV(number);
    }
}
