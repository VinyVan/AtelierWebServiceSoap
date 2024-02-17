package org.van.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.van.model.Compte;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "BanqueService")
public class BanqueService {
    @WebMethod(operationName = "Convert")
    public Double Conversion(@WebParam(name = "montant") double mt){
        return mt*10.54;
    }

    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code){
        return new Compte(code,Math.random()*1000,new Date());
    }

    @WebMethod
    public List<Compte> listComptes(){
        return List.of(
                new Compte(1,Math.random()*1000,new Date()),
                new Compte(2,Math.random()*1000,new Date()),
                new Compte(3,Math.random()*1000,new Date())
        );
    }
}
