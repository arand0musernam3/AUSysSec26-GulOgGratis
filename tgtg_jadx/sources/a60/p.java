package a60;

import com.adyen.checkout.components.core.Address;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonEncodingException;
import java.io.Closeable;
import java.io.EOFException;
import java.util.Arrays;
import kotlin.text.Charsets;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements Closeable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ia0.j f886k;
    public static final ia0.j l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ia0.j f887m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f888a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ia0.g f892e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ia0.g f893f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f895h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f896i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f897j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f889b = new int[32];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f890c = new String[32];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f891d = new int[32];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f894g = 0;

    static {
        ia0.j jVar = ia0.j.f23646d;
        f886k = r40.d.p("'\\");
        l = r40.d.p("\"\\");
        f887m = r40.d.p("{}[]:, \n\t\r\f/\\;#=");
        r40.d.p("\n\r");
        r40.d.p("*/");
    }

    public p(ia0.g gVar) {
        this.f892e = gVar;
        this.f893f = gVar;
        u0(6);
    }

    public final int A(String str, n nVar) {
        int length = nVar.f884a.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(nVar.f884a[i11])) {
                this.f894g = 0;
                int[] iArr = this.f891d;
                int i12 = this.f888a - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
        }
        return -1;
    }

    public final void A0(ia0.j jVar) throws EOFException, JsonEncodingException {
        while (true) {
            long jI = this.f892e.I(jVar);
            if (jI == -1) {
                C0("Unterminated string");
                throw null;
            }
            ia0.g gVar = this.f893f;
            if (gVar.G(jI) != 92) {
                gVar.skip(jI + 1);
                return;
            } else {
                gVar.skip(jI + 1);
                x0();
            }
        }
    }

    public final String B() {
        return h0.d(this.f888a, this.f889b, this.f890c, this.f891d);
    }

    public final void B0() throws EOFException, JsonEncodingException {
        int i11 = 0;
        do {
            int iP = this.f894g;
            if (iP == 0) {
                iP = p();
            }
            if (iP == 3) {
                u0(1);
            } else if (iP == 1) {
                u0(3);
            } else {
                if (iP == 4) {
                    i11--;
                    if (i11 < 0) {
                        StringBuilder sb2 = new StringBuilder("Expected a value but was ");
                        sb2.append(i0());
                        a40.d0.p(sb2, B());
                        return;
                    }
                    this.f888a--;
                } else if (iP == 2) {
                    i11--;
                    if (i11 < 0) {
                        StringBuilder sb3 = new StringBuilder("Expected a value but was ");
                        sb3.append(i0());
                        a40.d0.p(sb3, B());
                        return;
                    }
                    this.f888a--;
                } else {
                    ia0.g gVar = this.f893f;
                    if (iP == 14 || iP == 10) {
                        long jI = this.f892e.I(f887m);
                        if (jI == -1) {
                            jI = gVar.f23643b;
                        }
                        gVar.skip(jI);
                    } else if (iP == 9 || iP == 13) {
                        A0(l);
                    } else if (iP == 8 || iP == 12) {
                        A0(f886k);
                    } else if (iP == 17) {
                        gVar.skip(this.f896i);
                    } else if (iP == 18) {
                        StringBuilder sb4 = new StringBuilder("Expected a value but was ");
                        sb4.append(i0());
                        a40.d0.p(sb4, B());
                        return;
                    }
                }
                this.f894g = 0;
            }
            i11++;
            this.f894g = 0;
        } while (i11 != 0);
        int[] iArr = this.f891d;
        int i12 = this.f888a - 1;
        iArr[i12] = iArr[i12] + 1;
        this.f890c[i12] = Address.ADDRESS_NULL_PLACEHOLDER;
    }

    public final void C0(String str) throws JsonEncodingException {
        StringBuilder sbR = e0.f.r(str, " at path ");
        sbR.append(B());
        throw new JsonEncodingException(sbR.toString());
    }

    public final boolean G() throws EOFException, JsonEncodingException {
        int iP = this.f894g;
        if (iP == 0) {
            iP = p();
        }
        return (iP == 2 || iP == 4 || iP == 18) ? false : true;
    }

    public final boolean H(int i11) throws JsonEncodingException {
        if (i11 == 9 || i11 == 10 || i11 == 12 || i11 == 13 || i11 == 32) {
            return false;
        }
        if (i11 != 35) {
            if (i11 == 44) {
                return false;
            }
            if (i11 != 47 && i11 != 61) {
                if (i11 == 123 || i11 == 125 || i11 == 58) {
                    return false;
                }
                if (i11 != 59) {
                    switch (i11) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        g();
        throw null;
    }

    public final double I() throws EOFException, JsonEncodingException {
        int iP = this.f894g;
        if (iP == 0) {
            iP = p();
        }
        if (iP == 16) {
            this.f894g = 0;
            int[] iArr = this.f891d;
            int i11 = this.f888a - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f895h;
        }
        if (iP == 17) {
            long j9 = this.f896i;
            ia0.g gVar = this.f893f;
            gVar.getClass();
            this.f897j = gVar.a0(j9, Charsets.UTF_8);
        } else if (iP == 9) {
            this.f897j = Z(l);
        } else if (iP == 8) {
            this.f897j = Z(f886k);
        } else if (iP == 10) {
            this.f897j = g0();
        } else if (iP != 11) {
            StringBuilder sb2 = new StringBuilder("Expected a double but was ");
            sb2.append(i0());
            a40.d0.p(sb2, B());
            return 0.0d;
        }
        this.f894g = 11;
        try {
            double d3 = Double.parseDouble(this.f897j);
            if (Double.isNaN(d3) || Double.isInfinite(d3)) {
                throw new JsonEncodingException("JSON forbids NaN and infinities: " + d3 + " at path " + B());
            }
            this.f897j = null;
            this.f894g = 0;
            int[] iArr2 = this.f891d;
            int i12 = this.f888a - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return d3;
        } catch (NumberFormatException unused) {
            a40.d0.l("Expected a double but was ", this.f897j, B());
            return 0.0d;
        }
    }

    public final int J() throws EOFException, JsonEncodingException {
        int iP = this.f894g;
        if (iP == 0) {
            iP = p();
        }
        if (iP == 16) {
            long j9 = this.f895h;
            int i11 = (int) j9;
            if (j9 == i11) {
                this.f894g = 0;
                int[] iArr = this.f891d;
                int i12 = this.f888a - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new JsonDataException("Expected an int but was " + this.f895h + " at path " + B());
        }
        if (iP == 17) {
            long j11 = this.f896i;
            ia0.g gVar = this.f893f;
            gVar.getClass();
            this.f897j = gVar.a0(j11, Charsets.UTF_8);
        } else if (iP == 9 || iP == 8) {
            String strZ = iP == 9 ? Z(l) : Z(f886k);
            this.f897j = strZ;
            try {
                int i13 = Integer.parseInt(strZ);
                this.f894g = 0;
                int[] iArr2 = this.f891d;
                int i14 = this.f888a - 1;
                iArr2[i14] = iArr2[i14] + 1;
                return i13;
            } catch (NumberFormatException unused) {
            }
        } else if (iP != 11) {
            StringBuilder sb2 = new StringBuilder("Expected an int but was ");
            sb2.append(i0());
            a40.d0.p(sb2, B());
            return 0;
        }
        this.f894g = 11;
        try {
            double d3 = Double.parseDouble(this.f897j);
            int i15 = (int) d3;
            if (i15 != d3) {
                a40.d0.l("Expected an int but was ", this.f897j, B());
                return 0;
            }
            this.f897j = null;
            this.f894g = 0;
            int[] iArr3 = this.f891d;
            int i16 = this.f888a - 1;
            iArr3[i16] = iArr3[i16] + 1;
            return i15;
        } catch (NumberFormatException unused2) {
            a40.d0.l("Expected an int but was ", this.f897j, B());
            return 0;
        }
    }

    public final String L() throws EOFException, JsonEncodingException {
        String strZ;
        int iP = this.f894g;
        if (iP == 0) {
            iP = p();
        }
        if (iP == 14) {
            strZ = g0();
        } else if (iP == 13) {
            strZ = Z(l);
        } else if (iP == 12) {
            strZ = Z(f886k);
        } else {
            if (iP != 15) {
                StringBuilder sb2 = new StringBuilder("Expected a name but was ");
                sb2.append(i0());
                a40.d0.p(sb2, B());
                return null;
            }
            strZ = this.f897j;
            this.f897j = null;
        }
        this.f894g = 0;
        this.f890c[this.f888a - 1] = strZ;
        return strZ;
    }

    public final int O(boolean z11) throws EOFException, JsonEncodingException {
        int i11 = 0;
        while (true) {
            int i12 = i11 + 1;
            ia0.g gVar = this.f892e;
            if (!gVar.request(i12)) {
                if (z11) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j9 = i11;
            ia0.g gVar2 = this.f893f;
            byte bG = gVar2.G(j9);
            if (bG != 10 && bG != 32 && bG != 13 && bG != 9) {
                gVar2.skip(j9);
                if (bG == 47) {
                    if (gVar.request(2L)) {
                        g();
                        throw null;
                    }
                } else if (bG == 35) {
                    g();
                    throw null;
                }
                return bG;
            }
            i11 = i12;
        }
    }

    public final void Q() throws EOFException, JsonEncodingException {
        int iP = this.f894g;
        if (iP == 0) {
            iP = p();
        }
        if (iP != 7) {
            StringBuilder sb2 = new StringBuilder("Expected null but was ");
            sb2.append(i0());
            a40.d0.p(sb2, B());
        } else {
            this.f894g = 0;
            int[] iArr = this.f891d;
            int i11 = this.f888a - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    public final String Z(ia0.j jVar) throws EOFException, JsonEncodingException {
        StringBuilder sb2 = null;
        while (true) {
            long jI = this.f892e.I(jVar);
            if (jI == -1) {
                C0("Unterminated string");
                throw null;
            }
            ia0.g gVar = this.f893f;
            if (gVar.G(jI) != 92) {
                if (sb2 == null) {
                    String strA0 = gVar.a0(jI, Charsets.UTF_8);
                    gVar.readByte();
                    return strA0;
                }
                sb2.append(gVar.a0(jI, Charsets.UTF_8));
                gVar.readByte();
                return sb2.toString();
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(gVar.a0(jI, Charsets.UTF_8));
            gVar.readByte();
            sb2.append(x0());
        }
    }

    public final void a() throws EOFException, JsonEncodingException {
        int iP = this.f894g;
        if (iP == 0) {
            iP = p();
        }
        if (iP == 3) {
            u0(1);
            this.f891d[this.f888a - 1] = 0;
            this.f894g = 0;
        } else {
            StringBuilder sb2 = new StringBuilder("Expected BEGIN_ARRAY but was ");
            sb2.append(i0());
            a40.d0.p(sb2, B());
        }
    }

    public final String a0() throws EOFException, JsonEncodingException {
        String strA0;
        int iP = this.f894g;
        if (iP == 0) {
            iP = p();
        }
        if (iP == 10) {
            strA0 = g0();
        } else if (iP == 9) {
            strA0 = Z(l);
        } else if (iP == 8) {
            strA0 = Z(f886k);
        } else if (iP == 11) {
            strA0 = this.f897j;
            this.f897j = null;
        } else if (iP == 16) {
            strA0 = Long.toString(this.f895h);
        } else {
            if (iP != 17) {
                StringBuilder sb2 = new StringBuilder("Expected a string but was ");
                sb2.append(i0());
                a40.d0.p(sb2, B());
                return null;
            }
            long j9 = this.f896i;
            ia0.g gVar = this.f893f;
            gVar.getClass();
            strA0 = gVar.a0(j9, Charsets.UTF_8);
        }
        this.f894g = 0;
        int[] iArr = this.f891d;
        int i11 = this.f888a - 1;
        iArr[i11] = iArr[i11] + 1;
        return strA0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws EOFException {
        this.f894g = 0;
        this.f889b[0] = 8;
        this.f888a = 1;
        this.f893f.a();
    }

    public final void e() throws EOFException, JsonEncodingException {
        int iP = this.f894g;
        if (iP == 0) {
            iP = p();
        }
        if (iP == 1) {
            u0(3);
            this.f894g = 0;
        } else {
            StringBuilder sb2 = new StringBuilder("Expected BEGIN_OBJECT but was ");
            sb2.append(i0());
            a40.d0.p(sb2, B());
        }
    }

    public final void g() throws JsonEncodingException {
        C0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    public final String g0() {
        long jI = this.f892e.I(f887m);
        ia0.g gVar = this.f893f;
        if (jI == -1) {
            return gVar.g0();
        }
        gVar.getClass();
        return gVar.a0(jI, Charsets.UTF_8);
    }

    public final o i0() throws EOFException, JsonEncodingException {
        int iP = this.f894g;
        if (iP == 0) {
            iP = p();
        }
        switch (iP) {
            case 1:
                return o.BEGIN_OBJECT;
            case 2:
                return o.END_OBJECT;
            case 3:
                return o.BEGIN_ARRAY;
            case 4:
                return o.END_ARRAY;
            case 5:
            case 6:
                return o.BOOLEAN;
            case 7:
                return o.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return o.STRING;
            case 12:
            case 13:
            case 14:
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return o.NAME;
            case 16:
            case 17:
                return o.NUMBER;
            case 18:
                return o.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x0199, code lost:
    
        if (H(r10) != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x019b, code lost:
    
        if (r1 != 2) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x019d, code lost:
    
        if (r4 == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01a3, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01a5, code lost:
    
        if (r13 == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01a9, code lost:
    
        if (r8 != r16) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01ab, code lost:
    
        if (r13 != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01ad, code lost:
    
        if (r13 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01b0, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01b1, code lost:
    
        r22.f895h = r8;
        r7.skip(r2);
        r9 = 16;
        r22.f894g = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01bc, code lost:
    
        if (r1 == 2) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01bf, code lost:
    
        if (r1 == 4) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01c2, code lost:
    
        if (r1 != 7) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01c4, code lost:
    
        r22.f896i = r2;
        r9 = 17;
        r22.f894g = 17;
     */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0119 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int p() throws java.io.EOFException, com.squareup.moshi.JsonEncodingException {
        /*
            Method dump skipped, instruction units count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a60.p.p():int");
    }

    public final void r() throws EOFException, JsonEncodingException {
        int iP = this.f894g;
        if (iP == 0) {
            iP = p();
        }
        if (iP != 4) {
            StringBuilder sb2 = new StringBuilder("Expected END_ARRAY but was ");
            sb2.append(i0());
            a40.d0.p(sb2, B());
        } else {
            int i11 = this.f888a;
            this.f888a = i11 - 1;
            int[] iArr = this.f891d;
            int i12 = i11 - 2;
            iArr[i12] = iArr[i12] + 1;
            this.f894g = 0;
        }
    }

    public final void t() throws EOFException, JsonEncodingException {
        int iP = this.f894g;
        if (iP == 0) {
            iP = p();
        }
        if (iP != 2) {
            StringBuilder sb2 = new StringBuilder("Expected END_OBJECT but was ");
            sb2.append(i0());
            a40.d0.p(sb2, B());
            return;
        }
        int i11 = this.f888a;
        int i12 = i11 - 1;
        this.f888a = i12;
        this.f890c[i12] = null;
        int[] iArr = this.f891d;
        int i13 = i11 - 2;
        iArr[i13] = iArr[i13] + 1;
        this.f894g = 0;
    }

    public final String toString() {
        return "JsonReader(" + this.f892e + ")";
    }

    public final int u(String str, n nVar) {
        int length = nVar.f884a.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(nVar.f884a[i11])) {
                this.f894g = 0;
                this.f890c[this.f888a - 1] = str;
                return i11;
            }
        }
        return -1;
    }

    public final void u0(int i11) {
        int i12 = this.f888a;
        int[] iArr = this.f889b;
        if (i12 == iArr.length) {
            if (i12 == 256) {
                throw new JsonDataException("Nesting too deep at ".concat(B()));
            }
            this.f889b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f890c;
            this.f890c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f891d;
            this.f891d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f889b;
        int i13 = this.f888a;
        this.f888a = i13 + 1;
        iArr3[i13] = i11;
    }

    public final char x0() throws EOFException, JsonEncodingException {
        int i11;
        ia0.g gVar = this.f892e;
        if (!gVar.request(1L)) {
            C0("Unterminated escape sequence");
            throw null;
        }
        ia0.g gVar2 = this.f893f;
        byte b8 = gVar2.readByte();
        if (b8 == 10 || b8 == 34 || b8 == 39 || b8 == 47 || b8 == 92) {
            return (char) b8;
        }
        if (b8 == 98) {
            return '\b';
        }
        if (b8 == 102) {
            return '\f';
        }
        if (b8 == 110) {
            return '\n';
        }
        if (b8 == 114) {
            return '\r';
        }
        if (b8 == 116) {
            return '\t';
        }
        if (b8 != 117) {
            C0("Invalid escape sequence: \\" + ((char) b8));
            throw null;
        }
        if (!gVar.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path ".concat(B()));
        }
        char c3 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            byte bG = gVar2.G(i12);
            char c7 = (char) (c3 << 4);
            if (bG >= 48 && bG <= 57) {
                i11 = bG - 48;
            } else if (bG >= 97 && bG <= 102) {
                i11 = bG - 87;
            } else {
                if (bG < 65 || bG > 70) {
                    C0("\\u".concat(gVar2.a0(4L, Charsets.UTF_8)));
                    throw null;
                }
                i11 = bG - 55;
            }
            c3 = (char) (i11 + c7);
        }
        gVar2.skip(4L);
        return c3;
    }

    public final int y0(n nVar) throws EOFException, JsonEncodingException {
        int iP = this.f894g;
        if (iP == 0) {
            iP = p();
        }
        if (iP < 12 || iP > 15) {
            return -1;
        }
        if (iP == 15) {
            return u(this.f897j, nVar);
        }
        int iU = this.f892e.U(nVar.f885b);
        if (iU != -1) {
            this.f894g = 0;
            this.f890c[this.f888a - 1] = nVar.f884a[iU];
            return iU;
        }
        String str = this.f890c[this.f888a - 1];
        String strL = L();
        int iU2 = u(strL, nVar);
        if (iU2 == -1) {
            this.f894g = 15;
            this.f897j = strL;
            this.f890c[this.f888a - 1] = str;
        }
        return iU2;
    }

    public final void z0() throws EOFException, JsonEncodingException {
        int iP = this.f894g;
        if (iP == 0) {
            iP = p();
        }
        if (iP == 14) {
            long jI = this.f892e.I(f887m);
            ia0.g gVar = this.f893f;
            if (jI == -1) {
                jI = gVar.f23643b;
            }
            gVar.skip(jI);
        } else if (iP == 13) {
            A0(l);
        } else if (iP == 12) {
            A0(f886k);
        } else if (iP != 15) {
            StringBuilder sb2 = new StringBuilder("Expected a name but was ");
            sb2.append(i0());
            a40.d0.p(sb2, B());
            return;
        }
        this.f894g = 0;
        this.f890c[this.f888a - 1] = Address.ADDRESS_NULL_PLACEHOLDER;
    }
}
