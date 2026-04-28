package androidx.fragment.app;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o2 {
    public static q2 a(View view) {
        view.getClass();
        return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? q2.INVISIBLE : b(view.getVisibility());
    }

    public static q2 b(int i11) {
        if (i11 == 0) {
            return q2.VISIBLE;
        }
        if (i11 == 4) {
            return q2.INVISIBLE;
        }
        if (i11 == 8) {
            return q2.GONE;
        }
        i4.a.f(j4.s.f(i11, "Unknown visibility "));
        return null;
    }
}
