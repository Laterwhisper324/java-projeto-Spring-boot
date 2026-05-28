package com.uniube.figuritos.services;

import com.uniube.figuritos.models.figurinhas;
import com.uniube.figuritos.repositorys.figurinhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class figurinhasService {

    @Autowired
    private figurinhaRepository repository;

    public List<figurinhas> getfigurinhas() {
        return repository.findAll();
    }

    public Optional<figurinhas> getfigurinhas(Integer id){
        return repository.findById(id);
    }

    public figurinhas cadastrarFigurinhas(figurinhas figurinha){
        return repository.save(figurinha);
    }

}
