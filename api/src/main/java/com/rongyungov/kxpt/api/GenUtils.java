package com.rongyungov.kxpt.api;

public class GenUtils {
    public static void main(String[] args) {


        MybatisGen2.gen("D:/temp",
                "li",
                "com.rongyungov.kxpt",
                /*new String[]{"arrage_schedule","arrage_schedule_detail","car","car_oil","car_repair",
                        "classes","coach","coach_car","dictionary","menu","reservation","role",
                        "role_menu","student","time_space","time_template","sys_user","user_role"
                }*/
                new String[]{"student","teacher","sys_user","user_role","course_data","course_list",

                "test","exam","menu","role_menu","dictionary","role","role_menu",

                "test","exam","menu","role_menu","dictionary","role","role_menu","department","grade",
                        "task","dep_task"}

                "root", "123456",
                "jdbc:mysql://192.168.110.213:3307/kxpt?useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=Hongkong&allowMultiQueries=true");
    }


}
