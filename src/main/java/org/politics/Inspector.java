package org.politics;

public final class Inspector {

    private static Inspector inspector;

    private Inspector() {
    }

    public static Inspector getInstance() {
        if (inspector == null) {
            inspector = new Inspector();
        }
        return inspector;
    }
}
