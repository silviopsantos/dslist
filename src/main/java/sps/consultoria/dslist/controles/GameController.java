package sps.consultoria.dslist.controles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sps.consultoria.dslist.dto.GameMinDTO;
import sps.consultoria.dslist.entidades.Game;
import sps.consultoria.dslist.servicos.GameService;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll() {
        List<GameMinDTO> resultado = gameService.findAll();
        return resultado;
    }
}
