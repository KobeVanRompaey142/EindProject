package be.thomasmore.simpboard.repositories;

import be.thomasmore.simpboard.model.Bier;
import be.thomasmore.simpboard.model.Simp;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import java.util.List;


public interface BierRepository extends CrudRepository<Bier, Integer> {
    @Query("select b from Bier b where" +
            "(:minAlcohol is null or b.alcholNiveau>=:minAlcohol) and" +
            "(:biernaam is null or upper(b.bierNaam) like upper(concat('%', :biernaam, '%') ) )")
    List<Bier> findByFilter(@Param("minAlcohol")Integer minAlcohol,@Param("biernaam")String biernaam);
    List<Bier> findAllBySimps(Simp simp);
}
