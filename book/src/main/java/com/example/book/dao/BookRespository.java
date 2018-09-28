package com.example.book.dao;

import com.example.book.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRespository extends JpaRepository<Book, Integer> {
    // 必须有的两个：可持续化主类和唯一标识符
}
