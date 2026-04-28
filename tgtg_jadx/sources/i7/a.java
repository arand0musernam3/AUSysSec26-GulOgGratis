package i7;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccessibilityNodeInfoCompat f23472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23473c;

    public a(int i11, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i12) {
        this.f23471a = i11;
        this.f23472b = accessibilityNodeInfoCompat;
        this.f23473c = i12;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f23471a);
        this.f23472b.W(this.f23473c, bundle);
    }
}
