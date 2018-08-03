package br.com.linqsys.curso.DTO;

import br.com.linqsys.curso.domain.Categoria;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

public class CategoriaDTO {

    private Integer id;

    @NotEmpty(message="Preenchimento Obrigatório.")
    @Length(min=5, max=80, message="O campo deve ser preecnhido com no mínimo 5  e no máximo 80 caracteres.")
    private String nome;

    public CategoriaDTO() {

    }

    public CategoriaDTO(Categoria obj) {
        id = obj.getId();
        nome = obj.getNome();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
