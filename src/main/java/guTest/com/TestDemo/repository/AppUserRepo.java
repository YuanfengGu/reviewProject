package guTest.com.TestDemo.repository;


import guTest.com.TestDemo.models.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepo extends JpaRepository<AppUser,Integer> {

    AppUser findByEmail(String email);



}
