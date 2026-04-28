package e20;

import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import q1.t0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j0 implements k0, w3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f15676d;

    public j0() {
        this.f15673a = true;
        this.f15676d = new t0();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            r15 = this;
            java.lang.Object r0 = r15.f15676d
            q1.t0 r0 = (q1.t0) r0
            java.lang.Object[] r1 = r0.f35754c
            long[] r2 = r0.f35752a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L56
            r4 = 0
            r5 = r4
        Lf:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L51
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L29:
            if (r10 >= r8) goto L4f
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L4b
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            boolean r12 = r11 instanceof q1.o0
            if (r12 == 0) goto L4b
            q1.o0 r11 = (q1.o0) r11
            java.lang.Object[] r12 = r11.f35721a
            int r11 = r11.f35722b
            r13 = r4
        L44:
            if (r13 >= r11) goto L4b
            r14 = r12[r13]
            int r13 = r13 + 1
            goto L44
        L4b:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L29
        L4f:
            if (r8 != r9) goto L56
        L51:
            if (r5 == r3) goto L56
            int r5 = r5 + 1
            goto Lf
        L56:
            r0.g()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e20.j0.a():void");
    }

    @Override // e20.k0
    public WindowInsetsCompat e(View view, WindowInsetsCompat windowInsetsCompat, l0 l0Var) {
        if (this.f15673a) {
            l0Var.f15683d = windowInsetsCompat.i() + l0Var.f15683d;
        }
        boolean z11 = view.getLayoutDirection() == 1;
        if (this.f15674b) {
            if (z11) {
                l0Var.f15682c = windowInsetsCompat.j() + l0Var.f15682c;
            } else {
                l0Var.f15680a = windowInsetsCompat.j() + l0Var.f15680a;
            }
        }
        if (this.f15675c) {
            if (z11) {
                l0Var.f15680a = windowInsetsCompat.k() + l0Var.f15680a;
            } else {
                l0Var.f15682c = windowInsetsCompat.k() + l0Var.f15682c;
            }
        }
        view.setPaddingRelative(l0Var.f15680a, l0Var.f15681b, l0Var.f15682c, l0Var.f15683d);
        ((m1.a) this.f15676d).e(view, windowInsetsCompat, l0Var);
        return windowInsetsCompat;
    }

    public j0(boolean z11, boolean z12, boolean z13, m1.a aVar) {
        this.f15673a = z11;
        this.f15674b = z12;
        this.f15675c = z13;
        this.f15676d = aVar;
    }
}
