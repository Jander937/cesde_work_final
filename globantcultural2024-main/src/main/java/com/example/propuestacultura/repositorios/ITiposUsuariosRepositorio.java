package com.example.propuestacultura.repositorios;

import com.example.propuestacultura.models.TiposUsuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITiposUsuariosRepositorio extends JpaRepository <TiposUsuarios, Integer> {
}
