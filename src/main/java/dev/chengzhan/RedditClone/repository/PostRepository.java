package dev.chengzhan.RedditClone.repository;

import dev.chengzhan.RedditClone.model.Post;
import dev.chengzhan.RedditClone.model.Subreddit;
import dev.chengzhan.RedditClone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
