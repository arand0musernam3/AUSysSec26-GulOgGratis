package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.i0;
import java.util.Arrays;
import lx.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class Status extends rz.a implements p, ReflectedParcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PendingIntent f11061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pz.b f11062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Status f11054e = new Status(0, null, null, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Status f11055f = new Status(14, null, null, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Status f11056g = new Status(8, null, null, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Status f11057h = new Status(15, null, null, null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Status f11058i = new Status(16, null, null, null);

    @NonNull
    public static final Parcelable.Creator<Status> CREATOR = new s(3);

    public Status(int i11, String str, PendingIntent pendingIntent, pz.b bVar) {
        this.f11059a = i11;
        this.f11060b = str;
        this.f11061c = pendingIntent;
        this.f11062d = bVar;
    }

    public final boolean d() {
        return this.f11059a <= 0;
    }

    public final void e(int i11, Activity activity) throws IntentSender.SendIntentException {
        PendingIntent pendingIntent = this.f11061c;
        if (pendingIntent != null) {
            Bundle bundle = Build.VERSION.SDK_INT >= 34 ? ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle() : null;
            i0.h(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i11, null, 0, 0, 0, bundle);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f11059a == status.f11059a && i0.k(this.f11060b, status.f11060b) && i0.k(this.f11061c, status.f11061c) && i0.k(this.f11062d, status.f11062d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11059a), this.f11060b, this.f11061c, this.f11062d});
    }

    public final String toString() {
        com.google.android.gms.common.internal.q qVar = new com.google.android.gms.common.internal.q(this);
        String strY = this.f11060b;
        if (strY == null) {
            strY = xz.b.y(this.f11059a);
        }
        qVar.b(strY, "statusCode");
        qVar.b(this.f11061c, "resolution");
        return qVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        u.g0(parcel, 1, 4);
        parcel.writeInt(this.f11059a);
        u.b0(this.f11060b, parcel, 2);
        u.a0(parcel, 3, this.f11061c, i11);
        u.a0(parcel, 4, this.f11062d, i11);
        u.i0(iH0, parcel);
    }

    @Override // com.google.android.gms.common.api.p
    public final Status c() {
        return this;
    }
}
