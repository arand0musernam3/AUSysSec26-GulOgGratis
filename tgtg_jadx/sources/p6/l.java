package p6;

import android.view.View;
import java.text.DecimalFormat;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public xz.b f34514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f34515b = new int[10];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f34516c = new float[10];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f34518e;

    public final float a(float f11) {
        return (float) this.f34514a.u(f11);
    }

    public void b(float f11, int i11) {
        int[] iArr = this.f34515b;
        if (iArr.length < this.f34517d + 1) {
            this.f34515b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f34516c;
            this.f34516c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f34515b;
        int i12 = this.f34517d;
        iArr2[i12] = i11;
        this.f34516c[i12] = f11;
        this.f34517d = i12 + 1;
    }

    public abstract void c(View view, float f11);

    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(int r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.f34517d
            if (r1 != 0) goto L7
            return
        L7:
            int[] r2 = r0.f34515b
            float[] r3 = r0.f34516c
            r4 = 1
            int r1 = r1 - r4
            int r5 = r2.length
            int r5 = r5 + 10
            int[] r5 = new int[r5]
            r6 = 0
            r5[r6] = r1
            r5[r4] = r6
            r1 = 2
            r7 = r1
        L19:
            if (r7 <= 0) goto L65
            int r8 = r7 + (-1)
            r9 = r5[r8]
            int r10 = r7 + (-2)
            r11 = r5[r10]
            if (r9 >= r11) goto L63
            r12 = r2[r11]
            r13 = r9
            r14 = r13
        L29:
            if (r13 >= r11) goto L42
            r15 = r2[r13]
            if (r15 > r12) goto L3f
            r16 = r2[r14]
            r2[r14] = r15
            r2[r13] = r16
            r15 = r3[r14]
            r16 = r3[r13]
            r3[r14] = r16
            r3[r13] = r15
            int r14 = r14 + 1
        L3f:
            int r13 = r13 + 1
            goto L29
        L42:
            r12 = r2[r14]
            r13 = r2[r11]
            r2[r14] = r13
            r2[r11] = r12
            r12 = r3[r14]
            r13 = r3[r11]
            r3[r14] = r13
            r3[r11] = r12
            int r12 = r14 + (-1)
            r5[r10] = r12
            r5[r8] = r9
            int r8 = r7 + 1
            r5[r7] = r11
            int r7 = r7 + 2
            int r14 = r14 + 1
            r5[r8] = r14
            goto L19
        L63:
            r7 = r10
            goto L19
        L65:
            r2 = r4
            r3 = r2
        L67:
            int r5 = r0.f34517d
            if (r2 >= r5) goto L7a
            int[] r5 = r0.f34515b
            int r7 = r2 + (-1)
            r7 = r5[r7]
            r5 = r5[r2]
            if (r7 == r5) goto L77
            int r3 = r3 + 1
        L77:
            int r2 = r2 + 1
            goto L67
        L7a:
            double[] r2 = new double[r3]
            int[] r1 = new int[r1]
            r1[r4] = r4
            r1[r6] = r3
            java.lang.Class r3 = java.lang.Double.TYPE
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r3, r1)
            double[][] r1 = (double[][]) r1
            r3 = r6
            r4 = r3
        L8c:
            int r5 = r0.f34517d
            if (r3 >= r5) goto Lb8
            if (r3 <= 0) goto L9d
            int[] r5 = r0.f34515b
            r7 = r5[r3]
            int r8 = r3 + (-1)
            r5 = r5[r8]
            if (r7 != r5) goto L9d
            goto Lb5
        L9d:
            int[] r5 = r0.f34515b
            r5 = r5[r3]
            double r7 = (double) r5
            r9 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r7 = r7 * r9
            r2[r4] = r7
            r5 = r1[r4]
            float[] r7 = r0.f34516c
            r7 = r7[r3]
            double r7 = (double) r7
            r5[r6] = r7
            int r4 = r4 + 1
        Lb5:
            int r3 = r3 + 1
            goto L8c
        Lb8:
            r3 = r18
            xz.b r1 = xz.b.t(r3, r2, r1)
            r0.f34514a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.l.d(int):void");
    }

    public final String toString() {
        String string = this.f34518e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i11 = 0; i11 < this.f34517d; i11++) {
            StringBuilder sbR = e0.f.r(string, "[");
            sbR.append(this.f34515b[i11]);
            sbR.append(" , ");
            sbR.append(decimalFormat.format(this.f34516c[i11]));
            sbR.append("] ");
            string = sbR.toString();
        }
        return string;
    }
}
