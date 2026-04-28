package i7;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f23474a;

    public d(AccessibilityNodeInfo.CollectionInfo collectionInfo) {
        this.f23474a = collectionInfo;
    }

    public static d a(int i11, int i12, int i13, boolean z11) {
        return new d(AccessibilityNodeInfo.CollectionInfo.obtain(i11, i12, z11, i13));
    }
}
