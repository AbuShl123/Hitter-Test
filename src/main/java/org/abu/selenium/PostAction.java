package org.abu.selenium;

import org.abu.utils.SeleniumActions;

public enum PostAction implements Runnable {
    SHORT_SLEEP(() -> SeleniumActions.waitFor(1)),
    MEDIUM_SLEEP(() -> SeleniumActions.waitFor(2)),
    LONG_SLEEP(() -> SeleniumActions.waitFor(3));

    private final Runnable action;

    PostAction(Runnable action) {
        this.action = action;
    }

    @Override
    public void run() {
        this.action.run();
    }
}
