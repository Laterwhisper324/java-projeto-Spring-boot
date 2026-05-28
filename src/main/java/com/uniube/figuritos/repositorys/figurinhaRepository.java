package com.uniube.figuritos.repositorys;
import com.uniube.figuritos.models.figurinhas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface figurinhaRepository extends JpaRepository<figurinhas, Integer> {
}
