package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.app.tgtg.R;
import com.braze.ui.inappmessage.views.c;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import h7.b;
import t20.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f12689e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Chip f12690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EditText f12691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f12692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f12693d;

    public ChipTextInputComboView(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.f12690a = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        EditText editText = textInputLayout.getEditText();
        this.f12691b = editText;
        editText.setVisibility(4);
        j jVar = new j(this, 1);
        this.f12692c = jVar;
        editText.addTextChangedListener(jVar);
        editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(R.id.material_label);
        this.f12693d = textView;
        editText.setId(View.generateViewId());
        textView.setLabelFor(editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    public final String a(CharSequence charSequence) {
        try {
            return String.format(getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f12690a.isChecked();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f12691b.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z11) {
        Chip chip = this.f12690a;
        chip.setChecked(z11);
        int i11 = z11 ? 0 : 4;
        EditText editText = this.f12691b;
        editText.setVisibility(i11);
        chip.setVisibility(z11 ? 8 : 0);
        if (chip.isChecked()) {
            editText.requestFocus();
            editText.post(new c(1, editText));
        }
    }

    public void setChipDelegate(b bVar) {
        ViewCompat.b0(this.f12690a, bVar);
    }

    public void setCursorVisible(boolean z11) {
        this.f12691b.setCursorVisible(z11);
    }

    public void setHelperText(CharSequence charSequence) {
        this.f12693d.setText(charSequence);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f12690a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i11, Object obj) {
        this.f12690a.setTag(i11, obj);
    }

    public void setText(CharSequence charSequence) {
        String strA = a(charSequence);
        this.f12690a.setText(strA);
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        EditText editText = this.f12691b;
        j jVar = this.f12692c;
        editText.removeTextChangedListener(jVar);
        editText.setText(strA);
        editText.addTextChangedListener(jVar);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.f12690a.toggle();
    }

    public ChipTextInputComboView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChipTextInputComboView(@NonNull Context context) {
        this(context, null);
    }
}
