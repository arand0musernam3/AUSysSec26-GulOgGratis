package com.google.android.gms.location;

import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.i0;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import lx.u;
import m00.m;
import rz.a;
import s00.e;
import s00.f;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class LocationResult extends a implements ReflectedParcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f12119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f12118b = Collections.EMPTY_LIST;

    @NonNull
    public static final Parcelable.Creator<LocationResult> CREATOR = new e(0);

    public LocationResult(List list) {
        this.f12119a = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        List list = ((LocationResult) obj).f12119a;
        int i11 = Build.VERSION.SDK_INT;
        List<Location> list2 = this.f12119a;
        if (i11 >= 31) {
            return list2.equals(list);
        }
        if (list2.size() != list.size()) {
            return false;
        }
        Iterator it = list.iterator();
        for (Location location : list2) {
            Location location2 = (Location) it.next();
            if (Double.compare(location.getLatitude(), location2.getLatitude()) != 0 || Double.compare(location.getLongitude(), location2.getLongitude()) != 0 || location.getTime() != location2.getTime() || location.getElapsedRealtimeNanos() != location2.getElapsedRealtimeNanos() || !i0.k(location.getProvider(), location2.getProvider())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12119a});
    }

    public final String toString() {
        String string;
        StringBuilder sb2 = new StringBuilder("LocationResult");
        DecimalFormat decimalFormat = f.f38513a;
        List<Location> list = this.f12119a;
        sb2.ensureCapacity(list.size() * 100);
        sb2.append("[");
        boolean z11 = false;
        for (Location location : list) {
            DecimalFormat decimalFormat2 = f.f38514b;
            sb2.ensureCapacity(100);
            if (location == null) {
                sb2.append((String) null);
            } else {
                sb2.append("{");
                sb2.append(location.getProvider());
                sb2.append(", ");
                if (Build.VERSION.SDK_INT >= 31 ? b7.a.k(location) : location.isFromMockProvider()) {
                    sb2.append("mock, ");
                }
                DecimalFormat decimalFormat3 = f.f38513a;
                sb2.append(decimalFormat3.format(location.getLatitude()));
                sb2.append(MessageLogView.COMMA_SEPARATOR);
                sb2.append(decimalFormat3.format(location.getLongitude()));
                if (location.hasAccuracy()) {
                    sb2.append("±");
                    sb2.append(decimalFormat2.format(location.getAccuracy()));
                    sb2.append("m");
                }
                if (location.hasAltitude()) {
                    sb2.append(", alt=");
                    sb2.append(decimalFormat2.format(location.getAltitude()));
                    if (location.hasVerticalAccuracy()) {
                        sb2.append("±");
                        sb2.append(decimalFormat2.format(location.getVerticalAccuracyMeters()));
                    }
                    sb2.append("m");
                }
                if (location.hasSpeed()) {
                    sb2.append(", spd=");
                    sb2.append(decimalFormat2.format(location.getSpeed()));
                    if (location.hasSpeedAccuracy()) {
                        sb2.append("±");
                        sb2.append(decimalFormat2.format(location.getSpeedAccuracyMetersPerSecond()));
                    }
                    sb2.append("m/s");
                }
                if (location.hasBearing()) {
                    sb2.append(", brg=");
                    sb2.append(decimalFormat2.format(location.getBearing()));
                    if (location.hasBearingAccuracy()) {
                        sb2.append("±");
                        sb2.append(decimalFormat2.format(location.getBearingAccuracyDegrees()));
                    }
                    sb2.append("°");
                }
                Bundle extras = location.getExtras();
                String string2 = extras != null ? extras.getString("floorLabel") : null;
                if (string2 != null) {
                    sb2.append(", fl=");
                    sb2.append(string2);
                }
                Bundle extras2 = location.getExtras();
                String string3 = extras2 != null ? extras2.getString("levelId") : null;
                if (string3 != null) {
                    sb2.append(", lv=");
                    sb2.append(string3);
                }
                long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
                sb2.append(", ert=");
                long elapsedRealtimeNanos = (location.getElapsedRealtimeNanos() / 1000000) + jCurrentTimeMillis;
                if (elapsedRealtimeNanos >= 0) {
                    string = m.f28683a.format(new Date(elapsedRealtimeNanos));
                } else {
                    SimpleDateFormat simpleDateFormat = m.f28683a;
                    string = Long.toString(elapsedRealtimeNanos);
                }
                sb2.append(string);
                sb2.append('}');
            }
            sb2.append(", ");
            z11 = true;
        }
        if (z11) {
            sb2.setLength(sb2.length() - 2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        u.f0(parcel, 1, this.f12119a);
        u.i0(iH0, parcel);
    }
}
