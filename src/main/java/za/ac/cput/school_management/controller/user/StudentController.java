/**
 * Author: Hlombekazi Mbelu (209024666)
 * Date: 18 June 2022
 */
package za.ac.cput.school_management.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.school_management.domain.user.Student;
import za.ac.cput.school_management.service.impl.user.StudentService;

import java.util.List;


    @RestController
    @RequestMapping("school-management/student/")
    public class StudentController {

        private StudentService studentService;

        @Autowired
        public StudentController(StudentService studentService){
            this.studentService = studentService;
        }

        @PostMapping("save")
        public ResponseEntity<Student> save(@RequestBody Student student){
            Student save = studentService.save(student);
            System.out.println("save");
            return ResponseEntity.ok(save);
        }

        @GetMapping("read/{s}")
        public ResponseEntity<Student> read(@PathVariable String s){
            Student read = studentService.read(s).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
            return ResponseEntity.ok(read);
        }

        @DeleteMapping("delete")
        public ResponseEntity<Void> delete(Student student){
            this.studentService.delete(student);
            return ResponseEntity.noContent().build();
        }

        @GetMapping("all")
        public ResponseEntity<List<Student>> getAll(){
            List<Student> student = this.studentService.getAll();
            return ResponseEntity.ok(student);
        }
}
