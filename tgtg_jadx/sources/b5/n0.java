package b5;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z4.m1 f5893a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5897e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5898f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5899g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f5900h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f5902j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5894b = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f5901i = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public n0(b bVar, int i11) {
        this.f5902j = i11;
        this.f5893a = (z4.m1) bVar;
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [b5.b, z4.m1] */
    public static final void a(n0 n0Var, z4.a aVar, int i11, s1 s1Var) {
        HashMap map = n0Var.f5901i;
        float f11 = i11;
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f11)) << 32;
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f11)) & 4294967295L;
        while (true) {
            long jH = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                switch (n0Var.f5902j) {
                    case 0:
                        c2 c2Var = s1Var.M;
                        if (c2Var != null) {
                            c5.f2 f2Var = (c5.f2) c2Var;
                            float[] fArrB = f2Var.b();
                            if (!f2Var.f7235s) {
                                jH = i4.l0.b(jH, fArrB);
                            }
                        }
                        jH = a.a.H(jH, s1Var.A);
                        break;
                    default:
                        v0 v0VarB1 = s1Var.b1();
                        v0VarB1.getClass();
                        long j9 = v0VarB1.f6008q;
                        jH = h4.b.f((((long) Float.floatToRawIntBits((int) (j9 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j9 >> 32))) << 32), jH);
                        break;
                }
                s1Var = s1Var.f5968r;
                s1Var.getClass();
                if (Intrinsics.areEqual(s1Var, n0Var.f5893a.j())) {
                    int iRound = Math.round(aVar instanceof z4.o ? Float.intBitsToFloat((int) (jH & 4294967295L)) : Float.intBitsToFloat((int) (jH >> 32)));
                    if (map.containsKey(aVar)) {
                        int iIntValue = ((Number) kotlin.collections.x0.c(aVar, map)).intValue();
                        z4.o oVar = z4.d.f47100a;
                        iRound = ((Number) aVar.f47088a.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
                    }
                    map.put(aVar, Integer.valueOf(iRound));
                    return;
                }
            } while (!n0Var.b(s1Var).containsKey(aVar));
            float fC = n0Var.c(s1Var, aVar);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fC);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fC);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
    }

    public final Map b(s1 s1Var) {
        switch (this.f5902j) {
            case 0:
                return s1Var.L0().c();
            default:
                v0 v0VarB1 = s1Var.b1();
                v0VarB1.getClass();
                return v0VarB1.L0().c();
        }
    }

    public final int c(s1 s1Var, z4.a aVar) {
        switch (this.f5902j) {
            case 0:
                return s1Var.b0(aVar);
            default:
                v0 v0VarB1 = s1Var.b1();
                v0VarB1.getClass();
                return v0VarB1.b0(aVar);
        }
    }

    public final boolean d() {
        return this.f5895c || this.f5897e || this.f5898f || this.f5899g;
    }

    public final boolean e() {
        h();
        return this.f5900h != null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [b5.b, z4.m1] */
    public final void f() {
        this.f5894b = true;
        ?? r02 = this.f5893a;
        b bVarK = r02.k();
        if (bVarK == null) {
            return;
        }
        if (this.f5895c) {
            bVarK.U();
        } else if (this.f5897e || this.f5896d) {
            bVarK.requestLayout();
        }
        if (this.f5898f) {
            r02.U();
        }
        if (this.f5899g) {
            r02.requestLayout();
        }
        bVarK.c().f();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [b5.b, z4.m1] */
    public final void g() {
        HashMap map = this.f5901i;
        map.clear();
        a aVar = new a(this);
        ?? r22 = this.f5893a;
        r22.Q(aVar);
        map.putAll(b(r22.j()));
        this.f5894b = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Type inference failed for: r1v0, types: [b5.b, z4.m1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [b5.b] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            r2 = this;
            boolean r0 = r2.d()
            z4.m1 r1 = r2.f5893a
            if (r0 == 0) goto L9
            goto L51
        L9:
            b5.b r0 = r1.k()
            if (r0 != 0) goto L10
            goto L53
        L10:
            b5.n0 r0 = r0.c()
            b5.b r1 = r0.f5900h
            if (r1 == 0) goto L23
            b5.n0 r0 = r1.c()
            boolean r0 = r0.d()
            if (r0 == 0) goto L23
            goto L51
        L23:
            b5.b r0 = r2.f5900h
            if (r0 == 0) goto L53
            b5.n0 r1 = r0.c()
            boolean r1 = r1.d()
            if (r1 == 0) goto L32
            goto L53
        L32:
            b5.b r1 = r0.k()
            if (r1 == 0) goto L41
            b5.n0 r1 = r1.c()
            if (r1 == 0) goto L41
            r1.h()
        L41:
            b5.b r0 = r0.k()
            if (r0 == 0) goto L50
            b5.n0 r0 = r0.c()
            if (r0 == 0) goto L50
            b5.b r1 = r0.f5900h
            goto L51
        L50:
            r1 = 0
        L51:
            r2.f5900h = r1
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.n0.h():void");
    }
}
