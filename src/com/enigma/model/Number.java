package com.enigma.model;

import java.util.Objects;

public class Number {
    private Integer numb;

    public Number(Integer numb) {
        this.numb = numb;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Number number = (Number) o;
        return Objects.equals(numb, number.numb);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numb);
    }

    public Integer getNumb() {
        return numb;
    }

    public void setNumb(Integer numb) {
        this.numb = numb;
    }
}
