package com.epam.topsport.model.repositories;

import com.epam.topsport.model.Comment;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment, Integer> {
}
