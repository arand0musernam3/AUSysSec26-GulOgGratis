package va;

import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h2;
import androidx.viewpager2.widget.ViewPager2;
import gl.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import q1.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f42201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h2 f42202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ea.b f42203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ViewPager2 f42204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f42205e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f42206f;

    public c(d dVar) {
        this.f42206f = dVar;
    }

    public static ViewPager2 a(RecyclerView recyclerView) {
        ViewParent parent = recyclerView.getParent();
        if (parent instanceof ViewPager2) {
            return (ViewPager2) parent;
        }
        j4.d.e(parent, "Expected ViewPager2 instance. Got: ");
        return null;
    }

    public final void b(boolean z11) {
        int currentItem;
        Fragment fragment;
        d dVar = this.f42206f;
        b bVar = dVar.f42213g;
        z zVar = dVar.f42209c;
        FragmentManager fragmentManager = dVar.f42208b;
        if (fragmentManager.P() || this.f42204d.getScrollState() != 0 || zVar.d() || dVar.getItemCount() == 0 || (currentItem = this.f42204d.getCurrentItem()) >= dVar.getItemCount()) {
            return;
        }
        long j9 = currentItem;
        if ((j9 != this.f42205e || z11) && (fragment = (Fragment) zVar.b(j9)) != null && fragment.isAdded()) {
            this.f42205e = j9;
            fragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
            ArrayList<List> arrayList = new ArrayList();
            Fragment fragment2 = null;
            for (int i11 = 0; i11 < zVar.j(); i11++) {
                long jF = zVar.f(i11);
                Fragment fragment3 = (Fragment) zVar.k(i11);
                if (fragment3.isAdded()) {
                    if (jF != this.f42205e) {
                        aVar.m(fragment3, Lifecycle.State.STARTED);
                        bVar.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = bVar.f42200a.iterator();
                        if (it.hasNext()) {
                            throw e0.f.e(it);
                        }
                        arrayList.add(arrayList2);
                    } else {
                        fragment2 = fragment3;
                    }
                    fragment3.setMenuVisibility(jF == this.f42205e);
                }
            }
            if (fragment2 != null) {
                aVar.m(fragment2, Lifecycle.State.RESUMED);
                bVar.getClass();
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = bVar.f42200a.iterator();
                if (it2.hasNext()) {
                    throw e0.f.e(it2);
                }
                arrayList.add(arrayList3);
            }
            if (aVar.f3395a.isEmpty()) {
                return;
            }
            aVar.j();
            Collections.reverse(arrayList);
            for (List list : arrayList) {
                bVar.getClass();
                b.a(list);
            }
        }
    }
}
