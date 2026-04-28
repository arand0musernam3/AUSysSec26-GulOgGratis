package i3;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements m3.k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f23095d;

    public /* synthetic */ a(LifecycleOwner lifecycleOwner, androidx.lifecycle.c0 c0Var, Object obj, int i11) {
        this.f23092a = i11;
        this.f23094c = lifecycleOwner;
        this.f23093b = c0Var;
        this.f23095d = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m3.k0
    public final void a() {
        Lifecycle lifecycle;
        switch (this.f23092a) {
            case 0:
                ((Function0) this.f23093b).invoke();
                ((LifecycleOwner) this.f23094c).getLifecycle().d((androidx.lifecycle.s) this.f23095d);
                break;
            case 1:
                i9.p pVar = (i9.p) this.f23093b;
                g9.l lVar = (g9.l) this.f23094c;
                pVar.b().c(lVar);
                ((z3.r) this.f23095d).remove(lVar);
                break;
            case 2:
                z3.r rVar = (z3.r) this.f23093b;
                Object obj = this.f23094c;
                rVar.remove(obj);
                ((s1.s) this.f23095d).f38677e.k(obj);
                break;
            case 3:
                ((LifecycleOwner) this.f23094c).getLifecycle().d((gn.s) this.f23093b);
                e.e eVar = (e.e) ((Ref.ObjectRef) this.f23095d).element;
                if (eVar != null) {
                    eVar.a();
                }
                break;
            case 4:
                LifecycleOwner lifecycleOwner = (LifecycleOwner) this.f23094c;
                if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                    lifecycle.d((androidx.lifecycle.s) this.f23093b);
                }
                w8.a aVar = (w8.a) this.f23095d;
                androidx.lifecycle.w wVar = androidx.lifecycle.w.ON_DESTROY;
                aVar.getClass();
                aVar.f43281b = wVar.a();
                aVar.a();
                break;
            default:
                y3.c cVar = (y3.c) this.f23093b;
                q1.t0 t0Var = cVar.f45400b;
                Object obj2 = this.f23094c;
                Object objK = t0Var.k(obj2);
                y3.h hVar = (y3.h) this.f23095d;
                if (objK == hVar) {
                    Map map = cVar.f45399a;
                    Map mapB = hVar.b();
                    if (!mapB.isEmpty()) {
                        map.put(obj2, mapB);
                    } else {
                        map.remove(obj2);
                    }
                }
                break;
        }
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i11) {
        this.f23092a = i11;
        this.f23093b = obj;
        this.f23094c = obj2;
        this.f23095d = obj3;
    }
}
