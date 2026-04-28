package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.annotation.NonNull;
import com.app.tgtg.R;
import p.g3;
import p.k;
import p.p0;
import p.q;
import p.u2;
import p.v2;
import p.x0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatButton extends Button {

    @NonNull
    private q mAppCompatEmojiTextHelper;
    private final k mBackgroundTintHelper;
    private final p0 mTextHelper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatButton(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        v2.a(context);
        u2.a(getContext(), this);
        k kVar = new k(this);
        this.mBackgroundTintHelper = kVar;
        kVar.d(attributeSet, i11);
        p0 p0Var = new p0(this);
        this.mTextHelper = p0Var;
        p0Var.f(attributeSet, i11);
        p0Var.b();
        getEmojiTextViewHelper().b(attributeSet, i11);
    }

    @NonNull
    private q getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new q(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        k kVar = this.mBackgroundTintHelper;
        if (kVar != null) {
            kVar.a();
        }
        p0 p0Var = this.mTextHelper;
        if (p0Var != null) {
            p0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (g3.f33906c) {
            return super.getAutoSizeMaxTextSize();
        }
        p0 p0Var = this.mTextHelper;
        if (p0Var != null) {
            return Math.round(p0Var.f33975i.f34072e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (g3.f33906c) {
            return super.getAutoSizeMinTextSize();
        }
        p0 p0Var = this.mTextHelper;
        if (p0Var != null) {
            return Math.round(p0Var.f33975i.f34071d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (g3.f33906c) {
            return super.getAutoSizeStepGranularity();
        }
        p0 p0Var = this.mTextHelper;
        if (p0Var != null) {
            return Math.round(p0Var.f33975i.f34070c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (g3.f33906c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        p0 p0Var = this.mTextHelper;
        return p0Var != null ? p0Var.f33975i.f34073f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (g3.f33906c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        p0 p0Var = this.mTextHelper;
        if (p0Var != null) {
            return p0Var.f33975i.f34068a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return android.support.v4.media.session.a.P(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        k kVar = this.mBackgroundTintHelper;
        if (kVar != null) {
            return kVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        k kVar = this.mBackgroundTintHelper;
        if (kVar != null) {
            return kVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.e();
    }

    public boolean isEmojiCompatEnabled() {
        return ((w.b) getEmojiTextViewHelper().f33981b.f24851a).S();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        p0 p0Var = this.mTextHelper;
        if (p0Var == null || g3.f33906c) {
            return;
        }
        p0Var.f33975i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        super.onTextChanged(charSequence, i11, i12, i13);
        p0 p0Var = this.mTextHelper;
        if (p0Var == null || g3.f33906c || !p0Var.f33975i.f()) {
            return;
        }
        this.mTextHelper.f33975i.a();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z11) {
        super.setAllCaps(z11);
        getEmojiTextViewHelper().c(z11);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i11, int i12, int i13, int i14) throws IllegalArgumentException {
        if (g3.f33906c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i11, i12, i13, i14);
            return;
        }
        p0 p0Var = this.mTextHelper;
        if (p0Var != null) {
            p0Var.h(i11, i12, i13, i14);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] iArr, int i11) throws IllegalArgumentException {
        if (g3.f33906c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i11);
            return;
        }
        p0 p0Var = this.mTextHelper;
        if (p0Var != null) {
            p0Var.i(iArr, i11);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i11) {
        if (g3.f33906c) {
            super.setAutoSizeTextTypeWithDefaults(i11);
            return;
        }
        p0 p0Var = this.mTextHelper;
        if (p0Var != null) {
            p0Var.j(i11);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        k kVar = this.mBackgroundTintHelper;
        if (kVar != null) {
            kVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        k kVar = this.mBackgroundTintHelper;
        if (kVar != null) {
            kVar.f(i11);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(android.support.v4.media.session.a.Q(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z11) {
        getEmojiTextViewHelper().d(z11);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z11) {
        p0 p0Var = this.mTextHelper;
        if (p0Var != null) {
            p0Var.f33967a.setAllCaps(z11);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        k kVar = this.mBackgroundTintHelper;
        if (kVar != null) {
            kVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        k kVar = this.mBackgroundTintHelper;
        if (kVar != null) {
            kVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.k(colorStateList);
        this.mTextHelper.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.l(mode);
        this.mTextHelper.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i11) {
        super.setTextAppearance(context, i11);
        p0 p0Var = this.mTextHelper;
        if (p0Var != null) {
            p0Var.g(context, i11);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i11, float f11) {
        boolean z11 = g3.f33906c;
        if (z11) {
            super.setTextSize(i11, f11);
            return;
        }
        p0 p0Var = this.mTextHelper;
        if (p0Var != null) {
            x0 x0Var = p0Var.f33975i;
            if (z11 || x0Var.f()) {
                return;
            }
            x0Var.g(f11, i11);
        }
    }

    public AppCompatButton(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    public AppCompatButton(@NonNull Context context) {
        this(context, null);
    }
}
