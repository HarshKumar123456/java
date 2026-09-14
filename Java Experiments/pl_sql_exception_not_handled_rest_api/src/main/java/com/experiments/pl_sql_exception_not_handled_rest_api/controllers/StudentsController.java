package com.experiments.pl_sql_exception_not_handled_rest_api.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.experiments.pl_sql_exception_not_handled_rest_api.dto.StudentDetailDTO;
import com.experiments.pl_sql_exception_not_handled_rest_api.repository.StudentRepository;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
@RequestMapping("/api/students")
public class StudentsController {

    private static final Logger log = LoggerFactory.getLogger(StudentsController.class);

    private final StudentRepository studentRepository;

    public StudentsController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // This will give us details of All the students
    @GetMapping({"", "/all"})
    public StudentDetailDTO[] getAllStudentsDetails() {

        List<StudentDetailDTO> resultList = studentRepository.getAllStudentsDetails();
        StudentDetailDTO[] details = resultList.toArray(new StudentDetailDTO[0]);
        
        log.info("Successfully fetched {} student records from the database.", details.length);
        log.debug("Student details data: {}", Arrays.toString(details));
        
        return details;

    }

    // This will give us details of Student whose id is 101
    @GetMapping("/101")
    public StudentDetailDTO get101IdStudentDetails() {
        StudentDetailDTO details = studentRepository.get101IdStudentDetails();
        log.info("Successfully fetched {} student records from the database.", details);
        log.info("Student details data: id: {}, name: {}, age: {}, dep_id: {}, dep_name: {}", details.getId(), details.getName(), details.getAge(), details.getDepartment_id(), details.getDepartment_name());
        log.debug("Student details data: id: {}, name: {}, age: {}, dep_id: {}, dep_name: {}", details.getId(), details.getName(), details.getAge(), details.getDepartment_id(), details.getDepartment_name());
        
        return details;
    }


    // This is Faulty Route Processing Function as We are Not handling Exceptions here
    @GetMapping("/{id}")
    public StudentDetailDTO getStudentDetails(@PathVariable("id") Integer id) {
        // Direct passthrough without null checks or exception handling
        return studentRepository.getStudentDetailsViaPLSQL(id);
    }


}