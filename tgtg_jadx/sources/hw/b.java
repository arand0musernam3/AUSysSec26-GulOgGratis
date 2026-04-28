package hw;

import com.braze.managers.l0;
import com.braze.storage.BannersDataStoreProvider$Companion;
import com.braze.storage.ContentCardsDataStoreProvider$Companion;
import com.braze.storage.PushMaxDataStoreProvider$Companion;
import com.braze.storage.m1;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22547b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f22546a = i11;
        this.f22547b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f22546a) {
            case 0:
                return com.braze.requests.d.a(this.f22547b);
            case 1:
                return BannersDataStoreProvider$Companion.migrateBannerStorageToJson$lambda$3$lambda$2(this.f22547b);
            case 2:
                return ContentCardsDataStoreProvider$Companion.migrateContentCardsStorageToJson$lambda$3$lambda$2(this.f22547b);
            case 3:
                return PushMaxDataStoreProvider$Companion.migratePushMaxStorageToJson$lambda$3$lambda$2(this.f22547b);
            case 4:
                return m1.a(this.f22547b);
            case 5:
                return com.braze.support.d.b(this.f22547b);
            case 6:
                return this.f22547b;
            default:
                return l0.a(this.f22547b);
        }
    }
}
