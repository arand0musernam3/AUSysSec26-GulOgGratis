package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.ViewCompat;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f33917a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ax.f0 f33920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ax.f0 f33921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ax.f0 f33922f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f33919c = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f33918b = m.a();

    public k(View view) {
        this.f33917a = view;
    }

    public final void a() {
        View view = this.f33917a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f33920d != null) {
                if (this.f33922f == null) {
                    this.f33922f = new ax.f0();
                }
                ax.f0 f0Var = this.f33922f;
                f0Var.f4906c = null;
                f0Var.f4905b = false;
                f0Var.f4907d = null;
                f0Var.f4904a = false;
                ColorStateList colorStateListL = ViewCompat.l(view);
                if (colorStateListL != null) {
                    f0Var.f4905b = true;
                    f0Var.f4906c = colorStateListL;
                }
                PorterDuff.Mode modeM = ViewCompat.m(view);
                if (modeM != null) {
                    f0Var.f4904a = true;
                    f0Var.f4907d = modeM;
                }
                if (f0Var.f4905b || f0Var.f4904a) {
                    m.e(background, f0Var, view.getDrawableState());
                    return;
                }
            }
            ax.f0 f0Var2 = this.f33921e;
            if (f0Var2 != null) {
                m.e(background, f0Var2, view.getDrawableState());
                return;
            }
            ax.f0 f0Var3 = this.f33920d;
            if (f0Var3 != null) {
                m.e(background, f0Var3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        ax.f0 f0Var = this.f33921e;
        if (f0Var != null) {
            return (ColorStateList) f0Var.f4906c;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        ax.f0 f0Var = this.f33921e;
        if (f0Var != null) {
            return (PorterDuff.Mode) f0Var.f4907d;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i11) {
        ColorStateList colorStateListG;
        View view = this.f33917a;
        Context context = view.getContext();
        int[] iArr = j.a.B;
        j30.g gVarT = j30.g.t(context, attributeSet, iArr, i11);
        TypedArray typedArray = (TypedArray) gVarT.f24503c;
        View view2 = this.f33917a;
        ViewCompat.a0(view2, view2.getContext(), iArr, attributeSet, (TypedArray) gVarT.f24503c, i11, 0);
        try {
            if (typedArray.hasValue(0)) {
                this.f33919c = typedArray.getResourceId(0, -1);
                m mVar = this.f33918b;
                Context context2 = view.getContext();
                int i12 = this.f33919c;
                synchronized (mVar) {
                    colorStateListG = mVar.f33947a.g(context2, i12);
                }
                if (colorStateListG != null) {
                    g(colorStateListG);
                }
            }
            if (typedArray.hasValue(1)) {
                ViewCompat.f0(view, gVarT.j(1));
            }
            if (typedArray.hasValue(2)) {
                ViewCompat.g0(view, e1.c(typedArray.getInt(2, -1), null));
            }
            gVarT.v();
        } catch (Throwable th2) {
            gVarT.v();
            throw th2;
        }
    }

    public final void e() {
        this.f33919c = -1;
        g(null);
        a();
    }

    public final void f(int i11) {
        ColorStateList colorStateListG;
        this.f33919c = i11;
        m mVar = this.f33918b;
        if (mVar != null) {
            Context context = this.f33917a.getContext();
            synchronized (mVar) {
                colorStateListG = mVar.f33947a.g(context, i11);
            }
        } else {
            colorStateListG = null;
        }
        g(colorStateListG);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f33920d == null) {
                this.f33920d = new ax.f0();
            }
            ax.f0 f0Var = this.f33920d;
            f0Var.f4906c = colorStateList;
            f0Var.f4905b = true;
        } else {
            this.f33920d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f33921e == null) {
            this.f33921e = new ax.f0();
        }
        ax.f0 f0Var = this.f33921e;
        f0Var.f4906c = colorStateList;
        f0Var.f4905b = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f33921e == null) {
            this.f33921e = new ax.f0();
        }
        ax.f0 f0Var = this.f33921e;
        f0Var.f4907d = mode;
        f0Var.f4904a = true;
        a();
    }
}
