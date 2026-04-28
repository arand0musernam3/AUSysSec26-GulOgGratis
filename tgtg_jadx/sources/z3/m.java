package z3;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f47052b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(u uVar, int i11) {
        super(uVar);
        this.f47052b = i11;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f47052b) {
            case 0:
                v.g();
                throw null;
            default:
                v.g();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f47052b) {
            case 0:
                v.g();
                throw null;
            default:
                v.g();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f47052b) {
            case 0:
                if (!TypeIntrinsics.isMutableMapEntry(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return Intrinsics.areEqual(this.f47053a.get(entry.getKey()), entry.getValue());
            default:
                return this.f47053a.containsValue(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f47052b) {
            case 0:
                Collection collection2 = collection;
                if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        if (!contains((Map.Entry) it.next())) {
                            break;
                        }
                    }
                }
                break;
            default:
                Collection collection3 = collection;
                if (!(collection3 instanceof Collection) || !collection3.isEmpty()) {
                    Iterator it2 = collection3.iterator();
                    while (it2.hasNext()) {
                        if (!this.f47053a.containsValue(it2.next())) {
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f47052b) {
            case 0:
                u uVar = this.f47053a;
                return new c0(uVar, ((p3.b) uVar.f().f47057c.entrySet()).iterator(), 0);
            default:
                u uVar2 = this.f47053a;
                return new c0(uVar2, ((p3.b) uVar2.f().f47057c.entrySet()).iterator(), 2);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        Object next;
        switch (this.f47052b) {
            case 0:
                return TypeIntrinsics.isMutableMapEntry(obj) && this.f47053a.remove(((Map.Entry) obj).getKey()) != null;
            default:
                u uVar = this.f47053a;
                Iterator it = uVar.f47060b.iterator();
                while (true) {
                    if (((c0) it).hasNext()) {
                        next = ((c0) it).next();
                        if (Intrinsics.areEqual(((Map.Entry) next).getValue(), obj)) {
                        }
                    } else {
                        next = null;
                    }
                }
                Map.Entry entry = (Map.Entry) next;
                if (entry == null) {
                    return false;
                }
                uVar.remove(entry.getKey());
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        r3.b bVar;
        int i11;
        g gVarJ;
        boolean zA;
        switch (this.f47052b) {
            case 0:
                Iterator it = collection.iterator();
                while (true) {
                    boolean z11 = false;
                    while (it.hasNext()) {
                        if (this.f47053a.remove(((Map.Entry) it.next()).getKey()) != null || z11) {
                            z11 = true;
                        }
                    }
                    return z11;
                }
                break;
            default:
                Set setV0 = CollectionsKt.v0(collection);
                u uVar = this.f47053a;
                boolean z12 = false;
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
                    Iterator it2 = uVar.f47060b.iterator();
                    while (((c0) it2).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((c0) it2).next();
                        if (setV0.contains(entry.getValue())) {
                            dVarH.remove(entry.getKey());
                            z12 = true;
                        }
                    }
                    r3.b bVarG = dVarH.g();
                    if (!Intrinsics.areEqual(bVarG, bVar)) {
                        t tVar3 = uVar.f47059a;
                        tVar3.getClass();
                        synchronized (l.f47038c) {
                            gVarJ = l.j();
                            zA = u.a(uVar, (t) l.w(tVar3, uVar, gVarJ), i11, bVarG);
                        }
                        l.n(gVarJ, uVar);
                    }
                    return z12;
                } while (!zA);
                return z12;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        r3.b bVar;
        int i11;
        g gVarJ;
        boolean zA;
        r3.b bVar2;
        int i12;
        g gVarJ2;
        boolean zA2;
        switch (this.f47052b) {
            case 0:
                Collection<Map.Entry> collection2 = collection;
                int iA = w0.a(kotlin.collections.e0.o(collection2, 10));
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                for (Map.Entry entry : collection2) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
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
                        Map.Entry entry2 = (Map.Entry) ((c0) it).next();
                        if (!linkedHashMap.containsKey(entry2.getKey()) || !Intrinsics.areEqual(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                            dVarH.remove(entry2.getKey());
                            z11 = true;
                        }
                    }
                    r3.b bVarG = dVarH.g();
                    if (!Intrinsics.areEqual(bVarG, bVar)) {
                        t tVar3 = uVar.f47059a;
                        tVar3.getClass();
                        synchronized (l.f47038c) {
                            gVarJ = l.j();
                            zA = u.a(uVar, (t) l.w(tVar3, uVar, gVarJ), i11, bVarG);
                        }
                        l.n(gVarJ, uVar);
                    }
                    return z11;
                } while (!zA);
                return z11;
            default:
                Set setV0 = CollectionsKt.v0(collection);
                u uVar2 = this.f47053a;
                boolean z12 = false;
                do {
                    synchronized (v.f47063a) {
                        t tVar4 = uVar2.f47059a;
                        tVar4.getClass();
                        t tVar5 = (t) l.h(tVar4);
                        bVar2 = tVar5.f47057c;
                        i12 = tVar5.f47058d;
                    }
                    bVar2.getClass();
                    r3.d dVarH2 = bVar2.h();
                    Iterator it2 = uVar2.f47060b.iterator();
                    while (((c0) it2).hasNext()) {
                        Map.Entry entry3 = (Map.Entry) ((c0) it2).next();
                        if (!setV0.contains(entry3.getValue())) {
                            dVarH2.remove(entry3.getKey());
                            z12 = true;
                        }
                    }
                    r3.b bVarG2 = dVarH2.g();
                    if (!Intrinsics.areEqual(bVarG2, bVar2)) {
                        t tVar6 = uVar2.f47059a;
                        tVar6.getClass();
                        synchronized (l.f47038c) {
                            gVarJ2 = l.j();
                            zA2 = u.a(uVar2, (t) l.w(tVar6, uVar2, gVarJ2), i12, bVarG2);
                        }
                        l.n(gVarJ2, uVar2);
                    }
                    return z12;
                } while (!zA2);
                return z12;
        }
    }
}
