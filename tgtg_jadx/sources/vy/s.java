package vy;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class s extends e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f42603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f42604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f42605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f42606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f42607e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f42608f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f42609g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i0 f42610h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b0 f42611i;

    public s(long j9, Integer num, a0 a0Var, long j11, byte[] bArr, String str, long j12, i0 i0Var, b0 b0Var) {
        this.f42603a = j9;
        this.f42604b = num;
        this.f42605c = a0Var;
        this.f42606d = j11;
        this.f42607e = bArr;
        this.f42608f = str;
        this.f42609g = j12;
        this.f42610h = i0Var;
        this.f42611i = b0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            s sVar = (s) e0Var;
            if (this.f42603a == sVar.f42603a) {
                Integer num = sVar.f42604b;
                Integer num2 = this.f42604b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    a0 a0Var = sVar.f42605c;
                    a0 a0Var2 = this.f42605c;
                    if (a0Var2 != null ? a0Var2.equals(a0Var) : a0Var == null) {
                        if (this.f42606d == sVar.f42606d) {
                            if (Arrays.equals(this.f42607e, e0Var instanceof s ? ((s) e0Var).f42607e : sVar.f42607e)) {
                                String str = sVar.f42608f;
                                String str2 = this.f42608f;
                                if (str2 != null ? str2.equals(str) : str == null) {
                                    if (this.f42609g == sVar.f42609g) {
                                        i0 i0Var = sVar.f42610h;
                                        i0 i0Var2 = this.f42610h;
                                        if (i0Var2 != null ? i0Var2.equals(i0Var) : i0Var == null) {
                                            b0 b0Var = sVar.f42611i;
                                            b0 b0Var2 = this.f42611i;
                                            if (b0Var2 != null ? b0Var2.equals(b0Var) : b0Var == null) {
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
        return false;
    }

    public final int hashCode() {
        long j9 = this.f42603a;
        int i11 = (((int) (j9 ^ (j9 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f42604b;
        int iHashCode = (i11 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        a0 a0Var = this.f42605c;
        int iHashCode2 = (iHashCode ^ (a0Var == null ? 0 : a0Var.hashCode())) * 1000003;
        long j11 = this.f42606d;
        int iHashCode3 = (((iHashCode2 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f42607e)) * 1000003;
        String str = this.f42608f;
        int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j12 = this.f42609g;
        int i12 = (iHashCode4 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        i0 i0Var = this.f42610h;
        int iHashCode5 = (i12 ^ (i0Var == null ? 0 : i0Var.hashCode())) * 1000003;
        b0 b0Var = this.f42611i;
        return iHashCode5 ^ (b0Var != null ? b0Var.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f42603a + ", eventCode=" + this.f42604b + ", complianceData=" + this.f42605c + ", eventUptimeMs=" + this.f42606d + ", sourceExtension=" + Arrays.toString(this.f42607e) + ", sourceExtensionJsonProto3=" + this.f42608f + ", timezoneOffsetSeconds=" + this.f42609g + ", networkConnectionInfo=" + this.f42610h + ", experimentIds=" + this.f42611i + "}";
    }
}
