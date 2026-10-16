package com.example.expense.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.expense.entity.ExpenseRecords;

@Mapper 
public interface ExpenseMapper {
    

    List<ExpenseRecords> findAll();
}
