package com.example.gameLibrary.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Juegos")
public class JuegosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idJuego;
    @Column
    private String nomJuego;

    public int getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(int idJuego) {
        this.idJuego = idJuego;
    }

    public String getNomJuego() {
        return nomJuego;
    }

    public void setNomJuego(String nomJuego) {
        this.nomJuego = nomJuego;
    }

    @Override
    public String toString() {
        return "Juegos{" +
                "idJuego=" + idJuego +
                ", nomJuego='" + nomJuego + '\'' +
                '}';
    }
}
