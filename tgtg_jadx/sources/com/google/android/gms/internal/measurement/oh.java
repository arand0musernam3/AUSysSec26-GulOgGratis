package com.google.android.gms.internal.measurement;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class oh extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final la f11733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final la f11734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f11735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11736e;

    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public oh(com.google.android.gms.internal.measurement.la r11, com.google.android.gms.internal.measurement.la r12) {
        /*
            r10 = this;
            r10.<init>()
            r10.f11733b = r11
            r10.f11734c = r12
            int r11 = r12.a()
            r12 = 28
            r0 = 0
            r1 = 1
            if (r11 > r12) goto L13
            r12 = r1
            goto L14
        L13:
            r12 = r0
        L14:
            if (r12 == 0) goto L60
            int[] r12 = new int[r11]
            r10.f11735d = r12
            r2 = 0
            r4 = r0
            r5 = r4
        L1e:
            if (r4 >= r11) goto L5d
            com.google.android.gms.internal.measurement.tg r6 = r10.d(r4)
            long r7 = r6.f11911e
            long r7 = r7 | r2
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 != 0) goto L54
            r2 = r0
        L2c:
            r3 = -1
            if (r2 >= r5) goto L41
            r9 = r12[r2]
            r9 = r9 & 31
            com.google.android.gms.internal.measurement.tg r9 = r10.d(r9)
            boolean r9 = r6.equals(r9)
            if (r9 == 0) goto L3e
            goto L42
        L3e:
            int r2 = r2 + 1
            goto L2c
        L41:
            r2 = r3
        L42:
            if (r2 == r3) goto L54
            boolean r3 = r6.f11909c
            if (r3 == 0) goto L50
            r3 = r12[r2]
            int r6 = r4 + 4
            int r6 = r1 << r6
            r3 = r3 | r6
            goto L51
        L50:
            r3 = r4
        L51:
            r12[r2] = r3
            goto L59
        L54:
            int r2 = r5 + 1
            r12[r5] = r4
            r5 = r2
        L59:
            int r4 = r4 + 1
            r2 = r7
            goto L1e
        L5d:
            r10.f11736e = r5
            return
        L60:
            java.lang.String r11 = "metadata size too large"
            i4.a.f(r11)
            r11 = 0
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.oh.<init>(com.google.android.gms.internal.measurement.la, com.google.android.gms.internal.measurement.la):void");
    }

    @Override // com.google.android.gms.internal.measurement.c
    public final void a(lh lhVar, gh ghVar) {
        for (int i11 = 0; i11 < this.f11736e; i11++) {
            int i12 = this.f11735d[i11];
            tg tgVarD = d(i12 & 31);
            if (tgVarD.f11909c) {
                lhVar.b(tgVarD, new nh(this, tgVarD, i12), ghVar);
            } else {
                la laVar = this.f11733b;
                int iA = laVar.a();
                if (i12 >= iA) {
                    laVar = this.f11734c;
                    i12 -= iA;
                }
                lhVar.a(tgVarD, tgVarD.f11908b.cast(laVar.j(i12)), ghVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.c
    public final int b() {
        return this.f11736e;
    }

    @Override // com.google.android.gms.internal.measurement.c
    public final Set c() {
        return new androidx.datastore.preferences.protobuf.f1(this, 2);
    }

    public final tg d(int i11) {
        la laVar = this.f11733b;
        int iA = laVar.a();
        return i11 >= iA ? this.f11734c.i(i11 - iA) : laVar.i(i11);
    }
}
