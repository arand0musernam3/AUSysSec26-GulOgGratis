package androidx.fragment.app;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends l2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f3295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m2 f3296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m2 f3297e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h2 f3298f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f3299g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f3300h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f3301i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final q1.e f3302j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f3303k;
    public final ArrayList l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final q1.e f3304m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final q1.e f3305n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f3306o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d7.c f3307p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f3308q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f3309r;

    public p(ArrayList arrayList, m2 m2Var, m2 m2Var2, h2 h2Var, Object obj, ArrayList arrayList2, ArrayList arrayList3, q1.e eVar, ArrayList arrayList4, ArrayList arrayList5, q1.e eVar2, q1.e eVar3, boolean z11) {
        arrayList4.getClass();
        this.f3295c = arrayList;
        this.f3296d = m2Var;
        this.f3297e = m2Var2;
        this.f3298f = h2Var;
        this.f3299g = obj;
        this.f3300h = arrayList2;
        this.f3301i = arrayList3;
        this.f3302j = eVar;
        this.f3303k = arrayList4;
        this.l = arrayList5;
        this.f3304m = eVar2;
        this.f3305n = eVar3;
        this.f3306o = z11;
        this.f3307p = new d7.c();
    }

    public static void f(View view, ArrayList arrayList) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i11 = h7.y0.f21630a;
        if (viewGroup.isTransitionGroup()) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = viewGroup.getChildAt(i12);
            if (childAt.getVisibility() == 0) {
                f(childAt, arrayList);
            }
        }
    }

    @Override // androidx.fragment.app.l2
    public final boolean a() {
        Object obj;
        h2 h2Var = this.f3298f;
        if (!h2Var.l()) {
            return false;
        }
        ArrayList<q> arrayList = this.f3295c;
        if (!arrayList.isEmpty()) {
            for (q qVar : arrayList) {
                if (Build.VERSION.SDK_INT < 34 || (obj = qVar.f3313b) == null || !h2Var.m(obj)) {
                    return false;
                }
            }
        }
        Object obj2 = this.f3299g;
        return obj2 == null || h2Var.m(obj2);
    }

    @Override // androidx.fragment.app.l2
    public final void b(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.f3307p.a();
    }

    @Override // androidx.fragment.app.l2
    public final void c(ViewGroup viewGroup) {
        viewGroup.getClass();
        boolean zIsLaidOut = viewGroup.isLaidOut();
        ArrayList<q> arrayList = this.f3295c;
        if (!zIsLaidOut || this.f3309r) {
            for (q qVar : arrayList) {
                m2 m2Var = qVar.f3254a;
                if (FragmentManager.L(2)) {
                    if (this.f3309r) {
                        Log.v("FragmentManager", "SpecialEffectsController: TransitionSeekController was not created. Completing operation " + m2Var);
                    } else {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Completing operation " + m2Var);
                    }
                }
                qVar.f3254a.c(this);
            }
            this.f3309r = false;
            return;
        }
        Object obj = this.f3308q;
        h2 h2Var = this.f3298f;
        m2 m2Var2 = this.f3297e;
        m2 m2Var3 = this.f3296d;
        if (obj != null) {
            h2Var.c(obj);
            if (FragmentManager.L(2)) {
                Log.v("FragmentManager", "Ending execution of operations from " + m2Var3 + " to " + m2Var2);
                return;
            }
            return;
        }
        Pair pairG = g(viewGroup, m2Var2, m2Var3);
        ArrayList arrayList2 = (ArrayList) pairG.f26485a;
        Object obj2 = pairG.f26486b;
        ArrayList<m2> arrayList3 = new ArrayList(kotlin.collections.e0.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(((q) it.next()).f3254a);
        }
        for (m2 m2Var4 : arrayList3) {
            h2Var.u(m2Var4.f3269c, obj2, this.f3307p, new m(m2Var4, this, 1));
        }
        i(arrayList2, viewGroup, new n(this, viewGroup, obj2));
        if (FragmentManager.L(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + m2Var3 + " to " + m2Var2);
        }
    }

    @Override // androidx.fragment.app.l2
    public final void d(androidx.activity.b bVar, ViewGroup viewGroup) {
        viewGroup.getClass();
        Object obj = this.f3308q;
        if (obj != null) {
            this.f3298f.r(bVar.a(), obj);
        }
    }

    @Override // androidx.fragment.app.l2
    public final void e(ViewGroup viewGroup) {
        Object obj;
        viewGroup.getClass();
        boolean zIsLaidOut = viewGroup.isLaidOut();
        ArrayList arrayList = this.f3295c;
        if (!zIsLaidOut) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m2 m2Var = ((q) it.next()).f3254a;
                if (FragmentManager.L(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Skipping onStart for operation " + m2Var);
                }
            }
            return;
        }
        boolean zH = h();
        m2 m2Var2 = this.f3297e;
        m2 m2Var3 = this.f3296d;
        if (zH && (obj = this.f3299g) != null && !a()) {
            Log.i("FragmentManager", "Ignoring shared elements transition " + obj + " between " + m2Var3 + " and " + m2Var2 + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
        }
        if (a() && h()) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Pair pairG = g(viewGroup, m2Var2, m2Var3);
            ArrayList arrayList2 = (ArrayList) pairG.f26485a;
            Object obj2 = pairG.f26486b;
            ArrayList<m2> arrayList3 = new ArrayList(kotlin.collections.e0.o(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((q) it2.next()).f3254a);
            }
            for (m2 m2Var4 : arrayList3) {
                z zVar = new z(objectRef, 1);
                Fragment fragment = m2Var4.f3269c;
                this.f3298f.v(obj2, this.f3307p, zVar, new m(m2Var4, this, 0));
            }
            i(arrayList2, viewGroup, new o(this, viewGroup, obj2, objectRef));
        }
    }

    public final Pair g(ViewGroup viewGroup, m2 m2Var, m2 m2Var2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Object obj;
        h2 h2Var;
        ArrayList arrayList3;
        ArrayList arrayList4;
        Iterator it;
        m2 m2Var3 = m2Var;
        View view = new View(viewGroup.getContext());
        Rect rect = new Rect();
        ArrayList arrayList5 = this.f3295c;
        Iterator it2 = arrayList5.iterator();
        View view2 = null;
        boolean z11 = false;
        while (true) {
            boolean zHasNext = it2.hasNext();
            arrayList = this.f3301i;
            arrayList2 = this.f3300h;
            obj = this.f3299g;
            h2Var = this.f3298f;
            if (!zHasNext) {
                break;
            }
            if (((q) it2.next()).f3315d == null || m2Var2 == null || m2Var3 == null || this.f3302j.isEmpty() || obj == null) {
                arrayList4 = arrayList5;
                it = it2;
            } else {
                Fragment fragment = m2Var3.f3269c;
                Fragment fragment2 = m2Var2.f3269c;
                arrayList4 = arrayList5;
                boolean z12 = this.f3306o;
                it = it2;
                q1.e eVar = this.f3304m;
                a2.a(fragment, fragment2, z12, eVar);
                h7.y.a(viewGroup, new a40.q(m2Var3, m2Var2, this, 2));
                arrayList2.addAll(eVar.values());
                ArrayList arrayList6 = this.l;
                if (!arrayList6.isEmpty()) {
                    Object obj2 = arrayList6.get(0);
                    obj2.getClass();
                    View view3 = (View) eVar.get((String) obj2);
                    h2Var.s(view3, obj);
                    view2 = view3;
                }
                q1.e eVar2 = this.f3305n;
                arrayList.addAll(eVar2.values());
                ArrayList arrayList7 = this.f3303k;
                if (!arrayList7.isEmpty()) {
                    Object obj3 = arrayList7.get(0);
                    obj3.getClass();
                    View view4 = (View) eVar2.get((String) obj3);
                    if (view4 != null) {
                        h7.y.a(viewGroup, new d(h2Var, view4, rect));
                        z11 = true;
                    }
                }
                h2Var.w(obj, view, arrayList2);
                Object obj4 = this.f3299g;
                h2Var.q(obj4, null, null, obj4, arrayList);
            }
            arrayList5 = arrayList4;
            it2 = it;
        }
        ArrayList arrayList8 = arrayList5;
        ArrayList arrayList9 = arrayList;
        ArrayList arrayList10 = new ArrayList();
        Iterator it3 = arrayList8.iterator();
        Object objO = null;
        Object objO2 = null;
        while (it3.hasNext()) {
            ArrayList arrayList11 = arrayList9;
            q qVar = (q) it3.next();
            Iterator it4 = it3;
            m2 m2Var4 = qVar.f3254a;
            boolean z13 = z11;
            Object objH = h2Var.h(qVar.f3313b);
            if (objH != null) {
                ArrayList arrayList12 = arrayList2;
                ArrayList arrayList13 = new ArrayList();
                Object obj5 = obj;
                Fragment fragment3 = m2Var4.f3269c;
                Object obj6 = objO2;
                View view5 = fragment3.mView;
                view5.getClass();
                f(view5, arrayList13);
                if (obj5 != null && (m2Var4 == m2Var2 || m2Var4 == m2Var3)) {
                    if (m2Var4 == m2Var2) {
                        arrayList13.removeAll(CollectionsKt.v0(arrayList12));
                    } else {
                        arrayList13.removeAll(CollectionsKt.v0(arrayList11));
                    }
                }
                if (arrayList13.isEmpty()) {
                    h2Var.a(view, objH);
                    arrayList3 = arrayList13;
                } else {
                    h2Var.b(objH, arrayList13);
                    h2Var.q(objH, objH, arrayList13, null, null);
                    arrayList3 = arrayList13;
                    if (m2Var4.f3267a == q2.GONE) {
                        m2Var4.f3275i = false;
                        ArrayList arrayList14 = new ArrayList(arrayList3);
                        arrayList14.remove(fragment3.mView);
                        h2Var.p(objH, fragment3.mView, arrayList14);
                        h7.y.a(viewGroup, new z(arrayList3, 2));
                    }
                }
                if (m2Var4.f3267a == q2.VISIBLE) {
                    arrayList10.addAll(arrayList3);
                    if (z13) {
                        h2Var.t(objH, rect);
                    }
                    if (FragmentManager.L(2)) {
                        Log.v("FragmentManager", "Entering Transition: " + objH);
                        Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                        for (Object obj7 : arrayList3) {
                            obj7.getClass();
                            Log.v("FragmentManager", "View: " + ((View) obj7));
                        }
                    }
                } else {
                    h2Var.s(view2, objH);
                    if (FragmentManager.L(2)) {
                        Log.v("FragmentManager", "Exiting Transition: " + objH);
                        Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                        for (Object obj8 : arrayList3) {
                            obj8.getClass();
                            Log.v("FragmentManager", "View: " + ((View) obj8));
                        }
                    }
                }
                if (qVar.f3314c) {
                    objO = h2Var.o(objO, objH);
                    m2Var3 = m2Var;
                    arrayList9 = arrayList11;
                    it3 = it4;
                    z11 = z13;
                    arrayList2 = arrayList12;
                    obj = obj5;
                    objO2 = obj6;
                } else {
                    objO2 = h2Var.o(obj6, objH);
                    m2Var3 = m2Var;
                    arrayList9 = arrayList11;
                    it3 = it4;
                    z11 = z13;
                    arrayList2 = arrayList12;
                    obj = obj5;
                }
            } else {
                arrayList9 = arrayList11;
                it3 = it4;
                z11 = z13;
                m2Var3 = m2Var;
            }
        }
        Object objN = h2Var.n(objO, objO2, obj);
        if (FragmentManager.L(2)) {
            Log.v("FragmentManager", "Final merged transition: " + objN + " for container " + viewGroup);
        }
        return new Pair(arrayList10, objN);
    }

    public final boolean h() {
        ArrayList arrayList = this.f3295c;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((q) it.next()).f3254a.f3269c.mTransitioning) {
                return false;
            }
        }
        return true;
    }

    public final void i(ArrayList arrayList, ViewGroup viewGroup, Function0 function0) {
        a2.c(4, arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.f3301i;
        int size = arrayList3.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) arrayList3.get(i11);
            arrayList2.add(ViewCompat.A(view));
            ViewCompat.p0(view, null);
        }
        boolean zL = FragmentManager.L(2);
        ArrayList arrayList4 = this.f3300h;
        if (zL) {
            Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
            Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
            for (Object obj : arrayList4) {
                obj.getClass();
                View view2 = (View) obj;
                Log.v("FragmentManager", "View: " + view2 + " Name: " + ViewCompat.A(view2));
            }
            Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
            for (Object obj2 : arrayList3) {
                obj2.getClass();
                View view3 = (View) obj2;
                Log.v("FragmentManager", "View: " + view3 + " Name: " + ViewCompat.A(view3));
            }
        }
        function0.invoke();
        int size2 = arrayList3.size();
        ArrayList arrayList5 = new ArrayList();
        for (int i12 = 0; i12 < size2; i12++) {
            View view4 = (View) arrayList4.get(i12);
            String strA = ViewCompat.A(view4);
            arrayList5.add(strA);
            if (strA != null) {
                ViewCompat.p0(view4, null);
                String str = (String) this.f3302j.get(strA);
                int i13 = 0;
                while (true) {
                    if (i13 >= size2) {
                        break;
                    }
                    if (str.equals(arrayList2.get(i13))) {
                        ViewCompat.p0((View) arrayList3.get(i13), strA);
                        break;
                    }
                    i13++;
                }
            }
        }
        h7.y.a(viewGroup, new g2(size2, arrayList3, arrayList2, arrayList4, arrayList5));
        a2.c(0, arrayList);
        this.f3298f.x(this.f3299g, arrayList4, arrayList3);
    }
}
