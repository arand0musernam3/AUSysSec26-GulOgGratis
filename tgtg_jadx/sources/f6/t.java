package f6;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e.b f17429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17430b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f17431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f17432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f17433e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k6.b f17434f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f17435g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f17436h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f17437i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f17438j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final z5.c f17439k;
    public long l;

    public t(z5.c cVar) {
        HashMap map = new HashMap();
        this.f17431c = map;
        this.f17432d = new HashMap();
        this.f17433e = new HashMap();
        k6.b bVar = new k6.b(this);
        this.f17434f = bVar;
        this.f17435g = 0;
        this.f17436h = new ArrayList();
        this.f17437i = new ArrayList();
        this.f17438j = true;
        bVar.f25993a = 0;
        map.put(0, bVar);
        this.f17439k = cVar;
        this.l = z5.b.b(0, 0, 15);
        z5.m mVar = z5.m.Ltr;
        this.f17429a = new e.b(this, 4);
    }

    public final void a(Object obj) {
        this.f17436h.add(obj);
        this.f17438j = true;
    }

    public final k6.b b(Object obj) {
        HashMap map = this.f17431c;
        k6.h hVar = (k6.h) map.get(obj);
        Object obj2 = hVar;
        if (hVar == null) {
            k6.b bVar = new k6.b(this);
            map.put(obj, bVar);
            bVar.f25993a = obj;
            obj2 = bVar;
        }
        if (obj2 instanceof k6.b) {
            return (k6.b) obj2;
        }
        return null;
    }

    public final int c(Float f11) {
        return Math.round(f11.floatValue());
    }

    public final l6.h d(int i11, String str) {
        k6.b bVarB = b(str);
        Object obj = bVarB.f25997c;
        if (obj == null || !(obj instanceof l6.h)) {
            l6.h hVar = new l6.h(this);
            hVar.f27424b = i11;
            hVar.f27429g = str;
            bVarB.f25997c = hVar;
            bVarB.a(hVar.b());
        }
        return (l6.h) bVarB.f25997c;
    }

    public final k6.g e(k6.l lVar) {
        k6.g jVar;
        StringBuilder sb2 = new StringBuilder("__HELPER_KEY_");
        int i11 = this.f17435g;
        this.f17435g = i11 + 1;
        String strI = r8.k.i(i11, "__", sb2);
        HashMap map = this.f17432d;
        k6.g gVar = (k6.g) map.get(strI);
        k6.g gVar2 = gVar;
        if (gVar == null) {
            switch (lVar.ordinal()) {
                case 0:
                    jVar = new l6.j(this, k6.l.HORIZONTAL_CHAIN);
                    break;
                case 1:
                    jVar = new l6.l(this, k6.l.VERTICAL_CHAIN);
                    break;
                case 2:
                    l6.a aVar = new l6.a(this, k6.l.ALIGN_VERTICALLY, 0);
                    aVar.f27388o0 = 0.5f;
                    jVar = aVar;
                    break;
                case 3:
                    l6.a aVar2 = new l6.a(this, k6.l.ALIGN_VERTICALLY, 1);
                    aVar2.f27388o0 = 0.5f;
                    jVar = aVar2;
                    break;
                case 4:
                    jVar = new l6.c(this);
                    break;
                case 5:
                default:
                    jVar = new k6.g(this, lVar);
                    break;
                case 6:
                case 7:
                    jVar = new l6.f(this, lVar);
                    break;
                case 8:
                case 9:
                case 10:
                    jVar = new l6.g(this, lVar);
                    break;
            }
            jVar.f25993a = strI;
            map.put(strI, jVar);
            gVar2 = jVar;
        }
        return gVar2;
    }
}
