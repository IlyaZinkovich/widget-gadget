package com.wg.widget.supplier.controller;

import com.wg.widget.supplier.model.Widget;
import com.wg.widget.supplier.service.WidgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/widgets")
public class WidgetController {

    @Autowired
    private WidgetService widgetService;

    @RequestMapping(method = GET)
    public List<Widget> getWidgets() {
        return widgetService.getWidgets();
    }
}
