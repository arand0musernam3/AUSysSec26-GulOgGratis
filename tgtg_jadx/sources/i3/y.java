package i3;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import java.util.List;
import kotlin.text.StringsKt;
import m3.c3;
import m3.k1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements AccessibilityManager.AccessibilityStateChangeListener, c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f23192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1 f23193c = m3.i.w(Boolean.FALSE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f23194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w f23195e;

    public y(boolean z11, boolean z12, boolean z13) {
        this.f23191a = z12;
        this.f23192b = z13;
        w wVar = null;
        this.f23194d = z11 ? new x() : null;
        if ((z12 || z13) && Build.VERSION.SDK_INT >= 33) {
            wVar = new w(this);
        }
        this.f23195e = wVar;
    }

    public static boolean b(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i11 = 0; i11 < size; i11++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i11).getSettingsActivityName();
            if (settingsActivityName != null && StringsKt.z(settingsActivityName, "SwitchAccess", true)) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i11 = 0; i11 < size; i11++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i11).getSettingsActivityName();
            if (settingsActivityName != null && StringsKt.z(settingsActivityName, "VoiceAccess", true)) {
                return true;
            }
        }
        return false;
    }

    public final void e(AccessibilityManager accessibilityManager) {
        w wVar;
        this.f23193c.setValue(Boolean.valueOf(accessibilityManager.isEnabled()));
        accessibilityManager.addAccessibilityStateChangeListener(this);
        x xVar = this.f23194d;
        if (xVar != null) {
            xVar.f23190a.setValue(Boolean.valueOf(accessibilityManager.isTouchExplorationEnabled()));
            accessibilityManager.addTouchExplorationStateChangeListener(xVar);
        }
        if (Build.VERSION.SDK_INT < 33 || (wVar = this.f23195e) == null) {
            return;
        }
        wVar.f23188a.setValue(Boolean.valueOf(b(accessibilityManager)));
        wVar.f23189b.setValue(Boolean.valueOf(d(accessibilityManager)));
        accessibilityManager.addAccessibilityServicesStateChangeListener(wVar);
    }

    public final void f(AccessibilityManager accessibilityManager) {
        w wVar;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        x xVar = this.f23194d;
        if (xVar != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(xVar);
        }
        if (Build.VERSION.SDK_INT < 33 || (wVar = this.f23195e) == null) {
            return;
        }
        accessibilityManager.removeAccessibilityServicesStateChangeListener(wVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    @Override // m3.c3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getValue() {
        /*
            r3 = this;
            m3.k1 r0 = r3.f23193c
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L4e
            r0 = 1
            i3.x r1 = r3.f23194d
            if (r1 == 0) goto L22
            m3.k1 r1 = r1.f23190a
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != r0) goto L22
            goto L4f
        L22:
            boolean r1 = r3.f23191a
            i3.w r2 = r3.f23195e
            if (r1 == 0) goto L39
            if (r2 == 0) goto L39
            m3.k1 r1 = r2.f23188a
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != r0) goto L39
            goto L4f
        L39:
            boolean r1 = r3.f23192b
            if (r1 == 0) goto L4e
            if (r2 == 0) goto L4e
            m3.k1 r1 = r2.f23189b
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != r0) goto L4e
            goto L4f
        L4e:
            r0 = 0
        L4f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.y.getValue():java.lang.Object");
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z11) {
        this.f23193c.setValue(Boolean.valueOf(z11));
    }
}
