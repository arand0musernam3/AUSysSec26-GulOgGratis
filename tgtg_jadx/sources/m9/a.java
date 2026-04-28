package m9;

import android.os.Bundle;
import g9.l0;
import j4.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends g9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l0 f29728r;

    public a(Class cls) {
        super(true);
        this.f29728r = new l0(cls);
    }

    @Override // g9.q0
    public final Object a(Bundle bundle, String str) {
        bundle.getClass();
        str.getClass();
        Object obj = bundle.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        return null;
    }

    @Override // g9.q0
    public final String b() {
        return s.h(this.f29728r.f20170s, new StringBuilder("List<"), "}>");
    }

    @Override // g9.q0
    public final Object c(Object obj, String str) {
        List list = (List) obj;
        l0 l0Var = this.f29728r;
        return list != null ? CollectionsKt.d0(c0.c(l0Var.d(str)), list) : c0.c(l0Var.d(str));
    }

    @Override // g9.q0
    public final Object d(String str) {
        str.getClass();
        return c0.c(this.f29728r.d(str));
    }

    @Override // g9.q0
    public final void e(Bundle bundle, String str, Object obj) {
        List list = (List) obj;
        str.getClass();
        bundle.putSerializable(str, list != null ? new ArrayList(list) : null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return Intrinsics.areEqual(this.f29728r, ((a) obj).f29728r);
    }

    @Override // g9.q0
    public final boolean g(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        return Intrinsics.areEqual(list != null ? new ArrayList(list) : null, list2 != null ? new ArrayList(list2) : null);
    }

    @Override // g9.e
    public final Object h() {
        return n0.f26529a;
    }

    public final int hashCode() {
        return this.f29728r.f20194r.hashCode();
    }

    @Override // g9.e
    public final List i(Object obj) {
        List list = (List) obj;
        if (list == null) {
            return n0.f26529a;
        }
        ArrayList arrayList = new ArrayList(e0.o(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Enum) it.next()).toString());
        }
        return arrayList;
    }
}
