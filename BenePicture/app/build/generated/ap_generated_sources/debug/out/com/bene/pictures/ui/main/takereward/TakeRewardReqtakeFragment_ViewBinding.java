// Generated code from Butter Knife. Do not modify!
package com.bene.pictures.ui.main.takereward;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bene.pictures.R;
import com.bene.pictures.ui.widget.BaseEditText;
import com.bene.pictures.ui.widget.BaseTextView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class TakeRewardReqtakeFragment_ViewBinding implements Unbinder {
  private TakeRewardReqtakeFragment target;

  private View view2131296427;

  private View view2131296409;

  private View view2131296484;

  private View view2131296735;

  private View view2131296445;

  private View view2131296764;

  @UiThread
  public TakeRewardReqtakeFragment_ViewBinding(final TakeRewardReqtakeFragment target,
      View source) {
    this.target = target;

    View view;
    target.ui_edtName = Utils.findRequiredViewAsType(source, R.id.edt_name, "field 'ui_edtName'", BaseEditText.class);
    view = Utils.findRequiredView(source, R.id.edt_subscribe_number, "field 'ui_edtNumber' and method 'OnClickSubScribe'");
    target.ui_edtNumber = Utils.castView(view, R.id.edt_subscribe_number, "field 'ui_edtNumber'", BaseTextView.class);
    view2131296427 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.OnClickSubScribe();
      }
    });
    view = Utils.findRequiredView(source, R.id.edt_bank, "field 'ui_edtBank' and method 'OnClickBank'");
    target.ui_edtBank = Utils.castView(view, R.id.edt_bank, "field 'ui_edtBank'", BaseTextView.class);
    view2131296409 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.OnClickBank();
      }
    });
    target.ui_edtAccount = Utils.findRequiredViewAsType(source, R.id.edt_account, "field 'ui_edtAccount'", BaseEditText.class);
    target.ui_edtReview = Utils.findRequiredViewAsType(source, R.id.edt_review, "field 'ui_edtReview'", BaseEditText.class);
    view = Utils.findRequiredView(source, R.id.imv_agree_guide, "field 'ui_imvAgreeGuide' and method 'OnClickAgreeGuide'");
    target.ui_imvAgreeGuide = Utils.castView(view, R.id.imv_agree_guide, "field 'ui_imvAgreeGuide'", ImageView.class);
    view2131296484 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.OnClickAgreeGuide();
      }
    });
    target.ui_txvGuide = Utils.findRequiredViewAsType(source, R.id.txv_guide, "field 'ui_txvGuide'", BaseTextView.class);
    target.ui_txvTakableMoney = Utils.findRequiredViewAsType(source, R.id.txv_takable_money, "field 'ui_txvTakableMoney'", BaseTextView.class);
    target.ui_edtCitizen = Utils.findRequiredViewAsType(source, R.id.edt_citizen, "field 'ui_edtCitizen'", BaseEditText.class);
    view = Utils.findRequiredView(source, R.id.txv_account_auth, "field 'ui_txvAccountAuth' and method 'OnClickAccountAuth'");
    target.ui_txvAccountAuth = Utils.castView(view, R.id.txv_account_auth, "field 'ui_txvAccountAuth'", BaseTextView.class);
    view2131296735 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.OnClickAccountAuth();
      }
    });
    view = Utils.findRequiredView(source, R.id.fly_agree_guide_bg, "method 'OnClickAgreeGuide'");
    view2131296445 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.OnClickAgreeGuide();
      }
    });
    view = Utils.findRequiredView(source, R.id.txv_next, "method 'OnClickTake'");
    view2131296764 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.OnClickTake();
      }
    });

    Context context = source.getContext();
    Resources res = context.getResources();
    target.bankList = res.getStringArray(R.array.bank);
  }

  @Override
  @CallSuper
  public void unbind() {
    TakeRewardReqtakeFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ui_edtName = null;
    target.ui_edtNumber = null;
    target.ui_edtBank = null;
    target.ui_edtAccount = null;
    target.ui_edtReview = null;
    target.ui_imvAgreeGuide = null;
    target.ui_txvGuide = null;
    target.ui_txvTakableMoney = null;
    target.ui_edtCitizen = null;
    target.ui_txvAccountAuth = null;

    view2131296427.setOnClickListener(null);
    view2131296427 = null;
    view2131296409.setOnClickListener(null);
    view2131296409 = null;
    view2131296484.setOnClickListener(null);
    view2131296484 = null;
    view2131296735.setOnClickListener(null);
    view2131296735 = null;
    view2131296445.setOnClickListener(null);
    view2131296445 = null;
    view2131296764.setOnClickListener(null);
    view2131296764 = null;
  }
}
