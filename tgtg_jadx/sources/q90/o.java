package q90;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f36554k = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f36555m = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pattern f36556n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f36559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f36560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f36561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f36562f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f36563g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f36564h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f36565i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f36566j;

    public o(String str, String str2, long j9, String str3, String str4, boolean z11, boolean z12, boolean z13, boolean z14, String str5) {
        this.f36557a = str;
        this.f36558b = str2;
        this.f36559c = j9;
        this.f36560d = str3;
        this.f36561e = str4;
        this.f36562f = z11;
        this.f36563g = z12;
        this.f36564h = z13;
        this.f36565i = z14;
        this.f36566j = str5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.areEqual(oVar.f36557a, this.f36557a) && Intrinsics.areEqual(oVar.f36558b, this.f36558b) && oVar.f36559c == this.f36559c && Intrinsics.areEqual(oVar.f36560d, this.f36560d) && Intrinsics.areEqual(oVar.f36561e, this.f36561e) && oVar.f36562f == this.f36562f && oVar.f36563g == this.f36563g && oVar.f36564h == this.f36564h && oVar.f36565i == this.f36565i && Intrinsics.areEqual(oVar.f36566j, this.f36566j);
    }

    public final int hashCode() {
        int iE = r8.k.e(r8.k.e(r8.k.e(r8.k.e(l1.b(l1.b(e0.f.b(l1.b(l1.b(527, 31, this.f36557a), 31, this.f36558b), 31, this.f36559c), 31, this.f36560d), 31, this.f36561e), 31, this.f36562f), 31, this.f36563g), 31, this.f36564h), 31, this.f36565i);
        String str = this.f36566j;
        return iE + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f36557a);
        sb2.append('=');
        sb2.append(this.f36558b);
        if (this.f36564h) {
            long j9 = this.f36559c;
            if (j9 == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                String str = ((DateFormat) v90.c.f42183a.get()).format(new Date(j9));
                str.getClass();
                sb2.append(str);
            }
        }
        if (!this.f36565i) {
            sb2.append("; domain=");
            sb2.append(this.f36560d);
        }
        sb2.append("; path=");
        sb2.append(this.f36561e);
        if (this.f36562f) {
            sb2.append("; secure");
        }
        if (this.f36563g) {
            sb2.append("; httponly");
        }
        String str2 = this.f36566j;
        if (str2 != null) {
            sb2.append("; samesite=");
            sb2.append(str2);
        }
        return sb2.toString();
    }
}
