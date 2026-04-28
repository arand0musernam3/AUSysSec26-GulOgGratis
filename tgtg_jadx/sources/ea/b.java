package ea;

import a40.d0;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.y;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.c0;
import androidx.lifecycle.g1;
import androidx.lifecycle.l1;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import androidx.lifecycle.s1;
import androidx.lifecycle.w;
import androidx.savedstate.SavedStateRegistry;
import com.braze.h2;
import g9.l;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p70.k;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15897b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f15896a = i11;
        this.f15897b = obj;
    }

    @Override // androidx.lifecycle.c0
    public final void onStateChanged(LifecycleOwner lifecycleOwner, w wVar) {
        int iNextIndex;
        switch (this.f15896a) {
            case 0:
                f fVar = (f) this.f15897b;
                if (wVar != w.ON_CREATE) {
                    i4.a.d("Next event must be ON_CREATE");
                    return;
                }
                lifecycleOwner.getLifecycle().d(this);
                Bundle bundleA = fVar.getSavedStateRegistry().a("androidx.savedstate.Restarter");
                if (bundleA == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleA.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    h2.b("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, b.class.getClassLoader()).asSubclass(c.class);
                        clsAsSubclass.getClass();
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                objNewInstance.getClass();
                                if (!(fVar instanceof s1)) {
                                    org.bouncycastle.jce.provider.a.s(fVar, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
                                    return;
                                }
                                ViewModelStore viewModelStore = ((s1) fVar).getViewModelStore();
                                SavedStateRegistry savedStateRegistry = fVar.getSavedStateRegistry();
                                viewModelStore.getClass();
                                LinkedHashMap linkedHashMap = viewModelStore.f3412a;
                                for (String str2 : new HashSet(linkedHashMap.keySet())) {
                                    str2.getClass();
                                    l1 l1Var = (l1) linkedHashMap.get(str2);
                                    if (l1Var != null) {
                                        r.a(l1Var, savedStateRegistry, fVar.getLifecycle());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    savedStateRegistry.d();
                                }
                            } catch (Exception e5) {
                                d0.o(e0.f.k("Failed to instantiate ", str), e5);
                                return;
                            }
                        } catch (NoSuchMethodException e11) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
                        }
                    } catch (ClassNotFoundException e12) {
                        d0.o(a0.p("Class ", str, " wasn't found"), e12);
                        return;
                    }
                }
                return;
            case 1:
                ComponentActivity componentActivity = (ComponentActivity) this.f15897b;
                ComponentActivity.access$ensureViewModelStore(componentActivity);
                componentActivity.getLifecycle().d(this);
                return;
            case 2:
                new HashMap();
                o[] oVarArr = (o[]) this.f15897b;
                if (oVarArr.length > 0) {
                    o oVar = oVarArr[0];
                    throw null;
                }
                if (oVarArr.length <= 0) {
                    return;
                }
                o oVar2 = oVarArr[0];
                throw null;
            case 3:
                if (wVar != w.ON_CREATE) {
                    org.bouncycastle.jce.provider.a.s(wVar, "Next event must be ON_CREATE, it was ");
                    return;
                } else {
                    lifecycleOwner.getLifecycle().d(this);
                    ((g1) this.f15897b).b();
                    return;
                }
            case 4:
                k9.d dVar = (k9.d) this.f15897b;
                int i11 = k9.c.$EnumSwitchMapping$0[wVar.ordinal()];
                if (i11 == 1) {
                    y yVar = (y) lifecycleOwner;
                    Iterable iterable = (Iterable) dVar.b().f20180e.f45488a.getValue();
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            if (Intrinsics.areEqual(((l) it.next()).f20167f, yVar.getTag())) {
                                return;
                            }
                        }
                    }
                    yVar.dismiss();
                    return;
                }
                Object obj = null;
                if (i11 == 2) {
                    y yVar2 = (y) lifecycleOwner;
                    for (Object obj2 : (Iterable) dVar.b().f20181f.f45488a.getValue()) {
                        if (Intrinsics.areEqual(((l) obj2).f20167f, yVar2.getTag())) {
                            obj = obj2;
                        }
                    }
                    l lVar = (l) obj;
                    if (lVar != null) {
                        dVar.b().c(lVar);
                        return;
                    }
                    return;
                }
                if (i11 != 3) {
                    if (i11 != 4) {
                        return;
                    }
                    y yVar3 = (y) lifecycleOwner;
                    for (Object obj3 : (Iterable) dVar.b().f20181f.f45488a.getValue()) {
                        if (Intrinsics.areEqual(((l) obj3).f20167f, yVar3.getTag())) {
                            obj = obj3;
                        }
                    }
                    l lVar2 = (l) obj;
                    if (lVar2 != null) {
                        dVar.b().c(lVar2);
                    }
                    yVar3.getLifecycle().d(this);
                    return;
                }
                y yVar4 = (y) lifecycleOwner;
                if (yVar4.requireDialog().isShowing()) {
                    return;
                }
                List list = (List) dVar.b().f20180e.f45488a.getValue();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                    } else if (Intrinsics.areEqual(((l) listIterator.previous()).f20167f, yVar4.getTag())) {
                        iNextIndex = listIterator.nextIndex();
                    }
                }
                l lVar3 = (l) CollectionsKt.Q(iNextIndex, list);
                if (!Intrinsics.areEqual(CollectionsKt.X(list), lVar3)) {
                    Log.i("DialogFragmentNavigator", "Dialog " + yVar4 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
                }
                if (lVar3 != null) {
                    dVar.l(iNextIndex, lVar3, false);
                    return;
                }
                return;
            case 5:
                if (wVar == w.ON_DESTROY) {
                    k kVar = (k) this.f15897b;
                    kVar.f34552a = null;
                    kVar.f34553b = null;
                    return;
                }
                return;
            default:
                ((va.c) this.f15897b).b(false);
                return;
        }
    }
}
