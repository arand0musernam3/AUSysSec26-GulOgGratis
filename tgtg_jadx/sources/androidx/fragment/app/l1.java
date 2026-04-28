package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 implements j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FragmentManager f3257a;

    public l1(FragmentManager fragmentManager) {
        this.f3257a = fragmentManager;
    }

    @Override // androidx.fragment.app.j1
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3;
        ArrayList arrayList4;
        boolean zU;
        FragmentManager fragmentManager = this.f3257a;
        ArrayList<k9.i> arrayList5 = fragmentManager.f3120o;
        if (FragmentManager.L(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + fragmentManager.f3107a);
        }
        if (fragmentManager.f3110d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            zU = false;
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
        } else {
            a aVar = (a) j4.s.d(1, fragmentManager.f3110d);
            fragmentManager.f3114h = aVar;
            Iterator it = aVar.f3395a.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((y1) it.next()).f3383b;
                if (fragment != null) {
                    fragment.mTransitioning = true;
                }
            }
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            zU = fragmentManager.U(arrayList3, arrayList4, null, -1, 0);
        }
        if (!arrayList5.isEmpty() && arrayList3.size() > 0) {
            boolean zBooleanValue = ((Boolean) arrayList4.get(arrayList3.size() - 1)).booleanValue();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(FragmentManager.G((a) it2.next()));
            }
            for (k9.i iVar : arrayList5) {
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    iVar.b((Fragment) it3.next(), zBooleanValue);
                }
            }
        }
        return zU;
    }
}
