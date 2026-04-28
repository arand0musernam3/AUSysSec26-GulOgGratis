package hx;

import android.content.Context;
import android.os.Bundle;
import kotlin.text.StringsKt;
import l80.e;
import se.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f22556b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f22557a;

    static {
        e.f27503a.getClass();
        f22556b = e.f27504b.g().nextDouble() <= 1.0E-4d;
    }

    public a(Context context) {
        context.getClass();
        this.f22557a = new d(context);
    }

    public final void a(Bundle bundle, String str) {
        if (f22556b && StringsKt.z(str, "gps", false)) {
            this.f22557a.M(bundle, str);
        }
    }
}
