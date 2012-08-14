package com.vaadin.addon.touchkit.gwt.client;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.shared.ui.Connect;
import com.vaadin.terminal.gwt.client.ui.textfield.TextFieldConnector;

@Connect(com.vaadin.addon.touchkit.ui.UrlField.class)
public class UrlFieldConnector extends TextFieldConnector {

    @Override
    protected Widget createWidget() {
        return GWT.create(UrlFieldWidget.class);
    }

    @Override
    public UrlFieldWidget getWidget() {
        return (UrlFieldWidget) super.getWidget();
    }
}
