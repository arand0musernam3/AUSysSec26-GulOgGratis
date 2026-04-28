package lw;

import com.braze.managers.h0;
import com.braze.storage.SdkMetadataDataStoreProvider$Companion;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f28312b;

    public /* synthetic */ g(int i11, Set set) {
        this.f28311a = i11;
        this.f28312b = set;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f28311a) {
            case 0:
                return SdkMetadataDataStoreProvider$Companion.migrateMetadataToJson$lambda$2(this.f28312b);
            default:
                return h0.a(this.f28312b);
        }
    }
}
