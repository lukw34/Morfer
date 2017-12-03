package uek.dev.morfer.result.services;


import org.springframework.web.multipart.MultipartFile;

public interface FileService {
    String readFile(MultipartFile file);
}