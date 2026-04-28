package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.app.tgtg.R;
import k10.a;
import ox.h;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f12605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Button f12606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeInterpolator f12607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12608d;

    public SnackbarContentLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12607c = h.Q(context, R.attr.motionEasingEmphasizedInterpolator, a.f25731b);
    }

    public final boolean a(int i11, int i12, int i13) {
        boolean z11;
        if (i11 != getOrientation()) {
            setOrientation(i11);
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f12605a.getPaddingTop() == i12 && this.f12605a.getPaddingBottom() == i13) {
            return z11;
        }
        TextView textView = this.f12605a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i12, textView.getPaddingEnd(), i13);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i12, textView.getPaddingRight(), i13);
        return true;
    }

    public Button getActionView() {
        return this.f12606b;
    }

    public TextView getMessageView() {
        return this.f12605a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f12605a = (TextView) findViewById(R.id.snackbar_text);
        this.f12606b = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f12605a.getLayout();
        boolean z11 = layout != null && layout.getLineCount() > 1;
        if (!z11 || this.f12608d <= 0 || this.f12606b.getMeasuredWidth() <= this.f12608d) {
            if (!z11) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i11, i12);
    }

    public void setMaxInlineActionWidth(int i11) {
        this.f12608d = i11;
    }

    public SnackbarContentLayout(@NonNull Context context) {
        this(context, null);
    }
}
