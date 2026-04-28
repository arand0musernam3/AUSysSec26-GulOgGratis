package gb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;
import cb.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements e, g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f20349b = new f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f20350c = new f();

    @Override // gb.g
    public i b(Context context, e eVar) {
        eVar.getClass();
        WindowManager windowManager = context.isUiContext() ? (WindowManager) context.getSystemService(WindowManager.class) : (WindowManager) context.getApplicationContext().getSystemService(WindowManager.class);
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new i(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }

    @Override // gb.g
    public i c(Activity activity, e eVar) {
        eVar.getClass();
        b.f20340a.getClass();
        return new i(new ab.b(a.a().a(activity)), eVar.d(activity));
    }

    @Override // gb.e
    public float d(Context context) {
        return ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }
}
