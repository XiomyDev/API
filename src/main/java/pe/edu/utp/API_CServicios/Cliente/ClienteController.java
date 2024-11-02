package pe.edu.utp.API_CServicios.Cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(
        path = "apicliente"
)
public class ClienteController {
    private final ClienteService clienteService;

    @Autowired
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public List<Cliente> listar() {
        return clienteService.listar();
    }

    @PutMapping(path = "{id}")
    public void actualizar(@PathVariable int id,
                           @RequestParam(required = false) String nombre,
                           @RequestParam(required = false) String correo) {
        clienteService.updateCliente(id, nombre, correo);
    }

    @PostMapping
    public void crear(@RequestBody Cliente cliente) {
        clienteService.guardar(cliente);
    }

    @DeleteMapping(
            path = "{id}"
    )
    public void eliminar(@PathVariable("id") int id) {
        clienteService.eliminar(id);
    }


}
