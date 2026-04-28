package m3;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f29410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f29413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q1.g0 f29414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u70.t f29415f;

    public r1(int i11, ArrayList arrayList) {
        this.f29410a = arrayList;
        this.f29411b = i11;
        if (i11 < 0) {
            s1.a("Invalid start index");
        }
        this.f29413d = new ArrayList();
        q1.g0 g0Var = new q1.g0();
        int size = arrayList.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            u0 u0Var = (u0) this.f29410a.get(i13);
            int i14 = u0Var.f29453c;
            int i15 = u0Var.f29454d;
            g0Var.i(i14, new o0(i13, i12, i15));
            i12 += i15;
        }
        this.f29414e = g0Var;
        this.f29415f = u70.l.b(new g3.c1(this, 3));
    }

    public final boolean a(int i11, int i12) {
        int i13;
        q1.g0 g0Var = this.f29414e;
        o0 o0Var = (o0) g0Var.b(i11);
        if (o0Var == null) {
            return false;
        }
        int i14 = o0Var.f29356b;
        int i15 = i12 - o0Var.f29357c;
        o0Var.f29357c = i12;
        if (i15 == 0) {
            return true;
        }
        Object[] objArr = g0Var.f35800c;
        long[] jArr = g0Var.f35798a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i16 = 0;
        while (true) {
            long j9 = jArr[i16];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i17 = 8 - ((~(i16 - length)) >>> 31);
                for (int i18 = 0; i18 < i17; i18++) {
                    if ((255 & j9) < 128) {
                        o0 o0Var2 = (o0) objArr[(i16 << 3) + i18];
                        if (o0Var2.f29356b >= i14 && !Intrinsics.areEqual(o0Var2, o0Var) && (i13 = o0Var2.f29356b + i15) >= 0) {
                            o0Var2.f29356b = i13;
                        }
                    }
                    j9 >>= 8;
                }
                if (i17 != 8) {
                    return true;
                }
            }
            if (i16 == length) {
                return true;
            }
            i16++;
        }
    }
}
