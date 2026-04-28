package lw;

import com.braze.storage.PushDeliveryDataStoreProvider$Companion;
import com.braze.storage.PushMaxDataStoreProvider$Companion;
import com.braze.storage.SessionStorageDataStoreProvider$Companion;
import com.braze.storage.m1;
import com.braze.storage.p2;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f28309b;

    public /* synthetic */ e(LinkedHashMap linkedHashMap, int i11) {
        this.f28308a = i11;
        this.f28309b = linkedHashMap;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f28308a) {
            case 0:
                return PushDeliveryDataStoreProvider$Companion.migratePushDeliveryEventsToJson$lambda$4$lambda$3(this.f28309b);
            case 1:
                return PushMaxDataStoreProvider$Companion.migratePushMaxStorageToJson$lambda$5$lambda$4(this.f28309b);
            case 2:
                return SessionStorageDataStoreProvider$Companion.migrateSealedSessionsMapToJson$lambda$4$lambda$3(this.f28309b);
            case 3:
                return m1.a((Map) this.f28309b);
            case 4:
                return p2.a(this.f28309b);
            case 5:
                return com.braze.triggers.managers.f.a(this.f28309b);
            default:
                return com.braze.triggers.managers.h.a(this.f28309b);
        }
    }
}
