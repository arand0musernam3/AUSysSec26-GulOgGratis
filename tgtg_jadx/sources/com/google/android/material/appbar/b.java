package com.google.android.material.appbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends h7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f12245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f12246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f12247c;

    public b(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.f12247c = baseBehavior;
        this.f12245a = appBarLayout;
        this.f12246b = coordinatorLayout;
    }

    @Override // h7.b
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.h0(ScrollView.class.getName());
        AppBarLayout appBarLayout = this.f12245a;
        if (appBarLayout.getTotalScrollRange() == 0) {
            return;
        }
        CoordinatorLayout coordinatorLayout = this.f12246b;
        AppBarLayout.BaseBehavior baseBehavior = this.f12247c;
        View viewB = AppBarLayout.BaseBehavior.B(baseBehavior, coordinatorLayout);
        if (viewB == null) {
            return;
        }
        int childCount = appBarLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            if (((AppBarLayout.a) appBarLayout.getChildAt(i11).getLayoutParams()).f12234a != 0) {
                if (baseBehavior.y() != (-appBarLayout.getTotalScrollRange())) {
                    accessibilityNodeInfoCompat.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f2757q);
                    accessibilityNodeInfoCompat.L0(true);
                }
                if (baseBehavior.y() != 0) {
                    if (!viewB.canScrollVertically(-1)) {
                        accessibilityNodeInfoCompat.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f2758r);
                        accessibilityNodeInfoCompat.L0(true);
                        return;
                    } else {
                        if ((-appBarLayout.getDownNestedPreScrollRange()) != 0) {
                            accessibilityNodeInfoCompat.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f2758r);
                            accessibilityNodeInfoCompat.L0(true);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    @Override // h7.b
    public final boolean performAccessibilityAction(View view, int i11, Bundle bundle) {
        AppBarLayout appBarLayout = this.f12245a;
        if (i11 == 4096) {
            appBarLayout.setExpanded(false);
            return true;
        }
        if (i11 != 8192) {
            return super.performAccessibilityAction(view, i11, bundle);
        }
        AppBarLayout.BaseBehavior baseBehavior = this.f12247c;
        if (baseBehavior.y() != 0) {
            CoordinatorLayout coordinatorLayout = this.f12246b;
            View viewB = AppBarLayout.BaseBehavior.B(baseBehavior, coordinatorLayout);
            if (!viewB.canScrollVertically(-1)) {
                appBarLayout.setExpanded(true);
                return true;
            }
            int i12 = -appBarLayout.getDownNestedPreScrollRange();
            if (i12 != 0) {
                baseBehavior.E(coordinatorLayout, this.f12245a, viewB, i12, new int[]{0, 0});
                return true;
            }
        }
        return false;
    }
}
