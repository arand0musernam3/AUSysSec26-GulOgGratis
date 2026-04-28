package j5;

import b5.l2;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends b4.s implements l2 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f24621o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f24622p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Function1 f24623q;

    public e(boolean z11, boolean z12, Function1 function1) {
        this.f24621o = z11;
        this.f24622p = z12;
        this.f24623q = function1;
    }

    @Override // b5.l2
    public final boolean F0() {
        return this.f24621o;
    }

    @Override // b5.l2
    public final boolean G() {
        return this.f24622p;
    }

    @Override // b5.l2
    public final void h0(b0 b0Var) {
        this.f24623q.invoke(b0Var);
    }
}
