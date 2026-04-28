package k9;

import a3.y0;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k1;
import androidx.fragment.app.m1;
import androidx.fragment.app.r1;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.l1;
import androidx.lifecycle.s;
import com.braze.Constants;
import com.braze.h2;
import com.google.firebase.messaging.a0;
import g9.l;
import g9.o;
import g9.s0;
import g9.t0;
import g9.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import jb.u;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import o80.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@s0("fragment")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lk9/g;", "Lg9/t0;", "Lk9/h;", Constants.BRAZE_PUSH_CONTENT_KEY, "navigation-fragment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFragmentNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator\n+ 2 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,712:1\n32#2:713\n69#2,2:714\n774#3:716\n865#3,2:717\n1863#3,2:719\n528#3,7:721\n543#3,6:728\n1755#3,3:734\n1863#3,2:737\n*S KotlinDebug\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator\n*L\n268#1:713\n268#1:714,2\n314#1:716\n314#1:717,2\n322#1:719,2\n99#1:721,7\n148#1:728,6\n247#1:734,3\n273#1:737,2\n*E\n"})
public class g extends t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f26188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FragmentManager f26189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f26190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f26191f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f26192g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s f26193h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final jd.a f26194i;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class a extends l1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference f26195a;

        @Override // androidx.lifecycle.l1
        public final void onCleared() {
            super.onCleared();
            WeakReference weakReference = this.f26195a;
            if (weakReference == null) {
                Intrinsics.throwUninitializedPropertyAccessException("completeTransition");
                weakReference = null;
            }
            Function0 function0 = (Function0) weakReference.get();
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public g(Context context, FragmentManager fragmentManager, int i11) {
        context.getClass();
        fragmentManager.getClass();
        this.f26188c = context;
        this.f26189d = fragmentManager;
        this.f26190e = i11;
        this.f26191f = new LinkedHashSet();
        this.f26192g = new ArrayList();
        this.f26193h = new s(this, 5);
        this.f26194i = new jd.a(this, 8);
    }

    public static void k(g gVar, String str, int i11) {
        boolean z11 = (i11 & 2) == 0;
        boolean z12 = (i11 & 4) != 0;
        ArrayList arrayList = gVar.f26192g;
        if (z12) {
            i0.v(arrayList, new gt.e(str, 12));
        }
        arrayList.add(new Pair(str, Boolean.valueOf(z11)));
    }

    public static boolean n() {
        return Log.isLoggable("FragmentManager", 2) || Log.isLoggable("FragmentNavigator", 2);
    }

    @Override // g9.t0
    public final z a() {
        return new h(this);
    }

    @Override // g9.t0
    public final void d(List list, g9.i0 i0Var) {
        list.getClass();
        FragmentManager fragmentManager = this.f26189d;
        if (fragmentManager.P()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            boolean zIsEmpty = ((List) b().f20180e.f45488a.getValue()).isEmpty();
            if (i0Var == null || zIsEmpty || !i0Var.f20139b || !this.f26191f.remove(lVar.f20167f)) {
                androidx.fragment.app.a aVarM = m(lVar, i0Var);
                String str = lVar.f20167f;
                if (!zIsEmpty) {
                    l lVar2 = (l) CollectionsKt.X((List) b().f20180e.f45488a.getValue());
                    if (lVar2 != null) {
                        k(this, lVar2.f20167f, 6);
                    }
                    k(this, str, 6);
                    aVarM.c(str);
                }
                aVarM.d();
                if (n()) {
                    Log.v("FragmentNavigator", "Calling pushWithTransition via navigate() on entry " + lVar);
                }
                b().i(lVar);
            } else {
                fragmentManager.y(new m1(fragmentManager, lVar.f20167f, 0), false);
                b().i(lVar);
            }
        }
    }

    @Override // g9.t0
    public final void e(final o oVar) {
        this.f20218a = oVar;
        this.f20219b = true;
        if (n()) {
            Log.v("FragmentNavigator", "onAttach");
        }
        r1 r1Var = new r1() { // from class: k9.e
            @Override // androidx.fragment.app.r1
            public final void a(FragmentManager fragmentManager, Fragment fragment) {
                Object objPrevious;
                fragmentManager.getClass();
                o oVar2 = oVar;
                List list = (List) oVar2.f20180e.f45488a.getValue();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    } else {
                        objPrevious = listIterator.previous();
                        if (Intrinsics.areEqual(((l) objPrevious).f20167f, fragment.getTag())) {
                            break;
                        }
                    }
                }
                l lVar = (l) objPrevious;
                boolean zN = g.n();
                g gVar = this;
                if (zN) {
                    Log.v("FragmentNavigator", "Attaching fragment " + fragment + " associated with entry " + lVar + " to FragmentManager " + gVar.f26189d);
                }
                if (lVar != null) {
                    fragment.getViewLifecycleOwnerLiveData().e(fragment, new al.c(new y0(gVar, fragment, lVar, 27), 9));
                    fragment.getLifecycle().a(gVar.f26193h);
                    gVar.l(fragment, lVar, oVar2);
                }
            }
        };
        FragmentManager fragmentManager = this.f26189d;
        fragmentManager.f3122q.add(r1Var);
        fragmentManager.f3120o.add(new i(oVar, this));
    }

    @Override // g9.t0
    public final void f(l lVar) {
        String str = lVar.f20167f;
        FragmentManager fragmentManager = this.f26189d;
        if (fragmentManager.P()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        androidx.fragment.app.a aVarM = m(lVar, null);
        List list = (List) b().f20180e.f45488a.getValue();
        if (list.size() > 1) {
            l lVar2 = (l) CollectionsKt.Q(list.size() - 2, list);
            if (lVar2 != null) {
                k(this, lVar2.f20167f, 6);
            }
            k(this, str, 4);
            fragmentManager.y(new k1(fragmentManager, str, -1), false);
            k(this, str, 2);
            aVarM.c(str);
        }
        aVarM.d();
        b().d(lVar);
    }

    @Override // g9.t0
    public final void g(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            LinkedHashSet linkedHashSet = this.f26191f;
            linkedHashSet.clear();
            i0.s(stringArrayList, linkedHashSet);
        }
    }

    @Override // g9.t0
    public final Bundle h() {
        LinkedHashSet linkedHashSet = this.f26191f;
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return u.x(new Pair("androidx-nav-fragment:navigator:savedIds", new ArrayList(linkedHashSet)));
    }

    @Override // g9.t0
    public final void i(l lVar, boolean z11) {
        int i11;
        FragmentManager fragmentManager = this.f26189d;
        if (fragmentManager.P()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) b().f20180e.f45488a.getValue();
        int iIndexOf = list.indexOf(lVar);
        List listSubList = list.subList(iIndexOf, list.size());
        l lVar2 = (l) CollectionsKt.O(list);
        l lVar3 = (l) CollectionsKt.Q(iIndexOf - 1, list);
        if (lVar3 != null) {
            k(this, lVar3.f20167f, 6);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSubList) {
            l lVar4 = (l) obj;
            o80.s sVarM = r.m(CollectionsKt.F(this.f26192g), new im.a(29));
            String str = lVar4.f20167f;
            Iterator it = sVarM.f32132a.iterator();
            int i12 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                }
                Object objInvoke = sVarM.f32133b.invoke(it.next());
                if (i12 < 0) {
                    d0.n();
                    throw null;
                }
                if (Intrinsics.areEqual(str, objInvoke)) {
                    i11 = i12;
                    break;
                }
                i12++;
            }
            if ((i11 >= 0) || !Intrinsics.areEqual(lVar4.f20167f, lVar2.f20167f)) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            k(this, ((l) it2.next()).f20167f, 4);
        }
        if (z11) {
            for (l lVar5 : CollectionsKt.f0(listSubList)) {
                if (Intrinsics.areEqual(lVar5, lVar2)) {
                    Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination " + lVar5);
                } else {
                    fragmentManager.y(new m1(fragmentManager, lVar5.f20167f, 1), false);
                    this.f26191f.add(lVar5.f20167f);
                }
            }
        } else {
            fragmentManager.y(new k1(fragmentManager, lVar.f20167f, -1), false);
        }
        if (n()) {
            Log.v("FragmentNavigator", "Calling popWithTransition via popBackStack() on entry " + lVar + " with savedState " + z11);
        }
        b().f(lVar, z11);
    }

    public final void l(Fragment fragment, l lVar, o oVar) {
        fragment.getClass();
        ViewModelStore viewModelStore = fragment.getViewModelStore();
        viewModelStore.getClass();
        y8.c cVar = new y8.c(0);
        cVar.a(Reflection.getOrCreateKotlinClass(a.class), new f(0));
        o70.d dVarB = cVar.b();
        y8.a aVar = y8.a.f45423b;
        aVar.getClass();
        a0 a0Var = new a0(viewModelStore, dVarB, aVar);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(a.class);
        orCreateKotlinClass.getClass();
        String qualifiedName = orCreateKotlinClass.getQualifiedName();
        if (qualifiedName == null) {
            i4.a.f("Local and anonymous classes can not be ViewModels");
            return;
        }
        a aVar2 = (a) a0Var.M("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), orCreateKotlinClass);
        WeakReference weakReference = new WeakReference(new i2.e(lVar, oVar, this, fragment));
        aVar2.getClass();
        aVar2.f26195a = weakReference;
    }

    public final androidx.fragment.app.a m(l lVar, g9.i0 i0Var) {
        z zVar = lVar.f20163b;
        zVar.getClass();
        Bundle bundleA = lVar.f20169h.a();
        String str = ((h) zVar).f26196g;
        if (str == null) {
            h2.b("Fragment class was not set");
            return null;
        }
        char cCharAt = str.charAt(0);
        Context context = this.f26188c;
        if (cCharAt == '.') {
            str = context.getPackageName() + str;
        }
        FragmentManager fragmentManager = this.f26189d;
        Fragment fragmentA = fragmentManager.I().a(context.getClassLoader(), str);
        fragmentA.getClass();
        fragmentA.setArguments(bundleA);
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
        int i11 = i0Var != null ? i0Var.f20143f : -1;
        int i12 = i0Var != null ? i0Var.f20144g : -1;
        int i13 = i0Var != null ? i0Var.f20145h : -1;
        int i14 = i0Var != null ? i0Var.f20146i : -1;
        if (i11 != -1 || i12 != -1 || i13 != -1 || i14 != -1) {
            if (i11 == -1) {
                i11 = 0;
            }
            if (i12 == -1) {
                i12 = 0;
            }
            if (i13 == -1) {
                i13 = 0;
            }
            int i15 = i14 != -1 ? i14 : 0;
            aVar.f3396b = i11;
            aVar.f3397c = i12;
            aVar.f3398d = i13;
            aVar.f3399e = i15;
        }
        aVar.f(this.f26190e, fragmentA, lVar.f20167f);
        aVar.n(fragmentA);
        aVar.f3409p = true;
        return aVar;
    }
}
