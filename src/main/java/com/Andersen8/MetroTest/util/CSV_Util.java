package com.Andersen8.MetroTest.util;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
import com.Andersen8.MetroTest.repository.entity.MyModel;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;


public class CSV_Util {
    public static final String ABSOLUTE_PATH = "C:\\StudyAndWork\\TestTask\\MetroTest\\src\\main\\resources\\csv\\";
    public static void createCsv(MyModel model) throws IOException {
        String[] strings = {String.valueOf(model.getId()),
                            model.getName(),
                            String.valueOf(model.getAge()),
                            String.valueOf(model.getMobile_no())};
        String pref = "src/main/resources/csv/";
        String root = String.valueOf(model.getMobile_no());
        String csv = ".csv";
        String pr=root+csv;
        CSVWriter writer = new CSVWriter(new FileWriter(new File(ABSOLUTE_PATH, pr)));
        writer.writeNext(strings);
        writer.close();
    }

    public static MyModel takeDataFromCSV(int mobile) throws IOException {
        List<File> collect = Files.walk(Paths.get(ABSOLUTE_PATH))
                .filter(Files::isRegularFile)
                .map(Path::toFile)
                .collect(Collectors.toList());
        String filename = String.valueOf(mobile)+".csv";
        File file1 = collect.stream().filter(file -> file.getName().equals(filename))
                .findFirst().orElse(null);
        FileReader fileReader = new FileReader(file1);
        CSVReader reader = new CSVReader(fileReader);
        String[] strings = reader.readNext();
        MyModel mm = new MyModel(strings[0], strings[1], strings[2], strings[3]);
        return mm;
    }
}
