package com.example.kotlindome.bean;

import java.io.Serializable;
import java.util.List;

/**
 * 开发者   biwu
 * 创建时间 2021/9/9
 * 描述
 */
public class JokeBean implements Serializable {


    /**
     * reason : success
     * result : [{"content":"　　今天早上贴对联，老舅让我咬胶带， 　　我说不，他说，咋你还嫌弃它？ 　　我说，我怕它嫌弃我，早上起来没刷牙\u2026\u2026","hashId":"61F379493631DC3D11972C66551F9561","unixtime":1424301155},{"content":"大家都知道小孩子去打针都是哭哭啼啼的，又喊着救命啊，不要啊，什么的。。。 前两天带我小侄女去打针，她就说了这么一句话: 「放开我～你们抓错人了～！」","hashId":"0C02446518ADB26E2B1D8D37935EC9AC","unixtime":1424301739},{"content":"当一进冷笑话映入眼帘的就是右侧的四个字 冷友们你们怎么看？","hashId":"B40361F2ECECFC173D4EADB5B4589001","unixtime":1424301748},{"content":"小猫爱上了蚯蚓，后来蚯蚓死了，小猫又娶了一条蚯蚓，然后又死了，小猫又娶了一条蚯蚓，，，小猫其实挺不错的，就是爱钓鱼。。","hashId":"0FA5D936B941BAA0ABC7A324CEFC8C2B","unixtime":1424302431},{"content":"个子矮是硬伤！！每次看到\u201c小心碰头\u201d的标示就想去撕掉，真的去试了之后才发现\u2026\u2026竟然够不着\u2026\u2026\u2026","hashId":"086EEF6EC3F6875CB233BA2C407F043F","unixtime":1424302935},{"content":"我去问大师\"为什么我的段子都没法上热门呢？\" 大师沉默，取出一块黄金。 \"我知道了，大师，你是想说，只要是金子早晚会发光的，要我坚持下去吗?\" \"不是，我想说那是因为你的段子不够黄\"","hashId":"C8D8C364E0F0EB3508878F908568EF64","unixtime":1424303534},{"content":"我一同学 他家有一阿姨。应为她儿子小时候脑袋烧坏了而变成了神经 一天 同学他爸左说又骗把她带到了五医院（她阿姨不知道这是神经病院）她阿姨看见医院里那些正在唱歌跳舞的人。大笑的说了巨 这里怎么这么多神经啦！","hashId":"D1D97D3E9EC258D39C8DAA834D49C4F3","unixtime":1424303543},{"content":"我很气愤地说：化妆已经是撒谎了，化了妆还说是素颜，这是撒了谎还要骗人。 学霸女友：这样子能不能算是负负得正啊！？","hashId":"9C77ECC2A3601EC04CA2BB91B4DE2C7D","unixtime":1424303543},{"content":"羊年将至，人人对羊喜闻乐见！ 为应景，昨晚带老婆儿子去吃烤串，点了其他各类老婆儿子喜欢吃的品种，我也顺便点了两串羊蛋子。服务员刚把烤好的两串羊蛋子端上桌，我便迫不及待地拿起一串吃起来。儿子想拿另外一串，手刚伸到那，就被老婆一筷子打了下手并呵斥道：你不许吃。儿子委屈，却又不敢吱声，看着我吃地那叫一个香啊！憋不住问了一句：老爸，这东西有营养吗？我不假思索地回答：有，壮阳。老婆恶狠狠地瞪了我一眼，我才反应过来，拿纸巾边抹嘴巴边感慨道：好壮、好壮的羊啊\u2026\u2026！","hashId":"86DD03389F62388CE30DCBCB3A95522C","unixtime":1424304171},{"content":"老婆总化妆，一天素颜，正赶上朋友来玩。。。。不说了，朋友刚刚被医生用电击唤醒，我去安慰一下。。。","hashId":"4278709B23F361AC1DD3B9523A2F352B","unixtime":1424304181}]
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
         * content : 　　今天早上贴对联，老舅让我咬胶带， 　　我说不，他说，咋你还嫌弃它？ 　　我说，我怕它嫌弃我，早上起来没刷牙……
         * hashId : 61F379493631DC3D11972C66551F9561
         * unixtime : 1424301155
         */

        private String content;
        private String hashId;
        private int unixtime;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getHashId() {
            return hashId;
        }

        public void setHashId(String hashId) {
            this.hashId = hashId;
        }

        public int getUnixtime() {
            return unixtime;
        }

        public void setUnixtime(int unixtime) {
            this.unixtime = unixtime;
        }
    }
}
