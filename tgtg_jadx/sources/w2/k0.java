package w2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements CharSequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f42953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r5.k f42954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f42955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f42956d;

    public final void a(int i11, int i12, int i13, CharSequence charSequence) {
        if (i11 > i12) {
            c2.a.a("start=" + i11 + " > end=" + i12);
        }
        if (i13 < 0) {
            c2.a.a("textStart=0 > textEnd=" + i13);
        }
        if (i11 < 0) {
            c2.a.a("start must be non-negative, but was " + i11);
        }
        r5.k kVar = this.f42954b;
        if (kVar == null) {
            int iMax = Math.max(255, i13 + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i11, 64);
            int iMin2 = Math.min(this.f42953a.length() - i12, 64);
            int i14 = i11 - iMin;
            c0.y(this.f42953a, cArr, 0, i14, i11);
            int i15 = iMax - iMin2;
            int i16 = iMin2 + i12;
            c0.y(this.f42953a, cArr, i15, i12, i16);
            c0.y(charSequence, cArr, iMin, 0, i13);
            r5.k kVar2 = new r5.k(1);
            kVar2.f37683b = iMax;
            kVar2.f37684c = cArr;
            kVar2.f37685d = iMin + i13;
            kVar2.f37686e = i15;
            this.f42954b = kVar2;
            this.f42955c = i14;
            this.f42956d = i16;
            return;
        }
        int i17 = this.f42955c;
        int i18 = i11 - i17;
        int i19 = i12 - i17;
        if (i18 < 0 || i19 > kVar.f37683b - kVar.a()) {
            this.f42953a = toString();
            this.f42954b = null;
            this.f42955c = -1;
            this.f42956d = -1;
            a(i11, i12, i13, charSequence);
            return;
        }
        int i21 = i13 - (i19 - i18);
        if (i21 > kVar.a()) {
            int iA = i21 - kVar.a();
            int i22 = kVar.f37683b;
            do {
                i22 *= 2;
            } while (i22 - kVar.f37683b < iA);
            char[] cArr2 = new char[i22];
            kotlin.collections.x.h(kVar.f37684c, cArr2, 0, 0, kVar.f37685d);
            int i23 = kVar.f37683b;
            int i24 = kVar.f37686e;
            int i25 = i23 - i24;
            int i26 = i22 - i25;
            kotlin.collections.x.h(kVar.f37684c, cArr2, i26, i24, i25 + i24);
            kVar.f37684c = cArr2;
            kVar.f37683b = i22;
            kVar.f37686e = i26;
        }
        int i27 = kVar.f37685d;
        if (i18 < i27 && i19 <= i27) {
            int i28 = i27 - i19;
            char[] cArr3 = kVar.f37684c;
            kotlin.collections.x.h(cArr3, cArr3, kVar.f37686e - i28, i19, i27);
            kVar.f37685d = i18;
            kVar.f37686e -= i28;
        } else if (i18 >= i27 || i19 < i27) {
            int iA2 = kVar.a() + i18;
            int iA3 = kVar.a() + i19;
            int i29 = kVar.f37686e;
            char[] cArr4 = kVar.f37684c;
            kotlin.collections.x.h(cArr4, cArr4, kVar.f37685d, i29, iA2);
            kVar.f37685d += iA2 - i29;
            kVar.f37686e = iA3;
        } else {
            kVar.f37686e = kVar.a() + i19;
            kVar.f37685d = i18;
        }
        c0.y(charSequence, kVar.f37684c, kVar.f37685d, 0, i13);
        kVar.f37685d += i13;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i11) {
        r5.k kVar = this.f42954b;
        if (kVar == null) {
            return this.f42953a.charAt(i11);
        }
        if (i11 < this.f42955c) {
            return this.f42953a.charAt(i11);
        }
        int iA = kVar.f37683b - kVar.a();
        int i12 = this.f42955c;
        if (i11 >= iA + i12) {
            return this.f42953a.charAt(i11 - ((iA - this.f42956d) + i12));
        }
        int i13 = i11 - i12;
        int i14 = kVar.f37685d;
        char[] cArr = kVar.f37684c;
        return i13 < i14 ? cArr[i13] : cArr[(i13 - i14) + kVar.f37686e];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        r5.k kVar = this.f42954b;
        CharSequence charSequence = this.f42953a;
        if (kVar == null) {
            return charSequence.length();
        }
        return (kVar.f37683b - kVar.a()) + (charSequence.length() - (this.f42956d - this.f42955c));
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i11, int i12) {
        return toString().subSequence(i11, i12);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        r5.k kVar = this.f42954b;
        CharSequence charSequence = this.f42953a;
        if (kVar == null) {
            return charSequence.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequence, 0, this.f42955c);
        sb2.append(kVar.f37684c, 0, kVar.f37685d);
        char[] cArr = kVar.f37684c;
        int i11 = kVar.f37686e;
        sb2.append(cArr, i11, kVar.f37683b - i11);
        CharSequence charSequence2 = this.f42953a;
        sb2.append(charSequence2, this.f42956d, charSequence2.length());
        return sb2.toString();
    }
}
