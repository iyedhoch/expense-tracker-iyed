package controller;

import model.Expenses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.ExpensesService;

@Controller
@RequestMapping("expenses")
public class ExpenseController {
    @Autowired
    private ExpenseController expenseController;

    @GetMapping
    public list<Expenses> getExpenses() {
        return expenseController.getallExpenses();
    }

    @PostMapping
    public Expenses postExpenses(Expenses expenses) {
        return ExpensesService.addexpense(expenses);
    }

    @PutMapping
    public Expenses postExpenses(Expenses expenses) {
        return ExpensesService.updateexpense(expenses);
    }

    @DeleteMapping
    public Expenses deleteExpenses(Expenses expenses) {
        return ExpensesService.deleteexpense(expenses);
    }

}
