package kotlin.collections;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f26512b;

    public i(k kVar) {
        this.f26512b = kVar;
    }

    @Override // kotlin.collections.a
    public final int b() {
        return this.f26512b.d();
    }

    @Override // kotlin.collections.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f26512b.containsKey(obj);
    }

    @Override // kotlin.collections.q, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new h(((r3.j) this.f26512b.a()).iterator(), 0);
    }
}
