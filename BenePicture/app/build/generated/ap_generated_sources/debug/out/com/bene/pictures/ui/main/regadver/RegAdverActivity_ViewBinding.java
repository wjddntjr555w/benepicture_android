// Generated code from Butter Knife. Do not modify!
package com.bene.pictures.ui.main.regadver;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bene.pictures.R;
import com.bene.pictures.ui.base.BaseActivity_ViewBinding;
import com.bene.pictures.ui.widget.BaseEditText;
import com.bene.pictures.ui.widget.BaseTextView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RegAdverActivity_ViewBinding extends BaseActivity_ViewBinding {
  private RegAdverActivity target;

  private View view2131296419;

  private View view2131296420;

  private View view2131296481;

  private View view2131296488;

  private View view2131296558;

  private View view2131296563;

  private View view2131296459;

  private View view2131296511;

  private View view2131296460;

  private View view2131296512;

  private View view2131296753;

  private View view2131296772;

  @UiThread
  public RegAdverActivity_ViewBinding(RegAdverActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public RegAdverActivity_ViewBinding(final RegAdverActivity target, View source) {
    super(target, source);

    this.target = target;

    View view;
    target.ui_imvGame = Utils.findRequiredViewAsType(source, R.id.imv_game, "field 'ui_imvGame'", ImageView.class);
    target.ui_imvVideo = Utils.findRequiredViewAsType(source, R.id.imv_video, "field 'ui_imvVideo'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.edt_period_from, "field 'ui_edtPeriodFrom' and method 'OnClickPeriodFromCal'");
    target.ui_edtPeriodFrom = Utils.castView(view, R.id.edt_period_from, "field 'ui_edtPeriodFrom'", BaseTextView.class);
    view2131296419 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.OnClickPeriodFromCal();
      }
    });
    view = Utils.findRequiredView(source, R.id.edt_period_to, "field 'ui_edtPeriodTo' and method 'OnClickPeriodToCal'");
    target.ui_edtPeriodTo = Utils.castView(view, R.id.edt_period_to, "field 'ui_edtPeriodTo'", BaseTextView.class);
    view2131296420 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.OnClickPeriodToCal();
      }
    });
    target.ui_edtFileName = Utils.findRequiredViewAsType(source, R.id.edt_filename, "field 'ui_edtFileName'", BaseTextView.class);
    target.ui_edtAdName = Utils.findRequiredViewAsType(source, R.id.edt_adname, "field 'ui_edtAdName'", BaseEditText.class);
    target.ui_edtLink = Utils.findRequiredViewAsType(source, R.id.edt_link, "field 'ui_edtLink'", BaseEditText.class);
    target.ui_edtCount = Utils.findRequiredViewAsType(source, R.id.edt_count, "field 'ui_edtCount'", BaseEditText.class);
    target.ui_edtBudget = Utils.findRequiredViewAsType(source, R.id.edt_budget, "field 'ui_edtBudget'", BaseEditText.class);
    view = Utils.findRequiredView(source, R.id.imv_agree_adterm, "field 'ui_imvAgreeAdTerm' and method 'OnClickAgreeAdver'");
    target.ui_imvAgreeAdTerm = Utils.castView(view, R.id.imv_agree_adterm, "field 'ui_imvAgreeAdTerm'", ImageView.class);
    view2131296481 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.OnClickAgreeAdver();
      }
    });
    target.ui_txvAdTerm = Utils.findRequiredViewAsType(source, R.id.txv_adterm, "field 'ui_txvAdTerm'", BaseTextView.class);
    view = Utils.findRequiredView(source, R.id.imv_back, "method 'OnClickBack'");
    view2131296488 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.OnClickBack();
      }
    });
    view = Utils.findRequiredView(source, R.id.lly_game_bg, "method 'OnClickManBg'");
    view2131296558 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.OnClickManBg();
      }
    });
    view = Utils.findRequiredView(source, R.id.lly_video_bg, "method 'OnClickWomanBg'");
    view2131296563 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.OnClickWomanBg();
      }
    });
    view = Utils.findRequiredView(source, R.id.fly_period_from, "method 'OnClickPeriodFromCal'");
    view2131296459 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.OnClickPeriodFromCal();
      }
    });
    view = Utils.findRequiredView(source, R.id.imv_period_from_cal, "method 'OnClickPeriodFromCal'");
    view2131296511 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.OnClickPeriodFromCal();
      }
    });
    view = Utils.findRequiredView(source, R.id.fly_period_to, "method 'OnClickPeriodToCal'");
    view2131296460 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.OnClickPeriodToCal();
      }
    });
    view = Utils.findRequiredView(source, R.id.imv_period_to_cal, "method 'OnClickPeriodToCal'");
    view2131296512 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.OnClickPeriodToCal();
      }
    });
    view = Utils.findRequiredView(source, R.id.txv_getfile, "method 'OnClickGetFile'");
    view2131296753 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.OnClickGetFile();
      }
    });
    view = Utils.findRequiredView(source, R.id.txv_regadver, "method 'OnClickRegAdver'");
    view2131296772 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.OnClickRegAdver();
      }
    });
  }

  @Override
  public void unbind() {
    RegAdverActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ui_imvGame = null;
    target.ui_imvVideo = null;
    target.ui_edtPeriodFrom = null;
    target.ui_edtPeriodTo = null;
    target.ui_edtFileName = null;
    target.ui_edtAdName = null;
    target.ui_edtLink = null;
    target.ui_edtCount = null;
    target.ui_edtBudget = null;
    target.ui_imvAgreeAdTerm = null;
    target.ui_txvAdTerm = null;

    view2131296419.setOnClickListener(null);
    view2131296419 = null;
    view2131296420.setOnClickListener(null);
    view2131296420 = null;
    view2131296481.setOnClickListener(null);
    view2131296481 = null;
    view2131296488.setOnClickListener(null);
    view2131296488 = null;
    view2131296558.setOnClickListener(null);
    view2131296558 = null;
    view2131296563.setOnClickListener(null);
    view2131296563 = null;
    view2131296459.setOnClickListener(null);
    view2131296459 = null;
    view2131296511.setOnClickListener(null);
    view2131296511 = null;
    view2131296460.setOnClickListener(null);
    view2131296460 = null;
    view2131296512.setOnClickListener(null);
    view2131296512 = null;
    view2131296753.setOnClickListener(null);
    view2131296753 = null;
    view2131296772.setOnClickListener(null);
    view2131296772 = null;

    super.unbind();
  }
}
