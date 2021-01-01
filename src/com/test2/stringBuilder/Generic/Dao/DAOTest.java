package com.test2.stringBuilder.Generic.Dao;

import java.util.List;

public class DAOTest {
    public static void main(String[] args) {
        DAO<User> d = new DAO<>();
        d.add("1001",new User("1001","张三",32));
        d.add("1002",new User("1002","李四",12));
        d.add("1003",new User("1003","王五",3));
        d.add("1004",new User("1004","赵六",57));

        d.remove("1002");
        d.upData("1001",new User("1002","田七",12));

        List<User> query = d.query();
        query.forEach(System.out::println);
    }
}
