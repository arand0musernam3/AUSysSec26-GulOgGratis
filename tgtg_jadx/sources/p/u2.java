package p;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f34029a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f34030b = {-16842910};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f34031c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f34032d = {R.attr.state_pressed};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f34033e = {R.attr.state_checked};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f34034f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f34035g = new int[1];

    public static void a(Context context, View view) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(j.a.f24262j);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i11) {
        ColorStateList colorStateListD = d(context, i11);
        if (colorStateListD != null && colorStateListD.isStateful()) {
            return colorStateListD.getColorForState(f34030b, colorStateListD.getDefaultColor());
        }
        ThreadLocal threadLocal = f34029a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f11 = typedValue.getFloat();
        return x6.c.e(c(context, i11), Math.round(Color.alpha(r4) * f11));
    }

    public static int c(Context context, int i11) {
        int[] iArr = f34035g;
        iArr[0] = i11;
        j30.g gVarS = j30.g.s(context, null, iArr);
        try {
            return ((TypedArray) gVarS.f24503c).getColor(0, 0);
        } finally {
            gVarS.v();
        }
    }

    public static ColorStateList d(Context context, int i11) {
        int[] iArr = f34035g;
        iArr[0] = i11;
        j30.g gVarS = j30.g.s(context, null, iArr);
        try {
            return gVarS.j(0);
        } finally {
            gVarS.v();
        }
    }
}
