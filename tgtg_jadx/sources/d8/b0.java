package d8;

import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeImageUtils;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ File f14577b;

    public /* synthetic */ b0(File file, int i11) {
        this.f14576a = i11;
        this.f14577b = file;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f14576a) {
            case 0:
                File file = this.f14577b;
                synchronized (c0.f14586e) {
                    c0.f14585d.remove(file.getAbsolutePath());
                }
                return Unit.f26487a;
            case 1:
                return BrazeFileUtils.deleteFileOrDirectory$lambda$0(this.f14577b);
            case 2:
                return BrazeFileUtils.deleteDataStoreFile$lambda$3(this.f14577b);
            case 3:
                return BrazeFileUtils.deleteDataStoreFile$lambda$4(this.f14577b);
            case 4:
                return BrazeFileUtils.deleteDataStoreFile$lambda$5(this.f14577b);
            case 5:
                return BrazeFileUtils.deleteSharedPreferencesFile$lambda$1(this.f14577b);
            case 6:
                return BrazeFileUtils.deleteSharedPreferencesFile$lambda$2(this.f14577b);
            case 7:
                return BrazeImageUtils.getLocalBitmap$lambda$10(this.f14577b);
            case 8:
                return com.braze.triggers.managers.a.c(this.f14577b);
            case 9:
                return com.braze.triggers.managers.a.b(this.f14577b);
            default:
                return com.braze.images.c.a(this.f14577b);
        }
    }
}
