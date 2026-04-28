package zendesk.conversationkit.android.internal;

import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w.a0;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lzendesk/conversationkit/android/internal/AndroidBuild;", "", "deviceManufacturer", "", "deviceModel", "deviceOperatingSystemVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDeviceManufacturer", "()Ljava/lang/String;", "getDeviceModel", "getDeviceOperatingSystemVersion", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AndroidBuild {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String deviceManufacturer;

    @NotNull
    private final String deviceModel;

    @NotNull
    private final String deviceOperatingSystemVersion;

    public AndroidBuild(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        a0.C(str, str2, str3);
        this.deviceManufacturer = str;
        this.deviceModel = str2;
        this.deviceOperatingSystemVersion = str3;
    }

    public static /* synthetic */ AndroidBuild copy$default(AndroidBuild androidBuild, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = androidBuild.deviceManufacturer;
        }
        if ((i11 & 2) != 0) {
            str2 = androidBuild.deviceModel;
        }
        if ((i11 & 4) != 0) {
            str3 = androidBuild.deviceOperatingSystemVersion;
        }
        return androidBuild.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDeviceOperatingSystemVersion() {
        return this.deviceOperatingSystemVersion;
    }

    @NotNull
    public final AndroidBuild copy(@NotNull String deviceManufacturer, @NotNull String deviceModel, @NotNull String deviceOperatingSystemVersion) {
        deviceManufacturer.getClass();
        deviceModel.getClass();
        deviceOperatingSystemVersion.getClass();
        return new AndroidBuild(deviceManufacturer, deviceModel, deviceOperatingSystemVersion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AndroidBuild)) {
            return false;
        }
        AndroidBuild androidBuild = (AndroidBuild) other;
        return Intrinsics.areEqual(this.deviceManufacturer, androidBuild.deviceManufacturer) && Intrinsics.areEqual(this.deviceModel, androidBuild.deviceModel) && Intrinsics.areEqual(this.deviceOperatingSystemVersion, androidBuild.deviceOperatingSystemVersion);
    }

    @NotNull
    public final String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    @NotNull
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    @NotNull
    public final String getDeviceOperatingSystemVersion() {
        return this.deviceOperatingSystemVersion;
    }

    public int hashCode() {
        return this.deviceOperatingSystemVersion.hashCode() + l1.b(this.deviceManufacturer.hashCode() * 31, 31, this.deviceModel);
    }

    @NotNull
    public String toString() {
        String str = this.deviceManufacturer;
        String str2 = this.deviceModel;
        return k.p(e0.f.t("AndroidBuild(deviceManufacturer=", str, ", deviceModel=", str2, ", deviceOperatingSystemVersion="), this.deviceOperatingSystemVersion, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/internal/AndroidBuild$Companion;", "", "<init>", "()V", "create", "Lzendesk/conversationkit/android/internal/AndroidBuild;", "create$zendesk_conversationkit_conversationkit_android", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AndroidBuild create$zendesk_conversationkit_conversationkit_android() {
            String str = Build.MANUFACTURER;
            if (str == null) {
                str = "";
            }
            String str2 = Build.MODEL;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = Build.VERSION.RELEASE;
            return new AndroidBuild(str, str2, str3 != null ? str3 : "");
        }

        private Companion() {
        }
    }
}
