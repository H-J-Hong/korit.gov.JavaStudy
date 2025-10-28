package _22_Bean;

/*
 * 게시물 엔티티
 * 게시물 아이디
 * 게시물 제목
 * 게시물 내용
 * 작성자 아이디
 * 작성자 닉네임
 * 생성시각
 * 수정시각
 * */

import java.time.LocalDateTime;

public class PostEntity {
    private int postId;
    private String postTitle;
    private String[] postContents;
    private int userId;
    private String userNickname;
    private LocalDateTime createDt;
    private LocalDateTime updateDt;

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String[] getPostContents() {
        return postContents;
    }

    public void setPostContents(String[] postContents) {
        this.postContents = postContents;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public LocalDateTime getCreateDt() {
        return createDt;
    }

    public void setCreateDt(LocalDateTime createDt) {
        this.createDt = createDt;
    }

    public LocalDateTime getUpdateDt() {
        return updateDt;
    }

    public void setUpdateDt(LocalDateTime updateDt) {
        this.updateDt = updateDt;
    }
}
