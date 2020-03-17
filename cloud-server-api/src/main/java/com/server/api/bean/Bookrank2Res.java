package com.server.api.bean;

import java.util.List;

public class Bookrank2Res {

    /**
     * code : 1
     * message : 成功
     * data : {"list":[{"z_hit":"14835","z_num":"1.","z_type":"[Fami通文库]","z_href":"https://www.x23qb.com/book/1230/"},{"z_hit":"13492","z_num":"2.","z_type":"[轻の小说]","z_href":"https://www.x23qb.com/book/1888/"},{"z_hit":"13301","z_num":"3.","z_type":"[MF文库J]","z_href":"https://www.x23qb.com/book/2385/"},{"z_hit":"10607","z_num":"4.","z_type":"[轻小说の]","z_href":"https://www.x23qb.com/book/775/"},{"z_hit":"8895","z_num":"5.","z_type":"[MF文库J]","z_href":"https://www.x23qb.com/book/1041/"},{"z_hit":"7020","z_num":"6.","z_type":"[电击文库]","z_href":"https://www.x23qb.com/book/671/"},{"z_hit":"6273","z_num":"7.","z_type":"[轻小说の]","z_href":"https://www.x23qb.com/book/2386/"},{"z_hit":"6103","z_num":"8.","z_type":"[电击文库]","z_href":"https://www.x23qb.com/book/655/"},{"z_hit":"5453","z_num":"9.","z_type":"[富士见文库]","z_href":"https://www.x23qb.com/book/757/"},{"z_hit":"4919","z_num":"10.","z_type":"[MF文库J]","z_href":"https://www.x23qb.com/book/1059/"},{"z_hit":"4820","z_num":"11.","z_type":"[GA文库]","z_href":"https://www.x23qb.com/book/1335/"},{"z_hit":"4722","z_num":"12.","z_type":"[角川文库]","z_href":"https://www.x23qb.com/book/893/"},{"z_hit":"4384","z_num":"13.","z_type":"[富士见文库]","z_href":"https://www.x23qb.com/book/768/"},{"z_hit":"4317","z_num":"14.","z_type":"[MF文库J]","z_href":"https://www.x23qb.com/book/1050/"},{"z_hit":"3446","z_num":"15.","z_type":"[电击文库]","z_href":"https://www.x23qb.com/book/142934/"},{"z_hit":"2933","z_num":"16.","z_type":"[轻小说の]","z_href":"https://www.x23qb.com/book/1658/"},{"z_hit":"2734","z_num":"17.","z_type":"[GA文库]","z_href":"https://www.x23qb.com/book/2461/"},{"z_hit":"2667","z_num":"18.","z_type":"[异界大陆]","z_href":"https://www.x23qb.com/book/2167/"},{"z_hit":"2590","z_num":"19.","z_type":"[MF文库J]","z_href":"https://www.x23qb.com/book/1055/"},{"z_hit":"2548","z_num":"20.","z_type":"[轻小说の]","z_href":"https://www.x23qb.com/book/777/"}]}
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
             * z_hit : 14835
             * z_num : 1.
             * z_type : [Fami通文库]
             * z_href : https://www.x23qb.com/book/1230/
             */

            private String z_hit;
            private String z_num;
            private String z_type;
            private String z_href;

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
        }
    }
}
