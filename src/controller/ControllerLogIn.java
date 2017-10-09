package controller;

import org.academiadecodigo.javabank.domain.Bank;
import org.academiadecodigo.javabank.view.ViewLogIn;

public class ControllerLogIn implements Controller{


    private Bank bank;
    private ViewLogIn viewLog;
    private ControllerMenu controllerMenu;

    public ControllerLogIn(ViewLogIn viewLog) {
        this.viewLog = viewLog;
    }

    @Override
    public void initialize() {
        viewLog.show();
    }

    public Bank getBank() {
        return bank;
    }

    public void setAcessingCustomerId(int id){

        bank.setAcessingCustomerId(id);
        controllerMenu.initialize();
    }





}
