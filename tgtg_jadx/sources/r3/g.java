package r3;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Iterator, KMutableIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f37595a;

    public g(d dVar) {
        m[] mVarArr = new m[8];
        for (int i11 = 0; i11 < 8; i11++) {
            mVarArr[i11] = new o(this);
        }
        this.f37595a = new e(dVar, mVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f37595a.f37582c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (Map.Entry) this.f37595a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f37595a.remove();
    }
}
