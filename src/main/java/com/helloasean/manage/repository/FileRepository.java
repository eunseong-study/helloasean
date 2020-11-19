package com.helloasean.manage.repository;

import com.helloasean.manage.domain.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
