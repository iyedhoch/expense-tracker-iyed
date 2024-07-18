package model;

import lombok.Data;

import java.util.Date;
@Data
public class Fixedmonthlyexpenses {
    Categories categorie= new Categories();
    private Date duedate;
    private Boolean Reminder;

    public Fixedmonthlyexpenses() {
    }

    public Fixedmonthlyexpenses(Categories categories, Date duedate, Boolean Reminder) {
        this.categorie=categories;
        this.duedate=duedate;
        this.Reminder=Reminder;
    }

    public Categories getCategorie() {
        return categorie;
    }

    public void setCategorie(Categories categorie) {
        this.categorie = categorie;
    }

    public Date getDuedate() {
        return duedate;
    }

    public void setDuedate(Date duedate) {
        this.duedate = duedate;
    }

    public Boolean getReminder() {
        return Reminder;
    }

    public void setReminder(Boolean reminder) {
        Reminder = reminder;
    }
}
