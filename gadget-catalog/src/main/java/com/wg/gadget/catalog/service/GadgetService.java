package com.wg.gadget.catalog.service;

import com.wg.gadget.catalog.model.Gadget;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

@Service
public class GadgetService {

    private List<Gadget> gadgets;

    public GadgetService() {
        this.gadgets = LongStream.range(1, 500).mapToObj(Gadget::new).collect(Collectors.toList());
    }

    public List<Gadget> getGadgets() {
        return gadgets;
    }
}
