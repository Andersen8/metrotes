package com.Andersen8.MetroTest.repository;


import com.Andersen8.MetroTest.repository.entity.MyModel;

import java.io.IOException;

public interface MRepository {
    void save(String name, int age, int mobile) throws IOException;
}
