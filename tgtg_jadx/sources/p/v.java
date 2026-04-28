package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.annotation.NonNull;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class v extends RadioButton implements m7.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m3.v1 f34036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f34037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p0 f34038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q f34039d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        v2.a(context);
        u2.a(getContext(), this);
        m3.v1 v1Var = new m3.v1(this);
        this.f34036a = v1Var;
        v1Var.d(attributeSet, i11);
        k kVar = new k(this);
        this.f34037b = kVar;
        kVar.d(attributeSet, i11);
        p0 p0Var = new p0(this);
        this.f34038c = p0Var;
        p0Var.f(attributeSet, i11);
        getEmojiTextViewHelper().b(attributeSet, i11);
    }

    @NonNull
    private q getEmojiTextViewHelper() {
        if (this.f34039d == null) {
            this.f34039d = new q(this);
        }
        return this.f34039d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        k kVar = this.f34037b;
        if (kVar != null) {
            kVar.a();
        }
        p0 p0Var = this.f34038c;
        if (p0Var != null) {
            p0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        k kVar = this.f34037b;
        if (kVar != null) {
            return kVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        k kVar = this.f34037b;
        if (kVar != null) {
            return kVar.c();
        }
        return null;
    }

    @Override // m7.i
    public ColorStateList getSupportButtonTintList() {
        m3.v1 v1Var = this.f34036a;
        if (v1Var != null) {
            return (ColorStateList) v1Var.f29470e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        m3.v1 v1Var = this.f34036a;
        if (v1Var != null) {
            return (PorterDuff.Mode) v1Var.f29471f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f34038c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f34038c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z11) {
        super.setAllCaps(z11);
        getEmojiTextViewHelper().c(z11);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        k kVar = this.f34037b;
        if (kVar != null) {
            kVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        k kVar = this.f34037b;
        if (kVar != null) {
            kVar.f(i11);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        m3.v1 v1Var = this.f34036a;
        if (v1Var != null) {
            if (v1Var.f29468c) {
                v1Var.f29468c = false;
            } else {
                v1Var.f29468c = true;
                v1Var.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        p0 p0Var = this.f34038c;
        if (p0Var != null) {
            p0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        p0 p0Var = this.f34038c;
        if (p0Var != null) {
            p0Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z11) {
        getEmojiTextViewHelper().d(z11);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        k kVar = this.f34037b;
        if (kVar != null) {
            kVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        k kVar = this.f34037b;
        if (kVar != null) {
            kVar.i(mode);
        }
    }

    @Override // m7.i
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        m3.v1 v1Var = this.f34036a;
        if (v1Var != null) {
            v1Var.f29470e = colorStateList;
            v1Var.f29466a = true;
            v1Var.a();
        }
    }

    @Override // m7.i
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        m3.v1 v1Var = this.f34036a;
        if (v1Var != null) {
            v1Var.f29471f = mode;
            v1Var.f29467b = true;
            v1Var.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        p0 p0Var = this.f34038c;
        p0Var.k(colorStateList);
        p0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        p0 p0Var = this.f34038c;
        p0Var.l(mode);
        p0Var.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i11) {
        setButtonDrawable(b0.a0.x(getContext(), i11));
    }

    public v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.radioButtonStyle);
    }

    public v(Context context) {
        this(context, null);
    }
}
