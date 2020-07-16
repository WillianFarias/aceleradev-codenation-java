package br.com.condenation.avaliacao.model;

import br.com.condenation.leitor.model.Leitor;
import br.com.condenation.livro.model.Livro;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AvaliacaoIdentity implements Serializable {

    @ManyToOne
    @NotNull
    private Leitor leitor;

    @ManyToOne
    @NotNull
    private Livro livro;

    //Opcional, caso nao tenha apenas saira um warn
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AvaliacaoIdentity that = (AvaliacaoIdentity) o;
        return leitor.equals(that.leitor) &&
                livro.equals(that.livro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(leitor, livro);
    }
}
