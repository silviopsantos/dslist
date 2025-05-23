package sps.consultoria.dslist.servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sps.consultoria.dslist.dto.GameMinDTO;
import sps.consultoria.dslist.entidades.Game;
import sps.consultoria.dslist.repositorios.GameRepository;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> resultado = gameRepository.findAll();
        List<GameMinDTO> dtos = resultado.stream().map(x -> new GameMinDTO(x)).toList();
        return dtos;
    }
}
