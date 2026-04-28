package i3;

import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;
import m3.k1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements AccessibilityManager$AccessibilityServicesStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1 f23188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k1 f23189b;

    public w(y yVar) {
        Boolean bool = Boolean.FALSE;
        this.f23188a = m3.i.w(bool);
        this.f23189b = m3.i.w(bool);
    }

    public final void onAccessibilityServicesStateChanged(AccessibilityManager accessibilityManager) {
        this.f23188a.setValue(Boolean.valueOf(y.b(accessibilityManager)));
        this.f23189b.setValue(Boolean.valueOf(y.d(accessibilityManager)));
    }
}
