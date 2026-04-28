package o00;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g0 extends x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object f31662c;

    public g0(Object obj) {
        this.f31662c = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f31662c.equals(obj);
    }

    @Override // o00.s
    public final int e(Object[] objArr) {
        objArr[0] = this.f31662c;
        return 1;
    }

    @Override // o00.x
    public final j00.g g() {
        return new y(this.f31662c);
    }

    @Override // o00.x, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f31662c.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new y(this.f31662c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String string = this.f31662c.toString();
        return e0.f.n(new StringBuilder(String.valueOf(string).length() + 2), "[", string, "]");
    }
}
