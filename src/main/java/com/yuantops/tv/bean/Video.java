package com.yuantops.tv.bean;

/**
 * Created by yy102317 on 2015/8/27.
 * POJO for video item
 */
public class Video {
    private int    id;             //id in database
    private String videoNameEn;    //英文名
    private String videoNameCn;    //中文名
    private String introduction;   //剧情介绍
    private String releaseDate;    //上映日期
    private String runtime;        //时长
    private String genre;          //类别:喜剧，爱情，动作……
    private int    playedTimes;    //播放次数

    private String posterUrl;      //海报图片链接
    private String highDefiUrl;    //高清链接
    private String standardDefiUrl;//标清链接
    private String superDefiUrl;   //超清链接
    private String broadcastUrl;   //直播链接

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVideoNameEn() {
        return videoNameEn;
    }

    public void setVideoNameEn(String videoNameEn) {
        this.videoNameEn = videoNameEn;
    }

    public String getVideoNameCn() {
        return videoNameCn;
    }

    public void setVideoNameCn(String videoNameCn) {
        this.videoNameCn = videoNameCn;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPlayedTimes() {
        return playedTimes;
    }

    public void setPlayedTimes(int playedTimes) {
        this.playedTimes = playedTimes;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    public String getHighDefiUrl() {
        return highDefiUrl;
    }

    public void setHighDefiUrl(String highDefiUrl) {
        this.highDefiUrl = highDefiUrl;
    }

    public String getStandardDefiUrl() {
        return standardDefiUrl;
    }

    public void setStandardDefiUrl(String standardDefiUrl) {
        this.standardDefiUrl = standardDefiUrl;
    }

    public String getSuperDefiUrl() {
        return superDefiUrl;
    }

    public void setSuperDefiUrl(String superDefiUrl) {
        this.superDefiUrl = superDefiUrl;
    }

    public String getBroadcastUrl() {
        return broadcastUrl;
    }

    public void setBroadcastUrl(String broadcastUrl) {
        this.broadcastUrl = broadcastUrl;
    }
}
