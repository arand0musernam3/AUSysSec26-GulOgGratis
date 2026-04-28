package a60;

import com.adyen.checkout.components.core.Address;
import com.braze.h2;
import com.squareup.moshi.JsonDataException;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import m0.i1;
import zendesk.core.ui.android.internal.xml.richtext.codeblock.CodeBlockHandler;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements Closeable, Flushable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String[] f898i = new String[128];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f900b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f903e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ia0.g f905g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f906h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f901c = new String[32];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f902d = new int[32];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f904f = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f899a = 1;

    static {
        for (int i11 = 0; i11 <= 31; i11++) {
            f898i[i11] = String.format("\\u%04x", Integer.valueOf(i11));
        }
        String[] strArr = f898i;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = CodeBlockHandler.NEWLINE_REGEX;
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public q(ia0.g gVar) {
        int[] iArr = new int[32];
        this.f900b = iArr;
        this.f905g = gVar;
        iArr[0] = 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void H(ia0.g r6, java.lang.String r7) {
        /*
            r0 = 34
            r6.z0(r0)
            int r1 = r7.length()
            r2 = 0
            r3 = r2
        Lb:
            if (r2 >= r1) goto L36
            char r4 = r7.charAt(r2)
            r5 = 128(0x80, float:1.8E-43)
            if (r4 >= r5) goto L1c
            java.lang.String[] r5 = a60.q.f898i
            r4 = r5[r4]
            if (r4 != 0) goto L29
            goto L33
        L1c:
            r5 = 8232(0x2028, float:1.1535E-41)
            if (r4 != r5) goto L23
            java.lang.String r4 = "\\u2028"
            goto L29
        L23:
            r5 = 8233(0x2029, float:1.1537E-41)
            if (r4 != r5) goto L33
            java.lang.String r4 = "\\u2029"
        L29:
            if (r3 >= r2) goto L2e
            r6.E0(r3, r2, r7)
        L2e:
            r6.F0(r4)
            int r3 = r2 + 1
        L33:
            int r2 = r2 + 1
            goto Lb
        L36:
            if (r3 >= r1) goto L3b
            r6.E0(r3, r1, r7)
        L3b:
            r6.z0(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a60.q.H(ia0.g, java.lang.String):void");
    }

    public final q A() {
        if (this.f903e) {
            h2.b("null cannot be used as a map key in JSON at path ".concat(t()));
            return null;
        }
        if (this.f906h != null) {
            this.f906h = null;
            return this;
        }
        a();
        this.f905g.F0(Address.ADDRESS_NULL_PLACEHOLDER);
        int[] iArr = this.f902d;
        int i11 = this.f899a - 1;
        iArr[i11] = iArr[i11] + 1;
        return this;
    }

    public final void B(int i11, int i12, char c3) {
        int i13;
        int i14 = this.f899a;
        int i15 = this.f904f;
        if (i14 == i15 && ((i13 = this.f900b[i14 - 1]) == i11 || i13 == i12)) {
            this.f904f = ~i15;
            return;
        }
        a();
        int i16 = this.f899a;
        int[] iArr = this.f900b;
        if (i16 == iArr.length) {
            if (i16 == 256) {
                throw new JsonDataException("Nesting too deep at " + t() + ": circular reference?");
            }
            this.f900b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f901c;
            this.f901c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f902d;
            this.f902d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f900b;
        int i17 = this.f899a;
        this.f899a = i17 + 1;
        iArr3[i17] = i11;
        this.f902d[i17] = 0;
        this.f905g.z0(c3);
    }

    public final int G() {
        int i11 = this.f899a;
        if (i11 != 0) {
            return this.f900b[i11 - 1];
        }
        h2.b("JsonWriter is closed.");
        return 0;
    }

    public final q I(long j9) {
        if (this.f903e) {
            this.f903e = false;
            u(Long.toString(j9));
            return this;
        }
        L();
        a();
        this.f905g.F0(Long.toString(j9));
        int[] iArr = this.f902d;
        int i11 = this.f899a - 1;
        iArr[i11] = iArr[i11] + 1;
        return this;
    }

    public final q J(String str) {
        if (str == null) {
            A();
            return this;
        }
        if (this.f903e) {
            this.f903e = false;
            u(str);
            return this;
        }
        L();
        a();
        H(this.f905g, str);
        int[] iArr = this.f902d;
        int i11 = this.f899a - 1;
        iArr[i11] = iArr[i11] + 1;
        return this;
    }

    public final void L() {
        if (this.f906h != null) {
            int iG = G();
            ia0.g gVar = this.f905g;
            if (iG == 5) {
                gVar.z0(44);
            } else if (iG != 3) {
                h2.b("Nesting problem.");
                return;
            }
            this.f900b[this.f899a - 1] = 4;
            H(gVar, this.f906h);
            this.f906h = null;
        }
    }

    public final void a() {
        int iG = G();
        int i11 = 2;
        if (iG != 1) {
            ia0.g gVar = this.f905g;
            if (iG == 2) {
                gVar.z0(44);
            } else if (iG == 4) {
                gVar.F0(":");
                i11 = 5;
            } else if (iG == 9) {
                h2.b("Sink from valueSink() was not closed");
                return;
            } else {
                if (iG != 6) {
                    if (iG != 7) {
                        h2.b("Nesting problem.");
                        return;
                    } else {
                        h2.b("JSON must have only one top-level value.");
                        return;
                    }
                }
                i11 = 7;
            }
        }
        this.f900b[this.f899a - 1] = i11;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i11 = this.f899a;
        if (i11 > 1 || (i11 == 1 && this.f900b[i11 - 1] != 7)) {
            i4.a.k("Incomplete document");
        } else {
            this.f899a = 0;
        }
    }

    public final q e() {
        if (this.f903e) {
            h2.b("Array cannot be used as a map key in JSON at path ".concat(t()));
            return null;
        }
        L();
        B(1, 2, '[');
        return this;
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.f899a != 0) {
            return;
        }
        h2.b("JsonWriter is closed.");
    }

    public final q g() {
        if (this.f903e) {
            h2.b("Object cannot be used as a map key in JSON at path ".concat(t()));
            return null;
        }
        L();
        B(3, 5, '{');
        return this;
    }

    public final void p(int i11, int i12, char c3) {
        int iG = G();
        if (iG != i12 && iG != i11) {
            h2.b("Nesting problem.");
            return;
        }
        if (this.f906h != null) {
            i1.q(this.f906h, "Dangling name: ");
            return;
        }
        int i13 = this.f899a;
        int i14 = ~this.f904f;
        if (i13 == i14) {
            this.f904f = i14;
            return;
        }
        int i15 = i13 - 1;
        this.f899a = i15;
        this.f901c[i15] = null;
        int[] iArr = this.f902d;
        int i16 = i13 - 2;
        iArr[i16] = iArr[i16] + 1;
        this.f905g.z0(c3);
    }

    public final q r() {
        this.f903e = false;
        p(3, 5, '}');
        return this;
    }

    public final String t() {
        return h0.d(this.f899a, this.f900b, this.f901c, this.f902d);
    }

    public final q u(String str) {
        if (str == null) {
            c50.w.l("name == null");
            return null;
        }
        if (this.f899a == 0) {
            h2.b("JsonWriter is closed.");
            return null;
        }
        int iG = G();
        if ((iG != 3 && iG != 5) || this.f906h != null || this.f903e) {
            h2.b("Nesting problem.");
            return null;
        }
        this.f906h = str;
        this.f901c[this.f899a - 1] = str;
        return this;
    }
}
