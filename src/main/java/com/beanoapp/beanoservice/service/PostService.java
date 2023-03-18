package com.beanoapp.beanoservice.service;

import java.util.List;

import com.beanoapp.beanoservice.model.Post;

public interface PostService {

	Post addPost(Post post) throws Exception;

	List<Post> getPost();

}
