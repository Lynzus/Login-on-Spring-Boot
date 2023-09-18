package com.example.Login.Repository;

import com.example.Login.Model.user;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface loginRepository extends JpaRepository<user,Long> {

}
