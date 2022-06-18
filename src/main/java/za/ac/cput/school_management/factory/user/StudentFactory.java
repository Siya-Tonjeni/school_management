/**
 * StudentFactory.java
 * Entity class for Student
 * Author: Hlombekazi Mbelu (209024666)
 * Date: 10 June 2022
 */
package za.ac.cput.school_management.factory.user;

import za.ac.cput.school_management.domain.user.Student;
import za.ac.cput.school_management.domain.user.Name;
import za.ac.cput.school_management.util.helper;

public class StudentFactory {

    public static Student build(String email, Name name){

         if(!helper.emailIsValid(email)){
            throw new IllegalArgumentException("Email is not valid");
        }

        String studentId = helper.generateUUID();
        return new Student.Builder()
                .setStudentId(studentId)
                .setEmail(email)
                .setName(name)
                .build();
    }

}
