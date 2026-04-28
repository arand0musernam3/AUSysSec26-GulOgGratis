package y00;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.m5;
import com.google.android.gms.internal.measurement.o5;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h0 extends m5 implements j0 {
    public h0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", 0);
    }

    @Override // y00.j0
    public final void B(e eVar, t4 t4Var) {
        Parcel parcelL = L();
        o5.b(parcelL, eVar);
        o5.b(parcelL, t4Var);
        M(12, parcelL);
    }

    @Override // y00.j0
    public final String E(t4 t4Var) {
        Parcel parcelL = L();
        o5.b(parcelL, t4Var);
        Parcel parcelK = K(11, parcelL);
        String string = parcelK.readString();
        parcelK.recycle();
        return string;
    }

    @Override // y00.j0
    public final void F(t4 t4Var) {
        Parcel parcelL = L();
        o5.b(parcelL, t4Var);
        M(4, parcelL);
    }

    @Override // y00.j0
    public final i H(t4 t4Var) {
        Parcel parcelL = L();
        o5.b(parcelL, t4Var);
        Parcel parcelK = K(21, parcelL);
        i iVar = (i) o5.a(parcelK, i.CREATOR);
        parcelK.recycle();
        return iVar;
    }

    @Override // y00.j0
    public final void I(t4 t4Var, d dVar) {
        Parcel parcelL = L();
        o5.b(parcelL, t4Var);
        o5.b(parcelL, dVar);
        M(30, parcelL);
    }

    @Override // y00.j0
    public final void e(t4 t4Var) {
        Parcel parcelL = L();
        o5.b(parcelL, t4Var);
        M(26, parcelL);
    }

    @Override // y00.j0
    public final void f(t4 t4Var) {
        Parcel parcelL = L();
        o5.b(parcelL, t4Var);
        M(6, parcelL);
    }

    @Override // y00.j0
    public final List g(String str, String str2, String str3, boolean z11) {
        Parcel parcelL = L();
        parcelL.writeString(null);
        parcelL.writeString(str2);
        parcelL.writeString(str3);
        ClassLoader classLoader = o5.f11692a;
        parcelL.writeInt(z11 ? 1 : 0);
        Parcel parcelK = K(15, parcelL);
        ArrayList arrayListCreateTypedArrayList = parcelK.createTypedArrayList(o4.CREATOR);
        parcelK.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // y00.j0
    public final void i(t4 t4Var) {
        Parcel parcelL = L();
        o5.b(parcelL, t4Var);
        M(25, parcelL);
    }

    @Override // y00.j0
    public final List j(String str, String str2, boolean z11, t4 t4Var) {
        Parcel parcelL = L();
        parcelL.writeString(str);
        parcelL.writeString(str2);
        ClassLoader classLoader = o5.f11692a;
        parcelL.writeInt(z11 ? 1 : 0);
        o5.b(parcelL, t4Var);
        Parcel parcelK = K(14, parcelL);
        ArrayList arrayListCreateTypedArrayList = parcelK.createTypedArrayList(o4.CREATOR);
        parcelK.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // y00.j0
    public final void l(long j9, String str, String str2, String str3) {
        Parcel parcelL = L();
        parcelL.writeLong(j9);
        parcelL.writeString(str);
        parcelL.writeString(str2);
        parcelL.writeString(str3);
        M(10, parcelL);
    }

    @Override // y00.j0
    public final List m(String str, String str2, String str3) {
        Parcel parcelL = L();
        parcelL.writeString(null);
        parcelL.writeString(str2);
        parcelL.writeString(str3);
        Parcel parcelK = K(17, parcelL);
        ArrayList arrayListCreateTypedArrayList = parcelK.createTypedArrayList(e.CREATOR);
        parcelK.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // y00.j0
    public final void n(t4 t4Var, Bundle bundle, l0 l0Var) {
        Parcel parcelL = L();
        o5.b(parcelL, t4Var);
        o5.b(parcelL, bundle);
        o5.c(parcelL, l0Var);
        M(31, parcelL);
    }

    @Override // y00.j0
    public final void o(t4 t4Var, c4 c4Var, n0 n0Var) {
        Parcel parcelL = L();
        o5.b(parcelL, t4Var);
        o5.b(parcelL, c4Var);
        o5.c(parcelL, n0Var);
        M(29, parcelL);
    }

    @Override // y00.j0
    public final void p(t4 t4Var) {
        Parcel parcelL = L();
        o5.b(parcelL, t4Var);
        M(18, parcelL);
    }

    @Override // y00.j0
    public final void q(t4 t4Var) {
        Parcel parcelL = L();
        o5.b(parcelL, t4Var);
        M(27, parcelL);
    }

    @Override // y00.j0
    public final void s(Bundle bundle, t4 t4Var) {
        Parcel parcelL = L();
        o5.b(parcelL, bundle);
        o5.b(parcelL, t4Var);
        M(19, parcelL);
    }

    @Override // y00.j0
    public final void u(u uVar, t4 t4Var) {
        Parcel parcelL = L();
        o5.b(parcelL, uVar);
        o5.b(parcelL, t4Var);
        M(1, parcelL);
    }

    @Override // y00.j0
    public final byte[] v(String str, u uVar) {
        Parcel parcelL = L();
        o5.b(parcelL, uVar);
        parcelL.writeString(str);
        Parcel parcelK = K(9, parcelL);
        byte[] bArrCreateByteArray = parcelK.createByteArray();
        parcelK.recycle();
        return bArrCreateByteArray;
    }

    @Override // y00.j0
    public final void w(o4 o4Var, t4 t4Var) {
        Parcel parcelL = L();
        o5.b(parcelL, o4Var);
        o5.b(parcelL, t4Var);
        M(2, parcelL);
    }

    @Override // y00.j0
    public final void x(t4 t4Var) {
        Parcel parcelL = L();
        o5.b(parcelL, t4Var);
        M(20, parcelL);
    }

    @Override // y00.j0
    public final List y(String str, String str2, t4 t4Var) {
        Parcel parcelL = L();
        parcelL.writeString(str);
        parcelL.writeString(str2);
        o5.b(parcelL, t4Var);
        Parcel parcelK = K(16, parcelL);
        ArrayList arrayListCreateTypedArrayList = parcelK.createTypedArrayList(e.CREATOR);
        parcelK.recycle();
        return arrayListCreateTypedArrayList;
    }
}
