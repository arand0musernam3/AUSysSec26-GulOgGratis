package h2;

import g3.q9;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m3.d3;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 implements y3.e, y3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y3.f f21164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y3.b f21165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q1.u0 f21166c;

    public l1(y3.e eVar, Map map, y3.b bVar) {
        q9 q9Var = new q9(eVar, 12);
        d3 d3Var = y3.g.f45406a;
        this.f21164a = new y3.f(map, q9Var);
        this.f21165b = bVar;
        q1.u0 u0Var = q1.j1.f35777a;
        this.f21166c = new q1.u0();
    }

    @Override // y3.e
    public final boolean a(Object obj) {
        return this.f21164a.a(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    @Override // y3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map b() {
        /*
            r14 = this;
            q1.u0 r0 = r14.f21166c
            java.lang.Object[] r1 = r0.f35769b
            long[] r0 = r0.f35768a
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L47
            r3 = 0
            r4 = r3
        Ld:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L42
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L27:
            if (r9 >= r7) goto L40
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3c
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            y3.b r11 = r14.f21165b
            r11.f(r10)
        L3c:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L27
        L40:
            if (r7 != r8) goto L47
        L42:
            if (r4 == r2) goto L47
            int r4 = r4 + 1
            goto Ld
        L47:
            y3.f r0 = r14.f21164a
            java.util.Map r0 = r0.b()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.l1.b():java.util.Map");
    }

    @Override // y3.e
    public final Object c(String str) {
        return this.f21164a.c(str);
    }

    @Override // y3.e
    public final y3.d d(String str, Function0 function0) {
        return this.f21164a.d(str, function0);
    }

    @Override // y3.b
    public final void e(Object obj, u3.d dVar, m3.n nVar, int i11) {
        int i12;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-858296452);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(obj) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(dVar) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.h(this) ? 256 : 128;
        }
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            this.f21165b.e(obj, dVar, sVar, i12 & 126);
            boolean zH = sVar.h(this) | sVar.h(obj);
            Object objM = sVar.M();
            if (zH || objM == m3.m.f29332a) {
                objM = new ek.a(24, this, obj);
                sVar.k0(objM);
            }
            m3.i.d(obj, (Function1) objM, sVar);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a3.a(this, obj, dVar, i11, 9);
        }
    }

    @Override // y3.b
    public final void f(Object obj) {
        this.f21165b.f(obj);
    }
}
