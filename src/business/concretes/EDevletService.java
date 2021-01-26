package business.concretes;

import business.abstracts.ICustomerService;
import business.abstracts.IRegisterService;
import entities.concretes.Customer;

public class EDevletService implements IRegisterService {


    public boolean register(Customer customer) {
        System.out.println("E devlet kontrolü yapıldı.");
        return true;
    }
}
