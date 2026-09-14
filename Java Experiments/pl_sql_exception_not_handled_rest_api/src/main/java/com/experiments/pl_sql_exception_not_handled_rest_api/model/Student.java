package com.experiments.pl_sql_exception_not_handled_rest_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity 
public class Student {
    @Id 
    public int id;
    public String name;
    public int age;
}
