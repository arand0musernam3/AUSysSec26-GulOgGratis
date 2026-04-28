package q1;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f35864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ long[] f35865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f35866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f35867d;

    public z(int i11) {
        if (i11 == 0) {
            this.f35865b = r1.a.f37528b;
            this.f35866c = r1.a.f37529c;
            return;
        }
        int i12 = i11 * 8;
        int i13 = 4;
        while (true) {
            if (i13 >= 32) {
                break;
            }
            int i14 = (1 << i13) - 12;
            if (i12 <= i14) {
                i12 = i14;
                break;
            }
            i13++;
        }
        int i15 = i12 / 8;
        this.f35865b = new long[i15];
        this.f35866c = new Object[i15];
    }

    public final void a() {
        int i11 = this.f35867d;
        Object[] objArr = this.f35866c;
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[i12] = null;
        }
        this.f35867d = 0;
        this.f35864a = false;
    }

    public final Object b(long j9) {
        Object obj;
        int iB = r1.a.b(this.f35865b, this.f35867d, j9);
        if (iB < 0 || (obj = this.f35866c[iB]) == a0.f35710a) {
            return null;
        }
        return obj;
    }

    public final int c(long j9) {
        if (this.f35864a) {
            int i11 = this.f35867d;
            long[] jArr = this.f35865b;
            Object[] objArr = this.f35866c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != a0.f35710a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f35864a = false;
            this.f35867d = i12;
        }
        return r1.a.b(this.f35865b, this.f35867d, j9);
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        z zVar = (z) objClone;
        zVar.f35865b = (long[]) this.f35865b.clone();
        zVar.f35866c = (Object[]) this.f35866c.clone();
        return zVar;
    }

    public final boolean d() {
        return j() == 0;
    }

    public final long f(int i11) {
        int i12;
        if (i11 < 0 || i11 >= (i12 = this.f35867d)) {
            i4.a.f(j4.s.f(i11, "Expected index to be within 0..size()-1, but was "));
            return 0L;
        }
        if (this.f35864a) {
            long[] jArr = this.f35865b;
            Object[] objArr = this.f35866c;
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                Object obj = objArr[i14];
                if (obj != a0.f35710a) {
                    if (i14 != i13) {
                        jArr[i13] = jArr[i14];
                        objArr[i13] = obj;
                        objArr[i14] = null;
                    }
                    i13++;
                }
            }
            this.f35864a = false;
            this.f35867d = i13;
        }
        return this.f35865b[i11];
    }

    public final void h(long j9, Object obj) {
        Object obj2 = a0.f35710a;
        int iB = r1.a.b(this.f35865b, this.f35867d, j9);
        if (iB >= 0) {
            this.f35866c[iB] = obj;
            return;
        }
        int i11 = ~iB;
        int i12 = this.f35867d;
        if (i11 < i12) {
            Object[] objArr = this.f35866c;
            if (objArr[i11] == obj2) {
                this.f35865b[i11] = j9;
                objArr[i11] = obj;
                return;
            }
        }
        if (this.f35864a) {
            long[] jArr = this.f35865b;
            if (i12 >= jArr.length) {
                Object[] objArr2 = this.f35866c;
                int i13 = 0;
                for (int i14 = 0; i14 < i12; i14++) {
                    Object obj3 = objArr2[i14];
                    if (obj3 != obj2) {
                        if (i14 != i13) {
                            jArr[i13] = jArr[i14];
                            objArr2[i13] = obj3;
                            objArr2[i14] = null;
                        }
                        i13++;
                    }
                }
                this.f35864a = false;
                this.f35867d = i13;
                i11 = ~r1.a.b(this.f35865b, i13, j9);
            }
        }
        int i15 = this.f35867d;
        if (i15 >= this.f35865b.length) {
            int i16 = (i15 + 1) * 8;
            int i17 = 4;
            while (true) {
                if (i17 >= 32) {
                    break;
                }
                int i18 = (1 << i17) - 12;
                if (i16 <= i18) {
                    i16 = i18;
                    break;
                }
                i17++;
            }
            int i19 = i16 / 8;
            this.f35865b = Arrays.copyOf(this.f35865b, i19);
            this.f35866c = Arrays.copyOf(this.f35866c, i19);
        }
        int i21 = this.f35867d;
        if (i21 - i11 != 0) {
            long[] jArr2 = this.f35865b;
            int i22 = i11 + 1;
            kotlin.collections.x.g(i22, jArr2, i11, jArr2, i21);
            Object[] objArr3 = this.f35866c;
            kotlin.collections.x.d(i22, i11, this.f35867d, objArr3, objArr3);
        }
        this.f35865b[i11] = j9;
        this.f35866c[i11] = obj;
        this.f35867d++;
    }

    public final void i(long j9) {
        int iB = r1.a.b(this.f35865b, this.f35867d, j9);
        if (iB >= 0) {
            Object[] objArr = this.f35866c;
            Object obj = objArr[iB];
            Object obj2 = a0.f35710a;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.f35864a = true;
            }
        }
    }

    public final int j() {
        if (this.f35864a) {
            int i11 = this.f35867d;
            long[] jArr = this.f35865b;
            Object[] objArr = this.f35866c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != a0.f35710a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f35864a = false;
            this.f35867d = i12;
        }
        return this.f35867d;
    }

    public final Object k(int i11) {
        int i12;
        if (i11 < 0 || i11 >= (i12 = this.f35867d)) {
            i4.a.f(j4.s.f(i11, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        if (this.f35864a) {
            long[] jArr = this.f35865b;
            Object[] objArr = this.f35866c;
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                Object obj = objArr[i14];
                if (obj != a0.f35710a) {
                    if (i14 != i13) {
                        jArr[i13] = jArr[i14];
                        objArr[i13] = obj;
                        objArr[i14] = null;
                    }
                    i13++;
                }
            }
            this.f35864a = false;
            this.f35867d = i13;
        }
        return this.f35866c[i11];
    }

    public final String toString() {
        if (j() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f35867d * 28);
        sb2.append('{');
        int i11 = this.f35867d;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            sb2.append(f(i12));
            sb2.append('=');
            Object objK = k(i12);
            if (objK != sb2) {
                sb2.append(objK);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public /* synthetic */ z(Object obj) {
        this(10);
    }
}
