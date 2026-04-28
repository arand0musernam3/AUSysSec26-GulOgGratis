package zendesk.android.internal.network;

import s70.c;
import zendesk.android.internal.di.ZendeskComponentConfig;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class NetworkData_Factory implements c {
    private final c configProvider;

    private NetworkData_Factory(c cVar) {
        this.configProvider = cVar;
    }

    public static NetworkData_Factory create(c cVar) {
        return new NetworkData_Factory(cVar);
    }

    public static NetworkData newInstance(ZendeskComponentConfig zendeskComponentConfig) {
        return new NetworkData(zendeskComponentConfig);
    }

    @Override // t70.a
    public NetworkData get() {
        return newInstance((ZendeskComponentConfig) this.configProvider.get());
    }
}
