package eval.gestsist.cliente.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eval.gestsist.cliente.modelo.Cliente;
import eval.gestsist.cliente.repositorio.ClienteRepositorio;



@Service
public class ClienteServicio {
	@Autowired
	private ClienteRepositorio repositorio;
	
	public List<Cliente> listarClientes(){
		return repositorio.findAll();
	}
	public void GuardarClientes(Cliente cliente) {
		repositorio.save(cliente);
	}
	public Cliente obtenerclienteporid(String Codigo) {
		return repositorio.findById(Codigo).get();
	}
	
	public void elimsinarcliente(String Codigo) {
		repositorio.deleteById(Codigo);
	}
}
