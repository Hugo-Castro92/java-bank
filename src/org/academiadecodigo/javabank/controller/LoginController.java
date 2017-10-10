package org.academiadecodigo.javabank.controller;

import org.academiadecodigo.javabank.services.CustomerService;
import java.util.Set;

public class LoginController extends AbstractController {

    private Controller nextController;
    private CustomerService customerService;


    public void onLogin(int id) {
        customerService.setLoginCustomer(id);
        nextController.init();
    }

    public void setNextController(Controller nextController) {
        this.nextController = nextController;
    }

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    public CustomerService getCustomerService() {
        return customerService;
    }

    public Set<Integer> getCustomerIds() {
        return customerService.getCustomerIds();
    }

}
