package sps.consultoria.dslist.entidades;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titulo;
    private Integer ano;
    private String genero;
    private String plataforma;
    private String imgUrl;
    @Column(columnDefinition = "TEXT")
    private String descricaoCurta;
    @Column(columnDefinition = "TEXT")
    private String descricaoLonga;

    public Game() {
    }

    public Game(String titulo, long id, Integer ano, String genero, String plataforma,
                String imgUrl, String descricaoCurta, String descricaoLonga) {
        this.titulo = titulo;
        this.id = id;
        this.ano = ano;
        this.genero = genero;
        this.plataforma = plataforma;
        this.imgUrl = imgUrl;
        this.descricaoCurta = descricaoCurta;
        this.descricaoLonga = descricaoLonga;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getDescricaoCurta() {
        return descricaoCurta;
    }

    public void setDescricaoCurta(String descricaoCurta) {
        this.descricaoCurta = descricaoCurta;
    }

    public String getDescricaLonga() {
        return descricaoLonga;
    }

    public void setDescricaLonga(String descricaLonga) {
        this.descricaoLonga = descricaLonga;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Game game = (Game) o;
        return id == game.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
