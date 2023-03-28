package edu.unimagdalena.demo.repositories;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.unimagdalena.demo.entidades.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    //query methods
    //List<Student> findByFirstNameStartingWith(String firstName);
    Optional<Student> findByCodigo(String codigo);
}
