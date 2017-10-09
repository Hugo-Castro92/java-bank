package org.academiadecodigo.javabank.view;

import controller.Controller;
import controller.ControllerMenu;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.javabank.application.Messages;
import org.academiadecodigo.javabank.application.UserOptions;
import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.*;

public class ViewMenu {

    private  ControllerMenu controllerMenu;
    private Prompt prompt;


    public show() {

        MenuInputScanner mainMenu = new MenuInputScanner(UserOptions.getMessages());
        mainMenu.setError(Messages.ERROR_INVALID_OPTION);
        mainMenu.setMessage(Messages.MENU_WELCOME);

        controllerMenu.buildMainMenu();

    }


}
