package com.urise.webapp.model;

import java.time.LocalDate;
import java.util.*;

public class Company {
    private final Link name;
    private final List<Period> periods;

    public Link getName() {
        return name;
    }

    public List<Period> getPeriods() {
        return periods;
    }

    public Company(String... items) throws Exception {
        Objects.requireNonNull(items[0], "Name must not be null");
        Objects.requireNonNull(items[1], "Link must not be null");
        this.periods = new ArrayList<>();
        this.name = new Link(items[0], items[1]);
    }
    public void addPeriod(LocalDate dateStart, LocalDate dateEnd, String... args) {
        periods.add(new Period(dateStart, dateEnd, args));
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