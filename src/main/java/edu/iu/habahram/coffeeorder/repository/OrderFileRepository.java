package edu.iu.habahram.coffeeorder.repository;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Component
public class OrderFileRepository {
    private String IMAGES_FOLDER_PATH = "flowers/images/";

    public byte[] getImage(int id) throws IOException {
        String fileExtension = ".jpg";
        Path path = Paths.get(IMAGES_FOLDER_PATH + id + fileExtension);
        byte[] image = Files.readAllBytes(path);
        return image;
    }
}
