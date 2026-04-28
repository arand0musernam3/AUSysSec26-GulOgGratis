package app.cash.paykit.core.models.analytics.payloads;

import a60.i;
import a60.l;
import dc.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@l(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lapp/cash/paykit/core/models/analytics/payloads/AnalyticsInitializationPayload;", "Ldc/a;", "", "sdkVersion", "clientUserAgent", "requestPlatform", Bayeux.KEY_CLIENT_ID, "environment", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AnalyticsInitializationPayload extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f4634e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsInitializationPayload(@i(name = "mobile_cap_pk_initialization_sdk_version") @NotNull String str, @i(name = "mobile_cap_pk_initialization_client_ua") @NotNull String str2, @i(name = "mobile_cap_pk_initialization_platform") @NotNull String str3, @i(name = "mobile_cap_pk_initialization_client_id") @NotNull String str4, @i(name = "mobile_cap_pk_initialization_environment") @NotNull String str5) {
        super(str, str2, str3, str4, str5);
        b3.i.B(str, str2, str3, str4, str5);
        this.f4634e = str5;
    }
}
