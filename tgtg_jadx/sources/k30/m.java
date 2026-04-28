package k30;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class m extends b implements Set {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f25911c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient h f25912b;

    public static int j(int i11) {
        int iMax = Math.max(i11, 2);
        if (iMax < 751619276) {
            int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
            while (((double) iHighestOneBit) * 0.7d < iMax) {
                iHighestOneBit <<= 1;
            }
            return iHighestOneBit;
        }
        if (iMax < 1073741824) {
            return 1073741824;
        }
        i4.a.f("collection too large");
        return 0;
    }

    public static m l(int i11, Object... objArr) {
        if (i11 == 0) {
            return d0.f25887j;
        }
        if (i11 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new f0(obj);
        }
        int iJ = j(i11);
        Object[] objArr2 = new Object[iJ];
        int i12 = iJ - 1;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            Object obj2 = objArr[i15];
            if (obj2 == null) {
                c50.w.l(j4.s.f(i15, "at index "));
                return null;
            }
            int iHashCode = obj2.hashCode();
            int iP = jb.u.P(iHashCode);
            while (true) {
                int i16 = iP & i12;
                Object obj3 = objArr2[i16];
                if (obj3 == null) {
                    objArr[i14] = obj2;
                    objArr2[i16] = obj2;
                    i13 += iHashCode;
                    i14++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iP++;
            }
        }
        Arrays.fill(objArr, i14, i11, (Object) null);
        if (i14 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new f0(obj4);
        }
        if (j(i14) < iJ / 2) {
            return l(i14, objArr);
        }
        int length = objArr.length;
        if (i14 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i14);
        }
        return new d0(i13, i12, i14, objArr, objArr2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // k30.b
    public h b() {
        h hVar = this.f25912b;
        if (hVar != null) {
            return hVar;
        }
        h hVarM = m();
        this.f25912b = hVarM;
        return hVarM;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof m) && (this instanceof d0) && (((m) obj) instanceof d0) && hashCode() != obj.hashCode()) {
            return false;
        }
        if (this != obj) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                try {
                    if (size() == set.size()) {
                        if (containsAll(set)) {
                        }
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return na0.a.q0(this);
    }

    public h m() {
        Object[] array = toArray(b.f25875a);
        d dVar = h.f25901b;
        return h.j(array.length, array);
    }

    @Override // k30.b
    public Object writeReplace() {
        return new l(toArray(b.f25875a));
    }
}
