package com.bene.pictures.ui.dialog;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

import com.bene.pictures.R;
import com.bene.pictures.ui.base.BaseActivity;
import com.bene.pictures.ui.widget.BaseTextView;

import butterknife.BindView;
import butterknife.OnClick;

public class ConfirmDialogActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_dialog);

        initData();

        initLayout();
    }

    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
        overridePendingTransition(R.anim.fade, R.anim.hold);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.hold, R.anim.fadeout);
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    }

    private SpannableString _strContent;
    private String _strNo;
    private String _strYes;

    private void initData() {

        Intent intent = getIntent();

        String content = intent.getStringExtra("content");
        _strNo = intent.getStringExtra("no");
        _strYes = intent.getStringExtra("yes");

        int start = intent.getIntExtra("span_start", 0);
        int end = intent.getIntExtra("span_end", 0);

        _strContent = new SpannableString(content);
        ForegroundColorSpan colorSpan = new ForegroundColorSpan(0xff545ac0);
        _strContent.setSpan(colorSpan, start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
    }

    @BindView(R.id.txv_content)
    BaseTextView ui_txvContent;

    @BindView(R.id.txv_no)
    BaseTextView ui_txvNo;

    @BindView(R.id.txv_yes)
    BaseTextView ui_txvYes;

    private void initLayout() {

        ui_txvContent.setText(_strContent, TextView.BufferType.SPANNABLE);
        ui_txvNo.setText(_strNo);
        ui_txvYes.setText(_strYes);
    }

    @OnClick(R.id.txv_no)
    void OnClickNo() {
        setResult(RESULT_CANCELED);
        finish();
    }

    @OnClick(R.id.txv_yes)
    void OnClickYes() {
        setResult(RESULT_OK);
        finish();
    }

    @OnClick(R.id.fly_bg)
    void OnClickWholeBg() {
//        setResult(RESULT_CANCELED);
//        finish();
    }

    @OnClick(R.id.lly_bg)
    void OnClickBg() {

    }
}
