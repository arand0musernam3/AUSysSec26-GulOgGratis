package lw;

import com.braze.storage.PushDeliveryDataStoreProvider$Companion;
import com.braze.storage.PushMaxDataStoreProvider$Companion;
import com.braze.storage.p2;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f28306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f28307c;

    public /* synthetic */ d(String str, Long l, int i11) {
        this.f28305a = i11;
        this.f28306b = str;
        this.f28307c = l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f28305a) {
            case 0:
                return PushDeliveryDataStoreProvider$Companion.migratePushDeliveryEventsToJson$lambda$2$lambda$1(this.f28306b, this.f28307c);
            case 1:
                return PushMaxDataStoreProvider$Companion.migratePushMaxStorageToJson$lambda$3$lambda$1(this.f28306b, this.f28307c);
            default:
                return p2.a(this.f28306b, this.f28307c);
        }
    }
}
