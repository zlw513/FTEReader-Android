package fte.finalproject.obj;

import com.google.gson.annotations.SerializedName;

// 书籍的对象
public class BookObj {
    // 书籍id
    @SerializedName("_id")
    private String id;

    // 书籍标题
    @SerializedName("title")
    private String title;

    // 书籍作者
    @SerializedName("author")
    private String author;

    // 书籍简短介绍
    @SerializedName("shortIntro")
    private String shortIntro;

    // 书籍封面图
    @SerializedName("cover")
    private String cover;

    @SerializedName("site")
    private String site;

    // 书籍一级分类
    @SerializedName("majorCate")
    private String majorCate;

    // 书籍二级分类
    @SerializedName("minorCate")
    private String minorCate;

    @SerializedName("sizetype")
    private int sizetype;

    @SerializedName("contentType")
    private String contentType;

    @SerializedName("allowMonthly")
    private boolean allowMonthly;

    @SerializedName("banned")
    private int banned;

    // 最近关注人数
    @SerializedName("latelyFollower")
    private int latelyFollower;

    // 留存率
    @SerializedName("retentionRatio")
    private float retentionRatio;

    // 最新章节
    @SerializedName("lastChapter")
    private String lastChapter;

    // 标签
    @SerializedName("tags")
    private String[] tags;

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getShortIntro() {
        return shortIntro;
    }

    public String getCover() {
        return cover;
    }

    public String getSite() {
        return site;
    }

    public String getMajorCate() {
        return majorCate;
    }

    public String getMinorCate() {
        return minorCate;
    }

    public int getSizetype() {
        return sizetype;
    }

    public String getContentType() {
        return contentType;
    }

    public boolean isAllowMonthly() {
        return allowMonthly;
    }

    public int getBanned() {
        return banned;
    }

    public int getLatelyFollower() {
        return latelyFollower;
    }

    public float getRetentionRatio() {
        return retentionRatio;
    }

    public String getLastChapter() {
        return lastChapter;
    }

    public String[] getTags() {
        return tags;
    }
}
