package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends rz.a {
    public static final Parcelable.Creator<y> CREATOR = new com.google.android.gms.common.internal.v(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f12891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q1.e f12892b;

    public y(Bundle bundle) {
        this.f12891a = bundle;
    }

    public final Map d() {
        if (this.f12892b == null) {
            q1.e eVar = new q1.e(0);
            Bundle bundle = this.f12891a;
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        eVar.put(str, str2);
                    }
                }
            }
            this.f12892b = eVar;
        }
        return this.f12892b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.S(parcel, 2, this.f12891a);
        lx.u.i0(iH0, parcel);
    }
}
