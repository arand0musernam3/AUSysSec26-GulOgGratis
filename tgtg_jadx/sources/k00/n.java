package k00;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class n extends h implements Set {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f25670c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient l f25671b;

    public static n h(int i11, Object... objArr) {
        if (i11 == 0) {
            return x.f25704j;
        }
        if (i11 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new a0(obj);
        }
        int i12 = i(i11);
        Object[] objArr2 = new Object[i12];
        int i13 = i12 - 1;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < i11; i16++) {
            Object obj2 = objArr[i16];
            if (obj2 == null) {
                c50.w.l(j4.s.f(i16, "at index "));
                return null;
            }
            int iHashCode = obj2.hashCode();
            int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) iHashCode) * (-862048943)), 15)) * 461845907);
            while (true) {
                int i17 = iRotateLeft & i13;
                Object obj3 = objArr2[i17];
                if (obj3 == null) {
                    objArr[i15] = obj2;
                    objArr2[i17] = obj2;
                    i14 += iHashCode;
                    i15++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    iRotateLeft++;
                }
            }
        }
        Arrays.fill(objArr, i15, i11, (Object) null);
        if (i15 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new a0(obj4);
        }
        if (i(i15) < i12 / 2) {
            return h(i15, objArr);
        }
        if (i15 <= 0) {
            objArr = Arrays.copyOf(objArr, i15);
        }
        return new x(i14, i13, i15, objArr, objArr2);
    }

    public static int i(int i11) {
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

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof n) && (this instanceof x) && (((n) obj) instanceof x) && ((x) this).f25706e != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            if (size() == set.size()) {
                return containsAll(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return a.b(this);
    }

    public l j() {
        l lVar = this.f25671b;
        if (lVar != null) {
            return lVar;
        }
        l lVarL = l();
        this.f25671b = lVarL;
        return lVarL;
    }

    public l l() {
        Object[] array = toArray(h.f25645a);
        i iVar = l.f25666b;
        return l.j(array.length, array);
    }
}
