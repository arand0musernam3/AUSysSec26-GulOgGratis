package androidx.lifecycle;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y80.a2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3511b;

    public /* synthetic */ s(Object obj, int i11) {
        this.f3510a = i11;
        this.f3511b = obj;
    }

    @Override // androidx.lifecycle.c0
    public final void onStateChanged(LifecycleOwner lifecycleOwner, w wVar) {
        switch (this.f3510a) {
            case 0:
                ((a2) this.f3511b).j(wVar.a());
                break;
            case 1:
                c5.a aVar = (c5.a) this.f3511b;
                if (wVar == w.ON_DESTROY) {
                    aVar.d();
                }
                break;
            case 2:
                ga.a aVar2 = (ga.a) this.f3511b;
                if (wVar == w.ON_START) {
                    aVar2.f20270h = true;
                } else if (wVar == w.ON_STOP) {
                    aVar2.f20270h = false;
                }
                break;
            case 3:
                ((Function1) this.f3511b).invoke(wVar);
                break;
            case 4:
                ((Function2) this.f3511b).invoke(lifecycleOwner, wVar);
                break;
            case 5:
                k9.g gVar = (k9.g) this.f3511b;
                if (wVar == w.ON_DESTROY) {
                    Fragment fragment = (Fragment) lifecycleOwner;
                    Object obj = null;
                    for (Object obj2 : (Iterable) gVar.b().f20181f.f45488a.getValue()) {
                        if (Intrinsics.areEqual(((g9.l) obj2).f20167f, fragment.getTag())) {
                            obj = obj2;
                        }
                    }
                    g9.l lVar = (g9.l) obj;
                    if (lVar != null) {
                        if (k9.g.n()) {
                            Log.v("FragmentNavigator", "Marking transition complete for entry " + lVar + " due to fragment " + lifecycleOwner + " lifecycle reaching DESTROYED");
                        }
                        gVar.b().c(lVar);
                    }
                }
                break;
            case 6:
                l9.f fVar = (l9.f) this.f3511b;
                fVar.f27547q = wVar.a();
                if (fVar.f27534c != null) {
                    for (g9.l lVar2 : CollectionsKt.t0(fVar.f27537f)) {
                        lVar2.getClass();
                        l9.c cVar = lVar2.f20169h;
                        cVar.getClass();
                        g9.l lVar3 = cVar.f27514a;
                        Lifecycle.State stateA = wVar.a();
                        stateA.getClass();
                        lVar3.f20165d = stateA;
                        cVar.f27517d = wVar.a();
                        cVar.b();
                    }
                }
                break;
            default:
                w8.a aVar3 = (w8.a) this.f3511b;
                aVar3.getClass();
                aVar3.f43281b = wVar.a();
                aVar3.a();
                break;
        }
    }
}
