package m2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m5.q0 f28762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z4.z f28763b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z4.z f28764c;

    public a2(m5.q0 q0Var, z4.z zVar) {
        this.f28762a = q0Var;
        this.f28764c = zVar;
    }

    public final long a(long j9) {
        h4.c cVarV;
        z4.z zVar = this.f28763b;
        h4.c cVar = h4.c.f21379e;
        if (zVar != null) {
            if (zVar.n()) {
                z4.z zVar2 = this.f28764c;
                cVarV = zVar2 != null ? zVar2.v(zVar, true) : null;
            } else {
                cVarV = cVar;
            }
            if (cVarV != null) {
                cVar = cVarV;
            }
        }
        int i11 = (int) (j9 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i11);
        float fIntBitsToFloat2 = cVar.f21380a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i11);
            fIntBitsToFloat2 = cVar.f21382c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i11);
            }
        }
        int i12 = (int) (j9 & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i12);
        float fIntBitsToFloat5 = cVar.f21381b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i12);
            fIntBitsToFloat5 = cVar.f21383d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i12);
            }
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
    }

    public final int b(long j9, boolean z11) {
        if (z11) {
            j9 = a(j9);
        }
        return this.f28762a.f29618b.g(d(j9));
    }

    public final boolean c(long j9) {
        long jD = d(a(j9));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jD));
        m5.q0 q0Var = this.f28762a;
        int iE = q0Var.f29618b.e(fIntBitsToFloat);
        int i11 = (int) (jD >> 32);
        return Float.intBitsToFloat(i11) >= q0Var.g(iE) && Float.intBitsToFloat(i11) <= q0Var.h(iE);
    }

    public final long d(long j9) {
        z4.z zVar;
        z4.z zVar2 = this.f28763b;
        if (zVar2 == null) {
            return j9;
        }
        if (!zVar2.n()) {
            zVar2 = null;
        }
        if (zVar2 == null || (zVar = this.f28764c) == null) {
            return j9;
        }
        z4.z zVar3 = zVar.n() ? zVar : null;
        return zVar3 == null ? j9 : zVar2.g(zVar3, j9);
    }

    public final long e(long j9) {
        z4.z zVar;
        z4.z zVar2 = this.f28763b;
        if (zVar2 == null) {
            return j9;
        }
        if (!zVar2.n()) {
            zVar2 = null;
        }
        if (zVar2 == null || (zVar = this.f28764c) == null) {
            return j9;
        }
        z4.z zVar3 = zVar.n() ? zVar : null;
        return zVar3 == null ? j9 : zVar3.g(zVar2, j9);
    }
}
