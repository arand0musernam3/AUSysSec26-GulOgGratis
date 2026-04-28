package mv;

import android.content.res.TypedArray;
import android.util.SparseArray;
import java.lang.Character;
import java.text.BreakIterator;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import zw.e2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class b0 implements zw.r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f30155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f30156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f30157e;

    public b0(CharSequence charSequence, int i11, Locale locale) {
        this.f30153a = 1;
        this.f30156d = charSequence;
        if (charSequence.length() < 0) {
            s5.a.a("input start index is outside the CharSequence");
        }
        if (i11 < 0 || i11 > charSequence.length()) {
            s5.a.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f30157e = wordInstance;
        this.f30154b = Math.max(0, -50);
        this.f30155c = Math.min(charSequence.length(), i11 + 50);
        wordInstance.setText(new n5.c(i11, charSequence));
    }

    public static boolean w(int i11) {
        return i11 == 32 || i11 == 10 || i11 == 13 || i11 == 9;
    }

    public float A() {
        zw.s sVar = (zw.s) this.f30156d;
        float fA = sVar.a(this.f30154b, this.f30155c, (String) this.f30157e);
        if (!Float.isNaN(fA)) {
            this.f30154b = sVar.f48344a;
        }
        return fA;
    }

    public zw.k0 B() {
        float fA = A();
        if (Float.isNaN(fA)) {
            return null;
        }
        e2 e2VarF = F();
        return e2VarF == null ? new zw.k0(fA, e2.f48191px) : new zw.k0(fA, e2VarF);
    }

    public String C() {
        String str = (String) this.f30157e;
        if (n()) {
            return null;
        }
        int i11 = this.f30154b;
        char cCharAt = str.charAt(i11);
        if (cCharAt != '\'' && cCharAt != '\"') {
            return null;
        }
        int iG = g();
        while (iG != -1 && iG != cCharAt) {
            iG = g();
        }
        if (iG == -1) {
            this.f30154b = i11;
            return null;
        }
        int i12 = this.f30154b;
        this.f30154b = i12 + 1;
        return str.substring(i11 + 1, i12);
    }

    public String D() {
        return E(false, ' ');
    }

    public String E(boolean z11, char c3) {
        String str = (String) this.f30157e;
        if (n()) {
            return null;
        }
        char cCharAt = str.charAt(this.f30154b);
        if ((!z11 && w(cCharAt)) || cCharAt == c3) {
            return null;
        }
        int i11 = this.f30154b;
        int iG = g();
        while (iG != -1 && iG != c3 && (z11 || !w(iG))) {
            iG = g();
        }
        return str.substring(i11, this.f30154b);
    }

    public e2 F() {
        String str = (String) this.f30157e;
        if (n()) {
            return null;
        }
        char cCharAt = str.charAt(this.f30154b);
        int i11 = this.f30154b;
        if (cCharAt == '%') {
            this.f30154b = i11 + 1;
            return e2.percent;
        }
        if (i11 > this.f30155c - 2) {
            return null;
        }
        try {
            e2 e2VarValueOf = e2.valueOf(str.substring(i11, i11 + 2).toLowerCase(Locale.US));
            this.f30154b += 2;
            return e2VarValueOf;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public float G() {
        J();
        zw.s sVar = (zw.s) this.f30156d;
        float fA = sVar.a(this.f30154b, this.f30155c, (String) this.f30157e);
        if (!Float.isNaN(fA)) {
            this.f30154b = sVar.f48344a;
        }
        return fA;
    }

    public int H(int i11) {
        h(i11);
        int iPreceding = ((BreakIterator) this.f30157e).preceding(i11);
        return (u(iPreceding) && q(iPreceding) && !t(iPreceding)) ? H(iPreceding) : iPreceding;
    }

    public void I(int i11, int i12, String str) {
        if (i11 > i12) {
            s5.a.a("start index must be less than or equal to end index: " + i11 + " > " + i12);
        }
        if (i11 < 0) {
            s5.a.a("start must be non-negative, but was " + i11);
        }
        r5.k kVar = (r5.k) this.f30156d;
        if (kVar == null) {
            int iMax = Math.max(255, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i11, 64);
            int iMin2 = Math.min(((String) this.f30157e).length() - i12, 64);
            String str2 = (String) this.f30157e;
            int i13 = i11 - iMin;
            str2.getClass();
            str2.getChars(i13, i11, cArr, 0);
            String str3 = (String) this.f30157e;
            int i14 = iMax - iMin2;
            int i15 = iMin2 + i12;
            str3.getClass();
            str3.getChars(i12, i15, cArr, i14);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            r5.k kVar2 = new r5.k(0);
            kVar2.f37683b = iMax;
            kVar2.f37684c = cArr;
            kVar2.f37685d = length;
            kVar2.f37686e = i14;
            this.f30156d = kVar2;
            this.f30154b = i13;
            this.f30155c = i15;
            return;
        }
        int i16 = this.f30154b;
        int i17 = i11 - i16;
        int i18 = i12 - i16;
        if (i17 < 0 || i18 > kVar.f37683b - kVar.a()) {
            this.f30157e = toString();
            this.f30156d = null;
            this.f30154b = -1;
            this.f30155c = -1;
            I(i11, i12, str);
            return;
        }
        int length2 = str.length() - (i18 - i17);
        if (length2 > kVar.a()) {
            int iA = length2 - kVar.a();
            int i19 = kVar.f37683b;
            do {
                i19 *= 2;
            } while (i19 - kVar.f37683b < iA);
            char[] cArr2 = new char[i19];
            kotlin.collections.x.h(kVar.f37684c, cArr2, 0, 0, kVar.f37685d);
            int i21 = kVar.f37683b;
            int i22 = kVar.f37686e;
            int i23 = i21 - i22;
            int i24 = i19 - i23;
            kotlin.collections.x.h(kVar.f37684c, cArr2, i24, i22, i23 + i22);
            kVar.f37684c = cArr2;
            kVar.f37683b = i19;
            kVar.f37686e = i24;
        }
        int i25 = kVar.f37685d;
        if (i17 < i25 && i18 <= i25) {
            int i26 = i25 - i18;
            char[] cArr3 = kVar.f37684c;
            kotlin.collections.x.h(cArr3, cArr3, kVar.f37686e - i26, i18, i25);
            kVar.f37685d = i17;
            kVar.f37686e -= i26;
        } else if (i17 >= i25 || i18 < i25) {
            int iA2 = kVar.a() + i17;
            int iA3 = kVar.a() + i18;
            int i27 = kVar.f37686e;
            char[] cArr4 = kVar.f37684c;
            kotlin.collections.x.h(cArr4, cArr4, kVar.f37685d, i27, iA2);
            kVar.f37685d += iA2 - i27;
            kVar.f37686e = iA3;
        } else {
            kVar.f37686e = kVar.a() + i18;
            kVar.f37685d = i17;
        }
        str.getChars(0, str.length(), kVar.f37684c, kVar.f37685d);
        kVar.f37685d = str.length() + kVar.f37685d;
    }

    public boolean J() {
        K();
        int i11 = this.f30154b;
        if (i11 == this.f30155c || ((String) this.f30157e).charAt(i11) != ',') {
            return false;
        }
        this.f30154b++;
        K();
        return true;
    }

    public void K() {
        while (true) {
            int i11 = this.f30154b;
            if (i11 >= this.f30155c || !w(((String) this.f30157e).charAt(i11))) {
                return;
            } else {
                this.f30154b++;
            }
        }
    }

    public void L(int i11, int i12, int i13) {
        int i14 = i11 - 2;
        int i15 = i12 - 2;
        x(i14, i15, i13, 1);
        int i16 = i12 - 1;
        x(i14, i16, i13, 2);
        int i17 = i11 - 1;
        x(i17, i15, i13, 3);
        x(i17, i16, i13, 4);
        x(i17, i12, i13, 5);
        x(i11, i15, i13, 6);
        x(i11, i16, i13, 7);
        x(i11, i12, i13, 8);
    }

    @Override // zw.r0
    public void a(float f11, float f12, float f13, float f14) {
        f((byte) 3);
        m(4);
        float[] fArr = (float[]) this.f30157e;
        int i11 = this.f30155c;
        int i12 = i11 + 1;
        this.f30155c = i12;
        fArr[i11] = f11;
        int i13 = i11 + 2;
        this.f30155c = i13;
        fArr[i12] = f12;
        int i14 = i11 + 3;
        this.f30155c = i14;
        fArr[i13] = f13;
        this.f30155c = i11 + 4;
        fArr[i14] = f14;
    }

    @Override // zw.r0
    public void b(float f11, float f12) {
        f((byte) 0);
        m(2);
        float[] fArr = (float[]) this.f30157e;
        int i11 = this.f30155c;
        int i12 = i11 + 1;
        this.f30155c = i12;
        fArr[i11] = f11;
        this.f30155c = i11 + 2;
        fArr[i12] = f12;
    }

    @Override // zw.r0
    public void c(float f11, float f12, float f13, float f14, float f15, float f16) {
        f((byte) 2);
        m(6);
        float[] fArr = (float[]) this.f30157e;
        int i11 = this.f30155c;
        int i12 = i11 + 1;
        this.f30155c = i12;
        fArr[i11] = f11;
        int i13 = i11 + 2;
        this.f30155c = i13;
        fArr[i12] = f12;
        int i14 = i11 + 3;
        this.f30155c = i14;
        fArr[i13] = f13;
        int i15 = i11 + 4;
        this.f30155c = i15;
        fArr[i14] = f14;
        int i16 = i11 + 5;
        this.f30155c = i16;
        fArr[i15] = f15;
        this.f30155c = i11 + 6;
        fArr[i16] = f16;
    }

    @Override // zw.r0
    public void close() {
        f((byte) 8);
    }

    @Override // zw.r0
    public void d(float f11, float f12, float f13, boolean z11, boolean z12, float f14, float f15) {
        f((byte) ((z11 ? 2 : 0) | 4 | (z12 ? 1 : 0)));
        m(5);
        float[] fArr = (float[]) this.f30157e;
        int i11 = this.f30155c;
        int i12 = i11 + 1;
        this.f30155c = i12;
        fArr[i11] = f11;
        int i13 = i11 + 2;
        this.f30155c = i13;
        fArr[i12] = f12;
        int i14 = i11 + 3;
        this.f30155c = i14;
        fArr[i13] = f13;
        int i15 = i11 + 4;
        this.f30155c = i15;
        fArr[i14] = f14;
        this.f30155c = i11 + 5;
        fArr[i15] = f15;
    }

    @Override // zw.r0
    public void e(float f11, float f12) {
        f((byte) 1);
        m(2);
        float[] fArr = (float[]) this.f30157e;
        int i11 = this.f30155c;
        int i12 = i11 + 1;
        this.f30155c = i12;
        fArr[i11] = f11;
        this.f30155c = i11 + 2;
        fArr[i12] = f12;
    }

    public void f(byte b8) {
        int i11 = this.f30154b;
        byte[] bArr = (byte[]) this.f30156d;
        if (i11 == bArr.length) {
            byte[] bArr2 = new byte[bArr.length * 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f30156d = bArr2;
        }
        byte[] bArr3 = (byte[]) this.f30156d;
        int i12 = this.f30154b;
        this.f30154b = i12 + 1;
        bArr3[i12] = b8;
    }

    public int g() {
        int i11 = this.f30154b;
        int i12 = this.f30155c;
        if (i11 == i12) {
            return -1;
        }
        int i13 = i11 + 1;
        this.f30154b = i13;
        if (i13 < i12) {
            return ((String) this.f30157e).charAt(i13);
        }
        return -1;
    }

    public void h(int i11) {
        int i12 = this.f30154b;
        int i13 = this.f30155c;
        boolean z11 = false;
        if (i11 <= i13 && i12 <= i11) {
            z11 = true;
        }
        if (z11) {
            return;
        }
        StringBuilder sbR = r8.k.r(i11, i12, "Invalid offset: ", ". Valid range is [", " , ");
        sbR.append(i13);
        sbR.append(']');
        s5.a.a(sbR.toString());
    }

    public Boolean i(Object obj) {
        if (obj == null) {
            return null;
        }
        J();
        int i11 = this.f30154b;
        if (i11 == this.f30155c) {
            return null;
        }
        char cCharAt = ((String) this.f30157e).charAt(i11);
        if (cCharAt != '0' && cCharAt != '1') {
            return null;
        }
        this.f30154b++;
        return Boolean.valueOf(cCharAt == '1');
    }

    public float j(float f11) {
        if (Float.isNaN(f11)) {
            return Float.NaN;
        }
        J();
        return A();
    }

    public boolean k(char c3) {
        int i11 = this.f30154b;
        boolean z11 = i11 < this.f30155c && ((String) this.f30157e).charAt(i11) == c3;
        if (z11) {
            this.f30154b++;
        }
        return z11;
    }

    public boolean l(String str) {
        int length = str.length();
        int i11 = this.f30154b;
        boolean z11 = i11 <= this.f30155c - length && ((String) this.f30157e).substring(i11, i11 + length).equals(str);
        if (z11) {
            this.f30154b += length;
        }
        return z11;
    }

    public void m(int i11) {
        float[] fArr = (float[]) this.f30157e;
        if (fArr.length < this.f30155c + i11) {
            float[] fArr2 = new float[fArr.length * 2];
            System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
            this.f30157e = fArr2;
        }
    }

    public boolean n() {
        return this.f30154b == this.f30155c;
    }

    public void o(zw.r0 r0Var) {
        int i11 = 0;
        for (int i12 = 0; i12 < this.f30154b; i12++) {
            byte b8 = ((byte[]) this.f30156d)[i12];
            if (b8 == 0) {
                float[] fArr = (float[]) this.f30157e;
                int i13 = i11 + 1;
                float f11 = fArr[i11];
                i11 += 2;
                r0Var.b(f11, fArr[i13]);
            } else if (b8 == 1) {
                float[] fArr2 = (float[]) this.f30157e;
                int i14 = i11 + 1;
                float f12 = fArr2[i11];
                i11 += 2;
                r0Var.e(f12, fArr2[i14]);
            } else if (b8 == 2) {
                float[] fArr3 = (float[]) this.f30157e;
                r0Var.c(fArr3[i11], fArr3[i11 + 1], fArr3[i11 + 2], fArr3[i11 + 3], fArr3[i11 + 4], fArr3[i11 + 5]);
                i11 += 6;
            } else if (b8 == 3) {
                float[] fArr4 = (float[]) this.f30157e;
                float f13 = fArr4[i11];
                float f14 = fArr4[i11 + 1];
                int i15 = i11 + 3;
                float f15 = fArr4[i11 + 2];
                i11 += 4;
                r0Var.a(f13, f14, f15, fArr4[i15]);
            } else if (b8 != 8) {
                boolean z11 = (b8 & 2) != 0;
                boolean z12 = (b8 & 1) != 0;
                float[] fArr5 = (float[]) this.f30157e;
                r0Var.d(fArr5[i11], fArr5[i11 + 1], fArr5[i11 + 2], z11, z12, fArr5[i11 + 3], fArr5[i11 + 4]);
                i11 += 5;
            } else {
                r0Var.close();
            }
        }
    }

    public int p() {
        r5.k kVar = (r5.k) this.f30156d;
        String str = (String) this.f30157e;
        if (kVar == null) {
            return str.length();
        }
        return (kVar.f37683b - kVar.a()) + (str.length() - (this.f30155c - this.f30154b));
    }

    public boolean q(int i11) {
        CharSequence charSequence = (CharSequence) this.f30156d;
        int i12 = this.f30154b + 1;
        if (i11 > this.f30155c || i12 > i11) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i11))) {
            int i13 = i11 - 1;
            if (!Character.isSurrogate(charSequence.charAt(i13))) {
                if (!l8.j.d()) {
                    return false;
                }
                l8.j jVarA = l8.j.a();
                if (jVarA.c() != 1 || jVarA.b(i13, charSequence) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean r(int i11) {
        int i12 = this.f30154b + 1;
        if (i11 > this.f30155c || i12 > i11) {
            return false;
        }
        return z20.b.w(Character.codePointBefore((CharSequence) this.f30156d, i11));
    }

    public boolean s(int i11) {
        h(i11);
        if (!((BreakIterator) this.f30157e).isBoundary(i11)) {
            return false;
        }
        if (u(i11) && u(i11 - 1) && u(i11 + 1)) {
            return false;
        }
        return i11 <= 0 || i11 >= ((CharSequence) this.f30156d).length() - 1 || !(t(i11) || t(i11 + 1));
    }

    public boolean t(int i11) {
        CharSequence charSequence = (CharSequence) this.f30156d;
        int i12 = i11 - 1;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i12));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (Intrinsics.areEqual(unicodeBlockOf, unicodeBlock) && Intrinsics.areEqual(Character.UnicodeBlock.of(charSequence.charAt(i11)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return Intrinsics.areEqual(Character.UnicodeBlock.of(charSequence.charAt(i11)), unicodeBlock) && Intrinsics.areEqual(Character.UnicodeBlock.of(charSequence.charAt(i12)), Character.UnicodeBlock.KATAKANA);
    }

    public String toString() {
        switch (this.f30153a) {
            case 2:
                r5.k kVar = (r5.k) this.f30156d;
                String str = (String) this.f30157e;
                if (kVar == null) {
                    return str;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append((CharSequence) str, 0, this.f30154b);
                sb2.append(kVar.f37684c, 0, kVar.f37685d);
                char[] cArr = kVar.f37684c;
                int i11 = kVar.f37686e;
                sb2.append(cArr, i11, kVar.f37683b - i11);
                String str2 = (String) this.f30157e;
                sb2.append((CharSequence) str2, this.f30155c, str2.length());
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public boolean u(int i11) {
        CharSequence charSequence = (CharSequence) this.f30156d;
        int i12 = this.f30154b;
        if (i11 >= this.f30155c || i12 > i11) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i11)) && !Character.isSurrogate(charSequence.charAt(i11))) {
            if (!l8.j.d()) {
                return false;
            }
            l8.j jVarA = l8.j.a();
            if (jVarA.c() != 1 || jVarA.b(i11, charSequence) == -1) {
                return false;
            }
        }
        return true;
    }

    public boolean v(int i11) {
        int i12 = this.f30154b;
        if (i11 >= this.f30155c || i12 > i11) {
            return false;
        }
        return z20.b.w(Character.codePointAt((CharSequence) this.f30156d, i11));
    }

    public void x(int i11, int i12, int i13, int i14) {
        int i15 = this.f30155c;
        if (i11 < 0) {
            int i16 = this.f30154b;
            i11 += i16;
            i12 += 4 - ((i16 + 4) % 8);
        }
        if (i12 < 0) {
            i12 += i15;
            i11 += 4 - ((i15 + 4) % 8);
        }
        ((byte[]) this.f30156d)[(i11 * i15) + i12] = (byte) ((((String) this.f30157e).charAt(i13) & (1 << (8 - i14))) == 0 ? 0 : 1);
    }

    public int y(int i11) {
        h(i11);
        int iFollowing = ((BreakIterator) this.f30157e).following(i11);
        return (u(iFollowing + (-1)) && u(iFollowing) && !t(iFollowing)) ? y(iFollowing) : iFollowing;
    }

    public Integer z() {
        int i11 = this.f30154b;
        if (i11 == this.f30155c) {
            return null;
        }
        String str = (String) this.f30157e;
        this.f30154b = i11 + 1;
        return Integer.valueOf(str.charAt(i11));
    }

    public /* synthetic */ b0(int i11) {
        this.f30153a = i11;
    }

    public b0(String str, int i11, int i12) {
        this.f30153a = 4;
        this.f30157e = str;
        this.f30155c = i11;
        this.f30154b = i12;
        byte[] bArr = new byte[i11 * i12];
        this.f30156d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    public b0(cv.g gVar, String str, int i11, int i12) {
        this.f30153a = 0;
        gVar.getClass();
        this.f30156d = gVar;
        this.f30157e = str;
        this.f30154b = i11;
        this.f30155c = i12;
    }

    public b0(t20.l lVar, j30.g gVar) {
        this.f30153a = 3;
        this.f30156d = new SparseArray();
        this.f30157e = lVar;
        TypedArray typedArray = (TypedArray) gVar.f24503c;
        this.f30154b = typedArray.getResourceId(28, 0);
        this.f30155c = typedArray.getResourceId(53, 0);
    }

    public b0(String str) {
        this.f30153a = 6;
        this.f30154b = 0;
        this.f30155c = 0;
        this.f30156d = new zw.s();
        String strTrim = str.trim();
        this.f30157e = strTrim;
        this.f30155c = strTrim.length();
    }
}
