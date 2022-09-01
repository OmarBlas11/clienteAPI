package eval.gestsist.cliente.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import eval.gestsist.cliente.modelo.Cliente;
import eval.gestsist.cliente.servicio.ClienteServicio;

@RestController
public class ClienteControlador {
	@Autowired
	private ClienteServicio servicio;

	@GetMapping("/clientes")
	public List<Cliente> ListarClientes() {
		return servicio.listarClientes();
	}

	@GetMapping("/clientes/{Codigo}")
	public ResponseEntity<Cliente> ObtenerClientePorId(@PathVariable String Codigo) {
		try {
			Cliente cliente = servicio.obtenerclienteporid(Codigo);
			return new ResponseEntity<Cliente>(cliente, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<Cliente>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/clientes")
	public void guardarproductos(@RequestBody Cliente cliente) {
		servicio.GuardarClientes(cliente);
	}

	@PutMapping("/clientes/{codigo}")
	public ResponseEntity<?> actualizarproducto(@RequestBody Cliente cliente, @PathVariable String Codigo) {
		try {
			Cliente ClienteExistente = servicio.obtenerclienteporid(Codigo);
			servicio.GuardarClientes(cliente);
			return new ResponseEntity<Cliente>(HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<Cliente>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/clientes/{codigo}")
	public void eliminarclientes(@PathVariable String Codigo) {
		servicio.elimsinarcliente(Codigo);
	}
}
