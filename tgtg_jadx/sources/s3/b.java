package s3;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.q;
import kotlin.jvm.internal.markers.KMappedMarker;
import o80.h;
import r3.l;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends q implements p3.b, Collection, KMappedMarker {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f38818e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f38819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f38820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r3.b f38821d;

    static {
        t3.b bVar = t3.b.f39778a;
        f38818e = new b(bVar, bVar, r3.b.f37577f);
    }

    public b(Object obj, Object obj2, r3.b bVar) {
        this.f38819b = obj;
        this.f38820c = obj2;
        this.f38821d = bVar;
    }

    @Override // kotlin.collections.a
    public final int b() {
        return this.f38821d.d();
    }

    @Override // kotlin.collections.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f38821d.containsKey(obj);
    }

    public final b d(Object obj) {
        r3.b bVar = this.f38821d;
        if (bVar.containsKey(obj)) {
            return this;
        }
        if (isEmpty()) {
            return new b(obj, obj, bVar.i(obj, new a()));
        }
        Object obj2 = this.f38820c;
        Object obj3 = bVar.get(obj2);
        obj3.getClass();
        return new b(this.f38819b, obj, bVar.i(obj2, new a(((a) obj3).f38816a, obj)).i(obj, new a(obj2)));
    }

    public final b e(Object obj) {
        r3.b bVarI = this.f38821d;
        a aVar = (a) bVarI.get(obj);
        if (aVar == null) {
            return this;
        }
        Object obj2 = aVar.f38816a;
        Object obj3 = aVar.f38817b;
        l lVar = bVarI.f37578d;
        l lVarV = lVar.v(obj != null ? obj.hashCode() : 0, 0, obj);
        if (lVar != lVarV) {
            bVarI = lVarV == null ? r3.b.f37577f : new r3.b(lVarV, bVarI.f37579e - 1);
        }
        t3.b bVar = t3.b.f39778a;
        if (obj2 != bVar) {
            Object obj4 = bVarI.get(obj2);
            obj4.getClass();
            bVarI = bVarI.i(obj2, new a(((a) obj4).f38816a, obj3));
        }
        if (obj3 != bVar) {
            Object obj5 = bVarI.get(obj3);
            obj5.getClass();
            bVarI = bVarI.i(obj3, new a(obj2, ((a) obj5).f38817b));
        }
        Object obj6 = obj2 != bVar ? this.f38819b : obj3;
        if (obj3 != bVar) {
            obj2 = this.f38820c;
        }
        return new b(obj6, obj2, bVarI);
    }

    @Override // kotlin.collections.q, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new h(this.f38819b, this.f38821d);
    }
}
