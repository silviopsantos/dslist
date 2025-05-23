package sps.consultoria.dslist.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import sps.consultoria.dslist.entidades.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
