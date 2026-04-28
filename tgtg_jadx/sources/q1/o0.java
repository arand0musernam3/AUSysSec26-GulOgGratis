package q1;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends b1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o3.b f35803c;

    public o0(int i11) {
        this.f35721a = i11 == 0 ? c1.f35730a : new Object[i11];
    }

    public final void g(Object obj) {
        int i11 = this.f35722b + 1;
        Object[] objArr = this.f35721a;
        if (objArr.length < i11) {
            n(i11, objArr);
        }
        Object[] objArr2 = this.f35721a;
        int i12 = this.f35722b;
        objArr2[i12] = obj;
        this.f35722b = i12 + 1;
    }

    public final void h(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i11 = this.f35722b;
        int size = list.size() + i11;
        Object[] objArr = this.f35721a;
        if (objArr.length < size) {
            n(size, objArr);
        }
        Object[] objArr2 = this.f35721a;
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            objArr2[i12 + i11] = list.get(i12);
        }
        this.f35722b = list.size() + this.f35722b;
    }

    public final void i(b1 b1Var) {
        b1Var.getClass();
        if (b1Var.d()) {
            return;
        }
        int i11 = this.f35722b + b1Var.f35722b;
        Object[] objArr = this.f35721a;
        if (objArr.length < i11) {
            n(i11, objArr);
        }
        kotlin.collections.x.d(this.f35722b, 0, b1Var.f35722b, b1Var.f35721a, this.f35721a);
        this.f35722b += b1Var.f35722b;
    }

    public final void j() {
        kotlin.collections.x.m(this.f35721a, 0, this.f35722b, null);
        this.f35722b = 0;
    }

    public final boolean k(Object obj) {
        int iC = c(obj);
        if (iC < 0) {
            return false;
        }
        l(iC);
        return true;
    }

    public final Object l(int i11) {
        int i12;
        if (i11 < 0 || i11 >= (i12 = this.f35722b)) {
            f(i11);
            throw null;
        }
        Object[] objArr = this.f35721a;
        Object obj = objArr[i11];
        if (i11 != i12 - 1) {
            kotlin.collections.x.d(i11, i11 + 1, i12, objArr, objArr);
        }
        int i13 = this.f35722b - 1;
        this.f35722b = i13;
        objArr[i13] = null;
        return obj;
    }

    public final void m(int i11, int i12) {
        int i13;
        if (i11 < 0 || i11 > (i13 = this.f35722b) || i12 < 0 || i12 > i13) {
            org.bouncycastle.jce.provider.a.e(this.f35722b, r8.k.r(i11, i12, "Start (", ") and end (", ") must be in 0.."));
            return;
        }
        if (i12 < i11) {
            throw new IllegalArgumentException("Start (" + i11 + ") is more than end (" + i12 + ')');
        }
        if (i12 != i11) {
            if (i12 < i13) {
                Object[] objArr = this.f35721a;
                kotlin.collections.x.d(i11, i12, i13, objArr, objArr);
            }
            int i14 = this.f35722b;
            int i15 = i14 - (i12 - i11);
            kotlin.collections.x.m(this.f35721a, i15, i14, null);
            this.f35722b = i15;
        }
    }

    public final void n(int i11, Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i11, (length * 3) / 2)];
        kotlin.collections.x.d(0, 0, length, objArr, objArr2);
        this.f35721a = objArr2;
    }

    public final void o(int i11) {
        StringBuilder sbK = org.bouncycastle.jcajce.provider.asymmetric.a.k(i11, "Index ", " must be in 0..");
        sbK.append(this.f35722b);
        throw new IndexOutOfBoundsException(sbK.toString());
    }

    public /* synthetic */ o0() {
        this(16);
    }
}
