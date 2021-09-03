package br.com.alura.forum.repository;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Topico;

@Cacheable(value = "listaDeTopicos")
public interface TopicoRepository extends JpaRepository<Topico, Long> {

    Page<Topico> findByCursoNome(String nomeCurso, Pageable paginacao);

    // @Query("SELECT t from Topico WHERE t.curso.nome = :nomeCurso")
    // List<Topico> carregarPorNomeDoCurso(@Param("nomeCurso") String nomeCurso);
}
