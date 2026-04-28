package t1;

import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o3.e f39434a = new o3.e(new d0[16], 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m3.k1 f39435b = m3.i.w(Boolean.FALSE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f39436c = Long.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m3.k1 f39437d = m3.i.w(Boolean.TRUE);

    public final void a(m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-318043801);
        int i12 = (sVar.h(this) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(null);
                sVar.k0(objM);
            }
            m3.b1 b1Var = (m3.b1) objM;
            if (((Boolean) this.f39437d.getValue()).booleanValue() || ((Boolean) this.f39435b.getValue()).booleanValue()) {
                sVar.a0(-144841960);
                boolean zH = sVar.h(this);
                Object objM2 = sVar.M();
                if (zH || objM2 == fVar) {
                    objM2 = new f0(b1Var, this, null);
                    sVar.k0(objM2);
                }
                m3.i.h(this, (Function2) objM2, sVar);
            } else {
                sVar.a0(-151918981);
            }
            sVar.q(false);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new pm.m(this, i11, 9);
        }
    }
}
