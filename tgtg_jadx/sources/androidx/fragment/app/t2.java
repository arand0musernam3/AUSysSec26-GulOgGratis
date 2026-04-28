package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.app.tgtg.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f3349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f3350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f3351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3354f;

    public t2(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.f3349a = viewGroup;
        this.f3350b = new ArrayList();
        this.f3351c = new ArrayList();
    }

    public static final t2 i(ViewGroup viewGroup, FragmentManager fragmentManager) {
        viewGroup.getClass();
        fragmentManager.getClass();
        fragmentManager.J().getClass();
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof t2) {
            return (t2) tag;
        }
        s sVar = new s(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, sVar);
        return sVar;
    }

    public static boolean j(ArrayList arrayList) {
        boolean z11;
        Iterator it = arrayList.iterator();
        loop0: while (true) {
            z11 = true;
            while (it.hasNext()) {
                m2 m2Var = (m2) it.next();
                if (!m2Var.f3277k.isEmpty()) {
                    ArrayList arrayList2 = m2Var.f3277k;
                    if (arrayList2 == null || !arrayList2.isEmpty()) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            if (!((l2) it2.next()).a()) {
                                break;
                            }
                        }
                    }
                }
                z11 = false;
            }
            break loop0;
        }
        if (z11) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                kotlin.collections.i0.s(((m2) it3.next()).f3277k, arrayList3);
            }
            if (!arrayList3.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void a(m2 m2Var) {
        m2Var.getClass();
        if (m2Var.f3275i) {
            q2 q2Var = m2Var.f3267a;
            View viewRequireView = m2Var.f3269c.requireView();
            viewRequireView.getClass();
            q2Var.a(viewRequireView, this.f3349a);
            m2Var.f3275i = false;
        }
    }

    public abstract void b(ArrayList arrayList, boolean z11);

    public final void c(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kotlin.collections.i0.s(((m2) it.next()).f3277k, arrayList);
        }
        List listR0 = CollectionsKt.r0(CollectionsKt.v0(arrayList));
        int size = listR0.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((l2) listR0.get(i11)).c(this.f3349a);
        }
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            a((m2) list.get(i12));
        }
        List listR02 = CollectionsKt.r0(list);
        int size3 = listR02.size();
        for (int i13 = 0; i13 < size3; i13++) {
            m2 m2Var = (m2) listR02.get(i13);
            if (m2Var.f3277k.isEmpty()) {
                m2Var.b();
            }
        }
    }

    public final void d(q2 q2Var, n2 n2Var, w1 w1Var) {
        synchronized (this.f3350b) {
            try {
                Fragment fragment = w1Var.f3369c;
                fragment.getClass();
                m2 m2VarF = f(fragment);
                if (m2VarF == null) {
                    Fragment fragment2 = w1Var.f3369c;
                    m2VarF = (fragment2.mTransitioning || fragment2.mRemoving) ? g(fragment2) : null;
                }
                if (m2VarF != null) {
                    m2VarF.d(q2Var, n2Var);
                    return;
                }
                final m2 m2Var = new m2(q2Var, n2Var, w1Var);
                this.f3350b.add(m2Var);
                final int i11 = 0;
                m2Var.f3270d.add(new Runnable(this) { // from class: androidx.fragment.app.k2

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ t2 f3252b;

                    {
                        this.f3252b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                t2 t2Var = this.f3252b;
                                ArrayList arrayList = t2Var.f3350b;
                                m2 m2Var2 = m2Var;
                                if (arrayList.contains(m2Var2)) {
                                    q2 q2Var2 = m2Var2.f3267a;
                                    View view = m2Var2.f3269c.mView;
                                    view.getClass();
                                    q2Var2.a(view, t2Var.f3349a);
                                }
                                break;
                            default:
                                t2 t2Var2 = this.f3252b;
                                ArrayList arrayList2 = t2Var2.f3350b;
                                m2 m2Var3 = m2Var;
                                arrayList2.remove(m2Var3);
                                t2Var2.f3351c.remove(m2Var3);
                                break;
                        }
                    }
                });
                final int i12 = 1;
                m2Var.f3270d.add(new Runnable(this) { // from class: androidx.fragment.app.k2

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ t2 f3252b;

                    {
                        this.f3252b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                t2 t2Var = this.f3252b;
                                ArrayList arrayList = t2Var.f3350b;
                                m2 m2Var2 = m2Var;
                                if (arrayList.contains(m2Var2)) {
                                    q2 q2Var2 = m2Var2.f3267a;
                                    View view = m2Var2.f3269c.mView;
                                    view.getClass();
                                    q2Var2.a(view, t2Var.f3349a);
                                }
                                break;
                            default:
                                t2 t2Var2 = this.f3252b;
                                ArrayList arrayList2 = t2Var2.f3350b;
                                m2 m2Var3 = m2Var;
                                arrayList2.remove(m2Var3);
                                t2Var2.f3351c.remove(m2Var3);
                                break;
                        }
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        boolean z11;
        if (this.f3354f) {
            return;
        }
        if (!this.f3349a.isAttachedToWindow()) {
            h();
            this.f3353e = false;
            return;
        }
        synchronized (this.f3350b) {
            try {
                ArrayList<m2> arrayListT0 = CollectionsKt.t0(this.f3351c);
                this.f3351c.clear();
                Iterator it = arrayListT0.iterator();
                while (true) {
                    z11 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    m2 m2Var = (m2) it.next();
                    if (this.f3350b.isEmpty() || !m2Var.f3269c.mTransitioning) {
                        z11 = false;
                    }
                    m2Var.f3273g = z11;
                }
                for (m2 m2Var2 : arrayListT0) {
                    if (this.f3352d) {
                        if (FragmentManager.L(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + m2Var2);
                        }
                        m2Var2.b();
                    } else {
                        if (FragmentManager.L(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + m2Var2);
                        }
                        m2Var2.a(this.f3349a);
                    }
                    this.f3352d = false;
                    if (!m2Var2.f3272f) {
                        this.f3351c.add(m2Var2);
                    }
                }
                if (!this.f3350b.isEmpty()) {
                    m();
                    ArrayList arrayListT02 = CollectionsKt.t0(this.f3350b);
                    if (arrayListT02.isEmpty()) {
                        return;
                    }
                    this.f3350b.clear();
                    this.f3351c.addAll(arrayListT02);
                    if (FragmentManager.L(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    b(arrayListT02, this.f3353e);
                    boolean zJ = j(arrayListT02);
                    Iterator it2 = arrayListT02.iterator();
                    boolean z12 = true;
                    while (it2.hasNext()) {
                        if (!((m2) it2.next()).f3269c.mTransitioning) {
                            z12 = false;
                        }
                    }
                    if (!z12 || zJ) {
                        z11 = false;
                    }
                    this.f3352d = z11;
                    if (FragmentManager.L(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + zJ + " \ntransition = " + z12);
                    }
                    if (!z12) {
                        l(arrayListT02);
                        c(arrayListT02);
                    } else if (zJ) {
                        l(arrayListT02);
                        int size = arrayListT02.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            a((m2) arrayListT02.get(i11));
                        }
                    }
                    this.f3353e = false;
                    if (FragmentManager.L(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final m2 f(Fragment fragment) {
        Object next;
        Iterator it = this.f3350b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            m2 m2Var = (m2) next;
            if (Intrinsics.areEqual(m2Var.f3269c, fragment) && !m2Var.f3271e) {
                break;
            }
        }
        return (m2) next;
    }

    public final m2 g(Fragment fragment) {
        Object next;
        Iterator it = this.f3351c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            m2 m2Var = (m2) next;
            if (Intrinsics.areEqual(m2Var.f3269c, fragment) && !m2Var.f3271e) {
                break;
            }
        }
        return (m2) next;
    }

    public final void h() {
        if (FragmentManager.L(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zIsAttachedToWindow = this.f3349a.isAttachedToWindow();
        synchronized (this.f3350b) {
            try {
                m();
                l(this.f3350b);
                ArrayList<m2> arrayListT0 = CollectionsKt.t0(this.f3351c);
                Iterator it = arrayListT0.iterator();
                while (it.hasNext()) {
                    ((m2) it.next()).f3273g = false;
                }
                for (m2 m2Var : arrayListT0) {
                    if (FragmentManager.L(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f3349a + " is not attached to window. ") + "Cancelling running operation " + m2Var);
                    }
                    m2Var.a(this.f3349a);
                }
                ArrayList<m2> arrayListT02 = CollectionsKt.t0(this.f3350b);
                Iterator it2 = arrayListT02.iterator();
                while (it2.hasNext()) {
                    ((m2) it2.next()).f3273g = false;
                }
                for (m2 m2Var2 : arrayListT02) {
                    if (FragmentManager.L(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f3349a + " is not attached to window. ") + "Cancelling pending operation " + m2Var2);
                    }
                    m2Var2.a(this.f3349a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void k() {
        Object objPrevious;
        synchronized (this.f3350b) {
            try {
                m();
                ArrayList arrayList = this.f3350b;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    m2 m2Var = (m2) objPrevious;
                    o2 o2Var = q2.Companion;
                    View view = m2Var.f3269c.mView;
                    view.getClass();
                    o2Var.getClass();
                    q2 q2VarA = o2.a(view);
                    q2 q2Var = m2Var.f3267a;
                    q2 q2Var2 = q2.VISIBLE;
                    if (q2Var == q2Var2 && q2VarA != q2Var2) {
                        break;
                    }
                }
                m2 m2Var2 = (m2) objPrevious;
                Fragment fragment = m2Var2 != null ? m2Var2.f3269c : null;
                this.f3354f = fragment != null ? fragment.isPostponed() : false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l(List list) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            m2 m2Var = (m2) list.get(i11);
            w1 w1Var = m2Var.l;
            if (!m2Var.f3274h) {
                m2Var.f3274h = true;
                n2 n2Var = m2Var.f3268b;
                if (n2Var == n2.ADDING) {
                    Fragment fragment = w1Var.f3369c;
                    fragment.getClass();
                    View viewFindFocus = fragment.mView.findFocus();
                    if (viewFindFocus != null) {
                        fragment.setFocusedView(viewFindFocus);
                        if (FragmentManager.L(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragment);
                        }
                    }
                    View viewRequireView = m2Var.f3269c.requireView();
                    viewRequireView.getClass();
                    if (viewRequireView.getParent() == null) {
                        if (FragmentManager.L(2)) {
                            Log.v("FragmentManager", "Adding fragment " + fragment + " view " + viewRequireView + " to container in onStart");
                        }
                        w1Var.b();
                        viewRequireView.setAlpha(0.0f);
                    }
                    if (viewRequireView.getAlpha() == 0.0f && viewRequireView.getVisibility() == 0) {
                        if (FragmentManager.L(2)) {
                            Log.v("FragmentManager", "Making view " + viewRequireView + " INVISIBLE in onStart");
                        }
                        viewRequireView.setVisibility(4);
                    }
                    viewRequireView.setAlpha(fragment.getPostOnViewCreatedAlpha());
                    if (FragmentManager.L(2)) {
                        Log.v("FragmentManager", "Setting view alpha to " + fragment.getPostOnViewCreatedAlpha() + " in onStart");
                    }
                } else if (n2Var == n2.REMOVING) {
                    Fragment fragment2 = w1Var.f3369c;
                    fragment2.getClass();
                    View viewRequireView2 = fragment2.requireView();
                    viewRequireView2.getClass();
                    if (FragmentManager.L(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewRequireView2.findFocus() + " on view " + viewRequireView2 + " for Fragment " + fragment2);
                    }
                    viewRequireView2.clearFocus();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kotlin.collections.i0.s(((m2) it.next()).f3277k, arrayList);
        }
        List listR0 = CollectionsKt.r0(CollectionsKt.v0(arrayList));
        int size2 = listR0.size();
        for (int i12 = 0; i12 < size2; i12++) {
            l2 l2Var = (l2) listR0.get(i12);
            l2Var.getClass();
            ViewGroup viewGroup = this.f3349a;
            viewGroup.getClass();
            if (!l2Var.f3258a) {
                l2Var.e(viewGroup);
            }
            l2Var.f3258a = true;
        }
    }

    public final void m() {
        for (m2 m2Var : this.f3350b) {
            if (m2Var.f3268b == n2.ADDING) {
                View viewRequireView = m2Var.f3269c.requireView();
                viewRequireView.getClass();
                o2 o2Var = q2.Companion;
                int visibility = viewRequireView.getVisibility();
                o2Var.getClass();
                m2Var.d(o2.b(visibility), n2.NONE);
            }
        }
    }
}
