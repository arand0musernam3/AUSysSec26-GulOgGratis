package com.google.android.material.bottomsheet;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends h7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f12355a;

    public h(l lVar) {
        this.f12355a = lVar;
    }

    @Override // h7.b
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        if (!this.f12355a.cancelable) {
            accessibilityNodeInfoCompat.n0(false);
        } else {
            accessibilityNodeInfoCompat.a(1048576);
            accessibilityNodeInfoCompat.n0(true);
        }
    }

    @Override // h7.b
    public final boolean performAccessibilityAction(View view, int i11, Bundle bundle) {
        if (i11 == 1048576) {
            l lVar = this.f12355a;
            if (lVar.cancelable) {
                lVar.cancel();
                return true;
            }
        }
        return super.performAccessibilityAction(view, i11, bundle);
    }
}
