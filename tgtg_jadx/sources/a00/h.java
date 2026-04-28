package a00;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends j {

    @NonNull
    public static final Parcelable.Creator<h> CREATOR = new p0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k00.q0 f110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k00.q0 f111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k00.q0 f112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f113d;

    public h(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        com.google.android.gms.common.internal.i0.h(bArr);
        k00.q0 q0VarJ = k00.q0.j(bArr.length, bArr);
        com.google.android.gms.common.internal.i0.h(bArr2);
        k00.q0 q0VarJ2 = k00.q0.j(bArr2.length, bArr2);
        com.google.android.gms.common.internal.i0.h(bArr3);
        k00.q0 q0VarJ3 = k00.q0.j(bArr3.length, bArr3);
        this.f110a = q0VarJ;
        this.f111b = q0VarJ2;
        this.f112c = q0VarJ3;
        com.google.android.gms.common.internal.i0.h(strArr);
        this.f113d = strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0149 A[Catch: JSONException -> 0x0021, zzho -> 0x01ad, TRY_LEAVE, TryCatch #3 {zzho -> 0x01ad, blocks: (B:41:0x0115, B:47:0x0138, B:49:0x0149, B:54:0x015f, B:57:0x017b, B:59:0x0190, B:61:0x0195, B:64:0x01b0, B:65:0x01b5, B:66:0x01b6, B:67:0x01bd, B:72:0x01ca, B:74:0x01d7, B:76:0x01e4, B:77:0x01f9, B:78:0x01fe, B:79:0x01ff, B:80:0x0204, B:86:0x0226, B:87:0x022b), top: B:123:0x0115, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0225  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject d() {
        /*
            Method dump skipped, instruction units count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a00.h.d():org.json.JSONObject");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return com.google.android.gms.common.internal.i0.k(this.f110a, hVar.f110a) && com.google.android.gms.common.internal.i0.k(this.f111b, hVar.f111b) && com.google.android.gms.common.internal.i0.k(this.f112c, hVar.f112c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f110a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f111b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f112c}))});
    }

    public final String toString() {
        j30.g gVar = new j30.g(getClass().getSimpleName(), 4);
        k00.i0 i0Var = k00.k0.f25662d;
        byte[] bArrL = this.f110a.l();
        gVar.H(i0Var.c(bArrL.length, bArrL), "keyHandle");
        byte[] bArrL2 = this.f111b.l();
        gVar.H(i0Var.c(bArrL2.length, bArrL2), "clientDataJSON");
        byte[] bArrL3 = this.f112c.l();
        gVar.H(i0Var.c(bArrL3.length, bArrL3), "attestationObject");
        gVar.H(Arrays.toString(this.f113d), "transports");
        return gVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.T(parcel, 2, this.f110a.l());
        lx.u.T(parcel, 3, this.f111b.l());
        lx.u.T(parcel, 4, this.f112c.l());
        lx.u.c0(parcel, 5, this.f113d);
        lx.u.i0(iH0, parcel);
    }
}
