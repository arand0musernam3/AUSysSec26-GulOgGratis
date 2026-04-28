package k2;

import android.view.autofill.AutofillValue;
import c4.m;
import j5.z;
import v1.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends b0 {
    public l5.a N;

    @Override // v1.g
    public final void O0(j5.b0 b0Var) {
        z.p(b0Var, this.N);
        z.g(b0Var, m.f7040b);
        z.j(b0Var, new c4.g(AutofillValue.forToggle(this.N != l5.a.Indeterminate)));
        z.d(b0Var, new i3.m(b0Var, 2));
    }
}
