// Generated code from Butter Knife. Do not modify!
package com.bene.pictures.ui.dialog;

import android.support.annotation.UiThread;
import android.view.View;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bene.pictures.R;
import com.bene.pictures.ui.base.BaseActivity_ViewBinding;
import com.bene.pictures.ui.widget.BaseTextView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ConfirmDialogActivity_ViewBinding extends BaseActivity_ViewBinding {
  private ConfirmDialogActivity target;

  private View view2131296765;

  private View view2131296792;

  private View view2131296450;

  private View view2131296554;

  @UiThread
  public ConfirmDialogActivity_ViewBinding(ConfirmDialogActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ConfirmDialogActivity_ViewBinding(final ConfirmDialogActivity target, View source) {
    super(target, source);

    this.target = target;

    View view;
    target.ui_txvContent = Utils.findRequiredViewAsType(source, R.id.txv_content, "field 'ui_txvContent'", BaseTextView.class);
    view = Utils.findRequiredView(source, R.id.txv_no, "field 'ui_txvNo' and method 'OnClickNo'");
    target.ui_txvNo = Utils.castView(view, R.id.txv_no, "field 'ui_txvNo'", BaseTextView.class);
    view2131296765 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.OnClickNo();
      }
    });
    view = Utils.findRequiredView(source, R.id.txv_yes, "field 'ui_txvYes' and method 'OnClickYes'");
    target.ui_txvYes = Utils.castView(view, R.id.txv_yes, "field 'ui_txvYes'", BaseTextView.class);
    view2131296792 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.OnClickYes();
      }
    });
    view = Utils.findRequiredView(source, R.id.fly_bg, "method 'OnClickWholeBg'");
    view2131296450 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.OnClickWholeBg();
      }
    });
    view = Utils.findRequiredView(source, R.id.lly_bg, "method 'OnClickBg'");
    view2131296554 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.OnClickBg();
      }
    });
  }

  @Override
  public void unbind() {
    ConfirmDialogActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ui_txvContent = null;
    target.ui_txvNo = null;
    target.ui_txvYes = null;

    view2131296765.setOnClickListener(null);
    view2131296765 = null;
    view2131296792.setOnClickListener(null);
    view2131296792 = null;
    view2131296450.setOnClickListener(null);
    view2131296450 = null;
    view2131296554.setOnClickListener(null);
    view2131296554 = null;

    super.unbind();
  }
}
