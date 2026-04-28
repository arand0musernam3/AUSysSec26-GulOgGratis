package k00;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a0 extends n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object f25622d;

    public a0(Object obj) {
        this.f25622d = obj;
    }

    @Override // k00.h
    public final int b(Object[] objArr) {
        objArr[0] = this.f25622d;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f25622d.equals(obj);
    }

    @Override // k00.h
    public final b0 e() {
        return new s(this.f25622d);
    }

    @Override // k00.n, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f25622d.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new s(this.f25622d);
    }

    @Override // k00.n
    public final l j() {
        Object[] objArr = {this.f25622d};
        for (int i11 = 0; i11 < 1; i11++) {
            i iVar = l.f25666b;
            if (objArr[i11] == null) {
                c50.w.l(j4.s.f(i11, "at index "));
                return null;
            }
        }
        return l.j(1, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return w.a0.p("[", this.f25622d.toString(), "]");
    }
}
