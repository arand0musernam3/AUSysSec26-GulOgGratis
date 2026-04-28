package i7;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends AccessibilityNodeProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeProviderCompat f23477a;

    public g(AccessibilityNodeProviderCompat accessibilityNodeProviderCompat) {
        this.f23477a = accessibilityNodeProviderCompat;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i11, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        this.f23477a.a(i11, AccessibilityNodeInfoCompat.Z0(accessibilityNodeInfo), str, bundle);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i11) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatB = this.f23477a.b(i11);
        if (accessibilityNodeInfoCompatB == null) {
            return null;
        }
        return accessibilityNodeInfoCompatB.Y0();
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i11) {
        List<AccessibilityNodeInfoCompat> listC = this.f23477a.c(str, i11);
        if (listC == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = listC.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.add(listC.get(i12).Y0());
        }
        return arrayList;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i11) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatD = this.f23477a.d(i11);
        if (accessibilityNodeInfoCompatD == null) {
            return null;
        }
        return accessibilityNodeInfoCompatD.Y0();
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i11, int i12, Bundle bundle) {
        return this.f23477a.f(i11, i12, bundle);
    }
}
