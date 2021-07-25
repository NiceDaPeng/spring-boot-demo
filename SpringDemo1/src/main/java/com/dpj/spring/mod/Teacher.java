package com.dpj.spring.mod;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Teacher {

    private String tname;
    private String tsex;
    private Integer tage;
    private List<Student> stuList;
    private Map<String,String> map;
    private Set<String> set;

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tname='" + tname + '\'' +
                ", tsex='" + tsex + '\'' +
                ", tage=" + tage +
                ", stuList=" + stuList +
                ", map=" + map +
                ", set=" + set +
                '}';
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public List<Student> getStuList() {
        return stuList;
    }

    public void setStuList(List<Student> stuList) {
        this.stuList = stuList;
    }

    public Teacher(String tname, String tsex, Integer tage, List<Student> stuList) {
        this.tname = tname;
        this.tsex = tsex;
        this.tage = tage;
        this.stuList = stuList;
    }

    public Teacher() {
    }

    public Teacher(String tname, String tsex, Integer tage) {
        this.tname = tname;
        this.tsex = tsex;
        this.tage = tage;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTsex() {
        return tsex;
    }

    public void setTsex(String tsex) {
        this.tsex = tsex;
    }

    public Integer getTage() {
        return tage;
    }

    public void setTage(Integer tage) {
        this.tage = tage;
    }

}
