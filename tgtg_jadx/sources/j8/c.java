package j8;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.drawerlayout.widget.DrawerLayout;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends h7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24759a;

    public c(ta.e eVar) {
        this.f24759a = 2;
    }

    @Override // h7.b
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f24759a) {
            case 2:
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                accessibilityEvent.setClassName(ta.e.class.getName());
                accessibilityEvent.setScrollable(false);
                accessibilityEvent.getEventType();
                break;
            default:
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                break;
        }
    }

    @Override // h7.b
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        switch (this.f24759a) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                int[] iArr = DrawerLayout.E;
                if (ViewCompat.q(view) == 4 || ViewCompat.q(view) == 2) {
                    accessibilityNodeInfoCompat.F0(null);
                }
                break;
            case 1:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.X0(false);
                break;
            case 2:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.h0(ta.e.class.getName());
                accessibilityNodeInfoCompat.L0(false);
                break;
            case 3:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.j0(null);
                break;
            case 4:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.L0(false);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.j0(null);
                break;
        }
    }

    @Override // h7.b
    public boolean performAccessibilityAction(View view, int i11, Bundle bundle) {
        switch (this.f24759a) {
        }
        return super.performAccessibilityAction(view, i11, bundle);
    }

    public /* synthetic */ c(int i11) {
        this.f24759a = i11;
    }
}
