package zendesk.conversationkit.android.internal;

import com.adyen.checkout.components.core.internal.analytics.AnalyticsPlatformParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import zendesk.conversationkit.android.internal.rest.model.ClientDto;
import zendesk.conversationkit.android.internal.rest.model.ClientInfoDto;
import zendesk.core.ui.android.internal.local.LocaleProvider;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lzendesk/conversationkit/android/internal/ClientDtoProvider;", "", "sdkVendor", "", "sdkVersion", "hostAppInfo", "Lzendesk/conversationkit/android/internal/HostAppInfo;", "localeProvider", "Lzendesk/core/ui/android/internal/local/LocaleProvider;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lzendesk/conversationkit/android/internal/HostAppInfo;Lzendesk/core/ui/android/internal/local/LocaleProvider;)V", "buildClient", "Lzendesk/conversationkit/android/internal/rest/model/ClientDto;", "integrationId", Bayeux.KEY_CLIENT_ID, "pushToken", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ClientDtoProvider {

    @NotNull
    private final HostAppInfo hostAppInfo;

    @NotNull
    private final LocaleProvider localeProvider;

    @NotNull
    private final String sdkVendor;

    @NotNull
    private final String sdkVersion;

    public ClientDtoProvider(@NotNull String str, @NotNull String str2, @NotNull HostAppInfo hostAppInfo, @NotNull LocaleProvider localeProvider) {
        str.getClass();
        str2.getClass();
        hostAppInfo.getClass();
        localeProvider.getClass();
        this.sdkVendor = str;
        this.sdkVersion = str2;
        this.hostAppInfo = hostAppInfo;
        this.localeProvider = localeProvider;
    }

    @NotNull
    public final ClientDto buildClient(@NotNull String integrationId, @NotNull String clientId, @Nullable String pushToken) {
        integrationId.getClass();
        clientId.getClass();
        return new ClientDto(clientId, (String) null, (String) null, AnalyticsPlatformParams.channel, integrationId, pushToken, this.hostAppInfo.getAppVersion$zendesk_conversationkit_conversationkit_android(), (String) null, new ClientInfoDto(this.hostAppInfo.getAppPackage$zendesk_conversationkit_conversationkit_android(), this.hostAppInfo.getAppName$zendesk_conversationkit_conversationkit_android(), this.sdkVendor, this.sdkVersion, k.m(this.hostAppInfo.getDeviceManufacturer$zendesk_conversationkit_conversationkit_android(), " ", this.hostAppInfo.getDeviceModel$zendesk_conversationkit_conversationkit_android()), this.hostAppInfo.getDeviceOperatingSystem$zendesk_conversationkit_conversationkit_android(), this.hostAppInfo.getDeviceOperatingSystemVersion$zendesk_conversationkit_conversationkit_android(), this.hostAppInfo.getAppInstallerPackage$zendesk_conversationkit_conversationkit_android(), this.hostAppInfo.getDeviceCarrierName$zendesk_conversationkit_conversationkit_android(), this.localeProvider.getLocale().toLanguageTag()), 134, (DefaultConstructorMarker) null);
    }
}
