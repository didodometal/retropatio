package br.com.retropatio.session;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.com.retropatio.entity.Empresa;
import br.com.retropatio.entity.Perfil;
import br.com.retropatio.entity.Usuario;

@SessionScoped
@Named("sessaoLogada")
public class UsuarioLogado implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Usuario usuarioLogado;
		
	public void logar(Usuario usuario ){
		this.usuarioLogado = usuario;
	}
	
	public boolean isLogado(){
		return usuarioLogado != null;
	}
	
	public void deslogar(){
		this.usuarioLogado = null;
	}
	
	public Long getIdPerfil(){
		return this.usuarioLogado.getPerfil().getId();
	}
	
	public Perfil getPerfil(){
		return this.usuarioLogado.getPerfil();
	}
	
	public String getNome(){
		return this.usuarioLogado.getPessoa().getNome();
	}
	
	public Long getIdUsuarioLogado(){
		return this.usuarioLogado.getId();
	}
	
	public Usuario getUsuario(){
		return this.usuarioLogado;
	}
	
	public Empresa getEmpresa(){
		return this.usuarioLogado.getEmpresa();
	}
	
	public Long getIdEmpresa(){
		return this.usuarioLogado.getEmpresa().getId();
	}

	public Usuario getUsuarioLogado() {
		return usuarioLogado;
	}

	public void setUsuarioLogado(Usuario usuarioLogado) {
		this.usuarioLogado = usuarioLogado;
	}

}
