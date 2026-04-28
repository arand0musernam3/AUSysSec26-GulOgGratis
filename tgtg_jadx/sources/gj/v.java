package gj;

import com.app.tgtg.model.remote.mapService.response.FilterChipId;
import com.app.tgtg.model.remote.mapService.response.FilterChipOption;
import com.app.tgtg.model.remote.mapService.response.SortingOption;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i1;
import kotlin.jvm.internal.Intrinsics;
import y80.a2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class v extends z70.i implements i80.n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ c0 f20519j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ s f20520k;
    public final /* synthetic */ w l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, x70.c cVar) {
        super(3, cVar);
        this.l = wVar;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        v vVar = new v(this.l, (x70.c) obj3);
        vVar.f20519j = (c0) obj;
        vVar.f20520k = (s) obj2;
        return vVar.invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        Pair pair;
        Pair pair2;
        Object next;
        c0 c0VarA = this.f20519j;
        s sVar = this.f20520k;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        boolean z11 = sVar instanceof o;
        w wVar = this.l;
        if (z11) {
            o oVar = (o) sVar;
            ij.b bVar = wVar.f20521a;
            int i11 = u.$EnumSwitchMapping$0[oVar.f20507a.getId().ordinal()];
            if (i11 == 1) {
                return c0.a(c0VarA, null, false, null, (Set) bVar.f24031d.f45488a.getValue(), null, null, null, null, null, false, null, 0, 0, null, false, null, 65527);
            }
            if (i11 == 2) {
                return c0.a(c0VarA, null, false, null, null, null, (Set) bVar.f24033f.f45488a.getValue(), null, null, null, false, null, 0, 0, null, false, null, 65503);
            }
            if (i11 == 3) {
                Iterator it = oVar.f20508b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((SortingOption) next).isDefault()) {
                        break;
                    }
                }
                SortingOption sortingOption = (SortingOption) next;
                String id2 = sortingOption != null ? sortingOption.getId() : null;
                String str = (String) bVar.f24035h.f45488a.getValue();
                return c0.a(c0VarA, null, false, null, null, null, null, null, str == null ? id2 : str, id2, str != null, null, 0, 0, null, false, null, 64639);
            }
            if (i11 == 4) {
                Pair pair3 = (Pair) bVar.l.f45488a.getValue();
                a aVar2 = (a) bVar.f24040n.f45488a.getValue();
                return c0.a(c0VarA, null, false, null, null, null, null, null, null, null, false, null, pair3 != null ? ((Number) pair3.f26485a).intValue() : 0, pair3 != null ? ((Number) pair3.f26486b).intValue() : 0, aVar2, (pair3 == null && aVar2 == null) ? false : true, null, 34815);
            }
            if (i11 == 5) {
                return c0.a(c0VarA, null, ((Boolean) bVar.f24042p.f45488a.getValue()).booleanValue(), null, null, null, null, null, null, null, false, null, 0, 0, null, false, null, 65533);
            }
        } else {
            if (sVar instanceof c) {
                wVar.getClass();
                String id3 = ((c) sVar).f20479a.getId();
                boolean zContains = c0VarA.f20483d.contains(id3);
                Set set = c0VarA.f20483d;
                return c0.a(c0VarA, null, false, null, zContains ? i1.f(set, id3) : i1.i(set, id3), null, null, null, null, null, false, null, 0, 0, null, false, null, 65527);
            }
            if (sVar instanceof j) {
                wVar.getClass();
                String id4 = ((j) sVar).f20502a.getId();
                boolean zContains2 = c0VarA.f20485f.contains(id4);
                Set set2 = c0VarA.f20485f;
                return c0.a(c0VarA, null, false, null, null, null, zContains2 ? i1.f(set2, id4) : i1.i(set2, id4), null, null, null, false, null, 0, 0, null, false, null, 65503);
            }
            if (sVar instanceof r) {
                wVar.getClass();
                String id5 = ((r) sVar).f20511a.getId();
                return c0.a(c0VarA, null, false, null, null, null, null, null, id5, null, (c0VarA.f20486g == null && Intrinsics.areEqual(id5, c0VarA.f20488i)) ? false : true, null, 0, 0, null, false, null, 64895);
            }
            if (sVar instanceof i) {
                int i12 = ((i) sVar).f20501a;
                wVar.getClass();
                int i13 = Calendar.getInstance().get(11);
                a aVar3 = c0VarA.f20492n;
                int i14 = aVar3 != null ? u.$EnumSwitchMapping$1[aVar3.ordinal()] : -1;
                if ((i14 == 1 || i14 == 2) && i12 < i13) {
                    i12 = i13;
                }
                int i15 = i12;
                return c0.a(c0VarA, null, false, null, null, null, null, null, null, null, false, null, i15, 0, null, (i15 == 0 && c0VarA.f20491m == 0 && c0VarA.f20492n == null) ? false : true, null, 47103);
            }
            if (sVar instanceof h) {
                int i16 = ((h) sVar).f20500a;
                wVar.getClass();
                int i17 = Calendar.getInstance().get(11);
                a aVar4 = c0VarA.f20492n;
                int i18 = aVar4 == null ? -1 : u.$EnumSwitchMapping$1[aVar4.ordinal()];
                if (i18 == -1) {
                    pair2 = new Pair(Integer.valueOf(i16), null);
                } else if (i18 == 1) {
                    pair2 = new Pair(Integer.valueOf(i16), i16 != c0VarA.f20491m ? null : a.NOW);
                } else if (i18 == 2) {
                    if (i16 > 0) {
                        i16 = 0;
                    }
                    pair2 = new Pair(Integer.valueOf(i16), a.TODAY);
                } else {
                    if (i18 != 3) {
                        e40.a.f();
                        return null;
                    }
                    if (i16 > i17) {
                        i16 = i17;
                    }
                    pair2 = new Pair(Integer.valueOf(i16), a.TOMORROW);
                }
                int iIntValue = ((Number) pair2.f26485a).intValue();
                a aVar5 = (a) pair2.f26486b;
                return c0.a(c0VarA, null, false, null, null, null, null, null, null, null, false, null, 0, iIntValue, aVar5, (c0VarA.l == 0 && iIntValue == 0 && aVar5 == null) ? false : true, null, 36863);
            }
            if (sVar instanceof g) {
                wVar.getClass();
                a aVar6 = ((g) sVar).f20499a;
                a aVar7 = aVar6 != c0VarA.f20492n ? aVar6 : null;
                if (aVar7 == null) {
                    return c0.a(c0VarA, null, false, null, null, null, null, null, null, null, false, null, 0, 0, null, (c0VarA.l == 0 && c0VarA.f20491m == 0) ? false : true, null, 40959);
                }
                int i19 = Calendar.getInstance().get(11);
                int i21 = u.$EnumSwitchMapping$1[aVar7.ordinal()];
                if (i21 == 1) {
                    Integer numValueOf = Integer.valueOf(i19);
                    int i22 = i19 + 3;
                    if (i22 > 23) {
                        i22 = 23;
                    }
                    pair = new Pair(numValueOf, Integer.valueOf(i22));
                } else if (i21 == 2) {
                    pair = new Pair(Integer.valueOf(i19), 0);
                } else {
                    if (i21 != 3) {
                        e40.a.f();
                        return null;
                    }
                    pair = new Pair(0, Integer.valueOf(i19));
                }
                return c0.a(c0VarA, null, false, null, null, null, null, null, null, null, false, null, ((Number) pair.f26485a).intValue(), ((Number) pair.f26486b).intValue(), aVar7, true, null, 34815);
            }
            if (sVar instanceof d) {
                wVar.f20524d.i(new z("Quick_Filter"));
                d dVar = (d) sVar;
                if (dVar.f20496b) {
                    wVar.f20522b = wVar.f();
                }
                return wVar.a(c0VarA, dVar);
            }
            if (sVar instanceof e) {
                wVar.f20524d.i(new a0("Quick_Filter"));
                e eVar = (e) sVar;
                c0 c0VarB = wVar.b(c0VarA, eVar);
                d dVar2 = new d(eVar.f20497a, true);
                wVar.f20522b = wVar.f();
                c0 c0VarA2 = wVar.a(c0VarB, dVar2);
                t tVar = wVar.f20522b;
                wVar.f20522b = null;
                if (tVar != null && !Intrinsics.areEqual(tVar, wVar.f())) {
                    wVar.d();
                }
                return c0VarA2;
            }
            if (sVar instanceof f) {
                wVar.f20524d.i(new z("Quick_Filter"));
                wVar.d();
                FilterChipOption filterChipOption = ((f) sVar).f20498a;
                List list = c0VarA.f20480a;
                List list2 = c0VarA.f20494p;
                boolean zContains3 = list.contains(filterChipOption);
                ij.b bVar2 = wVar.f20521a;
                if (zContains3) {
                    bVar2.d(filterChipOption);
                    return c0.a(c0VarA, CollectionsKt.Z(list, filterChipOption), false, null, null, null, null, null, null, null, false, null, 0, 0, null, false, w.g(list2, FilterChipId.COLLECT_NOW), 32766);
                }
                bVar2.getClass();
                a2 a2Var = bVar2.f24028a;
                if (!((List) a2Var.getValue()).contains(filterChipOption)) {
                    a2Var.k(null, CollectionsKt.e0((Collection) a2Var.getValue(), filterChipOption));
                }
                bVar2.f24038k.j(null);
                bVar2.f24039m.j(null);
                return c0.a(c0VarA, CollectionsKt.e0(list, filterChipOption), false, null, null, null, null, null, null, null, false, null, 0, 0, null, false, w.c(w.g(list2, FilterChipId.COLLECTION_TIME), FilterChipId.COLLECT_NOW), 17406);
            }
            if (sVar instanceof q) {
                wVar.getClass();
                return c0.a(c0VarA, null, !c0VarA.f20481b, null, null, null, null, null, null, null, false, null, 0, 0, null, false, null, 65533);
            }
            if (sVar instanceof p) {
                a2 a2Var2 = wVar.f20521a.f24041o;
                Boolean bool = Boolean.FALSE;
                a2Var2.getClass();
                a2Var2.k(null, bool);
                wVar.d();
                return c0.a(c0VarA, null, false, null, null, null, null, null, null, null, false, null, 0, 0, null, false, null, 65533);
            }
            if (sVar instanceof n) {
                wVar.f20524d.i(new a0("Full_Screen_Filter"));
                wVar.d();
                Iterator<E> it2 = FilterChipId.getEntries().iterator();
                while (it2.hasNext()) {
                    c0VarA = wVar.b(c0VarA, new e((FilterChipId) it2.next()));
                }
                return c0VarA;
            }
            if (sVar instanceof m) {
                wVar.f20524d.i(new z("Full_Screen_Filter"));
                wVar.d();
                t tVarF = wVar.f();
                for (FilterChipId filterChipId : FilterChipId.getEntries()) {
                    if (u.$EnumSwitchMapping$0[filterChipId.ordinal()] != 3 || c0VarA.f20489j || c0VarA.f20486g != null) {
                        c0VarA = wVar.a(c0VarA, new d(filterChipId, false));
                    }
                }
                if (!Intrinsics.areEqual(tVarF, wVar.f())) {
                    wVar.d();
                }
                return c0VarA;
            }
            if (sVar instanceof k) {
                wVar.f20524d.i(y.f20527a);
                return c0VarA;
            }
            if (!(sVar instanceof l)) {
                if (!(sVar instanceof b)) {
                    e40.a.f();
                    return null;
                }
                wVar.f20522b = null;
                wVar.f20521a.b();
                return wVar.e();
            }
            t tVar2 = wVar.f20522b;
            wVar.f20522b = null;
            if (tVar2 != null && !Intrinsics.areEqual(tVar2, wVar.f())) {
                wVar.d();
            }
        }
        return c0VarA;
    }
}
