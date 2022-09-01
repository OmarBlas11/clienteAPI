package eval.gestsist.cliente.repositorio;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eval.gestsist.cliente.modelo.Cliente;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, String>{
	 //Optional<Cliente> findByCodigo(String Codigo);
}
