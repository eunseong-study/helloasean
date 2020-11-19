package com.helloasean.manage.repository;

import com.helloasean.manage.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface memberRepository extends JpaRepository<Long, Member> {
}
