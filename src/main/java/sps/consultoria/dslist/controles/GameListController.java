package sps.consultoria.dslist.controles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sps.consultoria.dslist.dto.GameListDTO;
import sps.consultoria.dslist.servicos.GameListService;


import java.util.List;

@RestController
@RequestMapping(value = "/listas")
public class GameListController {

    @Autowired
    private GameListService gameListService;


    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> resultado = gameListService.findAll();
        return resultado;
    }
}
