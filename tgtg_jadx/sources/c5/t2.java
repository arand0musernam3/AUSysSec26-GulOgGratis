package c5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t2 extends androidx.lifecycle.l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1.g0 f7382a;

    public t2() {
        q1.g0 g0Var = q1.p.f35804a;
        this.f7382a = new q1.g0();
    }

    @Override // androidx.lifecycle.l1
    public final void onCleared() {
        q1.g0 g0Var = this.f7382a;
        int[] iArr = g0Var.f35799b;
        Object[] objArr = g0Var.f35800c;
        long[] jArr = g0Var.f35798a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j9 = jArr[i11];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8;
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((255 & j9) < 128) {
                        int i15 = (i11 << 3) + i14;
                        int i16 = iArr[i15];
                        q1.o0 o0Var = (q1.o0) objArr[i15];
                        Object[] objArr2 = o0Var.f35721a;
                        int i17 = o0Var.f35722b;
                        int i18 = 0;
                        while (i18 < i17) {
                            s2 s2Var = (s2) objArr2[i18];
                            int i19 = i12;
                            m3.g gVar = s2Var.f7377d;
                            if (gVar != null) {
                                gVar.cancel();
                            }
                            s2Var.f7377d = null;
                            e20.j0 j0Var = (e20.j0) s2Var.f7374a.f39013b;
                            j0Var.f15674b = true;
                            j0Var.f15673a = false;
                            j0Var.a();
                            i18++;
                            i12 = i19;
                        }
                    }
                    int i21 = i12;
                    j9 >>= i21;
                    i14++;
                    i12 = i21;
                }
                if (i13 != i12) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }
}
