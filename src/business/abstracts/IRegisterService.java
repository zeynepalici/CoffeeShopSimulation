package business.abstracts;

import entities.concretes.Customer;

public interface IRegisterService {

    boolean register(Customer customer);
}
