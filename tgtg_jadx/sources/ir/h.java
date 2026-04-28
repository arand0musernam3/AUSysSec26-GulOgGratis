package ir;

import androidx.lifecycle.l1;
import ao.g3;
import com.app.tgtg.model.remote.user.requests.UserAddress;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.u;
import y80.a2;
import y80.h1;
import y80.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lir/h;", "Landroidx/lifecycle/l1;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAccountDetailsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountDetailsViewModel.kt\ncom/app/tgtg/feature/tabprofile/manageaccount/accountdetails/AccountDetailsViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,204:1\n1#2:205\n1915#3,2:206\n*S KotlinDebug\n*F\n+ 1 AccountDetailsViewModel.kt\ncom/app/tgtg/feature/tabprofile/manageaccount/accountdetails/AccountDetailsViewModel\n*L\n184#1:206,2\n*E\n"})
public final class h extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g3 f24124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lr.a f24125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cv.b f24126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u f24127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a2 f24128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h1 f24129f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a2 f24130g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h1 f24131h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a2 f24132i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h1 f24133j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a2 f24134k;
    public final h1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a2 f24135m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h1 f24136n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a2 f24137o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h1 f24138p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a2 f24139q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h1 f24140r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a2 f24141s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h1 f24142t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final a2 f24143u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final h1 f24144v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final a2 f24145w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final h1 f24146x;

    public h(g3 g3Var, lr.a aVar, cv.b bVar, u uVar) {
        g3Var.getClass();
        aVar.getClass();
        bVar.getClass();
        uVar.getClass();
        this.f24124a = g3Var;
        this.f24125b = aVar;
        this.f24126c = bVar;
        this.f24127d = uVar;
        a2 a2VarC = r.c(null);
        this.f24128e = a2VarC;
        this.f24129f = new h1(a2VarC);
        a2 a2VarC2 = r.c("");
        this.f24130g = a2VarC2;
        this.f24131h = new h1(a2VarC2);
        a2 a2VarC3 = r.c("");
        this.f24132i = a2VarC3;
        this.f24133j = new h1(a2VarC3);
        a2 a2VarC4 = r.c(Boolean.FALSE);
        this.f24134k = a2VarC4;
        this.l = new h1(a2VarC4);
        a2 a2VarC5 = r.c("");
        this.f24135m = a2VarC5;
        this.f24136n = new h1(a2VarC5);
        a2 a2VarC6 = r.c(null);
        this.f24137o = a2VarC6;
        this.f24138p = new h1(a2VarC6);
        a2 a2VarC7 = r.c(null);
        this.f24139q = a2VarC7;
        this.f24140r = new h1(a2VarC7);
        a2 a2VarC8 = r.c(null);
        this.f24141s = a2VarC8;
        this.f24142t = new h1(a2VarC8);
        a2 a2VarC9 = r.c(null);
        this.f24143u = a2VarC9;
        this.f24144v = new h1(a2VarC9);
        String birthDate = g3Var.m().getBirthDate();
        a2 a2VarC10 = r.c(birthDate != null ? birthDate : "");
        this.f24145w = a2VarC10;
        this.f24146x = new h1(a2VarC10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        if (kotlin.Unit.f26487a == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ir.h r5, com.app.tgtg.model.remote.UserData r6, z70.c r7) {
        /*
            boolean r0 = r7 instanceof ir.f
            if (r0 == 0) goto L13
            r0 = r7
            ir.f r0 = (ir.f) r0
            int r1 = r0.f24121m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24121m = r1
            goto L18
        L13:
            ir.f r0 = new ir.f
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f24120k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f24121m
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            ba0.g.M(r7)
            goto L5f
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L31:
            ba0.g.M(r7)
            u70.q r7 = (u70.q) r7
            java.lang.Object r6 = r7.f40851a
            goto L47
        L39:
            ba0.g.M(r7)
            ao.g3 r7 = r5.f24124a
            r0.f24121m = r4
            java.lang.Object r6 = r7.F(r6, r0)
            if (r6 != r1) goto L47
            goto L5e
        L47:
            java.lang.Throwable r7 = u70.q.a(r6)
            if (r7 == 0) goto L5f
            y80.a2 r5 = r5.f24128e
            r0.f24119j = r6
            r0.f24121m = r3
            r5.getClass()
            r6 = 0
            r5.k(r6, r7)
            kotlin.Unit r5 = kotlin.Unit.f26487a
            if (r5 != r1) goto L5f
        L5e:
            return r1
        L5f:
            kotlin.Unit r5 = kotlin.Unit.f26487a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.h.a(ir.h, com.app.tgtg.model.remote.UserData, z70.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(ir.h r5, z70.c r6) {
        /*
            boolean r0 = r6 instanceof ir.g
            if (r0 == 0) goto L13
            r0 = r6
            ir.g r0 = (ir.g) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ir.g r0 = new ir.g
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f24122j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            ba0.g.M(r6)
            goto L5a
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L31:
            ba0.g.M(r6)     // Catch: java.lang.Exception -> L3a
            u70.q r6 = (u70.q) r6     // Catch: java.lang.Exception -> L3a
            r6.getClass()     // Catch: java.lang.Exception -> L3a
            goto L5a
        L3a:
            r6 = move-exception
            goto L4a
        L3c:
            ba0.g.M(r6)
            ao.g3 r6 = r5.f24124a     // Catch: java.lang.Exception -> L3a
            r0.l = r4     // Catch: java.lang.Exception -> L3a
            java.lang.Object r5 = r6.G(r0)     // Catch: java.lang.Exception -> L3a
            if (r5 != r1) goto L5a
            goto L5c
        L4a:
            y80.a2 r5 = r5.f24128e
            r0.l = r3
            r5.getClass()
            r0 = 0
            r5.k(r0, r6)
            kotlin.Unit r5 = kotlin.Unit.f26487a
            if (r5 != r1) goto L5a
            goto L5c
        L5a:
            kotlin.Unit r1 = kotlin.Unit.f26487a
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.h.b(ir.h, z70.c):java.lang.Object");
    }

    public final String c(nr.a aVar) {
        aVar.getClass();
        List<UserAddress> userAddresses = this.f24124a.m().getUserAddresses();
        if (userAddresses == null) {
            return "";
        }
        for (UserAddress userAddress : userAddresses) {
            if ((userAddress != null ? userAddress.getUserAddressType() : null) == aVar) {
                return userAddress.getAddress1();
            }
        }
        return "";
    }

    public final void d(cv.i iVar, dv.b bVar) {
        iVar.getClass();
        this.f24126c.c(iVar, bVar);
    }
}
