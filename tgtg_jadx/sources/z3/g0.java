package z3;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements Iterator, KMutableIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f47005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f47006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f47007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f47008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f47009e;

    public g0(y yVar, Iterator it) {
        this.f47005a = yVar;
        this.f47006b = it;
        h0 h0Var = yVar.f47086a;
        h0Var.getClass();
        this.f47009e = ((h0) l.h(h0Var)).f47012d;
        this.f47007c = this.f47008d;
        this.f47008d = it.hasNext() ? it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f47008d != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        h0 h0Var = this.f47005a.f47086a;
        h0Var.getClass();
        if (((h0) l.h(h0Var)).f47012d != this.f47009e) {
            org.bouncycastle.jce.provider.a.o();
            return null;
        }
        this.f47007c = this.f47008d;
        Iterator it = this.f47006b;
        this.f47008d = it.hasNext() ? it.next() : null;
        Object obj = this.f47007c;
        if (obj != null) {
            return obj;
        }
        qc.y.e();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        y yVar = this.f47005a;
        h0 h0Var = yVar.f47086a;
        h0Var.getClass();
        if (((h0) l.h(h0Var)).f47012d != this.f47009e) {
            org.bouncycastle.jce.provider.a.o();
            return;
        }
        Object obj = this.f47007c;
        if (obj == null) {
            qc.y.e();
            return;
        }
        yVar.remove(obj);
        this.f47007c = null;
        h0 h0Var2 = yVar.f47086a;
        h0Var2.getClass();
        this.f47009e = ((h0) l.h(h0Var2)).f47012d;
    }
}
