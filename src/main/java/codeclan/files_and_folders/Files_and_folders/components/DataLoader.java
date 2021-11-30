package codeclan.files_and_folders.Files_and_folders.components;

import codeclan.files_and_folders.Files_and_folders.models.File;
import codeclan.files_and_folders.Files_and_folders.models.Folder;
import codeclan.files_and_folders.Files_and_folders.models.User;
import codeclan.files_and_folders.Files_and_folders.repositories.FileRepository;
import codeclan.files_and_folders.Files_and_folders.repositories.FolderRepository;
import codeclan.files_and_folders.Files_and_folders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader(){}

    public void run(ApplicationArguments args){
        User user1 = new User("John Doe");
        userRepository.save(user1);

        Folder folder1 = new Folder("Something", user1);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("anything", user1);
        folderRepository.save(folder2);

        File file1 =  new File("blabla", "png", 10,folder1);
        File file2 = new File("fskfh", "txt",8, folder2);
        fileRepository.save(file1);
        fileRepository.save(file2);


        user1.addFolders(folder1);
        user1.addFolders(folder2);
        userRepository.save(user1);

        folder1.addFile(file1);
        folder2.addFile(file2);
        folderRepository.save(folder1);
        folderRepository.save(folder2);

    }


}
