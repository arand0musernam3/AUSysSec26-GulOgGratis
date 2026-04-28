package nx;

import ax.a0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f31433a = new g(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return a0.a().getSharedPreferences("com.facebook.sdk.APPLINK_INFO", 0);
    }
}
