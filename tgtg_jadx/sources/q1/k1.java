package q1;

import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f35780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f35781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f35782c;

    public k1(int i11) {
        this.f35780a = i11 == 0 ? r1.a.f37527a : new int[i11];
        this.f35781b = i11 == 0 ? r1.a.f37529c : new Object[i11 << 1];
    }

    public final int a(Object obj) {
        int i11 = this.f35782c * 2;
        Object[] objArr = this.f35781b;
        if (obj == null) {
            for (int i12 = 1; i12 < i11; i12 += 2) {
                if (objArr[i12] == null) {
                    return i12 >> 1;
                }
            }
            return -1;
        }
        for (int i13 = 1; i13 < i11; i13 += 2) {
            if (Intrinsics.areEqual(obj, objArr[i13])) {
                return i13 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i11) {
        int i12 = this.f35782c;
        int[] iArr = this.f35780a;
        if (iArr.length < i11) {
            this.f35780a = Arrays.copyOf(iArr, i11);
            this.f35781b = Arrays.copyOf(this.f35781b, i11 * 2);
        }
        if (this.f35782c == i12) {
            return;
        }
        org.bouncycastle.jce.provider.a.o();
    }

    public final void clear() {
        if (this.f35782c > 0) {
            this.f35780a = r1.a.f37527a;
            this.f35781b = r1.a.f37529c;
            this.f35782c = 0;
        }
        if (this.f35782c <= 0) {
            return;
        }
        org.bouncycastle.jce.provider.a.o();
    }

    public boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d(int i11, Object obj) {
        int i12 = this.f35782c;
        if (i12 == 0) {
            return -1;
        }
        int iA = r1.a.a(i12, i11, this.f35780a);
        if (iA < 0 || Intrinsics.areEqual(obj, this.f35781b[iA << 1])) {
            return iA;
        }
        int i13 = iA + 1;
        while (i13 < i12 && this.f35780a[i13] == i11) {
            if (Intrinsics.areEqual(obj, this.f35781b[i13 << 1])) {
                return i13;
            }
            i13++;
        }
        for (int i14 = iA - 1; i14 >= 0 && this.f35780a[i14] == i11; i14--) {
            if (Intrinsics.areEqual(obj, this.f35781b[i14 << 1])) {
                return i14;
            }
        }
        return ~i13;
    }

    public final int e(Object obj) {
        return obj == null ? f() : d(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof k1) {
                int i11 = this.f35782c;
                if (i11 != ((k1) obj).f35782c) {
                    return false;
                }
                k1 k1Var = (k1) obj;
                for (int i12 = 0; i12 < i11; i12++) {
                    Object objG = g(i12);
                    Object objJ = j(i12);
                    Object obj2 = k1Var.get(objG);
                    if (objJ == null) {
                        if (obj2 != null || !k1Var.containsKey(objG)) {
                            return false;
                        }
                    } else if (!Intrinsics.areEqual(objJ, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f35782c != ((Map) obj).size()) {
                return false;
            }
            int i13 = this.f35782c;
            for (int i14 = 0; i14 < i13; i14++) {
                Object objG2 = g(i14);
                Object objJ2 = j(i14);
                Object obj3 = ((Map) obj).get(objG2);
                if (objJ2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objG2)) {
                        return false;
                    }
                } else if (!Intrinsics.areEqual(objJ2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final int f() {
        int i11 = this.f35782c;
        if (i11 == 0) {
            return -1;
        }
        int iA = r1.a.a(i11, 0, this.f35780a);
        if (iA < 0 || this.f35781b[iA << 1] == null) {
            return iA;
        }
        int i12 = iA + 1;
        while (i12 < i11 && this.f35780a[i12] == 0) {
            if (this.f35781b[i12 << 1] == null) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iA - 1; i13 >= 0 && this.f35780a[i13] == 0; i13--) {
            if (this.f35781b[i13 << 1] == null) {
                return i13;
            }
        }
        return ~i12;
    }

    public final Object g(int i11) {
        boolean z11 = false;
        if (i11 >= 0 && i11 < this.f35782c) {
            z11 = true;
        }
        if (z11) {
            return this.f35781b[i11 << 1];
        }
        i4.a.f(j4.s.f(i11, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public Object get(Object obj) {
        int iE = e(obj);
        if (iE >= 0) {
            return this.f35781b[(iE << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iE = e(obj);
        return iE >= 0 ? this.f35781b[(iE << 1) + 1] : obj2;
    }

    public final Object h(int i11) {
        int i12;
        if (i11 < 0 || i11 >= (i12 = this.f35782c)) {
            i4.a.f(j4.s.f(i11, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        Object[] objArr = this.f35781b;
        int i13 = i11 << 1;
        Object obj = objArr[i13 + 1];
        if (i12 <= 1) {
            clear();
            return obj;
        }
        int i14 = i12 - 1;
        int[] iArr = this.f35780a;
        if (iArr.length <= 8 || i12 >= iArr.length / 3) {
            if (i11 < i14) {
                int i15 = i11 + 1;
                kotlin.collections.x.f(i11, iArr, i15, i12, iArr);
                Object[] objArr2 = this.f35781b;
                kotlin.collections.x.d(i13, i15 << 1, i12 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f35781b;
            int i16 = i14 << 1;
            objArr3[i16] = null;
            objArr3[i16 + 1] = null;
        } else {
            int i17 = i12 > 8 ? i12 + (i12 >> 1) : 8;
            this.f35780a = Arrays.copyOf(iArr, i17);
            this.f35781b = Arrays.copyOf(this.f35781b, i17 << 1);
            if (i12 != this.f35782c) {
                org.bouncycastle.jce.provider.a.o();
                return null;
            }
            if (i11 > 0) {
                kotlin.collections.x.f(0, iArr, 0, i11, this.f35780a);
                kotlin.collections.x.d(0, 0, i13, objArr, this.f35781b);
            }
            if (i11 < i14) {
                int i18 = i11 + 1;
                kotlin.collections.x.f(i11, iArr, i18, i12, this.f35780a);
                kotlin.collections.x.d(i13, i18 << 1, i12 << 1, objArr, this.f35781b);
            }
        }
        if (i12 == this.f35782c) {
            this.f35782c = i14;
            return obj;
        }
        org.bouncycastle.jce.provider.a.o();
        return null;
    }

    public final int hashCode() {
        int[] iArr = this.f35780a;
        Object[] objArr = this.f35781b;
        int i11 = this.f35782c;
        int i12 = 1;
        int i13 = 0;
        int iHashCode = 0;
        while (i13 < i11) {
            Object obj = objArr[i12];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i13];
            i13++;
            i12 += 2;
        }
        return iHashCode;
    }

    public final Object i(int i11, Object obj) {
        boolean z11 = false;
        if (i11 >= 0 && i11 < this.f35782c) {
            z11 = true;
        }
        if (!z11) {
            i4.a.f(j4.s.f(i11, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        int i12 = (i11 << 1) + 1;
        Object[] objArr = this.f35781b;
        Object obj2 = objArr[i12];
        objArr[i12] = obj;
        return obj2;
    }

    public final boolean isEmpty() {
        return this.f35782c <= 0;
    }

    public final Object j(int i11) {
        boolean z11 = false;
        if (i11 >= 0 && i11 < this.f35782c) {
            z11 = true;
        }
        if (z11) {
            return this.f35781b[(i11 << 1) + 1];
        }
        i4.a.f(j4.s.f(i11, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public final Object put(Object obj, Object obj2) {
        int i11 = this.f35782c;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iD = obj != null ? d(iHashCode, obj) : f();
        if (iD >= 0) {
            int i12 = (iD << 1) + 1;
            Object[] objArr = this.f35781b;
            Object obj3 = objArr[i12];
            objArr[i12] = obj2;
            return obj3;
        }
        int i13 = ~iD;
        int[] iArr = this.f35780a;
        if (i11 >= iArr.length) {
            int i14 = 8;
            if (i11 >= 8) {
                i14 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i14 = 4;
            }
            this.f35780a = Arrays.copyOf(iArr, i14);
            this.f35781b = Arrays.copyOf(this.f35781b, i14 << 1);
            if (i11 != this.f35782c) {
                org.bouncycastle.jce.provider.a.o();
                return null;
            }
        }
        if (i13 < i11) {
            int[] iArr2 = this.f35780a;
            int i15 = i13 + 1;
            kotlin.collections.x.f(i15, iArr2, i13, i11, iArr2);
            Object[] objArr2 = this.f35781b;
            kotlin.collections.x.d(i15 << 1, i13 << 1, this.f35782c << 1, objArr2, objArr2);
        }
        int i16 = this.f35782c;
        if (i11 == i16) {
            int[] iArr3 = this.f35780a;
            if (i13 < iArr3.length) {
                iArr3[i13] = iHashCode;
                Object[] objArr3 = this.f35781b;
                int i17 = i13 << 1;
                objArr3[i17] = obj;
                objArr3[i17 + 1] = obj2;
                this.f35782c = i16 + 1;
                return null;
            }
        }
        org.bouncycastle.jce.provider.a.o();
        return null;
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iE = e(obj);
        if (iE < 0 || !Intrinsics.areEqual(obj2, j(iE))) {
            return false;
        }
        h(iE);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iE = e(obj);
        if (iE < 0 || !Intrinsics.areEqual(obj2, j(iE))) {
            return false;
        }
        i(iE, obj3);
        return true;
    }

    public final int size() {
        return this.f35782c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f35782c * 28);
        sb2.append('{');
        int i11 = this.f35782c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            Object objG = g(i12);
            if (objG != sb2) {
                sb2.append(objG);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object objJ = j(i12);
            if (objJ != sb2) {
                sb2.append(objJ);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public Object remove(Object obj) {
        int iE = e(obj);
        if (iE >= 0) {
            return h(iE);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iE = e(obj);
        if (iE >= 0) {
            return i(iE, obj2);
        }
        return null;
    }
}
