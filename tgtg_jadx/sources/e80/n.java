package e80;

import c5.l3;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import m0.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements Iterator, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l3 f15871c;

    public n(l3 l3Var) {
        this.f15871c = l3Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        if (this.f15869a == null && !this.f15870b) {
            String line = ((BufferedReader) this.f15871c.f7286b).readLine();
            this.f15869a = line;
            if (line == null) {
                this.f15870b = true;
            }
        }
        return this.f15869a != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            i1.c();
            return null;
        }
        String str = this.f15869a;
        this.f15869a = null;
        str.getClass();
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
