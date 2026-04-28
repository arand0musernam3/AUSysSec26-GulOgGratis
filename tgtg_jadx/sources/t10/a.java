package t10;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.app.tgtg.R;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends z7.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Chip f39625n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Chip chip, Chip chip2) {
        super(chip2);
        this.f39625n = chip;
    }

    @Override // z7.a
    public final int e(float f11, float f12) {
        Rect rect = Chip.f12413x;
        Chip chip = this.f39625n;
        return (chip.d() && chip.getCloseIconTouchBounds().contains(f11, f12)) ? 1 : 0;
    }

    @Override // z7.a
    public final void f(ArrayList arrayList) {
        b bVar;
        arrayList.add(0);
        Rect rect = Chip.f12413x;
        Chip chip = this.f39625n;
        if (!chip.d() || (bVar = chip.f12416e) == null || !bVar.X || chip.f12419h == null) {
            return;
        }
        arrayList.add(1);
    }

    @Override // z7.a
    public final boolean j(int i11, int i12, Bundle bundle) {
        boolean z11 = false;
        if (i12 == 16) {
            Chip chip = this.f39625n;
            if (i11 == 0) {
                return chip.performClick();
            }
            if (i11 == 1) {
                chip.playSoundEffect(0);
                View.OnClickListener onClickListener = chip.f12419h;
                if (onClickListener != null) {
                    onClickListener.onClick(chip);
                    z11 = true;
                }
                if (chip.f12430t) {
                    chip.f12429s.o(1, 1);
                }
            }
        }
        return z11;
    }

    @Override // z7.a
    public final void k(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        Chip chip = this.f39625n;
        b bVar = chip.f12416e;
        accessibilityNodeInfoCompat.f0(bVar != null && bVar.f39627g1);
        accessibilityNodeInfoCompat.i0(chip.isClickable());
        accessibilityNodeInfoCompat.h0(chip.getAccessibilityClassName());
        accessibilityNodeInfoCompat.Q0(chip.getText());
    }

    @Override // z7.a
    public final void l(int i11, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (i11 != 1) {
            accessibilityNodeInfoCompat.l0("");
            accessibilityNodeInfoCompat.d0(Chip.f12413x);
            return;
        }
        Chip chip = this.f39625n;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfoCompat.l0(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfoCompat.l0(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        accessibilityNodeInfoCompat.d0(chip.getCloseIconTouchBoundsInt());
        accessibilityNodeInfoCompat.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f2750i);
        accessibilityNodeInfoCompat.q0(chip.isEnabled());
        accessibilityNodeInfoCompat.h0(Button.class.getName());
    }

    @Override // z7.a
    public final void m(int i11, boolean z11) {
        Chip chip = this.f39625n;
        if (i11 == 1) {
            chip.f12424n = z11;
        }
        b bVar = chip.f12416e;
        boolean z12 = chip.f12424n;
        boolean zD0 = false;
        if (bVar.Y != null) {
            zD0 = bVar.d0(z12 ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : b.V1);
        }
        if (zD0) {
            chip.refreshDrawableState();
        }
    }
}
