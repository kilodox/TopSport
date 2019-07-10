package com.epam.topsport.model.repositories;

import com.epam.topsport.model.pojos.Comment;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment, Integer> {
}
