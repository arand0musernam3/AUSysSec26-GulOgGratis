package d40;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f14217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f14218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f14219f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u1 f14220g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l2 f14221h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k2 f14222i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final v1 f14223j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f14224k;
    public final int l;

    public j0(String str, String str2, String str3, long j9, Long l, boolean z11, u1 u1Var, l2 l2Var, k2 k2Var, v1 v1Var, List list, int i11) {
        this.f14214a = str;
        this.f14215b = str2;
        this.f14216c = str3;
        this.f14217d = j9;
        this.f14218e = l;
        this.f14219f = z11;
        this.f14220g = u1Var;
        this.f14221h = l2Var;
        this.f14222i = k2Var;
        this.f14223j = v1Var;
        this.f14224k = list;
        this.l = i11;
    }

    @Override // d40.m2
    public final i0 a() {
        i0 i0Var = new i0();
        i0Var.f14186a = this.f14214a;
        i0Var.f14187b = this.f14215b;
        i0Var.f14188c = this.f14216c;
        i0Var.f14189d = this.f14217d;
        i0Var.f14190e = this.f14218e;
        i0Var.f14191f = this.f14219f;
        i0Var.f14192g = this.f14220g;
        i0Var.f14193h = this.f14221h;
        i0Var.f14194i = this.f14222i;
        i0Var.f14195j = this.f14223j;
        i0Var.f14196k = this.f14224k;
        i0Var.l = this.l;
        i0Var.f14197m = (byte) 7;
        return i0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m2) {
            j0 j0Var = (j0) ((m2) obj);
            if (this.f14214a.equals(j0Var.f14214a) && this.f14215b.equals(j0Var.f14215b)) {
                String str = j0Var.f14216c;
                String str2 = this.f14216c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.f14217d == j0Var.f14217d) {
                        Long l = j0Var.f14218e;
                        Long l7 = this.f14218e;
                        if (l7 != null ? l7.equals(l) : l == null) {
                            if (this.f14219f == j0Var.f14219f && this.f14220g.equals(j0Var.f14220g)) {
                                l2 l2Var = j0Var.f14221h;
                                l2 l2Var2 = this.f14221h;
                                if (l2Var2 != null ? l2Var2.equals(l2Var) : l2Var == null) {
                                    k2 k2Var = j0Var.f14222i;
                                    k2 k2Var2 = this.f14222i;
                                    if (k2Var2 != null ? k2Var2.equals(k2Var) : k2Var == null) {
                                        v1 v1Var = j0Var.f14223j;
                                        v1 v1Var2 = this.f14223j;
                                        if (v1Var2 != null ? v1Var2.equals(v1Var) : v1Var == null) {
                                            List list = j0Var.f14224k;
                                            List list2 = this.f14224k;
                                            if (list2 != null ? list2.equals(list) : list == null) {
                                                if (this.l == j0Var.l) {
                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f14214a.hashCode() ^ 1000003) * 1000003) ^ this.f14215b.hashCode()) * 1000003;
        String str = this.f14216c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j9 = this.f14217d;
        int i11 = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003;
        Long l = this.f14218e;
        int iHashCode3 = (((((i11 ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f14219f ? 1231 : 1237)) * 1000003) ^ this.f14220g.hashCode()) * 1000003;
        l2 l2Var = this.f14221h;
        int iHashCode4 = (iHashCode3 ^ (l2Var == null ? 0 : l2Var.hashCode())) * 1000003;
        k2 k2Var = this.f14222i;
        int iHashCode5 = (iHashCode4 ^ (k2Var == null ? 0 : k2Var.hashCode())) * 1000003;
        v1 v1Var = this.f14223j;
        int iHashCode6 = (iHashCode5 ^ (v1Var == null ? 0 : v1Var.hashCode())) * 1000003;
        List list = this.f14224k;
        return ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f14214a);
        sb2.append(", identifier=");
        sb2.append(this.f14215b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f14216c);
        sb2.append(", startedAt=");
        sb2.append(this.f14217d);
        sb2.append(", endedAt=");
        sb2.append(this.f14218e);
        sb2.append(", crashed=");
        sb2.append(this.f14219f);
        sb2.append(", app=");
        sb2.append(this.f14220g);
        sb2.append(", user=");
        sb2.append(this.f14221h);
        sb2.append(", os=");
        sb2.append(this.f14222i);
        sb2.append(", device=");
        sb2.append(this.f14223j);
        sb2.append(", events=");
        sb2.append(this.f14224k);
        sb2.append(", generatorType=");
        return r8.k.i(this.l, "}", sb2);
    }
}
