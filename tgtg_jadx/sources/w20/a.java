package w20;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.app.tgtg.R;
import com.google.android.material.timepicker.ClockFaceView;
import com.google.android.material.timepicker.ClockHandView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends h7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f43087a;

    public a(ClockFaceView clockFaceView) {
        this.f43087a = clockFaceView;
    }

    @Override // h7.b
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (iIntValue > 0) {
            accessibilityNodeInfoCompat.S0((View) this.f43087a.f12698h.get(iIntValue - 1));
        }
        accessibilityNodeInfoCompat.k0(i7.e.a(0, 1, iIntValue, 1, false, view.isSelected()));
        accessibilityNodeInfoCompat.i0(true);
        accessibilityNodeInfoCompat.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f2750i);
    }

    @Override // h7.b
    public final boolean performAccessibilityAction(View view, int i11, Bundle bundle) {
        ClockFaceView clockFaceView = this.f43087a;
        ClockHandView clockHandView = clockFaceView.f12694d;
        Rect rect = clockFaceView.f12695e;
        if (i11 != 16) {
            return super.performAccessibilityAction(view, i11, bundle);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        view.getHitRect(rect);
        float fCenterX = rect.centerX();
        float fCenterY = rect.centerY();
        clockHandView.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
        clockHandView.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
        return true;
    }
}
