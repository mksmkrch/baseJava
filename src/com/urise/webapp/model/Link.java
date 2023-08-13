package com.urise.webapp.model;

import java.util.Objects;

public class Link {
    private final String name;
    private final String url;

    public Link(String name) {
        this.name = name;
        this.url = null;
    }

    public Link(String name, String url) {
        Objects.requireNonNull(name, "Name must not be null");
        this.name = name;
        this.url = url;
    }
    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Link link = (Link) o;
        return Objects.equals(name, link.name) && Objects.equals(url, link.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, url);
    }

    @Override
    public String toString() {
        if (url == null) return name;
        return name + ", Link: " + url;
    }
}