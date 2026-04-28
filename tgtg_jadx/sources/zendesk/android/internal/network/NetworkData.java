package zendesk.android.internal.network;

import kotlin.Metadata;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.jetbrains.annotations.NotNull;
import zendesk.android.internal.di.ZendeskComponentConfig;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lzendesk/android/internal/network/NetworkData;", "", "config", "Lzendesk/android/internal/di/ZendeskComponentConfig;", "<init>", "(Lzendesk/android/internal/di/ZendeskComponentConfig;)V", "userAgent", "", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NetworkData {

    @NotNull
    private final ZendeskComponentConfig config;

    public NetworkData(@NotNull ZendeskComponentConfig zendeskComponentConfig) {
        zendeskComponentConfig.getClass();
        this.config = zendeskComponentConfig;
    }

    @NotNull
    public final String userAgent() {
        return a.d("Zendesk-SDK/", this.config.getVersionName(), " Android/", this.config.getOsVersion(), " Variant/Zendesk");
    }
}
