package wy;

import android.util.Base64;
import c50.w;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f43572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ty.d f43573c;

    public i(String str, byte[] bArr, ty.d dVar) {
        this.f43571a = str;
        this.f43572b = bArr;
        this.f43573c = dVar;
    }

    public static t5.a a() {
        t5.a aVar = new t5.a(14, false);
        ty.d dVar = ty.d.DEFAULT;
        if (dVar != null) {
            aVar.f39793d = dVar;
            return aVar;
        }
        w.l("Null priority");
        return null;
    }

    public final i b(ty.d dVar) {
        t5.a aVarA = a();
        aVarA.J(this.f43571a);
        if (dVar == null) {
            w.l("Null priority");
            return null;
        }
        aVarA.f39793d = dVar;
        aVarA.f39792c = this.f43572b;
        return aVarA.f();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f43571a.equals(iVar.f43571a) && Arrays.equals(this.f43572b, iVar.f43572b) && this.f43573c.equals(iVar.f43573c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f43571a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f43572b)) * 1000003) ^ this.f43573c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.f43572b;
        String strEncodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f43571a);
        sb2.append(", ");
        sb2.append(this.f43573c);
        sb2.append(", ");
        return r8.k.p(sb2, strEncodeToString, ")");
    }
}
