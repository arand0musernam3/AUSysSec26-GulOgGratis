package zendesk.conversationkit.android.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.telephony.TelephonyManager;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w.a0;
import w2.l1;
import zendesk.messaging.android.internal.analytics.AnalyticsProcessor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 12\u00020\u0001:\u00011BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0018\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0019J\u000e\u0010\u001a\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u001bJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b\u001dJ\u000e\u0010\u001e\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u001fJ\u000e\u0010 \u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b!J\u000e\u0010\"\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b#J\u000e\u0010$\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b%J\u000e\u0010&\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b'J\u000e\u0010(\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b)Je\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0014\u0010\b\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0014\u0010\t\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0014\u0010\n\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0014\u0010\u000b\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u00062"}, d2 = {"Lzendesk/conversationkit/android/internal/HostAppInfo;", "", "appPackage", "", "appInstallerPackage", "appName", "appVersion", "deviceManufacturer", "deviceModel", "deviceOperatingSystem", "deviceOperatingSystemVersion", "deviceCarrierName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppPackage$zendesk_conversationkit_conversationkit_android", "()Ljava/lang/String;", "getAppInstallerPackage$zendesk_conversationkit_conversationkit_android", "getAppName$zendesk_conversationkit_conversationkit_android", "getAppVersion$zendesk_conversationkit_conversationkit_android", "getDeviceManufacturer$zendesk_conversationkit_conversationkit_android", "getDeviceModel$zendesk_conversationkit_conversationkit_android", "getDeviceOperatingSystem$zendesk_conversationkit_conversationkit_android", "getDeviceOperatingSystemVersion$zendesk_conversationkit_conversationkit_android", "getDeviceCarrierName$zendesk_conversationkit_conversationkit_android", "component1", "component1$zendesk_conversationkit_conversationkit_android", "component2", "component2$zendesk_conversationkit_conversationkit_android", "component3", "component3$zendesk_conversationkit_conversationkit_android", "component4", "component4$zendesk_conversationkit_conversationkit_android", "component5", "component5$zendesk_conversationkit_conversationkit_android", "component6", "component6$zendesk_conversationkit_conversationkit_android", "component7", "component7$zendesk_conversationkit_conversationkit_android", "component8", "component8$zendesk_conversationkit_conversationkit_android", "component9", "component9$zendesk_conversationkit_conversationkit_android", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class HostAppInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String appInstallerPackage;

    @Nullable
    private final String appName;

    @NotNull
    private final String appPackage;

    @NotNull
    private final String appVersion;

    @NotNull
    private final String deviceCarrierName;

    @NotNull
    private final String deviceManufacturer;

    @NotNull
    private final String deviceModel;

    @NotNull
    private final String deviceOperatingSystem;

    @NotNull
    private final String deviceOperatingSystemVersion;

    public HostAppInfo(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9) {
        b3.i.B(str, str2, str4, str5, str6);
        a0.C(str7, str8, str9);
        this.appPackage = str;
        this.appInstallerPackage = str2;
        this.appName = str3;
        this.appVersion = str4;
        this.deviceManufacturer = str5;
        this.deviceModel = str6;
        this.deviceOperatingSystem = str7;
        this.deviceOperatingSystemVersion = str8;
        this.deviceCarrierName = str9;
    }

    public static /* synthetic */ HostAppInfo copy$default(HostAppInfo hostAppInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = hostAppInfo.appPackage;
        }
        if ((i11 & 2) != 0) {
            str2 = hostAppInfo.appInstallerPackage;
        }
        if ((i11 & 4) != 0) {
            str3 = hostAppInfo.appName;
        }
        if ((i11 & 8) != 0) {
            str4 = hostAppInfo.appVersion;
        }
        if ((i11 & 16) != 0) {
            str5 = hostAppInfo.deviceManufacturer;
        }
        if ((i11 & 32) != 0) {
            str6 = hostAppInfo.deviceModel;
        }
        if ((i11 & 64) != 0) {
            str7 = hostAppInfo.deviceOperatingSystem;
        }
        if ((i11 & 128) != 0) {
            str8 = hostAppInfo.deviceOperatingSystemVersion;
        }
        if ((i11 & 256) != 0) {
            str9 = hostAppInfo.deviceCarrierName;
        }
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        String str14 = str5;
        String str15 = str3;
        return hostAppInfo.copy(str, str2, str15, str4, str14, str12, str13, str10, str11);
    }

    @NotNull
    public static final HostAppInfo from(@NotNull Context context) {
        return INSTANCE.from(context);
    }

    @NotNull
    /* JADX INFO: renamed from: component1$zendesk_conversationkit_conversationkit_android, reason: from getter */
    public final String getAppPackage() {
        return this.appPackage;
    }

    @NotNull
    /* JADX INFO: renamed from: component2$zendesk_conversationkit_conversationkit_android, reason: from getter */
    public final String getAppInstallerPackage() {
        return this.appInstallerPackage;
    }

    @Nullable
    /* JADX INFO: renamed from: component3$zendesk_conversationkit_conversationkit_android, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    /* JADX INFO: renamed from: component4$zendesk_conversationkit_conversationkit_android, reason: from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component5$zendesk_conversationkit_conversationkit_android, reason: from getter */
    public final String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    @NotNull
    /* JADX INFO: renamed from: component6$zendesk_conversationkit_conversationkit_android, reason: from getter */
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    @NotNull
    /* JADX INFO: renamed from: component7$zendesk_conversationkit_conversationkit_android, reason: from getter */
    public final String getDeviceOperatingSystem() {
        return this.deviceOperatingSystem;
    }

    @NotNull
    /* JADX INFO: renamed from: component8$zendesk_conversationkit_conversationkit_android, reason: from getter */
    public final String getDeviceOperatingSystemVersion() {
        return this.deviceOperatingSystemVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component9$zendesk_conversationkit_conversationkit_android, reason: from getter */
    public final String getDeviceCarrierName() {
        return this.deviceCarrierName;
    }

    @NotNull
    public final HostAppInfo copy(@NotNull String appPackage, @NotNull String appInstallerPackage, @Nullable String appName, @NotNull String appVersion, @NotNull String deviceManufacturer, @NotNull String deviceModel, @NotNull String deviceOperatingSystem, @NotNull String deviceOperatingSystemVersion, @NotNull String deviceCarrierName) {
        b3.i.B(appPackage, appInstallerPackage, appVersion, deviceManufacturer, deviceModel);
        deviceOperatingSystem.getClass();
        deviceOperatingSystemVersion.getClass();
        deviceCarrierName.getClass();
        return new HostAppInfo(appPackage, appInstallerPackage, appName, appVersion, deviceManufacturer, deviceModel, deviceOperatingSystem, deviceOperatingSystemVersion, deviceCarrierName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HostAppInfo)) {
            return false;
        }
        HostAppInfo hostAppInfo = (HostAppInfo) other;
        return Intrinsics.areEqual(this.appPackage, hostAppInfo.appPackage) && Intrinsics.areEqual(this.appInstallerPackage, hostAppInfo.appInstallerPackage) && Intrinsics.areEqual(this.appName, hostAppInfo.appName) && Intrinsics.areEqual(this.appVersion, hostAppInfo.appVersion) && Intrinsics.areEqual(this.deviceManufacturer, hostAppInfo.deviceManufacturer) && Intrinsics.areEqual(this.deviceModel, hostAppInfo.deviceModel) && Intrinsics.areEqual(this.deviceOperatingSystem, hostAppInfo.deviceOperatingSystem) && Intrinsics.areEqual(this.deviceOperatingSystemVersion, hostAppInfo.deviceOperatingSystemVersion) && Intrinsics.areEqual(this.deviceCarrierName, hostAppInfo.deviceCarrierName);
    }

    @NotNull
    public final String getAppInstallerPackage$zendesk_conversationkit_conversationkit_android() {
        return this.appInstallerPackage;
    }

    @Nullable
    public final String getAppName$zendesk_conversationkit_conversationkit_android() {
        return this.appName;
    }

    @NotNull
    public final String getAppPackage$zendesk_conversationkit_conversationkit_android() {
        return this.appPackage;
    }

    @NotNull
    public final String getAppVersion$zendesk_conversationkit_conversationkit_android() {
        return this.appVersion;
    }

    @NotNull
    public final String getDeviceCarrierName$zendesk_conversationkit_conversationkit_android() {
        return this.deviceCarrierName;
    }

    @NotNull
    public final String getDeviceManufacturer$zendesk_conversationkit_conversationkit_android() {
        return this.deviceManufacturer;
    }

    @NotNull
    public final String getDeviceModel$zendesk_conversationkit_conversationkit_android() {
        return this.deviceModel;
    }

    @NotNull
    public final String getDeviceOperatingSystem$zendesk_conversationkit_conversationkit_android() {
        return this.deviceOperatingSystem;
    }

    @NotNull
    public final String getDeviceOperatingSystemVersion$zendesk_conversationkit_conversationkit_android() {
        return this.deviceOperatingSystemVersion;
    }

    public int hashCode() {
        int iB = l1.b(this.appPackage.hashCode() * 31, 31, this.appInstallerPackage);
        String str = this.appName;
        return this.deviceCarrierName.hashCode() + l1.b(l1.b(l1.b(l1.b(l1.b((iB + (str == null ? 0 : str.hashCode())) * 31, 31, this.appVersion), 31, this.deviceManufacturer), 31, this.deviceModel), 31, this.deviceOperatingSystem), 31, this.deviceOperatingSystemVersion);
    }

    @NotNull
    public String toString() {
        String str = this.appPackage;
        String str2 = this.appInstallerPackage;
        String str3 = this.appName;
        String str4 = this.appVersion;
        String str5 = this.deviceManufacturer;
        String str6 = this.deviceModel;
        String str7 = this.deviceOperatingSystem;
        String str8 = this.deviceOperatingSystemVersion;
        String str9 = this.deviceCarrierName;
        StringBuilder sbT = e0.f.t("HostAppInfo(appPackage=", str, ", appInstallerPackage=", str2, ", appName=");
        s.A(sbT, str3, ", appVersion=", str4, ", deviceManufacturer=");
        s.A(sbT, str5, ", deviceModel=", str6, ", deviceOperatingSystem=");
        s.A(sbT, str7, ", deviceOperatingSystemVersion=", str8, ", deviceCarrierName=");
        return k.p(sbT, str9, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lzendesk/conversationkit/android/internal/HostAppInfo$Companion;", "", "<init>", "()V", "from", "Lzendesk/conversationkit/android/internal/HostAppInfo;", "context", "Landroid/content/Context;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HostAppInfo from(@NotNull Context context) {
            String str;
            String networkOperatorName;
            context.getClass();
            AndroidBuild androidBuildCreate$zendesk_conversationkit_conversationkit_android = AndroidBuild.INSTANCE.create$zendesk_conversationkit_conversationkit_android();
            PackageManager packageManager = context.getPackageManager();
            packageManager.getClass();
            String packageName = context.getPackageName();
            String str2 = packageName == null ? "" : packageName;
            try {
                String str3 = packageManager.getPackageInfo(str2, 0).versionName;
                if (str3 == null) {
                    str3 = "";
                }
                str = str3;
            } catch (PackageManager.NameNotFoundException unused) {
                str = "";
            }
            String installerPackageName = packageManager.getInstallerPackageName(str2);
            String str4 = installerPackageName == null ? "" : installerPackageName;
            String string = packageManager.getApplicationLabel(context.getApplicationInfo()).toString();
            String deviceManufacturer = androidBuildCreate$zendesk_conversationkit_conversationkit_android.getDeviceManufacturer();
            String deviceModel = androidBuildCreate$zendesk_conversationkit_conversationkit_android.getDeviceModel();
            String deviceOperatingSystemVersion = androidBuildCreate$zendesk_conversationkit_conversationkit_android.getDeviceOperatingSystemVersion();
            Object systemService = context.getSystemService("phone");
            TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
            return new HostAppInfo(str2, str4, string, str, deviceManufacturer, deviceModel, AnalyticsProcessor.CHANNEL_NAME, deviceOperatingSystemVersion, (telephonyManager == null || (networkOperatorName = telephonyManager.getNetworkOperatorName()) == null) ? "" : networkOperatorName);
        }

        private Companion() {
        }
    }
}
