package sps.consultoria.dslist.servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sps.consultoria.dslist.dto.GameListDTO;
import sps.consultoria.dslist.entidades.GameList;
import sps.consultoria.dslist.repositorios.GameListRepository;


import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;


    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> resultado = gameListRepository.findAll();
        List<GameListDTO> dtos = resultado.stream().map(x -> new GameListDTO(x)).toList();
        return dtos;
    }
}
