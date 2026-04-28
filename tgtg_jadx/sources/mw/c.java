package mw;

import com.braze.support.BrazeImageUtils;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Exception f30222b;

    public /* synthetic */ c(int i11, Exception exc) {
        this.f30221a = i11;
        this.f30222b = exc;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f30221a) {
            case 0:
                return BrazeImageUtils.getLocalBitmap$lambda$15(this.f30222b);
            case 1:
                return com.braze.communication.dust.d.a(this.f30222b);
            default:
                return com.braze.managers.b.a(this.f30222b);
        }
    }
}
