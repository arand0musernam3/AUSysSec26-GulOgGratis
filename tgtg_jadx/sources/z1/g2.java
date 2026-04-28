package z1;

import android.os.Build;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.measurement.cg;
import java.util.List;
import kotlin.collections.CollectionsKt;
import y00.i4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l3 f46520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i4 f46521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gf.h f46522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z5.c f46523d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f46525f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public v80.b2 f46526g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x80.i f46524e = cg.a(Integer.MAX_VALUE, null, null, 6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y9.h f46527h = new y9.h(1);

    public g2(l3 l3Var, i4 i4Var, gf.h hVar, z5.c cVar) {
        this.f46520a = l3Var;
        this.f46521b = i4Var;
        this.f46522c = hVar;
        this.f46523d = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0119, code lost:
    
        if (r0.invoke(r1, r9) == r10) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r0v13, types: [T, z1.z1] */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, t1.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(z1.g2 r16, z1.l3 r17, z1.z1 r18, float r19, float r20, z70.c r21) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.g2.a(z1.g2, z1.l3, z1.z1, float, float, z70.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, t1.j] */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, z1.z1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(z1.g2 r14, kotlin.jvm.internal.Ref.ObjectRef r15, kotlin.jvm.internal.Ref.FloatRef r16, z1.l3 r17, kotlin.jvm.internal.Ref.ObjectRef r18, long r19, z70.c r21) {
        /*
            r0 = r19
            r2 = r21
            boolean r3 = r2 instanceof z1.d2
            if (r3 == 0) goto L17
            r3 = r2
            z1.d2 r3 = (z1.d2) r3
            int r4 = r3.f46469p
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L17
            int r4 = r4 - r5
            r3.f46469p = r4
            goto L1c
        L17:
            z1.d2 r3 = new z1.d2
            r3.<init>(r2)
        L1c:
            java.lang.Object r2 = r3.f46468o
            y70.a r4 = y70.a.COROUTINE_SUSPENDED
            int r5 = r3.f46469p
            r6 = 1
            if (r5 == 0) goto L3f
            if (r5 != r6) goto L38
            kotlin.jvm.internal.Ref$ObjectRef r14 = r3.f46467n
            z1.l3 r0 = r3.f46466m
            kotlin.jvm.internal.Ref$FloatRef r1 = r3.l
            kotlin.jvm.internal.Ref$ObjectRef r4 = r3.f46465k
            z1.g2 r3 = r3.f46464j
            ba0.g.M(r2)
            r9 = r14
            r8 = r0
            r14 = r3
            goto L6c
        L38:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r14)
            r14 = 0
            return r14
        L3f:
            ba0.g.M(r2)
            r7 = 0
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 >= 0) goto L4b
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            return r14
        L4b:
            z1.e2 r2 = new z1.e2
            r5 = 0
            r2.<init>(r14, r5)
            r3.f46464j = r14
            r3.f46465k = r15
            r7 = r16
            r3.l = r7
            r8 = r17
            r3.f46466m = r8
            r9 = r18
            r3.f46467n = r9
            r3.f46469p = r6
            java.lang.Object r2 = v80.j2.c(r0, r2, r3)
            if (r2 != r4) goto L6a
            return r4
        L6a:
            r4 = r15
            r1 = r7
        L6c:
            z1.z1 r2 = (z1.z1) r2
            if (r2 == 0) goto La7
            T r0 = r4.element
            z1.z1 r0 = (z1.z1) r0
            boolean r0 = r0.f46790c
            long r10 = r2.f46788a
            long r12 = r2.f46789b
            z1.z1 r3 = new z1.z1
            r20 = r0
            r15 = r3
            r16 = r10
            r18 = r12
            r15.<init>(r16, r18, r20)
            r0 = r15
            r4.element = r0
            long r3 = r8.e(r10)
            float r0 = r8.i(r3)
            r1.element = r0
            r0 = 30
            r3 = 0
            t1.j r0 = t1.c.b(r3, r3, r0)
            r9.element = r0
            r14.f(r2)
            float r14 = r1.element
            boolean r14 = z1.y1.a(r14)
            r14 = r14 ^ r6
            goto La8
        La7:
            r14 = 0
        La8:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.g2.b(z1.g2, kotlin.jvm.internal.Ref$ObjectRef, kotlin.jvm.internal.Ref$FloatRef, z1.l3, kotlin.jvm.internal.Ref$ObjectRef, long, z70.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static z1 e(x80.i iVar) {
        z1 z1Var = null;
        o80.j jVarA = o80.l.a(new a3.g2((Object) new y.a(iVar, 14), (x70.c) (0 == true ? 1 : 0), 3));
        while (jVarA.hasNext()) {
            z1 z1VarA = (z1) jVarA.next();
            if (z1Var != null) {
                z1VarA = z1Var.a(z1VarA);
            }
            z1Var = z1VarA;
        }
        return z1Var;
    }

    public final float c(k3 k3Var, float f11) {
        l3 l3Var = this.f46520a;
        long jH = l3Var.h(l3Var.d(f11));
        l3 l3Var2 = k3Var.f46577a;
        return l3Var.g(l3Var.e(l3Var2.c(l3Var2.f46594k, jH, 1)));
    }

    public final boolean d(w4.n nVar) {
        long j9;
        z5.c cVar = this.f46523d;
        ViewConfiguration viewConfiguration = (ViewConfiguration) this.f46521b.f44863b;
        int i11 = Build.VERSION.SDK_INT;
        float f11 = -(i11 > 26 ? viewConfiguration.getScaledVerticalScrollFactor() : cVar.c0(64));
        float f12 = -(i11 > 26 ? viewConfiguration.getScaledHorizontalScrollFactor() : cVar.c0(64));
        List list = nVar.f43165a;
        h4.b bVar = new h4.b(0L);
        int size = list.size();
        boolean zD = false;
        int i12 = 0;
        while (true) {
            j9 = bVar.f21378a;
            if (i12 >= size) {
                break;
            }
            bVar = new h4.b(h4.b.f(j9, ((w4.v) list.get(i12)).f43187j));
            i12++;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j9 >> 32)) * f12)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j9 & 4294967295L)) * f11)) & 4294967295L);
        l3 l3Var = this.f46520a;
        float fI = l3Var.i(l3Var.e(jFloatToRawIntBits));
        if (fI != 0.0f) {
            h3 h3Var = l3Var.f46584a;
            zD = fI > 0.0f ? h3Var.d() : h3Var.c();
        }
        if (zD) {
            return !(this.f46524e.h(new z1(jFloatToRawIntBits, ((w4.v) CollectionsKt.O(nVar.f43165a)).f43179b, false)) instanceof x80.o);
        }
        return this.f46525f;
    }

    public final void f(z1 z1Var) {
        long j9 = z1Var.f46789b;
        long j11 = z1Var.f46788a;
        y9.h hVar = this.f46527h;
        ((x4.e) hVar.f45666a).a(Float.intBitsToFloat((int) (j11 >> 32)), j9);
        ((x4.e) hVar.f45667b).a(Float.intBitsToFloat((int) (j11 & 4294967295L)), j9);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(z1.l3 r6, z1.c2 r7, z70.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof z1.f2
            if (r0 == 0) goto L13
            r0 = r8
            z1.f2 r0 = (z1.f2) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            z1.f2 r0 = new z1.f2
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f46507j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r8)
            goto L43
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L2e:
            ba0.g.M(r8)
            r5.f46525f = r3
            z1.a2 r8 = new z1.a2
            r2 = 0
            r4 = 2
            r8.<init>(r6, r7, r2, r4)
            r0.l = r3
            java.lang.Object r6 = v80.f0.H(r8, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            r6 = 0
            r5.f46525f = r6
            kotlin.Unit r6 = kotlin.Unit.f26487a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.g2.g(z1.l3, z1.c2, z70.c):java.lang.Object");
    }
}
