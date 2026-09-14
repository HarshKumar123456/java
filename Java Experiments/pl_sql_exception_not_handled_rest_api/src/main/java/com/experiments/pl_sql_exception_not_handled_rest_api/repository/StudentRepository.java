package com.experiments.pl_sql_exception_not_handled_rest_api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.experiments.pl_sql_exception_not_handled_rest_api.dto.StudentDetailDTO;

@Repository
public interface StudentRepository
        extends JpaRepository<com.experiments.pl_sql_exception_not_handled_rest_api.model.Student, Integer> {

    @Query(value = "SELECT * FROM public.get_student_details(:studentId)", nativeQuery = true)
    StudentDetailDTO getStudentDetailsViaPLSQL(@Param("studentId") Integer studentId);

    @Query(value = "SELECT * FROM student", nativeQuery = true)
    List<StudentDetailDTO> getAllStudentsDetails();

    @Query(value = "SELECT * FROM public.get_student_details(101)", nativeQuery = true)
    StudentDetailDTO get101IdStudentDetails();

}