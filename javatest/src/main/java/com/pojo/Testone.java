package com.pojo;

public class Testone{
    private String name;
    private int jj;
    private String sex;
    private String addr;

    public Testone() {
    }

    public Testone(String name, int jj, String sex, String addr) {
        this.name = name;
        this.jj = jj;
        this.sex = sex;
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public int getJj() {
        return jj;
    }

    public String getSex() {
        return sex;
    }

    public String getAddr() {
        return addr;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJj(int jj) {
        this.jj = jj;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
    @Override
    public String toString() {
        return "Testone{" +
                "name='" + name + '\'' +
                ", jj=" + jj +
                ", sex='" + sex + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }
    public boolean equals(Testone object) {
        if (this == object){
            return true;
        }if (object.getAddr().equals(this.getAddr())){
            System.out.println(this.getSex());
            return true;
        }
        else return false;
    }
}
