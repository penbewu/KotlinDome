package com.example.kotlindome.bean;

import java.io.Serializable;
import java.util.List;

/**
 * 开发者   biwu
 * 创建时间 2021/9/4
 * 描述
 */
public class MovieBean implements Serializable {


    /**
     * reason : 查询成功!
     * result : [{"title":"宁波黑坑水库盘老板，看看最后的渔获在你们那里能值多少钱。 #钓鱼  #dou来钓鱼516","share_url":"https://www.iesdouyin.com/share/video/6960674964378897677/?region=CN&mid=6960676544603851533&u_code=0&titleType=title&did=MS4wLjABAAAANwkJuWIRFOzg5uCpDRpMj4OX-QryoDgn-yYlXQnRwQQ&iid=MS4wLjABAAAANwkJuWIRFOzg5uCpDRpMj4OX-QryoDgn-yYlXQnRwQQ&with_sec_did=1","author":"天元邓刚","item_cover":"https://p6.douyinpic.com/img/tos-cn-p-0015/cd3cd955c1ec40d8a346c7fc652db36f~c5_300x400.jpeg?from=2563711402_large","hot_value":188721410,"hot_words":"老板,最后的,钓鱼,宁波,黑坑,水库,看看,渔获,你们,那里,能值,多少,dou,516","play_count":303819638,"digg_count":2209478,"comment_count":97122}]
     * error_code : 0
     */

    private String reason;
    private int error_code;
    private List<ResultBean> result;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * title : 宁波黑坑水库盘老板，看看最后的渔获在你们那里能值多少钱。 #钓鱼  #dou来钓鱼516
         * share_url : https://www.iesdouyin.com/share/video/6960674964378897677/?region=CN&mid=6960676544603851533&u_code=0&titleType=title&did=MS4wLjABAAAANwkJuWIRFOzg5uCpDRpMj4OX-QryoDgn-yYlXQnRwQQ&iid=MS4wLjABAAAANwkJuWIRFOzg5uCpDRpMj4OX-QryoDgn-yYlXQnRwQQ&with_sec_did=1
         * author : 天元邓刚
         * item_cover : https://p6.douyinpic.com/img/tos-cn-p-0015/cd3cd955c1ec40d8a346c7fc652db36f~c5_300x400.jpeg?from=2563711402_large
         * hot_value : 188721410
         * hot_words : 老板,最后的,钓鱼,宁波,黑坑,水库,看看,渔获,你们,那里,能值,多少,dou,516
         * play_count : 303819638
         * digg_count : 2209478
         * comment_count : 97122
         */

        private String title;
        private String share_url;
        private String author;
        private String item_cover;
        private int hot_value;
        private String hot_words;
        private int play_count;
        private int digg_count;
        private int comment_count;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getShare_url() {
            return share_url;
        }

        public void setShare_url(String share_url) {
            this.share_url = share_url;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getItem_cover() {
            return item_cover;
        }

        public void setItem_cover(String item_cover) {
            this.item_cover = item_cover;
        }

        public int getHot_value() {
            return hot_value;
        }

        public void setHot_value(int hot_value) {
            this.hot_value = hot_value;
        }

        public String getHot_words() {
            return hot_words;
        }

        public void setHot_words(String hot_words) {
            this.hot_words = hot_words;
        }

        public int getPlay_count() {
            return play_count;
        }

        public void setPlay_count(int play_count) {
            this.play_count = play_count;
        }

        public int getDigg_count() {
            return digg_count;
        }

        public void setDigg_count(int digg_count) {
            this.digg_count = digg_count;
        }

        public int getComment_count() {
            return comment_count;
        }

        public void setComment_count(int comment_count) {
            this.comment_count = comment_count;
        }
    }
}
