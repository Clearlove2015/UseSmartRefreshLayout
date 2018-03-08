package com.odbpo.fenggou.retrofit2refreshlayout.bean;

import java.util.List;

/**
 * @author: zc
 * @Time: 2018/3/7 13:49
 * @Desc:
 */
public class Course {
    /**
     * msg : success
     * total : 2
     * data : [{"id":2,"course_ref":"http://www.stay4it.com/course/3","teacher":{"name":"Stay","experience":"六年移动开发设计经验。三年 PM,一年个人创业。  擅长前期的需求分析,产品设计,整体项目框架搭建以及后期的性能调优与 debug"},"name":"Stay教你如何学习Android","sub_name":"在接触一门语言之前，应该做的准备","description":"","image":"http://www.stay4it.com/files/course/2014/12-28/13273138f131488293.jpg","pub_date":"2017-01-22T09:14:15Z","star":21,"lessons":[{"index":1,"title":"课时1：学习语言的最佳方式 12:23","sub_title":""},{"index":2,"title":"课时2：除了写代码，我们还能做什么 16:09","sub_title":""},{"index":3,"title":"课时3：80%的问题都能自己解决","sub_title":""},{"index":4,"title":"课时4：比写代码更重要的是什么 34:50","sub_title":""}]},{"id":3,"course_ref":"http://www.stay4it.com/course/10","teacher":{"name":"Stay","experience":"六年移动开发设计经验。三年 PM,一年个人创业。  擅长前期的需求分析,产品设计,整体项目框架搭建以及后期的性能调优与 debug"},"name":"不一样的简历与面试","sub_name":"","description":"","image":"http://www.stay4it.com/files/course/2015/01-07/094354a348c6160537.png","pub_date":"2017-01-22T09:28:33Z","star":0,"lessons":[]},{"id":4,"course_ref":"http://www.stay4it.com/course/11","teacher":{"name":"Stay","experience":"六年移动开发设计经验。三年 PM,一年个人创业。  擅长前期的需求分析,产品设计,整体项目框架搭建以及后期的性能调优与 debug"},"name":"技能必备－快速review代码","sub_name":"","description":"","image":"http://www.stay4it.com/files/course/2015/01-06/19372776ffa5598513.jpg","pub_date":"2017-01-22T09:29:12Z","star":0,"lessons":[]},{"id":5,"course_ref":"http://www.stay4it.com/course/12","teacher":{"name":"Stay","experience":"六年移动开发设计经验。三年 PM,一年个人创业。  擅长前期的需求分析,产品设计,整体项目框架搭建以及后期的性能调优与 debug"},"name":"自定义RowView","sub_name":"","description":"","image":"http://www.stay4it.com/files/course/2015/01-26/125511f307df741974.png","pub_date":"2017-01-22T09:29:52Z","star":0,"lessons":[]},{"id":6,"course_ref":"http://www.stay4it.com/course/8","teacher":{"name":"Stay","experience":"六年移动开发设计经验。三年 PM,一年个人创业。  擅长前期的需求分析,产品设计,整体项目框架搭建以及后期的性能调优与 debug"},"name":"微信聊天表情","sub_name":"","description":"","image":"http://www.stay4it.com/files/course/2015/01-26/131711774701410996.png","pub_date":"2017-01-22T09:30:13Z","star":0,"lessons":[]},{"id":7,"course_ref":"http://www.stay4it.com/course/22","teacher":{"name":"Stay","experience":"六年移动开发设计经验。三年 PM,一年个人创业。  擅长前期的需求分析,产品设计,整体项目框架搭建以及后期的性能调优与 debug"},"name":"Retrofit分析-漂亮的解耦套路(视频版)","sub_name":"","description":"","image":"http://www.stay4it.com/files/default/2016/04-19/155228ccc51c355135.jpeg","pub_date":"2017-01-22T09:30:56Z","star":0,"lessons":[]},{"id":8,"course_ref":"http://www.stay4it.com/course/4","teacher":{"name":"Stay","experience":"六年移动开发设计经验。三年 PM,一年个人创业。  擅长前期的需求分析,产品设计,整体项目框架搭建以及后期的性能调优与 debug"},"name":"自己动手写HTTP框架","sub_name":"","description":"","image":"http://www.stay4it.com/files/default/2015/07-14/1932491d68c8119376.jpg","pub_date":"2017-01-22T09:31:29Z","star":0,"lessons":[]},{"id":9,"course_ref":"http://www.stay4it.com/course/5","teacher":{"name":"Stay","experience":"六年移动开发设计经验。三年 PM,一年个人创业。  擅长前期的需求分析,产品设计,整体项目框架搭建以及后期的性能调优与 debug"},"name":"自己动手写DB框架","sub_name":"","description":"","image":"http://www.stay4it.com/files/course/2015/01-06/193212cb7cdd876375.jpg","pub_date":"2017-01-22T09:31:51Z","star":0,"lessons":[]},{"id":10,"course_ref":"http://www.stay4it.com/course/7","teacher":{"name":"Stay","experience":"六年移动开发设计经验。三年 PM,一年个人创业。  擅长前期的需求分析,产品设计,整体项目框架搭建以及后期的性能调优与 debug"},"name":"有心课堂","sub_name":"","description":"","image":"http://www.stay4it.com/files/default/2016/02-24/110622eeef76901382.jpeg","pub_date":"2017-01-22T09:32:17Z","star":0,"lessons":[]},{"id":11,"course_ref":"http://www.stay4it.com/course/16","teacher":{"name":"Stay","experience":"六年移动开发设计经验。三年 PM,一年个人创业。  擅长前期的需求分析,产品设计,整体项目框架搭建以及后期的性能调优与 debug"},"name":"一起做个即时通讯App","sub_name":"","description":"","image":"http://www.stay4it.com/files/course/2015/03-05/1404182474e5930545.jpg","pub_date":"2017-01-22T09:32:49Z","star":0,"lessons":[]}]
     * code : 200
     */

