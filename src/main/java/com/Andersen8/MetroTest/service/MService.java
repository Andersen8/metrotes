package com.Andersen8.MetroTest.service;


import com.Andersen8.MetroTest.repository.entity.MyModel;

import java.io.IOException;

public interface MService {
    String saveData(String nema, int age, int mobile) throws IOException;
    MyModel gettingData(int number) throws IOException;
}
