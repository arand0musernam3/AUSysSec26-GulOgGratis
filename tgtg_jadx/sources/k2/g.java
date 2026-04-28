package k2;

import android.view.autofill.AutofillValue;
import b2.l;
import c4.m;
import j5.j;
import j5.z;
import kotlin.jvm.functions.Function1;
import v1.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends b0 {
    public boolean N;
    public Function1 O;
    public final jt.g P;

    public g(boolean z11, l lVar, boolean z12, boolean z13, j jVar, Function1 function1) {
        super(lVar, null, z12, z13, null, jVar, new g3.b0(function1, z11, 2));
        this.N = z11;
        this.O = function1;
        this.P = new jt.g(this, 2);
    }

    @Override // v1.g
    public final void O0(j5.b0 b0Var) {
        z.p(b0Var, this.N ? l5.a.On : l5.a.Off);
        z.g(b0Var, m.f7040b);
        z.j(b0Var, new c4.g(AutofillValue.forToggle(this.N)));
        z.d(b0Var, new i3.m(b0Var, 1));
    }
}
