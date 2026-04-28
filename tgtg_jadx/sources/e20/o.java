package e20;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o extends h7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f15688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f15689c;

    public o(p pVar, int i11, boolean z11) {
        this.f15689c = pVar;
        this.f15687a = i11;
        this.f15688b = z11;
    }

    @Override // h7.b
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        x xVar = this.f15689c.f15693d;
        int i11 = this.f15687a;
        int i12 = i11;
        for (int i13 = 0; i13 < i11; i13++) {
            if (xVar.f15703e.getItemViewType(i13) == 2 || xVar.f15703e.getItemViewType(i13) == 3) {
                i12--;
            }
        }
        accessibilityNodeInfoCompat.k0(i7.e.a(i12, 1, 1, 1, this.f15688b, view.isSelected()));
    }
}
