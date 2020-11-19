package com.helloasean.manage.repository;

import com.helloasean.manage.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface boardRepository extends JpaRepository<Long, Board> {
}
