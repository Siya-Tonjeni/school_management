/**
 * Student.java
 * Entity class for Student
 * Author: Hlombekazi Mbelu (209024666)
 * Date: 9 June 2022
 */

package za.ac.cput.school_management.domain.user;


import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Student {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String studentId;
        private String email;
        @Embedded
        private Name name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(Name name) {
        this.name = name;
    }

    protected Student(){}

        public String getStudentId(){
            return studentId;
        }

        public String getEmail(){
            return email;
        }

        public Name getName(){
            return name;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "staffId='" + studentId + '\'' +
                    ", email='" + email + '\'' +
                    ", name=" + name +
                    '}';
        }

        private Student(Builder builder){
            this.studentId = builder.studentId;
            this.email = builder.email;
            this.name = builder.name;
        }


        public static class Builder{
            private String studentId;
            private String email;
            private Name name;

            public Builder setStudentId(String studentId){
                this.studentId = studentId;
                return this;
            }

            public Builder setEmail(String email){
                this.email = email;
                return this;
            }

            public Builder setName(Name name){
                this.name = name;
                return this;
            }

            public Builder copy(Student  student){
                this.studentId = student.studentId;
                this.email = student.email;
                this.name = student.name;
                return this;
            }

            public Student build(){
                return new Student(this);}
        }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId.equals(student.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }

    }
