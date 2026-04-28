package k5;

import b5.l1;
import b5.m;
import b5.m0;
import b5.p0;
import b5.s1;
import c5.y;
import kotlin.jvm.internal.Intrinsics;
import q1.g0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h2.d f25976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ek.a f25977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f25978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f25979e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f25980f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f25981g = Long.MIN_VALUE;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e f25982h;

    public d(e eVar, int i11, h2.d dVar, ek.a aVar) {
        this.f25982h = eVar;
        this.f25975a = i11;
        this.f25976b = dVar;
        this.f25977c = aVar;
    }

    public final void a(long j9, long j11, long j12, long j13, float[] fArr) {
        c cVar;
        c cVar2;
        long j14 = this.f25982h.f25988f;
        h2.d dVar = this.f25976b;
        s1 s1VarE = m.e(dVar, 2);
        m0 m0VarG = m.g(dVar);
        boolean zJ = m0VarG.J();
        l1 l1Var = m0VarG.G;
        if (zJ) {
            if (l1Var.f5858d != s1VarE) {
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (j9 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j9 >> 32)) << 32);
                long j15 = s1VarE.f47185c;
                s1 s1Var = l1Var.f5858d;
                s1Var.getClass();
                long J = a.a.J(s1Var.q(s1VarE, jFloatToRawIntBits));
                cVar = new c(J, (4294967295L & ((long) (((int) (J & 4294967295L)) + ((int) (j15 & 4294967295L))))) | (((long) (((int) (J >> 32)) + ((int) (j15 >> 32)))) << 32), j12, j13, j14, fArr, dVar);
            } else {
                cVar = new c(j9, j11, j12, j13, j14, fArr, dVar);
            }
            cVar2 = cVar;
        } else {
            cVar2 = null;
        }
        if (cVar2 == null) {
            return;
        }
        this.f25977c.invoke(cVar2);
    }

    public final void b() {
        e eVar = this.f25982h;
        g0 g0Var = eVar.f25983a;
        int i11 = this.f25975a;
        d dVar = (d) g0Var.g(i11);
        if (dVar != null) {
            if (Intrinsics.areEqual(dVar, this)) {
                d dVar2 = this.f25978d;
                this.f25978d = null;
                if (dVar2 == null) {
                    m0 m0VarG = m.g(this.f25976b.getNode());
                    if (m0VarG.f5872h) {
                        ((y) p0.a(m0VarG)).getRectManager().f25958a.t(m0VarG.f5866b, false);
                        return;
                    }
                    return;
                }
                int iD = g0Var.d(i11);
                Object[] objArr = g0Var.f35800c;
                Object obj = objArr[iD];
                g0Var.f35799b[iD] = i11;
                objArr[iD] = dVar2;
                return;
            }
            int iD2 = g0Var.d(i11);
            Object[] objArr2 = g0Var.f35800c;
            Object obj2 = objArr2[iD2];
            g0Var.f35799b[iD2] = i11;
            objArr2[iD2] = dVar;
            while (true) {
                d dVar3 = dVar.f25978d;
                if (dVar3 == null) {
                    break;
                }
                if (dVar3 == this) {
                    dVar.f25978d = this.f25978d;
                    this.f25978d = null;
                    return;
                }
                dVar = dVar3;
            }
        }
        d dVar4 = eVar.f25984b;
        if (dVar4 == this) {
            eVar.f25984b = dVar4.f25978d;
            this.f25978d = null;
            return;
        }
        d dVar5 = dVar4 != null ? dVar4.f25978d : null;
        while (true) {
            d dVar6 = dVar4;
            dVar4 = dVar5;
            if (dVar4 == null) {
                return;
            }
            if (dVar4 == this) {
                if (dVar6 != null) {
                    dVar6.f25978d = dVar4.f25978d;
                }
                this.f25978d = null;
                return;
            }
            dVar5 = dVar4.f25978d;
        }
    }
}
