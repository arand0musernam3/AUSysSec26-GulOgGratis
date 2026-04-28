package lw;

import com.braze.storage.BannersDataStoreProvider$Companion;
import com.braze.storage.FeatureFlagsDataStoreProvider$Companion;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Boolean f28297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f28298c;

    public /* synthetic */ a(Boolean bool, String str, int i11) {
        this.f28296a = i11;
        this.f28297b = bool;
        this.f28298c = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f28296a) {
            case 0:
                return BannersDataStoreProvider$Companion.migrateBannerImpressionMapToJson$lambda$9$lambda$8(this.f28297b, this.f28298c);
            default:
                return FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagImpressionMapToJson$lambda$12$lambda$11(this.f28297b, this.f28298c);
        }
    }
}
