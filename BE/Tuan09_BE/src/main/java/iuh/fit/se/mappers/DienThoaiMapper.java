package iuh.fit.se.mappers;


import iuh.fit.se.dtos.DienThoaiDTO;
import iuh.fit.se.entities.DienThoai;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface DienThoaiMapper {

    @Mapping(source = "nhaCungCap.maNCC", target = "maNCC")
    @Mapping(source = "nhaCungCap.tenNhaCC", target = "tenNhaCC")
    DienThoaiDTO toDTO(DienThoai entity);

    @InheritInverseConfiguration
    DienThoai toEntity(DienThoaiDTO dto);
}
