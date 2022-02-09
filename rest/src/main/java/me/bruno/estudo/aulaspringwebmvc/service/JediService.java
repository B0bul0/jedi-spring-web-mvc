package me.bruno.estudo.aulaspringwebmvc.service;

import me.bruno.estudo.aulaspringwebmvc.exception.JediNotFoundException;
import me.bruno.estudo.aulaspringwebmvc.model.Jedi;
import me.bruno.estudo.aulaspringwebmvc.repository.JediRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JediService {

    @Autowired
    public JediRepository jediRepository;

    public List<Jedi> findAll() {
        return jediRepository.findAll();
    }

    public Jedi findById(Long id) {
        Optional<Jedi> jediOptional = jediRepository.findById(id);

        if (jediOptional.isPresent())
            return jediOptional.get();

       throw new JediNotFoundException();
    }

    public Jedi save(Jedi jedi) {
        return jediRepository.save(jedi);
    }

    public Jedi update(Long id, Jedi jediDto) {
        Jedi jediEntity = findById(id);

        jediEntity.setName(jediDto.getName());
        jediEntity.setLastName(jediDto.getLastName());

        return jediRepository.save(jediEntity);
    }

    public void deleteById(Long id) {
        Jedi jedi = findById(id);

        jediRepository.delete(jedi);
    }

}
