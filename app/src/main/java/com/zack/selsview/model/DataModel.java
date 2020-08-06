package com.zack.selsview.model;

import com.google.gson.Gson;
import com.zack.selsview.itf.ISelect;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class DataModel {
    public static DataModel getInstance() {
        return new Gson().fromJson("{\"data\":[{\"hasSub\":true,\"id\":200,\"parentId\":0,\"skuName\":\"舞蹈\\n舞蹈\\n舞蹈\\n\",\"subList\":[{\"hasSub\":false,\"id\":201,\"parentId\":200,\"skuName\":\"现代舞\",\"subList\":[]},{\"hasSub\":true,\"id\":202,\"parentId\":200,\"skuName\":\"民族舞\",\"subList\":[{\"hasSub\":true,\"id\":205,\"parentId\":202,\"skuName\":\"中国民族舞\",\"subList\":[{\"hasSub\":false,\"id\":207,\"parentId\":205,\"skuName\":\"藏族舞\",\"subList\":[]},{\"hasSub\":false,\"id\":208,\"parentId\":205,\"skuName\":\"傣族舞\",\"subList\":[]},{\"hasSub\":false,\"id\":209,\"parentId\":205,\"skuName\":\"蒙古舞\",\"subList\":[]},{\"hasSub\":false,\"id\":210,\"parentId\":205,\"skuName\":\"维族舞\",\"subList\":[]},{\"hasSub\":false,\"id\":211,\"parentId\":205,\"skuName\":\"朝鲜舞\",\"subList\":[]},{\"hasSub\":false,\"id\":212,\"parentId\":205,\"skuName\":\"汉族舞\",\"subList\":[]}]},{\"hasSub\":true,\"id\":206,\"parentId\":202,\"skuName\":\"世界民族舞\",\"subList\":[{\"hasSub\":false,\"id\":213,\"parentId\":206,\"skuName\":\"拉丁\",\"subList\":[]},{\"hasSub\":false,\"id\":214,\"parentId\":206,\"skuName\":\"肚皮舞\",\"subList\":[]},{\"hasSub\":false,\"id\":215,\"parentId\":206,\"skuName\":\"交谊舞\",\"subList\":[]},{\"hasSub\":false,\"id\":216,\"parentId\":206,\"skuName\":\"弗拉门戈舞\",\"subList\":[]}]}]},{\"hasSub\":true,\"id\":203,\"parentId\":200,\"skuName\":\"古典舞\",\"subList\":[{\"hasSub\":false,\"id\":217,\"parentId\":203,\"skuName\":\"芭蕾舞\",\"subList\":[]},{\"hasSub\":false,\"id\":218,\"parentId\":203,\"skuName\":\"中国古典舞\",\"subList\":[]}]},{\"hasSub\":false,\"id\":204,\"parentId\":200,\"skuName\":\"广场舞\",\"subList\":[]},{\"hasSub\":false,\"id\":19,\"parentId\":200,\"skuName\":\"舞蹈\",\"subList\":[]}]},{\"hasSub\":true,\"id\":219,\"parentId\":0,\"skuName\":\"书法\",\"subList\":[{\"hasSub\":true,\"id\":220,\"parentId\":219,\"skuName\":\"硬笔书法\",\"subList\":[{\"hasSub\":false,\"id\":222,\"parentId\":220,\"skuName\":\"硬笔楷书\",\"subList\":[]},{\"hasSub\":false,\"id\":223,\"parentId\":220,\"skuName\":\"硬笔行书\",\"subList\":[]},{\"hasSub\":false,\"id\":224,\"parentId\":220,\"skuName\":\"硬笔行楷\",\"subList\":[]},{\"hasSub\":false,\"id\":225,\"parentId\":220,\"skuName\":\"硬笔草书\",\"subList\":[]}]},{\"hasSub\":true,\"id\":221,\"parentId\":219,\"skuName\":\"毛笔书法\",\"subList\":[{\"hasSub\":false,\"id\":226,\"parentId\":221,\"skuName\":\"楷书\",\"subList\":[]},{\"hasSub\":false,\"id\":227,\"parentId\":221,\"skuName\":\"行书\",\"subList\":[]},{\"hasSub\":false,\"id\":228,\"parentId\":221,\"skuName\":\"隶书\",\"subList\":[]},{\"hasSub\":false,\"id\":229,\"parentId\":221,\"skuName\":\"篆书\",\"subList\":[]},{\"hasSub\":false,\"id\":230,\"parentId\":221,\"skuName\":\"草书\",\"subList\":[]}]},{\"hasSub\":false,\"id\":21,\"parentId\":219,\"skuName\":\"书法\",\"subList\":[]}]},{\"hasSub\":true,\"id\":231,\"parentId\":0,\"skuName\":\"声乐\",\"subList\":[{\"hasSub\":false,\"id\":232,\"parentId\":231,\"skuName\":\"视唱练耳\",\"subList\":[]},{\"hasSub\":false,\"id\":233,\"parentId\":231,\"skuName\":\"民族\",\"subList\":[]},{\"hasSub\":false,\"id\":234,\"parentId\":231,\"skuName\":\"美声\",\"subList\":[]},{\"hasSub\":false,\"id\":235,\"parentId\":231,\"skuName\":\"通俗\",\"subList\":[]},{\"hasSub\":false,\"id\":236,\"parentId\":231,\"skuName\":\"合唱\",\"subList\":[]},{\"hasSub\":false,\"id\":237,\"parentId\":231,\"skuName\":\"红歌\",\"subList\":[]},{\"hasSub\":false,\"id\":45,\"parentId\":231,\"skuName\":\"视唱\",\"subList\":[]},{\"hasSub\":false,\"id\":18,\"parentId\":231,\"skuName\":\"声乐\",\"subList\":[]}]},{\"hasSub\":true,\"id\":238,\"parentId\":0,\"skuName\":\"乐器\",\"subList\":[{\"hasSub\":true,\"id\":240,\"parentId\":238,\"skuName\":\"民乐器\",\"subList\":[{\"hasSub\":false,\"id\":257,\"parentId\":240,\"skuName\":\"笛子\",\"subList\":[]},{\"hasSub\":false,\"id\":263,\"parentId\":240,\"skuName\":\"中阮\",\"subList\":[]},{\"hasSub\":false,\"id\":264,\"parentId\":240,\"skuName\":\"扬琴\",\"subList\":[]},{\"hasSub\":false,\"id\":265,\"parentId\":240,\"skuName\":\"箫\",\"subList\":[]},{\"hasSub\":false,\"id\":77,\"parentId\":240,\"skuName\":\"琵琶\",\"subList\":[]},{\"hasSub\":false,\"id\":76,\"parentId\":240,\"skuName\":\"钢舌鼓\",\"subList\":[]},{\"hasSub\":false,\"id\":74,\"parentId\":240,\"skuName\":\"柳琴\",\"subList\":[]},{\"hasSub\":false,\"id\":58,\"parentId\":240,\"skuName\":\"箜篌\",\"subList\":[]},{\"hasSub\":false,\"id\":56,\"parentId\":240,\"skuName\":\"笛萧\",\"subList\":[]},{\"hasSub\":false,\"id\":55,\"parentId\":240,\"skuName\":\"马头琴\",\"subList\":[]},{\"hasSub\":false,\"id\":53,\"parentId\":240,\"skuName\":\"古琴\",\"subList\":[]},{\"hasSub\":false,\"id\":52,\"parentId\":240,\"skuName\":\"二胡\",\"subList\":[]},{\"hasSub\":false,\"id\":46,\"parentId\":240,\"skuName\":\"陶笛\",\"subList\":[]},{\"hasSub\":false,\"id\":42,\"parentId\":240,\"skuName\":\"古筝\",\"subList\":[]},{\"hasSub\":false,\"id\":26,\"parentId\":240,\"skuName\":\"葫芦丝\",\"subList\":[]}]},{\"hasSub\":true,\"id\":239,\"parentId\":238,\"skuName\":\"西洋乐器\",\"subList\":[{\"hasSub\":false,\"id\":245,\"parentId\":239,\"skuName\":\"手风琴\",\"subList\":[]},{\"hasSub\":false,\"id\":246,\"parentId\":239,\"skuName\":\"钢舌琴\",\"subList\":[]},{\"hasSub\":false,\"id\":251,\"parentId\":239,\"skuName\":\"萨克斯\",\"subList\":[]},{\"hasSub\":false,\"id\":252,\"parentId\":239,\"skuName\":\"小号\",\"subList\":[]},{\"hasSub\":false,\"id\":83,\"parentId\":239,\"skuName\":\"口琴\",\"subList\":[]},{\"hasSub\":false,\"id\":82,\"parentId\":239,\"skuName\":\"京东大鼓\",\"subList\":[]},{\"hasSub\":false,\"id\":80,\"parentId\":239,\"skuName\":\"尤克里里\",\"subList\":[]},{\"hasSub\":false,\"id\":79,\"parentId\":239,\"skuName\":\"非洲鼓\",\"subList\":[]},{\"hasSub\":false,\"id\":78,\"parentId\":239,\"skuName\":\"小提琴\",\"subList\":[]},{\"hasSub\":false,\"id\":47,\"parentId\":239,\"skuName\":\"口风琴\",\"subList\":[]},{\"hasSub\":false,\"id\":44,\"parentId\":239,\"skuName\":\"吉他\",\"subList\":[]},{\"hasSub\":false,\"id\":41,\"parentId\":239,\"skuName\":\"钢琴\",\"subList\":[]},{\"hasSub\":false,\"id\":24,\"parentId\":239,\"skuName\":\"电子琴\",\"subList\":[]}]}]},{\"hasSub\":true,\"id\":266,\"parentId\":0,\"skuName\":\"朗诵\",\"subList\":[{\"hasSub\":false,\"id\":267,\"parentId\":266,\"skuName\":\"普通话基础\",\"subList\":[]},{\"hasSub\":false,\"id\":268,\"parentId\":266,\"skuName\":\"文学作品朗诵\\t\",\"subList\":[]},{\"hasSub\":false,\"id\":71,\"parentId\":266,\"skuName\":\"演讲口才\",\"subList\":[]},{\"hasSub\":false,\"id\":37,\"parentId\":266,\"skuName\":\"朗诵\",\"subList\":[]}]},{\"hasSub\":true,\"id\":270,\"parentId\":0,\"skuName\":\"绘画\",\"subList\":[{\"hasSub\":true,\"id\":271,\"parentId\":270,\"skuName\":\"国画\",\"subList\":[{\"hasSub\":false,\"id\":85,\"parentId\":271,\"skuName\":\"创意美术\",\"subList\":[]},{\"hasSub\":false,\"id\":87,\"parentId\":271,\"skuName\":\"花卉写生\",\"subList\":[]},{\"hasSub\":false,\"id\":30,\"parentId\":271,\"skuName\":\"工笔画\",\"subList\":[]},{\"hasSub\":false,\"id\":11,\"parentId\":271,\"skuName\":\"写意画\",\"subList\":[]}]},{\"hasSub\":false,\"id\":40,\"parentId\":270,\"skuName\":\"西洋画\",\"subList\":[]}]},{\"hasSub\":true,\"id\":282,\"parentId\":0,\"skuName\":\"摄影\",\"subList\":[{\"hasSub\":false,\"id\":283,\"parentId\":282,\"skuName\":\"手机摄影\",\"subList\":[]},{\"hasSub\":false,\"id\":284,\"parentId\":282,\"skuName\":\"数码摄影\",\"subList\":[]},{\"hasSub\":false,\"id\":28,\"parentId\":282,\"skuName\":\"摄影\",\"subList\":[]}]},{\"hasSub\":true,\"id\":285,\"parentId\":0,\"skuName\":\"生活\",\"subList\":[{\"hasSub\":true,\"id\":292,\"parentId\":285,\"skuName\":\"外语\",\"subList\":[{\"hasSub\":false,\"id\":294,\"parentId\":292,\"skuName\":\"英语\",\"subList\":[]},{\"hasSub\":false,\"id\":13,\"parentId\":292,\"skuName\":\"英语\",\"subList\":[]}]},{\"hasSub\":true,\"id\":291,\"parentId\":285,\"skuName\":\"厨艺\",\"subList\":[{\"hasSub\":false,\"id\":22,\"parentId\":291,\"skuName\":\"厨艺\",\"subList\":[]}]},{\"hasSub\":false,\"id\":288,\"parentId\":285,\"skuName\":\"育儿\",\"subList\":[]},{\"hasSub\":false,\"id\":289,\"parentId\":285,\"skuName\":\"旅游\",\"subList\":[]},{\"hasSub\":false,\"id\":69,\"parentId\":285,\"skuName\":\"法律\",\"subList\":[]},{\"hasSub\":false,\"id\":50,\"parentId\":285,\"skuName\":\"教育\",\"subList\":[]},{\"hasSub\":false,\"id\":29,\"parentId\":285,\"skuName\":\"理财\",\"subList\":[]},{\"hasSub\":false,\"id\":17,\"parentId\":285,\"skuName\":\"旅游\",\"subList\":[]},{\"hasSub\":false,\"id\":15,\"parentId\":285,\"skuName\":\"数码\",\"subList\":[]}]},{\"hasSub\":true,\"id\":295,\"parentId\":0,\"skuName\":\"手工\",\"subList\":[{\"hasSub\":false,\"id\":84,\"parentId\":295,\"skuName\":\"艺术手作\",\"subList\":[]},{\"hasSub\":false,\"id\":81,\"parentId\":295,\"skuName\":\"花艺\",\"subList\":[]},{\"hasSub\":false,\"id\":75,\"parentId\":295,\"skuName\":\"剪纸\",\"subList\":[]},{\"hasSub\":false,\"id\":70,\"parentId\":295,\"skuName\":\"葫芦烙画\",\"subList\":[]},{\"hasSub\":false,\"id\":65,\"parentId\":295,\"skuName\":\"黏土手作\",\"subList\":[]},{\"hasSub\":false,\"id\":64,\"parentId\":295,\"skuName\":\"实用手工\",\"subList\":[]},{\"hasSub\":false,\"id\":51,\"parentId\":295,\"skuName\":\"非遗手工\",\"subList\":[]},{\"hasSub\":false,\"id\":48,\"parentId\":295,\"skuName\":\"纸艺\",\"subList\":[]},{\"hasSub\":false,\"id\":39,\"parentId\":295,\"skuName\":\"剪纸\",\"subList\":[]},{\"hasSub\":false,\"id\":36,\"parentId\":295,\"skuName\":\"服装设计\",\"subList\":[]},{\"hasSub\":false,\"id\":35,\"parentId\":295,\"skuName\":\"编织\",\"subList\":[]}]},{\"hasSub\":true,\"id\":304,\"parentId\":0,\"skuName\":\"健身运动\",\"subList\":[{\"hasSub\":false,\"id\":86,\"parentId\":304,\"skuName\":\"健康食疗\",\"subList\":[]},{\"hasSub\":false,\"id\":88,\"parentId\":304,\"skuName\":\"医学营养\",\"subList\":[]},{\"hasSub\":false,\"id\":307,\"parentId\":304,\"skuName\":\"健身操\",\"subList\":[]},{\"hasSub\":false,\"id\":308,\"parentId\":304,\"skuName\":\"健骨操\",\"subList\":[]},{\"hasSub\":false,\"id\":309,\"parentId\":304,\"skuName\":\"八段锦\",\"subList\":[]},{\"hasSub\":false,\"id\":311,\"parentId\":304,\"skuName\":\"康复\",\"subList\":[]},{\"hasSub\":false,\"id\":312,\"parentId\":304,\"skuName\":\"中国武术\",\"subList\":[]},{\"hasSub\":false,\"id\":341,\"parentId\":304,\"skuName\":\"中医\",\"subList\":[]},{\"hasSub\":false,\"id\":342,\"parentId\":304,\"skuName\":\"西医\",\"subList\":[]},{\"hasSub\":false,\"id\":49,\"parentId\":304,\"skuName\":\"养生\",\"subList\":[]},{\"hasSub\":false,\"id\":43,\"parentId\":304,\"skuName\":\"气功\",\"subList\":[]},{\"hasSub\":false,\"id\":33,\"parentId\":304,\"skuName\":\"太极\",\"subList\":[]},{\"hasSub\":false,\"id\":32,\"parentId\":304,\"skuName\":\"心理\",\"subList\":[]},{\"hasSub\":false,\"id\":23,\"parentId\":304,\"skuName\":\"瑜伽\",\"subList\":[]},{\"hasSub\":false,\"id\":14,\"parentId\":304,\"skuName\":\"营养\",\"subList\":[]},{\"hasSub\":false,\"id\":10,\"parentId\":304,\"skuName\":\"健身\",\"subList\":[]}]},{\"hasSub\":true,\"id\":315,\"parentId\":0,\"skuName\":\"形象礼仪\",\"subList\":[{\"hasSub\":false,\"id\":316,\"parentId\":315,\"skuName\":\"美体塑形\",\"subList\":[]},{\"hasSub\":false,\"id\":318,\"parentId\":315,\"skuName\":\"中国传统礼仪\",\"subList\":[]},{\"hasSub\":false,\"id\":320,\"parentId\":315,\"skuName\":\"模特走秀\",\"subList\":[]},{\"hasSub\":false,\"id\":321,\"parentId\":315,\"skuName\":\"旗袍礼仪\",\"subList\":[]},{\"hasSub\":false,\"id\":322,\"parentId\":315,\"skuName\":\"社交礼仪\",\"subList\":[]},{\"hasSub\":false,\"id\":61,\"parentId\":315,\"skuName\":\"礼仪\",\"subList\":[]},{\"hasSub\":false,\"id\":54,\"parentId\":315,\"skuName\":\"形象美学\",\"subList\":[]},{\"hasSub\":false,\"id\":9,\"parentId\":315,\"skuName\":\"美妆\",\"subList\":[]}]},{\"hasSub\":true,\"id\":323,\"parentId\":0,\"skuName\":\"戏曲\",\"subList\":[{\"hasSub\":false,\"id\":325,\"parentId\":323,\"skuName\":\"越剧\",\"subList\":[]},{\"hasSub\":false,\"id\":326,\"parentId\":323,\"skuName\":\"评剧\",\"subList\":[]},{\"hasSub\":false,\"id\":329,\"parentId\":323,\"skuName\":\"京韵大鼓\",\"subList\":[]},{\"hasSub\":false,\"id\":330,\"parentId\":323,\"skuName\":\"黄梅戏\",\"subList\":[]},{\"hasSub\":false,\"id\":331,\"parentId\":323,\"skuName\":\"豫剧\",\"subList\":[]},{\"hasSub\":false,\"id\":332,\"parentId\":323,\"skuName\":\"沪剧\",\"subList\":[]},{\"hasSub\":false,\"id\":333,\"parentId\":323,\"skuName\":\"秦腔\",\"subList\":[]},{\"hasSub\":false,\"id\":334,\"parentId\":323,\"skuName\":\"快板\",\"subList\":[]},{\"hasSub\":false,\"id\":72,\"parentId\":323,\"skuName\":\"川剧\",\"subList\":[]},{\"hasSub\":false,\"id\":63,\"parentId\":323,\"skuName\":\"评戏\",\"subList\":[]},{\"hasSub\":false,\"id\":38,\"parentId\":323,\"skuName\":\"京剧\",\"subList\":[]},{\"hasSub\":false,\"id\":27,\"parentId\":323,\"skuName\":\"相声\",\"subList\":[]}]},{\"hasSub\":true,\"id\":335,\"parentId\":0,\"skuName\":\"棋牌\",\"subList\":[{\"hasSub\":false,\"id\":336,\"parentId\":335,\"skuName\":\"象棋\",\"subList\":[]},{\"hasSub\":false,\"id\":337,\"parentId\":335,\"skuName\":\"桥牌\",\"subList\":[]},{\"hasSub\":false,\"id\":338,\"parentId\":335,\"skuName\":\"围棋\",\"subList\":[]},{\"hasSub\":false,\"id\":339,\"parentId\":335,\"skuName\":\"扑克\",\"subList\":[]},{\"hasSub\":false,\"id\":20,\"parentId\":335,\"skuName\":\"棋牌\",\"subList\":[]}]},{\"hasSub\":true,\"id\":340,\"parentId\":0,\"skuName\":\"健康\",\"subList\":[{\"hasSub\":false,\"id\":67,\"parentId\":340,\"skuName\":\"中医养身\",\"subList\":[]},{\"hasSub\":false,\"id\":34,\"parentId\":340,\"skuName\":\"健康\",\"subList\":[]},{\"hasSub\":false,\"id\":16,\"parentId\":340,\"skuName\":\"形体\",\"subList\":[]}]},{\"hasSub\":true,\"id\":346,\"parentId\":0,\"skuName\":\"文化\",\"subList\":[{\"hasSub\":true,\"id\":350,\"parentId\":346,\"skuName\":\"文学鉴赏\",\"subList\":[{\"hasSub\":false,\"id\":355,\"parentId\":350,\"skuName\":\"诗歌鉴赏\",\"subList\":[]}]},{\"hasSub\":false,\"id\":351,\"parentId\":346,\"skuName\":\"写作\",\"subList\":[]},{\"hasSub\":false,\"id\":353,\"parentId\":346,\"skuName\":\"易经\",\"subList\":[]},{\"hasSub\":false,\"id\":354,\"parentId\":346,\"skuName\":\"哲学\",\"subList\":[]},{\"hasSub\":false,\"id\":73,\"parentId\":346,\"skuName\":\"国学\",\"subList\":[]},{\"hasSub\":false,\"id\":66,\"parentId\":346,\"skuName\":\"文艺鉴赏\",\"subList\":[]},{\"hasSub\":false,\"id\":60,\"parentId\":346,\"skuName\":\"国学易经\",\"subList\":[]},{\"hasSub\":false,\"id\":59,\"parentId\":346,\"skuName\":\"文哲\",\"subList\":[]},{\"hasSub\":false,\"id\":57,\"parentId\":346,\"skuName\":\"文化\",\"subList\":[]},{\"hasSub\":false,\"id\":31,\"parentId\":346,\"skuName\":\"茶艺\",\"subList\":[]},{\"hasSub\":false,\"id\":25,\"parentId\":346,\"skuName\":\"收藏鉴定\",\"subList\":[]},{\"hasSub\":false,\"id\":12,\"parentId\":346,\"skuName\":\"历史\",\"subList\":[]}]}],\"state\":{\"code\":\"0\",\"msg\":\"success\"}}", DataModel.class);
    }

    private List<SubListBean> data;


    public List<SubListBean> getData() {
        return data;
    }

    public void setData(List<SubListBean> data) {
        this.data = data;
    }


    public static class SubListBean implements ISelect {
        /**
         * hasSub : false
         * id : 201
         * parentId : 200
         * skuName : 现代舞
         * subList : []
         */

        private boolean hasSub;
        private int id;
        private int parentId;
        private String skuName;
        private List<SubListBean> subList;

        public boolean isHasSub() {
            return hasSub;
        }

        public void setHasSub(boolean hasSub) {
            this.hasSub = hasSub;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getParentId() {
            return parentId;
        }

        public void setParentId(int parentId) {
            this.parentId = parentId;
        }

        public String getSkuName() {
            return skuName;
        }

        public void setSkuName(String skuName) {
            this.skuName = skuName;
        }

        public List<SubListBean> getSubList() {
            return subList;
        }

        public void setSubList(List<SubListBean> subList) {
            this.subList = subList;
        }

        @NotNull
        @Override
        public String getName() {
            return skuName;
        }
    }
}
