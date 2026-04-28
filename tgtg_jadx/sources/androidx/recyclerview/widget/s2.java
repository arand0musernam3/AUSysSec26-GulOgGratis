package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s2 extends h7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t2 f3918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f3919b = new WeakHashMap();

    public s2(t2 t2Var) {
        this.f3918a = t2Var;
    }

    @Override // h7.b
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        h7.b bVar = (h7.b) this.f3919b.get(view);
        return bVar != null ? bVar.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // h7.b
    public final AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view) {
        h7.b bVar = (h7.b) this.f3919b.get(view);
        return bVar != null ? bVar.getAccessibilityNodeProvider(view) : super.getAccessibilityNodeProvider(view);
    }

    @Override // h7.b
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        h7.b bVar = (h7.b) this.f3919b.get(view);
        if (bVar != null) {
            bVar.onInitializeAccessibilityEvent(view, accessibilityEvent);
        } else {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // h7.b
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        t2 t2Var = this.f3918a;
        RecyclerView recyclerView = t2Var.f3925a;
        RecyclerView recyclerView2 = t2Var.f3925a;
        if (recyclerView.Q() || recyclerView2.getLayoutManager() == null) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            return;
        }
        recyclerView2.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, accessibilityNodeInfoCompat);
        h7.b bVar = (h7.b) this.f3919b.get(view);
        if (bVar != null) {
            bVar.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        } else {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        }
    }

    @Override // h7.b
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        h7.b bVar = (h7.b) this.f3919b.get(view);
        if (bVar != null) {
            bVar.onPopulateAccessibilityEvent(view, accessibilityEvent);
        } else {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // h7.b
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        h7.b bVar = (h7.b) this.f3919b.get(viewGroup);
        return bVar != null ? bVar.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // h7.b
    public final boolean performAccessibilityAction(View view, int i11, Bundle bundle) {
        t2 t2Var = this.f3918a;
        RecyclerView recyclerView = t2Var.f3925a;
        RecyclerView recyclerView2 = t2Var.f3925a;
        if (recyclerView.Q() || recyclerView2.getLayoutManager() == null) {
            return super.performAccessibilityAction(view, i11, bundle);
        }
        h7.b bVar = (h7.b) this.f3919b.get(view);
        if (bVar != null) {
            if (bVar.performAccessibilityAction(view, i11, bundle)) {
                return true;
            }
        } else if (super.performAccessibilityAction(view, i11, bundle)) {
            return true;
        }
        return recyclerView2.getLayoutManager().performAccessibilityActionForItem(view, i11, bundle);
    }

    @Override // h7.b
    public final void sendAccessibilityEvent(View view, int i11) {
        h7.b bVar = (h7.b) this.f3919b.get(view);
        if (bVar != null) {
            bVar.sendAccessibilityEvent(view, i11);
        } else {
            super.sendAccessibilityEvent(view, i11);
        }
    }

    @Override // h7.b
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        h7.b bVar = (h7.b) this.f3919b.get(view);
        if (bVar != null) {
            bVar.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        } else {
            super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }
}
