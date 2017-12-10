package test1.dao;

import test1.model.Student;

import java.util.List;

/**
 * created by ewang on 2017/12/10.
 */
public interface StudentDAO {

    List<Student> findAll();
}
