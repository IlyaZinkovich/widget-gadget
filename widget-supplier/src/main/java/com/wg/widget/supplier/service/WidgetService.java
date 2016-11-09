package com.wg.widget.supplier.service;

import com.wg.widget.supplier.model.Widget;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

@Service
public class WidgetService {

    private List<Widget> widgets;

    public WidgetService() {
        this.widgets = LongStream.range(1, 1000).mapToObj(Widget::new).collect(Collectors.toList());
    }

    public List<Widget> getWidgets() {
        return widgets;
    }
}
