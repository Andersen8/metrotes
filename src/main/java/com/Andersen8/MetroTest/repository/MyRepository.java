package com.Andersen8.MetroTest.repository;


import com.Andersen8.MetroTest.repository.entity.MyModel;
import com.Andersen8.MetroTest.util.CSV_Util;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.io.IOException;

@Repository
public class MyRepository implements MRepository {
    private JdbcTemplate jdbcTemplate = new JdbcTemplate();

    public MyRepository() {
        this.jdbcTemplate = JdbcUtil.datasource();
    }

    public void save(String name, int age, int mobile) throws IOException {
        jdbcTemplate.update("INSERT INTO customer (name, age, mobile) VALUES (?,?,?)",
                name, age, mobile);
        if(getByMobile(mobile)!=null){
            MyModel model = getByMobile(mobile);
            CSV_Util.createCsv(model);
        }
    }

    public MyModel getByMobile(int mobile){
        return jdbcTemplate.query("SELECT * FROM customer WHERE mobile=?",
                (rs, rowNum) -> new MyModel(rs.getString("id"),
                        rs.getString("name"),
                        rs.getString("age"),
                        rs.getString("mobile")),
                        mobile).get(0);
    }
}
