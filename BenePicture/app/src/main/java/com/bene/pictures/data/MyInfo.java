package com.bene.pictures.data;

import android.content.Context;
import android.content.SharedPreferences;

import com.bene.pictures.model.MUser;
import com.bene.pictures.util.PrefMgr;
import com.yanzhenjie.album.AlbumFolder;

import java.util.ArrayList;

import static com.bene.pictures.data.Constant.LOGIN_ID;


/**
 * 클래스 이름 : MyInfo
 *
 * 버전 정보 : 0.01 ver released
 *
 * 날짜 : 2019-11-01
 *
 * 담당자 : 이희진
 */
public class MyInfo {

    private static MyInfo singleton;

    public MUser userInfo;
    public String fcm_token = "";
    public ArrayList<AlbumFolder> gAlbumFolders;


    /**
     * 내 정보와 해당 유저의 정보를 생성하는 메소드.
     *
     * 싱글톤 패턴을 사용하여 유저 정보를 생성하고 반환
     *
     * @see    com.bene.pictures.model.MUser
     */
    public static MyInfo getInstance() {
        if (singleton == null) {
            singleton = new MyInfo();
        }

        if (singleton.userInfo == null) {
            singleton.userInfo = new MUser();

            if (singleton.userInfo.info == null) {
                singleton.userInfo.info = new MUser.UserInfo();
            }
        }

        return singleton;
    }

    /**
     * 유저 정보가 유효한지를 판단하는 메소드
     *
     * 유저의 아이디 길이가 양수인지를 판별한 boolean 값을 리턴
     */
    public Boolean isValid() {
        return MyInfo.getInstance().userInfo.info.id > 0;
    }

    public void load(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(PrefMgr.BENEPICTURE_PREFS,
                Context.MODE_PRIVATE);
        PrefMgr prefMgr = new PrefMgr(prefs);

        userInfo.info.login_type = prefMgr.getInt(PrefMgr.USER_LOGIN_TYPE, LOGIN_ID);
        userInfo.info.usr_id = prefMgr.getString(PrefMgr.USER_ID, "");
        userInfo.info.kt_id = prefMgr.getString(PrefMgr.KAKAO_ID, "");
        userInfo.info.pwd = prefMgr.getString(PrefMgr.USER_PWD, "");
        fcm_token = prefMgr.getString(PrefMgr.FCM_TOKEN, "");

        if (fcm_token.isEmpty() || fcm_token.equals("test_token")) {
            SharedPreferences preferences = context.getSharedPreferences(Constant.PREFERENCE_NAME, 0);
            fcm_token = preferences.getString(Constant.KEY_PUSH_TOKEN, Constant.NET_DEV_MODE == 1 ? "test_token" : "");
        }

    }

    public void save(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(PrefMgr.BENEPICTURE_PREFS,
                Context.MODE_PRIVATE);
        PrefMgr prefMgr = new PrefMgr(prefs);

        prefMgr.put(PrefMgr.USER_LOGIN_TYPE, userInfo.info.login_type);
        prefMgr.put(PrefMgr.USER_ID, userInfo.info.usr_id);
        prefMgr.put(PrefMgr.KAKAO_ID, userInfo.info.kt_id);
        prefMgr.put(PrefMgr.USER_PWD, userInfo.info.pwd);
        prefMgr.put(PrefMgr.FCM_TOKEN, fcm_token);
    }

    public void saveToken(Context context, String token) {
        SharedPreferences prefs = context.getSharedPreferences(PrefMgr.BENEPICTURE_PREFS,
                Context.MODE_PRIVATE);
        PrefMgr prefMgr = new PrefMgr(prefs);

        fcm_token = token;
        prefMgr.put(PrefMgr.FCM_TOKEN, token);
    }

    public void savePush(Context context, int type, int id) {
        SharedPreferences prefs = context.getSharedPreferences(PrefMgr.BENEPICTURE_PREFS,
                Context.MODE_PRIVATE);
        PrefMgr prefMgr = new PrefMgr(prefs);

        prefMgr.put(PrefMgr.PUSH_TYPE, type);
        prefMgr.put(PrefMgr.PUSH_ID, id);
    }

    public void saveData(Context context, int data) {
        SharedPreferences prefs = context.getSharedPreferences(PrefMgr.BENEPICTURE_PREFS,
                Context.MODE_PRIVATE);
        PrefMgr prefMgr = new PrefMgr(prefs);

        prefMgr.put(PrefMgr.DATA_SET, data);
    }

    public void init(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(PrefMgr.BENEPICTURE_PREFS,
                Context.MODE_PRIVATE);
        PrefMgr prefMgr = new PrefMgr(prefs);

        prefMgr.put(PrefMgr.USER_LOGIN_TYPE, LOGIN_ID);
        prefMgr.put(PrefMgr.USER_ID, "");
        prefMgr.put(PrefMgr.KAKAO_ID, "");
        prefMgr.put(PrefMgr.USER_PWD, "");
    }
}