package i90;

import com.braze.managers.BrazeGeofenceManager;
import com.braze.managers.k0;
import com.braze.storage.BannersDataStoreProvider$Companion;
import com.braze.storage.ContentCardsDataStoreProvider$Companion;
import com.braze.storage.TriggerDataStoreProvider$Companion;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f23600b;

    public /* synthetic */ j(int i11, ArrayList arrayList) {
        this.f23599a = i11;
        this.f23600b = arrayList;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f23599a) {
            case 0:
                return ((KType) this.f23600b.get(0)).getClassifier();
            case 1:
                return BannersDataStoreProvider$Companion.migrateBannerStorageToJson$lambda$5$lambda$4(this.f23600b);
            case 2:
                return ContentCardsDataStoreProvider$Companion.migrateContentCardsStorageToJson$lambda$5$lambda$4(this.f23600b);
            case 3:
                return TriggerDataStoreProvider$Companion.migrateTriggersStorageToJson$lambda$6$lambda$5(this.f23600b);
            case 4:
                return com.braze.communication.f.a(this.f23600b);
            case 5:
                return com.braze.triggers.managers.f.d(this.f23600b);
            case 6:
                return BrazeGeofenceManager.registerGeofences$lambda$37$lambda$33(this.f23600b);
            case 7:
                return com.braze.managers.j.c(this.f23600b);
            case 8:
                return com.braze.managers.j.a(this.f23600b);
            default:
                return k0.a(this.f23600b);
        }
    }
}
