package pe.edu.utp.API_CServicios.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    @Query("select e from Cliente e WHERE e.correo=:correo")
    Optional<Cliente> findByCorreo(String correo);
}
