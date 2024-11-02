package pe.edu.utp.API_CServicios.Cliente;

import jakarta.persistence.*;

import java.security.PrivateKey;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Cliente {
    @Id
    @SequenceGenerator(
            name = "cliente_secuencia",
            sequenceName = "cliente_secuencia",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "cliente_secuencia"
    )
    @Column(
            name = "id"
    )
    private Long idCliente;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String direccion;
    private LocalDate fechaNacimiento;
    @Transient
    private int edad;


    public Cliente() {
    }

    public Cliente(Long idCliente, String nombre, String apellido, String telefono, String correo, String direccion, LocalDate fechaNacimiento, int edad) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
    }

    public Cliente(String nombre, String apellido, String telefono, String correo, String direccion, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }



    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        if (
                this.fechaNacimiento == null
        ) {
            return 0;
        }
        return Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                ", direccion='" + direccion + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", edad=" + edad +
                '}';
    }

}
