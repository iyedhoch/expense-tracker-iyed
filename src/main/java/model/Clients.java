package model;

import lombok.Data;

import java.util.Date;
@Data
public class Clients {
    private String id;
    private String name;
    private String lastname;
    private String email;
    private Date dateofbirth;
    Income income =new Income();
    Expenses expenses =new Expenses();
    Fixedmonthlyexpenses fme=new Fixedmonthlyexpenses();
    Fixedmonthlyincome fmi=new Fixedmonthlyincome();

    public Clients() {
    }

    public Clients(String id, String name, String lastname, String email, Date dateofbirth, Income income, Expenses expenses, Fixedmonthlyexpenses fme, Fixedmonthlyincome fmi) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.dateofbirth = dateofbirth;
        this.income = income;
        this.expenses = expenses;
        this.fme = fme;
        this.fmi = fmi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public Income getIncome() {
        return income;
    }

    public void setIncome(Income income) {
        this.income = income;
    }

    public Expenses getExpenses() {
        return expenses;
    }

    public void setExpenses(Expenses expenses) {
        this.expenses = expenses;
    }

    public Fixedmonthlyexpenses getFme() {
        return fme;
    }

    public void setFme(Fixedmonthlyexpenses fme) {
        this.fme = fme;
    }

    public Fixedmonthlyincome getFmi() {
        return fmi;
    }

    public void setFmi(Fixedmonthlyincome fmi) {
        this.fmi = fmi;
    }
}
