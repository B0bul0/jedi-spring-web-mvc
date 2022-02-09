package me.bruno.estudo.aulaspringwebmvc.repository;

import me.bruno.estudo.aulaspringwebmvc.model.Jedi;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JediRepository {

    private final List<Jedi> jedis;

    public JediRepository() {
        this.jedis = new ArrayList<>();

        this.jedis.add(new Jedi("Luke", "Skywalker"));
    }

    public List<Jedi> getAllJedi() {
        return this.jedis;
    }

    public void add(Jedi jedi) {
        this.jedis.add(jedi);
    }

}
