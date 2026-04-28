package qj;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f37145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f37146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f37147c;

    public t1(Uri uri) {
        uri.getClass();
        this.f37145a = uri;
        ArrayList arrayList = new ArrayList(uri.getPathSegments());
        this.f37146b = arrayList;
        this.f37147c = kotlin.collections.x0.d(new Pair("source", uri.getQueryParameter("source")), new Pair("campaign_id", uri.getQueryParameter("campaign_id")), new Pair("deviceid", uri.getQueryParameter("deviceid")), new Pair("optOut", uri.getQueryParameter("optOut")), new Pair("reminderMonday", uri.getQueryParameter("reminderMonday")), new Pair("reminderTuesday", uri.getQueryParameter("reminderTuesday")), new Pair("reminderWednesday", uri.getQueryParameter("reminderWednesday")), new Pair("reminderThursday", uri.getQueryParameter("reminderThursday")), new Pair("reminderFriday", uri.getQueryParameter("reminderFriday")), new Pair("reminderSaturday", uri.getQueryParameter("reminderSaturday")), new Pair("reminderSunday", uri.getQueryParameter("reminderSunday")), new Pair("identifier", uri.getQueryParameter("identifier")), new Pair("parameter", uri.getQueryParameter("parameter")));
        if (Intrinsics.areEqual(uri.getScheme(), "toogoodtogoapp")) {
            String host = uri.getHost();
            host.getClass();
            arrayList.add(0, host);
        }
    }

    public final String a(int i11) {
        ArrayList arrayList = this.f37146b;
        if (arrayList.size() <= i11) {
            return "";
        }
        Object obj = arrayList.get(i11);
        obj.getClass();
        return (String) obj;
    }

    public final String b(int i11) {
        String lowerCase = a(i11).toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t1) && Intrinsics.areEqual(this.f37145a, ((t1) obj).f37145a);
    }

    public final int hashCode() {
        return this.f37145a.hashCode();
    }

    public final String toString() {
        return "LinkData(uri=" + this.f37145a + ")";
    }
}
