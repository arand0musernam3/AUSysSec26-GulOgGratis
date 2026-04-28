package q3;

import java.util.Arrays;
import java.util.ListIterator;
import kotlin.collections.x;
import m3.s1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f35959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f35960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f35961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f35962e;

    public e(Object[] objArr, Object[] objArr2, int i11, int i12) {
        this.f35959b = objArr;
        this.f35960c = objArr2;
        this.f35961d = i11;
        this.f35962e = i12;
        if (!(b() > 32)) {
            s1.a("Trie-based persistent vector should have at least 33 elements, got " + b());
        }
        int length = objArr2.length;
    }

    public static Object[] m(Object[] objArr, int i11, int i12, Object obj, fd.j jVar) {
        int iH = jf.e.H(i12, i11);
        if (i11 == 0) {
            Object[] objArrCopyOf = iH == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            x.d(iH + 1, iH, 31, objArr, objArrCopyOf);
            jVar.f17568b = objArr[31];
            objArrCopyOf[iH] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i13 = i11 - 5;
        Object obj2 = objArr[iH];
        obj2.getClass();
        objArrCopyOf2[iH] = m((Object[]) obj2, i13, i12, obj, jVar);
        while (true) {
            iH++;
            if (iH >= 32 || objArrCopyOf2[iH] == null) {
                break;
            }
            Object obj3 = objArr[iH];
            obj3.getClass();
            objArrCopyOf2[iH] = m((Object[]) obj3, i13, 0, jVar.f17568b, jVar);
        }
        return objArrCopyOf2;
    }

    public static Object[] o(Object[] objArr, int i11, int i12, fd.j jVar) {
        Object[] objArrO;
        int iH = jf.e.H(i12, i11);
        if (i11 == 5) {
            jVar.f17568b = objArr[iH];
            objArrO = null;
        } else {
            Object obj = objArr[iH];
            obj.getClass();
            objArrO = o((Object[]) obj, i11 - 5, i12, jVar);
        }
        if (objArrO == null && iH == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        objArrCopyOf[iH] = objArrO;
        return objArrCopyOf;
    }

    public static Object[] u(Object[] objArr, int i11, int i12, Object obj) {
        int iH = jf.e.H(i12, i11);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        if (i11 == 0) {
            objArrCopyOf[iH] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iH];
        obj2.getClass();
        objArrCopyOf[iH] = u((Object[]) obj2, i11 - 5, i12, obj);
        return objArrCopyOf;
    }

    @Override // kotlin.collections.a
    public final int b() {
        return this.f35961d;
    }

    @Override // q3.c
    public final c d(int i11, Object obj) {
        int i12 = this.f35961d;
        dx.f.o(i11, i12);
        if (i11 == i12) {
            return e(obj);
        }
        int iT = t();
        Object[] objArr = this.f35959b;
        if (i11 >= iT) {
            return n(i11 - iT, obj, objArr);
        }
        fd.j jVar = new fd.j(null, 2);
        return n(0, jVar.f17568b, m(objArr, this.f35962e, i11, obj, jVar));
    }

    @Override // q3.c
    public final c e(Object obj) {
        int iT = t();
        int i11 = this.f35961d;
        int i12 = i11 - iT;
        Object[] objArr = this.f35959b;
        Object[] objArr2 = this.f35960c;
        if (i12 < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            objArrCopyOf[i12] = obj;
            return new e(objArr, objArrCopyOf, i11 + 1, this.f35962e);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return p(objArr, objArr2, objArr3);
    }

    @Override // kotlin.collections.f, java.util.List
    public final Object get(int i11) {
        Object[] objArr;
        dx.f.n(i11, b());
        if (t() <= i11) {
            objArr = this.f35960c;
        } else {
            objArr = this.f35959b;
            for (int i12 = this.f35962e; i12 > 0; i12 -= 5) {
                Object obj = objArr[jf.e.H(i11, i12)];
                obj.getClass();
                objArr = (Object[]) obj;
            }
        }
        return objArr[i11 & 31];
    }

    @Override // q3.c
    public final f h() {
        return new f(this, this.f35959b, this.f35960c, this.f35962e);
    }

    @Override // q3.c
    public final c i(b bVar) {
        f fVar = new f(this, this.f35959b, this.f35960c, this.f35962e);
        fVar.C(bVar);
        return fVar.e();
    }

    @Override // q3.c
    public final c j(int i11) {
        dx.f.n(i11, b());
        int iT = t();
        int i12 = this.f35962e;
        Object[] objArr = this.f35959b;
        return i11 >= iT ? s(objArr, iT, i12, i11 - iT) : s(r(objArr, i12, i11, new fd.j(this.f35960c[0], 2)), iT, i12, 0);
    }

    @Override // q3.c
    public final c l(int i11, Object obj) {
        int i12 = this.f35961d;
        dx.f.n(i11, i12);
        int iT = t();
        Object[] objArr = this.f35959b;
        Object[] objArr2 = this.f35960c;
        int i13 = this.f35962e;
        if (iT > i11) {
            return new e(u(objArr, i13, i11, obj), objArr2, i12, i13);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        objArrCopyOf[i11 & 31] = obj;
        return new e(objArr, objArrCopyOf, i12, i13);
    }

    @Override // kotlin.collections.f, java.util.List
    public final ListIterator listIterator(int i11) {
        dx.f.o(i11, this.f35961d);
        return new g(i11, this.f35961d, (this.f35962e / 5) + 1, this.f35959b, this.f35960c);
    }

    public final e n(int i11, Object obj, Object[] objArr) {
        int iT = t();
        int i12 = this.f35961d;
        int i13 = i12 - iT;
        Object[] objArr2 = this.f35960c;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        if (i13 < 32) {
            x.d(i11 + 1, i11, i13, objArr2, objArrCopyOf);
            objArrCopyOf[i11] = obj;
            return new e(objArr, objArrCopyOf, i12 + 1, this.f35962e);
        }
        Object obj2 = objArr2[31];
        x.d(i11 + 1, i11, i13 - 1, objArr2, objArrCopyOf);
        objArrCopyOf[i11] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return p(objArr, objArrCopyOf, objArr3);
    }

    public final e p(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i11 = this.f35961d;
        int i12 = i11 >> 5;
        int i13 = this.f35962e;
        if (i12 <= (1 << i13)) {
            return new e(q(i13, objArr, objArr2), objArr3, i11 + 1, i13);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i14 = i13 + 5;
        return new e(q(i14, objArr4, objArr2), objArr3, i11 + 1, i14);
    }

    public final Object[] q(int i11, Object[] objArr, Object[] objArr2) {
        int iH = jf.e.H(b() - 1, i11);
        Object[] objArrCopyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i11 == 5) {
            objArrCopyOf[iH] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iH] = q(i11 - 5, (Object[]) objArrCopyOf[iH], objArr2);
        return objArrCopyOf;
    }

    public final Object[] r(Object[] objArr, int i11, int i12, fd.j jVar) {
        int iH = jf.e.H(i12, i11);
        if (i11 == 0) {
            Object[] objArrCopyOf = iH == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            x.d(iH, iH + 1, 32, objArr, objArrCopyOf);
            objArrCopyOf[31] = jVar.f17568b;
            jVar.f17568b = objArr[iH];
            return objArrCopyOf;
        }
        int iH2 = objArr[31] == null ? jf.e.H(t() - 1, i11) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i13 = i11 - 5;
        int i14 = iH + 1;
        if (i14 <= iH2) {
            while (true) {
                Object obj = objArrCopyOf2[iH2];
                obj.getClass();
                objArrCopyOf2[iH2] = r((Object[]) obj, i13, 0, jVar);
                if (iH2 == i14) {
                    break;
                }
                iH2--;
            }
        }
        Object obj2 = objArrCopyOf2[iH];
        obj2.getClass();
        objArrCopyOf2[iH] = r((Object[]) obj2, i13, i12, jVar);
        return objArrCopyOf2;
    }

    public final c s(Object[] objArr, int i11, int i12, int i13) {
        int i14 = this.f35961d - i11;
        if (i14 != 1) {
            Object[] objArr2 = this.f35960c;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            int i15 = i14 - 1;
            if (i13 < i15) {
                x.d(i13, i13 + 1, i14, objArr2, objArrCopyOf);
            }
            objArrCopyOf[i15] = null;
            return new e(objArr, objArrCopyOf, (i11 + i14) - 1, i12);
        }
        if (i12 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new i(objArr);
        }
        fd.j jVar = new fd.j(null, 2);
        Object[] objArrO = o(objArr, i12, i11 - 1, jVar);
        objArrO.getClass();
        Object obj = jVar.f17568b;
        obj.getClass();
        Object[] objArr3 = (Object[]) obj;
        if (objArrO[1] != null) {
            return new e(objArrO, objArr3, i11, i12);
        }
        Object obj2 = objArrO[0];
        obj2.getClass();
        return new e((Object[]) obj2, objArr3, i11, i12 - 5);
    }

    public final int t() {
        return (this.f35961d - 1) & (-32);
    }
}
