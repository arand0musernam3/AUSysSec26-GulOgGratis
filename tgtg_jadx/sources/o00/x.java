package o00;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class x extends s implements Set {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient v f31765b;

    public static int h(int i11) {
        int iMax = Math.max(i11, 2);
        if (iMax < 751619276) {
            int iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
            return iHighestOneBit;
        }
        if (iMax < 1073741824) {
            return 1073741824;
        }
        i4.a.f("collection too large");
        return 0;
    }

    public static x l(int i11, Object... objArr) {
        if (i11 == 0) {
            return f0.f31655i;
        }
        if (i11 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new g0(obj);
        }
        int iH = h(i11);
        Object[] objArr2 = new Object[iH];
        int i12 = iH - 1;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            Object obj2 = objArr[i15];
            if (obj2 == null) {
                c50.w.l(e0.f.h(i15, "at index ", new StringBuilder(String.valueOf(i15).length() + 9)));
                return null;
            }
            int iHashCode = obj2.hashCode();
            int I = o30.e0.I(iHashCode);
            while (true) {
                int i16 = I & i12;
                Object obj3 = objArr2[i16];
                if (obj3 == null) {
                    objArr[i14] = obj2;
                    objArr2[i16] = obj2;
                    i13 += iHashCode;
                    i14++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    I++;
                }
            }
        }
        Arrays.fill(objArr, i14, i11, (Object) null);
        if (i14 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new g0(obj4);
        }
        if (h(i14) < iH / 2) {
            return l(i14, objArr);
        }
        int length = objArr.length;
        if (i14 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i14);
        }
        return new f0(i13, i12, i14, objArr, objArr2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof x) && (this instanceof f0) && (((x) obj) instanceof f0) && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public abstract j00.g g();

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    public final v i() {
        v vVar = this.f31765b;
        if (vVar != null) {
            return vVar;
        }
        v vVarJ = j();
        this.f31765b = vVarJ;
        return vVarJ;
    }

    public v j() {
        Object[] array = toArray(s.f31739a);
        t tVar = v.f31755b;
        int length = array.length;
        return length == 0 ? z.f31782e : new z(array, length);
    }
}
