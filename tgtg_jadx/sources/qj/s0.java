package qj;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.feature.tabprofile.manageaccount.notificationsettings.ui.NotificationSettingsActivity;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class s0 extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s0 f37141a = new s0();

    @NotNull
    public static final Parcelable.Creator<s0> CREATOR = new a0(17);

    @Override // qj.m
    public final f70.b a() {
        return new f70.b(NotificationSettingsActivity.class, jb.u.x(new Pair("OPEN_SYSTEM_SETTINGS", Boolean.TRUE)), false, false, false, null, null, null, null, false, 1020);
    }

    @Override // qj.m
    public final String b() {
        return "me/settings/notifications/status";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof s0);
    }

    public final int hashCode() {
        return -145312058;
    }

    public final String toString() {
        return "NotificationStatusDeepLink";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
