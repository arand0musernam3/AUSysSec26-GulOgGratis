package o40;

import java.util.Date;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements n40.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f31975f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f31976g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f31978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f31979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f31980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f31981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f31974e = new a(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f31977h = new c();

    /* JADX WARN: Type inference failed for: r0v1, types: [o40.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [o40.b] */
    static {
        final int i11 = 0;
        f31975f = new m40.e() { // from class: o40.b
            @Override // m40.a
            public final void a(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        ((m40.f) obj2).add((String) obj);
                        break;
                    default:
                        ((m40.f) obj2).f(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i12 = 1;
        f31976g = new m40.e() { // from class: o40.b
            @Override // m40.a
            public final void a(Object obj, Object obj2) {
                switch (i12) {
                    case 0:
                        ((m40.f) obj2).add((String) obj);
                        break;
                    default:
                        ((m40.f) obj2).f(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public d() {
        HashMap map = new HashMap();
        this.f31978a = map;
        HashMap map2 = new HashMap();
        this.f31979b = map2;
        this.f31980c = f31974e;
        this.f31981d = false;
        map2.put(String.class, f31975f);
        map.remove(String.class);
        map2.put(Boolean.class, f31976g);
        map.remove(Boolean.class);
        map2.put(Date.class, f31977h);
        map.remove(Date.class);
    }

    public final n40.a a(Class cls, m40.c cVar) {
        this.f31978a.put(cls, cVar);
        this.f31979b.remove(cls);
        return this;
    }
}
