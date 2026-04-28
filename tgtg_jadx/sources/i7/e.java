package i7;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f23475a;

    public e(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        this.f23475a = collectionItemInfo;
    }

    public static e a(int i11, int i12, int i13, int i14, boolean z11, boolean z12) {
        return new e(AccessibilityNodeInfo.CollectionItemInfo.obtain(i11, i12, i13, i14, z11, z12));
    }
}
