package q90;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final g f36491n = new g(true, false, -1, -1, false, false, false, -1, -1, false, false, false, null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final g f36492o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f36493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f36494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f36495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f36496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f36497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f36498f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f36499g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f36500h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f36501i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f36502j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f36503k;
    public final boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f36504m;

    static {
        p80.c cVar = p80.d.f34559b;
        p80.h hVar = p80.h.SECONDS;
        long j9 = p80.d.j(p80.g.g(Integer.MAX_VALUE, hVar), hVar);
        if (j9 >= 0) {
            f36492o = new g(false, false, -1, -1, false, false, false, j9 <= 2147483647L ? (int) j9 : Integer.MAX_VALUE, -1, true, false, false, null);
        } else {
            i4.a.i(e0.f.i(j9, "maxStale < 0: "));
        }
    }

    public g(boolean z11, boolean z12, int i11, int i12, boolean z13, boolean z14, boolean z15, int i13, int i14, boolean z16, boolean z17, boolean z18, String str) {
        this.f36493a = z11;
        this.f36494b = z12;
        this.f36495c = i11;
        this.f36496d = i12;
        this.f36497e = z13;
        this.f36498f = z14;
        this.f36499g = z15;
        this.f36500h = i13;
        this.f36501i = i14;
        this.f36502j = z16;
        this.f36503k = z17;
        this.l = z18;
        this.f36504m = str;
    }

    public final String toString() {
        String str = this.f36504m;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f36493a) {
            sb2.append("no-cache, ");
        }
        if (this.f36494b) {
            sb2.append("no-store, ");
        }
        int i11 = this.f36495c;
        if (i11 != -1) {
            sb2.append("max-age=");
            sb2.append(i11);
            sb2.append(", ");
        }
        int i12 = this.f36496d;
        if (i12 != -1) {
            sb2.append("s-maxage=");
            sb2.append(i12);
            sb2.append(", ");
        }
        if (this.f36497e) {
            sb2.append("private, ");
        }
        if (this.f36498f) {
            sb2.append("public, ");
        }
        if (this.f36499g) {
            sb2.append("must-revalidate, ");
        }
        int i13 = this.f36500h;
        if (i13 != -1) {
            sb2.append("max-stale=");
            sb2.append(i13);
            sb2.append(", ");
        }
        int i14 = this.f36501i;
        if (i14 != -1) {
            sb2.append("min-fresh=");
            sb2.append(i14);
            sb2.append(", ");
        }
        if (this.f36502j) {
            sb2.append("only-if-cached, ");
        }
        if (this.f36503k) {
            sb2.append("no-transform, ");
        }
        if (this.l) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length()).getClass();
        String string = sb2.toString();
        this.f36504m = string;
        return string;
    }
}
