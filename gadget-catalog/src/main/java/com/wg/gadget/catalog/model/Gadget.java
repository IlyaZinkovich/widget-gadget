package com.wg.gadget.catalog.model;

public class Gadget {

    private Long id;

    public Gadget() {
    }

    public Gadget(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
