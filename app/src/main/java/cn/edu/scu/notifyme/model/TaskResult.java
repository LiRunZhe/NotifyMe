package cn.edu.scu.notifyme.model;

import java.util.List;

public class TaskResult {
    /**
     * iconUrl : https://hitokoto.cn/favicon.ico
     * messages : [{"title":"Hitokoto","imgUrl":"https://piccdn.freejishu.com/images/2016/09/25/930f5212c99ccc71accd4615cb03e255.jpg","content":"今日，吾爱，我们融为一体。 - SCP基金会","targetUrl":"https://hitokoto.cn"}]
     */

    private String iconUrl;
    private List<MessagesBean> messages;

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public List<MessagesBean> getMessages() {
        return messages;
    }

    public void setMessages(List<MessagesBean> messages) {
        this.messages = messages;
    }

    public static class MessagesBean {
        /**
         * title : Hitokoto
         * imgUrl : https://piccdn.freejishu.com/images/2016/09/25/930f5212c99ccc71accd4615cb03e255.jpg
         * content : 今日，吾爱，我们融为一体。 - SCP基金会
         * targetUrl : https://hitokoto.cn
         */

        private String title;
        private String imgUrl;
        private String content;
        private String targetUrl;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getImgUrl() {
            return imgUrl;
        }

        public void setImgUrl(String imgUrl) {
            this.imgUrl = imgUrl;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getTargetUrl() {
            return targetUrl;
        }

        public void setTargetUrl(String targetUrl) {
            this.targetUrl = targetUrl;
        }
    }
}
