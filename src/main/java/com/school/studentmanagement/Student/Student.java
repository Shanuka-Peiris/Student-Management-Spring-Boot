package com.school.studentmanagement.Student;

public class Student {
    private long id;
    private String firstName;
    private String lastName;
    private int age;
    private String dob;
    private String nicNo;
    private int grade;
    private String telNo;
    private String address;
    private String gender;

    public Student () {
    }

    public Student(long id, String firstName, String lastName, int age, String dob, String nicNo, int grade, String telNo, String address, String gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.dob = dob;
        this.nicNo = nicNo;
        this.grade = grade;
        this.telNo = telNo;
        this.address = address;
        this.gender = gender;
    }

    public Student(Student student) {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getNicNo() {
        return nicNo;
    }

    public void setNicNo(String nicNo) {
        this.nicNo = nicNo;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                ", nicNo='" + nicNo + '\'' +
                ", grade=" + grade +
                ", telNo=" + telNo +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
