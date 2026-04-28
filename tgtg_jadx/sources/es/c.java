package es;

import com.app.tgtg.model.remote.PushNotificationsSettings;
import i90.h;
import kotlin.jvm.internal.Intrinsics;
import m90.c1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PushNotificationsSettings f16349a;

    public /* synthetic */ c(int i11, PushNotificationsSettings pushNotificationsSettings) {
        if (1 == (i11 & 1)) {
            this.f16349a = pushNotificationsSettings;
        } else {
            c1.j(i11, 1, a.f16348a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.areEqual(this.f16349a, ((c) obj).f16349a);
    }

    public final int hashCode() {
        PushNotificationsSettings pushNotificationsSettings = this.f16349a;
        if (pushNotificationsSettings == null) {
            return 0;
        }
        return pushNotificationsSettings.hashCode();
    }

    public final String toString() {
        return "PushNotificationSettingsRequest(pushNotificationsSettings=" + this.f16349a + ")";
    }

    public c(PushNotificationsSettings pushNotificationsSettings) {
        this.f16349a = pushNotificationsSettings;
    }
}
