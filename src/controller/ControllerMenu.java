package controller;

import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.javabank.domain.Bank;
import org.academiadecodigo.javabank.view.ViewMenu;

import java.util.HashMap;
import java.util.Map;

public class ControllerMenu implements Controller {

    private Controller menuControl;
    private ViewMenu viewMenu;
    Bank bank;
    private Map<Integer,Controller> controllerMap = new HashMap;


    @Override
    public void initialize() {

    }

    public void buildMainMenu(){



    }
}
