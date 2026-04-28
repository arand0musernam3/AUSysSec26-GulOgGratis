package com.braze.storage;

import android.content.Context;
import com.braze.enums.DataStoreKey;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h3 extends DataStoreProvider {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ServerConfigDataStoreProvider$Companion f10580b = new ServerConfigDataStoreProvider$Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10581a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(Context context, String str) {
        super(context);
        context.getClass();
        str.getClass();
        this.f10581a = str;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final d8.f getDataStore() {
        return createOrGetDataStore(kotlin.collections.d0.h(g8.k.a(getContext(), e0.f.k("com.braze.storage.server_config.", this.f10581a), kotlin.collections.y.W(new String[]{DataStoreKey.LAST_ACCESSED_SDK_VERSION.getKey(), DataStoreKey.CONFIG_TIME.getKey(), DataStoreKey.EPHEMERAL_EVENTS_ENABLED.getKey(), DataStoreKey.GEOFENCES_ENABLED_SET.getKey(), DataStoreKey.GEOFENCES_ENABLED.getKey(), DataStoreKey.GEOFENCES_MIN_TIME_REQUEST.getKey(), DataStoreKey.GEOFENCES_MIN_TIME_REPORT.getKey(), DataStoreKey.GEOFENCES_MAX_NUM_TO_REGISTER.getKey(), DataStoreKey.MESSAGING_SESSION_TIMEOUT.getKey(), DataStoreKey.DUST_ENABLED.getKey(), DataStoreKey.CONTENT_CARDS_ENABLED.getKey(), DataStoreKey.FEATURE_FLAGS_ENABLED.getKey(), DataStoreKey.FEATURE_FLAGS_RATE_REFRESH_RATE_LIMIT.getKey(), DataStoreKey.PUSH_MAX_ENABLED.getKey(), DataStoreKey.PUSH_MAX_REDELIVER_BUFFER.getKey(), DataStoreKey.PUSH_MAX_REDELIVER_DEDUPE_BUFFER.getKey(), DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_ENABLED.getKey(), DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_CAPACITY.getKey(), DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_REFILL_RATE.getKey(), DataStoreKey.GLOBAL_REQUEST_RATE_LIMIT_ENDPOINT_OVERRIDES.getKey(), DataStoreKey.DEFAULT_REQUEST_BACKOFF_MIN_SLEEP_DURATION_MS.getKey(), DataStoreKey.DEFAULT_REQUEST_BACKOFF_MAX_SLEEP_DURATION_MS.getKey(), DataStoreKey.DEFAULT_REQUEST_BACKOFF_SCALE_FACTOR.getKey(), DataStoreKey.SDK_DEBUGGER_ENABLED.getKey(), DataStoreKey.SDK_DEBUGGER_EXPIRATION_TIME.getKey(), DataStoreKey.SDK_DEBUGGER_AUTHORIZATION_CODE.getKey(), DataStoreKey.SDK_DEBUGGER_FLUSH_INTERVAL_BYTES.getKey(), DataStoreKey.SDK_DEBUGGER_FLUSH_INTERVAL_SECONDS.getKey(), DataStoreKey.SDK_DEBUGGER_MAX_PAYLOAD_BYTES.getKey(), DataStoreKey.BANNERS_ENABLED.getKey(), DataStoreKey.MAX_BANNER_PLACEMENTS.getKey()})), new f8.b(getContext(), e0.f.k("com.braze.storage.server_config.", this.f10581a), (aa.l0) null, new g3(f10580b), 12)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return e0.f.k("com.braze.serverconfig.", this.f10581a);
    }
}
