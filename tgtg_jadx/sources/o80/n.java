package o80;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import m0.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements Iterator, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f32129a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32130b;

    public n(Object obj) {
        this.f32130b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f32129a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f32129a) {
            this.f32129a = false;
            return this.f32130b;
        }
        i1.c();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
