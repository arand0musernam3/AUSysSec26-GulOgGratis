package zendesk.conversationkit.android.internal.rest.model;

import e0.f;
import i90.h;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u0000 <2\u00020\u0001:\u0002=<Bk\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eB\u007f\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001eJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001eJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001eJ\u0088\u0001\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001eJ\u0010\u0010+\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b3\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b4\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b5\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b6\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b7\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b8\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b9\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b:\u0010\u001eR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b;\u0010\u001e¨\u0006>"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/ClientInfoDto;", "", "", "appId", "appName", "vendor", "sdkVersion", "devicePlatform", "os", "osVersion", "installer", "carrier", "locale", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/internal/rest/model/ClientInfoDto;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lzendesk/conversationkit/android/internal/rest/model/ClientInfoDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAppId", "getAppName", "getVendor", "getSdkVersion", "getDevicePlatform", "getOs", "getOsVersion", "getInstaller", "getCarrier", "getLocale", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ClientInfoDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String appId;

    @Nullable
    private final String appName;

    @Nullable
    private final String carrier;

    @Nullable
    private final String devicePlatform;

    @Nullable
    private final String installer;

    @Nullable
    private final String locale;

    @Nullable
    private final String os;

    @Nullable
    private final String osVersion;

    @Nullable
    private final String sdkVersion;

    @Nullable
    private final String vendor;

    public /* synthetic */ ClientInfoDto(int i11, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, m1 m1Var) {
        if (1023 != (i11 & 1023)) {
            c1.j(i11, 1023, ClientInfoDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.appId = str;
        this.appName = str2;
        this.vendor = str3;
        this.sdkVersion = str4;
        this.devicePlatform = str5;
        this.os = str6;
        this.osVersion = str7;
        this.installer = str8;
        this.carrier = str9;
        this.locale = str10;
    }

    public static /* synthetic */ ClientInfoDto copy$default(ClientInfoDto clientInfoDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = clientInfoDto.appId;
        }
        if ((i11 & 2) != 0) {
            str2 = clientInfoDto.appName;
        }
        if ((i11 & 4) != 0) {
            str3 = clientInfoDto.vendor;
        }
        if ((i11 & 8) != 0) {
            str4 = clientInfoDto.sdkVersion;
        }
        if ((i11 & 16) != 0) {
            str5 = clientInfoDto.devicePlatform;
        }
        if ((i11 & 32) != 0) {
            str6 = clientInfoDto.os;
        }
        if ((i11 & 64) != 0) {
            str7 = clientInfoDto.osVersion;
        }
        if ((i11 & 128) != 0) {
            str8 = clientInfoDto.installer;
        }
        if ((i11 & 256) != 0) {
            str9 = clientInfoDto.carrier;
        }
        if ((i11 & 512) != 0) {
            str10 = clientInfoDto.locale;
        }
        String str11 = str9;
        String str12 = str10;
        String str13 = str7;
        String str14 = str8;
        String str15 = str5;
        String str16 = str6;
        return clientInfoDto.copy(str, str2, str3, str4, str15, str16, str13, str14, str11, str12);
    }

    public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(ClientInfoDto self, b output, SerialDescriptor serialDesc) {
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 0, r1Var, self.appId);
        output.r(serialDesc, 1, r1Var, self.appName);
        output.r(serialDesc, 2, r1Var, self.vendor);
        output.r(serialDesc, 3, r1Var, self.sdkVersion);
        output.r(serialDesc, 4, r1Var, self.devicePlatform);
        output.r(serialDesc, 5, r1Var, self.os);
        output.r(serialDesc, 6, r1Var, self.osVersion);
        output.r(serialDesc, 7, r1Var, self.installer);
        output.r(serialDesc, 8, r1Var, self.carrier);
        output.r(serialDesc, 9, r1Var, self.locale);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getVendor() {
        return this.vendor;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDevicePlatform() {
        return this.devicePlatform;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOs() {
        return this.os;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getOsVersion() {
        return this.osVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getInstaller() {
        return this.installer;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCarrier() {
        return this.carrier;
    }

    @NotNull
    public final ClientInfoDto copy(@Nullable String appId, @Nullable String appName, @Nullable String vendor, @Nullable String sdkVersion, @Nullable String devicePlatform, @Nullable String os2, @Nullable String osVersion, @Nullable String installer, @Nullable String carrier, @Nullable String locale) {
        return new ClientInfoDto(appId, appName, vendor, sdkVersion, devicePlatform, os2, osVersion, installer, carrier, locale);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClientInfoDto)) {
            return false;
        }
        ClientInfoDto clientInfoDto = (ClientInfoDto) other;
        return Intrinsics.areEqual(this.appId, clientInfoDto.appId) && Intrinsics.areEqual(this.appName, clientInfoDto.appName) && Intrinsics.areEqual(this.vendor, clientInfoDto.vendor) && Intrinsics.areEqual(this.sdkVersion, clientInfoDto.sdkVersion) && Intrinsics.areEqual(this.devicePlatform, clientInfoDto.devicePlatform) && Intrinsics.areEqual(this.os, clientInfoDto.os) && Intrinsics.areEqual(this.osVersion, clientInfoDto.osVersion) && Intrinsics.areEqual(this.installer, clientInfoDto.installer) && Intrinsics.areEqual(this.carrier, clientInfoDto.carrier) && Intrinsics.areEqual(this.locale, clientInfoDto.locale);
    }

    @Nullable
    public final String getAppId() {
        return this.appId;
    }

    @Nullable
    public final String getAppName() {
        return this.appName;
    }

    @Nullable
    public final String getCarrier() {
        return this.carrier;
    }

    @Nullable
    public final String getDevicePlatform() {
        return this.devicePlatform;
    }

    @Nullable
    public final String getInstaller() {
        return this.installer;
    }

    @Nullable
    public final String getLocale() {
        return this.locale;
    }

    @Nullable
    public final String getOs() {
        return this.os;
    }

    @Nullable
    public final String getOsVersion() {
        return this.osVersion;
    }

    @Nullable
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    @Nullable
    public final String getVendor() {
        return this.vendor;
    }

    public int hashCode() {
        String str = this.appId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.appName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.vendor;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sdkVersion;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.devicePlatform;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.os;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.osVersion;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.installer;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.carrier;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.locale;
        return iHashCode9 + (str10 != null ? str10.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.appId;
        String str2 = this.appName;
        String str3 = this.vendor;
        String str4 = this.sdkVersion;
        String str5 = this.devicePlatform;
        String str6 = this.os;
        String str7 = this.osVersion;
        String str8 = this.installer;
        String str9 = this.carrier;
        String str10 = this.locale;
        StringBuilder sbT = f.t("ClientInfoDto(appId=", str, ", appName=", str2, ", vendor=");
        s.A(sbT, str3, ", sdkVersion=", str4, ", devicePlatform=");
        s.A(sbT, str5, ", os=", str6, ", osVersion=");
        s.A(sbT, str7, ", installer=", str8, ", carrier=");
        return f.o(sbT, str9, ", locale=", str10, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/ClientInfoDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/internal/rest/model/ClientInfoDto;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return ClientInfoDto$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ClientInfoDto(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10) {
        this.appId = str;
        this.appName = str2;
        this.vendor = str3;
        this.sdkVersion = str4;
        this.devicePlatform = str5;
        this.os = str6;
        this.osVersion = str7;
        this.installer = str8;
        this.carrier = str9;
        this.locale = str10;
    }
}
