package zs;

import android.webkit.JavascriptInterface;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zendesk.ui.android.conversation.textcell.c f48057a;

    public a(zendesk.ui.android.conversation.textcell.c cVar) {
        this.f48057a = cVar;
    }

    @JavascriptInterface
    /* JADX INFO: renamed from: default, reason: not valid java name */
    public final void m1018default(@NotNull String str) {
        str.getClass();
        String lowerCase = "CLOSE".toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (Intrinsics.areEqual(str, lowerCase)) {
            this.f48057a.invoke();
        }
    }
}
