package com.bene.pictures.util;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

/**
 *
 * SharedPreferences를 사용하여 안드로이드 내부에 데이터를 저장하기 위한 클래
 *
 * 클래스 이름 : PrefMgr
 *
 * 버전 정보 : 0.01 ver released
 *
 * 날짜 : 2019-11-01
 *
 * 담당자 : 이희진
 *
 */
public final class PrefMgr {

    public static final String BENEPICTURE_PREFS = "benepicture_prefs";

    /**
     * 앱 사용방법을 출력할 것인지를 결정짓는 변수
     *
     * @see #getInt()
     */
    public static final String MAIN_GUIDE_SHOW = "main_guide_show";

    public static final String USER_LOGIN_TYPE = "login_type";
    public static final String USER_ID = "user_id";
    public static final String USER_PWD = "pwd";
    public static final String FCM_TOKEN = "fcm_token";
    public static final String PUSH_ID = "push_id";
    public static final String PUSH_TYPE = "push_type";
    public static final String DATA_SET = "data_set";
    public static final String KAKAO_ID = "kakao_id";
    public static final String KAKAO_NAME = "kakao_name";

    private SharedPreferences prefs;

    public PrefMgr(SharedPreferences prefs) {
        super();
        this.prefs = prefs;
    }

    public void put(String key, Object value) {
        Editor editor = prefs.edit();
        if (value.getClass().equals(String.class)) {
            editor.putString(key, (String) value);
        } else if (value.getClass().equals(Boolean.class)) {
            editor.putBoolean(key, (Boolean) value);
        } else if (value.getClass().equals(Integer.class)) {
            editor.putInt(key, (Integer) value);
        } else if (value.getClass().equals(Float.class) || value.getClass().equals(Double.class)) {
            editor.putFloat(key, (Float) value);
        }

        editor.commit();
    }

    public String getString(String key, String defaultValue) {
        return prefs.getString(key, defaultValue);
    }

    public float getFloat(String key, float defaultValue) {
        return prefs.getFloat(key, defaultValue);
    }

    public boolean getBoolean(String key, boolean defaultValue) {
        return prefs.getBoolean(key, defaultValue);
    }

    public int getInt(String key, int defaultValue) {
        return prefs.getInt(key, defaultValue);
    }

    public SharedPreferences getPrefs() {
        return prefs;
    }
}