    private String msg;
    private int total;
    private int code;
    private List<DataBean> data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 2
         * course_ref : http://www.stay4it.com/course/3
         * teacher : {"name":"Stay","experience":"六年移动开发设计经验。三年 PM,一年个人创业。  擅长前期的需求分析,产品设计,整体项目框架搭建以及后期的性能调优与 debug"}
         * name : Stay教你如何学习Android
         * sub_name : 在接触一门语言之前，应该做的准备
         * description :
         * image : http://www.stay4it.com/files/course/2014/12-28/13273138f131488293.jpg
         * pub_date : 2017-01-22T09:14:15Z
         * star : 21
         * lessons : [{"index":1,"title":"课时1：学习语言的最佳方式 12:23","sub_title":""},{"index":2,"title":"课时2：除了写代码，我们还能做什么 16:09","sub_title":""},{"index":3,"title":"课时3：80%的问题都能自己解决","sub_title":""},{"index":4,"title":"课时4：比写代码更重要的是什么 34:50","sub_title":""}]
         */

        private int id;
        private String course_ref;
        private TeacherBean teacher;
        private String name;
        private String sub_name;
        private String description;
        private String image;
        private String pub_date;
        private int star;
        private List<LessonsBean> lessons;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCourse_ref() {
            return course_ref;
        }

        public void setCourse_ref(String course_ref) {
            this.course_ref = course_ref;
        }

        public TeacherBean getTeacher() {
            return teacher;
        }

        public void setTeacher(TeacherBean teacher) {
            this.teacher = teacher;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSub_name() {
            return sub_name;
        }

        public void setSub_name(String sub_name) {
            this.sub_name = sub_name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getPub_date() {
            return pub_date;
        }

        public void setPub_date(String pub_date) {
            this.pub_date = pub_date;
        }

        public int getStar() {
            return star;
        }

        public void setStar(int star) {
            this.star = star;
        }

        public List<LessonsBean> getLessons() {
            return lessons;
        }

        public void setLessons(List<LessonsBean> lessons) {
            this.lessons = lessons;
        }

        public static class TeacherBean {
            /**
             * name : Stay
             * experience : 六年移动开发设计经验。三年 PM,一年个人创业。  擅长前期的需求分析,产品设计,整体项目框架搭建以及后期的性能调优与 debug
             */

            private String name;
            private String experience;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getExperience() {
                return experience;
            }

            public void setExperience(String experience) {
                this.experience = experience;
            }
        }

        public static class LessonsBean {
            /**
             * index : 1
             * title : 课时1：学习语言的最佳方式 12:23
             * sub_title :
             */

            private int index;
            private String title;
            private String sub_title;

            public int getIndex() {
                return index;
            }

            public void setIndex(int index) {
                this.index = index;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getSub_title() {
                return sub_title;
            }

            public void setSub_title(String sub_title) {
                this.sub_title = sub_title;
            }
        }
    }
}
