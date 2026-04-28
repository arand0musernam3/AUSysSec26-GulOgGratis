package m5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f29593a = b0.a0.C(14);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f29594b = b0.a0.C(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f29595c = i4.v.f23314g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x5.o f29596d;

    static {
        long j9 = i4.v.f23309b;
        f29596d = j9 != 16 ? new x5.c(j9) : x5.n.f43858a;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final m5.l0 a(m5.l0 r24, long r25, i4.r r27, float r28, long r29, q5.r r31, q5.n r32, q5.o r33, q5.i r34, java.lang.String r35, long r36, x5.a r38, x5.p r39, t5.c r40, long r41, x5.l r43, i4.u0 r44, m5.a0 r45, k4.e r46) {
        /*
            Method dump skipped, instruction units count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.m0.a(m5.l0, long, i4.r, float, long, q5.r, q5.n, q5.o, q5.i, java.lang.String, long, x5.a, x5.p, t5.c, long, x5.l, i4.u0, m5.a0, k4.e):m5.l0");
    }

    public static final Object b(float f11, Object obj, Object obj2) {
        return ((double) f11) < 0.5d ? obj : obj2;
    }

    public static final long c(long j9, long j11, float f11) {
        z5.p[] pVarArr = z5.o.f47288b;
        long j12 = j9 & 1095216660480L;
        if (j12 != 0) {
            long j13 = 1095216660480L & j11;
            if (j13 != 0) {
                if (j12 == 0 || j13 == 0) {
                    z5.i.a("Cannot perform operation for Unspecified type.");
                }
                if (!z5.p.a(z5.o.b(j9), z5.o.b(j11))) {
                    z5.i.a("Cannot perform operation for " + ((Object) z5.p.b(z5.o.b(j9))) + " and " + ((Object) z5.p.b(z5.o.b(j11))));
                }
                return b0.a0.F(ba0.g.C(z5.o.c(j9), z5.o.c(j11), f11), j12);
            }
        }
        return ((z5.o) b(f11, new z5.o(j9), new z5.o(j11))).f47290a;
    }
}
