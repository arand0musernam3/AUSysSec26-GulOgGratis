package ij;

import com.app.tgtg.model.remote.mapService.response.FilterChipId;
import com.app.tgtg.model.remote.mapService.response.FilterChipOption;
import com.app.tgtg.model.remote.mapService.response.SortingOption;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.collections.p0;
import y80.a2;
import y80.h1;
import y80.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2 f24028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h1 f24029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a2 f24030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h1 f24031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a2 f24032e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h1 f24033f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a2 f24034g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h1 f24035h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a2 f24036i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h1 f24037j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a2 f24038k;
    public final h1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a2 f24039m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h1 f24040n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a2 f24041o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h1 f24042p;

    public b() {
        a2 a2VarC = r.c(n0.f26529a);
        this.f24028a = a2VarC;
        this.f24029b = new h1(a2VarC);
        p0 p0Var = p0.f26531a;
        a2 a2VarC2 = r.c(p0Var);
        this.f24030c = a2VarC2;
        this.f24031d = new h1(a2VarC2);
        a2 a2VarC3 = r.c(p0Var);
        this.f24032e = a2VarC3;
        this.f24033f = new h1(a2VarC3);
        a2 a2VarC4 = r.c(null);
        this.f24034g = a2VarC4;
        this.f24035h = new h1(a2VarC4);
        a2 a2VarC5 = r.c(null);
        this.f24036i = a2VarC5;
        this.f24037j = new h1(a2VarC5);
        a2 a2VarC6 = r.c(null);
        this.f24038k = a2VarC6;
        this.l = new h1(a2VarC6);
        a2 a2VarC7 = r.c(null);
        this.f24039m = a2VarC7;
        this.f24040n = new h1(a2VarC7);
        a2 a2VarC8 = r.c(Boolean.FALSE);
        this.f24041o = a2VarC8;
        this.f24042p = new h1(a2VarC8);
    }

    public static Calendar a(int i11, int i12) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(14, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(11, i12);
        calendar.add(5, i11);
        return calendar;
    }

    public final void b() {
        this.f24028a.j(n0.f26529a);
        p0 p0Var = p0.f26531a;
        this.f24030c.j(p0Var);
        this.f24032e.j(p0Var);
        this.f24038k.j(null);
        this.f24039m.j(null);
        Boolean bool = Boolean.FALSE;
        a2 a2Var = this.f24041o;
        a2Var.getClass();
        a2Var.k(null, bool);
    }

    public final boolean c() {
        Iterable iterable = (Iterable) this.f24028a.getValue();
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (((FilterChipOption) it.next()).getId() == FilterChipId.COLLECT_NOW) {
                return true;
            }
        }
        return false;
    }

    public final void d(FilterChipOption filterChipOption) {
        filterChipOption.getClass();
        a2 a2Var = this.f24028a;
        a2Var.k(null, CollectionsKt.Z((Iterable) a2Var.getValue(), filterChipOption));
    }

    public final void e(List list) {
        Object next;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((SortingOption) next).isDefault()) {
                    break;
                }
            }
        }
        SortingOption sortingOption = (SortingOption) next;
        this.f24036i.j(sortingOption != null ? sortingOption.getId() : null);
    }
}
