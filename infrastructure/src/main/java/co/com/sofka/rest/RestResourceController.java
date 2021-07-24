package co.com.sofka.rest;

import co.com.sofka.usecases.CreateResourceUseCase;
import co.com.sofka.usecases.ResourceRepository;

public class RestResourceController {

    private CreateResourceUseCase createResourceUseCase;

    public RestResourceController(){
        ResourceRepository resourceRepository;
    }

    public String post(String name){
        createResourceUseCase.createResource(name);

        return "Ok";
    }
}
