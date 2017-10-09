package controller;

import org.academiadecodigo.javabank.view.Views;

public class ControllerBalance implements Controller {

    private Views view;


    @Override
    public void initialize() {
        view.show();
    }

    @Override
    public void setview(Views view) {
        this.view = view;
    }
}
