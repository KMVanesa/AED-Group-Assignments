/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.analytics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lab7.entities.Comment;
import lab7.entities.Post;
import lab7.entities.User;

/**
 *
 * @author harshalneelkamal
 */
public class AnalysisHelper {
    // find user with Most Likes
    //  key: UserId ; Value: sum of likes from all comments
    public void userWithMostLikes() {
        Map<Integer, Integer> userLikesCount = new HashMap<>();
        Map<Integer, User> users = DataStore.getInstance().getUsers();
    
        for (User user : users.values()) {
            for (Comment c : user.getComments()) {
                int likes = 0;
                if (userLikesCount.containsKey(user.getId())) {
                    likes = userLikesCount.get(user.getId());
                }
                likes += c.getLikes();
                userLikesCount.put(user.getId(), likes);
            }
        }
        int max = 0;
        int maxId = 0;
        for (int id : userLikesCount.keySet()) {
            if (userLikesCount.get(id) > max) {
                max = userLikesCount.get(id);
                maxId = id;
            }
        }
        System.out.println("User with most likes: " + max + "\n" 
            + users.get(maxId));
    }
    
    // find 5 comments which have the most likes
    public void getFiveMostLikedComment() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        List<Comment> commentList = new ArrayList<>(comments.values());
        
        Collections.sort(commentList, new Comparator<Comment>() {
            @Override 
            public int compare(Comment o1, Comment o2) {
                return o2.getLikes() - o1.getLikes();
            }
        });
        
        System.out.println("5 most likes comments: ");
        for (int i = 0; i < commentList.size() && i < 5; i++) {
            System.out.println(commentList.get(i));
        }
    }
    
    
    //average number of likes per comments:
    
    public void getavglikespercomments(){
        Map<Integer, Integer> userLikesCount = new HashMap<>();
         Map<Integer, User> users = DataStore.getInstance().getUsers();
         
         int totalComments = 0;
         
          for (User user : users.values()) {
            for (Comment c : user.getComments()) {
                totalComments++;
                int likes = 0;
                if (userLikesCount.containsKey(user.getId())) {
                    likes = userLikesCount.get(user.getId());
                }
                likes += c.getLikes();
                userLikesCount.put(user.getId(), likes);
            }
        }
        
     int totalLikes = 0;
        for (int id : userLikesCount.keySet()) {

            totalLikes += userLikesCount.get(id);

        }
        System.out.println(totalComments);
        System.out.println(totalLikes);
        System.out.println("Average number of likes per comments=" + totalLikes / totalComments);

    }
     public void getmostLikedComment() {
      Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        List<Comment> commentList = new ArrayList<>(comments.values());
        
        Collections.sort(commentList, new Comparator<Comment>() {
            @Override 
            public int compare(Comment o1, Comment o2) {
                return o2.getLikes() - o1.getLikes();
            }
        });
        
        System.out.println("Post with most liked comment: ");
      
            System.out.println(commentList.get(0));
     }
     
        // the post with most comments
      public void postWithMostComments() {
         Map<Integer, Integer> userPost = new HashMap<>();
         Map<Integer, Post> posts = DataStore.getInstance().getPosts();
         
         
         
         for (Post post : posts.values()) {
            for (Comment c : post.getComments()) {
                
                int Comment = 0;
                
                if (userPost.containsKey(post.getPostId())) {
                    Comment = userPost.get(post.getPostId());
                }
                Comment += post.getPostId();
                userPost.put(post.getPostId(), Comment);
            }
        }
        int max = 0;
        int maxId = 0;
        for (int id : userPost.keySet()) {
            if (userPost.get(id) > max) {
                max = userPost.get(id);
                maxId = id;
            }
        }
        int a=posts.get(maxId).getUserId();
        
        System.out.println("Post with most Comments: " + max+" Post ID is :" +posts.get(maxId).getPostId());
    }
}

