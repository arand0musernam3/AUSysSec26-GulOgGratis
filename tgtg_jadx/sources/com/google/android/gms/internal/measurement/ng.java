package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class ng extends la {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object[] f11673e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11674f;

    @Override // com.google.android.gms.internal.measurement.la
    public final int a() {
        return this.f11674f;
    }

    @Override // com.google.android.gms.internal.measurement.la
    public final tg i(int i11) {
        if (i11 < this.f11674f) {
            return (tg) this.f11673e[i11 + i11];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // com.google.android.gms.internal.measurement.la
    public final Object j(int i11) {
        if (i11 < this.f11674f) {
            return this.f11673e[i11 + i11 + 1];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // com.google.android.gms.internal.measurement.la
    public final Object k(tg tgVar) {
        int iM = m(tgVar);
        if (iM == -1) {
            return null;
        }
        return tgVar.f11908b.cast(this.f11673e[iM + iM + 1]);
    }

    public final void l(tg tgVar, Object obj) {
        int iM;
        if (!tgVar.f11909c && (iM = m(tgVar)) != -1) {
            g1.c(obj, "metadata value");
            this.f11673e[iM + iM + 1] = obj;
            return;
        }
        int i11 = this.f11674f + 1;
        Object[] objArr = this.f11673e;
        int length = objArr.length;
        if (i11 + i11 > length) {
            this.f11673e = Arrays.copyOf(objArr, length + length);
        }
        Object[] objArr2 = this.f11673e;
        int i12 = this.f11674f;
        int i13 = i12 + i12;
        objArr2[i13] = tgVar;
        g1.c(obj, "metadata value");
        objArr2[i13 + 1] = obj;
        this.f11674f++;
    }

    public final int m(tg tgVar) {
        for (int i11 = 0; i11 < this.f11674f; i11++) {
            if (this.f11673e[i11 + i11].equals(tgVar)) {
                return i11;
            }
        }
        return -1;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Metadata{");
        for (int i11 = 0; i11 < this.f11674f; i11++) {
            sb2.append(" '");
            sb2.append(i(i11));
            sb2.append("': ");
            sb2.append(j(i11));
        }
        sb2.append(" }");
        return sb2.toString();
    }
}
