package i2;

import a3.l0;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import z1.h2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f22857a = 56;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f0 f22858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f22859c;

    static {
        f0 f0Var = new f0();
        f22858b = f0Var;
        f22859c = new v(n0.f26529a, 0, 0, 0, h2.Horizontal, 0, 0, 0, a2.p.f234c, new f2.d0(2), v80.f0.b(kotlin.coroutines.g.f26549a), f0Var, z5.b.b(0, 0, 15));
    }

    public static final long a(v vVar, int i11) {
        int i12 = vVar.f22908c;
        int i13 = vVar.f22907b;
        long j9 = ((long) i11) * ((long) (i12 + i13));
        int i14 = -vVar.f22911f;
        int i15 = vVar.f22909d;
        long j11 = ((j9 + ((long) i14)) + ((long) i15)) - ((long) i12);
        int iF = (int) (vVar.f22910e == h2.Horizontal ? vVar.f() >> 32 : vVar.f() & 4294967295L);
        long jC = j11 - ((long) (iF - n80.p.c(vVar.f22918n.a(iF, i13, i14, i15), 0, iF)));
        if (jC < 0) {
            return 0L;
        }
        return jC;
    }

    public static final b b(int i11, Function0 function0, m3.n nVar, int i12) {
        Object[] objArr = new Object[0];
        ub.a aVar = b.J;
        boolean zD = ((((i12 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256 && ((m3.s) nVar).f(function0)) || (i12 & MLKEMEngine.KyberPolyBytes) == 256) | ((m3.s) nVar).d(i11) | ((m3.s) nVar).c(0.0f);
        m3.s sVar = (m3.s) nVar;
        Object objM = sVar.M();
        if (zD || objM == m3.m.f29332a) {
            objM = new l0(i11, function0, 4);
            sVar.k0(objM);
        }
        b bVar = (b) y3.j.d(objArr, aVar, (Function0) objM, sVar, 0);
        bVar.I.setValue(function0);
        return bVar;
    }
}
