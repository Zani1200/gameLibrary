package com.example.gameLibrary.entity;

import jakarta.persistence.*;

@Entity
public class Juegos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idJuego;
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
