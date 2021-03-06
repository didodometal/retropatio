package br.com.retropatio.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.retropatio.utilities.Utilities;

@Entity
public class Entrada {

	@Id @GeneratedValue
	private Long id;

	@OneToOne
	private Motorista motorista;
	
	@OneToOne
	private Caminhao caminhao;
	
	@OneToOne
	private Container container;
	
	@OneToOne
	private Quadra quadra;
	
	@OneToOne
	private Empresa empresa;
	
	private Date dataEntrada;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Motorista getMotorista() {
		return motorista;
	}

	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}

	public Caminhao getCaminhao() {
		return caminhao;
	}

	public void setCaminhao(Caminhao caminhao) {
		this.caminhao = caminhao;
	}

	public Container getContainer() {
		return container;
	}

	public void setContainer(Container container) {
		this.container = container;
	}

	public Quadra getQuadra() {
		return quadra;
	}

	public void setQuadra(Quadra quadra) {
		this.quadra = quadra;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public String getDataEntrada() {
		return Utilities.converteDataToString(dataEntrada);
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	
}
