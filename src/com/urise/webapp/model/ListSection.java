package com.urise.webapp.model;

import java.util.List;
import java.util.Objects;

public class ListSection extends Section {
    private final List<String> info;

    public ListSection(List<String> info) {
        Objects.requireNonNull(info, "Info must be not null");
        this.info = info;
    }

    public List<String> getInfo() {
        return info;
    }

    @Override
    public String toString() {
        return info + "\n";
    }
}
