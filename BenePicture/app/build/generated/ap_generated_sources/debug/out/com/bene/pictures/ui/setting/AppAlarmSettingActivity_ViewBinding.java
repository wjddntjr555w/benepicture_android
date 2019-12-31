// Generated code from Butter Knife. Do not modify!
package com.bene.pictures.ui.setting;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bene.pictures.R;
import com.bene.pictures.ui.base.BaseActivity_ViewBinding;
import com.bene.pictures.ui.widget.BaseTextView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AppAlarmSettingActivity_ViewBinding extends BaseActivity_ViewBinding {
  private AppAlarmSettingActivity target;

  private View view2131296534;

  private View view2131296496;

  private View view2131296509;

  private View view2131296526;

  private View view2131296770;

  private View view2131296487;

  private View view2131296776;

  private View view2131296488;

  @UiThread
  public AppAlarmSettingActivity_ViewBinding(AppAlarmSettingActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AppAlarmSettingActivity_ViewBinding(final AppAlarmSettingActivity target, View source) {
    super(target, source);

    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.imv_winning_result_setting, "field 'ui_imvWinningResultSetting' and method 'OnClickWinningResult'");
    target.ui_imvWinningResultSetting = Utils.castView(view, R.id.imv_winning_result_setting, "field 'ui_imvWinningResultSetting'", ImageView.class);
    view2131296534 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.OnClickWinningResult();
      }
    });
    view = Utils.findRequiredView(source, R.id.imv_friends_msg_setting, "field 'ui_imvFriendsMsgSetting' and method 'OnClickFriendsMsg'");
    target.ui_imvFriendsMsgSetting = Utils.castView(view, R.id.imv_friends_msg_setting, "field 'ui_imvFriendsMsgSetting'", ImageView.class);
    view2131296496 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.OnClickFriendsMsg();
      }
    });
    view = Utils.findRequiredView(source, R.id.imv_notice_setting, "field 'ui_imvNoticeSetting' and method 'OnClickNotice'");
    target.ui_imvNoticeSetting = Utils.castView(view, R.id.imv_notice_setting, "field 'ui_imvNoticeSetting'", ImageView.class);
    view2131296509 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.OnClickNotice();
      }
    });
    view = Utils.findRequiredView(source, R.id.imv_puzzle_setting, "field 'ui_imvPuzzleSetting' and method 'OnClickPuzzle'");
    target.ui_imvPuzzleSetting = Utils.castView(view, R.id.imv_puzzle_setting, "field 'ui_imvPuzzleSetting'", ImageView.class);
    view2131296526 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.OnClickPuzzle();
      }
    });
    view = Utils.findRequiredView(source, R.id.txv_puzzle_time, "field 'ui_txvPuzzleTime' and method 'OnClickBank'");
    target.ui_txvPuzzleTime = Utils.castView(view, R.id.txv_puzzle_time, "field 'ui_txvPuzzleTime'", BaseTextView.class);
    view2131296770 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.OnClickBank();
      }
    });
    view = Utils.findRequiredView(source, R.id.imv_alarm_all, "field 'ui_imvAlarmAll' and method 'OnClickAll'");
    target.ui_imvAlarmAll = Utils.castView(view, R.id.imv_alarm_all, "field 'ui_imvAlarmAll'", ImageView.class);
    view2131296487 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.OnClickAll();
      }
    });
    view = Utils.findRequiredView(source, R.id.txv_setting, "method 'OnClickChange'");
    view2131296776 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.OnClickChange();
      }
    });
    view = Utils.findRequiredView(source, R.id.imv_back, "method 'OnClickBack'");
    view2131296488 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.OnClickBack();
      }
    });

    Context context = source.getContext();
    Resources res = context.getResources();
    target.timeList = res.getStringArray(R.array.time);
  }

  @Override
  public void unbind() {
    AppAlarmSettingActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ui_imvWinningResultSetting = null;
    target.ui_imvFriendsMsgSetting = null;
    target.ui_imvNoticeSetting = null;
    target.ui_imvPuzzleSetting = null;
    target.ui_txvPuzzleTime = null;
    target.ui_imvAlarmAll = null;

    view2131296534.setOnClickListener(null);
    view2131296534 = null;
    view2131296496.setOnClickListener(null);
    view2131296496 = null;
    view2131296509.setOnClickListener(null);
    view2131296509 = null;
    view2131296526.setOnClickListener(null);
    view2131296526 = null;
    view2131296770.setOnClickListener(null);
    view2131296770 = null;
    view2131296487.setOnClickListener(null);
    view2131296487 = null;
    view2131296776.setOnClickListener(null);
    view2131296776 = null;
    view2131296488.setOnClickListener(null);
    view2131296488 = null;

    super.unbind();
  }
}
