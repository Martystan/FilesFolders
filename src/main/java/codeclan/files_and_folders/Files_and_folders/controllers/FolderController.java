package codeclan.files_and_folders.Files_and_folders.controllers;

import codeclan.files_and_folders.Files_and_folders.models.Folder;
import codeclan.files_and_folders.Files_and_folders.models.User;
import codeclan.files_and_folders.Files_and_folders.repositories.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FolderController {
    @Autowired
    FolderRepository folderRepository;


    @GetMapping(value = "/folders")
    public ResponseEntity<List<Folder>> getAllFolders() {
        return new ResponseEntity<>(folderRepository.findAll(), HttpStatus.OK);

    }
}
