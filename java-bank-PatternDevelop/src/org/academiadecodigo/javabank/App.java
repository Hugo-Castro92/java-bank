package org.academiadecodigo.javabank;

import controller.Controller;
import controller.ControllerLogIn;
import controller.ControllerMenu;
import jdk.nashorn.internal.runtime.linker.Bootstrap;
import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.javabank.application.BankApplication;
import org.academiadecodigo.javabank.domain.Bank;
import org.academiadecodigo.javabank.domain.Customer;
import org.academiadecodigo.javabank.managers.AccountManager;
import org.academiadecodigo.javabank.view.ViewLogIn;
import org.academiadecodigo.javabank.view.ViewMenu;

public class App {

    public static void main(String[] args) {

        Bootstrap bootstrap = new Bootstrap();

        bootstrap.showData();
        bootstrap.connect();
        bootstrap.showMap();

        bootstrap.init();

    }
}
