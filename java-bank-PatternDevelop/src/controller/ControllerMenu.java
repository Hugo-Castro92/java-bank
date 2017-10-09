package controller;

import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.javabank.domain.Bank;
import org.academiadecodigo.javabank.view.ViewMenu;
import org.academiadecodigo.javabank.view.Views;

import java.util.HashMap;
import java.util.Map;

public class ControllerMenu implements Controller {

    private Controller menuControl;
    private Views view;
    private Bank bank;
    private Map<Integer,Controller> controllerMap = new HashMap<>();


    @Override
    public void initialize() {
        view.show();
    }

    @Override
    public void setview(Views view) {
        this.view = view;
    }


    public void setControllerMap(Map<Integer, Controller> controllerMap){

        this.controllerMap = controllerMap;

    }

    public void setOption(int option){

        if (option <= controllerMap.size()){

            controllerMap.get(option).initialize();
            initialize();
        }

    }
}
