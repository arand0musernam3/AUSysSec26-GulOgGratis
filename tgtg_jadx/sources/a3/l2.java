package a3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h4.c f447a = new h4.c(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static final boolean a(long j9, h4.c cVar) {
        float f11 = cVar.f21380a;
        float f12 = cVar.f21382c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
        if (f11 > fIntBitsToFloat || fIntBitsToFloat > f12) {
            return false;
        }
        float f13 = cVar.f21381b;
        float f14 = cVar.f21383d;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L));
        return f13 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f14;
    }

    public static final long b(j2 j2Var, long j9, h0 h0Var) {
        z4.z zVarC;
        long jB;
        long j11;
        m5.r rVar;
        int iD;
        float fB;
        m5.r rVar2;
        int iD2;
        m5.r rVar3;
        int iD3;
        float fB2;
        m5.r rVar4;
        int iD4;
        s sVarC = j2Var.c(h0Var);
        if (sVarC == null) {
            return 9205357640488583168L;
        }
        z2.h hVar = sVarC.f551c;
        z4.z zVar = j2Var.l;
        if (zVar == null || (zVarC = sVarC.c()) == null) {
            return 9205357640488583168L;
        }
        int i11 = h0Var.f367b;
        m5.q0 q0Var = (m5.q0) hVar.invoke();
        if (i11 > (q0Var == null ? 0 : sVarC.b(q0Var))) {
            return 9205357640488583168L;
        }
        h4.b bVar = (h4.b) j2Var.f419s.getValue();
        bVar.getClass();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (zVarC.g(zVar, bVar.f21378a) >> 32));
        m5.q0 q0Var2 = (m5.q0) hVar.invoke();
        if (q0Var2 == null) {
            jB = m5.t0.f29648b;
        } else {
            m5.r rVar5 = q0Var2.f29618b;
            int iB = sVarC.b(q0Var2);
            if (iB < 1) {
                jB = m5.t0.f29648b;
            } else {
                int iD5 = rVar5.d(n80.p.c(i11, 0, iB - 1));
                jB = m5.k0.b(q0Var2.i(iD5), rVar5.c(iD5, true));
            }
        }
        if (m5.t0.d(jB)) {
            m5.q0 q0Var3 = (m5.q0) hVar.invoke();
            fB = (q0Var3 != null && (iD4 = (rVar4 = q0Var3.f29618b).d(i11)) < rVar4.f29628f) ? q0Var3.g(iD4) : -1.0f;
            j11 = 4294967295L;
        } else {
            j11 = 4294967295L;
            int i12 = (int) (jB >> 32);
            m5.q0 q0Var4 = (m5.q0) hVar.invoke();
            float fG = (q0Var4 != null && (iD2 = (rVar2 = q0Var4.f29618b).d(i12)) < rVar2.f29628f) ? q0Var4.g(iD2) : -1.0f;
            int i13 = ((int) (jB & 4294967295L)) - 1;
            m5.q0 q0Var5 = (m5.q0) hVar.invoke();
            float fH = (q0Var5 != null && (iD = (rVar = q0Var5.f29618b).d(i13)) < rVar.f29628f) ? q0Var5.h(iD) : -1.0f;
            fB = n80.p.b(fIntBitsToFloat, Math.min(fG, fH), Math.max(fG, fH));
        }
        if (fB == -1.0f) {
            return 9205357640488583168L;
        }
        if (!z5.l.a(j9, 0L) && Math.abs(fIntBitsToFloat - fB) > ((int) (j9 >> 32)) / 2) {
            return 9205357640488583168L;
        }
        m5.q0 q0Var6 = (m5.q0) hVar.invoke();
        if (q0Var6 != null && (iD3 = (rVar3 = q0Var6.f29618b).d(i11)) < rVar3.f29628f) {
            float f11 = rVar3.f(iD3);
            fB2 = ((rVar3.b(iD3) - f11) / 2) + f11;
        } else {
            fB2 = -1.0f;
        }
        if (fB2 == -1.0f) {
            return 9205357640488583168L;
        }
        return zVar.g(zVarC, (((long) Float.floatToRawIntBits(fB)) << 32) | (((long) Float.floatToRawIntBits(fB2)) & j11));
    }

    public static final h4.c c(z4.z zVar) {
        h4.c cVarF = z4.c0.f(zVar, true);
        long jF = zVar.F(cVarF.f());
        float f11 = cVarF.f21382c;
        float f12 = cVarF.f21383d;
        return na0.a.R(jF, zVar.F((((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f12)) & 4294967295L)));
    }
}
