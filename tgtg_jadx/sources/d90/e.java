package d90;

import a90.t;
import a90.v;
import com.google.firebase.messaging.a0;
import i80.n;
import j4.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import v80.j;
import v80.k;
import v80.n2;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements j, n2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14780f = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "state$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f14781a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f14783c;
    private volatile /* synthetic */ Object state$volatile = g.f14787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f14782b = new ArrayList(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14784d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f14785e = g.f14790d;

    public e(CoroutineContext coroutineContext) {
        this.f14781a = coroutineContext;
    }

    @Override // v80.n2
    public final void a(t tVar, int i11) {
        this.f14783c = tVar;
        this.f14784d = i11;
    }

    @Override // v80.j
    public final void b(Throwable th2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14780f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == g.f14788b) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, g.f14789c)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            ArrayList arrayList = this.f14782b;
            if (arrayList == null) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((c) it.next()).a();
            }
            this.f14785e = g.f14790d;
            this.f14782b = null;
            return;
        }
    }

    public final Object c(z70.c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14780f;
        Object obj = atomicReferenceFieldUpdater.get(this);
        obj.getClass();
        c cVar2 = (c) obj;
        Object obj2 = this.f14785e;
        ArrayList<c> arrayList = this.f14782b;
        if (arrayList != null) {
            for (c cVar3 : arrayList) {
                if (cVar3 != cVar2) {
                    cVar3.a();
                }
            }
            atomicReferenceFieldUpdater.set(this, g.f14788b);
            this.f14785e = g.f14790d;
            this.f14782b = null;
        }
        n nVar = cVar2.f14770c;
        Object obj3 = cVar2.f14771d;
        Object objInvoke = nVar.invoke(cVar2.f14768a, obj3, obj2);
        x70.c cVar4 = cVar2.f14772e;
        return obj3 == g.f14791e ? ((Function1) cVar4).invoke(cVar) : ((Function2) cVar4).invoke(objInvoke, cVar);
    }

    public final Object d(i iVar) {
        return f14780f.get(this) instanceof c ? c(iVar) : e(iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(z70.c r10) throws kotlinx.coroutines.DispatchException {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d90.e.e(z70.c):java.lang.Object");
    }

    public final c f(Object obj) {
        ArrayList arrayList = this.f14782b;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((c) next).f14768a == obj) {
                obj2 = next;
                break;
            }
        }
        c cVar = (c) obj2;
        if (cVar != null) {
            return cVar;
        }
        j4.d.h("Clause with object ", obj, " is not found");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(a0 a0Var, Function2 function2) {
        h(new c(this, a0Var.f12779b, (n) a0Var.f12780c, (n) a0Var.f12781d, null, (i) function2, (n) a0Var.f12782e), false);
    }

    public final void h(c cVar, boolean z11) {
        Object obj = cVar.f14768a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14780f;
        if (atomicReferenceFieldUpdater.get(this) instanceof c) {
            return;
        }
        if (!z11) {
            ArrayList arrayList = this.f14782b;
            arrayList.getClass();
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((c) it.next()).f14768a == obj) {
                        e40.a.g(s.j(obj, "Cannot use select clauses on the same object: "));
                        return;
                    }
                }
            }
        }
        cVar.f14769b.invoke(obj, this, cVar.f14771d);
        if (this.f14785e != g.f14790d) {
            atomicReferenceFieldUpdater.set(this, cVar);
            return;
        }
        if (!z11) {
            ArrayList arrayList2 = this.f14782b;
            arrayList2.getClass();
            arrayList2.add(cVar);
        }
        cVar.f14774g = this.f14783c;
        cVar.f14775h = this.f14784d;
        this.f14783c = null;
        this.f14784d = -1;
    }

    public final boolean i(Object obj, Object obj2) {
        return j(obj, obj2) == 0;
    }

    public final int j(Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14780f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof k)) {
                if (Intrinsics.areEqual(obj3, g.f14788b) || (obj3 instanceof c)) {
                    return 3;
                }
                if (Intrinsics.areEqual(obj3, g.f14789c)) {
                    return 2;
                }
                if (Intrinsics.areEqual(obj3, g.f14787a)) {
                    List listC = c0.c(obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, listC)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            break;
                        }
                    }
                    return 1;
                }
                if (!(obj3 instanceof List)) {
                    org.bouncycastle.jce.provider.a.p(obj3, "Unexpected state: ");
                    return 0;
                }
                ArrayList arrayListE0 = CollectionsKt.e0((Collection) obj3, obj);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, arrayListE0)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        break;
                    }
                }
                return 1;
            }
            c cVarF = f(obj);
            if (cVarF != null) {
                n nVar = cVarF.f14773f;
                n nVar2 = nVar != null ? (n) nVar.invoke(this, cVarF.f14771d, obj2) : null;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, cVarF)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        break;
                    }
                }
                k kVar = (k) obj3;
                this.f14785e = obj2;
                v vVarN = kVar.n(Unit.f26487a, nVar2);
                if (vVarN == null) {
                    this.f14785e = g.f14790d;
                    return 2;
                }
                kVar.o(vVarN);
                return 0;
            }
            continue;
        }
    }
}
