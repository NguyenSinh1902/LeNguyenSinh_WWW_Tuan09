package iuh.fit.se.controllers;

import iuh.fit.se.dtos.NhaCungCapDTO;
import iuh.fit.se.services.NhaCungCapService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/nhacungcap")
@CrossOrigin(origins = "*")
public class NhaCungCapController {

    private final NhaCungCapService service;

    public NhaCungCapController(NhaCungCapService service) {
        this.service = service;
    }

    @GetMapping
    public List<NhaCungCapDTO> getAll(@RequestParam(value = "keyword", required = false) String keyword) {
        if (keyword != null && !keyword.isEmpty())
            return service.search(keyword);
        return service.findAll();
    }

    @GetMapping("/{id}")
    public NhaCungCapDTO getById(@PathVariable String id) {
        return service.findById(id);
    }
}
