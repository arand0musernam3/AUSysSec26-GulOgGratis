package gb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;
import cb.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements b, g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f20347b = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f20348c = new d();

    @Override // gb.b
    public Rect a(Activity activity) {
        Rect bounds = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }

    @Override // gb.g
    public i b(Context context, e eVar) {
        eVar.getClass();
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        float f11 = context.getResources().getDisplayMetrics().density;
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new i(bounds, f11);
    }

    @Override // gb.g
    public i c(Activity activity, e eVar) {
        eVar.getClass();
        b.f20340a.getClass();
        return new i(new ab.b(a.a().a(activity)), eVar.d(activity));
    }
}
