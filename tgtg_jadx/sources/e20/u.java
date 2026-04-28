package e20;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.t2;
import com.google.android.material.internal.NavigationMenuView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class u extends t2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f15698c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(x xVar, NavigationMenuView navigationMenuView) {
        super(navigationMenuView);
        this.f15698c = xVar;
    }

    @Override // androidx.recyclerview.widget.t2, h7.b
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        x xVar = this.f15698c.f15703e.f15693d;
        int i11 = 0;
        for (int i12 = 0; i12 < xVar.f15703e.f15690a.size(); i12++) {
            int itemViewType = xVar.f15703e.getItemViewType(i12);
            if (itemViewType == 0 || itemViewType == 1) {
                i11++;
            }
        }
        accessibilityNodeInfoCompat.j0(new i7.d(AccessibilityNodeInfo.CollectionInfo.obtain(i11, 1, false)));
    }
}
