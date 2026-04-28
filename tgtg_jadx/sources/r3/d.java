package r3;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.markers.KMutableMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class d extends kotlin.collections.n implements Map, KMutableMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f37583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t3.b f37584b = new t3.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f37585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f37586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f37587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f37588f;

    public d(b bVar) {
        this.f37583a = bVar;
        this.f37585c = bVar.f37578d;
        this.f37588f = bVar.f37579e;
    }

    @Override // kotlin.collections.n
    public final Set a() {
        return new f(this, 0);
    }

    @Override // kotlin.collections.n
    public final Set b() {
        return new f(this, 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f37585c = l.f37600e;
        h(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f37585c.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // kotlin.collections.n
    public final int d() {
        return this.f37588f;
    }

    @Override // kotlin.collections.n
    public final Collection e() {
        return new i(this, 0);
    }

    /* JADX INFO: renamed from: f */
    public b g() {
        l lVar = this.f37585c;
        b bVar = this.f37583a;
        if (lVar != bVar.f37578d) {
            this.f37584b = new t3.b();
            bVar = new b(this.f37585c, d());
        }
        this.f37583a = bVar;
        return bVar;
    }

    public /* bridge */ b g() {
        return g();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.f37585c.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final void h(int i11) {
        this.f37588f = i11;
        this.f37587e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f37586d = null;
        this.f37585c = this.f37585c.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f37586d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        b bVarF = null;
        b bVar = map instanceof b ? (b) map : null;
        if (bVar == null) {
            d dVar = map instanceof d ? (d) map : null;
            if (dVar != null) {
                bVarF = dVar.g();
            }
        } else {
            bVarF = bVar;
        }
        if (bVarF == null) {
            super.putAll(map);
            return;
        }
        t3.a aVar = new t3.a();
        aVar.f39777a = 0;
        int i11 = this.f37588f;
        l lVar = this.f37585c;
        l lVar2 = bVarF.f37578d;
        lVar2.getClass();
        this.f37585c = lVar.m(lVar2, 0, aVar, this);
        int i12 = (bVarF.f37579e + i11) - aVar.f39777a;
        if (i11 != i12) {
            h(i12);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int iD = d();
        l lVarO = this.f37585c.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (lVarO == null) {
            lVarO = l.f37600e;
        }
        this.f37585c = lVarO;
        return iD != d();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.f37586d = null;
        l lVarN = this.f37585c.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (lVarN == null) {
            lVarN = l.f37600e;
        }
        this.f37585c = lVarN;
        return this.f37586d;
    }
}
