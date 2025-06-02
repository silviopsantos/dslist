package sps.consultoria.dslist.servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sps.consultoria.dslist.dto.GameDTO;
import sps.consultoria.dslist.dto.GameMinDTO;
import sps.consultoria.dslist.entidades.Game;
import sps.consultoria.dslist.repositorios.GameRepository;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game resultado = gameRepository.findById(id).get();
        return new GameDTO(resultado);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> resultado = gameRepository.findAll();
        List<GameMinDTO> dtos = resultado.stream().map(x -> new GameMinDTO(x)).toList();
        return dtos;
    }
}
