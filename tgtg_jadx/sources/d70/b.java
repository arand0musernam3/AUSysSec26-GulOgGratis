package d70;

import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import j80.c;
import u70.l;
import u70.t;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f14569a = l.b(new cu.a(17));

    public static final int a(int i11) {
        return (int) (i11 * Resources.getSystem().getDisplayMetrics().density);
    }

    public static final int b(Integer num) {
        float fFloatValue = num.floatValue();
        Object value = f14569a.getValue();
        value.getClass();
        return c.b(fFloatValue * ((DisplayMetrics) value).density);
    }

    public static final Rect c() {
        Object value = f14569a.getValue();
        value.getClass();
        DisplayMetrics displayMetrics = (DisplayMetrics) value;
        return new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static final float d(float f11) {
        return f11 * Resources.getSystem().getDisplayMetrics().density;
    }
}
