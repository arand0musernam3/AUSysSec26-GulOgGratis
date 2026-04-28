package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q2 f3267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n2 f3268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Fragment f3269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f3270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3272f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3273g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3274h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3275i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f3276j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f3277k;
    public final w1 l;

    public m2(q2 q2Var, n2 n2Var, w1 w1Var) {
        q2Var.getClass();
        n2Var.getClass();
        Fragment fragment = w1Var.f3369c;
        fragment.getClass();
        q2Var.getClass();
        n2Var.getClass();
        fragment.getClass();
        this.f3267a = q2Var;
        this.f3268b = n2Var;
        this.f3269c = fragment;
        this.f3270d = new ArrayList();
        this.f3275i = true;
        ArrayList arrayList = new ArrayList();
        this.f3276j = arrayList;
        this.f3277k = arrayList;
        this.l = w1Var;
    }

    public final void a(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.f3274h = false;
        if (this.f3271e) {
            return;
        }
        this.f3271e = true;
        if (this.f3276j.isEmpty()) {
            b();
            return;
        }
        for (l2 l2Var : CollectionsKt.r0(this.f3277k)) {
            l2Var.getClass();
            if (!l2Var.f3259b) {
                l2Var.b(viewGroup);
            }
            l2Var.f3259b = true;
        }
    }

    public final void b() {
        this.f3274h = false;
        if (!this.f3272f) {
            if (FragmentManager.L(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f3272f = true;
            Iterator it = this.f3270d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f3269c.mTransitioning = false;
        this.l.k();
    }

    public final void c(l2 l2Var) {
        l2Var.getClass();
        ArrayList arrayList = this.f3276j;
        if (arrayList.remove(l2Var) && arrayList.isEmpty()) {
            b();
        }
    }

    public final void d(q2 q2Var, n2 n2Var) {
        q2Var.getClass();
        n2Var.getClass();
        int i11 = r2.$EnumSwitchMapping$0[n2Var.ordinal()];
        Fragment fragment = this.f3269c;
        if (i11 == 1) {
            if (this.f3267a == q2.REMOVED) {
                if (FragmentManager.L(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f3268b + " to ADDING.");
                }
                this.f3267a = q2.VISIBLE;
                this.f3268b = n2.ADDING;
                this.f3275i = true;
                return;
            }
            return;
        }
        if (i11 == 2) {
            if (FragmentManager.L(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + this.f3267a + " -> REMOVED. mLifecycleImpact  = " + this.f3268b + " to REMOVING.");
            }
            this.f3267a = q2.REMOVED;
            this.f3268b = n2.REMOVING;
            this.f3275i = true;
            return;
        }
        if (i11 == 3 && this.f3267a != q2.REMOVED) {
            if (FragmentManager.L(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + this.f3267a + " -> " + q2Var + '.');
            }
            this.f3267a = q2Var;
        }
    }

    public final String toString() {
        StringBuilder sbS = e0.f.s("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        sbS.append(this.f3267a);
        sbS.append(" lifecycleImpact = ");
        sbS.append(this.f3268b);
        sbS.append(" fragment = ");
        sbS.append(this.f3269c);
        sbS.append('}');
        return sbS.toString();
    }
}
