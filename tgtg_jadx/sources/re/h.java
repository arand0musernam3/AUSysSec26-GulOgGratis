package re;

import androidx.lifecycle.n1;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f37922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final he.k f37923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f37924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f37925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f37926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f37927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f37928g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f37929h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final pe.d f37930i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f37931j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f37932k;
    public final int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f37933m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f37934n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f37935o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float f37936p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final pe.a f37937q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final oz.m f37938r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final pe.b f37939s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List f37940t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final g f37941u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f37942v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final jb.b f37943w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final n1 f37944x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final qe.h f37945y;

    public h(List list, he.k kVar, String str, long j9, f fVar, long j11, String str2, List list2, pe.d dVar, int i11, int i12, int i13, float f11, float f12, float f13, float f14, pe.a aVar, oz.m mVar, List list3, g gVar, pe.b bVar, boolean z11, jb.b bVar2, n1 n1Var, qe.h hVar) {
        this.f37922a = list;
        this.f37923b = kVar;
        this.f37924c = str;
        this.f37925d = j9;
        this.f37926e = fVar;
        this.f37927f = j11;
        this.f37928g = str2;
        this.f37929h = list2;
        this.f37930i = dVar;
        this.f37931j = i11;
        this.f37932k = i12;
        this.l = i13;
        this.f37933m = f11;
        this.f37934n = f12;
        this.f37935o = f13;
        this.f37936p = f14;
        this.f37937q = aVar;
        this.f37938r = mVar;
        this.f37940t = list3;
        this.f37941u = gVar;
        this.f37939s = bVar;
        this.f37942v = z11;
        this.f37943w = bVar2;
        this.f37944x = n1Var;
        this.f37945y = hVar;
    }

    public final String a(String str) {
        int i11;
        StringBuilder sbO = b3.i.o(str);
        sbO.append(this.f37924c);
        sbO.append("\n");
        long j9 = this.f37927f;
        he.k kVar = this.f37923b;
        h hVar = (h) kVar.f21934i.b(j9);
        if (hVar != null) {
            sbO.append("\t\tParents: ");
            sbO.append(hVar.f37924c);
            for (h hVar2 = (h) kVar.f21934i.b(hVar.f37927f); hVar2 != null; hVar2 = (h) kVar.f21934i.b(hVar2.f37927f)) {
                sbO.append("->");
                sbO.append(hVar2.f37924c);
            }
            sbO.append(str);
            sbO.append("\n");
        }
        List list = this.f37929h;
        if (!list.isEmpty()) {
            sbO.append(str);
            sbO.append("\tMasks: ");
            sbO.append(list.size());
            sbO.append("\n");
        }
        int i12 = this.f37931j;
        if (i12 != 0 && (i11 = this.f37932k) != 0) {
            sbO.append(str);
            sbO.append("\tBackground: ");
            sbO.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i12), Integer.valueOf(i11), Integer.valueOf(this.l)));
        }
        List list2 = this.f37922a;
        if (!list2.isEmpty()) {
            sbO.append(str);
            sbO.append("\tShapes:\n");
            for (Object obj : list2) {
                sbO.append(str);
                sbO.append("\t\t");
                sbO.append(obj);
                sbO.append("\n");
            }
        }
        return sbO.toString();
    }

    public final String toString() {
        return a("");
    }
}
