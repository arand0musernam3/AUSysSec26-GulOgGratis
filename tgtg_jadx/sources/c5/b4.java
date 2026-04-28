package c5;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b4 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7126a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f7128c;

    public b4(fb.i iVar, Activity activity) {
        iVar.getClass();
        this.f7127b = iVar;
        this.f7128c = new WeakReference(activity);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Window window;
        WindowManager.LayoutParams attributes;
        switch (this.f7126a) {
            case 0:
                break;
            default:
                view.getClass();
                view.removeOnAttachStateChangeListener(this);
                Activity activity = (Activity) ((WeakReference) this.f7128c).get();
                IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                if (activity != null && iBinder != null) {
                    ((fb.i) this.f7127b).c(iBinder, activity);
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f7126a) {
            case 0:
                ((View) this.f7127b).removeOnAttachStateChangeListener(this);
                ((m3.b2) this.f7128c).A();
                break;
            default:
                view.getClass();
                break;
        }
    }

    public b4(View view, m3.b2 b2Var) {
        this.f7127b = view;
        this.f7128c = b2Var;
    }

    private final void a(View view) {
    }
}
