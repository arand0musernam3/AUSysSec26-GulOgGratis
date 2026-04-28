package ue;

import a60.n;
import e0.f;
import java.io.Closeable;
import java.util.Arrays;
import zendesk.core.ui.android.internal.xml.richtext.codeblock.CodeBlockHandler;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d implements Closeable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f41063e = new String[128];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f41065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f41066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f41067d;

    static {
        for (int i11 = 0; i11 <= 31; i11++) {
            f41063e[i11] = String.format("\\u%04x", Integer.valueOf(i11));
        }
        String[] strArr = f41063e;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = CodeBlockHandler.NEWLINE_REGEX;
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public abstract double A();

    public abstract int B();

    public abstract String G();

    public abstract c H();

    public final void I(int i11) {
        int i12 = this.f41064a;
        int[] iArr = this.f41065b;
        if (i12 == iArr.length) {
            if (i12 == 256) {
                throw new a("Nesting too deep at ".concat(r()));
            }
            this.f41065b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f41066c;
            this.f41066c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f41067d;
            this.f41067d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f41065b;
        int i13 = this.f41064a;
        this.f41064a = i13 + 1;
        iArr3[i13] = i11;
    }

    public abstract int J(n nVar);

    public abstract void L();

    public abstract void O();

    public final void Q(String str) throws b {
        StringBuilder sbR = f.r(str, " at path ");
        sbR.append(r());
        throw new b(sbR.toString());
    }

    public abstract void a();

    public abstract void e();

    public abstract void g();

    public abstract void p();

    public final String r() {
        int i11 = this.f41064a;
        int[] iArr = this.f41065b;
        String[] strArr = this.f41066c;
        int[] iArr2 = this.f41067d;
        StringBuilder sb2 = new StringBuilder("$");
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = iArr[i12];
            if (i13 == 1 || i13 == 2) {
                sb2.append('[');
                sb2.append(iArr2[i12]);
                sb2.append(']');
            } else if (i13 == 3 || i13 == 4 || i13 == 5) {
                sb2.append('.');
                String str = strArr[i12];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        return sb2.toString();
    }

    public abstract boolean t();

    public abstract boolean u();
}
