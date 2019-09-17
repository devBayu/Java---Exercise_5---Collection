package com.enigma.model;

import java.util.Objects;

public class MultiFriends {
    private String nameFriends;

    public MultiFriends(String nameFriends) {
        this.nameFriends = nameFriends;
    }

    public String getNameFriends() {
        return nameFriends;
    }

    public void setNameFriends(String nameFriends) {
        this.nameFriends = nameFriends;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MultiFriends that = (MultiFriends) o;
        return Objects.equals(nameFriends, that.nameFriends);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameFriends);
    }
}
