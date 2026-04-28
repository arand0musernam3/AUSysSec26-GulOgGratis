package j4;

import i4.v;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f24563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f24564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f24565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f24566d;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h(j4.c r9, j4.c r10, int r11) {
        /*
            r8 = this;
            long r0 = r9.f24533b
            long r2 = j4.b.f24527a
            boolean r0 = j4.b.a(r0, r2)
            if (r0 == 0) goto Lf
            j4.c r0 = j4.k.a(r9)
            goto L10
        Lf:
            r0 = r9
        L10:
            long r4 = r10.f24533b
            boolean r1 = j4.b.a(r4, r2)
            if (r1 == 0) goto L1d
            j4.c r1 = j4.k.a(r10)
            goto L1e
        L1d:
            r1 = r10
        L1e:
            r4 = 3
            if (r11 != r4) goto L69
            long r5 = r9.f24533b
            boolean r11 = j4.b.a(r5, r2)
            long r5 = r10.f24533b
            boolean r2 = j4.b.a(r5, r2)
            if (r11 == 0) goto L32
            if (r2 == 0) goto L32
            goto L69
        L32:
            if (r11 != 0) goto L36
            if (r2 == 0) goto L69
        L36:
            if (r11 == 0) goto L39
            goto L3a
        L39:
            r9 = r10
        L3a:
            j4.r r9 = (j4.r) r9
            j4.u r9 = r9.f24587d
            float[] r3 = j4.k.f24572e
            if (r11 == 0) goto L47
            float[] r11 = r9.a()
            goto L48
        L47:
            r11 = r3
        L48:
            if (r2 == 0) goto L4e
            float[] r3 = r9.a()
        L4e:
            r9 = 0
            r2 = r11[r9]
            r5 = r3[r9]
            float r2 = r2 / r5
            r5 = 1
            r6 = r11[r5]
            r7 = r3[r5]
            float r6 = r6 / r7
            r7 = 2
            r11 = r11[r7]
            r3 = r3[r7]
            float r11 = r11 / r3
            float[] r3 = new float[r4]
            r3[r9] = r2
            r3[r5] = r6
            r3[r7] = r11
            goto L6a
        L69:
            r3 = 0
        L6a:
            r8.<init>(r10, r0, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.h.<init>(j4.c, j4.c, int):void");
    }

    public long a(long j9) {
        float fH = v.h(j9);
        float fG = v.g(j9);
        float fE = v.e(j9);
        float fD = v.d(j9);
        c cVar = this.f24564b;
        long jD = cVar.d(fH, fG, fE);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jD >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jD & 4294967295L));
        float fE2 = cVar.e(fH, fG, fE);
        float[] fArr = this.f24566d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fE2 *= fArr[2];
        }
        float f11 = fIntBitsToFloat;
        float f12 = fIntBitsToFloat2;
        return this.f24565c.f(f11, f12, fE2, fD, this.f24563a);
    }

    public h(c cVar, c cVar2, c cVar3, float[] fArr) {
        this.f24563a = cVar;
        this.f24564b = cVar2;
        this.f24565c = cVar3;
        this.f24566d = fArr;
    }
}
