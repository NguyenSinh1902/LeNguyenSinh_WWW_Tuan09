package iuh.fit.se.services;

import iuh.fit.se.dtos.NhaCungCapDTO;

import java.util.List;

public interface NhaCungCapService {
    List<NhaCungCapDTO> findAll();
    List<NhaCungCapDTO> search(String keyword);
    NhaCungCapDTO findById(String id);
}