package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g2 extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.b f33903a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(androidx.appcompat.widget.b bVar, Context context) {
        super(context, null, R.attr.actionBarTabStyle);
        this.f33903a = bVar;
        j30.g gVarT = j30.g.t(context, null, new int[]{android.R.attr.background}, R.attr.actionBarTabStyle);
        if (((TypedArray) gVarT.f24503c).hasValue(0)) {
            setBackgroundDrawable(gVarT.k(0));
        }
        gVarT.v();
        setGravity(8388627);
        throw null;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        androidx.appcompat.widget.b bVar = this.f33903a;
        if (bVar.f2147e > 0) {
            int measuredWidth = getMeasuredWidth();
            int i13 = bVar.f2147e;
            if (measuredWidth > i13) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), i12);
            }
        }
    }

    @Override // android.view.View
    public void setSelected(boolean z11) {
        boolean z12 = isSelected() != z11;
        super.setSelected(z11);
        if (z12 && z11) {
            sendAccessibilityEvent(4);
        }
    }
}
