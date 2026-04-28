package wy;

import c50.w;
import com.google.android.gms.internal.measurement.te;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f43562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f43563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f43564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f43565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f43566f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f43567g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f43568h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f43569i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final byte[] f43570j;

    public h(String str, Integer num, k kVar, long j9, long j11, HashMap map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f43561a = str;
        this.f43562b = num;
        this.f43563c = kVar;
        this.f43564d = j9;
        this.f43565e = j11;
        this.f43566f = map;
        this.f43567g = num2;
        this.f43568h = str2;
        this.f43569i = bArr;
        this.f43570j = bArr2;
    }

    public final String a(String str) {
        String str2 = (String) this.f43566f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f43566f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final te c() {
        te teVar = new te();
        String str = this.f43561a;
        if (str == null) {
            w.l("Null transportName");
            return null;
        }
        teVar.f11894b = str;
        teVar.f11895c = this.f43562b;
        teVar.f11900h = this.f43567g;
        teVar.f11901i = this.f43568h;
        teVar.f11893a = this.f43569i;
        teVar.f11902j = this.f43570j;
        k kVar = this.f43563c;
        if (kVar == null) {
            w.l("Null encodedPayload");
            return null;
        }
        teVar.f11896d = kVar;
        teVar.f11897e = Long.valueOf(this.f43564d);
        teVar.f11898f = Long.valueOf(this.f43565e);
        teVar.f11899g = new HashMap(this.f43566f);
        return teVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f43561a.equals(hVar.f43561a)) {
                Integer num = hVar.f43562b;
                Integer num2 = this.f43562b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    if (this.f43563c.equals(hVar.f43563c) && this.f43564d == hVar.f43564d && this.f43565e == hVar.f43565e && this.f43566f.equals(hVar.f43566f)) {
                        Integer num3 = hVar.f43567g;
                        Integer num4 = this.f43567g;
                        if (num4 != null ? num4.equals(num3) : num3 == null) {
                            String str = hVar.f43568h;
                            String str2 = this.f43568h;
                            if (str2 != null ? str2.equals(str) : str == null) {
                                if (Arrays.equals(this.f43569i, hVar.f43569i) && Arrays.equals(this.f43570j, hVar.f43570j)) {
                                    return true;
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
        int iHashCode = (this.f43561a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f43562b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f43563c.hashCode()) * 1000003;
        long j9 = this.f43564d;
        int i11 = (iHashCode2 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        long j11 = this.f43565e;
        int iHashCode3 = (((i11 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f43566f.hashCode()) * 1000003;
        Integer num2 = this.f43567g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f43568h;
        return ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.f43569i)) * 1000003) ^ Arrays.hashCode(this.f43570j);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f43561a + ", code=" + this.f43562b + ", encodedPayload=" + this.f43563c + ", eventMillis=" + this.f43564d + ", uptimeMillis=" + this.f43565e + ", autoMetadata=" + this.f43566f + ", productId=" + this.f43567g + ", pseudonymousId=" + this.f43568h + ", experimentIdsClear=" + Arrays.toString(this.f43569i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f43570j) + "}";
    }
}
