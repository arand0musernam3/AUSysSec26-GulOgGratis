package wy;

import c50.w;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ty.c f43580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f43581b;

    public k(ty.c cVar, byte[] bArr) {
        if (cVar == null) {
            w.l("encoding is null");
            throw null;
        }
        if (bArr == null) {
            w.l("bytes is null");
            throw null;
        }
        this.f43580a = cVar;
        this.f43581b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f43580a.equals(kVar.f43580a)) {
            return Arrays.equals(this.f43581b, kVar.f43581b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f43580a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f43581b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f43580a + ", bytes=[...]}";
    }
}
