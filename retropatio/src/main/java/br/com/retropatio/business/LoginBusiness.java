package br.com.retropatio.business;

import java.security.NoSuchAlgorithmException;
import java.text.ParseException;

import br.com.retropatio.entity.Usuario;

public class LoginBusiness extends UsuarioBusiness {

	private static final long serialVersionUID = 1L;

	protected boolean efetuaAutenticacao(Usuario usuario) throws NoSuchAlgorithmException, ParseException, IllegalArgumentException, IllegalAccessException{
		return efetuarAutenticacao(usuario);
	}

}