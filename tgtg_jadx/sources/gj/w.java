package gj;

import com.app.tgtg.model.remote.mapService.response.FilterChipId;
import com.app.tgtg.model.remote.mapService.response.FilterChipOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.p0;
import kotlin.jvm.internal.Intrinsics;
import y80.a2;
import y80.g1;
import y80.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ij.b f20521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t f20522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m1 f20523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m1 f20524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g1 f20525e;

    public w(ij.b bVar) {
        bVar.getClass();
        this.f20521a = bVar;
        x80.a aVar = x80.a.DROP_OLDEST;
        this.f20523c = y80.r.a(0, 2, aVar);
        m1 m1VarA = y80.r.a(0, 2, aVar);
        this.f20524d = m1VarA;
        this.f20525e = new g1(m1VarA);
    }

    public static ArrayList c(List list, FilterChipId filterChipId) {
        List listC = kotlin.collections.c0.c(filterChipId);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((FilterChipId) obj) != filterChipId) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.d0(arrayList, listC);
    }

    public static ArrayList g(List list, FilterChipId filterChipId) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((FilterChipId) obj) != filterChipId) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final c0 a(c0 c0Var, d dVar) {
        int i11 = u.$EnumSwitchMapping$0[dVar.f20495a.ordinal()];
        Object obj = null;
        ij.b bVar = this.f20521a;
        if (i11 == 1) {
            Set set = c0Var.f20483d;
            bVar.getClass();
            set.getClass();
            a2 a2Var = bVar.f24030c;
            a2Var.getClass();
            a2Var.k(null, set);
            Set set2 = c0Var.f20483d;
            boolean zIsEmpty = set2.isEmpty();
            List list = c0Var.f20494p;
            return c0.a(c0Var, null, false, set2, null, null, null, null, null, null, false, null, 0, 0, null, false, !zIsEmpty ? c(list, FilterChipId.CATEGORY) : g(list, FilterChipId.CATEGORY), 32763);
        }
        if (i11 == 2) {
            Set set3 = c0Var.f20485f;
            bVar.getClass();
            set3.getClass();
            a2 a2Var2 = bVar.f24032e;
            a2Var2.getClass();
            a2Var2.k(null, set3);
            Set set4 = c0Var.f20485f;
            boolean zIsEmpty2 = set4.isEmpty();
            List list2 = c0Var.f20494p;
            return c0.a(c0Var, null, false, null, null, set4, null, null, null, null, false, null, 0, 0, null, false, !zIsEmpty2 ? c(list2, FilterChipId.DIET) : g(list2, FilterChipId.DIET), 32751);
        }
        if (i11 == 3) {
            String str = c0Var.f20487h;
            String str2 = (str == null || Intrinsics.areEqual(str, c0Var.f20488i)) ? null : str;
            bVar.f24034g.j(str2);
            List list3 = c0Var.f20494p;
            return c0.a(c0Var, null, false, null, null, null, null, str2, null, null, false, null, 0, 0, null, false, str2 != null ? c(list3, FilterChipId.SORT) : g(list3, FilterChipId.SORT), 32703);
        }
        if (i11 != 4) {
            if (i11 != 5) {
                return c0Var;
            }
            boolean z11 = c0Var.f20481b;
            a2 a2Var3 = bVar.f24041o;
            Boolean boolValueOf = Boolean.valueOf(z11);
            a2Var3.getClass();
            a2Var3.k(null, boolValueOf);
            return c0Var;
        }
        int i12 = c0Var.l;
        List list4 = c0Var.f20480a;
        List list5 = c0Var.f20494p;
        int i13 = c0Var.f20491m;
        a aVar = c0Var.f20492n;
        if (i12 == 0 && i13 == 0 && aVar == null) {
            bVar.f24038k.j(null);
            bVar.f24039m.j(null);
            return c0.a(c0Var, null, false, null, null, null, null, null, null, null, false, null, 0, 0, null, false, g(list5, FilterChipId.COLLECTION_TIME), 31743);
        }
        a2 a2Var4 = bVar.f24038k;
        Pair pair = new Pair(Integer.valueOf(i12), Integer.valueOf(i13));
        a2Var4.getClass();
        a2Var4.k(null, pair);
        bVar.f24039m.j(aVar);
        Iterator it = list4.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((FilterChipOption) next).getId() == FilterChipId.COLLECT_NOW) {
                obj = next;
                break;
            }
        }
        FilterChipOption filterChipOption = (FilterChipOption) obj;
        if (filterChipOption != null) {
            bVar.d(filterChipOption);
        }
        Pair pair2 = new Pair(Integer.valueOf(i12), Integer.valueOf(i13));
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list4) {
            if (((FilterChipOption) obj2).getId() != FilterChipId.COLLECT_NOW) {
                arrayList.add(obj2);
            }
        }
        return c0.a(c0Var, arrayList, false, null, null, null, null, null, null, null, false, pair2, 0, 0, null, false, c(g(list5, FilterChipId.COLLECT_NOW), FilterChipId.COLLECTION_TIME), 31742);
    }

    public final c0 b(c0 c0Var, e eVar) {
        switch (u.$EnumSwitchMapping$0[eVar.f20497a.ordinal()]) {
            case 1:
                return c0.a(c0Var, null, false, null, p0.f26531a, null, null, null, null, null, false, null, 0, 0, null, false, null, 65527);
            case 2:
                return c0.a(c0Var, null, false, null, null, null, p0.f26531a, null, null, null, false, null, 0, 0, null, false, null, 65503);
            case 3:
                return c0.a(c0Var, null, false, null, null, null, null, null, c0Var.f20488i, null, false, null, 0, 0, null, false, null, 64895);
            case 4:
                return c0.a(c0Var, null, false, null, null, null, null, null, null, null, false, null, 0, 0, null, false, null, 34815);
            case 5:
                return c0.a(c0Var, null, false, null, null, null, null, null, null, null, false, null, 0, 0, null, false, null, 65533);
            case 6:
                List list = c0Var.f20480a;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((FilterChipOption) obj).getId() == FilterChipId.COLLECT_NOW) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this.f20521a.d((FilterChipOption) it.next());
                }
                List list2 = c0Var.f20480a;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    if (((FilterChipOption) obj2).getId() != FilterChipId.COLLECT_NOW) {
                        arrayList2.add(obj2);
                    }
                }
                return c0.a(c0Var, arrayList2, false, null, null, null, null, null, null, null, false, null, 0, 0, null, false, g(c0Var.f20494p, FilterChipId.COLLECT_NOW), 32766);
            case 7:
                return c0Var;
            default:
                e40.a.f();
                return null;
        }
    }

    public final void d() {
        this.f20524d.i(x.f20526a);
    }

    public final c0 e() {
        ij.b bVar = this.f20521a;
        return new c0((List) bVar.f24029b.f45488a.getValue(), ((Boolean) bVar.f24042p.f45488a.getValue()).booleanValue(), (Set) bVar.f24031d.f45488a.getValue(), (Set) bVar.f24033f.f45488a.getValue(), (String) bVar.f24035h.f45488a.getValue(), (Pair) bVar.l.f45488a.getValue(), 64424);
    }

    public final t f() {
        ij.b bVar = this.f20521a;
        Set set = (Set) bVar.f24031d.f45488a.getValue();
        Set set2 = (Set) bVar.f24033f.f45488a.getValue();
        String str = (String) bVar.f24035h.f45488a.getValue();
        if (str == null && (str = (String) bVar.f24037j.f45488a.getValue()) == null) {
            str = "RELEVANCE";
        }
        return new t(set, set2, str, ((Boolean) bVar.f24042p.f45488a.getValue()).booleanValue(), bVar.c(), (Pair) bVar.l.f45488a.getValue(), (a) bVar.f24040n.f45488a.getValue());
    }
}
