package com.h2t.study.po;


/**
 * 点赞中间表实体类
 *
 * @author hetiantian
 * @since 2019-10-08
 */
public class UserLikeArticle extends BasePO {
    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 文章ID
     */
    private Long articleId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }
}
