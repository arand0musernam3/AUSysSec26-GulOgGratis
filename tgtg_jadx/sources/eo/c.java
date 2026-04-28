package eo;

import android.webkit.JavascriptInterface;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f16196a;

    public c(e eVar) {
        this.f16196a = eVar;
    }

    @JavascriptInterface
    public final void switchToConsumer(@NotNull String str) {
        str.getClass();
        String lowerCase = "SWITCH_TO_CONSUMER".toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (Intrinsics.areEqual(str, lowerCase)) {
            this.f16196a.invoke();
        }
    }
}
