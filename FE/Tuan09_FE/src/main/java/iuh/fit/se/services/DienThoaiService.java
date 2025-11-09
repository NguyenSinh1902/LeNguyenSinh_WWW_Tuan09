package iuh.fit.se.services;

import iuh.fit.se.entities.DienThoai;
import java.util.List;

public interface DienThoaiService {
    List<DienThoai> findAll();
    void delete(String id);
    void save(DienThoai dienThoai);
}
