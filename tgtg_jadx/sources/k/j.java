package k;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import androidx.appcompat.app.AppCompatDelegate;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f25574b;

    public /* synthetic */ j(Context context, int i11) {
        this.f25573a = i11;
        this.f25574b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i11 = this.f25573a;
        Context context = this.f25574b;
        switch (i11) {
            case 0:
                if (Build.VERSION.SDK_INT >= 33) {
                    rb.k kVar = AppCompatDelegate.f1768a;
                    ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (AppCompatDelegate.g().e()) {
                            String strI = androidx.core.app.e.i(context);
                            Object systemService = context.getSystemService("locale");
                            if (systemService != null) {
                                l.b(systemService, k.a(strI));
                            }
                        }
                        context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                AppCompatDelegate.f1773f = true;
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new j(context, 2));
                break;
            default:
                w9.d.t(context, new l0.b(0), w9.d.f43308a, false);
                break;
        }
    }
}
