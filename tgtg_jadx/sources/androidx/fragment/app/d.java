package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3167c;

    public /* synthetic */ d(h2 h2Var, View view, Rect rect) {
        this.f3165a = 1;
        this.f3166b = view;
        this.f3167c = rect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3165a) {
            case 0:
                ((s) this.f3166b).a((m2) this.f3167c);
                break;
            case 1:
                h2.j((View) this.f3166b, (Rect) this.f3167c);
                break;
            default:
                p pVar = (p) this.f3166b;
                ViewGroup viewGroup = (ViewGroup) this.f3167c;
                viewGroup.getClass();
                Iterator it = pVar.f3295c.iterator();
                while (it.hasNext()) {
                    m2 m2Var = ((q) it.next()).f3254a;
                    View view = m2Var.f3269c.getView();
                    if (view != null) {
                        m2Var.f3267a.a(view, viewGroup);
                    }
                }
                break;
        }
    }

    public /* synthetic */ d(int i11, Object obj, Object obj2) {
        this.f3165a = i11;
        this.f3166b = obj;
        this.f3167c = obj2;
    }
}
