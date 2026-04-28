package j0;

import e0.e0;
import e0.k1;
import e0.p1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final r80.c f24318i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f24320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f24321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f24322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v70.e f24323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r80.d f24324f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r80.b f24325g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CopyOnWriteArrayList f24326h;

    static {
        r80.c cVar = new r80.c();
        cVar.f37783a = 0L;
        f24318i = cVar;
    }

    public u(k1 k1Var, long j9, long j11, Set set) {
        Object next;
        k1Var.getClass();
        set.getClass();
        this.f24319a = j9;
        this.f24320b = j11;
        r80.c cVar = f24318i;
        cVar.getClass();
        this.f24321c = r80.c.f37782b.incrementAndGet(cVar);
        this.f24322d = new q(this);
        v70.e eVarB = c0.b();
        Iterator it = k1Var.I().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int i11 = ((p1) it.next()).f15397a;
            Iterator it2 = set.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (((e0) next).f15329a == i11) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            e0 e0Var = (e0) next;
            if (e0Var != null) {
                ArrayList arrayList = e0Var.f15330b;
                r80.b bVarQ = w.b.q(arrayList.size());
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    eVarB.add(new r(this, i11, ((i0.e0) arrayList.get(i12)).f22625a, bVarQ));
                }
            }
        }
        v70.e eVarA = c0.a(eVarB);
        this.f24323e = eVarA;
        this.f24324f = w.b.r(s.STARTED);
        ArrayList arrayList2 = new ArrayList(kotlin.collections.e0.o(eVarA, 10));
        ListIterator listIterator = eVarA.listIterator(0);
        while (true) {
            v70.b bVar = (v70.b) listIterator;
            if (!bVar.hasNext()) {
                this.f24325g = w.b.q(CollectionsKt.r0(CollectionsKt.u0(arrayList2)).size());
                this.f24326h = new CopyOnWriteArrayList();
                return;
            }
            arrayList2.add(new p1(((r) bVar.next()).f24314c));
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Frame-");
        sb2.append((Object) ("FrameId(value=" + this.f24321c + ')'));
        sb2.append('(');
        sb2.append(this.f24319a);
        sb2.append('@');
        return w.a0.r(sb2, this.f24320b, ')');
    }
}
