package controller;

import model.Income;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.IncomeService;

@RequestMapping
@Controller
public class IncomeController {
    @Autowired
    IncomeController incomecontroller= new IncomeController();

    @GetMapping
    public list<Income> getallincome(){
        return IncomeService.getallincome();
    }

    @PostMapping
    public Income addincome(Income income){
        return IncomeService.addincome(income)
    }

    @PutMapping
    public Income updateincome(Income income){
        return IncomeService.updateincome(income)
    }

    @DeleteMapping
    public Income deleteincome(Income income){
        return IncomeService.deleteincome(income)
    }
}
