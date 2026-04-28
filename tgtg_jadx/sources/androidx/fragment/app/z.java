package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3392b;

    public /* synthetic */ z(Object obj, int i11) {
        this.f3391a = i11;
        this.f3392b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3391a) {
            case 0:
                Fragment fragment = (Fragment) this.f3392b;
                i2 i2Var = fragment.mViewLifecycleOwner;
                i2Var.f3240f.b(fragment.mSavedViewRegistryState);
                fragment.mSavedViewRegistryState = null;
                break;
            case 1:
                Function0 function0 = (Function0) ((Ref.ObjectRef) this.f3392b).element;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            case 2:
                a2.c(4, (ArrayList) this.f3392b);
                break;
            case 3:
                p pVar = (p) this.f3392b;
                if (FragmentManager.L(2)) {
                    Log.v("FragmentManager", "Transition for all operations has completed");
                }
                Iterator it = pVar.f3295c.iterator();
                while (it.hasNext()) {
                    ((q) it.next()).f3254a.c(pVar);
                }
                break;
            default:
                Iterator it2 = ((FragmentManager) this.f3392b).f3120o.iterator();
                while (it2.hasNext()) {
                    ((k9.i) it2.next()).getClass();
                }
                break;
        }
    }
}
