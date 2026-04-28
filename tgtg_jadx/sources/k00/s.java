package k00;

import m0.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class s extends b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f25688b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f25689a;

    public s(Object obj) {
        this.f25689a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f25689a != f25688b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.f25689a;
        Object obj2 = f25688b;
        if (obj != obj2) {
            this.f25689a = obj2;
            return obj;
        }
        i1.c();
        return null;
    }
}
