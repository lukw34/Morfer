package uek.dev.morfer.result.services;


import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Scanner;

@Service("fileService")
public class FileServiceImpl implements FileService {
    @Override
    public String readFile(MultipartFile file) {
        StringBuilder stringBuilder = new StringBuilder();
        String result = "";
        try {
            new Scanner(file.getInputStream(), "UTF-8").forEachRemaining(val -> {
                stringBuilder.append(val);
                stringBuilder.append(" ");
            });
            result = stringBuilder.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
