package com.google.android.gms.internal.measurement;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r6 extends n5 implements e6 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o30.m0 f11819g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(m6 m6Var, o30.m0 m0Var) {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
        this.f11819g = m0Var;
    }

    @Override // com.google.android.gms.internal.measurement.n5
    public final boolean a(int i11, Parcel parcel, Parcel parcel2) throws Throwable {
        if (i11 != 2) {
            return false;
        }
        d();
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.e6
    public final void d() throws Throwable {
        this.f11819g.run();
    }
}
