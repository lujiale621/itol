package com.server.api.bean;

import java.util.List;

public class Bookrank1Res {

    /**
     * code : 1
     * message : 成功
     * data : {"list":[{"z_hit":"42","z_num":"1.","z_type":"[历史军事]","z_href":"https://www.x23qb.com/book/184177/","y_hit":"477","y_num":"1.","y_type":"[历史军事]","y_href":"https://www.x23qb.com/book/183266/","t_hit":"205071","t_num":"1.","t_type":"[历史小说]","t_href":"https://www.x23qb.com/book/2360/"},{"z_hit":"37","z_num":"2.","z_type":"[历史军事]","z_href":"https://www.x23qb.com/book/165327/","y_hit":"466","y_num":"2.","y_type":"[历史军事]","y_href":"https://www.x23qb.com/book/184177/","t_hit":"94144","t_num":"2.","t_type":"[架空历史]","t_href":"https://www.x23qb.com/book/23281/"},{"z_hit":"37","z_num":"3.","z_type":"[历史军事]","z_href":"https://www.x23qb.com/book/183266/","y_hit":"461","y_num":"3.","y_type":"[历史军事]","y_href":"https://www.x23qb.com/book/183291/","t_hit":"85904","t_num":"3.","t_type":"[架空历史]","t_href":"https://www.x23qb.com/book/2726/"},{"z_hit":"35","z_num":"4.","z_type":"[架空历史]","z_href":"https://www.x23qb.com/book/23281/","y_hit":"414","y_num":"4.","y_type":"[历史军事]","y_href":"https://www.x23qb.com/book/165327/","t_hit":"80976","t_num":"4.","t_type":"[架空历史]","t_href":"https://www.x23qb.com/book/7570/"},{"z_hit":"35","z_num":"5.","z_type":"[历史军事]","z_href":"https://www.x23qb.com/book/183291/","y_hit":"398","y_num":"5.","y_type":"[架空历史]","y_href":"https://www.x23qb.com/book/23281/","t_hit":"61177","t_num":"5.","t_type":"[架空历史]","t_href":"https://www.x23qb.com/book/9651/"},{"z_hit":"31","z_num":"6.","z_type":"[架空历史]","z_href":"https://www.x23qb.com/book/147623/","y_hit":"349","y_num":"6.","y_type":"[架空历史]","y_href":"https://www.x23qb.com/book/147623/","t_hit":"46526","t_num":"6.","t_type":"[历史军事]","t_href":"https://www.x23qb.com/book/6815/"},{"z_hit":"28","z_num":"7.","z_type":"[历史军事]","z_href":"https://www.x23qb.com/book/183047/","y_hit":"336","y_num":"7.","y_type":"[历史军事]","y_href":"https://www.x23qb.com/book/183861/","t_hit":"44035","t_num":"7.","t_type":"[历史军事]","t_href":"https://www.x23qb.com/book/6590/"},{"z_hit":"28","z_num":"8.","z_type":"[历史军事]","z_href":"https://www.x23qb.com/book/6959/","y_hit":"322","y_num":"8.","y_type":"[历史军事]","y_href":"https://www.x23qb.com/book/183372/","t_hit":"43697","t_num":"8.","t_type":"[架空历史]","t_href":"https://www.x23qb.com/book/4188/"},{"z_hit":"28","z_num":"9.","z_type":"[历史军事]","z_href":"https://www.x23qb.com/book/183861/","y_hit":"306","y_num":"9.","y_type":"[架空历史]","y_href":"https://www.x23qb.com/book/3149/","t_hit":"37839","t_num":"9.","t_type":"[架空历史]","t_href":"https://www.x23qb.com/book/6246/"},{"z_hit":"24","z_num":"10.","z_type":"[历史小说]","z_href":"https://www.x23qb.com/book/2613/","y_hit":"300","y_num":"10.","y_type":"[历史小说]","y_href":"https://www.x23qb.com/book/2613/","t_hit":"30237","t_num":"10.","t_type":"[历史军事]","t_href":"https://www.x23qb.com/book/6663/"},{"z_hit":"24","z_num":"11.","z_type":"[历史军事]","z_href":"https://www.x23qb.com/book/129602/","y_hit":"291","y_num":"11.","y_type":"[架空历史]","y_href":"https://www.x23qb.com/book/9651/","t_hit":"24680","t_num":"11.","t_type":"[架空历史]","t_href":"https://www.x23qb.com/book/9766/"},{"z_hit":"23","z_num":"12.","z_type":"[架空历史]","z_href":"https://www.x23qb.com/book/3149/","y_hit":"278","y_num":"12.","y_type":"[历史军事]","y_href":"https://www.x23qb.com/book/183047/","t_hit":"24297","t_num":"12.","t_type":"[架空历史]","t_href":"https://www.x23qb.com/book/18044/"}]}
     */

    private int code;
    private String message;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private List<ListBean> list;

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * z_hit : 42
             * z_num : 1.
             * z_type : [历史军事]
             * z_href : https://www.x23qb.com/book/184177/
             * y_hit : 477
             * y_num : 1.
             * y_type : [历史军事]
             * y_href : https://www.x23qb.com/book/183266/
             * t_hit : 205071
             * t_num : 1.
             * t_type : [历史小说]
             * t_href : https://www.x23qb.com/book/2360/
             */

            private String z_hit;
            private String z_num;
            private String z_type;
            private String z_href;
            private String y_hit;
            private String y_num;
            private String y_type;
            private String y_href;
            private String t_hit;
            private String t_num;
            private String t_type;
            private String t_href;

            public String getZ_hit() {
                return z_hit;
            }

            public void setZ_hit(String z_hit) {
                this.z_hit = z_hit;
            }

            public String getZ_num() {
                return z_num;
            }

            public void setZ_num(String z_num) {
                this.z_num = z_num;
            }

            public String getZ_type() {
                return z_type;
            }

            public void setZ_type(String z_type) {
                this.z_type = z_type;
            }

            public String getZ_href() {
                return z_href;
            }

            public void setZ_href(String z_href) {
                this.z_href = z_href;
            }

            public String getY_hit() {
                return y_hit;
            }

            public void setY_hit(String y_hit) {
                this.y_hit = y_hit;
            }

            public String getY_num() {
                return y_num;
            }

            public void setY_num(String y_num) {
                this.y_num = y_num;
            }

            public String getY_type() {
                return y_type;
            }

            public void setY_type(String y_type) {
                this.y_type = y_type;
            }

            public String getY_href() {
                return y_href;
            }

            public void setY_href(String y_href) {
                this.y_href = y_href;
            }

            public String getT_hit() {
                return t_hit;
            }

            public void setT_hit(String t_hit) {
                this.t_hit = t_hit;
            }

            public String getT_num() {
                return t_num;
            }

            public void setT_num(String t_num) {
                this.t_num = t_num;
            }

            public String getT_type() {
                return t_type;
            }

            public void setT_type(String t_type) {
                this.t_type = t_type;
            }

            public String getT_href() {
                return t_href;
            }

            public void setT_href(String t_href) {
                this.t_href = t_href;
            }
        }
    }
}
