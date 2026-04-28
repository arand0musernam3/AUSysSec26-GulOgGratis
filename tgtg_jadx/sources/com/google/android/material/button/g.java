package com.google.android.material.button;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import q20.h;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends h7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12409b;

    public /* synthetic */ g(Object obj, int i11) {
        this.f12408a = i11;
        this.f12409b = obj;
    }

    @Override // h7.b
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f12408a) {
            case 1:
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f12409b).f12498d);
                break;
            default:
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                break;
        }
    }

    @Override // h7.b
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        int i11;
        int i12 = this.f12408a;
        Object obj = this.f12409b;
        switch (i12) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i13 = MaterialButtonToggleGroup.f12367r;
                if (view instanceof MaterialButton) {
                    int i14 = 0;
                    for (int i15 = 0; i15 < materialButtonToggleGroup.getChildCount(); i15++) {
                        if (materialButtonToggleGroup.getChildAt(i15) == view) {
                            i11 = i14;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i15) instanceof MaterialButton) && materialButtonToggleGroup.getChildAt(i15).getVisibility() != 8) {
                                i14++;
                            }
                        }
                    }
                    i11 = -1;
                } else {
                    i11 = -1;
                }
                accessibilityNodeInfoCompat.k0(i7.e.a(0, 1, i11, 1, false, ((MaterialButton) view).isChecked()));
                break;
            case 1:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfoCompat.f0(checkableImageButton.f12499e);
                accessibilityNodeInfoCompat.g0(checkableImageButton.f12498d);
                break;
            case 2:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.f0(((NavigationMenuItemView) obj).f12505x);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.a(1048576);
                accessibilityNodeInfoCompat.n0(true);
                break;
        }
    }

    @Override // h7.b
    public boolean performAccessibilityAction(View view, int i11, Bundle bundle) {
        switch (this.f12408a) {
            case 3:
                if (i11 == 1048576) {
                    ((h) ((q20.g) this.f12409b)).a(3);
                }
                break;
        }
        return super.performAccessibilityAction(view, i11, bundle);
    }
}
