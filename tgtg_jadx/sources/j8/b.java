package j8;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends h7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DrawerLayout f24758a;

    public b(DrawerLayout drawerLayout) {
        this.f24758a = drawerLayout;
        new Rect();
    }

    @Override // h7.b
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }
        List<CharSequence> text = accessibilityEvent.getText();
        DrawerLayout drawerLayout = this.f24758a;
        View viewE = drawerLayout.e();
        if (viewE == null) {
            return true;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(drawerLayout.g(viewE), ViewCompat.s(drawerLayout));
        CharSequence charSequence = absoluteGravity == 3 ? drawerLayout.f3091w : absoluteGravity == 5 ? drawerLayout.f3092x : null;
        if (charSequence == null) {
            return true;
        }
        text.add(charSequence);
        return true;
    }

    @Override // h7.b
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
    }

    @Override // h7.b
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        int[] iArr = DrawerLayout.E;
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.h0("androidx.drawerlayout.widget.DrawerLayout");
        accessibilityNodeInfoCompat.s0(false);
        accessibilityNodeInfoCompat.t0(false);
        accessibilityNodeInfoCompat.Y(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f2746e);
        accessibilityNodeInfoCompat.Y(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f2747f);
    }

    @Override // h7.b
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        int[] iArr = DrawerLayout.E;
        return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }
}
