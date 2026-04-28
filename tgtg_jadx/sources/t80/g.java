package t80;

import d40.t1;
import java.util.ListIterator;
import kotlin.collections.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f39858c = new g(new Object[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f39859b;

    public g(Object[] objArr) {
        this.f39859b = objArr;
    }

    @Override // kotlin.collections.a
    public final int b() {
        return this.f39859b.length;
    }

    public final d d() {
        return new d(this, null, this.f39859b, 0);
    }

    @Override // kotlin.collections.f, java.util.List
    public final Object get(int i11) {
        Object[] objArr = this.f39859b;
        t1.t(i11, objArr.length);
        return objArr[i11];
    }

    @Override // kotlin.collections.f, java.util.List
    public final int indexOf(Object obj) {
        return y.E(this.f39859b, obj);
    }

    @Override // kotlin.collections.f, java.util.List
    public final int lastIndexOf(Object obj) {
        return y.J(this.f39859b, obj);
    }

    @Override // kotlin.collections.f, java.util.List
    public final ListIterator listIterator(int i11) {
        Object[] objArr = this.f39859b;
        t1.u(i11, objArr.length);
        return new b(objArr, i11, objArr.length);
    }
}
