package k9;

import android.util.Log;
import androidx.fragment.app.Fragment;
import g9.l;
import g9.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f26197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f26198b;

    public i(o oVar, g gVar) {
        this.f26197a = oVar;
        this.f26198b = gVar;
    }

    public final void a(Fragment fragment, boolean z11) {
        Object obj;
        Object objPrevious;
        g gVar = this.f26198b;
        ArrayList arrayList = gVar.f26192g;
        fragment.getClass();
        o oVar = this.f26197a;
        ArrayList arrayListD0 = CollectionsKt.d0((Iterable) oVar.f20181f.f45488a.getValue(), (Collection) oVar.f20180e.f45488a.getValue());
        ListIterator listIterator = arrayListD0.listIterator(arrayListD0.size());
        while (true) {
            obj = null;
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
        boolean z12 = z11 && arrayList.isEmpty() && fragment.isRemoving();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(((Pair) next).f26485a, fragment.getTag())) {
                obj = next;
                break;
            }
        }
        Pair pair = (Pair) obj;
        if (pair != null) {
            arrayList.remove(pair);
        }
        if (!z12 && g.n()) {
            Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + fragment + " associated with entry " + lVar);
        }
        boolean z13 = pair != null && ((Boolean) pair.f26486b).booleanValue();
        if (!z11 && !z13 && lVar == null) {
            i4.a.i(a0.m("The fragment ", fragment, " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager."));
            return;
        }
        if (lVar != null) {
            gVar.l(fragment, lVar, oVar);
            if (z12) {
                if (g.n()) {
                    Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + fragment + " popping associated entry " + lVar + " via system back");
                }
                oVar.f(lVar, false);
            }
        }
    }

    public final void b(Fragment fragment, boolean z11) {
        Object objPrevious;
        fragment.getClass();
        if (z11) {
            o oVar = this.f26197a;
            List list = (List) oVar.f20180e.f45488a.getValue();
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
            if (g.n()) {
                Log.v("FragmentNavigator", "OnBackStackChangedStarted for fragment " + fragment + " associated with entry " + lVar);
            }
            if (lVar != null) {
                oVar.g(lVar);
            }
        }
    }
}
