package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class uc implements qz.q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f11935c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile k30.c0 f11936d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11938b;

    public uc(Context context, vc vcVar) {
        this.f11937a = 0;
        this.f11938b = vcVar.u() ? ma.b(context, vcVar.t()) : vcVar.t();
    }

    @Override // qz.q
    public void accept(Object obj, Object obj2) {
        int i11 = this.f11937a;
        String str = this.f11938b;
        d10.g gVar = (d10.g) obj2;
        ca caVar = (ca) obj;
        switch (i11) {
            case 1:
                int i12 = aa.f11252a;
                y9 y9Var = new y9(gVar);
                ba baVar = (ba) caVar.getService();
                Parcel parcelL = baVar.L();
                o5.c(parcelL, y9Var);
                parcelL.writeString(str);
                parcelL.writeString("");
                parcelL.writeString(null);
                baVar.M(11, parcelL);
                break;
            default:
                int i13 = aa.f11252a;
                y9 y9Var2 = new y9(gVar);
                ba baVar2 = (ba) caVar.getService();
                Parcel parcelL2 = baVar2.L();
                o5.c(parcelL2, y9Var2);
                parcelL2.writeString(str);
                baVar2.M(5, parcelL2);
                break;
        }
    }

    public /* synthetic */ uc(String str, int i11) {
        this.f11937a = i11;
        this.f11938b = str;
    }
}
