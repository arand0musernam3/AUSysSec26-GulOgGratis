package x10;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import zendesk.core.android.internal.DateKtxConstants;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l implements Comparable, Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new s00.e(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Calendar f43695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f43696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f43698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f43699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f43700f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f43701g;

    public l(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarA = r.a(calendar);
        this.f43695a = calendarA;
        this.f43696b = calendarA.get(2);
        this.f43697c = calendarA.get(1);
        this.f43698d = calendarA.getMaximum(7);
        this.f43699e = calendarA.getActualMaximum(5);
        this.f43700f = calendarA.getTimeInMillis();
    }

    public static l a(int i11, int i12) {
        Calendar calendarC = r.c(null);
        calendarC.set(1, i11);
        calendarC.set(2, i12);
        return new l(calendarC);
    }

    public static l c(long j9) {
        Calendar calendarC = r.c(null);
        calendarC.setTimeInMillis(j9);
        return new l(calendarC);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f43695a.compareTo(((l) obj).f43695a);
    }

    public final String d() {
        if (this.f43701g == null) {
            long timeInMillis = this.f43695a.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = r.f43713a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone(DateKtxConstants.UTC_TIMEZONE));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.f43701g = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.f43701g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e(l lVar) {
        if (this.f43695a instanceof GregorianCalendar) {
            return (lVar.f43696b - this.f43696b) + ((lVar.f43697c - this.f43697c) * 12);
        }
        i4.a.f("Only Gregorian calendars are supported.");
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f43696b == lVar.f43696b && this.f43697c == lVar.f43697c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f43696b), Integer.valueOf(this.f43697c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f43697c);
        parcel.writeInt(this.f43696b);
    }
}
