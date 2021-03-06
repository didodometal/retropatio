package br.com.retropatio.business;

import java.text.ParseException;

import javax.inject.Inject;

import br.com.retropatio.architecture.ValidationSession;
import br.com.retropatio.dao.MotoristaDao;
import br.com.retropatio.entity.Motorista;


public class MotoristaBusiness extends ValidationSession{

	private static final long serialVersionUID = 1L;
	@Inject private MotoristaDao motoristaDao; 
	
	protected void cadastrarMotorista(Motorista motorista) throws ParseException, Exception{
			motoristaDao.inserirMotorista(motorista);
	}
	
	protected void alterarMotorista(Motorista motorista) throws ParseException, Exception{
			motoristaDao.alterarMotorista(motorista);
	}
	
	protected void deletarMotorista(Long id) throws ParseException, Exception{
			motoristaDao.deletarMotorista(motoristaDao.buscarMotoristaPorId(id));
	}
	
	protected Motorista verMotorista(Long id) throws ParseException{
			return motoristaDao.buscarMotoristaPorId(id);
	}
}