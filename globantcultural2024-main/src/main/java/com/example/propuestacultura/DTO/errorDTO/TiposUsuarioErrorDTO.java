package com.example.propuestacultura.DTO.errorDTO;

public class TiposUsuarioErrorDTO {
    private String mensajeError;

    public TiposUsuarioErrorDTO() {
    }

    public TiposUsuarioErrorDTO(String mensajeError) {
        this.mensajeError = mensajeError;
    }

    public String getMensajeError() {
        return mensajeError;
    }

    public void setMensajeError(String mensajeError) {
        this.mensajeError = mensajeError;
    }
}
