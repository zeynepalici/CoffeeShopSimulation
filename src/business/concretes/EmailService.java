package business.concretes;

import business.abstracts.IRegisterService;
import entities.concretes.Customer;

public class EmailService implements IRegisterService {
    @Override
    public boolean register(Customer customer) {
        System.out.println("Email kontrolü yapıldı.");
        return true;
    }
}
