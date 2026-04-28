package b5;

import android.os.Build;
import android.view.ViewParent;
import androidx.compose.ui.node.Owner;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s1 extends u0 implements z4.t0, z4.z, e2 {
    public static final d O = d.f5781m;
    public static final d P = d.l;
    public static final i4.s0 Q = new i4.s0();
    public static final a0 T = new a0();
    public static final float[] V = i4.l0.a();
    public static final m1 W = new m1(0);
    public static final m1 X = new m1(1);
    public float B;
    public h4.a C;
    public a0 D;
    public boolean F;
    public boolean G;
    public l4.b H;
    public i4.t I;
    public n1 J;
    public boolean L;
    public c2 M;
    public l4.b N;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m0 f5966p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public s1 f5967q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public s1 f5968r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f5969s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f5970t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Function1 f5971u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public z5.c f5972v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public z5.m f5973w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public z4.v0 f5975y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public q1.n0 f5976z;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f5974x = 0.8f;
    public long A = 0;
    public i4.v0 E = i4.g0.f23254b;
    public final o1 K = new o1(this, 1);

    public s1(m0 m0Var) {
        this.f5966p = m0Var;
        this.f5972v = m0Var.f5889z;
        this.f5973w = m0Var.A;
    }

    public static s1 x1(z4.z zVar) {
        s1 s1Var;
        z4.s0 s0Var = zVar instanceof z4.s0 ? (z4.s0) zVar : null;
        if (s0Var != null && (s1Var = s0Var.f47231a.f6007p) != null) {
            return s1Var;
        }
        zVar.getClass();
        return (s1) zVar;
    }

    public final void A1(s1 s1Var, float[] fArr) {
        s1 s1Var2 = this;
        while (!Intrinsics.areEqual(s1Var2, s1Var)) {
            c2 c2Var = s1Var2.M;
            if (c2Var != null) {
                i4.l0.g(fArr, ((c5.f2) c2Var).b());
            }
            if (!z5.j.b(s1Var2.A, 0L)) {
                float[] fArr2 = V;
                i4.l0.d(fArr2);
                i4.l0.h(fArr2, (int) (r1 >> 32), (int) (r1 & 4294967295L));
                i4.l0.g(fArr, fArr2);
            }
            s1Var2 = s1Var2.f5968r;
            s1Var2.getClass();
        }
    }

    public final void B1(Function1 function1, boolean z11) {
        Owner owner;
        o3.e eVar;
        Reference referencePoll;
        if (function1 != null && this.N != null) {
            y4.a.a("layerBlock can't be provided when explicitLayer is provided");
        }
        m0 m0Var = this.f5966p;
        boolean z12 = (!z11 && this.f5971u == function1 && Intrinsics.areEqual(this.f5972v, m0Var.f5889z) && this.f5973w == m0Var.A) ? false : true;
        this.f5972v = m0Var.f5889z;
        this.f5973w = m0Var.A;
        boolean zI = m0Var.I();
        o1 o1Var = this.K;
        if (zI && function1 != null) {
            this.f5971u = function1;
            if (this.M != null) {
                if (z12) {
                    C1(true);
                    return;
                }
                return;
            }
            Owner ownerA = p0.a(m0Var);
            n1 n1Var = this.J;
            if (n1Var == null) {
                n1 n1Var2 = new n1(0, this, new o1(this, 0));
                this.J = n1Var2;
                n1Var = n1Var2;
            }
            c2 c2VarJ = ((c5.y) ownerA).j(n1Var, o1Var, null);
            c5.f2 f2Var = (c5.f2) c2VarJ;
            f2Var.e(this.f47185c);
            f2Var.d(this.A);
            this.M = c2VarJ;
            C1(true);
            m0Var.K = true;
            o1Var.invoke();
            return;
        }
        this.f5971u = null;
        c2 c2Var = this.M;
        if (c2Var != null) {
            c5.f2 f2Var2 = (c5.f2) c2Var;
            if (!i4.g0.s(f2Var2.b())) {
                m0Var.O();
            }
            f2Var2.f7221d = null;
            f2Var2.f7222e = null;
            f2Var2.f7224g = true;
            f2Var2.f(false);
            i4.e0 e0Var = f2Var2.f7219b;
            if (e0Var != null) {
                e0Var.a(f2Var2.f7218a);
                c5.y yVar = f2Var2.f7220c;
                w2.z zVar = yVar.C1;
                do {
                    ReferenceQueue referenceQueue = (ReferenceQueue) zVar.f43084c;
                    eVar = (o3.e) zVar.f43083b;
                    referencePoll = referenceQueue.poll();
                    if (referencePoll != null) {
                        eVar.j(referencePoll);
                    }
                } while (referencePoll != null);
                eVar.b(new WeakReference(f2Var2, (ReferenceQueue) zVar.f43084c));
                yVar.D.k(f2Var2);
            }
            m0Var.K = true;
            o1Var.invoke();
            if (n() && m0Var.J() && (owner = m0Var.f5878o) != null) {
                ((c5.y) owner).y(m0Var);
            }
        }
        this.M = null;
        this.L = false;
    }

    public final void C1(boolean z11) {
        char c3;
        c5.y yVar;
        boolean z12;
        c5.y yVar2;
        Owner owner;
        Function0 function0;
        Function0 function02;
        if (this.N != null) {
            return;
        }
        c2 c2Var = this.M;
        Function1 function1 = this.f5971u;
        if (c2Var == null) {
            if (function1 == null) {
                return;
            }
            y4.a.b("null layer with a non-null layerBlock");
            return;
        }
        if (function1 == null) {
            throw b3.i.D("updateLayerParameters requires a non-null layerBlock");
        }
        i4.s0 s0Var = Q;
        s0Var.b();
        m0 m0Var = this.f5966p;
        s0Var.f23298r = m0Var.f5889z;
        s0Var.f23299s = m0Var.A;
        s0Var.f23297q = b0.z.z(this.f47185c);
        ((c5.y) p0.a(m0Var)).getSnapshotObserver().f5819a.d(this, O, new r1(0, function1, this));
        a0 a0Var = this.D;
        if (a0Var == null) {
            a0Var = new a0();
            this.D = a0Var;
        }
        a0 a0Var2 = T;
        a0Var2.getClass();
        a0Var2.f5746a = a0Var.f5746a;
        a0Var2.f5747b = a0Var.f5747b;
        a0Var2.f5748c = a0Var.f5748c;
        a0Var2.f5749d = a0Var.f5749d;
        a0Var2.f5750e = a0Var.f5750e;
        a0Var2.f5751f = a0Var.f5751f;
        a0Var2.f5752g = a0Var.f5752g;
        a0Var2.f5753h = a0Var.f5753h;
        a0Var2.f5754i = a0Var.f5754i;
        float f11 = s0Var.f23283b;
        a0Var.f5746a = f11;
        a0Var.f5747b = s0Var.f23284c;
        a0Var.f5748c = s0Var.f23286e;
        a0Var.f5749d = s0Var.f23287f;
        a0Var.f5750e = s0Var.f23291j;
        a0Var.f5751f = s0Var.f23292k;
        a0Var.f5752g = s0Var.l;
        a0Var.f5753h = s0Var.f23293m;
        long j9 = s0Var.f23294n;
        a0Var.f5754i = j9;
        c5.f2 f2Var = (c5.f2) c2Var;
        c5.y yVar3 = f2Var.f7220c;
        int i11 = s0Var.f23282a | f2Var.f7230n;
        f2Var.l = s0Var.f23299s;
        f2Var.f7228k = s0Var.f23298r;
        int i12 = i11 & 4096;
        if (i12 != 0) {
            f2Var.f7231o = j9;
        }
        if ((i11 & 1) != 0) {
            l4.d dVar = f2Var.f7218a.f27273a;
            if (dVar.c() != f11) {
                dVar.z(f11);
            }
        }
        if ((i11 & 2) != 0) {
            l4.b bVar = f2Var.f7218a;
            float f12 = s0Var.f23284c;
            l4.d dVar2 = bVar.f27273a;
            if (dVar2.L() != f12) {
                dVar2.n(f12);
            }
        }
        if ((i11 & 4) != 0) {
            f2Var.f7218a.e(s0Var.f23285d);
        }
        if ((i11 & 8) != 0) {
            l4.b bVar2 = f2Var.f7218a;
            float f13 = s0Var.f23286e;
            l4.d dVar3 = bVar2.f27273a;
            if (dVar3.B() != f13) {
                dVar3.F(f13);
            }
        }
        if ((i11 & 16) != 0) {
            l4.b bVar3 = f2Var.f7218a;
            float f14 = s0Var.f23287f;
            l4.d dVar4 = bVar3.f27273a;
            if (dVar4.v() != f14) {
                dVar4.g(f14);
            }
        }
        if ((i11 & 32) != 0) {
            l4.b bVar4 = f2Var.f7218a;
            float f15 = s0Var.f23288g;
            l4.d dVar5 = bVar4.f27273a;
            if (dVar5.K() != f15) {
                dVar5.d(f15);
                bVar4.f27279g = true;
                bVar4.a();
            }
            if (s0Var.f23288g > 0.0f && !f2Var.f7236t && (function02 = f2Var.f7222e) != null) {
                function02.invoke();
            }
        }
        if ((i11 & 64) != 0) {
            l4.b bVar5 = f2Var.f7218a;
            long j11 = s0Var.f23289h;
            l4.d dVar6 = bVar5.f27273a;
            if (!i4.v.c(j11, dVar6.t())) {
                dVar6.x(j11);
            }
        }
        if ((i11 & 128) != 0) {
            l4.b bVar6 = f2Var.f7218a;
            long j12 = s0Var.f23290i;
            l4.d dVar7 = bVar6.f27273a;
            if (!i4.v.c(j12, dVar7.w())) {
                dVar7.G(j12);
            }
        }
        if ((i11 & 1024) != 0) {
            l4.b bVar7 = f2Var.f7218a;
            float f16 = s0Var.l;
            l4.d dVar8 = bVar7.f27273a;
            if (dVar8.r() != f16) {
                dVar8.f(f16);
            }
        }
        if ((i11 & 256) != 0) {
            l4.b bVar8 = f2Var.f7218a;
            float f17 = s0Var.f23291j;
            l4.d dVar9 = bVar8.f27273a;
            if (dVar9.D() != f17) {
                dVar9.M(f17);
            }
        }
        if ((i11 & 512) != 0) {
            l4.b bVar9 = f2Var.f7218a;
            float f18 = s0Var.f23292k;
            l4.d dVar10 = bVar9.f27273a;
            if (dVar10.p() != f18) {
                dVar10.b(f18);
            }
        }
        if ((i11 & NewHope.SENDB_BYTES) != 0) {
            l4.b bVar10 = f2Var.f7218a;
            float f19 = s0Var.f23293m;
            l4.d dVar11 = bVar10.f27273a;
            if (dVar11.A() != f19) {
                dVar11.J(f19);
            }
        }
        if (i12 != 0) {
            c3 = ' ';
            boolean zA = i4.z0.a(f2Var.f7231o, i4.z0.f23335b);
            l4.b bVar11 = f2Var.f7218a;
            if (!zA) {
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (f2Var.f7231o & 4294967295L)) * ((int) (f2Var.f7223f & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (f2Var.f7231o >> 32)) * ((int) (f2Var.f7223f >> 32)))) << 32);
                if (!h4.b.b(bVar11.f27293v, jFloatToRawIntBits)) {
                    bVar11.f27293v = jFloatToRawIntBits;
                    bVar11.f27273a.s(jFloatToRawIntBits);
                }
            } else if (!h4.b.b(bVar11.f27293v, 9205357640488583168L)) {
                bVar11.f27293v = 9205357640488583168L;
                bVar11.f27273a.s(9205357640488583168L);
            }
        } else {
            c3 = ' ';
        }
        if ((i11 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0) {
            l4.b bVar12 = f2Var.f7218a;
            boolean z13 = s0Var.f23296p;
            if (bVar12.f27294w != z13) {
                bVar12.f27294w = z13;
                bVar12.f27279g = true;
                bVar12.a();
            }
        }
        if ((131072 & i11) != 0) {
            l4.d dVar12 = f2Var.f7218a.f27273a;
            if (!Intrinsics.areEqual((Object) null, (Object) null)) {
                dVar12.e();
            }
        }
        if ((262144 & i11) != 0) {
            l4.d dVar13 = f2Var.f7218a.f27273a;
            if (!Intrinsics.areEqual(dVar13.m(), (Object) null)) {
                dVar13.y();
            }
        }
        if ((524288 & i11) != 0) {
            l4.b bVar13 = f2Var.f7218a;
            int i13 = s0Var.f23300t;
            l4.d dVar14 = bVar13.f27273a;
            if (dVar14.N() != i13) {
                dVar14.j(i13);
            }
        }
        if ((32768 & i11) != 0) {
            l4.d dVar15 = f2Var.f7218a.f27273a;
            if (dVar15.l() != 0) {
                dVar15.E(0);
            }
        }
        if ((i11 & 7963) != 0) {
            f2Var.f7233q = true;
            f2Var.f7234r = true;
        }
        if (Intrinsics.areEqual(f2Var.f7232p, s0Var.f23301u)) {
            yVar = yVar3;
            z12 = false;
        } else {
            i4.g0 g0Var = s0Var.f23301u;
            f2Var.f7232p = g0Var;
            if (g0Var == null) {
                yVar = yVar3;
            } else {
                l4.b bVar14 = f2Var.f7218a;
                if (g0Var instanceof i4.n0) {
                    h4.c cVar = ((i4.n0) g0Var).f23271f;
                    float f20 = cVar.f21380a;
                    float f21 = cVar.f21381b;
                    yVar = yVar3;
                    bVar14.f((((long) Float.floatToRawIntBits(f20)) << c3) | (((long) Float.floatToRawIntBits(f21)) & 4294967295L), (((long) Float.floatToRawIntBits(cVar.f21382c - f20)) << c3) | (((long) Float.floatToRawIntBits(cVar.f21383d - f21)) & 4294967295L), 0.0f);
                } else {
                    yVar = yVar3;
                    if (g0Var instanceof i4.m0) {
                        i4.h hVar = ((i4.m0) g0Var).f23270f;
                        bVar14.f27283k = null;
                        bVar14.f27281i = 9205357640488583168L;
                        bVar14.f27280h = 0L;
                        bVar14.f27282j = 0.0f;
                        bVar14.f27279g = true;
                        bVar14.f27285n = false;
                        bVar14.l = hVar;
                        bVar14.a();
                    } else {
                        if (!(g0Var instanceof i4.o0)) {
                            e40.a.f();
                            return;
                        }
                        i4.o0 o0Var = (i4.o0) g0Var;
                        i4.h hVar2 = o0Var.f23275g;
                        if (hVar2 != null) {
                            bVar14.f27283k = null;
                            bVar14.f27281i = 9205357640488583168L;
                            bVar14.f27280h = 0L;
                            bVar14.f27282j = 0.0f;
                            bVar14.f27279g = true;
                            bVar14.f27285n = false;
                            bVar14.l = hVar2;
                            bVar14.a();
                        } else {
                            h4.d dVar16 = o0Var.f23274f;
                            float f22 = dVar16.f21385b;
                            float f23 = dVar16.f21384a;
                            bVar14.f((((long) Float.floatToRawIntBits(f23)) << c3) | (((long) Float.floatToRawIntBits(f22)) & 4294967295L), (((long) Float.floatToRawIntBits(dVar16.f21386c - f23)) << c3) | (((long) Float.floatToRawIntBits(dVar16.f21387d - f22)) & 4294967295L), Float.intBitsToFloat((int) (dVar16.f21391h >> c3)));
                        }
                    }
                }
                if ((g0Var instanceof i4.m0) && Build.VERSION.SDK_INT < 33 && (function0 = f2Var.f7222e) != null) {
                    function0.invoke();
                }
            }
            z12 = true;
        }
        f2Var.f7230n = s0Var.f23282a;
        if (i11 != 0 || z12) {
            ViewParent parent = yVar.getParent();
            if (parent != null) {
                yVar2 = yVar;
                parent.onDescendantInvalidated(yVar2, yVar2);
            } else {
                yVar2 = yVar;
            }
            if (yVar2.l) {
                yVar2.M(0.0f);
            }
        }
        boolean z14 = this.f5970t;
        this.f5970t = s0Var.f23296p;
        this.f5974x = s0Var.f23285d;
        boolean z15 = a0Var2.f5746a == a0Var.f5746a && a0Var2.f5747b == a0Var.f5747b && a0Var2.f5748c == a0Var.f5748c && a0Var2.f5749d == a0Var.f5749d && a0Var2.f5750e == a0Var.f5750e && a0Var2.f5751f == a0Var.f5751f && a0Var2.f5752g == a0Var.f5752g && a0Var2.f5753h == a0Var.f5753h && i4.z0.a(a0Var2.f5754i, a0Var.f5754i);
        if (z11 && ((!z15 || z14 != this.f5970t) && (owner = m0Var.f5878o) != null)) {
            ((c5.y) owner).y(m0Var);
        }
        if (z15) {
            return;
        }
        q0 q0Var = m0Var.H;
        if (q0Var.l > 0) {
            if (q0Var.f5938k || q0Var.f5937j) {
                m0Var.X(false);
            }
            q0Var.f5942p.C0();
        }
        m0Var.O();
        c5.y yVar4 = (c5.y) p0.a(m0Var);
        k5.b rectManager = yVar4.getRectManager();
        if (this == m0Var.G.f5858d) {
            rectManager.f(m0Var, false);
        } else {
            rectManager.getClass();
            if (m0Var.J()) {
                long jG = k5.b.g(m0Var);
                if (z5.j.b(jG, 9223372034707292159L)) {
                    rectManager.d(m0Var);
                } else {
                    m0Var.f5870f = jG;
                    m0Var.f5871g = false;
                    o3.e eVarA = m0Var.A();
                    Object[] objArr = eVarA.f31830a;
                    int i14 = eVarA.f31832c;
                    for (int i15 = 0; i15 < i14; i15++) {
                        rectManager.f((m0) objArr[i15], false);
                    }
                    rectManager.e(m0Var);
                }
            }
        }
        if (m0Var.Q > 0) {
            w2.z zVar = yVar4.f7441h0.f5766e;
            zVar.getClass();
            if (m0Var.Q > 0) {
                ((o3.e) zVar.f43083b).b(m0Var);
                m0Var.P = true;
            }
            yVar4.F(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean D1(long r26) {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.s1.D1(long):boolean");
    }

    @Override // b5.u0
    public final u0 E0() {
        return this.f5967q;
    }

    @Override // z4.z
    public final long F(long j9) {
        if (!n()) {
            y4.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        z4.z zVarI = z4.c0.i(this);
        c5.y yVar = (c5.y) p0.a(this.f5966p);
        yVar.C();
        return q(zVarI, h4.b.e(i4.l0.b(j9, yVar.f7444i1), zVarI.S(0L)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r5v5, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // z4.m1, z4.t
    public final Object G() {
        m0 m0Var = this.f5966p;
        if (!m0Var.G.d(64)) {
            return null;
        }
        d1();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        for (b4.s parent$ui = m0Var.G.f5859e; parent$ui != null; parent$ui = parent$ui.getParent$ui()) {
            if ((parent$ui.getKindSet$ui() & 64) != 0) {
                ?? eVar = 0;
                ?? B = parent$ui;
                while (B != 0) {
                    if (B instanceof g2) {
                        objectRef.element = ((g2) B).b(m0Var.f5889z, objectRef.element);
                    } else if ((B.getKindSet$ui() & 64) != 0 && (B instanceof n)) {
                        b4.s child$ui = ((n) B).f5892p;
                        int i11 = 0;
                        B = B;
                        eVar = eVar;
                        while (child$ui != null) {
                            if ((child$ui.getKindSet$ui() & 64) != 0) {
                                i11++;
                                eVar = eVar;
                                if (i11 == 1) {
                                    B = child$ui;
                                } else {
                                    if (eVar == 0) {
                                        eVar = new o3.e(new b4.s[16], 0);
                                    }
                                    if (B != 0) {
                                        eVar.b(B);
                                        B = 0;
                                    }
                                    eVar.b(child$ui);
                                }
                            }
                            child$ui = child$ui.getChild$ui();
                            B = B;
                            eVar = eVar;
                        }
                        if (i11 == 1) {
                        }
                    }
                    B = m.b(eVar);
                }
            }
        }
        return objectRef.element;
    }

    @Override // b5.u0
    public final boolean H0() {
        return this.f5975y != null;
    }

    @Override // b5.u0
    public final m0 I0() {
        return this.f5966p;
    }

    @Override // z4.z
    public final void J(z4.z zVar, float[] fArr) {
        s1 s1VarX1 = x1(zVar);
        s1VarX1.m1();
        s1 s1VarZ0 = Z0(s1VarX1);
        i4.l0.d(fArr);
        s1VarX1.A1(s1VarZ0, fArr);
        z1(s1VarZ0, fArr);
    }

    @Override // z4.z
    public final z4.z K() {
        boolean zN = n();
        m0 m0Var = this.f5966p;
        if (!zN) {
            StringBuilder sb2 = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (m0 m0VarW = m0Var; m0VarW != null; m0VarW = m0VarW.w()) {
                sb2.append("\n|");
                sb2.append(m0VarW);
                sb2.append(" isAttached=");
                sb2.append(m0VarW.I());
                sb2.append(" modifier=");
                sb2.append(m0VarW.L);
                sb2.append(" tail=");
                sb2.append(d1());
            }
            y4.a.b(sb2.toString());
        }
        m1();
        return m0Var.G.f5858d.f5968r;
    }

    @Override // b5.u0
    public final z4.v0 L0() {
        z4.v0 v0Var = this.f5975y;
        if (v0Var != null) {
            return v0Var;
        }
        com.braze.h2.b("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    @Override // b5.u0
    public final u0 M0() {
        return this.f5968r;
    }

    @Override // b5.u0
    public final long N0() {
        return this.A;
    }

    @Override // z4.z
    public final long P(long j9) {
        if (!n()) {
            y4.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return q(z4.c0.i(this), ((c5.y) p0.a(this.f5966p)).G(j9));
    }

    @Override // b5.u0
    public final void R0() {
        l4.b bVar = this.N;
        long j9 = this.A;
        if (bVar != null) {
            l0(j9, this.B, bVar);
        } else {
            h0(j9, this.B, this.f5971u);
        }
    }

    @Override // z4.z
    public final long S(long j9) {
        if (!n()) {
            y4.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        m1();
        for (s1 s1Var = this; s1Var != null; s1Var = s1Var.f5968r) {
            m0 m0Var = s1Var.f5966p;
            if (s1Var == m0Var.G.f5858d && !m0Var.f5867c) {
                long jB = ((c5.y) p0.a(m0Var)).getRectManager().b(m0Var);
                if (!z5.j.b(jB, 9223372034707292159L)) {
                    return a.a.H(j9, jB);
                }
            }
            c2 c2Var = s1Var.M;
            if (c2Var != null) {
                c5.f2 f2Var = (c5.f2) c2Var;
                float[] fArrB = f2Var.b();
                if (!f2Var.f7235s) {
                    j9 = i4.l0.b(j9, fArrB);
                }
            }
            j9 = a.a.H(j9, s1Var.A);
        }
        return j9;
    }

    public final void S0(s1 s1Var, h4.a aVar, boolean z11) {
        if (s1Var == this) {
            return;
        }
        s1 s1Var2 = this.f5968r;
        if (s1Var2 != null) {
            s1Var2.S0(s1Var, aVar, z11);
        }
        long j9 = this.A;
        float f11 = (int) (j9 >> 32);
        aVar.f21374b -= f11;
        aVar.f21376d -= f11;
        float f12 = (int) (j9 & 4294967295L);
        aVar.f21375c -= f12;
        aVar.f21377e -= f12;
        c2 c2Var = this.M;
        if (c2Var != null) {
            c5.f2 f2Var = (c5.f2) c2Var;
            float[] fArrA = f2Var.a();
            if (!f2Var.f7235s) {
                if (fArrA == null) {
                    aVar.f21374b = 0.0f;
                    aVar.f21375c = 0.0f;
                    aVar.f21376d = 0.0f;
                    aVar.f21377e = 0.0f;
                } else {
                    i4.l0.c(fArrA, aVar);
                }
            }
            if (this.f5970t && z11) {
                long j11 = this.f47185c;
                aVar.a(0.0f, 0.0f, (int) (j11 >> 32), (int) (j11 & 4294967295L));
            }
        }
    }

    public final long T0(s1 s1Var, long j9) {
        if (s1Var == this) {
            return j9;
        }
        s1 s1Var2 = this.f5968r;
        return (s1Var2 == null || Intrinsics.areEqual(s1Var, s1Var2)) ? a1(j9) : a1(s1Var2.T0(s1Var, j9));
    }

    public final long U0(long j9) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32)) - e0();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L)) - d0();
        float fMax = Math.max(0.0f, fIntBitsToFloat / 2.0f);
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 / 2.0f))) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    public final float V0(long j9, long j11) {
        if (e0() >= Float.intBitsToFloat((int) (j11 >> 32)) && d0() >= Float.intBitsToFloat((int) (j11 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jU0 = U0(j11);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jU0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jU0 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j9 >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - e0());
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j9 & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat4 < 0.0f ? -fIntBitsToFloat4 : fIntBitsToFloat4 - d0()))) & 4294967295L) | (((long) Float.floatToRawIntBits(fMax)) << 32);
        if ((fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) && Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) <= fIntBitsToFloat && Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) <= fIntBitsToFloat2) {
            return h4.b.d(jFloatToRawIntBits);
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void W0(i4.t tVar, l4.b bVar) {
        c2 c2Var = this.M;
        if (c2Var == null) {
            long j9 = this.A;
            float f11 = (int) (j9 >> 32);
            float f12 = (int) (j9 & 4294967295L);
            tVar.n(f11, f12);
            X0(tVar, bVar);
            tVar.n(-f11, -f12);
            return;
        }
        c5.f2 f2Var = (c5.f2) c2Var;
        k4.b bVar2 = f2Var.f7229m;
        f2Var.g();
        f2Var.f7236t = f2Var.f7218a.f27273a.K() > 0.0f;
        j30.g gVar = bVar2.f25938b;
        gVar.x(tVar);
        gVar.f24503c = bVar;
        d40.t1.A(bVar2, f2Var.f7218a);
    }

    @Override // z5.c
    public final float X() {
        return this.f5966p.f5889z.X();
    }

    public final void X0(i4.t tVar, l4.b bVar) {
        i4.t tVar2;
        l4.b bVar2;
        b4.s sVarE1 = e1(4);
        if (sVarE1 == null) {
            s1(tVar, bVar);
            return;
        }
        m0 m0Var = this.f5966p;
        m0Var.getClass();
        o0 sharedDrawScope = ((c5.y) p0.a(m0Var)).getSharedDrawScope();
        long jZ = b0.z.z(this.f47185c);
        sharedDrawScope.getClass();
        o3.e eVar = null;
        while (sVarE1 != null) {
            if (sVarE1 instanceof r) {
                tVar2 = tVar;
                bVar2 = bVar;
                sharedDrawScope.c(tVar2, jZ, this, (r) sVarE1, bVar2);
            } else {
                tVar2 = tVar;
                bVar2 = bVar;
                if ((sVarE1.getKindSet$ui() & 4) != 0 && (sVarE1 instanceof n)) {
                    int i11 = 0;
                    for (b4.s child$ui = ((n) sVarE1).f5892p; child$ui != null; child$ui = child$ui.getChild$ui()) {
                        if ((child$ui.getKindSet$ui() & 4) != 0) {
                            i11++;
                            if (i11 == 1) {
                                sVarE1 = child$ui;
                            } else {
                                if (eVar == null) {
                                    eVar = new o3.e(new b4.s[16], 0);
                                }
                                if (sVarE1 != null) {
                                    eVar.b(sVarE1);
                                    sVarE1 = null;
                                }
                                eVar.b(child$ui);
                            }
                        }
                    }
                    if (i11 == 1) {
                    }
                }
                tVar = tVar2;
                bVar = bVar2;
            }
            sVarE1 = m.b(eVar);
            tVar = tVar2;
            bVar = bVar2;
        }
    }

    public abstract void Y0();

    public final s1 Z0(s1 s1Var) {
        m0 m0VarW = s1Var.f5966p;
        m0 m0Var = this.f5966p;
        if (m0VarW == m0Var) {
            b4.s sVarD1 = s1Var.d1();
            b4.s sVarD12 = d1();
            if (!sVarD12.getNode().isAttached()) {
                y4.a.b("visitLocalAncestors called on an unattached node");
            }
            for (b4.s parent$ui = sVarD12.getNode().getParent$ui(); parent$ui != null; parent$ui = parent$ui.getParent$ui()) {
                if ((parent$ui.getKindSet$ui() & 2) != 0 && parent$ui == sVarD1) {
                    return s1Var;
                }
            }
            return this;
        }
        while (m0VarW.f5880q > m0Var.f5880q) {
            m0VarW = m0VarW.w();
            m0VarW.getClass();
        }
        m0 m0VarW2 = m0Var;
        while (m0VarW2.f5880q > m0VarW.f5880q) {
            m0VarW2 = m0VarW2.w();
            m0VarW2.getClass();
        }
        while (m0VarW != m0VarW2) {
            m0VarW = m0VarW.w();
            m0VarW2 = m0VarW2.w();
            if (m0VarW == null || m0VarW2 == null) {
                i4.a.f("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (m0VarW2 != m0Var) {
            if (m0VarW != s1Var.f5966p) {
                return m0VarW.G.f5857c;
            }
            return s1Var;
        }
        return this;
    }

    @Override // z5.c
    public final float a() {
        return this.f5966p.f5889z.a();
    }

    public final long a1(long j9) {
        long j11 = this.A;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j9 & 4294967295L)) - ((int) (j11 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j9 >> 32)) - ((int) (j11 >> 32)))) << 32);
        c2 c2Var = this.M;
        if (c2Var == null) {
            return jFloatToRawIntBits;
        }
        c5.f2 f2Var = (c5.f2) c2Var;
        float[] fArrA = f2Var.a();
        if (fArrA == null) {
            return 9187343241974906880L;
        }
        return f2Var.f7235s ? jFloatToRawIntBits : i4.l0.b(jFloatToRawIntBits, fArrA);
    }

    public abstract v0 b1();

    public final long c1() {
        return this.f5972v.x0(this.f5966p.B.d());
    }

    public abstract b4.s d1();

    @Override // z4.z
    public final long e(long j9) {
        long jS = S(j9);
        c5.y yVar = (c5.y) p0.a(this.f5966p);
        yVar.C();
        return i4.l0.b(jS, yVar.f7442h1);
    }

    public final b4.s e1(int i11) {
        boolean zH = t1.h(i11);
        b4.s sVarD1 = d1();
        if (!zH && (sVarD1 = sVarD1.getParent$ui()) == null) {
            return null;
        }
        for (b4.s sVarF1 = f1(zH); sVarF1 != null && (sVarF1.getAggregateChildKindSet$ui() & i11) != 0; sVarF1 = sVarF1.getChild$ui()) {
            if ((sVarF1.getKindSet$ui() & i11) != 0) {
                return sVarF1;
            }
            if (sVarF1 == sVarD1) {
                return null;
            }
        }
        return null;
    }

    public final b4.s f1(boolean z11) {
        b4.s sVarD1;
        l1 l1Var = this.f5966p.G;
        if (l1Var.f5858d == this) {
            return l1Var.f5860f;
        }
        s1 s1Var = this.f5968r;
        if (!z11) {
            if (s1Var != null) {
                return s1Var.d1();
            }
            return null;
        }
        if (s1Var == null || (sVarD1 = s1Var.d1()) == null) {
            return null;
        }
        return sVarD1.getChild$ui();
    }

    @Override // z4.z
    public final long g(z4.z zVar, long j9) {
        return q(zVar, j9);
    }

    public final void g1(b4.s sVar, m1 m1Var, long j9, v vVar, int i11, boolean z11) {
        if (sVar == null) {
            j1(m1Var, j9, vVar, i11, z11);
            return;
        }
        int i12 = vVar.f6006c;
        q1.o0 o0Var = vVar.f6004a;
        vVar.d(i12 + 1, o0Var.f35722b);
        vVar.f6006c++;
        o0Var.g(sVar);
        vVar.f6005b.a(o.a(-1.0f, z11, false));
        g1(o.c(sVar, m1Var.b()), m1Var, j9, vVar, i11, z11);
        vVar.f6006c = i12;
    }

    @Override // z4.u
    public final z5.m getLayoutDirection() {
        return this.f5966p.A;
    }

    public final void h1(b4.s sVar, m1 m1Var, long j9, v vVar, int i11, boolean z11, float f11) {
        if (sVar == null) {
            j1(m1Var, j9, vVar, i11, z11);
            return;
        }
        int i12 = vVar.f6006c;
        q1.o0 o0Var = vVar.f6004a;
        vVar.d(i12 + 1, o0Var.f35722b);
        vVar.f6006c++;
        o0Var.g(sVar);
        vVar.f6005b.a(o.a(f11, z11, false));
        r1(o.c(sVar, m1Var.b()), m1Var, j9, vVar, i11, z11, f11, true);
        vVar.f6006c = i12;
    }

    public final void i1(m1 m1Var, long j9, v vVar, int i11, boolean z11) {
        boolean z12;
        boolean z13;
        b4.s sVarE1 = e1(m1Var.b());
        if (!D1(j9)) {
            if (i11 == 1) {
                float fV0 = V0(j9, c1());
                if ((Float.floatToRawIntBits(fV0) & Integer.MAX_VALUE) < 2139095040) {
                    if (vVar.f6006c != vVar.f6004a.f35722b - 1) {
                        if (o.d(vVar.b(), o.a(fV0, false, false)) <= 0) {
                            return;
                        }
                    }
                    h1(sVarE1, m1Var, j9, vVar, i11, false, fV0);
                    return;
                }
                return;
            }
            return;
        }
        if (sVarE1 == null) {
            j1(m1Var, j9, vVar, i11, z11);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < e0() && fIntBitsToFloat2 < d0()) {
            g1(sVarE1, m1Var, j9, vVar, i11, z11);
            return;
        }
        float fV02 = i11 == 1 ? V0(j9, c1()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(fV02) & Integer.MAX_VALUE) < 2139095040) {
            if (vVar.f6006c != vVar.f6004a.f35722b - 1) {
                z12 = z11;
                if (o.d(vVar.b(), o.a(fV02, z12, false)) > 0) {
                }
                r1(sVarE1, m1Var, j9, vVar, i11, z12, fV02, z13);
            }
            z12 = z11;
            z13 = true;
            r1(sVarE1, m1Var, j9, vVar, i11, z12, fV02, z13);
        }
        z12 = z11;
        z13 = false;
        r1(sVarE1, m1Var, j9, vVar, i11, z12, fV02, z13);
    }

    public void j1(m1 m1Var, long j9, v vVar, int i11, boolean z11) {
        s1 s1Var = this.f5967q;
        if (s1Var != null) {
            s1Var.i1(m1Var, s1Var.a1(j9), vVar, i11, z11);
        }
    }

    public final void k1() {
        c2 c2Var = this.M;
        if (c2Var != null) {
            ((c5.f2) c2Var).c();
            return;
        }
        s1 s1Var = this.f5968r;
        if (s1Var != null) {
            s1Var.k1();
        }
    }

    @Override // z4.m1
    public abstract void l0(long j9, float f11, l4.b bVar);

    public final boolean l1() {
        if (this.M != null && this.f5974x <= 0.0f) {
            return true;
        }
        s1 s1Var = this.f5968r;
        if (s1Var != null) {
            return s1Var.l1();
        }
        return false;
    }

    public final void m1() {
        this.f5966p.H.b();
    }

    @Override // z4.z
    public final boolean n() {
        return d1().isAttached();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r7v7, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final void n1() {
        b4.s parent$ui;
        boolean zH = t1.h(128);
        b4.s sVarF1 = f1(zH);
        if (sVarF1 == null || (sVarF1.getNode().getAggregateChildKindSet$ui() & 128) == 0) {
            return;
        }
        z3.g gVarC = z3.v.c();
        Function1 function1E = gVarC != null ? gVarC.e() : null;
        z3.g gVarD = z3.v.d(gVarC);
        try {
            if (!zH) {
                parent$ui = d1().getParent$ui();
                if (parent$ui == null) {
                }
            }
            parent$ui = d1();
            for (b4.s sVarF12 = f1(zH); sVarF12 != null; sVarF12 = sVarF12.getChild$ui()) {
                if ((sVarF12.getAggregateChildKindSet$ui() & 128) == 0) {
                    break;
                }
                if ((sVarF12.getKindSet$ui() & 128) != 0) {
                    ?? B = sVarF12;
                    ?? eVar = 0;
                    while (B != 0) {
                        if (B instanceof b0) {
                            ((b0) B).k(this.f47185c);
                        } else if ((B.getKindSet$ui() & 128) != 0 && (B instanceof n)) {
                            b4.s child$ui = ((n) B).f5892p;
                            int i11 = 0;
                            B = B;
                            eVar = eVar;
                            while (child$ui != null) {
                                if ((child$ui.getKindSet$ui() & 128) != 0) {
                                    i11++;
                                    eVar = eVar;
                                    if (i11 == 1) {
                                        B = child$ui;
                                    } else {
                                        if (eVar == 0) {
                                            eVar = new o3.e(new b4.s[16], 0);
                                        }
                                        if (B != 0) {
                                            eVar.b(B);
                                            B = 0;
                                        }
                                        eVar.b(child$ui);
                                    }
                                }
                                child$ui = child$ui.getChild$ui();
                                B = B;
                                eVar = eVar;
                            }
                            if (i11 == 1) {
                            }
                        }
                        B = m.b(eVar);
                    }
                }
                if (sVarF12 == parent$ui) {
                    break;
                }
            }
        } finally {
            z3.v.f(gVarC, gVarD, function1E);
        }
    }

    @Override // z4.z
    public final void o(float[] fArr) {
        Owner ownerA = p0.a(this.f5966p);
        s1 s1VarX1 = x1(z4.c0.i(this));
        A1(s1VarX1, fArr);
        if (ownerA instanceof w4.h) {
            ((c5.y) ((w4.h) ownerA)).s(fArr);
            return;
        }
        long jZ = s1VarX1.z(0L);
        if ((9223372034707292159L & jZ) != 9205357640488583168L) {
            i4.l0.h(fArr, Float.intBitsToFloat((int) (jZ >> 32)), Float.intBitsToFloat((int) (jZ & 4294967295L)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void o1() {
        boolean zH = t1.h(4194304);
        b4.s sVarD1 = d1();
        if (!zH && (sVarD1 = sVarD1.getParent$ui()) == null) {
            return;
        }
        for (b4.s sVarF1 = f1(zH); sVarF1 != null && (sVarF1.getAggregateChildKindSet$ui() & 4194304) != 0; sVarF1 = sVarF1.getChild$ui()) {
            if ((sVarF1.getKindSet$ui() & 4194304) != 0) {
                ?? B = sVarF1;
                ?? eVar = 0;
                while (B != 0) {
                    if (B instanceof b0) {
                        ((b0) B).u(this);
                    } else if ((B.getKindSet$ui() & 4194304) != 0 && (B instanceof n)) {
                        b4.s child$ui = ((n) B).f5892p;
                        int i11 = 0;
                        B = B;
                        eVar = eVar;
                        while (child$ui != null) {
                            if ((child$ui.getKindSet$ui() & 4194304) != 0) {
                                i11++;
                                eVar = eVar;
                                if (i11 == 1) {
                                    B = child$ui;
                                } else {
                                    if (eVar == 0) {
                                        eVar = new o3.e(new b4.s[16], 0);
                                    }
                                    if (B != 0) {
                                        eVar.b(B);
                                        B = 0;
                                    }
                                    eVar.b(child$ui);
                                }
                            }
                            child$ui = child$ui.getChild$ui();
                            B = B;
                            eVar = eVar;
                        }
                        if (i11 == 1) {
                        }
                    }
                    B = m.b(eVar);
                }
            }
            if (sVarF1 == sVarD1) {
                return;
            }
        }
    }

    @Override // b5.e2
    public final boolean p() {
        return (this.M == null || this.f5969s || !this.f5966p.I()) ? false : true;
    }

    public final void p1() {
        this.f5969s = true;
        this.K.invoke();
        v1();
        if (z5.j.b(this.A, 0L)) {
            return;
        }
        this.f5966p.O();
    }

    @Override // z4.z
    public final long q(z4.z zVar, long j9) {
        if (zVar instanceof z4.s0) {
            z4.s0 s0Var = (z4.s0) zVar;
            s0Var.f47231a.f6007p.m1();
            return s0Var.q(this, j9 ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        s1 s1VarX1 = x1(zVar);
        s1VarX1.m1();
        s1 s1VarZ0 = Z0(s1VarX1);
        while (s1VarX1 != s1VarZ0) {
            c2 c2Var = s1VarX1.M;
            if (c2Var != null) {
                c5.f2 f2Var = (c5.f2) c2Var;
                float[] fArrB = f2Var.b();
                if (!f2Var.f7235s) {
                    j9 = i4.l0.b(j9, fArrB);
                }
            }
            j9 = a.a.H(j9, s1VarX1.A);
            s1VarX1 = s1VarX1.f5968r;
            s1VarX1.getClass();
        }
        return T0(s1VarZ0, j9);
    }

    public final void q1() {
        boolean zH = t1.h(1048576);
        b4.s sVarF1 = f1(zH);
        if (sVarF1 == null || (sVarF1.getNode().getAggregateChildKindSet$ui() & 1048576) == 0) {
            return;
        }
        b4.s sVarD1 = d1();
        if (!zH && (sVarD1 = sVarD1.getParent$ui()) == null) {
            return;
        }
        for (b4.s sVarF12 = f1(zH); sVarF12 != null && (sVarF12.getAggregateChildKindSet$ui() & 1048576) != 0; sVarF12 = sVarF12.getChild$ui()) {
            if ((sVarF12.getKindSet$ui() & 1048576) != 0) {
                b4.s sVarB = sVarF12;
                o3.e eVar = null;
                while (sVarB != null) {
                    if ((sVarB.getKindSet$ui() & 1048576) != 0 && (sVarB instanceof n)) {
                        int i11 = 0;
                        for (b4.s child$ui = ((n) sVarB).f5892p; child$ui != null; child$ui = child$ui.getChild$ui()) {
                            if ((child$ui.getKindSet$ui() & 1048576) != 0) {
                                i11++;
                                if (i11 == 1) {
                                    sVarB = child$ui;
                                } else {
                                    if (eVar == null) {
                                        eVar = new o3.e(new b4.s[16], 0);
                                    }
                                    if (sVarB != null) {
                                        eVar.b(sVarB);
                                        sVarB = null;
                                    }
                                    eVar.b(child$ui);
                                }
                            }
                        }
                        if (i11 == 1) {
                        }
                    }
                    sVarB = m.b(eVar);
                }
            }
            if (sVarF12 == sVarD1) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018f A[PHI: r5
      0x018f: PHI (r5v6 ??) = (r5v1 ??), (r5v1 ??), (r5v8 ??) binds: [B:52:0x0157, B:54:0x015b, B:68:0x0189] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r4v14, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v6, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r1(b4.s r18, b5.m1 r19, long r20, b5.v r22, int r23, boolean r24, float r25, boolean r26) {
        /*
            Method dump skipped, instruction units count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.s1.r1(b4.s, b5.m1, long, b5.v, int, boolean, float, boolean):void");
    }

    public abstract void s1(i4.t tVar, l4.b bVar);

    public final void t1(long j9, float f11, Function1 function1, l4.b bVar) {
        m0 m0Var = this.f5966p;
        if (bVar != null) {
            if (function1 != null) {
                y4.a.a("both ways to create layers shouldn't be used together");
            }
            if (this.N != bVar) {
                this.N = null;
                B1(null, false);
                this.N = bVar;
            }
            if (this.M == null) {
                Owner ownerA = p0.a(m0Var);
                n1 n1Var = this.J;
                if (n1Var == null) {
                    n1 n1Var2 = new n1(0, this, new o1(this, 0));
                    this.J = n1Var2;
                    n1Var = n1Var2;
                }
                o1 o1Var = this.K;
                c2 c2VarJ = ((c5.y) ownerA).j(n1Var, o1Var, bVar);
                c5.f2 f2Var = (c5.f2) c2VarJ;
                f2Var.e(this.f47185c);
                f2Var.d(j9);
                this.M = c2VarJ;
                m0Var.K = true;
                o1Var.invoke();
            }
        } else {
            if (this.N != null) {
                this.N = null;
                B1(null, false);
            }
            B1(function1, false);
        }
        if (!z5.j.b(this.A, j9)) {
            ((c5.y) p0.a(m0Var)).M(-4.0f);
            this.A = j9;
            m0Var.H.f5942p.C0();
            c2 c2Var = this.M;
            if (c2Var != null) {
                ((c5.f2) c2Var).d(j9);
            } else {
                s1 s1Var = this.f5968r;
                if (s1Var != null) {
                    s1Var.k1();
                }
            }
            m0Var.O();
            u0.P0(this);
            Owner owner = m0Var.f5878o;
            if (owner != null) {
                ((c5.y) owner).y(m0Var);
            }
        }
        this.B = f11;
        if (this == m0Var.G.f5858d) {
            ((c5.y) p0.a(m0Var)).getRectManager().f(m0Var, false);
        }
        if (this.f5997k) {
            return;
        }
        C0(L0());
    }

    @Override // z4.z
    public final long u() {
        return this.f47185c;
    }

    public final void u1(h4.a aVar, boolean z11, boolean z12) {
        c2 c2Var = this.M;
        if (c2Var != null) {
            if (this.f5970t) {
                if (z12) {
                    long jC1 = c1();
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jC1 >> 32)) / 2.0f;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jC1 & 4294967295L)) / 2.0f;
                    long j9 = this.f47185c;
                    aVar.a(-fIntBitsToFloat, -fIntBitsToFloat2, ((int) (j9 >> 32)) + fIntBitsToFloat, ((int) (j9 & 4294967295L)) + fIntBitsToFloat2);
                } else if (z11) {
                    long j11 = this.f47185c;
                    aVar.a(0.0f, 0.0f, (int) (j11 >> 32), (int) (j11 & 4294967295L));
                }
                if (aVar.b()) {
                    return;
                }
            }
            c5.f2 f2Var = (c5.f2) c2Var;
            float[] fArrB = f2Var.b();
            if (!f2Var.f7235s) {
                if (fArrB == null) {
                    aVar.f21374b = 0.0f;
                    aVar.f21375c = 0.0f;
                    aVar.f21376d = 0.0f;
                    aVar.f21377e = 0.0f;
                } else {
                    i4.l0.c(fArrB, aVar);
                }
            }
        }
        long j12 = this.A;
        float f11 = (int) (j12 >> 32);
        aVar.f21374b += f11;
        aVar.f21376d += f11;
        float f12 = (int) (j12 & 4294967295L);
        aVar.f21375c += f12;
        aVar.f21377e += f12;
    }

    @Override // z4.z
    public final h4.c v(z4.z zVar, boolean z11) {
        if (!n()) {
            y4.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!zVar.n()) {
            y4.a.b("LayoutCoordinates " + zVar + " is not attached!");
        }
        s1 s1VarX1 = x1(zVar);
        s1VarX1.m1();
        s1 s1VarZ0 = Z0(s1VarX1);
        h4.a aVar = this.C;
        if (aVar == null) {
            aVar = new h4.a();
            this.C = aVar;
        }
        aVar.f21374b = 0.0f;
        aVar.f21375c = 0.0f;
        aVar.f21376d = (int) (zVar.u() >> 32);
        aVar.f21377e = (int) (zVar.u() & 4294967295L);
        while (s1VarX1 != s1VarZ0) {
            s1VarX1.u1(aVar, z11, false);
            if (aVar.b()) {
                return h4.c.f21379e;
            }
            s1VarX1 = s1VarX1.f5968r;
            s1VarX1.getClass();
        }
        S0(s1VarZ0, aVar, z11);
        return new h4.c(aVar.f21374b, aVar.f21375c, aVar.f21376d, aVar.f21377e);
    }

    public final void v1() {
        if (this.M != null) {
            if (this.N != null) {
                this.N = null;
            }
            B1(null, false);
            this.f5966p.X(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [o3.e] */
    public final void w1(z4.v0 v0Var) {
        s1 s1Var;
        z4.v0 v0Var2 = this.f5975y;
        if (v0Var != v0Var2) {
            this.f5975y = v0Var;
            m0 m0Var = this.f5966p;
            int i11 = 0;
            if (v0Var2 == null || v0Var.b() != v0Var2.b() || v0Var.getHeight() != v0Var2.getHeight()) {
                int iB = v0Var.b();
                int height = v0Var.getHeight();
                c2 c2Var = this.M;
                if (c2Var != null) {
                    ((c5.f2) c2Var).e((((long) iB) << 32) | (((long) height) & 4294967295L));
                } else if (m0Var.J() && (s1Var = this.f5968r) != null) {
                    s1Var.k1();
                }
                o0((((long) height) & 4294967295L) | (((long) iB) << 32));
                if (this.f5971u != null) {
                    C1(false);
                }
                boolean zH = t1.h(4);
                b4.s sVarD1 = d1();
                if (zH || (sVarD1 = sVarD1.getParent$ui()) != null) {
                    for (b4.s sVarF1 = f1(zH); sVarF1 != null && (sVarF1.getAggregateChildKindSet$ui() & 4) != 0; sVarF1 = sVarF1.getChild$ui()) {
                        if ((sVarF1.getKindSet$ui() & 4) != 0) {
                            ?? B = sVarF1;
                            ?? eVar = 0;
                            while (B != 0) {
                                if (B instanceof r) {
                                    ((r) B).K();
                                } else if ((B.getKindSet$ui() & 4) != 0 && (B instanceof n)) {
                                    b4.s child$ui = ((n) B).f5892p;
                                    int i12 = 0;
                                    B = B;
                                    eVar = eVar;
                                    while (child$ui != null) {
                                        if ((child$ui.getKindSet$ui() & 4) != 0) {
                                            i12++;
                                            eVar = eVar;
                                            if (i12 == 1) {
                                                B = child$ui;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new o3.e(new b4.s[16], 0);
                                                }
                                                if (B != 0) {
                                                    eVar.b(B);
                                                    B = 0;
                                                }
                                                eVar.b(child$ui);
                                            }
                                        }
                                        child$ui = child$ui.getChild$ui();
                                        B = B;
                                        eVar = eVar;
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                B = m.b(eVar);
                            }
                        }
                        if (sVarF1 == sVarD1) {
                            break;
                        }
                    }
                }
                Owner owner = m0Var.f5878o;
                if (owner != null) {
                    ((c5.y) owner).y(m0Var);
                }
            }
            q1.n0 n0Var = this.f5976z;
            if ((n0Var == null || n0Var.f35872e == 0) && v0Var.c().isEmpty()) {
                return;
            }
            q1.n0 n0Var2 = this.f5976z;
            Map mapC = v0Var.c();
            if (n0Var2 != null && n0Var2.f35872e == mapC.size()) {
                Object[] objArr = n0Var2.f35869b;
                int[] iArr = n0Var2.f35870c;
                long[] jArr = n0Var2.f35868a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i13 = 0;
                loop0: while (true) {
                    long j9 = jArr[i13];
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8 - ((~(i13 - length)) >>> 31);
                        for (int i15 = i11; i15 < i14; i15++) {
                            if ((255 & j9) < 128) {
                                int i16 = (i13 << 3) + i15;
                                Object obj = objArr[i16];
                                int i17 = iArr[i16];
                                Integer num = (Integer) mapC.get((z4.a) obj);
                                if (num == null || num.intValue() != i17) {
                                    break loop0;
                                }
                            }
                            j9 >>= 8;
                        }
                        if (i14 != 8) {
                            return;
                        }
                    }
                    if (i13 == length) {
                        return;
                    }
                    i13++;
                    i11 = 0;
                }
            }
            m0Var.H.f5942p.f5817y.f();
            q1.n0 n0Var3 = this.f5976z;
            if (n0Var3 == null) {
                q1.n0 n0Var4 = q1.a1.f35713a;
                n0Var3 = new q1.n0();
                this.f5976z = n0Var3;
            }
            n0Var3.b();
            for (Map.Entry entry : v0Var.c().entrySet()) {
                n0Var3.g(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    public final h4.c y1() {
        if (n()) {
            z4.z zVarI = z4.c0.i(this);
            h4.a aVar = this.C;
            if (aVar == null) {
                aVar = new h4.a();
                this.C = aVar;
            }
            long jU0 = U0(c1());
            int i11 = (int) (jU0 >> 32);
            aVar.f21374b = -Float.intBitsToFloat(i11);
            int i12 = (int) (jU0 & 4294967295L);
            aVar.f21375c = -Float.intBitsToFloat(i12);
            aVar.f21376d = Float.intBitsToFloat(i11) + e0();
            aVar.f21377e = Float.intBitsToFloat(i12) + d0();
            s1 s1Var = this;
            while (s1Var != zVarI) {
                s1Var.u1(aVar, false, true);
                if (!aVar.b()) {
                    s1Var = s1Var.f5968r;
                    s1Var.getClass();
                }
            }
            return new h4.c(aVar.f21374b, aVar.f21375c, aVar.f21376d, aVar.f21377e);
        }
        return h4.c.f21379e;
    }

    @Override // z4.z
    public final long z(long j9) {
        if (!n()) {
            y4.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((c5.y) p0.a(this.f5966p)).t(S(j9));
    }

    public final void z1(s1 s1Var, float[] fArr) {
        float[] fArrA;
        if (Intrinsics.areEqual(s1Var, this)) {
            return;
        }
        s1 s1Var2 = this.f5968r;
        s1Var2.getClass();
        s1Var2.z1(s1Var, fArr);
        if (!z5.j.b(this.A, 0L)) {
            float[] fArr2 = V;
            i4.l0.d(fArr2);
            long j9 = this.A;
            i4.l0.h(fArr2, -((int) (j9 >> 32)), -((int) (j9 & 4294967295L)));
            i4.l0.g(fArr, fArr2);
        }
        c2 c2Var = this.M;
        if (c2Var == null || (fArrA = ((c5.f2) c2Var).a()) == null) {
            return;
        }
        i4.l0.g(fArr, fArrA);
    }

    @Override // b5.u0
    public final z4.z F0() {
        return this;
    }
}
