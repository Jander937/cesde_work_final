package com.example.propuestacultura.mapa;

import com.example.propuestacultura.DTO.PropuestaDTO;
import com.example.propuestacultura.DTO.RepresentanteDTO;
import com.example.propuestacultura.models.Propuesta;
import com.example.propuestacultura.models.Representante;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IRepresentanteMapa {

    @Mappings({
            @Mapping(source="tipo_documento.id_tipo_documento", target="tipo_documento"),
            @Mapping(source="tiposUsuarios", target="tiposUsuarios"),
            @Mapping(source="correo", target="correo"),
            @Mapping(source="telefono_celular", target="telefono_celular"),
            @Mapping(source="telefono_fijo", target="telefono_fijo"),
            @Mapping(source="primer_nombre", target="primer_nombre"),
            @Mapping(source="primer_apellido", target="primer_apellido"),
            @Mapping(source="numero_documento", target="numero_documento"),
            @Mapping(source="status", target="status"),
            @Mapping(source="password", target="password"),

    })
    RepresentanteDTO representanteToDTO(Representante representante);

    List<RepresentanteDTO> toDtoList(List<Representante> representanteList);
}
