package com.urise.webapp.model;

import java.util.Objects;

public class TextSection extends Section {

    private final String text;

    public TextSection(String info) {
        Objects.requireNonNull(info, "Information must not be null");
        this.text = info;
    }

    public String getInfo() {
        return text;
    }

    @Override
    public String toString() {
        return text + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TextSection that = (TextSection) o;
        return text.equals(that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }
}
