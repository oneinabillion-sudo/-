package com.example.expense.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import com.example.expense.service.ExpenseServise;
import org.springframework.web.bind.annotation.RequestParam;





@Controller 
public class expenseController {
    
    private final ExpenseServise expenseServise;
    public expenseController(ExpenseServise expenseServise){
        this.expenseServise = expenseServise;
    }

    @GetMapping("/manage")
    public String ShowFrontPage() {
        return "manage";
    }
    


    @GetMapping("/findAll")
    public String getfindAllData(Model model) {

        model.addAttribute("allData", expenseServise.findAll());

        return "manage";
    }

    @GetMapping("/jump_add_page")
    public String getAddForm() {
        return "addform";
    }
    
    
}
