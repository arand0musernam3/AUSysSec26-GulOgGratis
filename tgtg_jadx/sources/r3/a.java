package r3;

import kotlin.jvm.internal.markers.KMutableMap;
import m0.i1;
import q1.c0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends c0 implements KMutableMap.Entry {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f37575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f37576e;

    public a(g gVar, Object obj, Object obj2) {
        super(1, obj, obj2);
        this.f37575d = gVar;
        this.f37576e = obj2;
    }

    @Override // q1.c0, java.util.Map.Entry
    public final Object getValue() {
        return this.f37576e;
    }

    @Override // q1.c0, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f37576e;
        this.f37576e = obj;
        e eVar = this.f37575d.f37595a;
        d dVar = eVar.f37589d;
        Object obj3 = this.f35728b;
        if (!dVar.containsKey(obj3)) {
            return obj2;
        }
        boolean z11 = eVar.f37582c;
        if (!z11) {
            dVar.put(obj3, obj);
        } else {
            if (!z11) {
                i1.c();
                return null;
            }
            m mVar = eVar.f37580a[eVar.f37581b];
            Object obj4 = mVar.f37605a[mVar.f37607c];
            dVar.put(obj3, obj);
            eVar.d(obj4 != null ? obj4.hashCode() : 0, dVar.f37585c, obj4, 0);
        }
        eVar.f37592g = dVar.f37587e;
        return obj2;
    }
}
