package a00;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;
import k00.e1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q extends rz.a {

    @NonNull
    public static final Parcelable.Creator<q> CREATOR = new g0(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k00.q0 f141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f144f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f145g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f146h;

    public q(String str, String str2, byte[] bArr, h hVar, g gVar, i iVar, e eVar, String str3) {
        k00.q0 q0VarJ = bArr == null ? null : k00.q0.j(bArr.length, bArr);
        boolean z11 = false;
        com.google.android.gms.common.internal.i0.a("Must provide a response object.", (hVar != null && gVar == null && iVar == null) || (hVar == null && gVar != null && iVar == null) || (hVar == null && gVar == null && iVar != null));
        if (iVar != null || (str != null && q0VarJ != null)) {
            z11 = true;
        }
        com.google.android.gms.common.internal.i0.a("Must provide id and rawId if not an error response.", z11);
        this.f139a = str;
        this.f140b = str2;
        this.f141c = q0VarJ;
        this.f142d = hVar;
        this.f143e = gVar;
        this.f144f = iVar;
        this.f145g = eVar;
        this.f146h = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return com.google.android.gms.common.internal.i0.k(this.f139a, qVar.f139a) && com.google.android.gms.common.internal.i0.k(this.f140b, qVar.f140b) && com.google.android.gms.common.internal.i0.k(this.f141c, qVar.f141c) && com.google.android.gms.common.internal.i0.k(this.f142d, qVar.f142d) && com.google.android.gms.common.internal.i0.k(this.f143e, qVar.f143e) && com.google.android.gms.common.internal.i0.k(this.f144f, qVar.f144f) && com.google.android.gms.common.internal.i0.k(this.f145g, qVar.f145g) && com.google.android.gms.common.internal.i0.k(this.f146h, qVar.f146h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f139a, this.f140b, this.f141c, this.f143e, this.f142d, this.f144f, this.f145g, this.f146h});
    }

    public final String toString() {
        k00.q0 q0Var = this.f141c;
        String strC = vz.c.c(q0Var == null ? null : q0Var.l());
        String strValueOf = String.valueOf(this.f142d);
        String strValueOf2 = String.valueOf(this.f143e);
        String strValueOf3 = String.valueOf(this.f144f);
        String strValueOf4 = String.valueOf(this.f145g);
        StringBuilder sbT = e0.f.t("PublicKeyCredential{\n id='", this.f139a, "', \n type='", this.f140b, "', \n rawId=");
        j4.s.A(sbT, strC, ", \n registerResponse=", strValueOf, ", \n signResponse=");
        j4.s.A(sbT, strValueOf2, ", \n errorResponse=", strValueOf3, ", \n extensionsClientOutputs=");
        return e0.f.o(sbT, strValueOf4, ", \n authenticatorAttachment='", this.f146h, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        e1.f25637a.w();
        throw null;
    }
}
