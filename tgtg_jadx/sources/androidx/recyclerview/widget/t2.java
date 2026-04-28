package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class t2 extends h7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView f3925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s2 f3926b;

    public t2(RecyclerView recyclerView) {
        this.f3925a = recyclerView;
        s2 s2Var = this.f3926b;
        if (s2Var != null) {
            this.f3926b = s2Var;
        } else {
            this.f3926b = new s2(this);
        }
    }

    @Override // h7.b
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f3925a.Q()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    @Override // h7.b
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        RecyclerView recyclerView = this.f3925a;
        if (recyclerView.Q() || recyclerView.getLayoutManager() == null) {
            return;
        }
        recyclerView.getLayoutManager().onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat);
    }

    @Override // h7.b
    public final boolean performAccessibilityAction(View view, int i11, Bundle bundle) {
        if (super.performAccessibilityAction(view, i11, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f3925a;
        if (recyclerView.Q() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        return recyclerView.getLayoutManager().performAccessibilityAction(i11, bundle);
    }
}
