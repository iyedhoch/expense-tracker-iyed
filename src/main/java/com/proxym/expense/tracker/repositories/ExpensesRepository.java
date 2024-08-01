package com.proxym.expense.tracker.repositories;


import com.proxym.expense.tracker.entities.CategoryEntity;
import com.proxym.expense.tracker.entities.ExpenseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpensesRepository extends JpaRepository<ExpenseEntity,Long> {
}
