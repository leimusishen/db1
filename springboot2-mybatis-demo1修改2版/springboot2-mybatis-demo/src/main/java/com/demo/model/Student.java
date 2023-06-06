package com.demo.model;

public class Student {
    private Long id;
    private String username;
    private int password;
    private String real_name;
    private String admission_time;
    private String email;
    private String profession;
    private String grade;
    private String phone;
    private String sex;
    private int credit_total;
    // 构造方法
    public Student() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getRealName() {
        return real_name;
    }

    public void setRealName(String real_name) {
        this.real_name = real_name;
    }
    public String getAdmissionTime() {
        return admission_time;
    }

    public void setAdmissionTime(String admission_time) {
        this.admission_time = admission_time;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getCreditTotal() {
        return credit_total;
    }

    public void setCreditTotal(int credit_total) {
        this.credit_total = credit_total;
    }
}
