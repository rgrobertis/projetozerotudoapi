package br.com.robertis.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.robertis.projeto.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

}
