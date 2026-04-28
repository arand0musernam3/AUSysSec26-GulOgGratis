package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f33967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ax.f0 f33968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ax.f0 f33969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ax.f0 f33970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ax.f0 f33971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ax.f0 f33972f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ax.f0 f33973g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ax.f0 f33974h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final x0 f33975i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f33976j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f33977k = -1;
    public Typeface l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f33978m;

    public p0(TextView textView) {
        this.f33967a = textView;
        this.f33975i = new x0(textView);
    }

    public static ax.f0 c(Context context, m mVar, int i11) {
        ColorStateList colorStateListG;
        synchronized (mVar) {
            colorStateListG = mVar.f33947a.g(context, i11);
        }
        if (colorStateListG == null) {
            return null;
        }
        ax.f0 f0Var = new ax.f0();
        f0Var.f4905b = true;
        f0Var.f4906c = colorStateListG;
        return f0Var;
    }

    public final void a(Drawable drawable, ax.f0 f0Var) {
        if (drawable == null || f0Var == null) {
            return;
        }
        m.e(drawable, f0Var, this.f33967a.getDrawableState());
    }

    public final void b() {
        ax.f0 f0Var = this.f33968b;
        TextView textView = this.f33967a;
        if (f0Var != null || this.f33969c != null || this.f33970d != null || this.f33971e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f33968b);
            a(compoundDrawables[1], this.f33969c);
            a(compoundDrawables[2], this.f33970d);
            a(compoundDrawables[3], this.f33971e);
        }
        if (this.f33972f == null && this.f33973g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f33972f);
        a(compoundDrawablesRelative[2], this.f33973g);
    }

    public final ColorStateList d() {
        ax.f0 f0Var = this.f33974h;
        if (f0Var != null) {
            return (ColorStateList) f0Var.f4906c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        ax.f0 f0Var = this.f33974h;
        if (f0Var != null) {
            return (PorterDuff.Mode) f0Var.f4907d;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:243:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(android.util.AttributeSet r26, int r27) {
        /*
            Method dump skipped, instruction units count: 974
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p.p0.f(android.util.AttributeSet, int):void");
    }

    public final void g(Context context, int i11) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i11, j.a.f24276y);
        j30.g gVar = new j30.g(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f33967a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m(context, gVar);
        if (typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            n0.d(textView, string);
        }
        gVar.v();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f33976j);
        }
    }

    public final void h(int i11, int i12, int i13, int i14) {
        x0 x0Var = this.f33975i;
        if (x0Var.j()) {
            DisplayMetrics displayMetrics = x0Var.f34077j.getResources().getDisplayMetrics();
            x0Var.k(TypedValue.applyDimension(i14, i11, displayMetrics), TypedValue.applyDimension(i14, i12, displayMetrics), TypedValue.applyDimension(i14, i13, displayMetrics));
            if (x0Var.h()) {
                x0Var.a();
            }
        }
    }

    public final void i(int[] iArr, int i11) {
        x0 x0Var = this.f33975i;
        if (x0Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i11 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = x0Var.f34077j.getResources().getDisplayMetrics();
                    for (int i12 = 0; i12 < length; i12++) {
                        iArrCopyOf[i12] = Math.round(TypedValue.applyDimension(i11, iArr[i12], displayMetrics));
                    }
                }
                x0Var.f34073f = x0.b(iArrCopyOf);
                if (!x0Var.i()) {
                    j4.d.t(Arrays.toString(iArr), "None of the preset sizes is valid: ");
                    return;
                }
            } else {
                x0Var.f34074g = false;
            }
            if (x0Var.h()) {
                x0Var.a();
            }
        }
    }

    public final void j(int i11) {
        x0 x0Var = this.f33975i;
        if (x0Var.j()) {
            if (i11 == 0) {
                x0Var.f34068a = 0;
                x0Var.f34071d = -1.0f;
                x0Var.f34072e = -1.0f;
                x0Var.f34070c = -1.0f;
                x0Var.f34073f = new int[0];
                x0Var.f34069b = false;
                return;
            }
            if (i11 != 1) {
                i4.a.f(j4.s.f(i11, "Unknown auto-size text type: "));
                return;
            }
            DisplayMetrics displayMetrics = x0Var.f34077j.getResources().getDisplayMetrics();
            x0Var.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (x0Var.h()) {
                x0Var.a();
            }
        }
    }

    public final void k(ColorStateList colorStateList) {
        if (this.f33974h == null) {
            this.f33974h = new ax.f0();
        }
        ax.f0 f0Var = this.f33974h;
        f0Var.f4906c = colorStateList;
        f0Var.f4905b = colorStateList != null;
        this.f33968b = f0Var;
        this.f33969c = f0Var;
        this.f33970d = f0Var;
        this.f33971e = f0Var;
        this.f33972f = f0Var;
        this.f33973g = f0Var;
    }

    public final void l(PorterDuff.Mode mode) {
        if (this.f33974h == null) {
            this.f33974h = new ax.f0();
        }
        ax.f0 f0Var = this.f33974h;
        f0Var.f4907d = mode;
        f0Var.f4904a = mode != null;
        this.f33968b = f0Var;
        this.f33969c = f0Var;
        this.f33970d = f0Var;
        this.f33971e = f0Var;
        this.f33972f = f0Var;
        this.f33973g = f0Var;
    }

    public final void m(Context context, j30.g gVar) {
        String string;
        int i11 = this.f33976j;
        TypedArray typedArray = (TypedArray) gVar.f24503c;
        this.f33976j = typedArray.getInt(2, i11);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 28) {
            int i13 = typedArray.getInt(11, -1);
            this.f33977k = i13;
            if (i13 != -1) {
                this.f33976j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f33978m = false;
                int i14 = typedArray.getInt(1, 1);
                if (i14 == 1) {
                    this.l = Typeface.SANS_SERIF;
                    return;
                } else if (i14 == 2) {
                    this.l = Typeface.SERIF;
                    return;
                } else {
                    if (i14 != 3) {
                        return;
                    }
                    this.l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.l = null;
        int i15 = typedArray.hasValue(12) ? 12 : 10;
        int i16 = this.f33977k;
        int i17 = this.f33976j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM = gVar.m(i15, this.f33976j, new l0(this, i16, i17, new WeakReference(this.f33967a)));
                if (typefaceM != null) {
                    if (i12 < 28 || this.f33977k == -1) {
                        this.l = typefaceM;
                    } else {
                        this.l = o0.a(Typeface.create(typefaceM, 0), this.f33977k, (this.f33976j & 2) != 0);
                    }
                }
                this.f33978m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (string = typedArray.getString(i15)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f33977k == -1) {
            this.l = Typeface.create(string, this.f33976j);
        } else {
            this.l = o0.a(Typeface.create(string, 0), this.f33977k, (this.f33976j & 2) != 0);
        }
    }
}
