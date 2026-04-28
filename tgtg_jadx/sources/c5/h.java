package c5;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccessibilityManager f7243a;

    public h(Context context) {
        Object systemService = context.getSystemService("accessibility");
        systemService.getClass();
        this.f7243a = (AccessibilityManager) systemService;
    }
}
