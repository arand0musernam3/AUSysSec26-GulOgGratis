package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.i0;
import java.util.Arrays;
import kotlin.jvm.internal.LongCompanionObject;
import lx.u;
import m00.i;
import m00.m;
import qj.f1;
import rz.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class LocationRequest extends a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<LocationRequest> CREATOR = new f1(29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f12106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f12107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f12109e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f12110f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f12111g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f12112h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f12113i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f12114j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f12115k;
    public final boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final WorkSource f12116m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i f12117n;

    public LocationRequest(int i11, long j9, long j11, long j12, long j13, long j14, int i12, float f11, boolean z11, long j15, int i13, int i14, boolean z12, WorkSource workSource, i iVar) {
        this.f12105a = i11;
        if (i11 == 105) {
            this.f12106b = LongCompanionObject.MAX_VALUE;
        } else {
            this.f12106b = j9;
        }
        this.f12107c = j11;
        this.f12108d = j12;
        this.f12109e = j13 == LongCompanionObject.MAX_VALUE ? j14 : Math.min(Math.max(1L, j13 - SystemClock.elapsedRealtime()), j14);
        this.f12110f = i12;
        this.f12111g = f11;
        this.f12112h = z11;
        this.f12113i = j15 != -1 ? j15 : j9;
        this.f12114j = i13;
        this.f12115k = i14;
        this.l = z12;
        this.f12116m = workSource;
        this.f12117n = iVar;
    }

    public static String e(long j9) {
        String string;
        if (j9 == LongCompanionObject.MAX_VALUE) {
            return "∞";
        }
        StringBuilder sb2 = m.f28684b;
        synchronized (sb2) {
            sb2.setLength(0);
            m.a(j9, sb2);
            string = sb2.toString();
        }
        return string;
    }

    public final boolean d() {
        long j9 = this.f12108d;
        return j9 > 0 && (j9 >> 1) >= this.f12106b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        int i11 = this.f12105a;
        if (i11 != locationRequest.f12105a) {
            return false;
        }
        if ((i11 == 105 || this.f12106b == locationRequest.f12106b) && this.f12107c == locationRequest.f12107c && d() == locationRequest.d()) {
            return (!d() || this.f12108d == locationRequest.f12108d) && this.f12109e == locationRequest.f12109e && this.f12110f == locationRequest.f12110f && this.f12111g == locationRequest.f12111g && this.f12112h == locationRequest.f12112h && this.f12114j == locationRequest.f12114j && this.f12115k == locationRequest.f12115k && this.l == locationRequest.l && this.f12116m.equals(locationRequest.f12116m) && i0.k(this.f12117n, locationRequest.f12117n);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f12105a), Long.valueOf(this.f12106b), Long.valueOf(this.f12107c), this.f12116m});
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0130 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.LocationRequest.toString():java.lang.String");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        int i12 = this.f12105a;
        u.g0(parcel, 1, 4);
        parcel.writeInt(i12);
        long j9 = this.f12106b;
        u.g0(parcel, 2, 8);
        parcel.writeLong(j9);
        long j11 = this.f12107c;
        u.g0(parcel, 3, 8);
        parcel.writeLong(j11);
        u.g0(parcel, 6, 4);
        parcel.writeInt(this.f12110f);
        u.g0(parcel, 7, 4);
        parcel.writeFloat(this.f12111g);
        u.g0(parcel, 8, 8);
        parcel.writeLong(this.f12108d);
        u.g0(parcel, 9, 4);
        parcel.writeInt(this.f12112h ? 1 : 0);
        u.g0(parcel, 10, 8);
        parcel.writeLong(this.f12109e);
        long j12 = this.f12113i;
        u.g0(parcel, 11, 8);
        parcel.writeLong(j12);
        u.g0(parcel, 12, 4);
        parcel.writeInt(this.f12114j);
        u.g0(parcel, 13, 4);
        parcel.writeInt(this.f12115k);
        u.g0(parcel, 15, 4);
        parcel.writeInt(this.l ? 1 : 0);
        u.a0(parcel, 16, this.f12116m, i11);
        u.a0(parcel, 17, this.f12117n, i11);
        u.i0(iH0, parcel);
    }
}
