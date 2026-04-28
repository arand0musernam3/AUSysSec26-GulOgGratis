package r50;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f37730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f37731b;

    public b(a aVar, int[] iArr) {
        if (iArr.length == 0) {
            i4.a.h();
            throw null;
        }
        this.f37730a = aVar;
        int length = iArr.length;
        int i11 = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.f37731b = iArr;
            return;
        }
        while (i11 < length && iArr[i11] == 0) {
            i11++;
        }
        if (i11 == length) {
            this.f37731b = new int[]{0};
            return;
        }
        int i12 = length - i11;
        int[] iArr2 = new int[i12];
        this.f37731b = iArr2;
        System.arraycopy(iArr, i11, iArr2, 0, i12);
    }

    public final b a(b bVar) {
        a aVar = bVar.f37730a;
        a aVar2 = this.f37730a;
        if (!aVar2.equals(aVar)) {
            i4.a.f("GenericGFPolys do not have same GenericGF field");
            return null;
        }
        int[] iArr = this.f37731b;
        if (iArr[0] == 0) {
            return bVar;
        }
        int[] iArr2 = bVar.f37731b;
        if (iArr2[0] == 0) {
            return this;
        }
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i11 = length; i11 < iArr.length; i11++) {
            iArr3[i11] = iArr2[i11 - length] ^ iArr[i11];
        }
        return new b(aVar2, iArr3);
    }

    public final int b() {
        return this.f37731b.length - 1;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(b() * 8);
        for (int iB = b(); iB >= 0; iB--) {
            int[] iArr = this.f37731b;
            int i11 = iArr[(iArr.length - 1) - iB];
            if (i11 != 0) {
                if (i11 < 0) {
                    sb2.append(" - ");
                    i11 = -i11;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (iB == 0 || i11 != 1) {
                    a aVar = this.f37730a;
                    if (i11 == 0) {
                        aVar.getClass();
                        i4.a.h();
                        return null;
                    }
                    int i12 = aVar.f37725b[i11];
                    if (i12 == 0) {
                        sb2.append('1');
                    } else if (i12 == 1) {
                        sb2.append('a');
                    } else {
                        sb2.append("a^");
                        sb2.append(i12);
                    }
                }
                if (iB != 0) {
                    if (iB == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(iB);
                    }
                }
            }
        }
        return sb2.toString();
    }
}
