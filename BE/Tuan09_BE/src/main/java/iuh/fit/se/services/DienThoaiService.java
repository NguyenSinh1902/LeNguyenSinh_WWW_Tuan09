package iuh.fit.se.services;

import iuh.fit.se.dtos.DienThoaiDTO;

import java.util.List;

public interface DienThoaiService {
    List<DienThoaiDTO> findAll();
    List<DienThoaiDTO> findByNCC(String maNCC);
    DienThoaiDTO findById(String id);
    DienThoaiDTO save(DienThoaiDTO dto);
    void delete(String id);
}
