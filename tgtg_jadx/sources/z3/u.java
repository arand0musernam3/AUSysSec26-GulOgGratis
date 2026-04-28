package z3;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements d0, Map, KMutableMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t f47059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f47060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f47061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f47062d;

    public u() {
        r3.b bVar = r3.b.f37577f;
        g gVarJ = l.j();
        t tVar = new t(gVarJ.g(), bVar);
        if (!(gVarJ instanceof b)) {
            tVar.f47000b = new t(1, bVar);
        }
        this.f47059a = tVar;
        this.f47060b = new m(this, 0);
        this.f47061c = new n(this);
        this.f47062d = new m(this, 1);
    }

    public static final boolean a(u uVar, t tVar, int i11, r3.b bVar) {
        boolean z11;
        synchronized (v.f47063a) {
            int i12 = tVar.f47058d;
            if (i12 == i11) {
                tVar.f47057c = bVar;
                z11 = true;
                tVar.f47058d = i12 + 1;
            } else {
                z11 = false;
            }
        }
        return z11;
    }

    @Override // z3.d0
    public final f0 b() {
        return this.f47059a;
    }

    @Override // java.util.Map
    public final void clear() {
        g gVarJ;
        t tVar = this.f47059a;
        tVar.getClass();
        t tVar2 = (t) l.h(tVar);
        r3.b bVar = r3.b.f37577f;
        if (bVar != tVar2.f47057c) {
            t tVar3 = this.f47059a;
            tVar3.getClass();
            synchronized (l.f47038c) {
                gVarJ = l.j();
                t tVar4 = (t) l.w(tVar3, this, gVarJ);
                synchronized (v.f47063a) {
                    tVar4.f47057c = bVar;
                    tVar4.f47058d++;
                }
            }
            l.n(gVarJ, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return f().f47057c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return f().f47057c.containsValue(obj);
    }

    @Override // z3.d0
    public final void e(f0 f0Var) {
        f0Var.getClass();
        this.f47059a = (t) f0Var;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f47060b;
    }

    public final t f() {
        t tVar = this.f47059a;
        tVar.getClass();
        return (t) l.t(tVar, this);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return f().f47057c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return f().f47057c.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f47061c;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        r3.b bVar;
        int i11;
        Object objPut;
        g gVarJ;
        boolean zA;
        do {
            synchronized (v.f47063a) {
                t tVar = this.f47059a;
                tVar.getClass();
                t tVar2 = (t) l.h(tVar);
                bVar = tVar2.f47057c;
                i11 = tVar2.f47058d;
            }
            bVar.getClass();
            r3.d dVarH = bVar.h();
            objPut = dVarH.put(obj, obj2);
            r3.b bVarG = dVarH.g();
            if (Intrinsics.areEqual(bVarG, bVar)) {
                break;
            }
            t tVar3 = this.f47059a;
            tVar3.getClass();
            synchronized (l.f47038c) {
                gVarJ = l.j();
                zA = a(this, (t) l.w(tVar3, this, gVarJ), i11, bVarG);
            }
            l.n(gVarJ, this);
        } while (!zA);
        return objPut;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        r3.b bVar;
        int i11;
        g gVarJ;
        boolean zA;
        do {
            synchronized (v.f47063a) {
                t tVar = this.f47059a;
                tVar.getClass();
                t tVar2 = (t) l.h(tVar);
                bVar = tVar2.f47057c;
                i11 = tVar2.f47058d;
            }
            bVar.getClass();
            r3.d dVarH = bVar.h();
            dVarH.putAll(map);
            r3.b bVarG = dVarH.g();
            if (Intrinsics.areEqual(bVarG, bVar)) {
                return;
            }
            t tVar3 = this.f47059a;
            tVar3.getClass();
            synchronized (l.f47038c) {
                gVarJ = l.j();
                zA = a(this, (t) l.w(tVar3, this, gVarJ), i11, bVarG);
            }
            l.n(gVarJ, this);
        } while (!zA);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        r3.b bVar;
        int i11;
        V vRemove;
        g gVarJ;
        boolean zA;
        do {
            synchronized (v.f47063a) {
                t tVar = this.f47059a;
                tVar.getClass();
                t tVar2 = (t) l.h(tVar);
                bVar = tVar2.f47057c;
                i11 = tVar2.f47058d;
            }
            bVar.getClass();
            r3.d dVarH = bVar.h();
            vRemove = dVarH.remove(obj);
            r3.b bVarG = dVarH.g();
            if (Intrinsics.areEqual(bVarG, bVar)) {
                break;
            }
            t tVar3 = this.f47059a;
            tVar3.getClass();
            synchronized (l.f47038c) {
                gVarJ = l.j();
                zA = a(this, (t) l.w(tVar3, this, gVarJ), i11, bVarG);
            }
            l.n(gVarJ, this);
        } while (!zA);
        return vRemove;
    }

    @Override // java.util.Map
    public final int size() {
        return f().f47057c.size();
    }

    public final String toString() {
        t tVar = this.f47059a;
        tVar.getClass();
        return "SnapshotStateMap(value=" + ((t) l.h(tVar)).f47057c + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f47062d;
    }
}
