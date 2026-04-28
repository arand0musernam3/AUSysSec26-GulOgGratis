package o3;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import kotlin.collections.d0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f31830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f31831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f31832c;

    public e(Object[] objArr, int i11) {
        this.f31830a = objArr;
        this.f31832c = i11;
    }

    public final void a(int i11, Object obj) {
        int i12 = this.f31832c + 1;
        if (this.f31830a.length < i12) {
            n(i12);
        }
        Object[] objArr = this.f31830a;
        int i13 = this.f31832c;
        if (i11 != i13) {
            System.arraycopy(objArr, i11, objArr, i11 + 1, i13 - i11);
        }
        objArr[i11] = obj;
        this.f31832c++;
    }

    public final void b(Object obj) {
        int i11 = this.f31832c + 1;
        if (this.f31830a.length < i11) {
            n(i11);
        }
        Object[] objArr = this.f31830a;
        int i12 = this.f31832c;
        objArr[i12] = obj;
        this.f31832c = i12 + 1;
    }

    public final void c(int i11, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i12 = this.f31832c + size;
        if (this.f31830a.length < i12) {
            n(i12);
        }
        Object[] objArr = this.f31830a;
        int i13 = this.f31832c;
        if (i11 != i13) {
            System.arraycopy(objArr, i11, objArr, i11 + size, i13 - i11);
        }
        int size2 = list.size();
        for (int i14 = 0; i14 < size2; i14++) {
            objArr[i11 + i14] = list.get(i14);
        }
        this.f31832c += size;
    }

    public final void d(int i11, e eVar) {
        int i12 = eVar.f31832c;
        if (i12 == 0) {
            return;
        }
        int i13 = this.f31832c + i12;
        if (this.f31830a.length < i13) {
            n(i13);
        }
        Object[] objArr = this.f31830a;
        int i14 = this.f31832c;
        if (i11 != i14) {
            System.arraycopy(objArr, i11, objArr, i11 + i12, i14 - i11);
        }
        System.arraycopy(eVar.f31830a, 0, objArr, i11, i12);
        this.f31832c += i12;
    }

    public final boolean e(int i11, Collection collection) {
        int i12 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i13 = this.f31832c + size;
        if (this.f31830a.length < i13) {
            n(i13);
        }
        Object[] objArr = this.f31830a;
        int i14 = this.f31832c;
        if (i11 != i14) {
            System.arraycopy(objArr, i11, objArr, i11 + size, i14 - i11);
        }
        for (Object obj : collection) {
            int i15 = i12 + 1;
            if (i12 < 0) {
                d0.n();
                throw null;
            }
            objArr[i12 + i11] = obj;
            i12 = i15;
        }
        this.f31832c += size;
        return true;
    }

    public final List f() {
        b bVar = this.f31831b;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this, 0);
        this.f31831b = bVar2;
        return bVar2;
    }

    public final void g() {
        Object[] objArr = this.f31830a;
        int i11 = this.f31832c;
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[i12] = null;
        }
        this.f31832c = 0;
    }

    public final boolean h(Object obj) {
        int i11 = this.f31832c - 1;
        if (i11 >= 0) {
            for (int i12 = 0; !Intrinsics.areEqual(this.f31830a[i12], obj); i12++) {
                if (i12 != i11) {
                }
            }
            return true;
        }
        return false;
    }

    public final int i(Object obj) {
        Object[] objArr = this.f31830a;
        int i11 = this.f31832c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (Intrinsics.areEqual(obj, objArr[i12])) {
                return i12;
            }
        }
        return -1;
    }

    public final boolean j(Object obj) {
        int i11 = i(obj);
        if (i11 < 0) {
            return false;
        }
        l(i11);
        return true;
    }

    public final Object l(int i11) {
        Object[] objArr = this.f31830a;
        Object obj = objArr[i11];
        int i12 = this.f31832c;
        if (i11 != i12 - 1) {
            int i13 = i11 + 1;
            System.arraycopy(objArr, i13, objArr, i11, i12 - i13);
        }
        int i14 = this.f31832c - 1;
        this.f31832c = i14;
        objArr[i14] = null;
        return obj;
    }

    public final void m(int i11, int i12) {
        if (i12 > i11) {
            int i13 = this.f31832c;
            if (i12 < i13) {
                Object[] objArr = this.f31830a;
                System.arraycopy(objArr, i12, objArr, i11, i13 - i12);
            }
            int i14 = this.f31832c;
            int i15 = i14 - (i12 - i11);
            int i16 = i14 - 1;
            if (i15 <= i16) {
                int i17 = i15;
                while (true) {
                    this.f31830a[i17] = null;
                    if (i17 == i16) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            this.f31832c = i15;
        }
    }

    public final void n(int i11) {
        Object[] objArr = this.f31830a;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i11, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.f31830a = objArr2;
    }
}
