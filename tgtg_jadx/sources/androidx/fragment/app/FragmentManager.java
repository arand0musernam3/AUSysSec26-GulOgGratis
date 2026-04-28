package androidx.fragment.app;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.core.util.Consumer;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.savedstate.SavedStateRegistry;
import com.adyen.checkout.components.core.Address;
import com.app.tgtg.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentManager {
    public Fragment A;
    public h.e D;
    public h.e E;
    public h.e F;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public ArrayList M;
    public ArrayList N;
    public ArrayList O;
    public q1 P;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3108b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f3111e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public OnBackPressedDispatcher f3113g;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z0 f3123r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z0 f3124s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final z0 f3125t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final z0 f3126u;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public u0 f3129x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public r0 f3130y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Fragment f3131z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3107a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x1 f3109c = new x1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f3110d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w0 f3112f = new w0(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public androidx.fragment.app.a f3114h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3115i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b1 f3116j = new b1(this);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f3117k = new AtomicInteger();
    public final Map l = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Map f3118m = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Map f3119n = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f3120o = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y0 f3121p = new y0(this);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArrayList f3122q = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final c1 f3127v = new c1(this);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f3128w = -1;
    public final d1 B = new d1(this);
    public final n20.f C = new n20.f(4);
    public ArrayDeque G = new ArrayDeque();
    public final t Q = new t(this, 2);

    /* JADX WARN: Type inference failed for: r0v17, types: [androidx.fragment.app.z0] */
    /* JADX WARN: Type inference failed for: r0v18, types: [androidx.fragment.app.z0] */
    /* JADX WARN: Type inference failed for: r0v19, types: [androidx.fragment.app.z0] */
    /* JADX WARN: Type inference failed for: r0v20, types: [androidx.fragment.app.z0] */
    public FragmentManager() {
        final int i11 = 0;
        this.f3123r = new Consumer(this) { // from class: androidx.fragment.app.z0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FragmentManager f3394b;

            {
                this.f3394b = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        FragmentManager fragmentManager = this.f3394b;
                        if (fragmentManager.N()) {
                            fragmentManager.j(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        FragmentManager fragmentManager2 = this.f3394b;
                        if (fragmentManager2.N() && num.intValue() == 80) {
                            fragmentManager2.n(false);
                            break;
                        }
                        break;
                    case 2:
                        androidx.core.app.h hVar = (androidx.core.app.h) obj;
                        FragmentManager fragmentManager3 = this.f3394b;
                        if (fragmentManager3.N()) {
                            fragmentManager3.o(hVar.f2602a, false);
                        }
                        break;
                    default:
                        androidx.core.app.z0 z0Var = (androidx.core.app.z0) obj;
                        FragmentManager fragmentManager4 = this.f3394b;
                        if (fragmentManager4.N()) {
                            fragmentManager4.t(z0Var.f2717a, false);
                        }
                        break;
                }
            }
        };
        final int i12 = 1;
        this.f3124s = new Consumer(this) { // from class: androidx.fragment.app.z0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FragmentManager f3394b;

            {
                this.f3394b = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                switch (i12) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        FragmentManager fragmentManager = this.f3394b;
                        if (fragmentManager.N()) {
                            fragmentManager.j(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        FragmentManager fragmentManager2 = this.f3394b;
                        if (fragmentManager2.N() && num.intValue() == 80) {
                            fragmentManager2.n(false);
                            break;
                        }
                        break;
                    case 2:
                        androidx.core.app.h hVar = (androidx.core.app.h) obj;
                        FragmentManager fragmentManager3 = this.f3394b;
                        if (fragmentManager3.N()) {
                            fragmentManager3.o(hVar.f2602a, false);
                        }
                        break;
                    default:
                        androidx.core.app.z0 z0Var = (androidx.core.app.z0) obj;
                        FragmentManager fragmentManager4 = this.f3394b;
                        if (fragmentManager4.N()) {
                            fragmentManager4.t(z0Var.f2717a, false);
                        }
                        break;
                }
            }
        };
        final int i13 = 2;
        this.f3125t = new Consumer(this) { // from class: androidx.fragment.app.z0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FragmentManager f3394b;

            {
                this.f3394b = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                switch (i13) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        FragmentManager fragmentManager = this.f3394b;
                        if (fragmentManager.N()) {
                            fragmentManager.j(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        FragmentManager fragmentManager2 = this.f3394b;
                        if (fragmentManager2.N() && num.intValue() == 80) {
                            fragmentManager2.n(false);
                            break;
                        }
                        break;
                    case 2:
                        androidx.core.app.h hVar = (androidx.core.app.h) obj;
                        FragmentManager fragmentManager3 = this.f3394b;
                        if (fragmentManager3.N()) {
                            fragmentManager3.o(hVar.f2602a, false);
                        }
                        break;
                    default:
                        androidx.core.app.z0 z0Var = (androidx.core.app.z0) obj;
                        FragmentManager fragmentManager4 = this.f3394b;
                        if (fragmentManager4.N()) {
                            fragmentManager4.t(z0Var.f2717a, false);
                        }
                        break;
                }
            }
        };
        final int i14 = 3;
        this.f3126u = new Consumer(this) { // from class: androidx.fragment.app.z0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FragmentManager f3394b;

            {
                this.f3394b = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                switch (i14) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        FragmentManager fragmentManager = this.f3394b;
                        if (fragmentManager.N()) {
                            fragmentManager.j(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        FragmentManager fragmentManager2 = this.f3394b;
                        if (fragmentManager2.N() && num.intValue() == 80) {
                            fragmentManager2.n(false);
                            break;
                        }
                        break;
                    case 2:
                        androidx.core.app.h hVar = (androidx.core.app.h) obj;
                        FragmentManager fragmentManager3 = this.f3394b;
                        if (fragmentManager3.N()) {
                            fragmentManager3.o(hVar.f2602a, false);
                        }
                        break;
                    default:
                        androidx.core.app.z0 z0Var = (androidx.core.app.z0) obj;
                        FragmentManager fragmentManager4 = this.f3394b;
                        if (fragmentManager4.N()) {
                            fragmentManager4.t(z0Var.f2717a, false);
                        }
                        break;
                }
            }
        };
    }

    public static Fragment E(View view) {
        while (view != null) {
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            Fragment fragment = tag instanceof Fragment ? (Fragment) tag : null;
            if (fragment != null) {
                return fragment;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    public static HashSet G(androidx.fragment.app.a aVar) {
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < aVar.f3395a.size(); i11++) {
            Fragment fragment = ((y1) aVar.f3395a.get(i11)).f3383b;
            if (fragment != null && aVar.f3401g) {
                hashSet.add(fragment);
            }
        }
        return hashSet;
    }

    public static boolean L(int i11) {
        return Log.isLoggable("FragmentManager", i11);
    }

    public static boolean M(Fragment fragment) {
        if (fragment.mHasMenu && fragment.mMenuVisible) {
            return true;
        }
        boolean zM = false;
        for (Fragment fragment2 : fragment.mChildFragmentManager.f3109c.e()) {
            if (fragment2 != null) {
                zM = M(fragment2);
            }
            if (zM) {
                return true;
            }
        }
        return false;
    }

    public static boolean O(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.A) && O(fragmentManager.f3131z);
    }

    public static void i0(Fragment fragment) {
        if (L(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public final boolean A(boolean z11) {
        boolean zA;
        ArrayList arrayList;
        androidx.fragment.app.a aVar;
        z(z11);
        if (!this.f3115i && (aVar = this.f3114h) != null) {
            aVar.f3133s = false;
            aVar.h();
            if (L(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f3114h + " as part of execPendingActions for actions " + this.f3107a);
            }
            this.f3114h.i(false, false);
            this.f3107a.add(0, this.f3114h);
            Iterator it = this.f3114h.f3395a.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((y1) it.next()).f3383b;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.f3114h = null;
        }
        boolean z12 = false;
        while (true) {
            ArrayList arrayList2 = this.M;
            ArrayList arrayList3 = this.N;
            synchronized (this.f3107a) {
                if (this.f3107a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.f3107a.size();
                        int i11 = 0;
                        zA = false;
                        while (true) {
                            arrayList = this.f3107a;
                            if (i11 >= size) {
                                break;
                            }
                            zA |= ((j1) arrayList.get(i11)).a(arrayList2, arrayList3);
                            i11++;
                        }
                        arrayList.clear();
                        this.f3129x.f3358c.removeCallbacks(this.Q);
                    } finally {
                    }
                }
            }
            if (!zA) {
                break;
            }
            this.f3108b = true;
            try {
                Y(this.M, this.N);
                d();
                z12 = true;
            } catch (Throwable th2) {
                d();
                throw th2;
            }
        }
        l0();
        if (this.L) {
            this.L = false;
            for (w1 w1Var : this.f3109c.d()) {
                Fragment fragment2 = w1Var.f3369c;
                if (fragment2.mDeferStart) {
                    if (this.f3108b) {
                        this.L = true;
                    } else {
                        fragment2.mDeferStart = false;
                        w1Var.k();
                    }
                }
            }
        }
        this.f3109c.f3377b.values().removeAll(Collections.singleton(null));
        return z12;
    }

    public final void B(androidx.fragment.app.a aVar, boolean z11) {
        if (z11 && (this.f3129x == null || this.K)) {
            return;
        }
        z(z11);
        androidx.fragment.app.a aVar2 = this.f3114h;
        if (aVar2 != null) {
            aVar2.f3133s = false;
            aVar2.h();
            if (L(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f3114h + " as part of execSingleAction for action " + aVar);
            }
            this.f3114h.i(false, false);
            this.f3114h.a(this.M, this.N);
            Iterator it = this.f3114h.f3395a.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((y1) it.next()).f3383b;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.f3114h = null;
        }
        aVar.a(this.M, this.N);
        this.f3108b = true;
        try {
            Y(this.M, this.N);
            d();
            l0();
            boolean z12 = this.L;
            x1 x1Var = this.f3109c;
            if (z12) {
                this.L = false;
                for (w1 w1Var : x1Var.d()) {
                    Fragment fragment2 = w1Var.f3369c;
                    if (fragment2.mDeferStart) {
                        if (this.f3108b) {
                            this.L = true;
                        } else {
                            fragment2.mDeferStart = false;
                            w1Var.k();
                        }
                    }
                }
            }
            x1Var.f3377b.values().removeAll(Collections.singleton(null));
        } catch (Throwable th2) {
            d();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x021c A[PHI: r15
      0x021c: PHI (r15v14 int) = (r15v13 int), (r15v16 int) binds: [B:101:0x0209, B:105:0x0213] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(int r26, int r27, java.util.ArrayList r28, java.util.ArrayList r29) {
        /*
            Method dump skipped, instruction units count: 1284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.C(int, int, java.util.ArrayList, java.util.ArrayList):void");
    }

    public final int D(String str, int i11, boolean z11) {
        if (this.f3110d.isEmpty()) {
            return -1;
        }
        if (str == null && i11 < 0) {
            if (z11) {
                return 0;
            }
            return this.f3110d.size() - 1;
        }
        int size = this.f3110d.size() - 1;
        while (size >= 0) {
            androidx.fragment.app.a aVar = (androidx.fragment.app.a) this.f3110d.get(size);
            if ((str != null && str.equals(aVar.f3403i)) || (i11 >= 0 && i11 == aVar.f3134t)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z11) {
            if (size == this.f3110d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            androidx.fragment.app.a aVar2 = (androidx.fragment.app.a) this.f3110d.get(size - 1);
            if ((str == null || !str.equals(aVar2.f3403i)) && (i11 < 0 || i11 != aVar2.f3134t)) {
                break;
            }
            size--;
        }
        return size;
    }

    public final void F() {
        for (t2 t2Var : f()) {
            if (t2Var.f3354f) {
                if (L(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                t2Var.f3354f = false;
                t2Var.e();
            }
        }
    }

    public final ViewGroup H(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId <= 0 || !this.f3130y.c()) {
            return null;
        }
        View viewB = this.f3130y.b(fragment.mContainerId);
        if (viewB instanceof ViewGroup) {
            return (ViewGroup) viewB;
        }
        return null;
    }

    public final t0 I() {
        Fragment fragment = this.f3131z;
        return fragment != null ? fragment.mFragmentManager.I() : this.B;
    }

    public final n20.f J() {
        Fragment fragment = this.f3131z;
        return fragment != null ? fragment.mFragmentManager.J() : this.C;
    }

    public final void K(Fragment fragment) {
        if (L(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        h0(fragment);
    }

    public final boolean N() {
        Fragment fragment = this.f3131z;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.f3131z.getParentFragmentManager().N();
    }

    public final boolean P() {
        return this.I || this.J;
    }

    public final void Q(int i11, boolean z11) {
        u0 u0Var;
        if (this.f3129x == null && i11 != -1) {
            com.braze.h2.b("No activity");
            return;
        }
        if (z11 || i11 != this.f3128w) {
            this.f3128w = i11;
            x1 x1Var = this.f3109c;
            HashMap map = x1Var.f3377b;
            Iterator it = x1Var.f3376a.iterator();
            while (it.hasNext()) {
                w1 w1Var = (w1) map.get(((Fragment) it.next()).mWho);
                if (w1Var != null) {
                    w1Var.k();
                }
            }
            for (w1 w1Var2 : map.values()) {
                if (w1Var2 != null) {
                    w1Var2.k();
                    Fragment fragment = w1Var2.f3369c;
                    if (fragment.mRemoving && !fragment.isInBackStack()) {
                        if (fragment.mBeingSaved && !x1Var.f3378c.containsKey(fragment.mWho)) {
                            x1Var.i(w1Var2.n(), fragment.mWho);
                        }
                        x1Var.h(w1Var2);
                    }
                }
            }
            for (w1 w1Var3 : x1Var.d()) {
                Fragment fragment2 = w1Var3.f3369c;
                if (fragment2.mDeferStart) {
                    if (this.f3108b) {
                        this.L = true;
                    } else {
                        fragment2.mDeferStart = false;
                        w1Var3.k();
                    }
                }
            }
            if (this.H && (u0Var = this.f3129x) != null && this.f3128w == 7) {
                ((n0) u0Var).f3282e.invalidateMenu();
                this.H = false;
            }
        }
    }

    public final void R() {
        if (this.f3129x == null) {
            return;
        }
        this.I = false;
        this.J = false;
        this.P.f3327f = false;
        for (Fragment fragment : this.f3109c.f()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public final boolean S() {
        return T(-1, 0);
    }

    public final boolean T(int i11, int i12) {
        A(false);
        z(true);
        Fragment fragment = this.A;
        if (fragment != null && i11 < 0 && fragment.getChildFragmentManager().S()) {
            return true;
        }
        boolean zU = U(this.M, this.N, null, i11, i12);
        if (zU) {
            this.f3108b = true;
            try {
                Y(this.M, this.N);
            } finally {
                d();
            }
        }
        l0();
        boolean z11 = this.L;
        x1 x1Var = this.f3109c;
        if (z11) {
            this.L = false;
            for (w1 w1Var : x1Var.d()) {
                Fragment fragment2 = w1Var.f3369c;
                if (fragment2.mDeferStart) {
                    if (this.f3108b) {
                        this.L = true;
                    } else {
                        fragment2.mDeferStart = false;
                        w1Var.k();
                    }
                }
            }
        }
        x1Var.f3377b.values().removeAll(Collections.singleton(null));
        return zU;
    }

    public final boolean U(ArrayList arrayList, ArrayList arrayList2, String str, int i11, int i12) {
        int iD = D(str, i11, (i12 & 1) != 0);
        if (iD < 0) {
            return false;
        }
        for (int size = this.f3110d.size() - 1; size >= iD; size--) {
            arrayList.add((androidx.fragment.app.a) this.f3110d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void V(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mFragmentManager == this) {
            bundle.putString(str, fragment.mWho);
        } else {
            j0(new IllegalStateException(w.a0.m("Fragment ", fragment, " is not currently in the FragmentManager")));
            throw null;
        }
    }

    public final void W(a aVar, boolean z11) {
        y0 y0Var = this.f3121p;
        y0Var.getClass();
        y0Var.f3381b.add(new x0(aVar, z11));
    }

    public final void X(Fragment fragment) {
        if (L(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean zIsInBackStack = fragment.isInBackStack();
        if (fragment.mDetached && zIsInBackStack) {
            return;
        }
        x1 x1Var = this.f3109c;
        synchronized (x1Var.f3376a) {
            x1Var.f3376a.remove(fragment);
        }
        fragment.mAdded = false;
        if (M(fragment)) {
            this.H = true;
        }
        fragment.mRemoving = true;
        h0(fragment);
    }

    public final void Y(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            com.braze.h2.b("Internal error with the back stack records");
            return;
        }
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i11 < size) {
            if (!((androidx.fragment.app.a) arrayList.get(i11)).f3409p) {
                if (i12 != i11) {
                    C(i12, i11, arrayList, arrayList2);
                }
                i12 = i11 + 1;
                if (((Boolean) arrayList2.get(i11)).booleanValue()) {
                    while (i12 < size && ((Boolean) arrayList2.get(i12)).booleanValue() && !((androidx.fragment.app.a) arrayList.get(i12)).f3409p) {
                        i12++;
                    }
                }
                C(i11, i12, arrayList, arrayList2);
                i11 = i12 - 1;
            }
            i11++;
        }
        if (i12 != size) {
            C(i12, size, arrayList, arrayList2);
        }
    }

    public final void Z(Bundle bundle) {
        y0 y0Var;
        w1 w1Var;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f3129x.f3357b.getClassLoader());
                this.f3118m.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f3129x.f3357b.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        x1 x1Var = this.f3109c;
        HashMap map2 = x1Var.f3378c;
        HashMap map3 = x1Var.f3377b;
        map2.clear();
        map2.putAll(map);
        o1 o1Var = (o1) bundle.getParcelable("state");
        if (o1Var == null) {
            return;
        }
        map3.clear();
        Iterator it = o1Var.f3287a.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            y0Var = this.f3121p;
            if (!zHasNext) {
                break;
            }
            Bundle bundleI = x1Var.i(null, (String) it.next());
            if (bundleI != null) {
                Fragment fragment = (Fragment) this.P.f3322a.get(((t1) bundleI.getParcelable("state")).f3336b);
                if (fragment != null) {
                    if (L(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment);
                    }
                    w1Var = new w1(y0Var, x1Var, fragment, bundleI);
                } else {
                    w1Var = new w1(this.f3121p, this.f3109c, this.f3129x.f3357b.getClassLoader(), I(), bundleI);
                }
                Fragment fragment2 = w1Var.f3369c;
                fragment2.mSavedFragmentState = bundleI;
                fragment2.mFragmentManager = this;
                if (L(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragment2.mWho + "): " + fragment2);
                }
                w1Var.l(this.f3129x.f3357b.getClassLoader());
                x1Var.g(w1Var);
                w1Var.f3371e = this.f3128w;
            }
        }
        q1 q1Var = this.P;
        q1Var.getClass();
        for (Fragment fragment3 : new ArrayList(q1Var.f3322a.values())) {
            if (map3.get(fragment3.mWho) == null) {
                if (L(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment3 + " that was not found in the set of active Fragments " + o1Var.f3287a);
                }
                this.P.e(fragment3);
                fragment3.mFragmentManager = this;
                w1 w1Var2 = new w1(y0Var, x1Var, fragment3);
                w1Var2.f3371e = 1;
                w1Var2.k();
                fragment3.mRemoving = true;
                w1Var2.k();
            }
        }
        ArrayList<String> arrayList = o1Var.f3288b;
        x1Var.f3376a.clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                Fragment fragmentB = x1Var.b(str3);
                if (fragmentB == null) {
                    com.braze.h2.b(w.a0.p("No instantiated fragment for (", str3, ")"));
                    return;
                }
                if (L(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + fragmentB);
                }
                x1Var.a(fragmentB);
            }
        }
        if (o1Var.f3289c != null) {
            this.f3110d = new ArrayList(o1Var.f3289c.length);
            int i11 = 0;
            while (true) {
                b[] bVarArr = o1Var.f3289c;
                if (i11 >= bVarArr.length) {
                    break;
                }
                b bVar = bVarArr[i11];
                ArrayList arrayList2 = bVar.f3142b;
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(this);
                bVar.a(aVar);
                aVar.f3134t = bVar.f3147g;
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    String str4 = (String) arrayList2.get(i12);
                    if (str4 != null) {
                        ((y1) aVar.f3395a.get(i12)).f3383b = x1Var.b(str4);
                    }
                }
                aVar.g(1);
                if (L(2)) {
                    StringBuilder sbK = org.bouncycastle.jcajce.provider.asymmetric.a.k(i11, "restoreAllState: back stack #", " (index ");
                    sbK.append(aVar.f3134t);
                    sbK.append("): ");
                    sbK.append(aVar);
                    Log.v("FragmentManager", sbK.toString());
                    PrintWriter printWriter = new PrintWriter(new j2());
                    aVar.k("  ", printWriter, false);
                    printWriter.close();
                }
                this.f3110d.add(aVar);
                i11++;
            }
        } else {
            this.f3110d = new ArrayList();
        }
        this.f3117k.set(o1Var.f3290d);
        String str5 = o1Var.f3291e;
        if (str5 != null) {
            Fragment fragmentB2 = x1Var.b(str5);
            this.A = fragmentB2;
            s(fragmentB2);
        }
        ArrayList arrayList3 = o1Var.f3292f;
        if (arrayList3 != null) {
            for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                this.l.put((String) arrayList3.get(i13), (c) o1Var.f3293g.get(i13));
            }
        }
        this.G = new ArrayDeque(o1Var.f3294h);
    }

    public final w1 a(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            q8.c.d(fragment, str);
        }
        if (L(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        w1 w1VarH = h(fragment);
        fragment.mFragmentManager = this;
        x1 x1Var = this.f3109c;
        x1Var.g(w1VarH);
        if (!fragment.mDetached) {
            x1Var.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (M(fragment)) {
                this.H = true;
            }
        }
        return w1VarH;
    }

    public final Bundle a0() {
        ArrayList arrayList;
        b[] bVarArr;
        Bundle bundle = new Bundle();
        F();
        x();
        A(true);
        this.I = true;
        this.P.f3327f = true;
        x1 x1Var = this.f3109c;
        x1Var.getClass();
        HashMap map = x1Var.f3377b;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (w1 w1Var : map.values()) {
            if (w1Var != null) {
                Fragment fragment = w1Var.f3369c;
                x1Var.i(w1Var.n(), fragment.mWho);
                arrayList2.add(fragment.mWho);
                if (L(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + fragment.mSavedFragmentState);
                }
            }
        }
        HashMap map2 = this.f3109c.f3378c;
        if (!map2.isEmpty()) {
            x1 x1Var2 = this.f3109c;
            synchronized (x1Var2.f3376a) {
                try {
                    if (x1Var2.f3376a.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(x1Var2.f3376a.size());
                        for (Fragment fragment2 : x1Var2.f3376a) {
                            arrayList.add(fragment2.mWho);
                            if (L(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment2.mWho + "): " + fragment2);
                            }
                        }
                    }
                } finally {
                }
            }
            int size = this.f3110d.size();
            if (size > 0) {
                bVarArr = new b[size];
                for (int i11 = 0; i11 < size; i11++) {
                    bVarArr[i11] = new b((androidx.fragment.app.a) this.f3110d.get(i11));
                    if (L(2)) {
                        StringBuilder sbK = org.bouncycastle.jcajce.provider.asymmetric.a.k(i11, "saveAllState: adding back stack #", ": ");
                        sbK.append(this.f3110d.get(i11));
                        Log.v("FragmentManager", sbK.toString());
                    }
                }
            } else {
                bVarArr = null;
            }
            o1 o1Var = new o1();
            o1Var.f3291e = null;
            ArrayList arrayList3 = new ArrayList();
            o1Var.f3292f = arrayList3;
            ArrayList arrayList4 = new ArrayList();
            o1Var.f3293g = arrayList4;
            o1Var.f3287a = arrayList2;
            o1Var.f3288b = arrayList;
            o1Var.f3289c = bVarArr;
            o1Var.f3290d = this.f3117k.get();
            Fragment fragment3 = this.A;
            if (fragment3 != null) {
                o1Var.f3291e = fragment3.mWho;
            }
            arrayList3.addAll(this.l.keySet());
            arrayList4.addAll(this.l.values());
            o1Var.f3294h = new ArrayList(this.G);
            bundle.putParcelable("state", o1Var);
            for (String str : this.f3118m.keySet()) {
                bundle.putBundle(e0.f.k("result_", str), (Bundle) this.f3118m.get(str));
            }
            for (String str2 : map2.keySet()) {
                bundle.putBundle(e0.f.k("fragment_", str2), (Bundle) map2.get(str2));
            }
        } else if (L(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(u0 u0Var, r0 r0Var, Fragment fragment) {
        if (this.f3129x != null) {
            com.braze.h2.b("Already attached");
            return;
        }
        this.f3129x = u0Var;
        this.f3130y = r0Var;
        this.f3131z = fragment;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3122q;
        if (fragment != null) {
            copyOnWriteArrayList.add(new f1(fragment));
        } else if (u0Var instanceof r1) {
            copyOnWriteArrayList.add((r1) u0Var);
        }
        if (this.f3131z != null) {
            l0();
        }
        if (u0Var instanceof androidx.activity.f0) {
            androidx.activity.f0 f0Var = (androidx.activity.f0) u0Var;
            OnBackPressedDispatcher onBackPressedDispatcher = f0Var.getOnBackPressedDispatcher();
            this.f3113g = onBackPressedDispatcher;
            LifecycleOwner lifecycleOwner = f0Var;
            if (fragment != null) {
                lifecycleOwner = fragment;
            }
            onBackPressedDispatcher.b(this.f3116j, lifecycleOwner);
        }
        if (fragment != null) {
            q1 q1Var = fragment.mFragmentManager.P;
            HashMap map = q1Var.f3323b;
            q1 q1Var2 = (q1) map.get(fragment.mWho);
            if (q1Var2 == null) {
                q1Var2 = new q1(q1Var.f3325d);
                map.put(fragment.mWho, q1Var2);
            }
            this.P = q1Var2;
        } else if (u0Var instanceof androidx.lifecycle.s1) {
            ViewModelStore viewModelStore = ((androidx.lifecycle.s1) u0Var).getViewModelStore();
            viewModelStore.getClass();
            y8.a aVar = y8.a.f45423b;
            aVar.getClass();
            com.google.firebase.messaging.a0 a0Var = new com.google.firebase.messaging.a0(viewModelStore, q1.f3321g, aVar);
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(q1.class);
            orCreateKotlinClass.getClass();
            String qualifiedName = orCreateKotlinClass.getQualifiedName();
            if (qualifiedName == null) {
                i4.a.f("Local and anonymous classes can not be ViewModels");
                return;
            }
            this.P = (q1) a0Var.M("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), orCreateKotlinClass);
        } else {
            this.P = new q1(false);
        }
        this.P.f3327f = P();
        this.f3109c.f3379d = this.P;
        Object obj = this.f3129x;
        if ((obj instanceof ea.f) && fragment == null) {
            SavedStateRegistry savedStateRegistry = ((ea.f) obj).getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new k0(this, 1));
            Bundle bundleA = savedStateRegistry.a("android:support:fragments");
            if (bundleA != null) {
                Z(bundleA);
            }
        }
        Object obj2 = this.f3129x;
        if (obj2 instanceof h.f) {
            ActivityResultRegistry activityResultRegistry = ((h.f) obj2).getActivityResultRegistry();
            String strConcat = "FragmentManager:".concat(fragment != null ? r8.k.p(new StringBuilder(), fragment.mWho, ":") : "");
            this.D = activityResultRegistry.c(strConcat.concat("StartActivityForResult"), new g1(4), new a1(this, 1));
            this.E = activityResultRegistry.c(strConcat.concat("StartIntentSenderForResult"), new g1(0), new a1(this, 2));
            this.F = activityResultRegistry.c(strConcat.concat("RequestPermissions"), new g1(2), new a1(this, 0));
        }
        Object obj3 = this.f3129x;
        if (obj3 instanceof v6.c) {
            ((v6.c) obj3).addOnConfigurationChangedListener(this.f3123r);
        }
        Object obj4 = this.f3129x;
        if (obj4 instanceof v6.d) {
            ((v6.d) obj4).addOnTrimMemoryListener(this.f3124s);
        }
        Object obj5 = this.f3129x;
        if (obj5 instanceof androidx.core.app.v0) {
            ((androidx.core.app.v0) obj5).addOnMultiWindowModeChangedListener(this.f3125t);
        }
        Object obj6 = this.f3129x;
        if (obj6 instanceof androidx.core.app.w0) {
            ((androidx.core.app.w0) obj6).addOnPictureInPictureModeChangedListener(this.f3126u);
        }
        Object obj7 = this.f3129x;
        if ((obj7 instanceof h7.p) && fragment == null) {
            ((h7.p) obj7).addMenuProvider(this.f3127v);
        }
    }

    public final j0 b0(Fragment fragment) {
        w1 w1Var = (w1) this.f3109c.f3377b.get(fragment.mWho);
        if (w1Var != null) {
            Fragment fragment2 = w1Var.f3369c;
            if (fragment2.equals(fragment)) {
                if (fragment2.mState > -1) {
                    return new j0(w1Var.n());
                }
                return null;
            }
        }
        j0(new IllegalStateException(w.a0.m("Fragment ", fragment, " is not currently in the FragmentManager")));
        throw null;
    }

    public final void c(Fragment fragment) {
        if (L(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f3109c.a(fragment);
            if (L(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (M(fragment)) {
                this.H = true;
            }
        }
    }

    public final void c0() {
        synchronized (this.f3107a) {
            try {
                if (this.f3107a.size() == 1) {
                    this.f3129x.f3358c.removeCallbacks(this.Q);
                    this.f3129x.f3358c.post(this.Q);
                    l0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        this.f3108b = false;
        this.N.clear();
        this.M.clear();
    }

    public final void d0(Fragment fragment, boolean z11) {
        ViewGroup viewGroupH = H(fragment);
        if (viewGroupH == null || !(viewGroupH instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupH).setDrawDisappearingViewsLast(!z11);
    }

    public final void e() {
        i1 i1Var = (i1) this.f3119n.remove("cookies_v2_result");
        if (i1Var != null) {
            i1Var.f3232a.d(i1Var.f3234c);
        }
        if (L(2)) {
            Log.v("FragmentManager", "Clearing FragmentResultListener for key cookies_v2_result");
        }
    }

    public final void e0(k.h hVar, s1 s1Var) {
        Lifecycle lifecycle = hVar.getLifecycle();
        if (lifecycle.b() == Lifecycle.State.DESTROYED) {
            return;
        }
        e1 e1Var = new e1(this, s1Var, lifecycle);
        i1 i1Var = (i1) this.f3119n.put("cookies_v2_result", new i1(lifecycle, s1Var, e1Var));
        if (i1Var != null) {
            i1Var.f3232a.d(i1Var.f3234c);
        }
        if (L(2)) {
            Log.v("FragmentManager", "Setting FragmentResultListener with key cookies_v2_result lifecycleOwner " + lifecycle + " and listener " + s1Var);
        }
        lifecycle.a(e1Var);
    }

    public final HashSet f() {
        Object sVar;
        HashSet hashSet = new HashSet();
        Iterator it = this.f3109c.d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((w1) it.next()).f3369c.mContainer;
            if (viewGroup != null) {
                J().getClass();
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof t2) {
                    sVar = (t2) tag;
                } else {
                    sVar = new s(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, sVar);
                }
                hashSet.add(sVar);
            }
        }
        return hashSet;
    }

    public final void f0(Fragment fragment, Lifecycle.State state) {
        if (fragment.equals(this.f3109c.b(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = state;
        } else {
            m0.i1.k("Fragment ", fragment, " is not an active fragment of FragmentManager ", this);
        }
    }

    public Fragment findFragmentById(int i11) {
        x1 x1Var = this.f3109c;
        ArrayList arrayList = x1Var.f3376a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) arrayList.get(size);
            if (fragment != null && fragment.mFragmentId == i11) {
                return fragment;
            }
        }
        for (w1 w1Var : x1Var.f3377b.values()) {
            if (w1Var != null) {
                Fragment fragment2 = w1Var.f3369c;
                if (fragment2.mFragmentId == i11) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public Fragment findFragmentByTag(String str) {
        x1 x1Var = this.f3109c;
        ArrayList arrayList = x1Var.f3376a;
        if (str != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) arrayList.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (w1 w1Var : x1Var.f3377b.values()) {
            if (w1Var != null) {
                Fragment fragment2 = w1Var.f3369c;
                if (str.equals(fragment2.mTag)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final HashSet g(ArrayList arrayList, int i11, int i12) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i11 < i12) {
            Iterator it = ((androidx.fragment.app.a) arrayList.get(i11)).f3395a.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((y1) it.next()).f3383b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(t2.i(viewGroup, this));
                }
            }
            i11++;
        }
        return hashSet;
    }

    public final void g0(Fragment fragment) {
        if (fragment != null) {
            if (!fragment.equals(this.f3109c.b(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this)) {
                m0.i1.k("Fragment ", fragment, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        Fragment fragment2 = this.A;
        this.A = fragment;
        s(fragment2);
        s(this.A);
    }

    public final w1 h(Fragment fragment) {
        String str = fragment.mWho;
        x1 x1Var = this.f3109c;
        w1 w1Var = (w1) x1Var.f3377b.get(str);
        if (w1Var != null) {
            return w1Var;
        }
        w1 w1Var2 = new w1(this.f3121p, x1Var, fragment);
        w1Var2.l(this.f3129x.f3357b.getClassLoader());
        w1Var2.f3371e = this.f3128w;
        return w1Var2;
    }

    public final void h0(Fragment fragment) {
        ViewGroup viewGroupH = H(fragment);
        if (viewGroupH != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                if (viewGroupH.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupH.setTag(R.id.visible_removing_fragment_view_tag, fragment);
                }
                ((Fragment) viewGroupH.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    public final void i(Fragment fragment) {
        if (L(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (L(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            x1 x1Var = this.f3109c;
            synchronized (x1Var.f3376a) {
                x1Var.f3376a.remove(fragment);
            }
            fragment.mAdded = false;
            if (M(fragment)) {
                this.H = true;
            }
            h0(fragment);
        }
    }

    public final void j(boolean z11, Configuration configuration) {
        if (z11 && (this.f3129x instanceof v6.c)) {
            j0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f3109c.f()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z11) {
                    fragment.mChildFragmentManager.j(true, configuration);
                }
            }
        }
    }

    public final void j0(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new j2());
        u0 u0Var = this.f3129x;
        if (u0Var == null) {
            try {
                w("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e5) {
                Log.e("FragmentManager", "Failed dumping state", e5);
                throw runtimeException;
            }
        }
        try {
            ((n0) u0Var).f3282e.dump("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e11) {
            Log.e("FragmentManager", "Failed dumping state", e11);
            throw runtimeException;
        }
    }

    public final boolean k(MenuItem menuItem) {
        if (this.f3128w < 1) {
            return false;
        }
        for (Fragment fragment : this.f3109c.f()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        r0.f3381b.remove(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k0(androidx.fragment.app.FragmentManager.a r6) {
        /*
            r5 = this;
            androidx.fragment.app.y0 r0 = r5.f3121p
            r0.getClass()
            r6.getClass()
            java.util.concurrent.CopyOnWriteArrayList r1 = r0.f3381b
            monitor-enter(r1)
            java.util.concurrent.CopyOnWriteArrayList r2 = r0.f3381b     // Catch: java.lang.Throwable -> L26
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L26
            r3 = 0
        L12:
            if (r3 >= r2) goto L2b
            java.util.concurrent.CopyOnWriteArrayList r4 = r0.f3381b     // Catch: java.lang.Throwable -> L26
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> L26
            androidx.fragment.app.x0 r4 = (androidx.fragment.app.x0) r4     // Catch: java.lang.Throwable -> L26
            androidx.fragment.app.FragmentManager$a r4 = r4.f3374a     // Catch: java.lang.Throwable -> L26
            if (r4 != r6) goto L28
            java.util.concurrent.CopyOnWriteArrayList r6 = r0.f3381b     // Catch: java.lang.Throwable -> L26
            r6.remove(r3)     // Catch: java.lang.Throwable -> L26
            goto L2b
        L26:
            r6 = move-exception
            goto L2d
        L28:
            int r3 = r3 + 1
            goto L12
        L2b:
            monitor-exit(r1)
            return
        L2d:
            monitor-exit(r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.k0(androidx.fragment.app.FragmentManager$a):void");
    }

    public final boolean l(Menu menu, MenuInflater menuInflater) {
        if (this.f3128w < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z11 = false;
        for (Fragment fragment : this.f3109c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z11 = true;
            }
        }
        if (this.f3111e != null) {
            for (int i11 = 0; i11 < this.f3111e.size(); i11++) {
                Fragment fragment2 = (Fragment) this.f3111e.get(i11);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f3111e = arrayList;
        return z11;
    }

    public final void l0() {
        synchronized (this.f3107a) {
            try {
                if (!this.f3107a.isEmpty()) {
                    this.f3116j.setEnabled(true);
                    if (L(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z11 = this.f3110d.size() + (this.f3114h != null ? 1 : 0) > 0 && O(this.f3131z);
                if (L(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z11);
                }
                this.f3116j.setEnabled(z11);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void m() {
        boolean zIsChangingConfigurations = true;
        this.K = true;
        A(true);
        x();
        u0 u0Var = this.f3129x;
        boolean z11 = u0Var instanceof androidx.lifecycle.s1;
        x1 x1Var = this.f3109c;
        if (z11) {
            zIsChangingConfigurations = x1Var.f3379d.f3326e;
        } else {
            o0 o0Var = u0Var.f3357b;
            if (o0Var != null) {
                zIsChangingConfigurations = true ^ o0Var.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it = this.l.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((c) it.next()).f3159a.iterator();
                while (it2.hasNext()) {
                    x1Var.f3379d.c((String) it2.next(), false);
                }
            }
        }
        v(-1);
        Object obj = this.f3129x;
        if (obj instanceof v6.d) {
            ((v6.d) obj).removeOnTrimMemoryListener(this.f3124s);
        }
        Object obj2 = this.f3129x;
        if (obj2 instanceof v6.c) {
            ((v6.c) obj2).removeOnConfigurationChangedListener(this.f3123r);
        }
        Object obj3 = this.f3129x;
        if (obj3 instanceof androidx.core.app.v0) {
            ((androidx.core.app.v0) obj3).removeOnMultiWindowModeChangedListener(this.f3125t);
        }
        Object obj4 = this.f3129x;
        if (obj4 instanceof androidx.core.app.w0) {
            ((androidx.core.app.w0) obj4).removeOnPictureInPictureModeChangedListener(this.f3126u);
        }
        Object obj5 = this.f3129x;
        if ((obj5 instanceof h7.p) && this.f3131z == null) {
            ((h7.p) obj5).removeMenuProvider(this.f3127v);
        }
        this.f3129x = null;
        this.f3130y = null;
        this.f3131z = null;
        if (this.f3113g != null) {
            this.f3116j.remove();
            this.f3113g = null;
        }
        h.e eVar = this.D;
        if (eVar != null) {
            eVar.b();
            this.E.b();
            this.F.b();
        }
    }

    public final void n(boolean z11) {
        if (z11 && (this.f3129x instanceof v6.d)) {
            j0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f3109c.f()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z11) {
                    fragment.mChildFragmentManager.n(true);
                }
            }
        }
    }

    public final void o(boolean z11, boolean z12) {
        if (z12 && (this.f3129x instanceof androidx.core.app.v0)) {
            j0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f3109c.f()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z11);
                if (z12) {
                    fragment.mChildFragmentManager.o(z11, true);
                }
            }
        }
    }

    public final void p() {
        for (Fragment fragment : this.f3109c.e()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.p();
            }
        }
    }

    public final boolean q(MenuItem menuItem) {
        if (this.f3128w < 1) {
            return false;
        }
        for (Fragment fragment : this.f3109c.f()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void r(Menu menu) {
        if (this.f3128w < 1) {
            return;
        }
        for (Fragment fragment : this.f3109c.f()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void s(Fragment fragment) {
        if (fragment != null) {
            if (fragment.equals(this.f3109c.b(fragment.mWho))) {
                fragment.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    public final void t(boolean z11, boolean z12) {
        if (z12 && (this.f3129x instanceof androidx.core.app.w0)) {
            j0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f3109c.f()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z11);
                if (z12) {
                    fragment.mChildFragmentManager.t(z11, true);
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Fragment fragment = this.f3131z;
        if (fragment != null) {
            sb2.append(fragment.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f3131z)));
            sb2.append("}");
        } else {
            u0 u0Var = this.f3129x;
            if (u0Var != null) {
                sb2.append(u0Var.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f3129x)));
                sb2.append("}");
            } else {
                sb2.append(Address.ADDRESS_NULL_PLACEHOLDER);
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    public final boolean u(Menu menu) {
        boolean z11 = false;
        if (this.f3128w < 1) {
            return false;
        }
        for (Fragment fragment : this.f3109c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performPrepareOptionsMenu(menu)) {
                z11 = true;
            }
        }
        return z11;
    }

    public final void v(int i11) {
        try {
            this.f3108b = true;
            for (w1 w1Var : this.f3109c.f3377b.values()) {
                if (w1Var != null) {
                    w1Var.f3371e = i11;
                }
            }
            Q(i11, false);
            Iterator it = f().iterator();
            while (it.hasNext()) {
                ((t2) it.next()).h();
            }
            this.f3108b = false;
            A(true);
        } catch (Throwable th2) {
            this.f3108b = false;
            throw th2;
        }
    }

    public final void w(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String strL = r8.k.l(str, "    ");
        x1 x1Var = this.f3109c;
        ArrayList arrayList = x1Var.f3376a;
        String strL2 = r8.k.l(str, "    ");
        HashMap map = x1Var.f3377b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (w1 w1Var : map.values()) {
                printWriter.print(str);
                if (w1Var != null) {
                    Fragment fragment = w1Var.f3369c;
                    printWriter.println(fragment);
                    fragment.dump(strL2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println(Address.ADDRESS_NULL_PLACEHOLDER);
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i11 = 0; i11 < size2; i11++) {
                Fragment fragment2 = (Fragment) arrayList.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList arrayList2 = this.f3111e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i12 = 0; i12 < size; i12++) {
                Fragment fragment3 = (Fragment) this.f3111e.get(i12);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i12);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        int size3 = this.f3110d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i13 = 0; i13 < size3; i13++) {
                androidx.fragment.app.a aVar = (androidx.fragment.app.a) this.f3110d.get(i13);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i13);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.k(strL, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f3117k.get());
        synchronized (this.f3107a) {
            try {
                int size4 = this.f3107a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i14 = 0; i14 < size4; i14++) {
                        Object obj = (j1) this.f3107a.get(i14);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i14);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f3129x);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f3130y);
        if (this.f3131z != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f3131z);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f3128w);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.I);
        printWriter.print(" mStopped=");
        printWriter.print(this.J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.K);
        if (this.H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.H);
        }
    }

    public final void x() {
        Iterator it = f().iterator();
        while (it.hasNext()) {
            ((t2) it.next()).h();
        }
    }

    public final void y(j1 j1Var, boolean z11) {
        if (!z11) {
            if (this.f3129x == null) {
                if (this.K) {
                    com.braze.h2.b("FragmentManager has been destroyed");
                    return;
                } else {
                    com.braze.h2.b("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (P()) {
                com.braze.h2.b("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        synchronized (this.f3107a) {
            try {
                if (this.f3129x == null) {
                    if (!z11) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f3107a.add(j1Var);
                    c0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void z(boolean z11) {
        if (this.f3108b) {
            com.braze.h2.b("FragmentManager is already executing transactions");
            return;
        }
        if (this.f3129x == null) {
            if (this.K) {
                com.braze.h2.b("FragmentManager has been destroyed");
                return;
            } else {
                com.braze.h2.b("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.f3129x.f3358c.getLooper()) {
            com.braze.h2.b("Must be called from main thread of fragment host");
            return;
        }
        if (!z11 && P()) {
            com.braze.h2.b("Can not perform this action after onSaveInstanceState");
        } else if (this.M == null) {
            this.M = new ArrayList();
            this.N = new ArrayList();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static abstract class a {
        public void a(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void b(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void c(FragmentManager fragmentManager, Fragment fragment, View view) {
        }
    }
}
