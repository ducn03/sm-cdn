package com.sm.jpa.repository;

import com.sm.jpa.domain.CDN;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CdnRepository extends JpaRepository<CDN, Long> {
}
