package com.sgulab.thongtindaotao.utils;

public class Constant {
    public static final String BASE_URL = "http://thongtindaotao.sgu.edu.vn";
    public static final String SPLASH = "/";
    public static final String DEFAULT_URL = SPLASH  + "Default.aspx";

    public static class DIEM {
        public static final String VIEW_STATE_PARAM = "__VIEWSTATE";
        public static final String EVENT_TARGET_PARAM = "__EVENTTARGET";
        public static final String VIEW_STATE = "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";
        public static final String EVENT_TARGET = "ctl00$ContentPlaceHolder1$ctl00$lnkChangeview2";
        public static final String PAGE_PARAM = "page";
        public static final String ID_PARAM = "id";
        public static final String PAGE = "xemdiemthi";
        public static final String ID = "3111410096";
    }
}