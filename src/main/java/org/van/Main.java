package org.van;

import jakarta.xml.ws.Endpoint;
import org.van.service.BanqueService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            String ADDRESSE="http://0.0.0.0:9191/";
        Endpoint.publish(ADDRESSE,new BanqueService());
        System.out.println("Web service deployé sur :"+ADDRESSE);
    }
}