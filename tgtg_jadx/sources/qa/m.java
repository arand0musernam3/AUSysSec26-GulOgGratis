package qa;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.h2;
import com.app.tgtg.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class m extends h2 {
    @Override // androidx.fragment.app.h2
    public final void a(View view, Object obj) {
        ((y) obj).b(view);
    }

    @Override // androidx.fragment.app.h2
    public final void b(Object obj, ArrayList arrayList) {
        y yVar = (y) obj;
        if (yVar == null) {
            return;
        }
        int i11 = 0;
        if (yVar instanceof e0) {
            e0 e0Var = (e0) yVar;
            int size = e0Var.G.size();
            while (i11 < size) {
                b(e0Var.T(i11), arrayList);
                i11++;
            }
            return;
        }
        if (h2.k(yVar.f36753e) && h2.k(yVar.f36754f)) {
            int size2 = arrayList.size();
            while (i11 < size2) {
                yVar.b((View) arrayList.get(i11));
                i11++;
            }
        }
    }

    @Override // androidx.fragment.app.h2
    public final void c(Object obj) {
        ((v) obj).h();
    }

    @Override // androidx.fragment.app.h2
    public final void d(Object obj, androidx.fragment.app.d dVar) {
        v vVar = (v) obj;
        vVar.f36742g = dVar;
        if (!vVar.f36737b) {
            vVar.f36739d = 2;
        } else {
            vVar.i();
            vVar.f36740e.a(0.0f);
        }
    }

    @Override // androidx.fragment.app.h2
    public final void e(ViewGroup viewGroup, Object obj) {
        c0.a(viewGroup, (y) obj);
    }

    @Override // androidx.fragment.app.h2
    public final boolean g(Object obj) {
        return obj instanceof y;
    }

    @Override // androidx.fragment.app.h2
    public final Object h(Object obj) {
        if (obj != null) {
            return ((y) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.h2
    public final Object i(ViewGroup viewGroup, Object obj) {
        y yVar = (y) obj;
        ArrayList arrayList = c0.f36658c;
        if (!arrayList.contains(viewGroup) && viewGroup.isLaidOut() && Build.VERSION.SDK_INT >= 34) {
            if (yVar.y()) {
                arrayList.add(viewGroup);
                y yVarClone = yVar.clone();
                e0 e0Var = new e0();
                e0Var.S(yVarClone);
                c0.c(viewGroup, e0Var);
                viewGroup.setTag(R.id.transition_current_scene, null);
                b0 b0Var = new b0();
                b0Var.f36641a = e0Var;
                b0Var.f36642b = viewGroup;
                viewGroup.addOnAttachStateChangeListener(b0Var);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(b0Var);
                viewGroup.invalidate();
                v vVar = new v(e0Var);
                e0Var.A = vVar;
                e0Var.a(vVar);
                return e0Var.A;
            }
            i4.a.f("The Transition must support seeking.");
        }
        return null;
    }

    @Override // androidx.fragment.app.h2
    public final boolean l() {
        return true;
    }

    @Override // androidx.fragment.app.h2
    public final boolean m(Object obj) {
        boolean zY = ((y) obj).y();
        if (!zY) {
            Log.v("FragmentManager", "Predictive back not available for AndroidX Transition " + obj + ". Please enable seeking support for the designated transition by overriding isSeekingSupported().");
        }
        return zY;
    }

    @Override // androidx.fragment.app.h2
    public final Object n(Object obj, Object obj2, Object obj3) {
        y yVar = (y) obj;
        y yVar2 = (y) obj2;
        y yVar3 = (y) obj3;
        if (yVar != null && yVar2 != null) {
            e0 e0Var = new e0();
            e0Var.S(yVar);
            e0Var.S(yVar2);
            e0Var.W(1);
            yVar = e0Var;
        } else if (yVar == null) {
            yVar = yVar2 != null ? yVar2 : null;
        }
        if (yVar3 == null) {
            return yVar;
        }
        e0 e0Var2 = new e0();
        if (yVar != null) {
            e0Var2.S(yVar);
        }
        e0Var2.S(yVar3);
        return e0Var2;
    }

    @Override // androidx.fragment.app.h2
    public final Object o(Object obj, Object obj2) {
        e0 e0Var = new e0();
        if (obj != null) {
            e0Var.S((y) obj);
        }
        e0Var.S((y) obj2);
        return e0Var;
    }

    @Override // androidx.fragment.app.h2
    public final void p(Object obj, View view, ArrayList arrayList) {
        ((y) obj).a(new j(view, arrayList));
    }

    @Override // androidx.fragment.app.h2
    public final void q(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((y) obj).a(new k(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.h2
    public final void r(float f11, Object obj) {
        v vVar = (v) obj;
        boolean z11 = vVar.f36737b;
        if (z11) {
            e0 e0Var = vVar.f36743h;
            long j9 = e0Var.f36773z;
            long j11 = (long) (f11 * j9);
            if (j11 == 0) {
                j11 = 1;
            }
            if (j11 == j9) {
                j11 = j9 - 1;
            }
            if (vVar.f36740e != null) {
                com.braze.h2.b("setCurrentPlayTimeMillis() called after animation has been started");
                return;
            }
            long j12 = vVar.f36736a;
            if (j11 == j12 || !z11) {
                return;
            }
            if (!vVar.f36738c) {
                if (j11 == 0 && j12 > 0) {
                    j11 = -1;
                } else if (j11 == j9 && j12 < j9) {
                    j11 = j9 + 1;
                }
                if (j11 != j12) {
                    e0Var.J(j11, j12);
                    vVar.f36736a = j11;
                }
            }
            a3.j jVar = vVar.f36741f;
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            int i11 = (jVar.f398b + 1) % 20;
            jVar.f398b = i11;
            ((long[]) jVar.f399c)[i11] = jCurrentAnimationTimeMillis;
            ((float[]) jVar.f400d)[i11] = j11;
        }
    }

    @Override // androidx.fragment.app.h2
    public final void s(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            h2.j(view, rect);
            ((y) obj).L(new i(0, rect));
        }
    }

    @Override // androidx.fragment.app.h2
    public final void t(Object obj, Rect rect) {
        ((y) obj).L(new i(1, rect));
    }

    @Override // androidx.fragment.app.h2
    public final void u(Fragment fragment, Object obj, d7.c cVar, Runnable runnable) {
        v(obj, cVar, null, runnable);
    }

    @Override // androidx.fragment.app.h2
    public final void v(Object obj, d7.c cVar, androidx.fragment.app.z zVar, Runnable runnable) {
        y yVar = (y) obj;
        b40.a aVar = new b40.a(zVar, yVar, runnable, 9);
        synchronized (cVar) {
            while (cVar.f14562c) {
                try {
                    try {
                        cVar.wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (cVar.f14561b != aVar) {
                cVar.f14561b = aVar;
                if (cVar.f14560a) {
                    Runnable runnable2 = (Runnable) aVar.f5733b;
                    y yVar2 = (y) aVar.f5734c;
                    Runnable runnable3 = (Runnable) aVar.f5735d;
                    if (runnable2 == null) {
                        yVar2.cancel();
                        runnable3.run();
                    } else {
                        runnable2.run();
                    }
                }
            }
        }
        yVar.a(new l(runnable));
    }

    @Override // androidx.fragment.app.h2
    public final void w(Object obj, View view, ArrayList arrayList) {
        e0 e0Var = (e0) obj;
        ArrayList arrayList2 = e0Var.f36754f;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            h2.f((View) arrayList.get(i11), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(e0Var, arrayList);
    }

    @Override // androidx.fragment.app.h2
    public final void x(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        e0 e0Var = (e0) obj;
        if (e0Var != null) {
            ArrayList arrayList3 = e0Var.f36754f;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            z(e0Var, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.h2
    public final Object y(Object obj) {
        if (obj == null) {
            return null;
        }
        e0 e0Var = new e0();
        e0Var.S((y) obj);
        return e0Var;
    }

    public final void z(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        y yVar = (y) obj;
        int i11 = 0;
        if (yVar instanceof e0) {
            e0 e0Var = (e0) yVar;
            int size = e0Var.G.size();
            while (i11 < size) {
                z(e0Var.T(i11), arrayList, arrayList2);
                i11++;
            }
            return;
        }
        if (h2.k(yVar.f36753e)) {
            ArrayList arrayList3 = yVar.f36754f;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i11 < size2) {
                    yVar.b((View) arrayList2.get(i11));
                    i11++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    yVar.G((View) arrayList.get(size3));
                }
            }
        }
    }
}
