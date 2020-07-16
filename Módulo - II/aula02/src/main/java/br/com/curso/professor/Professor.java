package br.com.curso.professor;

import br.com.curso.alunos.ValidationException;
import br.com.curso.disciplinas.Disciplina;
import br.com.curso.usuario.UsuarioAutorizavelAbstract;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Professor extends UsuarioAutorizavelAbstract{

    @OneToMany(mappedBy = "professor")
    private List<Disciplina> disciplinas;

    public Professor(String login, String cpf, String nome) throws ValidationException {
        super(login, cpf, nome);
    }

}
