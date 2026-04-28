package com.google.android.play.core.install;

import c50.w;
import org.bouncycastle.jcajce.provider.asymmetric.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zza {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f12745e;

    public zza(int i11, long j9, long j11, int i12, String str) {
        this.f12741a = i11;
        this.f12742b = j9;
        this.f12743c = j11;
        this.f12744d = i12;
        if (str != null) {
            this.f12745e = str;
        } else {
            w.l("Null packageName");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zza) {
            zza zzaVar = (zza) obj;
            if (this.f12741a == zzaVar.f12741a && this.f12742b == zzaVar.f12742b && this.f12743c == zzaVar.f12743c && this.f12744d == zzaVar.f12744d && this.f12745e.equals(zzaVar.f12745e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11 = this.f12741a ^ 1000003;
        long j9 = this.f12742b;
        long j11 = this.f12743c;
        return (((((((i11 * 1000003) ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f12744d) * 1000003) ^ this.f12745e.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallState{installStatus=");
        sb2.append(this.f12741a);
        sb2.append(", bytesDownloaded=");
        sb2.append(this.f12742b);
        a.v(sb2, ", totalBytesToDownload=", this.f12743c, ", installErrorCode=");
        sb2.append(this.f12744d);
        sb2.append(", packageName=");
        sb2.append(this.f12745e);
        sb2.append("}");
        return sb2.toString();
    }
}
