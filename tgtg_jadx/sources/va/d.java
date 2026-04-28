package va;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.activity.d0;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.j0;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l1;
import androidx.recyclerview.widget.r2;
import androidx.viewpager2.widget.ViewPager2;
import com.braze.h2;
import gl.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import pd.g;
import q1.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d extends l1 implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lifecycle f42207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FragmentManager f42208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f42209c = new z((Object) null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z f42210d = new z((Object) null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z f42211e = new z((Object) null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f42212f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f42213g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f42214h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f42215i;

    public d(FragmentManager fragmentManager, Lifecycle lifecycle) {
        b bVar = new b();
        bVar.f42200a = new CopyOnWriteArrayList();
        this.f42213g = bVar;
        this.f42214h = false;
        this.f42215i = false;
        this.f42208b = fragmentManager;
        this.f42207a = lifecycle;
        super.setHasStableIds(true);
    }

    public static void a(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            h2.b("Design assumption violated.");
            return;
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    public final boolean b(long j9) {
        return j9 >= 0 && j9 < ((long) getItemCount());
    }

    public abstract Fragment c(int i11);

    public final void d() {
        z zVar;
        z zVar2;
        Fragment fragment;
        View view;
        if (!this.f42215i || this.f42208b.P()) {
            return;
        }
        q1.f fVar = new q1.f(0);
        int i11 = 0;
        while (true) {
            zVar = this.f42209c;
            int iJ = zVar.j();
            zVar2 = this.f42211e;
            if (i11 >= iJ) {
                break;
            }
            long jF = zVar.f(i11);
            if (!b(jF)) {
                fVar.add(Long.valueOf(jF));
                zVar2.i(jF);
            }
            i11++;
        }
        if (!this.f42214h) {
            this.f42215i = false;
            for (int i12 = 0; i12 < zVar.j(); i12++) {
                long jF2 = zVar.f(i12);
                if (zVar2.c(jF2) < 0 && ((fragment = (Fragment) zVar.b(jF2)) == null || (view = fragment.getView()) == null || view.getParent() == null)) {
                    fVar.add(Long.valueOf(jF2));
                }
            }
        }
        q1.a aVar = new q1.a(fVar);
        while (aVar.hasNext()) {
            g(((Long) aVar.next()).longValue());
        }
    }

    public final Long e(int i11) {
        Long lValueOf = null;
        int i12 = 0;
        while (true) {
            z zVar = this.f42211e;
            if (i12 >= zVar.j()) {
                return lValueOf;
            }
            if (((Integer) zVar.k(i12)).intValue() == i11) {
                if (lValueOf != null) {
                    h2.b("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                    return null;
                }
                lValueOf = Long.valueOf(zVar.f(i12));
            }
            i12++;
        }
    }

    public final void f(e eVar) {
        Fragment fragment = (Fragment) this.f42209c.b(eVar.getItemId());
        if (fragment == null) {
            h2.b("Design assumption violated.");
            return;
        }
        FrameLayout frameLayout = (FrameLayout) eVar.itemView;
        View view = fragment.getView();
        if (!fragment.isAdded() && view != null) {
            h2.b("Design assumption violated.");
            return;
        }
        boolean zIsAdded = fragment.isAdded();
        FragmentManager fragmentManager = this.f42208b;
        if (zIsAdded && view == null) {
            fragmentManager.W(new a(this, fragment, frameLayout), false);
            return;
        }
        if (fragment.isAdded() && view.getParent() != null) {
            if (view.getParent() != frameLayout) {
                a(view, frameLayout);
                return;
            }
            return;
        }
        if (fragment.isAdded()) {
            a(view, frameLayout);
            return;
        }
        if (fragmentManager.P()) {
            if (fragmentManager.K) {
                return;
            }
            this.f42207a.a(new d0(4, this, eVar));
            return;
        }
        fragmentManager.W(new a(this, fragment, frameLayout), false);
        b bVar = this.f42213g;
        bVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = bVar.f42200a.iterator();
        if (it.hasNext()) {
            throw e0.f.e(it);
        }
        try {
            fragment.setMenuVisibility(false);
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
            aVar.e(0, fragment, "f" + eVar.getItemId(), 1);
            aVar.m(fragment, Lifecycle.State.STARTED);
            aVar.j();
            this.f42212f.b(false);
        } finally {
            b.a(arrayList);
        }
    }

    public final void g(long j9) {
        ViewParent parent;
        z zVar = this.f42209c;
        Fragment fragment = (Fragment) zVar.b(j9);
        if (fragment == null) {
            return;
        }
        if (fragment.getView() != null && (parent = fragment.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        boolean zB = b(j9);
        z zVar2 = this.f42210d;
        if (!zB) {
            zVar2.i(j9);
        }
        if (!fragment.isAdded()) {
            zVar.i(j9);
            return;
        }
        FragmentManager fragmentManager = this.f42208b;
        if (fragmentManager.P()) {
            this.f42215i = true;
            return;
        }
        boolean zIsAdded = fragment.isAdded();
        b bVar = this.f42213g;
        if (zIsAdded && b(j9)) {
            bVar.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = bVar.f42200a.iterator();
            if (it.hasNext()) {
                throw e0.f.e(it);
            }
            j0 j0VarB0 = fragmentManager.b0(fragment);
            b.a(arrayList);
            zVar2.h(j9, j0VarB0);
        }
        bVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = bVar.f42200a.iterator();
        if (it2.hasNext()) {
            throw e0.f.e(it2);
        }
        try {
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
            aVar.l(fragment);
            aVar.j();
            zVar.i(j9);
        } finally {
            b.a(arrayList2);
        }
    }

    @Override // androidx.recyclerview.widget.l1
    public final long getItemId(int i11) {
        return i11;
    }

    @Override // androidx.recyclerview.widget.l1
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        g.j(this.f42212f == null);
        c cVar = new c(this);
        this.f42212f = cVar;
        ViewPager2 viewPager2A = c.a(recyclerView);
        cVar.f42204d = viewPager2A;
        i iVar = new i(cVar, 3);
        cVar.f42201a = iVar;
        viewPager2A.b(iVar);
        androidx.recyclerview.widget.h2 h2Var = new androidx.recyclerview.widget.h2(cVar, 2);
        cVar.f42202b = h2Var;
        registerAdapterDataObserver(h2Var);
        ea.b bVar = new ea.b(cVar, 6);
        cVar.f42203c = bVar;
        this.f42207a.a(bVar);
    }

    @Override // androidx.recyclerview.widget.l1
    public final void onBindViewHolder(r2 r2Var, int i11) {
        e eVar = (e) r2Var;
        long itemId = eVar.getItemId();
        int id2 = ((FrameLayout) eVar.itemView).getId();
        Long lE = e(id2);
        z zVar = this.f42211e;
        if (lE != null && lE.longValue() != itemId) {
            g(lE.longValue());
            zVar.i(lE.longValue());
        }
        zVar.h(itemId, Integer.valueOf(id2));
        long j9 = i11;
        z zVar2 = this.f42209c;
        if (zVar2.c(j9) < 0) {
            Fragment fragmentC = c(i11);
            fragmentC.setInitialSavedState((j0) this.f42210d.b(j9));
            zVar2.h(j9, fragmentC);
        }
        if (ViewCompat.H((FrameLayout) eVar.itemView)) {
            f(eVar);
        }
        d();
    }

    @Override // androidx.recyclerview.widget.l1
    public final r2 onCreateViewHolder(ViewGroup viewGroup, int i11) {
        int i12 = e.f42216a;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(ViewCompat.g());
        frameLayout.setSaveEnabled(false);
        return new e(frameLayout);
    }

    @Override // androidx.recyclerview.widget.l1
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        c cVar = this.f42212f;
        cVar.getClass();
        ViewPager2 viewPager2A = c.a(recyclerView);
        ((ArrayList) viewPager2A.f4116c.f20543b).remove(cVar.f42201a);
        d dVar = cVar.f42206f;
        dVar.unregisterAdapterDataObserver(cVar.f42202b);
        dVar.f42207a.d(cVar.f42203c);
        cVar.f42204d = null;
        this.f42212f = null;
    }

    @Override // androidx.recyclerview.widget.l1
    public final /* bridge */ /* synthetic */ boolean onFailedToRecycleView(r2 r2Var) {
        return true;
    }

    @Override // androidx.recyclerview.widget.l1
    public final void onViewAttachedToWindow(r2 r2Var) {
        f((e) r2Var);
        d();
    }

    @Override // androidx.recyclerview.widget.l1
    public final void onViewRecycled(r2 r2Var) {
        Long lE = e(((FrameLayout) ((e) r2Var).itemView).getId());
        if (lE != null) {
            g(lE.longValue());
            this.f42211e.i(lE.longValue());
        }
    }

    @Override // androidx.recyclerview.widget.l1
    public final void setHasStableIds(boolean z11) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }
}
