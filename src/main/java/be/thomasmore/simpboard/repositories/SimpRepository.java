package be.thomasmore.simpboard.repositories;

import be.thomasmore.simpboard.model.Simp;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.awt.*;
import java.util.Optional;

public interface SimpRepository extends CrudRepository<Simp,Integer> {

}
