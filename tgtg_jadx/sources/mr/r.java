package mr;

import androidx.lifecycle.c1;
import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import androidx.lifecycle.o0;
import ao.g3;
import ao.r1;
import com.app.tgtg.model.remote.UserData;
import com.app.tgtg.model.remote.UserSettings;
import com.app.tgtg.model.remote.user.requests.CollectionTime;
import com.app.tgtg.model.remote.user.requests.DietaryPreferences;
import com.app.tgtg.model.remote.user.requests.UserGender;
import h2.a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.jvm.internal.SourceDebugExtension;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmr/r;", "Landroidx/lifecycle/l1;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEditDataViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditDataViewModel.kt\ncom/app/tgtg/feature/tabprofile/manageaccount/accountdetails/edit/EditDataViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,373:1\n1642#2,10:374\n1915#2:384\n1916#2:386\n1652#2:387\n1#3:385\n1#3:388\n*S KotlinDebug\n*F\n+ 1 EditDataViewModel.kt\ncom/app/tgtg/feature/tabprofile/manageaccount/accountdetails/edit/EditDataViewModel\n*L\n142#1:374,10\n142#1:384\n142#1:386\n142#1:387\n142#1:385\n*E\n"})
public final class r extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f30109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g3 f30110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cv.b f30111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ao.c f30112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r1 f30113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final lr.a f30114f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o0 f30115g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o0 f30116h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o0 f30117i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o0 f30118j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o0 f30119k;
    public final o0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o0 f30120m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o0 f30121n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final o0 f30122o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o0 f30123p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o0 f30124q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o0 f30125r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List f30126s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f30127t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f30128u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f30129v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public UserGender f30130w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public DietaryPreferences f30131x;

    public r(c1 c1Var, g3 g3Var, cv.b bVar, ao.c cVar, r1 r1Var, lr.a aVar) {
        c1Var.getClass();
        g3Var.getClass();
        bVar.getClass();
        cVar.getClass();
        r1Var.getClass();
        aVar.getClass();
        this.f30109a = c1Var;
        this.f30110b = g3Var;
        this.f30111c = bVar;
        this.f30112d = cVar;
        this.f30113e = r1Var;
        this.f30114f = aVar;
        o0 o0Var = new o0();
        this.f30115g = o0Var;
        this.f30116h = o0Var;
        o0 o0Var2 = new o0();
        this.f30117i = o0Var2;
        this.f30118j = o0Var2;
        o0 o0Var3 = new o0();
        this.f30119k = o0Var3;
        this.l = o0Var3;
        o0 o0Var4 = new o0();
        this.f30120m = o0Var4;
        this.f30121n = o0Var4;
        o0 o0Var5 = new o0();
        this.f30122o = o0Var5;
        this.f30123p = o0Var5;
        o0 o0Var6 = new o0();
        this.f30124q = o0Var6;
        this.f30125r = o0Var6;
        this.f30127t = "";
        this.f30128u = "";
        this.f30129v = "";
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(mr.r r4, z70.c r5) {
        /*
            boolean r0 = r5 instanceof mr.o
            if (r0 == 0) goto L13
            r0 = r5
            mr.o r0 = (mr.o) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            mr.o r0 = new mr.o
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f30103j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r5)
            u70.q r5 = (u70.q) r5
            java.lang.Object r5 = r5.f40851a
            goto L40
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r4)
            r4 = 0
            return r4
        L32:
            ba0.g.M(r5)
            ao.g3 r5 = r4.f30110b
            r0.l = r3
            java.lang.Object r5 = r5.t(r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            java.lang.Throwable r5 = u70.q.a(r5)
            if (r5 == 0) goto L4b
            androidx.lifecycle.o0 r4 = r4.f30120m
            r4.k(r5)
        L4b:
            kotlin.Unit r4 = kotlin.Unit.f26487a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: mr.r.a(mr.r, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(mr.r r4, com.app.tgtg.model.remote.UserData r5, z70.c r6) {
        /*
            boolean r0 = r6 instanceof mr.p
            if (r0 == 0) goto L13
            r0 = r6
            mr.p r0 = (mr.p) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            mr.p r0 = new mr.p
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f30105j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r6)
            u70.q r6 = (u70.q) r6
            java.lang.Object r5 = r6.f40851a
            goto L40
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r4)
            r4 = 0
            return r4
        L32:
            ba0.g.M(r6)
            ao.g3 r6 = r4.f30110b
            r0.l = r3
            java.lang.Object r5 = r6.F(r5, r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            java.lang.Throwable r5 = u70.q.a(r5)
            if (r5 == 0) goto L4b
            androidx.lifecycle.o0 r4 = r4.f30120m
            r4.k(r5)
        L4b:
            kotlin.Unit r4 = kotlin.Unit.f26487a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: mr.r.b(mr.r, com.app.tgtg.model.remote.UserData, z70.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(mr.r r4, z70.c r5) {
        /*
            boolean r0 = r5 instanceof mr.q
            if (r0 == 0) goto L13
            r0 = r5
            mr.q r0 = (mr.q) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            mr.q r0 = new mr.q
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f30107j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2e
            ba0.g.M(r5)     // Catch: java.lang.Exception -> L2c
            u70.q r5 = (u70.q) r5     // Catch: java.lang.Exception -> L2c
            r5.getClass()     // Catch: java.lang.Exception -> L2c
            goto L48
        L2c:
            r5 = move-exception
            goto L43
        L2e:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r4)
            r4 = 0
            return r4
        L35:
            ba0.g.M(r5)
            ao.g3 r5 = r4.f30110b     // Catch: java.lang.Exception -> L2c
            r0.l = r3     // Catch: java.lang.Exception -> L2c
            java.lang.Object r4 = r5.G(r0)     // Catch: java.lang.Exception -> L2c
            if (r4 != r1) goto L48
            return r1
        L43:
            androidx.lifecycle.o0 r4 = r4.f30120m
            r4.k(r5)
        L48:
            kotlin.Unit r4 = kotlin.Unit.f26487a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: mr.r.c(mr.r, z70.c):java.lang.Object");
    }

    public final List d() {
        List<String> collectionTimes = this.f30110b.m().getCollectionTimes();
        if (collectionTimes == null) {
            return n0.f26529a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionTimes.iterator();
        while (it.hasNext()) {
            CollectionTime collectionTimeFromRawValue = CollectionTime.INSTANCE.fromRawValue((String) it.next());
            if (collectionTimeFromRawValue != null) {
                arrayList.add(collectionTimeFromRawValue);
            }
        }
        return arrayList;
    }

    public final void e(or.f fVar) {
        fVar.getClass();
        f0.B(m1.d(this), null, null, new mn.g(this, fVar, null, 1), 3);
    }

    public final void f(String str, or.b bVar) {
        str.getClass();
        f0.B(m1.d(this), null, null, new a0(this, str, bVar, null, 25), 3);
    }

    public final void g(Runnable runnable) {
        this.f30122o.k(Boolean.FALSE);
        this.f30119k.k(Boolean.TRUE);
        f0.B(m1.d(this), null, null, new mn.g(this, runnable, null, 3), 3).J(new i(this, 0));
    }

    public final void h(String str) {
        g3 g3Var = this.f30110b;
        cv.b bVar = g3Var.f4263g;
        UserData userDataM281copyW558gQQ$default = UserData.m281copyW558gQQ$default(g3Var.m(), null, null, null, null, false, false, null, str, null, null, null, null, null, null, null, null, null, null, 262015, null);
        g3Var.u(userDataM281copyW558gQQ$default);
        UserSettings userSettings = g3Var.f4276u;
        if (userSettings != null) {
            bVar.a(userDataM281copyW558gQQ$default, userSettings);
        }
        bVar.f13429b.d(str);
    }
}
