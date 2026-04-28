package k6;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f26035h = new String("FIXED_DIMENSION");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f26036i = new String("WRAP_DIMENSION");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f26037j = new String("SPREAD_DIMENSION");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f26038k = new String("PARENT_DIMENSION");
    public static final String l = new String("PERCENT_DIMENSION");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f26039m = new String("RATIO_DIMENSION");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f26045f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26040a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26041b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f26042c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26043d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f26044e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f26046g = false;

    public f(String str) {
        this.f26045f = str;
    }

    public static f b(int i11) {
        f fVar = new f(f26035h);
        fVar.f26045f = null;
        fVar.f26043d = i11;
        return fVar;
    }

    public static f c(String str) {
        f fVar = new f();
        fVar.f26040a = 0;
        fVar.f26041b = Integer.MAX_VALUE;
        fVar.f26042c = 1.0f;
        fVar.f26043d = 0;
        fVar.f26044e = null;
        fVar.f26045f = str;
        fVar.f26046g = true;
        return fVar;
    }

    public final void a(n6.g gVar, int i11) {
        String str = this.f26044e;
        if (str != null) {
            gVar.L(str);
        }
        boolean z11 = this.f26046g;
        String str2 = f26038k;
        int i12 = 2;
        String str3 = l;
        String str4 = f26036i;
        if (i11 == 0) {
            if (z11) {
                gVar.P(n6.f.MATCH_CONSTRAINT);
                String str5 = this.f26045f;
                if (str5 == str4) {
                    i12 = 1;
                } else if (str5 != str3) {
                    i12 = 0;
                }
                gVar.Q(this.f26042c, i12, this.f26040a, this.f26041b);
                return;
            }
            int i13 = this.f26040a;
            if (i13 > 0) {
                if (i13 < 0) {
                    gVar.f30583e0 = 0;
                } else {
                    gVar.f30583e0 = i13;
                }
            }
            int i14 = this.f26041b;
            if (i14 < Integer.MAX_VALUE) {
                gVar.D[0] = i14;
            }
            String str6 = this.f26045f;
            if (str6 == str4) {
                gVar.P(n6.f.WRAP_CONTENT);
                return;
            }
            if (str6 == str2) {
                gVar.P(n6.f.MATCH_PARENT);
                return;
            } else {
                if (str6 == null) {
                    gVar.P(n6.f.FIXED);
                    gVar.T(this.f26043d);
                    return;
                }
                return;
            }
        }
        if (z11) {
            gVar.R(n6.f.MATCH_CONSTRAINT);
            String str7 = this.f26045f;
            if (str7 == str4) {
                i12 = 1;
            } else if (str7 != str3) {
                i12 = 0;
            }
            gVar.S(this.f26042c, i12, this.f26040a, this.f26041b);
            return;
        }
        int i15 = this.f26040a;
        if (i15 > 0) {
            if (i15 < 0) {
                gVar.f30585f0 = 0;
            } else {
                gVar.f30585f0 = i15;
            }
        }
        int i16 = this.f26041b;
        if (i16 < Integer.MAX_VALUE) {
            gVar.D[1] = i16;
        }
        String str8 = this.f26045f;
        if (str8 == str4) {
            gVar.R(n6.f.WRAP_CONTENT);
            return;
        }
        if (str8 == str2) {
            gVar.R(n6.f.MATCH_PARENT);
        } else if (str8 == null) {
            gVar.R(n6.f.FIXED);
            gVar.O(this.f26043d);
        }
    }
}
