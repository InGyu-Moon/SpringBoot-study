package org.example.springbootjpaupload.data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardDaoInter extends JpaRepository<BoardDto, Long> {
}
