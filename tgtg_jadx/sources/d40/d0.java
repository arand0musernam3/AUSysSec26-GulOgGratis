package d40;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f14130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f14131f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f14132g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f14133h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f14134i;

    public d0(int i11, String str, int i12, int i13, long j9, long j11, long j12, String str2, List list) {
        this.f14126a = i11;
        this.f14127b = str;
        this.f14128c = i12;
        this.f14129d = i13;
        this.f14130e = j9;
        this.f14131f = j11;
        this.f14132g = j12;
        this.f14133h = str2;
        this.f14134i = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            d0 d0Var = (d0) ((p1) obj);
            if (this.f14126a == d0Var.f14126a && this.f14127b.equals(d0Var.f14127b) && this.f14128c == d0Var.f14128c && this.f14129d == d0Var.f14129d && this.f14130e == d0Var.f14130e && this.f14131f == d0Var.f14131f && this.f14132g == d0Var.f14132g) {
                String str = d0Var.f14133h;
                String str2 = this.f14133h;
                if (str2 != null ? str2.equals(str) : str == null) {
                    List list = d0Var.f14134i;
                    List list2 = this.f14134i;
                    if (list2 != null ? list2.equals(list) : list == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f14126a ^ 1000003) * 1000003) ^ this.f14127b.hashCode()) * 1000003) ^ this.f14128c) * 1000003) ^ this.f14129d) * 1000003;
        long j9 = this.f14130e;
        int i11 = (iHashCode ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        long j11 = this.f14131f;
        int i12 = (i11 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f14132g;
        int i13 = (i12 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        String str = this.f14133h;
        int iHashCode2 = (i13 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f14134i;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApplicationExitInfo{pid=");
        sb2.append(this.f14126a);
        sb2.append(", processName=");
        sb2.append(this.f14127b);
        sb2.append(", reasonCode=");
        sb2.append(this.f14128c);
        sb2.append(", importance=");
        sb2.append(this.f14129d);
        sb2.append(", pss=");
        sb2.append(this.f14130e);
        sb2.append(", rss=");
        sb2.append(this.f14131f);
        sb2.append(", timestamp=");
        sb2.append(this.f14132g);
        sb2.append(", traceFile=");
        sb2.append(this.f14133h);
        sb2.append(", buildIdMappingForArch=");
        return e0.f.p(sb2, this.f14134i, "}");
    }
}
