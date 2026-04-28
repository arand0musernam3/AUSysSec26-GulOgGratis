package k6;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n6.g f26050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f26055f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f26056g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f26057h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f26058i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f26059j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f26060k;
    public float l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f26061m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f26062n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f26063o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f26064p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f26065q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final HashMap f26066r;

    public n(n nVar) {
        this.f26050a = null;
        this.f26051b = 0;
        this.f26052c = 0;
        this.f26053d = 0;
        this.f26054e = 0;
        this.f26055f = Float.NaN;
        this.f26056g = Float.NaN;
        this.f26057h = Float.NaN;
        this.f26058i = Float.NaN;
        this.f26059j = Float.NaN;
        this.f26060k = Float.NaN;
        this.l = Float.NaN;
        this.f26061m = Float.NaN;
        this.f26062n = Float.NaN;
        this.f26063o = Float.NaN;
        this.f26064p = Float.NaN;
        this.f26065q = 0;
        this.f26066r = new HashMap();
        this.f26050a = nVar.f26050a;
        this.f26051b = nVar.f26051b;
        this.f26052c = nVar.f26052c;
        this.f26053d = nVar.f26053d;
        this.f26054e = nVar.f26054e;
        c(nVar);
    }

    public static void a(float f11, String str, StringBuilder sb2) {
        if (Float.isNaN(f11)) {
            return;
        }
        sb2.append(str);
        sb2.append(": ");
        sb2.append(f11);
        sb2.append(",\n");
    }

    public static void b(int i11, String str, StringBuilder sb2) {
        sb2.append(str);
        sb2.append(": ");
        sb2.append(i11);
        sb2.append(",\n");
    }

    public final void c(n nVar) {
        if (nVar == null) {
            return;
        }
        this.f26055f = nVar.f26055f;
        this.f26056g = nVar.f26056g;
        this.f26057h = nVar.f26057h;
        this.f26058i = nVar.f26058i;
        this.f26059j = nVar.f26059j;
        this.f26060k = nVar.f26060k;
        this.l = nVar.l;
        this.f26061m = nVar.f26061m;
        this.f26062n = nVar.f26062n;
        this.f26063o = nVar.f26063o;
        this.f26064p = nVar.f26064p;
        this.f26065q = nVar.f26065q;
        HashMap map = this.f26066r;
        map.clear();
        for (h6.a aVar : nVar.f26066r.values()) {
            String str = aVar.f21494a;
            h6.a aVar2 = new h6.a();
            aVar2.f21496c = Integer.MIN_VALUE;
            aVar2.f21497d = Float.NaN;
            aVar2.f21494a = str;
            aVar2.f21495b = aVar.f21495b;
            aVar2.f21496c = aVar.f21496c;
            aVar2.f21497d = aVar.f21497d;
            map.put(str, aVar2);
        }
    }

    public n(n6.g gVar) {
        this.f26050a = null;
        this.f26051b = 0;
        this.f26052c = 0;
        this.f26053d = 0;
        this.f26054e = 0;
        this.f26055f = Float.NaN;
        this.f26056g = Float.NaN;
        this.f26057h = Float.NaN;
        this.f26058i = Float.NaN;
        this.f26059j = Float.NaN;
        this.f26060k = Float.NaN;
        this.l = Float.NaN;
        this.f26061m = Float.NaN;
        this.f26062n = Float.NaN;
        this.f26063o = Float.NaN;
        this.f26064p = Float.NaN;
        this.f26065q = 0;
        this.f26066r = new HashMap();
        this.f26050a = gVar;
    }
}
