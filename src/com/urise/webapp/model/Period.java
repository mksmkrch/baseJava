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

    public Period(String dateStart, String dateEnd, String title) throws Exception {
        this.dateStart = dateParse(dateStart);
        this.dateEnd = dateParse(dateEnd);
        this.title = title;
        this.description = null;
    }

    public Period(String dateStart, String dateEnd, String title, String description) throws Exception {
        this.dateStart = dateParse(dateStart);
        this.dateEnd = dateParse(dateEnd);
        this.title = title;
        this.description = description;
    }

    private static LocalDate dateParse(String date) throws Exception {
        LocalDate ym = null;
        try {
            ym = LocalDate.parse(date + "/1", DateTimeFormatter.ofPattern("MM/yyyy/d"));
        } catch (Exception ignored) {
        }
        return ym;
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
