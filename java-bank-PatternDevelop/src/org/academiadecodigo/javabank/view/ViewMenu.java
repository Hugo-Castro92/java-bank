package org.academiadecodigo.javabank.view;

import controller.Controller;
import controller.ControllerMenu;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.javabank.application.Messages;
import org.academiadecodigo.javabank.application.UserOptions;
import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.*;
import org.academiadecodigo.javabank.domain.Bank;

public class ViewMenu implements Views {

    private  ControllerMenu controllerMenu;
    private Prompt prompt;
    private Bank bank;

    public ViewMenu (Bank bank, Prompt prompt) {

        super(bank, prompt);

    }


    @Override
    public void show() {
      MenuInputScanner mainMenu = buildMainMenu();
      controllerMenu.setOption(prompt.getUserInput(mainMenu));
    }

    @Override
    public void setController(Controller controller) {
        this.controllerMenu = (ControllerMenu) Controller;
    }



    private MenuInputScanner  buildMainMenu(){

        MenuInputScanner mainMenu = new MenuInputScanner(UserOptions.getMessages());
        mainMenu.setError(Messages.ERROR_INVALID_OPTION);
        mainMenu.setMessage(Messages.MENU_WELCOME);

        return mainMenu;

    }
}
