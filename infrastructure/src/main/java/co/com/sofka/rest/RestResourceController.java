package co.com.sofka.rest;

import co.com.sofka.domain.repository.ResourceRepository;
import co.com.sofka.usecases.CreateResourceUseCase;

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
