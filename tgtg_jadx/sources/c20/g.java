package c20;

import android.animation.Animator;
import com.app.tgtg.R;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ExtendedFloatingActionButton f6968g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ExtendedFloatingActionButton extendedFloatingActionButton, se.b bVar) {
        super(extendedFloatingActionButton, bVar);
        this.f6968g = extendedFloatingActionButton;
    }

    @Override // c20.b
    public final int c() {
        return R.animator.mtrl_extended_fab_show_motion_spec;
    }

    @Override // c20.b
    public final void e() {
        this.f6944d.f39010b = null;
        this.f6968g.f12444a = 0;
    }

    @Override // c20.b
    public final void f(Animator animator) {
        se.b bVar = this.f6944d;
        Animator animator2 = (Animator) bVar.f39010b;
        if (animator2 != null) {
            animator2.cancel();
        }
        bVar.f39010b = animator;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f6968g;
        extendedFloatingActionButton.setVisibility(0);
        extendedFloatingActionButton.f12444a = 2;
    }

    @Override // c20.b
    public final void g() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f6968g;
        extendedFloatingActionButton.setVisibility(0);
        extendedFloatingActionButton.setAlpha(1.0f);
        extendedFloatingActionButton.setScaleY(1.0f);
        extendedFloatingActionButton.setScaleX(1.0f);
    }

    @Override // c20.b
    public final boolean h() {
        d dVar = ExtendedFloatingActionButton.f12440q;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f6968g;
        int visibility = extendedFloatingActionButton.getVisibility();
        int i11 = extendedFloatingActionButton.f12444a;
        if (visibility != 0) {
            if (i11 != 2) {
                return false;
            }
        } else if (i11 == 1) {
            return false;
        }
        return true;
    }
}
