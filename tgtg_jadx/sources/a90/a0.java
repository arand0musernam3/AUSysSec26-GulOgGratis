package a90;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import v80.x0;
import v80.y0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1006b = AtomicIntegerFieldUpdater.newUpdater(a0.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x0[] f1007a;

    public final void a(x0 x0Var) {
        x0Var.e((y0) this);
        x0[] x0VarArr = this.f1007a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1006b;
        if (x0VarArr == null) {
            x0VarArr = new x0[4];
            this.f1007a = x0VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= x0VarArr.length) {
            x0VarArr = (x0[]) Arrays.copyOf(x0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            this.f1007a = x0VarArr;
        }
        int i11 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i11 + 1);
        x0VarArr[i11] = x0Var;
        x0Var.f42173b = i11;
        c(i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final v80.x0 b(int r9) {
        /*
            r8 = this;
            v80.x0[] r0 = r8.f1007a
            r0.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = a90.a0.f1006b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.d(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            r4.getClass()
            r5 = r0[r2]
            r5.getClass()
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.d(r9, r2)
            r8.c(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            v80.x0[] r5 = r8.f1007a
            r5.getClass()
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            r6.getClass()
            r7 = r5[r4]
            r7.getClass()
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            r4.getClass()
            r5 = r5[r2]
            r5.getClass()
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.d(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            r9.getClass()
            r2 = 0
            r9.e(r2)
            r9.f42173b = r3
            int r1 = r1.get(r8)
            r0[r1] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a90.a0.b(int):v80.x0");
    }

    public final void c(int i11) {
        while (i11 > 0) {
            x0[] x0VarArr = this.f1007a;
            x0VarArr.getClass();
            int i12 = (i11 - 1) / 2;
            x0 x0Var = x0VarArr[i12];
            x0Var.getClass();
            x0 x0Var2 = x0VarArr[i11];
            x0Var2.getClass();
            if (x0Var.compareTo(x0Var2) <= 0) {
                return;
            }
            d(i11, i12);
            i11 = i12;
        }
    }

    public final void d(int i11, int i12) {
        x0[] x0VarArr = this.f1007a;
        x0VarArr.getClass();
        x0 x0Var = x0VarArr[i12];
        x0Var.getClass();
        x0 x0Var2 = x0VarArr[i11];
        x0Var2.getClass();
        x0VarArr[i11] = x0Var;
        x0VarArr[i12] = x0Var2;
        x0Var.f42173b = i11;
        x0Var2.f42173b = i12;
    }
}
