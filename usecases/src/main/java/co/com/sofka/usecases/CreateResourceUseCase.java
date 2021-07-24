package co.com.sofka.usecases;

import co.com.sofka.domain.Resource;

public class CreateResourceUseCase {

    private ResourceRepository resourceRepository;

    public void createResource(String name){
        resourceRepository.save(new Resource(name));
    }
}
