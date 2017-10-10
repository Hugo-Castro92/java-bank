package org.academiadecodigo.javabank.controller;

import org.academiadecodigo.javabank.view.View;
import org.academiadecodigo.javabank.services.AuthService;

public abstract class AbstractController implements Controller {

    protected View view;
    protected AuthService authService;

    public void setView(View view) {
        this.view = view;
    }

    public void setAuthService(AuthService authService) {
        this.authService = authService;
    }

    @Override
    public void init() {
        view.show();
    }
}
