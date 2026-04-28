package x10;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends h7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f43657a;

    public g(i iVar) {
        this.f43657a = iVar;
    }

    @Override // h7.b
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        i iVar = this.f43657a;
        accessibilityNodeInfoCompat.b(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, iVar.l.getVisibility() == 0 ? iVar.getString(R.string.mtrl_picker_toggle_to_year_selection) : iVar.getString(R.string.mtrl_picker_toggle_to_day_selection)));
    }
}
