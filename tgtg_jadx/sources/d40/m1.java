package d40;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f14272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f14273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f14274e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f14275f;

    public m1(int i11, int i12, long j9, long j11, boolean z11, int i13) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.f14270a = i11;
        if (str == null) {
            c50.w.l("Null model");
            throw null;
        }
        this.f14271b = i12;
        this.f14272c = j9;
        this.f14273d = j11;
        this.f14274e = z11;
        this.f14275f = i13;
        if (str2 == null) {
            c50.w.l("Null manufacturer");
            throw null;
        }
        if (str3 != null) {
            return;
        }
        c50.w.l("Null modelClass");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        if (this.f14270a != m1Var.f14270a) {
            return false;
        }
        String str = Build.MODEL;
        if (!str.equals(str) || this.f14271b != m1Var.f14271b || this.f14272c != m1Var.f14272c || this.f14273d != m1Var.f14273d || this.f14274e != m1Var.f14274e || this.f14275f != m1Var.f14275f) {
            return false;
        }
        String str2 = Build.MANUFACTURER;
        if (!str2.equals(str2)) {
            return false;
        }
        String str3 = Build.PRODUCT;
        return str3.equals(str3);
    }

    public final int hashCode() {
        int iHashCode = (((((this.f14270a ^ 1000003) * 1000003) ^ Build.MODEL.hashCode()) * 1000003) ^ this.f14271b) * 1000003;
        long j9 = this.f14272c;
        int i11 = (iHashCode ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        long j11 = this.f14273d;
        return ((((((((i11 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f14274e ? 1231 : 1237)) * 1000003) ^ this.f14275f) * 1000003) ^ Build.MANUFACTURER.hashCode()) * 1000003) ^ Build.PRODUCT.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceData{arch=");
        sb2.append(this.f14270a);
        sb2.append(", model=");
        sb2.append(Build.MODEL);
        sb2.append(", availableProcessors=");
        sb2.append(this.f14271b);
        sb2.append(", totalRam=");
        sb2.append(this.f14272c);
        sb2.append(", diskSpace=");
        sb2.append(this.f14273d);
        sb2.append(", isEmulator=");
        sb2.append(this.f14274e);
        sb2.append(", state=");
        sb2.append(this.f14275f);
        sb2.append(", manufacturer=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(", modelClass=");
        return r8.k.p(sb2, Build.PRODUCT, "}");
    }
}
