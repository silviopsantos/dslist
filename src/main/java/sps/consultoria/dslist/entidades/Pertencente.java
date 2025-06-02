package sps.consultoria.dslist.entidades;


import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tb_pertencente")
public class Pertencente {

    @EmbeddedId
    private PertencentePK id = new PertencentePK();
    private Integer posicao;

    public Pertencente() {
    }
    public Pertencente(Game game, GameList lista, Integer posicao) {
        id.setGame(game);
        id.setLista(lista);
        this.posicao = posicao;
    }

    public PertencentePK getId() {
        return id;
    }

    public void setId(PertencentePK id) {
        this.id = id;
    }

    public Integer getPosicao() {
        return posicao;
    }

    public void setPosicao(Integer posicao) {
        this.posicao = posicao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pertencente that = (Pertencente) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
