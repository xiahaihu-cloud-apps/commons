package com.shearf.cloud.apps.commons.foundation.util;

import org.joda.time.DateTime;

import java.util.Date;

/**
 * @author xiahaihu2009@gmail.com
 * @date 2017/12/1
 */
public class DateUtil {

    /**
     * 返回Date格式化为日期时间
     *
     * @param date Date对象
     * @return 日期时间
     */
    public static String formatDateTime(Date date) {
        DateTime dateTime = new DateTime();
        return dateTime.toString("yyyy-MM-dd HH:mm:ss");
    }
}
