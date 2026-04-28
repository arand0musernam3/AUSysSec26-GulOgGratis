package p;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f33881a = {R.attr.state_checked};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f33882b = new int[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Rect f33883c = new Rect();

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 29 || i11 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f33881a);
        } else {
            drawable.setState(f33882b);
        }
        drawable.setState(state);
    }

    public static Rect b(Drawable drawable) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            Insets insetsA = d1.a(drawable);
            return new Rect(insetsA.left, insetsA.top, insetsA.right, insetsA.bottom);
        }
        if (i11 >= 29) {
            boolean z11 = c1.f33860a;
        } else if (c1.f33860a) {
            try {
                Object objInvoke = c1.f33861b.invoke(drawable, null);
                if (objInvoke != null) {
                    return new Rect(c1.f33862c.getInt(objInvoke), c1.f33863d.getInt(objInvoke), c1.f33864e.getInt(objInvoke), c1.f33865f.getInt(objInvoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return f33883c;
    }

    public static PorterDuff.Mode c(int i11, PorterDuff.Mode mode) {
        if (i11 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i11 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i11 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i11) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
