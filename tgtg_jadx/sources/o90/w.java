package o90;

import com.adyen.checkout.components.core.Address;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class w extends m0.c implements n90.l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n90.c f32205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b0 f32206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i0.w f32207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i2.x f32208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f32209h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a30.j f32210i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n90.j f32211j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j f32212k;

    public w(n90.c cVar, b0 b0Var, i0.w wVar, SerialDescriptor serialDescriptor, a30.j jVar) {
        b0Var.getClass();
        serialDescriptor.getClass();
        this.f32205d = cVar;
        this.f32206e = b0Var;
        this.f32207f = wVar;
        this.f32208g = cVar.f30750b;
        this.f32209h = -1;
        this.f32210i = jVar;
        n90.j jVar2 = cVar.f30749a;
        this.f32211j = jVar2;
        this.f32212k = jVar2.f30774d ? null : new j(serialDescriptor);
    }

    @Override // m0.c, kotlinx.serialization.encoding.Decoder
    public final byte A() {
        i0.w wVar = this.f32207f;
        long jO = wVar.o();
        byte b8 = (byte) jO;
        if (jO == b8) {
            return b8;
        }
        i0.w.t(wVar, "Failed to parse byte for input '" + jO + '\'', 0, null, 6);
        throw null;
    }

    @Override // m0.c, kotlinx.serialization.encoding.Decoder
    public final short B() {
        i0.w wVar = this.f32207f;
        long jO = wVar.o();
        short s7 = (short) jO;
        if (jO == s7) {
            return s7;
        }
        i0.w.t(wVar, "Failed to parse short for input '" + jO + '\'', 0, null, 6);
        throw null;
    }

    @Override // m0.c, kotlinx.serialization.encoding.Decoder
    public final float C() {
        i0.w wVar = this.f32207f;
        String strQ = wVar.q();
        try {
            float f11 = Float.parseFloat(strQ);
            if (Math.abs(f11) <= Float.MAX_VALUE) {
                return f11;
            }
            k.r(wVar, Float.valueOf(f11));
            throw null;
        } catch (IllegalArgumentException unused) {
            i0.w.t(wVar, e0.f.g('\'', "Failed to parse type 'float' for input '", strQ), 0, null, 6);
            throw null;
        }
    }

    @Override // m0.c, kotlinx.serialization.encoding.Decoder
    public final double D() {
        i0.w wVar = this.f32207f;
        String strQ = wVar.q();
        try {
            double d3 = Double.parseDouble(strQ);
            if (Math.abs(d3) <= Double.MAX_VALUE) {
                return d3;
            }
            k.r(wVar, Double.valueOf(d3));
            throw null;
        } catch (IllegalArgumentException unused) {
            i0.w.t(wVar, e0.f.g('\'', "Failed to parse type 'double' for input '", strQ), 0, null, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.Decoder, l90.a
    public final i2.x a() {
        return this.f32208g;
    }

    @Override // m0.c, l90.a
    public final void b(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (serialDescriptor.e() == 0 && k.l(serialDescriptor, this.f32205d)) {
            while (w(serialDescriptor) != -1) {
            }
        }
        i0.w wVar = this.f32207f;
        if (wVar.W()) {
            k.m(wVar, "");
            throw null;
        }
        wVar.n(this.f32206e.end);
        a3.j jVar = (a3.j) wVar.f22746c;
        int i11 = jVar.f398b;
        int[] iArr = (int[]) jVar.f400d;
        if (iArr[i11] == -2) {
            iArr[i11] = -1;
            jVar.f398b = i11 - 1;
        }
        int i12 = jVar.f398b;
        if (i12 != -1) {
            jVar.f398b = i12 - 1;
        }
    }

    @Override // m0.c, kotlinx.serialization.encoding.Decoder
    public final l90.a c(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        n90.c cVar = this.f32205d;
        b0 b0VarQ = k.q(serialDescriptor, cVar);
        i0.w wVar = this.f32207f;
        a3.j jVar = (a3.j) wVar.f22746c;
        int i11 = jVar.f398b + 1;
        jVar.f398b = i11;
        if (i11 == ((Object[]) jVar.f399c).length) {
            jVar.s();
        }
        ((Object[]) jVar.f399c)[i11] = serialDescriptor;
        wVar.n(b0VarQ.begin);
        if (wVar.C() != 4) {
            int i12 = v.$EnumSwitchMapping$0[b0VarQ.ordinal()];
            return (i12 == 1 || i12 == 2 || i12 == 3) ? new w(cVar, b0VarQ, wVar, serialDescriptor, this.f32210i) : (this.f32206e == b0VarQ && cVar.f30749a.f30774d) ? this : new w(cVar, b0VarQ, wVar, serialDescriptor, this.f32210i);
        }
        i0.w.t(wVar, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    @Override // m0.c, kotlinx.serialization.encoding.Decoder
    public final boolean g() {
        boolean z11;
        boolean z12;
        i0.w wVar = this.f32207f;
        int iT = wVar.T();
        String str = (String) wVar.f22749f;
        if (iT == str.length()) {
            i0.w.t(wVar, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iT) == '\"') {
            iT++;
            z11 = true;
        } else {
            z11 = false;
        }
        int iE = wVar.E(iT);
        if (iE >= str.length() || iE == -1) {
            i0.w.t(wVar, "EOF", 0, null, 6);
            throw null;
        }
        int i11 = iE + 1;
        int iCharAt = str.charAt(iE) | ' ';
        if (iCharAt == 102) {
            wVar.j(i11, "alse");
            z12 = false;
        } else {
            if (iCharAt != 116) {
                i0.w.t(wVar, "Expected valid boolean literal prefix, but had '" + wVar.q() + '\'', 0, null, 6);
                throw null;
            }
            wVar.j(i11, "rue");
            z12 = true;
        }
        if (!z11) {
            return z12;
        }
        if (wVar.f22745b == str.length()) {
            i0.w.t(wVar, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(wVar.f22745b) == '\"') {
            wVar.f22745b++;
            return z12;
        }
        i0.w.t(wVar, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // n90.l
    public final n90.c getJson() {
        return this.f32205d;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0122  */
    @Override // kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(i90.b r11) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o90.w.h(i90.b):java.lang.Object");
    }

    @Override // m0.c, kotlinx.serialization.encoding.Decoder
    public final char i() {
        i0.w wVar = this.f32207f;
        String strQ = wVar.q();
        if (strQ.length() == 1) {
            return strQ.charAt(0);
        }
        i0.w.t(wVar, e0.f.g('\'', "Expected single char, but got '", strQ), 0, null, 6);
        throw null;
    }

    @Override // m0.c, kotlinx.serialization.encoding.Decoder
    public final int j(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return k.k(serialDescriptor, this.f32205d, r(), " at path ".concat(((a3.j) this.f32207f.f22746c).m()));
    }

    @Override // m0.c, l90.a
    public final Object n(SerialDescriptor serialDescriptor, int i11, i90.b bVar, Object obj) {
        a3.j jVar = (a3.j) this.f32207f.f22746c;
        serialDescriptor.getClass();
        bVar.getClass();
        boolean z11 = this.f32206e == b0.MAP && (i11 & 1) == 0;
        if (z11) {
            int[] iArr = (int[]) jVar.f400d;
            int i12 = jVar.f398b;
            if (iArr[i12] == -2) {
                ((Object[]) jVar.f399c)[i12] = l.f32174a;
            }
        }
        Object objH = h(bVar);
        if (z11) {
            int[] iArr2 = (int[]) jVar.f400d;
            int i13 = jVar.f398b;
            if (iArr2[i13] != -2) {
                int i14 = i13 + 1;
                jVar.f398b = i14;
                if (i14 == ((Object[]) jVar.f399c).length) {
                    jVar.s();
                }
            }
            Object[] objArr = (Object[]) jVar.f399c;
            int i15 = jVar.f398b;
            objArr[i15] = objH;
            ((int[]) jVar.f400d)[i15] = -2;
        }
        return objH;
    }

    @Override // n90.l
    public final n90.n o() {
        return new b20.b(this.f32205d.f30749a, this.f32207f).e();
    }

    @Override // m0.c, kotlinx.serialization.encoding.Decoder
    public final int p() {
        i0.w wVar = this.f32207f;
        long jO = wVar.o();
        int i11 = (int) jO;
        if (jO == i11) {
            return i11;
        }
        i0.w.t(wVar, "Failed to parse int for input '" + jO + '\'', 0, null, 6);
        throw null;
    }

    @Override // m0.c, kotlinx.serialization.encoding.Decoder
    public final String r() {
        boolean z11 = this.f32211j.f30773c;
        i0.w wVar = this.f32207f;
        return z11 ? wVar.r() : wVar.p();
    }

    @Override // m0.c, kotlinx.serialization.encoding.Decoder
    public final long s() {
        return this.f32207f.o();
    }

    @Override // m0.c, kotlinx.serialization.encoding.Decoder
    public final boolean v() {
        j jVar = this.f32212k;
        if (!(jVar != null ? jVar.f32172b : false)) {
            i0.w wVar = this.f32207f;
            int iE = wVar.E(wVar.T());
            String str = (String) wVar.f22749f;
            int length = str.length() - iE;
            boolean z11 = false;
            if (length >= 4 && iE != -1) {
                int i11 = 0;
                while (true) {
                    if (i11 < 4) {
                        if (Address.ADDRESS_NULL_PLACEHOLDER.charAt(i11) != str.charAt(iE + i11)) {
                            break;
                        }
                        i11++;
                    } else if (length <= 4 || k.g(str.charAt(iE + 4)) != 0) {
                        z11 = true;
                        wVar.f22745b = iE + 4;
                    }
                }
            }
            if (!z11) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008b, code lost:
    
        r13 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b3, code lost:
    
        r1 = r3.f398b;
        r6 = (int[]) r3.f400d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bc, code lost:
    
        if (r6[r1] != (-2)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00be, code lost:
    
        r6[r1] = -1;
        r3.f398b = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c3, code lost:
    
        r1 = r3.f398b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c5, code lost:
    
        if (r1 == (-1)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c7, code lost:
    
        r3.f398b = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ca, code lost:
    
        r1 = kotlin.text.StringsKt.I(6, r4.subSequence(0, r2.f22745b).toString(), r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010d, code lost:
    
        throw new kotlinx.serialization.json.internal.JsonDecodingException("Encountered an unknown key '" + r5 + "' at offset " + r1 + " at path: " + r3.m() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + ((java.lang.Object) o90.k.n(r1, r4)));
     */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0136 A[SYNTHETIC] */
    @Override // l90.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int w(kotlinx.serialization.descriptors.SerialDescriptor r23) {
        /*
            Method dump skipped, instruction units count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o90.w.w(kotlinx.serialization.descriptors.SerialDescriptor):int");
    }

    @Override // m0.c, kotlinx.serialization.encoding.Decoder
    public final Decoder x(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return z.a(serialDescriptor) ? new i(this.f32207f, this.f32205d) : this;
    }
}
