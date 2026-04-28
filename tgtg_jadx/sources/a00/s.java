package a00;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class s extends rz.a {

    @NonNull
    public static final Parcelable.Creator<s> CREATOR = new g0(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f165e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f166f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f167g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f168h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b0 f169i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f170j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d f171k;
    public final String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ResultReceiver f172m;

    public s(v vVar, x xVar, byte[] bArr, ArrayList arrayList, Double d3, ArrayList arrayList2, k kVar, Integer num, b0 b0Var, String str, d dVar, String str2, ResultReceiver resultReceiver) {
        this.f172m = resultReceiver;
        if (str2 != null) {
            try {
                s sVarD = d(new JSONObject(str2));
                this.f161a = sVarD.f161a;
                this.f162b = sVarD.f162b;
                this.f163c = sVarD.f163c;
                this.f164d = sVarD.f164d;
                this.f165e = sVarD.f165e;
                this.f166f = sVarD.f166f;
                this.f167g = sVarD.f167g;
                this.f168h = sVarD.f168h;
                this.f169i = sVarD.f169i;
                this.f170j = sVarD.f170j;
                this.f171k = sVarD.f171k;
                this.l = str2;
                return;
            } catch (JSONException e5) {
                throw new IllegalArgumentException(e5);
            }
        }
        com.google.android.gms.common.internal.i0.h(vVar);
        this.f161a = vVar;
        com.google.android.gms.common.internal.i0.h(xVar);
        this.f162b = xVar;
        com.google.android.gms.common.internal.i0.h(bArr);
        this.f163c = bArr;
        com.google.android.gms.common.internal.i0.h(arrayList);
        this.f164d = arrayList;
        this.f165e = d3;
        this.f166f = arrayList2;
        this.f167g = kVar;
        this.f168h = num;
        this.f169i = b0Var;
        if (str != null) {
            try {
                this.f170j = c.a(str);
            } catch (AttestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException e11) {
                throw new IllegalArgumentException(e11);
            }
        } else {
            this.f170j = null;
        }
        this.f171k = dVar;
        this.l = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0210  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static a00.s d(org.json.JSONObject r32) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a00.s.d(org.json.JSONObject):a00.s");
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        List list2 = sVar.f164d;
        List list3 = sVar.f166f;
        if (com.google.android.gms.common.internal.i0.k(this.f161a, sVar.f161a) && com.google.android.gms.common.internal.i0.k(this.f162b, sVar.f162b) && Arrays.equals(this.f163c, sVar.f163c) && com.google.android.gms.common.internal.i0.k(this.f165e, sVar.f165e)) {
            List list4 = this.f164d;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.f166f) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && com.google.android.gms.common.internal.i0.k(this.f167g, sVar.f167g) && com.google.android.gms.common.internal.i0.k(this.f168h, sVar.f168h) && com.google.android.gms.common.internal.i0.k(this.f169i, sVar.f169i) && com.google.android.gms.common.internal.i0.k(this.f170j, sVar.f170j) && com.google.android.gms.common.internal.i0.k(this.f171k, sVar.f171k) && com.google.android.gms.common.internal.i0.k(this.l, sVar.l))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f161a, this.f162b, Integer.valueOf(Arrays.hashCode(this.f163c)), this.f164d, this.f165e, this.f166f, this.f167g, this.f168h, this.f169i, this.f170j, this.f171k, this.l});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f161a);
        String strValueOf2 = String.valueOf(this.f162b);
        String strC = vz.c.c(this.f163c);
        String strValueOf3 = String.valueOf(this.f164d);
        String strValueOf4 = String.valueOf(this.f166f);
        String strValueOf5 = String.valueOf(this.f167g);
        String strValueOf6 = String.valueOf(this.f169i);
        String strValueOf7 = String.valueOf(this.f170j);
        String strValueOf8 = String.valueOf(this.f171k);
        StringBuilder sbT = e0.f.t("PublicKeyCredentialCreationOptions{\n rp=", strValueOf, ", \n user=", strValueOf2, ", \n challenge=");
        j4.s.A(sbT, strC, ", \n parameters=", strValueOf3, ", \n timeoutSeconds=");
        sbT.append(this.f165e);
        sbT.append(", \n excludeList=");
        sbT.append(strValueOf4);
        sbT.append(", \n authenticatorSelection=");
        sbT.append(strValueOf5);
        sbT.append(", \n requestId=");
        sbT.append(this.f168h);
        sbT.append(", \n tokenBinding=");
        sbT.append(strValueOf6);
        sbT.append(", \n attestationConveyancePreference=");
        return e0.f.o(sbT, strValueOf7, ", \n authenticationExtensions=", strValueOf8, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.a0(parcel, 2, this.f161a, i11);
        lx.u.a0(parcel, 3, this.f162b, i11);
        lx.u.T(parcel, 4, this.f163c);
        lx.u.f0(parcel, 5, this.f164d);
        Double d3 = this.f165e;
        if (d3 != null) {
            lx.u.g0(parcel, 6, 8);
            parcel.writeDouble(d3.doubleValue());
        }
        lx.u.f0(parcel, 7, this.f166f);
        lx.u.a0(parcel, 8, this.f167g, i11);
        lx.u.Z(parcel, 9, this.f168h);
        lx.u.a0(parcel, 10, this.f169i, i11);
        c cVar = this.f170j;
        lx.u.b0(cVar == null ? null : cVar.toString(), parcel, 11);
        lx.u.a0(parcel, 12, this.f171k, i11);
        lx.u.b0(this.l, parcel, 13);
        lx.u.a0(parcel, 14, this.f172m, i11);
        lx.u.i0(iH0, parcel);
    }
}
