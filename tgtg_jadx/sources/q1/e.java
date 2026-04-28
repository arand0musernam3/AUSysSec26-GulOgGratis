package q1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends k1 implements Map {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.datastore.preferences.protobuf.f1 f35744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f35745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f35746f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k1 k1Var) {
        super(0);
        int i11 = k1Var.f35782c;
        b(this.f35782c + i11);
        if (this.f35782c != 0) {
            for (int i12 = 0; i12 < i11; i12++) {
                put(k1Var.g(i12), k1Var.j(i12));
            }
        } else if (i11 > 0) {
            kotlin.collections.x.f(0, k1Var.f35780a, 0, i11, this.f35780a);
            kotlin.collections.x.d(0, 0, i11 << 1, k1Var.f35781b, this.f35781b);
            this.f35782c = i11;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        androidx.datastore.preferences.protobuf.f1 f1Var = this.f35744d;
        if (f1Var != null) {
            return f1Var;
        }
        androidx.datastore.preferences.protobuf.f1 f1Var2 = new androidx.datastore.preferences.protobuf.f1(this, 3);
        this.f35744d = f1Var2;
        return f1Var2;
    }

    public final boolean k(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final Set keySet() {
        b bVar = this.f35745e;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this);
        this.f35745e = bVar2;
        return bVar2;
    }

    public final boolean l(Collection collection) {
        int i11 = this.f35782c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i11 != this.f35782c;
    }

    public final boolean m(Collection collection) {
        int i11 = this.f35782c;
        for (int i12 = i11 - 1; i12 >= 0; i12--) {
            if (!collection.contains(g(i12))) {
                h(i12);
            }
        }
        return i11 != this.f35782c;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f35782c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        d dVar = this.f35746f;
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(this);
        this.f35746f = dVar2;
        return dVar2;
    }

    public e() {
        super(0);
    }
}
