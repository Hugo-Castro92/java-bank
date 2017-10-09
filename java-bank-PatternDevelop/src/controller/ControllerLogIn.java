package controller;

import org.academiadecodigo.javabank.domain.Bank;
import org.academiadecodigo.javabank.view.Views;

public class ControllerLogIn implements Controller{


    private Bank bank;
    private Views view;
    private Controller controller;

    public ControllerLogIn(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void initialize() {
        view.show();
    }

    @Override
    public void setview(Views view) {
        this.view = view;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void setLogInView(Views logInView) {
        this.view = logInView;
    }

    public void setAcessingCustomerId(int id){

        bank.setAcessingCustomerId(id);
        controller.initialize();
    }





}
