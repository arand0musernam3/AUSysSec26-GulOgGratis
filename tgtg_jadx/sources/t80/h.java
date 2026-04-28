package t80;

import m0.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends q3.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f39860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object[] f39861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f39862f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public h(Object[] objArr, int i11, int i12, int i13) {
        super(i11, i12, 1);
        objArr.getClass();
        this.f39860d = i13;
        Object[] objArr2 = new Object[i13];
        this.f39861e = objArr2;
        ?? r52 = i11 == i12 ? 1 : 0;
        this.f39862f = r52;
        objArr2[0] = objArr;
        b(i11 - r52, 1);
    }

    public final Object a() {
        int i11 = this.f35953b & 31;
        Object obj = this.f39861e[this.f39860d - 1];
        obj.getClass();
        return ((Object[]) obj)[i11];
    }

    public final void b(int i11, int i12) {
        int i13 = (this.f39860d - i12) * 5;
        while (i12 < this.f39860d) {
            Object[] objArr = this.f39861e;
            Object obj = objArr[i12 - 1];
            obj.getClass();
            objArr[i12] = ((Object[]) obj)[h0.g.v(i11, i13)];
            i13 -= 5;
            i12++;
        }
    }

    public final void d(int i11) {
        int i12 = 0;
        while (h0.g.v(this.f35953b, i12) == i11) {
            i12 += 5;
        }
        if (i12 > 0) {
            b(this.f35953b, ((this.f39860d - 1) - (i12 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            i1.c();
            return null;
        }
        Object objA = a();
        int i11 = this.f35953b + 1;
        this.f35953b = i11;
        if (i11 == this.f35954c) {
            this.f39862f = true;
            return objA;
        }
        d(0);
        return objA;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            i1.c();
            return null;
        }
        this.f35953b--;
        if (this.f39862f) {
            this.f39862f = false;
            return a();
        }
        d(31);
        return a();
    }
}
