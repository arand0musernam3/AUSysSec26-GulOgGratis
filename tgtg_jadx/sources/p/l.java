package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class l extends CheckedTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m3.v1 f33937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f33938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p0 f33939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q f33940d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@NonNull Context context, AttributeSet attributeSet, int i11) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, i11);
        v2.a(context);
        u2.a(getContext(), this);
        p0 p0Var = new p0(this);
        this.f33939c = p0Var;
        p0Var.f(attributeSet, i11);
        p0Var.b();
        k kVar = new k(this);
        this.f33938b = kVar;
        kVar.d(attributeSet, i11);
        this.f33937a = new m3.v1(this);
        Context context2 = getContext();
        int[] iArr = j.a.l;
        j30.g gVarT = j30.g.t(context2, attributeSet, iArr, i11);
        TypedArray typedArray = (TypedArray) gVarT.f24503c;
        ViewCompat.a0(this, getContext(), iArr, attributeSet, (TypedArray) gVarT.f24503c, i11, 0);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(b0.a0.x(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(b0.a0.x(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(b0.a0.x(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(gVarT.j(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(e1.c(typedArray.getInt(3, -1), null));
            }
            gVarT.v();
            getEmojiTextViewHelper().b(attributeSet, i11);
        } catch (Throwable th2) {
            gVarT.v();
            throw th2;
        }
    }

    @NonNull
    private q getEmojiTextViewHelper() {
        if (this.f33940d == null) {
            this.f33940d = new q(this);
        }
        return this.f33940d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        p0 p0Var = this.f33939c;
        if (p0Var != null) {
            p0Var.b();
        }
        k kVar = this.f33938b;
        if (kVar != null) {
            kVar.a();
        }
        m3.v1 v1Var = this.f33937a;
        if (v1Var != null) {
            v1Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return android.support.v4.media.session.a.P(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        k kVar = this.f33938b;
        if (kVar != null) {
            return kVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        k kVar = this.f33938b;
        if (kVar != null) {
            return kVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        m3.v1 v1Var = this.f33937a;
        if (v1Var != null) {
            return (ColorStateList) v1Var.f29470e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        m3.v1 v1Var = this.f33937a;
        if (v1Var != null) {
            return (PorterDuff.Mode) v1Var.f29471f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f33939c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f33939c.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        h0.g.A(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z11) {
        super.setAllCaps(z11);
        getEmojiTextViewHelper().c(z11);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        k kVar = this.f33938b;
        if (kVar != null) {
            kVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        k kVar = this.f33938b;
        if (kVar != null) {
            kVar.f(i11);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        m3.v1 v1Var = this.f33937a;
        if (v1Var != null) {
            if (v1Var.f29468c) {
                v1Var.f29468c = false;
            } else {
                v1Var.f29468c = true;
                v1Var.b();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        p0 p0Var = this.f33939c;
        if (p0Var != null) {
            p0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        p0 p0Var = this.f33939c;
        if (p0Var != null) {
            p0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(android.support.v4.media.session.a.Q(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z11) {
        getEmojiTextViewHelper().d(z11);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        k kVar = this.f33938b;
        if (kVar != null) {
            kVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        k kVar = this.f33938b;
        if (kVar != null) {
            kVar.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        m3.v1 v1Var = this.f33937a;
        if (v1Var != null) {
            v1Var.f29470e = colorStateList;
            v1Var.f29466a = true;
            v1Var.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        m3.v1 v1Var = this.f33937a;
        if (v1Var != null) {
            v1Var.f29471f = mode;
            v1Var.f29467b = true;
            v1Var.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        p0 p0Var = this.f33939c;
        p0Var.k(colorStateList);
        p0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        p0 p0Var = this.f33939c;
        p0Var.l(mode);
        p0Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(@NonNull Context context, int i11) {
        super.setTextAppearance(context, i11);
        p0 p0Var = this.f33939c;
        if (p0Var != null) {
            p0Var.g(context, i11);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i11) {
        setCheckMarkDrawable(b0.a0.x(getContext(), i11));
    }

    public l(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkedTextViewStyle);
    }

    public l(@NonNull Context context) {
        this(context, null);
    }
}
