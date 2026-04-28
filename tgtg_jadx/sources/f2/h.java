package f2;

import kotlin.collections.CollectionsKt;
import z1.h2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements h2.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f17123a;

    public h(c0 c0Var) {
        this.f17123a = c0Var;
    }

    @Override // h2.v
    public final int a() {
        return this.f17123a.j().f17194n;
    }

    @Override // h2.v
    public final int b() {
        return Math.min(a() - 1, ((t) ((m) CollectionsKt.W(this.f17123a.j().f17192k))).f17199a);
    }

    @Override // h2.v
    public final int c() {
        int i11;
        c0 c0Var = this.f17123a;
        if (c0Var.j().f17192k.isEmpty()) {
            return 0;
        }
        s sVarJ = c0Var.j();
        int iF = (int) (sVarJ.f17196p == h2.Vertical ? sVarJ.f() & 4294967295L : sVarJ.f() >> 32);
        int iM = pd.g.M(c0Var.j());
        if (iM != 0 && (i11 = iF / iM) >= 1) {
            return i11;
        }
        return 1;
    }

    @Override // h2.v
    public final boolean d() {
        return !this.f17123a.j().f17192k.isEmpty();
    }

    @Override // h2.v
    public final int e() {
        return Math.max(0, this.f17123a.h());
    }
}
