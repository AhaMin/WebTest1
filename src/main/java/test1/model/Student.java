package test1.model;

import test1.constants.MajorType;

import java.util.Date;

/**
 * created by ewang on 2017/12/4.
 */
public class Student {
    private final Long id;
    private final String name;
    private final Integer age;
    private final MajorType major;
    private final Date createTime;

    public Student(Long id, String name, Integer age, MajorType major, Date createTime) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.major = major;
        this.createTime = createTime;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public MajorType getMajor() {
        return major;
    }

    public Date getCreateTime() {
        return createTime;
    }
}
