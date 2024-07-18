package model;

import lombok.Data;

@Data
public class Amount {
    private String name;

    public Amount() {
    }

    public Amount(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
