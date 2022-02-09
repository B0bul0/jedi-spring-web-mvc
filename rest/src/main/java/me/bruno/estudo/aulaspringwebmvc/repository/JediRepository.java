package me.bruno.estudo.aulaspringwebmvc.repository;

import me.bruno.estudo.aulaspringwebmvc.model.Jedi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JediRepository extends JpaRepository<Jedi, Long> {



}
