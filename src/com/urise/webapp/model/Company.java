package com.urise.webapp.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Company {
    private final Link name;
    private List<Period> periods;

    public Link getName() {
        return name;
    }

    public List<Period> getPeriods() {
        return periods;
    }

    public Company(String... items) throws Exception {
        this.periods = new ArrayList<>();
        Objects.requireNonNull(items[0], "Name must not be null");
        Objects.requireNonNull(items[1], "Link must not be null");
        Objects.requireNonNull(items[2], "DateStart must not be null");
        Objects.requireNonNull(items[3], "DateEnd must not be null");
        Objects.requireNonNull(items[4], "Position must not be null");
        if (items[1].equals("")) {
            this.name = new Link(items[0]);
        } else this.name = new Link(items[0], items[1]);
        String[] args = Arrays.copyOfRange(items, 2, items.length);
        addPeriods(args);
    }
    public void addPeriods(String... items) throws Exception {
        if (items.length == 4){
            periods.add(new Period(items[0], items[1], items[2], items[3]));
        } else {
            periods.add(new Period(items[0], items[1], items[2]));
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return name.getName().equals(company.name.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name.getName());
    }

    @Override
    public String toString() {
        return "\n" + name +
                "\n" + periods +
                "\n";
    }
}
