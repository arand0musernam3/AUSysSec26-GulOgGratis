package z3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends o {
    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        v.g();
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        v.g();
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f47053a.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!this.f47053a.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        u uVar = this.f47053a;
        return new c0(uVar, ((p3.b) uVar.f().f47057c.entrySet()).iterator(), 1);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f47053a.remove(obj) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z11 = false;
            while (it.hasNext()) {
                if (this.f47053a.remove(it.next()) != null || z11) {
                    z11 = true;
                }
            }
            return z11;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        r3.b bVar;
        int i11;
        g gVarJ;
        boolean zA;
        Set setV0 = CollectionsKt.v0(collection);
        u uVar = this.f47053a;
        boolean z11 = false;
        do {
            synchronized (v.f47063a) {
                t tVar = uVar.f47059a;
                tVar.getClass();
                t tVar2 = (t) l.h(tVar);
                bVar = tVar2.f47057c;
                i11 = tVar2.f47058d;
            }
            bVar.getClass();
            r3.d dVarH = bVar.h();
            Iterator it = uVar.f47060b.iterator();
            while (((c0) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((c0) it).next();
                if (!setV0.contains(entry.getKey())) {
                    dVarH.remove(entry.getKey());
                    z11 = true;
                }
            }
            r3.b bVarG = dVarH.g();
            if (Intrinsics.areEqual(bVarG, bVar)) {
                break;
            }
            t tVar3 = uVar.f47059a;
            tVar3.getClass();
            synchronized (l.f47038c) {
                gVarJ = l.j();
                zA = u.a(uVar, (t) l.w(tVar3, uVar, gVarJ), i11, bVarG);
            }
            l.n(gVarJ, uVar);
        } while (!zA);
        return z11;
    }
}
