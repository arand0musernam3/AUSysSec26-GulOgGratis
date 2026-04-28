package vy;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t extends f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f42612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f42613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f42614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f42615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f42616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f42617f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j0 f42618g;

    public t(long j9, long j11, n nVar, Integer num, String str, ArrayList arrayList, j0 j0Var) {
        this.f42612a = j9;
        this.f42613b = j11;
        this.f42614c = nVar;
        this.f42615d = num;
        this.f42616e = str;
        this.f42617f = arrayList;
        this.f42618g = j0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        t tVar = (t) ((f0) obj);
        if (this.f42612a != tVar.f42612a || this.f42613b != tVar.f42613b || !this.f42614c.equals(tVar.f42614c)) {
            return false;
        }
        Integer num = tVar.f42615d;
        Integer num2 = this.f42615d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str = tVar.f42616e;
        String str2 = this.f42616e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!this.f42617f.equals(tVar.f42617f)) {
            return false;
        }
        j0 j0Var = tVar.f42618g;
        j0 j0Var2 = this.f42618g;
        return j0Var2 == null ? j0Var == null : j0Var2.equals(j0Var);
    }

    public final int hashCode() {
        long j9 = this.f42612a;
        long j11 = this.f42613b;
        int iHashCode = (((((((int) (j9 ^ (j9 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f42614c.hashCode()) * 1000003;
        Integer num = this.f42615d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f42616e;
        int iHashCode3 = (((iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f42617f.hashCode()) * 1000003;
        j0 j0Var = this.f42618g;
        return iHashCode3 ^ (j0Var != null ? j0Var.hashCode() : 0);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f42612a + ", requestUptimeMs=" + this.f42613b + ", clientInfo=" + this.f42614c + ", logSource=" + this.f42615d + ", logSourceName=" + this.f42616e + ", logEvents=" + this.f42617f + ", qosTier=" + this.f42618g + "}";
    }
}
