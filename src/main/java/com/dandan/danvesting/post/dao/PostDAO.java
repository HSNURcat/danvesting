package com.dandan.danvesting.post.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.dandan.danvesting.post.model.Post;

@Repository
public interface PostDAO {
	public int insertPost(@Param("userId") int UserId,
			@Param("nickName") String nickName,
			@Param("postTitle") String postTitle,
			@Param("postText") String postText,
			@Param("filePath") String filePath); 

	public List<Post> getPost();
	
	public Post getPostDetail(@Param("postId") int postId);
	
	public int deletePost(@Param("postId") int postId, @Param("userId") int userId);
	
	public int getPostAuthor(@Param("postId") int postId, 
			@Param("userId") int userId);

	public int updatePost(@Param("postId") int postId, 
			@Param("userId") int userId,
			@Param("postTitle") String postTitle,
			@Param("postText") String postText);
	
	public int updatePostWithFile(@Param("postId") int postId, 
			@Param("userId") int userId,
			@Param("postTitle") String postTitle,
			@Param("postText") String postText,
			@Param("filePath") String filePath);
}
