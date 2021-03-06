package br.edu.utfpr.cp.espjava.crudcidades.cidade;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public final class Cidade {

    @NotBlank(message = "{app.cidade.blank}")
    @Size(min = 5, max = 60, message = "{app.cidade.size}")
    private final String nome;

    @NotBlank(message="{app.estado.blank}")
    @Size(min=2, max=2, message="{app.estado.size}")
    private final String estado;

    public Cidade(final String nome, final String estado) {
        this.nome = nome;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public String getNome() {
        return nome;
    }
    public CidadeEntity clonar(){
        var cidadeEntity = new CidadeEntity();
        cidadeEntity.setNome(this.getNome());
        cidadeEntity.setEstado(this.getEstado());
        return cidadeEntity;
    }

    public Cidade clonar(CidadeEntity cidade){
        return new Cidade(cidade.getNome(), cidade.getEstado());
    }
}
