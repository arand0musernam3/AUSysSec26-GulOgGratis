package zendesk.android.internal.di;

import e0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w2.l1;
import zendesk.android.ZendeskCredentials;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, d2 = {"Lzendesk/android/internal/di/ZendeskComponentConfig;", "", "channelKey", "Lzendesk/android/ZendeskCredentials;", "baseUrl", "", "versionName", "osVersion", "<init>", "(Lzendesk/android/ZendeskCredentials;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChannelKey", "()Lzendesk/android/ZendeskCredentials;", "getBaseUrl", "()Ljava/lang/String;", "getVersionName", "getOsVersion", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ZendeskComponentConfig {

    @NotNull
    private final String baseUrl;

    @NotNull
    private final ZendeskCredentials channelKey;

    @NotNull
    private final String osVersion;

    @NotNull
    private final String versionName;

    public ZendeskComponentConfig(@NotNull ZendeskCredentials zendeskCredentials, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        zendeskCredentials.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.channelKey = zendeskCredentials;
        this.baseUrl = str;
        this.versionName = str2;
        this.osVersion = str3;
    }

    public static /* synthetic */ ZendeskComponentConfig copy$default(ZendeskComponentConfig zendeskComponentConfig, ZendeskCredentials zendeskCredentials, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            zendeskCredentials = zendeskComponentConfig.channelKey;
        }
        if ((i11 & 2) != 0) {
            str = zendeskComponentConfig.baseUrl;
        }
        if ((i11 & 4) != 0) {
            str2 = zendeskComponentConfig.versionName;
        }
        if ((i11 & 8) != 0) {
            str3 = zendeskComponentConfig.osVersion;
        }
        return zendeskComponentConfig.copy(zendeskCredentials, str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ZendeskCredentials getChannelKey() {
        return this.channelKey;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBaseUrl() {
        return this.baseUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getVersionName() {
        return this.versionName;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOsVersion() {
        return this.osVersion;
    }

    @NotNull
    public final ZendeskComponentConfig copy(@NotNull ZendeskCredentials channelKey, @NotNull String baseUrl, @NotNull String versionName, @NotNull String osVersion) {
        channelKey.getClass();
        baseUrl.getClass();
        versionName.getClass();
        osVersion.getClass();
        return new ZendeskComponentConfig(channelKey, baseUrl, versionName, osVersion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ZendeskComponentConfig)) {
            return false;
        }
        ZendeskComponentConfig zendeskComponentConfig = (ZendeskComponentConfig) other;
        return Intrinsics.areEqual(this.channelKey, zendeskComponentConfig.channelKey) && Intrinsics.areEqual(this.baseUrl, zendeskComponentConfig.baseUrl) && Intrinsics.areEqual(this.versionName, zendeskComponentConfig.versionName) && Intrinsics.areEqual(this.osVersion, zendeskComponentConfig.osVersion);
    }

    @NotNull
    public final String getBaseUrl() {
        return this.baseUrl;
    }

    @NotNull
    public final ZendeskCredentials getChannelKey() {
        return this.channelKey;
    }

    @NotNull
    public final String getOsVersion() {
        return this.osVersion;
    }

    @NotNull
    public final String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        return this.osVersion.hashCode() + l1.b(l1.b(this.channelKey.hashCode() * 31, 31, this.baseUrl), 31, this.versionName);
    }

    @NotNull
    public String toString() {
        ZendeskCredentials zendeskCredentials = this.channelKey;
        String str = this.baseUrl;
        String str2 = this.versionName;
        String str3 = this.osVersion;
        StringBuilder sb2 = new StringBuilder("ZendeskComponentConfig(channelKey=");
        sb2.append(zendeskCredentials);
        sb2.append(", baseUrl=");
        sb2.append(str);
        sb2.append(", versionName=");
        return f.o(sb2, str2, ", osVersion=", str3, ")");
    }
}
