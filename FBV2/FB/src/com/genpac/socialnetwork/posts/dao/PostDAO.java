package com.genpac.socialnetwork.posts.dao;

import java.util.Date;

import com.genpac.socialnetwork.posts.dto.MediaPostDTO;
import com.genpac.socialnetwork.posts.dto.PostDTO;

public class PostDAO {

	public PostDTO[] getAllPost(){
		PostDTO postDTO = new PostDTO();
		postDTO.setLikes(10);
		postDTO.setMessage("Hello");
		postDTO.setUserid("ram");
		postDTO.setPostDate(new Date());
		MediaPostDTO mediaPost = new MediaPostDTO();
		mediaPost.setLikes(10);
		mediaPost.setMessage("Hi");
		mediaPost.setUserid("shyam");
		mediaPost.setPostDate(new Date());
		mediaPost.setUrl("http://www.xyz.com");
		PostDTO [] postArray = {postDTO,mediaPost};
		return postArray;
	}
	
}
