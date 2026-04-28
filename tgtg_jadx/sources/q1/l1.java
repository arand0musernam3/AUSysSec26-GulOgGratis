package q1;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f35785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ int[] f35786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f35787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f35788d;

    public l1(int i11) {
        int i12;
        int i13 = 4;
        while (true) {
            i12 = 40;
            if (i13 >= 32) {
                break;
            }
            int i14 = (1 << i13) - 12;
            if (40 <= i14) {
                i12 = i14;
                break;
            }
            i13++;
        }
        int i15 = i12 / 4;
        this.f35786b = new int[i15];
        this.f35787c = new Object[i15];
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final l1 clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        l1 l1Var = (l1) objClone;
        l1Var.f35786b = (int[]) this.f35786b.clone();
        l1Var.f35787c = (Object[]) this.f35787c.clone();
        return l1Var;
    }

    public final Object b(int i11) {
        Object obj;
        int iA = r1.a.a(this.f35788d, i11, this.f35786b);
        if (iA < 0 || (obj = this.f35787c[iA]) == a0.f35712c) {
            return null;
        }
        return obj;
    }

    public final int c(int i11) {
        if (this.f35785a) {
            a0.a(this);
        }
        return this.f35786b[i11];
    }

    public final void d(int i11, Object obj) {
        int iA = r1.a.a(this.f35788d, i11, this.f35786b);
        if (iA >= 0) {
            this.f35787c[iA] = obj;
            return;
        }
        int i12 = ~iA;
        int i13 = this.f35788d;
        if (i12 < i13) {
            Object[] objArr = this.f35787c;
            if (objArr[i12] == a0.f35712c) {
                this.f35786b[i12] = i11;
                objArr[i12] = obj;
                return;
            }
        }
        if (this.f35785a && i13 >= this.f35786b.length) {
            a0.a(this);
            i12 = ~r1.a.a(this.f35788d, i11, this.f35786b);
        }
        int i14 = this.f35788d;
        if (i14 >= this.f35786b.length) {
            int i15 = (i14 + 1) * 4;
            int i16 = 4;
            while (true) {
                if (i16 >= 32) {
                    break;
                }
                int i17 = (1 << i16) - 12;
                if (i15 <= i17) {
                    i15 = i17;
                    break;
                }
                i16++;
            }
            int i18 = i15 / 4;
            this.f35786b = Arrays.copyOf(this.f35786b, i18);
            this.f35787c = Arrays.copyOf(this.f35787c, i18);
        }
        int i19 = this.f35788d;
        if (i19 - i12 != 0) {
            int[] iArr = this.f35786b;
            int i21 = i12 + 1;
            kotlin.collections.x.f(i21, iArr, i12, i19, iArr);
            Object[] objArr2 = this.f35787c;
            kotlin.collections.x.d(i21, i12, this.f35788d, objArr2, objArr2);
        }
        this.f35786b[i12] = i11;
        this.f35787c[i12] = obj;
        this.f35788d++;
    }

    public final int f() {
        if (this.f35785a) {
            a0.a(this);
        }
        return this.f35788d;
    }

    public final Object h(int i11) {
        if (this.f35785a) {
            a0.a(this);
        }
        Object[] objArr = this.f35787c;
        if (i11 < objArr.length) {
            return objArr[i11];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        if (f() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f35788d * 28);
        sb2.append('{');
        int i11 = this.f35788d;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            sb2.append(c(i12));
            sb2.append('=');
            Object objH = h(i12);
            if (objH != this) {
                sb2.append(objH);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
