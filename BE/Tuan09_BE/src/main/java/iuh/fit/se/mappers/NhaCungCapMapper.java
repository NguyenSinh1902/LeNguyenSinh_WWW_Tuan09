package iuh.fit.se.mappers;

import iuh.fit.se.dtos.NhaCungCapDTO;
import iuh.fit.se.entities.NhaCungCap;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface NhaCungCapMapper {
    NhaCungCapDTO toDTO(NhaCungCap entity);
    NhaCungCap toEntity(NhaCungCapDTO dto);
}
