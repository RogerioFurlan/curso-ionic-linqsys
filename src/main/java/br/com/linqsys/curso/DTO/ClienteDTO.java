package br.com.linqsys.curso.DTO;

import br.com.linqsys.curso.domain.Cliente;
import br.com.linqsys.curso.services.validation.ClienteUpdate;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@ClienteUpdate
public class ClienteDTO {

    private Integer id;

    @NotEmpty(message="Preenchimento Obrigatório.")
    @Length(min=5, max=120, message="O nome deve ter no mínimo 5 e no máximo 120 caracteres.")
    private String nome;

    @NotEmpty(message="Preenchimento Obrigatório.")
    @Email(message="Email Inválido.")
    private String email;

    public ClienteDTO() {

    }

    public ClienteDTO(Cliente obj) {
        id = obj.getId();
        nome = obj.getNome();
        email = obj.getEmail();
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
