package z7;

import android.graphics.Rect;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.Comparator;
import y00.d0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f47317a = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f47318b = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f47319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d0 f47320d;

    public b(boolean z11, d0 d0Var) {
        this.f47319c = z11;
        this.f47320d = d0Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f47320d.getClass();
        Rect rect = this.f47317a;
        ((AccessibilityNodeInfoCompat) obj).k(rect);
        Rect rect2 = this.f47318b;
        ((AccessibilityNodeInfoCompat) obj2).k(rect2);
        int i11 = rect.top;
        int i12 = rect2.top;
        if (i11 < i12) {
            return -1;
        }
        if (i11 > i12) {
            return 1;
        }
        int i13 = rect.left;
        int i14 = rect2.left;
        boolean z11 = this.f47319c;
        if (i13 < i14) {
            return z11 ? 1 : -1;
        }
        if (i13 > i14) {
            return z11 ? -1 : 1;
        }
        int i15 = rect.bottom;
        int i16 = rect2.bottom;
        if (i15 < i16) {
            return -1;
        }
        if (i15 > i16) {
            return 1;
        }
        int i17 = rect.right;
        int i18 = rect2.right;
        if (i17 < i18) {
            return z11 ? 1 : -1;
        }
        if (i17 > i18) {
            return z11 ? -1 : 1;
        }
        return 0;
    }
}
