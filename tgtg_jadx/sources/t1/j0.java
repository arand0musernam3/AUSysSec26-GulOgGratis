package t1;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f39469a;

    public j0(i0 i0Var) {
        this.f39469a = i0Var;
    }

    @Override // t1.t, t1.i
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final c1.g a(v1 v1Var) {
        int[] iArr;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        int i11;
        i0 i0Var = this.f39469a;
        q1.g0 g0Var = i0Var.f39457b;
        q1.f0 f0Var = new q1.f0(g0Var.f35802e + 2);
        q1.g0 g0Var2 = new q1.g0(g0Var.f35802e);
        int[] iArr3 = g0Var.f35799b;
        Object[] objArr3 = g0Var.f35800c;
        long[] jArr = g0Var.f35798a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i12 = 0;
            while (true) {
                long j9 = jArr[i12];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8;
                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j9 & 255) < 128) {
                            int i16 = (i12 << 3) + i15;
                            int i17 = iArr3[i16];
                            i11 = i13;
                            h0 h0Var = (h0) objArr3[i16];
                            f0Var.c(i17);
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            g0Var2.i(i17, new c2((o) v1Var.f39591a.invoke(h0Var.f39452a), h0Var.f39453b));
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i11 = i13;
                        }
                        j9 >>= i11;
                        i15++;
                        iArr3 = iArr2;
                        i13 = i11;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i14 != i13) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i12 == length) {
                    break;
                }
                i12++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!g0Var.a(0)) {
            int i18 = f0Var.f35790b;
            if (i18 < 0) {
                org.bouncycastle.jce.provider.a.v("Index must be between 0 and size");
                return null;
            }
            f0Var.d(i18 + 1);
            int[] iArr4 = f0Var.f35789a;
            int i19 = f0Var.f35790b;
            if (i19 != 0) {
                kotlin.collections.x.f(1, iArr4, 0, i19, iArr4);
            }
            iArr4[0] = 0;
            f0Var.f35790b++;
        }
        if (!g0Var.a(i0Var.f39456a)) {
            f0Var.c(i0Var.f39456a);
        }
        int i21 = f0Var.f35790b;
        if (i21 != 0) {
            int[] iArr5 = f0Var.f35789a;
            iArr5.getClass();
            Arrays.sort(iArr5, 0, i21);
        }
        return new c1.g(f0Var, g0Var2, i0Var.f39456a, w.f39596d);
    }
}
