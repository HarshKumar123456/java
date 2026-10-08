package com.harsh.springbootJDBC.model;


abstract public class Sim {

    String nameOfSim = "NameOfSim"; 

    public String getNameOfSim() {
        return nameOfSim;
    }
    public void setNameOfSim(String nameOfSim) {
        this.nameOfSim = nameOfSim;
    }
    abstract public void call();
    abstract public void message();

}
