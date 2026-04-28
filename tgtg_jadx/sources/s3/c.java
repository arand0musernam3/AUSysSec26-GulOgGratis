package s3;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.o;
import kotlin.jvm.internal.markers.KMutableCollection;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends o implements Collection, KMutableCollection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f38822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f38823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f38824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r3.d f38825d;

    public c(b bVar) {
        this.f38822a = bVar;
        this.f38823b = bVar.f38819b;
        this.f38824c = bVar.f38820c;
        this.f38825d = bVar.f38821d.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        r3.d dVar = this.f38825d;
        if (dVar.containsKey(obj)) {
            return false;
        }
        if (isEmpty()) {
            this.f38823b = obj;
            this.f38824c = obj;
            dVar.put(obj, new a());
            return true;
        }
        V v3 = dVar.get(this.f38824c);
        v3.getClass();
        dVar.put(this.f38824c, new a(((a) v3).f38816a, obj));
        dVar.put(obj, new a(this.f38824c));
        this.f38824c = obj;
        return true;
    }

    @Override // kotlin.collections.o
    public final int b() {
        return this.f38825d.d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f38825d.clear();
        t3.b bVar = t3.b.f39778a;
        this.f38823b = bVar;
        this.f38824c = bVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f38825d.containsKey(obj);
    }

    public final b d() {
        r3.b bVarG = this.f38825d.g();
        b bVar = this.f38822a;
        if (bVarG != bVar.f38821d) {
            bVar = new b(this.f38823b, this.f38824c, bVarG);
        }
        this.f38822a = bVar;
        return bVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new d(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        r3.d dVar = this.f38825d;
        a aVar = (a) dVar.remove(obj);
        if (aVar == null) {
            return false;
        }
        Object obj2 = aVar.f38817b;
        Object obj3 = aVar.f38816a;
        t3.b bVar = t3.b.f39778a;
        if (obj3 != bVar) {
            V v3 = dVar.get(obj3);
            v3.getClass();
            dVar.put(obj3, new a(((a) v3).f38816a, obj2));
        } else {
            this.f38823b = obj2;
        }
        if (obj2 == bVar) {
            this.f38824c = obj3;
            return true;
        }
        V v7 = dVar.get(obj2);
        v7.getClass();
        dVar.put(obj2, new a(obj3, ((a) v7).f38817b));
        return true;
    }
}
