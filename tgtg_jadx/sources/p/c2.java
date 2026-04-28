package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.app.tgtg.R;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static c2 f33867g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakHashMap f33869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f33870b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f33871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f33872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public zw.q2 f33873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f33866f = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b2 f33868h = new b2(6);

    public static synchronized c2 c() {
        try {
            if (f33867g == null) {
                f33867g = new c2();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f33867g;
    }

    public static synchronized PorterDuffColorFilter f(int i11, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        b2 b2Var = f33868h;
        b2Var.getClass();
        int i12 = (31 + i11) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) b2Var.c(Integer.valueOf(mode.hashCode() + i12));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i11, mode);
        }
        return porterDuffColorFilter;
    }

    public final void a(Context context, int i11, ColorStateList colorStateList) {
        if (this.f33869a == null) {
            this.f33869a = new WeakHashMap();
        }
        q1.l1 l1Var = (q1.l1) this.f33869a.get(context);
        if (l1Var == null) {
            l1Var = new q1.l1(0);
            this.f33869a.put(context, l1Var);
        }
        int i12 = l1Var.f35788d;
        if (i12 != 0 && i11 <= l1Var.f35786b[i12 - 1]) {
            l1Var.d(i11, colorStateList);
            return;
        }
        if (l1Var.f35785a && i12 >= l1Var.f35786b.length) {
            q1.a0.a(l1Var);
        }
        int i13 = l1Var.f35788d;
        if (i13 >= l1Var.f35786b.length) {
            int i14 = (i13 + 1) * 4;
            int i15 = 4;
            while (true) {
                if (i15 >= 32) {
                    break;
                }
                int i16 = (1 << i15) - 12;
                if (i14 <= i16) {
                    i14 = i16;
                    break;
                }
                i15++;
            }
            int i17 = i14 / 4;
            l1Var.f35786b = Arrays.copyOf(l1Var.f35786b, i17);
            l1Var.f35787c = Arrays.copyOf(l1Var.f35787c, i17);
        }
        l1Var.f35786b[i13] = i11;
        l1Var.f35787c[i13] = colorStateList;
        l1Var.f35788d = i13 + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable b(android.content.Context r7, int r8) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p.c2.b(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    public final synchronized Drawable d(Context context, int i11) {
        return e(context, i11, false);
    }

    public final synchronized Drawable e(Context context, int i11, boolean z11) {
        Drawable drawableB;
        try {
            if (!this.f33872d) {
                this.f33872d = true;
                Drawable drawableD = d(context, R.drawable.abc_vector_test);
                if (drawableD == null || (!(drawableD instanceof androidx.vectordrawable.graphics.drawable.r) && !"android.graphics.drawable.VectorDrawable".equals(drawableD.getClass().getName()))) {
                    this.f33872d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableB = b(context, i11);
            if (drawableB == null) {
                drawableB = context.getDrawable(i11);
            }
            if (drawableB != null) {
                drawableB = h(context, i11, z11, drawableB);
            }
            if (drawableB != null) {
                e1.a(drawableB);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return drawableB;
    }

    public final synchronized ColorStateList g(Context context, int i11) {
        ColorStateList colorStateList;
        q1.l1 l1Var;
        WeakHashMap weakHashMap = this.f33869a;
        ColorStateList colorStateListL = null;
        colorStateList = (weakHashMap == null || (l1Var = (q1.l1) weakHashMap.get(context)) == null) ? null : (ColorStateList) l1Var.b(i11);
        if (colorStateList == null) {
            zw.q2 q2Var = this.f33873e;
            if (q2Var != null) {
                colorStateListL = q2Var.L(context, i11);
            }
            if (colorStateListL != null) {
                a(context, i11, colorStateListL);
            }
            colorStateList = colorStateListL;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable h(android.content.Context r10, int r11, boolean r12, android.graphics.drawable.Drawable r13) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p.c2.h(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
