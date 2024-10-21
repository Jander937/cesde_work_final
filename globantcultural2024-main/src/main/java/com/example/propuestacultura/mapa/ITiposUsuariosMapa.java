package com.example.propuestacultura.mapa;

import com.example.propuestacultura.DTO.TipoProponenteDTO;
import com.example.propuestacultura.DTO.TiposUsuariosDTO;
import com.example.propuestacultura.models.TipoProponente;
import com.example.propuestacultura.models.TiposUsuarios;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ITiposUsuariosMapa {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source="name",target="name")
    })
    TiposUsuariosDTO tipousuarioToDTO(TiposUsuarios tiposUsuarios);

    List<TiposUsuariosDTO> toDtoList(List<TiposUsuarios> tiposUsuarios);
}
