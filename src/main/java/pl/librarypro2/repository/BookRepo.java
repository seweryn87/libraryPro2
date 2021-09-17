package pl.librarypro2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.librarypro2.model.Book;

import java.util.Optional;

public interface BookRepo extends JpaRepository<Book, Long> {

    void deleteBookById(Long id);

    Optional<Book> findBookById(Long id);

}
