package com.kodilla.uploading_app.repository;

import com.kodilla.uploading_app.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    @Override
    User save(User user);

    @Override
    long count();

    Optional<User> findByLastName(String lastName);

    @Override
    void deleteById(Long id);

    @Override
    void deleteAll();

    @Query(nativeQuery = true)
    List<User> retrieveUsersSortedAccordingAge();

    @Query(nativeQuery = true)
    List<User> retrieveTheOldestUserWithPhoneNo();


}
