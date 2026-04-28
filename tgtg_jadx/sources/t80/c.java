package t80;

import d40.t1;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f39842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f39843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f39844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f39845e;

    public c(Object[] objArr, Object[] objArr2, int i11, int i12) {
        objArr.getClass();
        objArr2.getClass();
        this.f39842b = objArr;
        this.f39843c = objArr2;
        this.f39844d = i11;
        this.f39845e = i12;
        if (b() > 32) {
            int length = objArr2.length;
            return;
        }
        throw new IllegalArgumentException(("Trie-based persistent vector should have at least 33 elements, got " + b()).toString());
    }

    @Override // kotlin.collections.a
    public final int b() {
        return this.f39844d;
    }

    @Override // kotlin.collections.f, java.util.List
    public final Object get(int i11) {
        Object[] objArr;
        int i12 = this.f39844d;
        t1.t(i11, i12);
        if (((i12 - 1) & (-32)) <= i11) {
            objArr = this.f39843c;
        } else {
            objArr = this.f39842b;
            for (int i13 = this.f39845e; i13 > 0; i13 -= 5) {
                Object obj = objArr[h0.g.v(i11, i13)];
                obj.getClass();
                objArr = (Object[]) obj;
            }
        }
        return objArr[i11 & 31];
    }

    @Override // kotlin.collections.f, java.util.List
    public final ListIterator listIterator(int i11) {
        t1.u(i11, this.f39844d);
        return new e(i11, this.f39844d, (this.f39845e / 5) + 1, this.f39842b, this.f39843c);
    }
}
