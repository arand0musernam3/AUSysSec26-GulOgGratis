package q90;

import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class z {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Regex f36633e = new Regex("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Regex f36634f = new Regex(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f36637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f36638d;

    public z(String str, String[] strArr, String str2, String str3) {
        w.a0.C(str, str2, str3);
        strArr.getClass();
        this.f36635a = str;
        this.f36636b = str2;
        this.f36637c = str3;
        this.f36638d = strArr;
    }

    public final Charset a(Charset charset) {
        String str;
        String[] strArr = this.f36638d;
        int i11 = 0;
        int iA = b80.c.a(0, strArr.length - 1, 2);
        if (iA < 0) {
            str = null;
            break;
        }
        while (!kotlin.text.y.k(strArr[i11], "charset", true)) {
            if (i11 == iA) {
                str = null;
                break;
            }
            i11 += 2;
        }
        str = strArr[i11 + 1];
        if (str == null) {
            return charset;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof z) && Intrinsics.areEqual(((z) obj).f36635a, this.f36635a);
    }

    public final int hashCode() {
        return this.f36635a.hashCode();
    }

    public final String toString() {
        return this.f36635a;
    }
}
