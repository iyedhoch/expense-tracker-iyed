package model;

import lombok.Data;

import java.util.Date;
@Data
public class Fixedmonthlyincome {
    Categories categorie= new Categories();
    private Date payday;
    private Boolean Reminder;

    public Fixedmonthlyincome() {
    }

    public Fixedmonthlyincome(Categories categories, Date payday, Boolean Reminder) {
        this.categorie=categories;
        this.payday=payday;
        this.Reminder=Reminder;
    }

    public Categories getCategorie() {
        return categorie;
    }

    public void setCategorie(Categories categorie) {
        this.categorie = categorie;
    }

    public Date getPayday() {
        return payday;
    }

    public void setPayday(Date payday) {
        this.payday = payday;
    }

    public Boolean getReminder() {
        return Reminder;
    }

    public void setReminder(Boolean reminder) {
        Reminder = reminder;
    }
}
