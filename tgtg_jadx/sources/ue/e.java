package ue;

import a60.n;
import com.adyen.checkout.components.core.Address;
import ia0.d0;
import ia0.g;
import ia0.j;
import java.io.EOFException;
import kotlin.text.Charsets;
import org.bouncycastle.iana.AEADAlgorithm;
import qc.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends d {
    public static final j l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final j f41068m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f41069n;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d0 f41070f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f41071g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f41072h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f41073i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f41074j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f41075k;

    static {
        j jVar = j.f23646d;
        l = r40.d.p("'\\");
        f41068m = r40.d.p("\"\\");
        f41069n = r40.d.p("{}[]:, \n\t\r\f/\\;#=");
        r40.d.p("\n\r");
        r40.d.p("*/");
    }

    public e(d0 d0Var) {
        this.f41065b = new int[32];
        this.f41066c = new String[32];
        this.f41067d = new int[32];
        this.f41072h = 0;
        this.f41070f = d0Var;
        this.f41071g = d0Var.f23623b;
        I(6);
    }

    @Override // ue.d
    public final double A() throws b, EOFException {
        int iA0 = this.f41072h;
        if (iA0 == 0) {
            iA0 = a0();
        }
        if (iA0 == 16) {
            this.f41072h = 0;
            int[] iArr = this.f41067d;
            int i11 = this.f41064a - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f41073i;
        }
        if (iA0 == 17) {
            long j9 = this.f41074j;
            g gVar = this.f41071g;
            gVar.getClass();
            this.f41075k = gVar.a0(j9, Charsets.UTF_8);
        } else if (iA0 == 9) {
            this.f41075k = y0(f41068m);
        } else if (iA0 == 8) {
            this.f41075k = y0(l);
        } else if (iA0 == 10) {
            this.f41075k = z0();
        } else if (iA0 != 11) {
            StringBuilder sb2 = new StringBuilder("Expected a double but was ");
            sb2.append(H());
            y.o(sb2, r());
            return 0.0d;
        }
        this.f41072h = 11;
        try {
            double d3 = Double.parseDouble(this.f41075k);
            if (Double.isNaN(d3) || Double.isInfinite(d3)) {
                throw new b("JSON forbids NaN and infinities: " + d3 + " at path " + r());
            }
            this.f41075k = null;
            this.f41072h = 0;
            int[] iArr2 = this.f41067d;
            int i12 = this.f41064a - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return d3;
        } catch (NumberFormatException unused) {
            throw new a("Expected a double but was " + this.f41075k + " at path " + r());
        }
    }

    public final char A0() throws b, EOFException {
        int i11;
        d0 d0Var = this.f41070f;
        if (!d0Var.request(1L)) {
            Q("Unterminated escape sequence");
            throw null;
        }
        g gVar = this.f41071g;
        byte b8 = gVar.readByte();
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
            Q("Invalid escape sequence: \\" + ((char) b8));
            throw null;
        }
        if (!d0Var.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path ".concat(r()));
        }
        char c3 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            byte bG = gVar.G(i12);
            char c7 = (char) (c3 << 4);
            if (bG >= 48 && bG <= 57) {
                i11 = bG - 48;
            } else if (bG >= 97 && bG <= 102) {
                i11 = bG - 87;
            } else {
                if (bG < 65 || bG > 70) {
                    Q("\\u".concat(gVar.a0(4L, Charsets.UTF_8)));
                    throw null;
                }
                i11 = bG - 55;
            }
            c3 = (char) (i11 + c7);
        }
        gVar.skip(4L);
        return c3;
    }

    @Override // ue.d
    public final int B() {
        int iA0 = this.f41072h;
        if (iA0 == 0) {
            iA0 = a0();
        }
        if (iA0 == 16) {
            long j9 = this.f41073i;
            int i11 = (int) j9;
            if (j9 == i11) {
                this.f41072h = 0;
                int[] iArr = this.f41067d;
                int i12 = this.f41064a - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new a("Expected an int but was " + this.f41073i + " at path " + r());
        }
        if (iA0 == 17) {
            long j11 = this.f41074j;
            g gVar = this.f41071g;
            gVar.getClass();
            this.f41075k = gVar.a0(j11, Charsets.UTF_8);
        } else if (iA0 == 9 || iA0 == 8) {
            String strY0 = iA0 == 9 ? y0(f41068m) : y0(l);
            this.f41075k = strY0;
            try {
                int i13 = Integer.parseInt(strY0);
                this.f41072h = 0;
                int[] iArr2 = this.f41067d;
                int i14 = this.f41064a - 1;
                iArr2[i14] = iArr2[i14] + 1;
                return i13;
            } catch (NumberFormatException unused) {
            }
        } else if (iA0 != 11) {
            StringBuilder sb2 = new StringBuilder("Expected an int but was ");
            sb2.append(H());
            y.o(sb2, r());
            return 0;
        }
        this.f41072h = 11;
        try {
            double d3 = Double.parseDouble(this.f41075k);
            int i15 = (int) d3;
            if (i15 == d3) {
                this.f41075k = null;
                this.f41072h = 0;
                int[] iArr3 = this.f41067d;
                int i16 = this.f41064a - 1;
                iArr3[i16] = iArr3[i16] + 1;
                return i15;
            }
            throw new a("Expected an int but was " + this.f41075k + " at path " + r());
        } catch (NumberFormatException unused2) {
            throw new a("Expected an int but was " + this.f41075k + " at path " + r());
        }
    }

    public final void B0(j jVar) throws b, EOFException {
        while (true) {
            long jE = this.f41070f.e(jVar);
            if (jE == -1) {
                Q("Unterminated string");
                throw null;
            }
            g gVar = this.f41071g;
            if (gVar.G(jE) != 92) {
                gVar.skip(jE + 1);
                return;
            } else {
                gVar.skip(jE + 1);
                A0();
            }
        }
    }

    @Override // ue.d
    public final String G() {
        String strA0;
        int iA0 = this.f41072h;
        if (iA0 == 0) {
            iA0 = a0();
        }
        if (iA0 == 10) {
            strA0 = z0();
        } else if (iA0 == 9) {
            strA0 = y0(f41068m);
        } else if (iA0 == 8) {
            strA0 = y0(l);
        } else if (iA0 == 11) {
            strA0 = this.f41075k;
            this.f41075k = null;
        } else if (iA0 == 16) {
            strA0 = Long.toString(this.f41073i);
        } else {
            if (iA0 != 17) {
                StringBuilder sb2 = new StringBuilder("Expected a string but was ");
                sb2.append(H());
                y.o(sb2, r());
                return null;
            }
            long j9 = this.f41074j;
            g gVar = this.f41071g;
            gVar.getClass();
            strA0 = gVar.a0(j9, Charsets.UTF_8);
        }
        this.f41072h = 0;
        int[] iArr = this.f41067d;
        int i11 = this.f41064a - 1;
        iArr[i11] = iArr[i11] + 1;
        return strA0;
    }

    @Override // ue.d
    public final c H() throws b, EOFException {
        int iA0 = this.f41072h;
        if (iA0 == 0) {
            iA0 = a0();
        }
        switch (iA0) {
            case 1:
                return c.BEGIN_OBJECT;
            case 2:
                return c.END_OBJECT;
            case 3:
                return c.BEGIN_ARRAY;
            case 4:
                return c.END_ARRAY;
            case 5:
            case 6:
                return c.BOOLEAN;
            case 7:
                return c.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return c.STRING;
            case 12:
            case 13:
            case 14:
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return c.NAME;
            case 16:
            case 17:
                return c.NUMBER;
            case 18:
                return c.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // ue.d
    public final int J(n nVar) {
        int iA0 = this.f41072h;
        if (iA0 == 0) {
            iA0 = a0();
        }
        if (iA0 < 12 || iA0 > 15) {
            return -1;
        }
        if (iA0 == 15) {
            return g0(this.f41075k, nVar);
        }
        int iU = this.f41070f.U(nVar.f885b);
        if (iU != -1) {
            this.f41072h = 0;
            this.f41066c[this.f41064a - 1] = nVar.f884a[iU];
            return iU;
        }
        String str = this.f41066c[this.f41064a - 1];
        String strU0 = u0();
        int iG0 = g0(strU0, nVar);
        if (iG0 == -1) {
            this.f41072h = 15;
            this.f41075k = strU0;
            this.f41066c[this.f41064a - 1] = str;
        }
        return iG0;
    }

    @Override // ue.d
    public final void L() {
        int iA0 = this.f41072h;
        if (iA0 == 0) {
            iA0 = a0();
        }
        if (iA0 == 14) {
            long jE = this.f41070f.e(f41069n);
            g gVar = this.f41071g;
            if (jE == -1) {
                jE = gVar.f23643b;
            }
            gVar.skip(jE);
        } else if (iA0 == 13) {
            B0(f41068m);
        } else if (iA0 == 12) {
            B0(l);
        } else if (iA0 != 15) {
            StringBuilder sb2 = new StringBuilder("Expected a name but was ");
            sb2.append(H());
            y.o(sb2, r());
            return;
        }
        this.f41072h = 0;
        this.f41066c[this.f41064a - 1] = Address.ADDRESS_NULL_PLACEHOLDER;
    }

    @Override // ue.d
    public final void O() {
        int i11 = 0;
        do {
            int iA0 = this.f41072h;
            if (iA0 == 0) {
                iA0 = a0();
            }
            if (iA0 == 3) {
                I(1);
            } else if (iA0 == 1) {
                I(3);
            } else {
                if (iA0 == 4) {
                    i11--;
                    if (i11 < 0) {
                        StringBuilder sb2 = new StringBuilder("Expected a value but was ");
                        sb2.append(H());
                        y.o(sb2, r());
                        return;
                    }
                    this.f41064a--;
                } else if (iA0 == 2) {
                    i11--;
                    if (i11 < 0) {
                        StringBuilder sb3 = new StringBuilder("Expected a value but was ");
                        sb3.append(H());
                        y.o(sb3, r());
                        return;
                    }
                    this.f41064a--;
                } else {
                    g gVar = this.f41071g;
                    if (iA0 == 14 || iA0 == 10) {
                        long jE = this.f41070f.e(f41069n);
                        if (jE == -1) {
                            jE = gVar.f23643b;
                        }
                        gVar.skip(jE);
                    } else if (iA0 == 9 || iA0 == 13) {
                        B0(f41068m);
                    } else if (iA0 == 8 || iA0 == 12) {
                        B0(l);
                    } else if (iA0 == 17) {
                        gVar.skip(this.f41074j);
                    } else if (iA0 == 18) {
                        StringBuilder sb4 = new StringBuilder("Expected a value but was ");
                        sb4.append(H());
                        y.o(sb4, r());
                        return;
                    }
                }
                this.f41072h = 0;
            }
            i11++;
            this.f41072h = 0;
        } while (i11 != 0);
        int[] iArr = this.f41067d;
        int i12 = this.f41064a - 1;
        iArr[i12] = iArr[i12] + 1;
        this.f41066c[i12] = Address.ADDRESS_NULL_PLACEHOLDER;
    }

    public final void Z() throws b {
        Q("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    @Override // ue.d
    public final void a() {
        int iA0 = this.f41072h;
        if (iA0 == 0) {
            iA0 = a0();
        }
        if (iA0 == 3) {
            I(1);
            this.f41067d[this.f41064a - 1] = 0;
            this.f41072h = 0;
        } else {
            StringBuilder sb2 = new StringBuilder("Expected BEGIN_ARRAY but was ");
            sb2.append(H());
            y.o(sb2, r());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0195, code lost:
    
        if (i0(r10) != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0197, code lost:
    
        if (r1 != 2) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0199, code lost:
    
        if (r4 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x019f, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01a1, code lost:
    
        if (r13 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01a5, code lost:
    
        if (r8 != r17) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01a7, code lost:
    
        if (r13 != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01a9, code lost:
    
        if (r13 == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01ac, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01ad, code lost:
    
        r22.f41073i = r8;
        r7.skip(r2);
        r9 = 16;
        r22.f41072h = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01b8, code lost:
    
        if (r1 == 2) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01bb, code lost:
    
        if (r1 == 4) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01be, code lost:
    
        if (r1 != 7) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01c0, code lost:
    
        r22.f41074j = r2;
        r9 = 17;
        r22.f41072h = 17;
     */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0115 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a0() throws ue.b, java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ue.e.a0():int");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws EOFException {
        this.f41072h = 0;
        this.f41065b[0] = 8;
        this.f41064a = 1;
        this.f41071g.a();
        this.f41070f.close();
    }

    @Override // ue.d
    public final void e() {
        int iA0 = this.f41072h;
        if (iA0 == 0) {
            iA0 = a0();
        }
        if (iA0 == 1) {
            I(3);
            this.f41072h = 0;
        } else {
            StringBuilder sb2 = new StringBuilder("Expected BEGIN_OBJECT but was ");
            sb2.append(H());
            y.o(sb2, r());
        }
    }

    @Override // ue.d
    public final void g() {
        int iA0 = this.f41072h;
        if (iA0 == 0) {
            iA0 = a0();
        }
        if (iA0 != 4) {
            StringBuilder sb2 = new StringBuilder("Expected END_ARRAY but was ");
            sb2.append(H());
            y.o(sb2, r());
        } else {
            int i11 = this.f41064a;
            this.f41064a = i11 - 1;
            int[] iArr = this.f41067d;
            int i12 = i11 - 2;
            iArr[i12] = iArr[i12] + 1;
            this.f41072h = 0;
        }
    }

    public final int g0(String str, n nVar) {
        int length = nVar.f884a.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(nVar.f884a[i11])) {
                this.f41072h = 0;
                this.f41066c[this.f41064a - 1] = str;
                return i11;
            }
        }
        return -1;
    }

    public final boolean i0(int i11) throws b {
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
        Z();
        throw null;
    }

    @Override // ue.d
    public final void p() {
        int iA0 = this.f41072h;
        if (iA0 == 0) {
            iA0 = a0();
        }
        if (iA0 != 2) {
            StringBuilder sb2 = new StringBuilder("Expected END_OBJECT but was ");
            sb2.append(H());
            y.o(sb2, r());
            return;
        }
        int i11 = this.f41064a;
        int i12 = i11 - 1;
        this.f41064a = i12;
        this.f41066c[i12] = null;
        int[] iArr = this.f41067d;
        int i13 = i11 - 2;
        iArr[i13] = iArr[i13] + 1;
        this.f41072h = 0;
    }

    @Override // ue.d
    public final boolean t() throws b, EOFException {
        int iA0 = this.f41072h;
        if (iA0 == 0) {
            iA0 = a0();
        }
        return (iA0 == 2 || iA0 == 4 || iA0 == 18) ? false : true;
    }

    public final String toString() {
        return "JsonReader(" + this.f41070f + ")";
    }

    @Override // ue.d
    public final boolean u() {
        int iA0 = this.f41072h;
        if (iA0 == 0) {
            iA0 = a0();
        }
        if (iA0 == 5) {
            this.f41072h = 0;
            int[] iArr = this.f41067d;
            int i11 = this.f41064a - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        }
        if (iA0 != 6) {
            StringBuilder sb2 = new StringBuilder("Expected a boolean but was ");
            sb2.append(H());
            y.o(sb2, r());
            return false;
        }
        this.f41072h = 0;
        int[] iArr2 = this.f41067d;
        int i12 = this.f41064a - 1;
        iArr2[i12] = iArr2[i12] + 1;
        return false;
    }

    public final String u0() {
        String strY0;
        int iA0 = this.f41072h;
        if (iA0 == 0) {
            iA0 = a0();
        }
        if (iA0 == 14) {
            strY0 = z0();
        } else if (iA0 == 13) {
            strY0 = y0(f41068m);
        } else if (iA0 == 12) {
            strY0 = y0(l);
        } else {
            if (iA0 != 15) {
                StringBuilder sb2 = new StringBuilder("Expected a name but was ");
                sb2.append(H());
                y.o(sb2, r());
                return null;
            }
            strY0 = this.f41075k;
        }
        this.f41072h = 0;
        this.f41066c[this.f41064a - 1] = strY0;
        return strY0;
    }

    public final int x0(boolean z11) throws b, EOFException {
        int i11 = 0;
        while (true) {
            int i12 = i11 + 1;
            d0 d0Var = this.f41070f;
            if (!d0Var.request(i12)) {
                if (z11) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j9 = i11;
            g gVar = this.f41071g;
            byte bG = gVar.G(j9);
            if (bG != 10 && bG != 32 && bG != 13 && bG != 9) {
                gVar.skip(j9);
                if (bG == 47) {
                    if (d0Var.request(2L)) {
                        Z();
                        throw null;
                    }
                } else if (bG == 35) {
                    Z();
                    throw null;
                }
                return bG;
            }
            i11 = i12;
        }
    }

    public final String y0(j jVar) throws b, EOFException {
        StringBuilder sb2 = null;
        while (true) {
            long jE = this.f41070f.e(jVar);
            if (jE == -1) {
                Q("Unterminated string");
                throw null;
            }
            g gVar = this.f41071g;
            if (gVar.G(jE) != 92) {
                if (sb2 == null) {
                    String strA0 = gVar.a0(jE, Charsets.UTF_8);
                    gVar.readByte();
                    return strA0;
                }
                sb2.append(gVar.a0(jE, Charsets.UTF_8));
                gVar.readByte();
                return sb2.toString();
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(gVar.a0(jE, Charsets.UTF_8));
            gVar.readByte();
            sb2.append(A0());
        }
    }

    public final String z0() {
        long jE = this.f41070f.e(f41069n);
        g gVar = this.f41071g;
        if (jE == -1) {
            return gVar.g0();
        }
        gVar.getClass();
        return gVar.a0(jE, Charsets.UTF_8);
    }
}
