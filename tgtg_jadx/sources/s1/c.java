package s1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.bouncycastle.iana.AEADAlgorithm;
import t1.v1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends Lambda implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f38530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f38531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f38532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f38533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f38534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f38535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f38536h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f38537i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f38538j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c f38539k;
    public static final c l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final c f38540m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c f38541n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c f38542o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final c f38543p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final c f38544q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final c f38545r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final c f38546s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final c f38547t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final c f38548u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final c f38549v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final c f38550w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final c f38551x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38552a;

    static {
        int i11 = 1;
        f38530b = new c(i11, 0);
        f38531c = new c(i11, 1);
        f38532d = new c(i11, 2);
        f38533e = new c(i11, 3);
        f38534f = new c(i11, 4);
        f38535g = new c(i11, 5);
        f38536h = new c(i11, 6);
        f38537i = new c(i11, 7);
        f38538j = new c(i11, 8);
        f38539k = new c(i11, 9);
        l = new c(i11, 10);
        f38540m = new c(i11, 11);
        f38541n = new c(i11, 12);
        f38542o = new c(i11, 13);
        f38543p = new c(i11, 14);
        f38544q = new c(i11, 15);
        f38545r = new c(i11, 16);
        f38546s = new c(i11, 17);
        f38547t = new c(i11, 18);
        f38548u = new c(i11, 19);
        f38549v = new c(i11, 20);
        f38550w = new c(i11, 21);
        f38551x = new c(i11, 22);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i11, int i12) {
        super(i11);
        this.f38552a = i12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f38552a) {
            case 0:
                x0 x0VarA = r0.d(t1.c.k(220, 90, null, 4), 2).a(r0.f(t1.c.k(220, 90, null, 4), 0.92f, 4));
                y0 y0VarE = r0.e(t1.c.k(90, 0, null, 6), 2);
                int i11 = i.f38614b;
                return new e0(x0VarA, y0VarE);
            case 1:
                return obj;
            case 2:
                return Integer.valueOf(((Number) obj).intValue());
            case 3:
                return Integer.valueOf(((Number) obj).intValue());
            case 4:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 5:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return bool2;
            case 6:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return bool3;
            case 7:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                return bool4;
            case 8:
                long jA = i4.v.a(((i4.v) obj).f23317a, j4.e.f24558x);
                return new t1.n(i4.v.d(jA), i4.v.h(jA), i4.v.g(jA), i4.v.e(jA));
            case 9:
                return new v1(f38538j, new q1.h1((j4.c) obj, 3));
            case 10:
                return obj;
            case 11:
                long j9 = ((i4.z0) obj).f23337a;
                return new t1.l(Float.intBitsToFloat((int) (j9 >> 32)), Float.intBitsToFloat((int) (j9 & 4294967295L)));
            case 12:
                t1.l lVar = (t1.l) obj;
                return new i4.z0(i4.g0.h(lVar.f39482a, lVar.f39483b));
            case 13:
                return t1.c.j(0.0f, 0.0f, null, 7);
            case 14:
                ((Number) obj).intValue();
                return 0;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                long j11 = ((z5.l) obj).f47286a;
                long j12 = 0;
                return new z5.l((j12 & 4294967295L) | (j12 << 32));
            case 16:
                ((Number) obj).intValue();
                return 0;
            case 17:
                ((Number) obj).intValue();
                return 0;
            case 18:
                long j13 = ((z5.l) obj).f47286a;
                long j14 = 0;
                return new z5.l((j14 & 4294967295L) | (j14 << 32));
            case 19:
                ((Number) obj).intValue();
                return 0;
            case 20:
                return Integer.valueOf((-((Number) obj).intValue()) / 2);
            case 21:
                return Integer.valueOf((-((Number) obj).intValue()) / 2);
            default:
                return r0.f38671c;
        }
    }
}
