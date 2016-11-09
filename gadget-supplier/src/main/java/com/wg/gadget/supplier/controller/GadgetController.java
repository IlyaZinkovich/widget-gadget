package com.wg.gadget.supplier.controller;

import com.wg.gadget.supplier.model.Gadget;
import com.wg.gadget.supplier.service.GadgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/gadgets")
public class GadgetController {

    @Autowired
    private GadgetService gadgetService;

    @RequestMapping(method = GET)
    public List<Gadget> getWidgets() {
        return gadgetService.getGadgets();
    }
}
