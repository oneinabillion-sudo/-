package com.example.expense.service;

import java.util.List;

import com.example.expense.entity.ExpenseRecords;
import com.example.expense.mapper.ExpenseMapper;

import org.springframework.stereotype.Service;

@Service 
public class ExpenseServise {
    
    // DI注入
    private final ExpenseMapper expenseMapper;
    public ExpenseServise(ExpenseMapper expenseMapper){
        this.expenseMapper = expenseMapper;
    }

    public List<ExpenseRecords> findAll(){
        return expenseMapper.findAll();
    }

}
