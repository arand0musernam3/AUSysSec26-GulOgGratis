package wa;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f2;
import androidx.recyclerview.widget.n2;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends LinearLayoutManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f43366a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ViewPager2 viewPager2, Context context) {
        super(context);
        this.f43366a = viewPager2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void calculateExtraLayoutSpace(n2 n2Var, int[] iArr) {
        ViewPager2 viewPager2 = this.f43366a;
        int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
        if (offscreenPageLimit == -1) {
            super.calculateExtraLayoutSpace(n2Var, iArr);
            return;
        }
        int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
        iArr[0] = pageSize;
        iArr[1] = pageSize;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.y1
    public final void onInitializeAccessibilityNodeInfo(f2 f2Var, n2 n2Var, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(f2Var, n2Var, accessibilityNodeInfoCompat);
        this.f43366a.f4132t.getClass();
    }

    @Override // androidx.recyclerview.widget.y1
    public final void onInitializeAccessibilityNodeInfoForItem(f2 f2Var, n2 n2Var, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        ViewPager2 viewPager2 = this.f43366a.f4132t.f43370g;
        accessibilityNodeInfoCompat.k0(i7.e.a(viewPager2.getOrientation() == 1 ? viewPager2.f4120g.getPosition(view) : 0, 1, viewPager2.getOrientation() == 0 ? viewPager2.f4120g.getPosition(view) : 0, 1, false, false));
    }

    @Override // androidx.recyclerview.widget.y1
    public final boolean performAccessibilityAction(f2 f2Var, n2 n2Var, int i11, Bundle bundle) {
        this.f43366a.f4132t.getClass();
        return super.performAccessibilityAction(f2Var, n2Var, i11, bundle);
    }

    @Override // androidx.recyclerview.widget.y1
    public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z11, boolean z12) {
        return false;
    }
}
