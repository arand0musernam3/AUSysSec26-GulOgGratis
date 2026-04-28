package r3;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m implements Iterator, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f37605a = l.f37600e.f37604d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37607c;

    public final void a(Object[] objArr, int i11, int i12) {
        this.f37605a = objArr;
        this.f37606b = i11;
        this.f37607c = i12;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f37607c < this.f37606b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
