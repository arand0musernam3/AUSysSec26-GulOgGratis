package androidx.activity;

import android.os.Handler;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistry;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements androidx.lifecycle.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1717c;

    public d0(androidx.lifecycle.d0 d0Var) {
        this.f1715a = 3;
        this.f1716b = d0Var;
        androidx.lifecycle.e eVar = androidx.lifecycle.e.f3426c;
        Class<?> cls = d0Var.getClass();
        androidx.lifecycle.c cVar = (androidx.lifecycle.c) eVar.f3427a.get(cls);
        this.f1717c = cVar == null ? eVar.a(cls, null) : cVar;
    }

    @Override // androidx.lifecycle.c0
    public final void onStateChanged(LifecycleOwner lifecycleOwner, androidx.lifecycle.w wVar) {
        switch (this.f1715a) {
            case 0:
                x xVar = (x) this.f1716b;
                int i11 = c0.$EnumSwitchMapping$0[wVar.ordinal()];
                if (i11 == 1) {
                    xVar.h(true);
                    break;
                } else if (i11 == 2) {
                    xVar.h(false);
                    break;
                } else if (i11 == 3) {
                    xVar.f();
                    ((Lifecycle) this.f1717c).d(this);
                    break;
                }
                break;
            case 1:
                androidx.lifecycle.h hVar = (androidx.lifecycle.h) this.f1716b;
                switch (androidx.lifecycle.i.$EnumSwitchMapping$0[wVar.ordinal()]) {
                    case 1:
                        hVar.onCreate(lifecycleOwner);
                        break;
                    case 2:
                        hVar.onStart(lifecycleOwner);
                        break;
                    case 3:
                        hVar.onResume(lifecycleOwner);
                        break;
                    case 4:
                        hVar.onPause(lifecycleOwner);
                        break;
                    case 5:
                        hVar.onStop(lifecycleOwner);
                        break;
                    case 6:
                        hVar.onDestroy(lifecycleOwner);
                        break;
                    case 7:
                        i4.a.f("ON_ANY must not been send by anybody");
                        break;
                    default:
                        e40.a.f();
                        break;
                }
                androidx.lifecycle.c0 c0Var = (androidx.lifecycle.c0) this.f1717c;
                if (c0Var != null) {
                    c0Var.onStateChanged(lifecycleOwner, wVar);
                }
                break;
            case 2:
                if (wVar == androidx.lifecycle.w.ON_START) {
                    ((Lifecycle) this.f1717c).d(this);
                    ((SavedStateRegistry) this.f1716b).d();
                }
                break;
            case 3:
                HashMap map = ((androidx.lifecycle.c) this.f1717c).f3417a;
                List list = (List) map.get(wVar);
                Object obj = this.f1716b;
                androidx.lifecycle.c.a(list, lifecycleOwner, wVar, obj);
                androidx.lifecycle.c.a((List) map.get(androidx.lifecycle.w.ON_ANY), lifecycleOwner, wVar, obj);
                break;
            case 4:
                va.e eVar = (va.e) this.f1716b;
                va.d dVar = (va.d) this.f1717c;
                if (!dVar.f42208b.P()) {
                    lifecycleOwner.getLifecycle().d(this);
                    if (ViewCompat.H((FrameLayout) eVar.itemView)) {
                        dVar.f(eVar);
                    }
                    break;
                }
                break;
            default:
                if (wVar == androidx.lifecycle.w.ON_DESTROY) {
                    ((Handler) this.f1716b).removeCallbacks((a8.f) this.f1717c);
                    lifecycleOwner.getLifecycle().d(this);
                }
                break;
        }
    }

    public d0(androidx.lifecycle.h hVar, androidx.lifecycle.c0 c0Var) {
        this.f1715a = 1;
        hVar.getClass();
        this.f1716b = hVar;
        this.f1717c = c0Var;
    }

    public /* synthetic */ d0(int i11, Object obj, Object obj2) {
        this.f1715a = i11;
        this.f1717c = obj;
        this.f1716b = obj2;
    }

    public d0(x xVar, OnBackPressedDispatcher onBackPressedDispatcher, Lifecycle lifecycle) {
        this.f1715a = 0;
        this.f1716b = xVar;
        this.f1717c = lifecycle;
    }

    public d0(Handler handler, a8.f fVar) {
        this.f1715a = 5;
        this.f1716b = handler;
        this.f1717c = fVar;
    }
}
