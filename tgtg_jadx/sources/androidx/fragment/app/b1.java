package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends androidx.activity.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FragmentManager f3156a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(FragmentManager fragmentManager) {
        super(false);
        this.f3156a = fragmentManager;
    }

    @Override // androidx.activity.y
    public final void handleOnBackCancelled() {
        boolean zL = FragmentManager.L(3);
        FragmentManager fragmentManager = this.f3156a;
        if (zL) {
            Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + fragmentManager);
        }
        if (FragmentManager.L(3)) {
            Log.d("FragmentManager", "cancelBackStackTransition for transition " + fragmentManager.f3114h);
        }
        a aVar = fragmentManager.f3114h;
        if (aVar != null) {
            aVar.f3133s = false;
            aVar.h();
            a aVar2 = fragmentManager.f3114h;
            z zVar = new z(fragmentManager, 4);
            if (aVar2.f3410q == null) {
                aVar2.f3410q = new ArrayList();
            }
            aVar2.f3410q.add(zVar);
            fragmentManager.f3114h.d();
            fragmentManager.f3115i = true;
            fragmentManager.A(true);
            fragmentManager.F();
            fragmentManager.f3115i = false;
            fragmentManager.f3114h = null;
        }
    }

    @Override // androidx.activity.y
    public final void handleOnBackPressed() {
        boolean zL = FragmentManager.L(3);
        FragmentManager fragmentManager = this.f3156a;
        if (zL) {
            Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + fragmentManager);
        }
        b1 b1Var = fragmentManager.f3116j;
        ArrayList<k9.i> arrayList = fragmentManager.f3120o;
        fragmentManager.f3115i = true;
        fragmentManager.A(true);
        fragmentManager.f3115i = false;
        if (fragmentManager.f3114h == null) {
            if (b1Var.isEnabled()) {
                if (FragmentManager.L(3)) {
                    Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                }
                fragmentManager.S();
                return;
            } else {
                if (FragmentManager.L(3)) {
                    Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                }
                fragmentManager.f3113g.d();
                return;
            }
        }
        if (!arrayList.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(FragmentManager.G(fragmentManager.f3114h));
            for (k9.i iVar : arrayList) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    iVar.a((Fragment) it.next(), true);
                }
            }
        }
        Iterator it2 = fragmentManager.f3114h.f3395a.iterator();
        while (it2.hasNext()) {
            Fragment fragment = ((y1) it2.next()).f3383b;
            if (fragment != null) {
                fragment.mTransitioning = false;
            }
        }
        for (t2 t2Var : fragmentManager.g(new ArrayList(Collections.singletonList(fragmentManager.f3114h)), 0, 1)) {
            ArrayList arrayList2 = t2Var.f3351c;
            if (FragmentManager.L(3)) {
                Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
            }
            t2Var.l(arrayList2);
            t2Var.c(arrayList2);
        }
        Iterator it3 = fragmentManager.f3114h.f3395a.iterator();
        while (it3.hasNext()) {
            Fragment fragment2 = ((y1) it3.next()).f3383b;
            if (fragment2 != null && fragment2.mContainer == null) {
                fragmentManager.h(fragment2).k();
            }
        }
        fragmentManager.f3114h = null;
        fragmentManager.l0();
        if (FragmentManager.L(3)) {
            Log.d("FragmentManager", "Op is being set to null");
            Log.d("FragmentManager", "OnBackPressedCallback enabled=" + b1Var.isEnabled() + " for  FragmentManager " + fragmentManager);
        }
    }

    @Override // androidx.activity.y
    public final void handleOnBackProgressed(androidx.activity.b bVar) {
        boolean zL = FragmentManager.L(2);
        FragmentManager fragmentManager = this.f3156a;
        if (zL) {
            Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + fragmentManager);
        }
        if (fragmentManager.f3114h != null) {
            for (t2 t2Var : fragmentManager.g(new ArrayList(Collections.singletonList(fragmentManager.f3114h)), 0, 1)) {
                t2Var.getClass();
                bVar.getClass();
                if (FragmentManager.L(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + bVar.a());
                }
                ArrayList arrayList = t2Var.f3351c;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    kotlin.collections.i0.s(((m2) it.next()).f3277k, arrayList2);
                }
                List listR0 = CollectionsKt.r0(CollectionsKt.v0(arrayList2));
                int size = listR0.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((l2) listR0.get(i11)).d(bVar, t2Var.f3349a);
                }
            }
            Iterator it2 = fragmentManager.f3120o.iterator();
            while (it2.hasNext()) {
                ((k9.i) it2.next()).getClass();
            }
        }
    }

    @Override // androidx.activity.y
    public final void handleOnBackStarted(androidx.activity.b bVar) {
        boolean zL = FragmentManager.L(3);
        FragmentManager fragmentManager = this.f3156a;
        if (zL) {
            Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + fragmentManager);
        }
        fragmentManager.x();
        fragmentManager.y(new l1(fragmentManager), false);
    }
}
