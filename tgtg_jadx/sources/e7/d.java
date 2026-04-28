package e7;

import android.util.Base64;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f15815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f15817f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f15818g;

    public d(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        this.f15812a = str;
        str2.getClass();
        this.f15813b = str2;
        this.f15814c = str3;
        list.getClass();
        this.f15815d = list;
        this.f15816e = str4;
        this.f15817f = str5;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("-");
        sb2.append(str2);
        sb2.append("-");
        sb2.append(str3);
        this.f15818g = e0.f.o(sb2, "-", str4, "-", str5);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f15812a + ", mProviderPackage: " + this.f15813b + ", mQuery: " + this.f15814c + ", mSystemFont: " + this.f15816e + ", mVariationSettings: " + this.f15817f + ", mCertificates:");
        int i11 = 0;
        while (true) {
            List list = this.f15815d;
            if (i11 >= list.size()) {
                sb2.append("}mCertificatesArray: 0");
                return sb2.toString();
            }
            sb2.append(" [");
            List list2 = (List) list.get(i11);
            for (int i12 = 0; i12 < list2.size(); i12++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString((byte[]) list2.get(i12), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
            i11++;
        }
    }
}
