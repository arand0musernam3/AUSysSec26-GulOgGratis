package l8;

import android.content.Context;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f27469a;

    public m(Context context) {
        this.f27469a = context.getApplicationContext();
    }

    @Override // l8.i
    public void a(h0.g gVar) {
        a aVar = new a("EmojiCompatInitializer");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), aVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new a40.q(this, gVar, threadPoolExecutor, 20));
    }

    public /* synthetic */ m(Context context, boolean z11) {
        this.f27469a = context;
    }
}
