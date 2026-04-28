package a0;

import e0.d0;
import e0.p1;
import i0.g0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import s0.x0;
import u70.l;
import u70.t;
import w.e0;
import w.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f74a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f75b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f76c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f77d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f78e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f79f;

    public j(f fVar, o oVar, e0 e0Var, f fVar2) {
        this.f74a = fVar;
        this.f75b = oVar;
        this.f76c = e0Var;
        this.f77d = fVar2;
        final int i11 = 0;
        this.f78e = l.b(new Function0(this) { // from class: a0.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f73b;

            {
                this.f73b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return (i0.b) this.f73b.f74a.get();
                    default:
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        j jVar = this.f73b;
                        Object obj = jVar.f77d.get();
                        obj.getClass();
                        for (Map.Entry entry : ((Map) obj).entrySet()) {
                            d0 d0Var = (d0) entry.getKey();
                            x0 x0Var = (x0) entry.getValue();
                            g0 g0Var = jVar.a().f22580c;
                            g0Var.getClass();
                            d0Var.getClass();
                            e0.e0 e0Var2 = (e0.e0) g0Var.f22653b.get(d0Var);
                            if (e0Var2 != null) {
                                linkedHashMap.put(x0Var, new p1(e0Var2.f15329a));
                            }
                        }
                        return kotlin.collections.x0.k(linkedHashMap);
                }
            }
        });
        final int i12 = 1;
        this.f79f = l.b(new Function0(this) { // from class: a0.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f73b;

            {
                this.f73b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return (i0.b) this.f73b.f74a.get();
                    default:
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        j jVar = this.f73b;
                        Object obj = jVar.f77d.get();
                        obj.getClass();
                        for (Map.Entry entry : ((Map) obj).entrySet()) {
                            d0 d0Var = (d0) entry.getKey();
                            x0 x0Var = (x0) entry.getValue();
                            g0 g0Var = jVar.a().f22580c;
                            g0Var.getClass();
                            d0Var.getClass();
                            e0.e0 e0Var2 = (e0.e0) g0Var.f22653b.get(d0Var);
                            if (e0Var2 != null) {
                                linkedHashMap.put(x0Var, new p1(e0Var2.f15329a));
                            }
                        }
                        return kotlin.collections.x0.k(linkedHashMap);
                }
            }
        });
    }

    public final i0.b a() {
        Object value = this.f78e.getValue();
        value.getClass();
        return (i0.b) value;
    }

    public final LinkedHashSet b(List list) {
        list.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p1 p1Var = (p1) ((Map) this.f79f.getValue()).get((x0) it.next());
            if (p1Var != null) {
                linkedHashSet.add(new p1(p1Var.f15397a));
            }
        }
        return linkedHashSet;
    }
}
