package sps.consultoria.dslist.entidades;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class PertencentePK {

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;

    @ManyToOne
    @JoinColumn(name = "lista_id")
    private GameList lista;

    public PertencentePK() {
    }

    public PertencentePK(Game game, GameList lista) {
        this.game = game;
        this.lista = lista;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public GameList getLista() {
        return lista;
    }

    public void setLista(GameList lista) {
        this.lista = lista;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PertencentePK that = (PertencentePK) o;
        return Objects.equals(game, that.game) && Objects.equals(lista, that.lista);
    }

    @Override
    public int hashCode() {
        return Objects.hash(game, lista);
    }
}
