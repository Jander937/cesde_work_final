package com.example.propuestacultura.models;


import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name="representantes")
public class Representante {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id_representante;

    @ManyToOne
    @JoinColumn(name="id_tipo_documento", referencedColumnName = "id_tipo_documento")
    private TipoDocumento tipo_documento;

    @Column(name = "numero_documento")
    private String numero_documento;

    @Column(name = "primer_nombre")
    private String primer_nombre;

    @Column(name = "primer_apellido")
    private String primer_apellido;

    @Column(name = "telefono_fijo")
    private String telefono_fijo;

    @Column(name = "telefono_celular")
    private String telefono_celular;

    @Column(name="correo")
    private String correo;

    @Column(name="estado", columnDefinition = "TINYINT")
    private Boolean status;

    @Column(name="password")
    private String password;

    @ManyToOne
    @JoinColumn(name="tbl_tipos_usuarios", referencedColumnName = "id")
    private TiposUsuarios tiposUsuarios;

    public Representante() {
    }

    public Representante(UUID id_representante, TipoDocumento tipo_documento, String numero_documento, String primer_nombre, String primer_apellido, String telefono_fijo, String telefono_celular, String correo, Boolean status, String password, TiposUsuarios tiposUsuarios) {
        this.id_representante = id_representante;
        this.tipo_documento = tipo_documento;
        this.numero_documento = numero_documento;
        this.primer_nombre = primer_nombre;
        this.primer_apellido = primer_apellido;
        this.telefono_fijo = telefono_fijo;
        this.telefono_celular = telefono_celular;
        this.correo = correo;
        this.status = status;
        this.password = password;
        this.tiposUsuarios = tiposUsuarios;
    }

    public UUID getId_representante() {
        return id_representante;
    }

    public void setId_representante(UUID id_representante) {
        this.id_representante = id_representante;
    }

    public TipoDocumento getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(TipoDocumento tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(String numero_documento) {
        this.numero_documento = numero_documento;
    }

    public String getPrimer_nombre() {
        return primer_nombre;
    }

    public void setPrimer_nombre(String primer_nombre) {
        this.primer_nombre = primer_nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getTelefono_fijo() {
        return telefono_fijo;
    }

    public void setTelefono_fijo(String telefono_fijo) {
        this.telefono_fijo = telefono_fijo;
    }

    public String getTelefono_celular() {
        return telefono_celular;
    }

    public void setTelefono_celular(String telefono_celular) {
        this.telefono_celular = telefono_celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public TiposUsuarios getTiposUsuarios() {
        return tiposUsuarios;
    }

    public void setTiposUsuarios(TiposUsuarios tiposUsuarios) {
        this.tiposUsuarios = tiposUsuarios;
    }
}