package c20;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.app.tgtg.R;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f6963g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f6964h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ExtendedFloatingActionButton f6965i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ExtendedFloatingActionButton extendedFloatingActionButton, se.b bVar, h hVar, boolean z11) {
        super(extendedFloatingActionButton, bVar);
        this.f6965i = extendedFloatingActionButton;
        this.f6963g = hVar;
        this.f6964h = z11;
    }

    @Override // c20.b
    public final AnimatorSet a() {
        k10.e eVar = this.f6946f;
        if (eVar == null) {
            if (this.f6945e == null) {
                this.f6945e = k10.e.b(this.f6941a, c());
            }
            eVar = this.f6945e;
            eVar.getClass();
        }
        boolean zG = eVar.g("width");
        h hVar = this.f6963g;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f6965i;
        if (zG) {
            PropertyValuesHolder[] propertyValuesHolderArrE = eVar.e("width");
            propertyValuesHolderArrE[0].setFloatValues(extendedFloatingActionButton.getWidth(), hVar.b());
            eVar.h("width", propertyValuesHolderArrE);
        }
        if (eVar.g("height")) {
            PropertyValuesHolder[] propertyValuesHolderArrE2 = eVar.e("height");
            propertyValuesHolderArrE2[0].setFloatValues(extendedFloatingActionButton.getHeight(), hVar.getHeight());
            eVar.h("height", propertyValuesHolderArrE2);
        }
        if (eVar.g("paddingStart")) {
            PropertyValuesHolder[] propertyValuesHolderArrE3 = eVar.e("paddingStart");
            propertyValuesHolderArrE3[0].setFloatValues(extendedFloatingActionButton.getPaddingStart(), hVar.k());
            eVar.h("paddingStart", propertyValuesHolderArrE3);
        }
        if (eVar.g("paddingEnd")) {
            PropertyValuesHolder[] propertyValuesHolderArrE4 = eVar.e("paddingEnd");
            propertyValuesHolderArrE4[0].setFloatValues(extendedFloatingActionButton.getPaddingEnd(), hVar.c());
            eVar.h("paddingEnd", propertyValuesHolderArrE4);
        }
        if (eVar.g("labelOpacity")) {
            PropertyValuesHolder[] propertyValuesHolderArrE5 = eVar.e("labelOpacity");
            boolean z11 = this.f6964h;
            propertyValuesHolderArrE5[0].setFloatValues(z11 ? 0.0f : 1.0f, z11 ? 1.0f : 0.0f);
            eVar.h("labelOpacity", propertyValuesHolderArrE5);
        }
        return b(eVar);
    }

    @Override // c20.b
    public final int c() {
        return this.f6964h ? R.animator.mtrl_extended_fab_change_size_expand_motion_spec : R.animator.mtrl_extended_fab_change_size_collapse_motion_spec;
    }

    @Override // c20.b
    public final void e() {
        this.f6944d.f39010b = null;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f6965i;
        extendedFloatingActionButton.l = false;
        extendedFloatingActionButton.setHorizontallyScrolling(false);
        ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        h hVar = this.f6963g;
        layoutParams.width = hVar.g().width;
        layoutParams.height = hVar.g().height;
    }

    @Override // c20.b
    public final void f(Animator animator) {
        se.b bVar = this.f6944d;
        Animator animator2 = (Animator) bVar.f39010b;
        if (animator2 != null) {
            animator2.cancel();
        }
        bVar.f39010b = animator;
        boolean z11 = this.f6964h;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f6965i;
        extendedFloatingActionButton.f12454k = z11;
        extendedFloatingActionButton.l = true;
        extendedFloatingActionButton.setHorizontallyScrolling(true);
    }

    @Override // c20.b
    public final void g() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f6965i;
        boolean z11 = this.f6964h;
        extendedFloatingActionButton.f12454k = z11;
        ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (!z11) {
            extendedFloatingActionButton.f12457o = layoutParams.width;
            extendedFloatingActionButton.f12458p = layoutParams.height;
        }
        h hVar = this.f6963g;
        layoutParams.width = hVar.g().width;
        layoutParams.height = hVar.g().height;
        if (z11) {
            extendedFloatingActionButton.k(extendedFloatingActionButton.f12456n);
        } else if (extendedFloatingActionButton.getText() != null && extendedFloatingActionButton.getText() != "") {
            extendedFloatingActionButton.k(ColorStateList.valueOf(0));
        }
        extendedFloatingActionButton.setPaddingRelative(hVar.k(), extendedFloatingActionButton.getPaddingTop(), hVar.c(), extendedFloatingActionButton.getPaddingBottom());
        extendedFloatingActionButton.requestLayout();
    }

    @Override // c20.b
    public final boolean h() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f6965i;
        return this.f6964h == extendedFloatingActionButton.f12454k || extendedFloatingActionButton.getIcon() == null || TextUtils.isEmpty(extendedFloatingActionButton.getText());
    }
}
