package k9;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.r1;
import androidx.fragment.app.y;
import androidx.lifecycle.Lifecycle;
import com.braze.h2;
import g9.i0;
import g9.l;
import g9.o;
import g9.s0;
import g9.t0;
import g9.z;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import r8.k;
import y80.a2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@s0("dialog")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lk9/d;", "Lg9/t0;", "Lk9/b;", "navigation-fragment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d extends t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f26180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FragmentManager f26181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f26182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ea.b f26183f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f26184g;

    public d(Context context, FragmentManager fragmentManager) {
        context.getClass();
        fragmentManager.getClass();
        this.f26180c = context;
        this.f26181d = fragmentManager;
        this.f26182e = new LinkedHashSet();
        this.f26183f = new ea.b(this, 4);
        this.f26184g = new LinkedHashMap();
    }

    @Override // g9.t0
    public final z a() {
        return new b(this);
    }

    @Override // g9.t0
    public final void d(List list, i0 i0Var) {
        list.getClass();
        FragmentManager fragmentManager = this.f26181d;
        if (fragmentManager.P()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            k(lVar).show(fragmentManager, lVar.f20167f);
            l lVar2 = (l) CollectionsKt.X((List) b().f20180e.f45488a.getValue());
            boolean zI = CollectionsKt.I((Iterable) b().f20181f.f45488a.getValue(), lVar2);
            b().i(lVar);
            if (lVar2 != null && !zI) {
                b().c(lVar2);
            }
        }
    }

    @Override // g9.t0
    public final void e(o oVar) {
        Lifecycle lifecycle;
        this.f20218a = oVar;
        this.f20219b = true;
        Iterator it = ((List) oVar.f20180e.f45488a.getValue()).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            FragmentManager fragmentManager = this.f26181d;
            if (!zHasNext) {
                fragmentManager.f3122q.add(new r1() { // from class: k9.a
                    @Override // androidx.fragment.app.r1
                    public final void a(FragmentManager fragmentManager2, Fragment fragment) {
                        fragmentManager2.getClass();
                        d dVar = this.f26178a;
                        LinkedHashSet linkedHashSet = dVar.f26182e;
                        if (TypeIntrinsics.asMutableCollection(linkedHashSet).remove(fragment.getTag())) {
                            fragment.getLifecycle().a(dVar.f26183f);
                        }
                        LinkedHashMap linkedHashMap = dVar.f26184g;
                        TypeIntrinsics.asMutableMap(linkedHashMap).remove(fragment.getTag());
                    }
                });
                return;
            }
            l lVar = (l) it.next();
            y yVar = (y) fragmentManager.findFragmentByTag(lVar.f20167f);
            if (yVar == null || (lifecycle = yVar.getLifecycle()) == null) {
                this.f26182e.add(lVar.f20167f);
            } else {
                lifecycle.a(this.f26183f);
            }
        }
    }

    @Override // g9.t0
    public final void f(l lVar) {
        FragmentManager fragmentManager = this.f26181d;
        if (fragmentManager.P()) {
            Log.i("DialogFragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        String str = lVar.f20167f;
        y yVar = (y) this.f26184g.get(str);
        if (yVar == null) {
            Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag(str);
            yVar = fragmentFindFragmentByTag instanceof y ? (y) fragmentFindFragmentByTag : null;
        }
        if (yVar != null) {
            yVar.getLifecycle().d(this.f26183f);
            yVar.dismiss();
        }
        k(lVar).show(fragmentManager, str);
        o oVarB = b();
        List list = (List) oVarB.f20180e.f45488a.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            l lVar2 = (l) listIterator.previous();
            if (Intrinsics.areEqual(lVar2.f20167f, str)) {
                a2 a2Var = oVarB.f20178c;
                a2Var.k(null, i1.i(i1.i((Set) a2Var.getValue(), lVar2), lVar));
                oVarB.d(lVar);
                return;
            }
        }
        qc.y.h("List contains no element matching the predicate.");
    }

    @Override // g9.t0
    public final void i(l lVar, boolean z11) {
        FragmentManager fragmentManager = this.f26181d;
        if (fragmentManager.P()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) b().f20180e.f45488a.getValue();
        int iIndexOf = list.indexOf(lVar);
        Iterator it = CollectionsKt.f0(list.subList(iIndexOf, list.size())).iterator();
        while (it.hasNext()) {
            Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag(((l) it.next()).f20167f);
            if (fragmentFindFragmentByTag != null) {
                ((y) fragmentFindFragmentByTag).dismiss();
            }
        }
        l(iIndexOf, lVar, z11);
    }

    public final y k(l lVar) {
        z zVar = lVar.f20163b;
        zVar.getClass();
        b bVar = (b) zVar;
        String str = bVar.f26179g;
        if (str == null) {
            h2.b("DialogFragment class was not set");
            return null;
        }
        char cCharAt = str.charAt(0);
        Context context = this.f26180c;
        if (cCharAt == '.') {
            str = context.getPackageName() + str;
        }
        Fragment fragmentA = this.f26181d.I().a(context.getClassLoader(), str);
        fragmentA.getClass();
        if (y.class.isAssignableFrom(fragmentA.getClass())) {
            y yVar = (y) fragmentA;
            yVar.setArguments(lVar.f20169h.a());
            yVar.getLifecycle().a(this.f26183f);
            this.f26184g.put(lVar.f20167f, yVar);
            return yVar;
        }
        StringBuilder sb2 = new StringBuilder("Dialog destination ");
        String str2 = bVar.f26179g;
        if (str2 != null) {
            i4.a.i(k.p(sb2, str2, " is not an instance of DialogFragment"));
            return null;
        }
        h2.b("DialogFragment class was not set");
        return null;
    }

    public final void l(int i11, l lVar, boolean z11) {
        l lVar2 = (l) CollectionsKt.Q(i11 - 1, (List) b().f20180e.f45488a.getValue());
        boolean zI = CollectionsKt.I((Iterable) b().f20181f.f45488a.getValue(), lVar2);
        b().f(lVar, z11);
        if (lVar2 == null || zI) {
            return;
        }
        b().c(lVar2);
    }
}
