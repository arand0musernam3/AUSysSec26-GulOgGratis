package c5;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.app.tgtg.R;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o3 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7311b;

    public /* synthetic */ o3(Object obj, int i11) {
        this.f7310a = i11;
        this.f7311b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f7310a) {
            case 0:
            case 1:
                break;
            case 2:
                i4.e eVar = (i4.e) this.f7311b;
                Context context = view.getContext();
                if (!eVar.f23239d) {
                    context.getApplicationContext().registerComponentCallbacks(eVar.f23241f);
                    eVar.f23239d = true;
                }
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                break;
            default:
                t20.l lVar = (t20.l) this.f7311b;
                AccessibilityManager accessibilityManager = lVar.f39717t;
                if (lVar.f39718u != null && accessibilityManager != null && lVar.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(lVar.f39718u);
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        AccessibilityManager accessibilityManager3;
        boolean z11 = false;
        switch (this.f7310a) {
            case 0:
                a aVar = (a) this.f7311b;
                Iterator it = o80.o.d(aVar.getParent(), h7.c1.f21524a).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object obj = (ViewParent) it.next();
                        if (obj instanceof View) {
                            View view2 = (View) obj;
                            view2.getClass();
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z11 = true;
                            }
                        }
                    }
                }
                if (z11) {
                    return;
                }
                aVar.d();
                return;
            case 1:
                view.removeOnAttachStateChangeListener(this);
                ((v80.b2) this.f7311b).a(null);
                return;
            case 2:
                i4.e eVar = (i4.e) this.f7311b;
                Context context = view.getContext();
                if (eVar.f23239d) {
                    context.getApplicationContext().unregisterComponentCallbacks(eVar.f23241f);
                    eVar.f23239d = false;
                }
                k8.d dVar = eVar.f23240e;
                if (dVar != null) {
                    synchronized (dVar) {
                        try {
                            q1.t0 t0Var = (q1.t0) dVar.f26134b;
                            if (t0Var != null) {
                                t0Var.g();
                            }
                            dVar.f26135c = null;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                eVar.f23240e = null;
                return;
            case 3:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.f7311b;
                n10.a aVar2 = hideBottomViewOnScrollBehavior.f12260h;
                if (aVar2 == null || (accessibilityManager = hideBottomViewOnScrollBehavior.f12259g) == null) {
                    return;
                }
                accessibilityManager.removeTouchExplorationStateChangeListener(aVar2);
                hideBottomViewOnScrollBehavior.f12260h = null;
                return;
            case 4:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.f7311b;
                n10.a aVar3 = hideViewOnScrollBehavior.f12266c;
                if (aVar3 == null || (accessibilityManager2 = hideViewOnScrollBehavior.f12265b) == null) {
                    return;
                }
                accessibilityManager2.removeTouchExplorationStateChangeListener(aVar3);
                hideViewOnScrollBehavior.f12266c = null;
                return;
            case 5:
                o.f fVar = (o.f) this.f7311b;
                ViewTreeObserver viewTreeObserver = fVar.f31526x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        fVar.f31526x = view.getViewTreeObserver();
                    }
                    fVar.f31526x.removeGlobalOnLayoutListener(fVar.f31512i);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 6:
                o.c0 c0Var = (o.c0) this.f7311b;
                ViewTreeObserver viewTreeObserver2 = c0Var.f31486o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        c0Var.f31486o = view.getViewTreeObserver();
                    }
                    c0Var.f31486o.removeGlobalOnLayoutListener(c0Var.f31481i);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            default:
                t20.l lVar = (t20.l) this.f7311b;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = lVar.f39718u;
                if (touchExplorationStateChangeListener == null || (accessibilityManager3 = lVar.f39717t) == null) {
                    return;
                }
                accessibilityManager3.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                return;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }

    private final void f(View view) {
    }
}
