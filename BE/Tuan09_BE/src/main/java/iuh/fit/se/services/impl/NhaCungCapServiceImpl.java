package iuh.fit.se.services.impl;

import iuh.fit.se.dtos.NhaCungCapDTO;
import iuh.fit.se.mappers.NhaCungCapMapper;
import iuh.fit.se.repositories.NhaCungCapRepository;
import iuh.fit.se.services.NhaCungCapService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class NhaCungCapServiceImpl implements NhaCungCapService {

    private final NhaCungCapRepository repo;
    private final NhaCungCapMapper mapper;

    public NhaCungCapServiceImpl(NhaCungCapRepository repo, NhaCungCapMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    @Override
    public List<NhaCungCapDTO> findAll() {
        return repo.findAll().stream().map(mapper::toDTO).collect(Collectors.toList());
    }

    @Override
    public List<NhaCungCapDTO> search(String keyword) {
        return repo.findByMaNCCContainingOrTenNhaCCContainingOrDiaChiContainingOrSoDienThoaiContaining(
                        keyword, keyword, keyword, keyword)
                .stream().map(mapper::toDTO).collect(Collectors.toList());
    }

    @Override
    public NhaCungCapDTO findById(String id) {
        return repo.findById(id).map(mapper::toDTO).orElse(null);
    }
}

