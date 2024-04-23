package org.abu.selenium;

import org.abu.screens.IPage;

public class Control<T extends IPage> extends BaseElement {

    private final T page;
    private final Runnable[] postActions;


    public Control(Locator locator, String selector, String name, T page) {
        this(locator, selector, name, page, null);
    }

    public Control(Locator locator, String selector, String name, T page, Runnable[] postActions) {
        super(locator, selector, name);
        this.page = page;
        this.postActions = postActions;
    }

    private void performPostActions() {
        for (Runnable postAction : postActions) {
            postAction.run();
        }
    }

    private void log(Object message) {
        System.out.println(message);
    }

    public T click() {

        try {
            getElement().click();
            log("Clicked on element:" + toHtml());
        } catch (Exception e) {
            log("Failed to click on element:" + toHtml());
            throw e;
        }

        performPostActions();
        return this.page;
    }

    public T sendKeys(String s) {

        try {
            getElement().sendKeys(s);
            log("Enter text '" + s + "' on element:" + toHtml());
        } catch (Exception e) {
            log("Failed to enter text '" + s + "' on element:" + toHtml());
            throw e;
        }

        performPostActions();
        return this.page;
    }
}
