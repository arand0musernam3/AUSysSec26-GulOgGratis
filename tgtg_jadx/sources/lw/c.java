package lw;

import com.braze.storage.DataStoreProvider;
import java.io.File;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28302a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ File f28304c;

    public /* synthetic */ c(int i11, File file) {
        this.f28303b = i11;
        this.f28304c = file;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f28302a) {
            case 0:
                return DataStoreProvider.Companion.deleteFileWithRetry$lambda$10$lambda$9(this.f28304c, this.f28303b);
            default:
                return DataStoreProvider.Companion.deleteFileWithRetry$lambda$11(this.f28303b, this.f28304c);
        }
    }

    public /* synthetic */ c(File file, int i11) {
        this.f28304c = file;
        this.f28303b = i11;
    }
}
