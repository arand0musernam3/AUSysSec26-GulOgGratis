package j4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f24536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f24537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f24538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f24539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r f24540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r f24541f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final r f24542g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final r f24543h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final r f24544i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final r f24545j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final r f24546k;
    public static final r l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final r f24547m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final r f24548n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final r f24549o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final r f24550p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final r f24551q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final r f24552r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final l f24553s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final l f24554t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final r f24555u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final r f24556v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final r f24557w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final m f24558x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final c[] f24559y;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f24536a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f24537b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        t tVar = new t(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        t tVar2 = new t(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        t tVar3 = new t(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        f24538c = tVar3;
        t tVar4 = new t(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        f24539d = tVar4;
        u uVar = k.f24571d;
        r rVar = new r("sRGB IEC61966-2.1", fArr, uVar, tVar, 0);
        f24540e = rVar;
        r rVar2 = new r("sRGB IEC61966-2.1 (Linear)", fArr, uVar, 1.0d, 0.0f, 1.0f, 1);
        f24541f = rVar2;
        r rVar3 = new r("scRGB-nl IEC 61966-2-2:2003", fArr, uVar, null, new i4.a(), new d(0), -0.799f, 2.399f, tVar, 2);
        f24542g = rVar3;
        r rVar4 = new r("scRGB IEC 61966-2-2:2003", fArr, uVar, 1.0d, -0.5f, 7.499f, 3);
        f24543h = rVar4;
        r rVar5 = new r("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, uVar, new t(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        f24544i = rVar5;
        r rVar6 = new r("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, uVar, new t(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        f24545j = rVar6;
        r rVar7 = new r("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new u(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f24546k = rVar7;
        r rVar8 = new r("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, uVar, tVar, 7);
        l = rVar8;
        double d3 = 0.2222222222222222d;
        double d11 = 0.081d;
        double d12 = 2.2222222222222223d;
        double d13 = 0.9099181073703367d;
        double d14 = 0.09008189262966333d;
        r rVar9 = new r("NTSC (1953)", fArr2, k.f24568a, new t(d12, d13, d14, d3, d11), 8);
        f24547m = rVar9;
        r rVar10 = new r("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, uVar, new t(d12, d13, d14, d3, d11), 9);
        f24548n = rVar10;
        r rVar11 = new r("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, uVar, 2.2d, 0.0f, 1.0f, 10);
        f24549o = rVar11;
        r rVar12 = new r("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, k.f24569b, new t(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        f24550p = rVar12;
        u uVar2 = k.f24570c;
        r rVar13 = new r("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, uVar2, 1.0d, -65504.0f, 65504.0f, 12);
        f24551q = rVar13;
        r rVar14 = new r("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, uVar2, 1.0d, -65504.0f, 65504.0f, 13);
        f24552r = rVar14;
        l lVar = new l("Generic XYZ", 14, 1, b.f24528b);
        f24553s = lVar;
        long j9 = b.f24529c;
        l lVar2 = new l("Generic L*a*b*", 15, 0, j9);
        f24554t = lVar2;
        r rVar15 = new r("None", fArr, uVar, tVar2, 16);
        f24555u = rVar15;
        r rVar16 = new r("Hybrid Log Gamma encoding", fArr3, uVar, null, new d(1), new d(2), 0.0f, 1.0f, tVar3, 17);
        f24556v = rVar16;
        r rVar17 = new r("Perceptual Quantizer encoding", fArr3, uVar, null, new d(3), new d(4), 0.0f, 1.0f, tVar4, 18);
        f24557w = rVar17;
        m mVar = new m(19, j9, "Oklab");
        f24558x = mVar;
        f24559y = new c[]{rVar, rVar2, rVar3, rVar4, rVar5, rVar6, rVar7, rVar8, rVar9, rVar10, rVar11, rVar12, rVar13, rVar14, lVar, lVar2, rVar15, rVar16, rVar17, mVar};
    }

    public static double a(t tVar, double d3) {
        double d11 = d3 < 0.0d ? -1.0d : 1.0d;
        double d12 = d3 * d11;
        double d13 = tVar.f24601b;
        double d14 = tVar.f24602c;
        double d15 = tVar.f24603d;
        double d16 = tVar.f24604e;
        double d17 = tVar.f24605f;
        double d18 = d13 * d12;
        return (tVar.f24606g + 1.0d) * d11 * (d18 <= 1.0d ? Math.pow(d18, d14) : Math.exp((d12 - d17) * d15) + d16);
    }

    public static double b(t tVar, double d3) {
        double d11 = d3 < 0.0d ? -1.0d : 1.0d;
        double d12 = 1.0d / tVar.f24601b;
        double d13 = 1.0d / tVar.f24602c;
        double d14 = 1.0d / tVar.f24603d;
        double d15 = tVar.f24604e;
        double d16 = tVar.f24605f;
        double d17 = (d3 * d11) / (tVar.f24606g + 1.0d);
        return d11 * (d17 <= 1.0d ? Math.pow(d17, d13) * d12 : (Math.log(d17 - d15) * d14) + d16);
    }

    public static double c(t tVar, double d3) {
        double d11 = d3 < 0.0d ? -1.0d : 1.0d;
        double d12 = d3 * d11;
        double d13 = tVar.f24601b;
        double d14 = tVar.f24603d;
        double dPow = (Math.pow(d12, d14) * tVar.f24602c) + d13;
        return Math.pow((dPow >= 0.0d ? dPow : 0.0d) / ((Math.pow(d12, d14) * tVar.f24605f) + tVar.f24604e), tVar.f24606g) * d11;
    }

    public static double d(t tVar, double d3) {
        double d11 = d3 < 0.0d ? -1.0d : 1.0d;
        double d12 = d3 * d11;
        double d13 = -tVar.f24601b;
        double d14 = tVar.f24604e;
        double d15 = 1.0d / tVar.f24606g;
        return Math.pow(Math.max((Math.pow(d12, d15) * d14) + d13, 0.0d) / ((Math.pow(d12, d15) * (-tVar.f24605f)) + tVar.f24602c), 1.0d / tVar.f24603d) * d11;
    }
}
