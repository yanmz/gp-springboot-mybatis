package com.isea533.mybatis.model;

import javax.persistence.*;

@Table(name = "user")
public class User {
    /**
     * ����ID
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * ����
     */
    private String name;

    /**
     * ����
     */
    private Integer age;

    /**
     * ����
     */
    private String email;

    /**
     * ��ȡ����ID
     *
     * @return id - ����ID
     */
    public Long getId() {
        return id;
    }

    /**
     * ��������ID
     *
     * @param id ����ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * ��ȡ����
     *
     * @return name - ����
     */
    public String getName() {
        return name;
    }

    /**
     * ��������
     *
     * @param name ����
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * ��ȡ����
     *
     * @return age - ����
     */
    public Integer getAge() {
        return age;
    }

    /**
     * ��������
     *
     * @param age ����
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * ��ȡ����
     *
     * @return email - ����
     */
    public String getEmail() {
        return email;
    }

    /**
     * ��������
     *
     * @param email ����
     */
    public void setEmail(String email) {
        this.email = email;
    }
}