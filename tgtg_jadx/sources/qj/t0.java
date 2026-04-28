package qj;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.feature.tabprofile.manageaccount.notificationsettings.ui.NotificationSettingsActivity;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t0 extends m {

    @NotNull
    public static final Parcelable.Creator<t0> CREATOR = new a0(18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f37144a;

    public t0(HashMap map) {
        this.f37144a = map;
    }

    @Override // qj.m
    public final f70.b a() {
        return new f70.b(NotificationSettingsActivity.class, jb.u.x(new Pair("DEEPLINK_PARAMETERS_MAP", this.f37144a), new Pair("OPEN_SYSTEM_SETTINGS", Boolean.FALSE)), false, false, false, null, null, null, null, false, 1020);
    }

    @Override // qj.m
    public final String b() {
        return "settings/notifications";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t0) && Intrinsics.areEqual(this.f37144a, ((t0) obj).f37144a);
    }

    public final int hashCode() {
        HashMap map = this.f37144a;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public final String toString() {
        return "NotificationsDeepLink(deeplinkParametersMap=" + this.f37144a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        HashMap map = this.f37144a;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
