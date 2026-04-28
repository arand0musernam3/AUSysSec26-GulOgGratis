package g3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p8 f19327a = new p8();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f19328b = 90;

    public final void a(final b4.t tVar, final float f11, final long j9, m3.n nVar, final int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1454716052);
        int i12 = (sVar.f(tVar) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            sVar.W();
            if ((i11 & 1) != 0 && !sVar.z()) {
                sVar.U();
            }
            sVar.r();
            d2.p.a(v1.n.j(d2.m2.e(d2.m2.d(tVar, 1.0f), f11), j9, i4.g0.f23254b), sVar, 0);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2(tVar, f11, j9, i11) { // from class: g3.n8

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ b4.t f19184b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ float f19185c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f19186d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iF = m3.i.F(433);
                    this.f19183a.a(this.f19184b, this.f19185c, this.f19186d, (m3.n) obj, iF);
                    return Unit.f26487a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(final b4.t r12, float r13, float r14, long r15, i4.v0 r17, m3.n r18, final int r19, final int r20) {
        /*
            r11 = this;
            r0 = r18
            m3.s r0 = (m3.s) r0
            r1 = -1895596205(0xffffffff8f037f53, float:-6.4833204E-30)
            r0.c0(r1)
            boolean r1 = r0.f(r12)
            if (r1 == 0) goto L12
            r1 = 4
            goto L13
        L12:
            r1 = 2
        L13:
            r1 = r19 | r1
            r3 = r20 & 2
            if (r3 == 0) goto L1c
            r1 = r1 | 48
            goto L2c
        L1c:
            r4 = r19 & 48
            if (r4 != 0) goto L2c
            boolean r5 = r0.c(r13)
            if (r5 == 0) goto L29
            r5 = 32
            goto L2b
        L29:
            r5 = 16
        L2b:
            r1 = r1 | r5
        L2c:
            r1 = r1 | 384(0x180, float:5.38E-43)
            r5 = r20 & 8
            if (r5 != 0) goto L3c
            r5 = r15
            boolean r7 = r0.e(r5)
            if (r7 == 0) goto L3d
            r7 = 2048(0x800, float:2.87E-42)
            goto L3f
        L3c:
            r5 = r15
        L3d:
            r7 = 1024(0x400, float:1.435E-42)
        L3f:
            r1 = r1 | r7
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r7 = r1 & 9363(0x2493, float:1.312E-41)
            r8 = 9362(0x2492, float:1.3119E-41)
            r9 = 1
            if (r7 == r8) goto L4b
            r7 = r9
            goto L4c
        L4b:
            r7 = 0
        L4c:
            r1 = r1 & r9
            boolean r1 = r0.R(r1, r7)
            if (r1 == 0) goto L98
            r0.W()
            r1 = r19 & 1
            if (r1 == 0) goto L6a
            boolean r1 = r0.z()
            if (r1 == 0) goto L61
            goto L6a
        L61:
            r0.U()
            r1 = r13
            r3 = r14
            r4 = r5
            r6 = r17
            goto L81
        L6a:
            if (r3 == 0) goto L70
            r1 = 24
            float r1 = (float) r1
            goto L71
        L70:
            r1 = r13
        L71:
            float r3 = l3.n0.f27058b
            r4 = r20 & 8
            if (r4 == 0) goto L7e
            l3.r r4 = l3.n0.f27057a
            long r4 = g3.r0.e(r4, r0)
            goto L7f
        L7e:
            r4 = r5
        L7f:
            l2.f r6 = l3.n0.f27059c
        L81:
            r0.r()
            b4.t r7 = d2.m2.h(r12, r3)
            b4.t r7 = d2.m2.l(r7, r1)
            b4.t r7 = v1.n.j(r7, r4, r6)
            d2.c.f(r7, r0)
            r7 = r6
            r5 = r4
            r4 = r3
            r3 = r1
            goto L9f
        L98:
            r0.U()
            r3 = r13
            r4 = r14
            r7 = r17
        L9f:
            m3.w1 r10 = r0.s()
            if (r10 == 0) goto Lb2
            g3.m8 r0 = new g3.m8
            r1 = r11
            r2 = r12
            r8 = r19
            r9 = r20
            r0.<init>()
            r10.f29476d = r0
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.p8.b(b4.t, float, float, long, i4.v0, m3.n, int, int):void");
    }

    public final void c(final b4.t tVar, float f11, long j9, m3.n nVar, final int i11, final int i12) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1498258020);
        int i13 = (sVar.f(tVar) ? 4 : 2) | i11 | 48;
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i13 |= ((i12 & 4) == 0 && sVar.e(j9)) ? 256 : 128;
        }
        if (sVar.R(i13 & 1, (i13 & 147) != 146)) {
            sVar.W();
            if ((i11 & 1) == 0 || sVar.z()) {
                f11 = l3.n0.f27058b;
                if ((i12 & 4) != 0) {
                    j9 = r0.e(l3.n0.f27057a, sVar);
                }
            } else {
                sVar.U();
            }
            sVar.r();
            d2.p.a(v1.n.j(d2.m2.e(d2.m2.d(tVar, 1.0f), f11), j9, i4.g0.f23254b), sVar, 0);
        } else {
            sVar.U();
        }
        final float f12 = f11;
        final long j11 = j9;
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2() { // from class: g3.o8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.f19228a.c(tVar, f12, j11, (m3.n) obj, m3.i.F(i11 | 1), i12);
                    return Unit.f26487a;
                }
            };
        }
    }
}
