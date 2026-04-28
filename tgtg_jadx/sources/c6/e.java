package c6;

import android.view.View;
import android.view.ViewGroup;
import b5.m0;
import java.util.List;
import z4.u0;
import z4.v0;
import z4.w0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f7684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f7685b;

    public e(d0 d0Var, m0 m0Var) {
        this.f7684a = d0Var;
        this.f7685b = m0Var;
    }

    @Override // z4.u0
    public final int a(z4.u uVar, List list, int i11) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        d0 d0Var = this.f7684a;
        ViewGroup.LayoutParams layoutParams = d0Var.getLayoutParams();
        layoutParams.getClass();
        d0Var.measure(iMakeMeasureSpec, j.j(d0Var, 0, i11, layoutParams.height));
        return d0Var.getMeasuredWidth();
    }

    @Override // z4.u0
    public final int b(z4.u uVar, List list, int i11) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        d0 d0Var = this.f7684a;
        ViewGroup.LayoutParams layoutParams = d0Var.getLayoutParams();
        layoutParams.getClass();
        d0Var.measure(iMakeMeasureSpec, j.j(d0Var, 0, i11, layoutParams.height));
        return d0Var.getMeasuredWidth();
    }

    @Override // z4.u0
    public final v0 c(w0 w0Var, List list, long j9) {
        d0 d0Var = this.f7684a;
        if (d0Var.getChildCount() == 0) {
            return w0.f(w0Var, z5.a.k(j9), z5.a.j(j9), b.f7674c);
        }
        if (z5.a.k(j9) != 0) {
            d0Var.getChildAt(0).setMinimumWidth(z5.a.k(j9));
        }
        if (z5.a.j(j9) != 0) {
            d0Var.getChildAt(0).setMinimumHeight(z5.a.j(j9));
        }
        int iK = z5.a.k(j9);
        int i11 = z5.a.i(j9);
        ViewGroup.LayoutParams layoutParams = d0Var.getLayoutParams();
        layoutParams.getClass();
        int iJ = j.j(d0Var, iK, i11, layoutParams.width);
        int iJ2 = z5.a.j(j9);
        int iH = z5.a.h(j9);
        ViewGroup.LayoutParams layoutParams2 = d0Var.getLayoutParams();
        layoutParams2.getClass();
        d0Var.measure(iJ, j.j(d0Var, iJ2, iH, layoutParams2.height));
        return w0.f(w0Var, d0Var.getMeasuredWidth(), d0Var.getMeasuredHeight(), new c(d0Var, this.f7685b, 1));
    }

    @Override // z4.u0
    public final int d(z4.u uVar, List list, int i11) {
        d0 d0Var = this.f7684a;
        ViewGroup.LayoutParams layoutParams = d0Var.getLayoutParams();
        layoutParams.getClass();
        d0Var.measure(j.j(d0Var, 0, i11, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return d0Var.getMeasuredHeight();
    }

    @Override // z4.u0
    public final int e(z4.u uVar, List list, int i11) {
        d0 d0Var = this.f7684a;
        ViewGroup.LayoutParams layoutParams = d0Var.getLayoutParams();
        layoutParams.getClass();
        d0Var.measure(j.j(d0Var, 0, i11, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return d0Var.getMeasuredHeight();
    }
}
