package codeclan.files_and_folders.Files_and_folders.repositories;

import codeclan.files_and_folders.Files_and_folders.models.Folder;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
