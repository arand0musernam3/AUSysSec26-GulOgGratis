package androidx.activity;

import android.util.Log;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.LifecycleOwner;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m3.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements androidx.lifecycle.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1720c;

    public /* synthetic */ e(int i11, Object obj, Object obj2) {
        this.f1718a = i11;
        this.f1719b = obj;
        this.f1720c = obj2;
    }

    @Override // androidx.lifecycle.c0
    public final void onStateChanged(LifecycleOwner lifecycleOwner, androidx.lifecycle.w wVar) {
        switch (this.f1718a) {
            case 0:
                ComponentActivity.t((OnBackPressedDispatcher) this.f1719b, (ComponentActivity) this.f1720c, lifecycleOwner, wVar);
                break;
            case 1:
                h7.r rVar = (h7.r) this.f1719b;
                MenuProvider menuProvider = (MenuProvider) this.f1720c;
                rVar.getClass();
                if (wVar == androidx.lifecycle.w.ON_DESTROY) {
                    rVar.a(menuProvider);
                }
                break;
            case 2:
                k9.g gVar = (k9.g) this.f1719b;
                g9.l lVar = (g9.l) this.f1720c;
                if (wVar == androidx.lifecycle.w.ON_RESUME && ((List) gVar.b().f20180e.f45488a.getValue()).contains(lVar)) {
                    if (k9.g.n()) {
                        Log.v("FragmentNavigator", "Marking transition complete for entry " + lVar + " due to fragment " + lifecycleOwner + " view lifecycle reaching RESUMED");
                    }
                    gVar.b().c(lVar);
                }
                if (wVar == androidx.lifecycle.w.ON_DESTROY) {
                    if (k9.g.n()) {
                        Log.v("FragmentNavigator", "Marking transition complete for entry " + lVar + " due to fragment " + lifecycleOwner + " view lifecycle reaching DESTROYED");
                    }
                    gVar.b().c(lVar);
                }
                break;
            case 3:
                androidx.lifecycle.w wVar2 = (androidx.lifecycle.w) this.f1719b;
                ry.a aVar = (ry.a) this.f1720c;
                if (wVar == wVar2 && !Intrinsics.areEqual(aVar.c(), ry.e.f38275a)) {
                    aVar.f38269c.setValue(aVar.a());
                    break;
                }
                break;
            default:
                androidx.lifecycle.w wVar3 = (androidx.lifecycle.w) this.f1719b;
                b1 b1Var = (b1) this.f1720c;
                if (wVar == wVar3) {
                    ((Function0) b1Var.getValue()).invoke();
                }
                break;
        }
    }
}
