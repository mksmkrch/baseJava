package com.urise.webapp.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Period {
    private LocalDate dateStart;
    private LocalDate dateEnd;
    private String title;
    private String description;

    public LocalDate getDateStart() {
        return dateStart;
    }

    public LocalDate getDateEnd() {
        return dateEnd;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Period(LocalDate dateStart, LocalDate dateEnd, String... args) {
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.title = args[0];
        this.description = args.length == 2 ? args[1] : null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Period period = (Period) o;
        return Objects.equals(dateStart, period.dateStart) && Objects.equals(dateEnd, period.dateEnd) && Objects.equals(title, period.title) && Objects.equals(description, period.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateStart, dateEnd, title, description);
    }

    @Override
    public String toString() {
        return dateStart.format(DateTimeFormatter.ofPattern("MM/yyyy")) + " - " +
                (Objects.isNull(dateEnd) ? "Сейчас" : dateEnd.format(DateTimeFormatter.ofPattern("MM/yyyy"))) +
                "\n" + title +
                (Objects.isNull(description) ? "" : "\n" + description);
    }
}
