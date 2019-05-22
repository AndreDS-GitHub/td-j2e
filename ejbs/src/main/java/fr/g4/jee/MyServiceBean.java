package fr.g4.jee;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
@Remote
@Local
public class MyServiceBean implements MyService {

    public String test() {
        return "Hello world from EJB";
    }

}
