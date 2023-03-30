package com.example.SDIApp.Repositoriy;

import com.example.SDIApp.Model.Worker;
import org.springframework.data.jpa.repository.JpaRepository;



// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
public interface WorkerRepository extends JpaRepository<Worker, Integer> {
   /*
    void populate();

    List<Worker> getAll();

    Optional<Worker> get(Integer id);

    int add(Worker worker);

    int delete(Integer id);

    int update(Integer id, Worker worker);

    List<Worker> filterSalary(int salary);

    */
}
