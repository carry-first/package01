package com.JDBC.util;

import java.io.File;
import java.io.InputStream;
import java.sql.Blob;
import java.util.Date;

/**
 * @author Tang A Biao
 * @create 2021/2/27 - 15:49
 */
public class custmoers {
    private int id;
    private String name;
    private Date birth;
    private File photo;

    public custmoers() {
    }

    public custmoers(int id, String name, Date birth, File photo) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "custmoers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birth=" + birth +
                ", photo=" + photo +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public File getPhoto() {
        return photo;
    }

    public void setPhoto(File photo) {
        this.photo = photo;
    }
}
