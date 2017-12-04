package com.shearf.cloud.apps.commons.foundation.util;

import java.util.UUID;

/**
 * @author xiahaihu2009@gmail.com
 */
public class StringUtil {

    /**
     * 创建32位随机唯一字符串
     *
     * @return 返回32位随机唯一字符串
     */
    public static String createRandomUniqueKey() {
        return UUID.randomUUID().toString().trim().replaceAll("-", "");
    }

}
