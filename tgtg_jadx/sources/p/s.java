package p;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class s extends MultiAutoCompleteTextView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f33999d = {R.attr.popupBackground};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f34000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0 f34001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f34002c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        v2.a(context);
        u2.a(getContext(), this);
        j30.g gVarT = j30.g.t(getContext(), attributeSet, f33999d, i11);
        if (((TypedArray) gVarT.f24503c).hasValue(0)) {
            setDropDownBackgroundDrawable(gVarT.k(0));
        }
        gVarT.v();
        k kVar = new k(this);
        this.f34000a = kVar;
        kVar.d(attributeSet, i11);
        p0 p0Var = new p0(this);
        this.f34001b = p0Var;
        p0Var.f(attributeSet, i11);
        p0Var.b();
        p pVar = new p(this);
        this.f34002c = pVar;
        pVar.b(attributeSet, i11);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerA = pVar.a(keyListener);
        if (keyListenerA == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerA);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        k kVar = this.f34000a;
        if (kVar != null) {
            kVar.a();
        }
        p0 p0Var = this.f34001b;
        if (p0Var != null) {
            p0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        k kVar = this.f34000a;
        if (kVar != null) {
            return kVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        k kVar = this.f34000a;
        if (kVar != null) {
            return kVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f34001b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f34001b.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        h0.g.A(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.f34002c.c(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        k kVar = this.f34000a;
        if (kVar != null) {
            kVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        k kVar = this.f34000a;
        if (kVar != null) {
            kVar.f(i11);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        p0 p0Var = this.f34001b;
        if (p0Var != null) {
            p0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        p0 p0Var = this.f34001b;
        if (p0Var != null) {
            p0Var.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i11) {
        setDropDownBackgroundDrawable(b0.a0.x(getContext(), i11));
    }

    public void setEmojiCompatEnabled(boolean z11) {
        this.f34002c.d(z11);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f34002c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        k kVar = this.f34000a;
        if (kVar != null) {
            kVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        k kVar = this.f34000a;
        if (kVar != null) {
            kVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        p0 p0Var = this.f34001b;
        p0Var.k(colorStateList);
        p0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        p0 p0Var = this.f34001b;
        p0Var.l(mode);
        p0Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i11) {
        super.setTextAppearance(context, i11);
        p0 p0Var = this.f34001b;
        if (p0Var != null) {
            p0Var.g(context, i11);
        }
    }

    public s(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.app.tgtg.R.attr.autoCompleteTextViewStyle);
    }

    public s(@NonNull Context context) {
        this(context, null);
    }
}
