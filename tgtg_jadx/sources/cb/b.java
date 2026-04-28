package cb;

import y00.e0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f7856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f7857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f7858f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f7859g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f7860h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f7861i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f7862j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f7863k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f7865c;

    static {
        int i11 = 0;
        f7856d = new b("NONE", i11);
        f7857e = new b("FULL", i11);
        int i12 = 1;
        f7858f = new b("VERTICAL", i12);
        f7859g = new b("HORIZONTAL", i12);
        int i13 = 2;
        f7860h = new b("FLAT", i13);
        f7861i = new b("HALF_OPENED", i13);
        int i14 = 3;
        f7862j = new b("FOLD", i14);
        f7863k = new b("HINGE", i14);
    }

    public b(l lVar, db.a aVar, e0 e0Var) {
        this.f7864b = 4;
        this.f7865c = aVar;
    }

    public String toString() {
        switch (this.f7864b) {
            case 0:
                return (String) this.f7865c;
            case 1:
                return (String) this.f7865c;
            case 2:
                return (String) this.f7865c;
            case 3:
                return (String) this.f7865c;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ b(String str, int i11) {
        this.f7864b = i11;
        this.f7865c = str;
    }
}
