package sps.consultoria.dslist.dto;

import sps.consultoria.dslist.entidades.GameList;

public class GameListDTO {

    private Long id;
    private String nome;

    public GameListDTO() {
    }
    public GameListDTO(GameList entidade) {
        id = entidade.getId();
        nome = entidade.getNome();
    }
    public Long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
}
