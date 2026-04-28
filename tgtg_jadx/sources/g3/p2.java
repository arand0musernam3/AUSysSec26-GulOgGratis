package g3;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f19293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f19294b;

    static {
        char c3;
        long j9;
        float f11;
        float f12 = l3.c0.f26928b;
        float f13 = l3.c0.f26927a;
        float f14 = l3.c0.f26927a;
        e1 e1Var = r2.f19379a;
        r8.j jVarB = e1Var.b();
        r8.j jVarA = r2.l;
        if (jVarA == null) {
            jVarA = v0.n.H(9, r2.f19381c).b(new se.b(r2.f19383e, 25)).a();
            r2.l = jVarA;
        }
        r8.j jVarA2 = r2.f19387i;
        if (jVarA2 == null) {
            j9 = 4294967295L;
            c3 = ' ';
            jVarA2 = e1.a(e1Var, kotlin.collections.d0.h(new q2((((long) Float.floatToRawIntBits(-0.009f)) & 4294967295L) | (Float.floatToRawIntBits(0.5f) << 32), new r8.a(0.172f, 2)), new q2((((long) Float.floatToRawIntBits(1.03f)) << 32) | (((long) Float.floatToRawIntBits(0.365f)) & 4294967295L), new r8.a(0.164f, 2)), new q2((((long) Float.floatToRawIntBits(0.97f)) & 4294967295L) | (Float.floatToRawIntBits(0.828f) << 32), new r8.a(0.169f, 2))), 1, 4).a();
            r2.f19387i = jVarA2;
        } else {
            c3 = ' ';
            j9 = 4294967295L;
        }
        r8.j jVarA3 = r2.f19386h;
        if (jVarA3 == null) {
            f11 = 0.5f;
            jVarA3 = e1.a(e1Var, kotlin.collections.d0.h(new q2((((long) Float.floatToRawIntBits(0.961f)) << c3) | (((long) Float.floatToRawIntBits(0.039f)) & j9), new r8.a(0.426f, 2)), new q2((((long) Float.floatToRawIntBits(1.001f)) << c3) | (((long) Float.floatToRawIntBits(0.428f)) & j9), r8.a.f37753b), new q2((((long) Float.floatToRawIntBits(0.609f)) & j9) | (Float.floatToRawIntBits(1.0f) << c3), new r8.a(1.0f, 2))), 2, 4).a();
            r2.f19386h = jVarA3;
        } else {
            f11 = 0.5f;
        }
        r8.j jVar = jVarA3;
        r8.j jVarA4 = r2.f19388j;
        if (jVarA4 == null) {
            jVarA4 = v0.n.H(8, r2.f19380b).a();
            r2.f19388j = jVarA4;
        }
        r8.j jVarA5 = r2.f19389k;
        if (jVarA5 == null) {
            jVarA5 = e1.a(e1Var, kotlin.collections.d0.h(new q2((((long) Float.floatToRawIntBits(1.237f)) << c3) | (((long) Float.floatToRawIntBits(1.236f)) & j9), new r8.a(0.258f, 2)), new q2((((long) Float.floatToRawIntBits(f11)) << c3) | (((long) Float.floatToRawIntBits(0.918f)) & j9), new r8.a(0.233f, 2))), 4, 12).a();
            r2.f19389k = jVarA5;
        }
        r8.j jVar2 = jVarA5;
        r8.j jVarA6 = r2.f19385g;
        if (jVarA6 == null) {
            float[] fArrA = i4.l0.a();
            i4.l0.f(fArrA, 1.0f, 0.64f);
            jVarA6 = v0.n.t(15).b(new se.b(fArrA, 25)).b(new se.b(r2.f19382d, 25)).a();
            r2.f19385g = jVarA6;
        }
        f19293a = kotlin.collections.d0.h(jVarB, jVarA, jVarA2, jVar, jVarA4, jVar2, jVarA6);
        r8.j jVarA7 = r2.f19384f;
        if (jVarA7 == null) {
            jVarA7 = v0.n.t(14).a();
            r2.f19384f = jVarA7;
        }
        float[] fArrA2 = i4.l0.a();
        i4.l0.e(18.0f, fArrA2);
        f19294b = kotlin.collections.d0.h(jVarA7.b(new se.b(fArrA2, 25)), e1Var.b());
        Math.min(f12, f13);
    }
}
