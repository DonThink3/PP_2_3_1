package ru.mine.reposetories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mine.model.User;

@Repository
public interface UsersReposetories extends JpaRepository<User, Integer> {
}
