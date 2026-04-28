package g2;

import java.util.List;
import kotlin.collections.CollectionsKt;
import z1.h2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements h2.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f18152a;

    public d(b0 b0Var) {
        this.f18152a = b0Var;
    }

    @Override // h2.v
    public final int a() {
        return this.f18152a.g().f18222p;
    }

    @Override // h2.v
    public final int b() {
        return ((s) ((j) CollectionsKt.W(this.f18152a.g().f18219m))).f18226a;
    }

    @Override // h2.v
    public final int c() {
        int i11;
        boolean z11;
        long j9;
        b0 b0Var = this.f18152a;
        int i12 = 0;
        if (b0Var.g().f18219m.isEmpty()) {
            return 0;
        }
        r rVarG = b0Var.g();
        h2 h2Var = rVarG.f18223q;
        h2 h2Var2 = h2.Vertical;
        int iF = (int) (h2Var == h2Var2 ? rVarG.f() & 4294967295L : rVarG.f() >> 32);
        r rVarG2 = b0Var.g();
        h2 h2Var3 = rVarG2.f18223q;
        List list = rVarG2.f18219m;
        boolean z12 = h2Var3 == h2Var2;
        if (!list.isEmpty()) {
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (i13 < list.size()) {
                s sVar = (s) ((j) list.get(i13));
                int i16 = z12 ? sVar.f18245u : sVar.f18246v;
                if (i16 == -1) {
                    i13++;
                } else {
                    int iMax = i12;
                    while (i13 < list.size()) {
                        s sVar2 = (s) ((j) list.get(i13));
                        if ((z12 ? sVar2.f18245u : sVar2.f18246v) != i16) {
                            break;
                        }
                        if (z12) {
                            z11 = z12;
                            j9 = ((s) ((j) list.get(i13))).f18243s & 4294967295L;
                        } else {
                            z11 = z12;
                            j9 = ((s) ((j) list.get(i13))).f18243s >> 32;
                        }
                        iMax = Math.max(iMax, (int) j9);
                        i13++;
                        z12 = z11;
                    }
                    i14 += iMax;
                    i15++;
                    z12 = z12;
                    i12 = 0;
                }
            }
            i12 = (i14 / i15) + rVarG2.f18225s;
        }
        if (i12 != 0 && (i11 = iF / i12) >= 1) {
            return i11;
        }
        return 1;
    }

    @Override // h2.v
    public final boolean d() {
        return !this.f18152a.g().f18219m.isEmpty();
    }

    @Override // h2.v
    public final int e() {
        return this.f18152a.f18129d.f17224b.h();
    }
}
