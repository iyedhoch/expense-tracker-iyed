package model;

import lombok.Data;

import java.util.Date;
@Data
public class Categories {
    private String name;
    private String description;
    private Date createdat;
    private Date updatedat;

    public Categories() {
    }

    public Categories(String name, String description, Date createdat, Date updatedat) {
        this.name = name;
        this.description = description;
        this.createdat = createdat;
        this.updatedat = updatedat;
    }

    public Categories(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedat() {
        return createdat;
    }

    public void setCreatedat(Date createdat) {
        this.createdat = createdat;
    }

    public Date getUpdatedat() {
        return updatedat;
    }

    public void setUpdatedat(Date updatedat) {
        this.updatedat = updatedat;
    }
}
