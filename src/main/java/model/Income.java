package model;

import lombok.Data;

import java.util.Date;
@Data
public class Income {
    Amount amount=new Amount();
    private int taxes;
    private Date date;
    Categories categories= new Categories();
    public Income() {
    }

    public Income(Amount amount, int taxes, Date date, Categories categories) {
        this.amount = amount;
        this.taxes = taxes;
        this.date = date;
        this.categories = categories;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public int getTaxes() {
        return taxes;
    }

    public void setTaxes(int taxes) {
        this.taxes = taxes;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }
}
