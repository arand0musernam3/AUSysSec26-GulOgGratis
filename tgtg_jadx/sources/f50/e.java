package f50;

import android.net.Uri;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsPlatformParams;
import java.net.URL;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c50.b f17344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineContext f17345b;

    public e(c50.b bVar, CoroutineContext coroutineContext) {
        bVar.getClass();
        coroutineContext.getClass();
        this.f17344a = bVar;
        this.f17345b = coroutineContext;
    }

    public static final URL a(e eVar) {
        eVar.getClass();
        Uri.Builder builderAppendPath = new Uri.Builder().scheme("https").authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath(AnalyticsPlatformParams.channel).appendPath("gmp");
        c50.b bVar = eVar.f17344a;
        Uri.Builder builderAppendPath2 = builderAppendPath.appendPath(bVar.f7496a).appendPath("settings");
        c50.a aVar = bVar.f7498c;
        return new URL(builderAppendPath2.appendQueryParameter("build_version", aVar.f7488c).appendQueryParameter("display_version", aVar.f7487b).build().toString());
    }
}
