package o00;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c0 extends x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient e0 f31632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient d0 f31633d;

    public c0(e0 e0Var, d0 d0Var) {
        this.f31632c = e0Var;
        this.f31633d = d0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f31632c.get(obj) != null;
    }

    @Override // o00.s
    public final int e(Object[] objArr) {
        return this.f31633d.e(objArr);
    }

    @Override // o00.x
    public final j00.g g() {
        return this.f31633d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f31633d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f31632c.f31651f;
    }
}
