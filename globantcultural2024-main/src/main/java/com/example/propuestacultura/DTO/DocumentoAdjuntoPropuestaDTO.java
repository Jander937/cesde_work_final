package com.example.propuestacultura.DTO;

import com.example.propuestacultura.models.DocumentosAdjuntos;
import com.example.propuestacultura.models.Propuesta;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;


public class DocumentoAdjuntoPropuestaDTO {

    private UUID propuesta;

    private Integer documentosAdjuntos;

    public DocumentoAdjuntoPropuestaDTO() {
    }

    public DocumentoAdjuntoPropuestaDTO(UUID propuesta, Integer documentosAdjuntos) {
        this.propuesta = propuesta;
        this.documentosAdjuntos = documentosAdjuntos;
    }

    public UUID getPropuesta() {
        return propuesta;
    }

    public void setPropuesta(UUID propuesta) {
        this.propuesta = propuesta;
    }

    public Integer getDocumentosAdjuntos() {
        return documentosAdjuntos;
    }

    public void setDocumentosAdjuntos(Integer documentosAdjuntos) {
        this.documentosAdjuntos = documentosAdjuntos;
    }
}
