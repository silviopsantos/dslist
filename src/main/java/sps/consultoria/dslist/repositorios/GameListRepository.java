package sps.consultoria.dslist.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import sps.consultoria.dslist.entidades.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
