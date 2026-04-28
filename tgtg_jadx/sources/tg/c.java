package tg;

import com.app.tgtg.model.remote.item.LatLngInfo;
import com.app.tgtg.model.remote.user.response.Address;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kt.o;
import y80.a2;
import y80.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f40146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kt.h f40147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a2 f40148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a2 f40149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a2 f40150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a2 f40151f;

    public c(o oVar, kt.h hVar) {
        oVar.getClass();
        hVar.getClass();
        this.f40146a = oVar;
        this.f40147b = hVar;
        a2 a2VarC = r.c(n0.f26529a);
        this.f40148c = a2VarC;
        this.f40149d = a2VarC;
        a2 a2VarC2 = r.c(new vg.a(vg.f.INITIAL_LOCATION, new LatLngInfo(0.0d, 0.0d, 3, (DefaultConstructorMarker) null)));
        this.f40150e = a2VarC2;
        this.f40151f = a2VarC2;
    }

    public final jl.c a() {
        Object next;
        Iterator it = ((Iterable) this.f40148c.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((jl.c) next).f25305g) {
                break;
            }
        }
        jl.c cVar = (jl.c) next;
        if (cVar != null) {
            return cVar;
        }
        return new jl.c(null, 0, null, false, null, 511);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, z70.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof tg.a
            if (r0 == 0) goto L13
            r0 = r6
            tg.a r0 = (tg.a) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            tg.a r0 = new tg.a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f40142j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r6)
            u70.q r6 = (u70.q) r6
            java.lang.Object r5 = r6.f40851a
            return r5
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r6)
            r0.l = r3
            kt.h r6 = r4.f40147b
            java.lang.Object r5 = r6.a(r5, r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.c.b(java.lang.String, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.app.tgtg.model.remote.user.requests.SearchAddressRequest r5, z70.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof tg.b
            if (r0 == 0) goto L13
            r0 = r6
            tg.b r0 = (tg.b) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            tg.b r0 = new tg.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f40144j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r6)
            u70.q r6 = (u70.q) r6
            java.lang.Object r5 = r6.f40851a
            return r5
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r6)
            r0.l = r3
            kt.o r6 = r4.f40146a
            java.lang.Object r5 = r6.a(r5, r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.c.c(com.app.tgtg.model.remote.user.requests.SearchAddressRequest, z70.c):java.lang.Object");
    }

    public final void d(Address address) {
        address.getClass();
        jl.b bVar = a().f25299a;
        a2 a2Var = this.f40148c;
        Iterable<jl.c> iterable = (Iterable) a2Var.getValue();
        ArrayList arrayList = new ArrayList(e0.o(iterable, 10));
        for (jl.c cVarA : iterable) {
            if (cVarA.f25299a == bVar) {
                cVarA = jl.c.a(cVarA, null, address, true, true, false, null, null, 455);
            } else if (cVarA.f25304f) {
                cVarA = jl.c.a(cVarA, null, null, false, false, false, null, null, 351);
            }
            arrayList.add(cVarA);
        }
        a2Var.getClass();
        a2Var.k(null, arrayList);
    }

    public final void e(jl.c cVar) {
        a2 a2Var = this.f40148c;
        Iterable<jl.c> iterable = (Iterable) a2Var.getValue();
        ArrayList arrayList = new ArrayList(e0.o(iterable, 10));
        for (jl.c cVarA : iterable) {
            if (cVarA.f25299a == cVar.f25299a) {
                boolean z11 = cVar.f25304f;
                cVarA = jl.c.a(cVarA, null, cVar.f25302d, cVar.f25303e, z11, false, cVar.f25306h, cVar.f25307i, 71);
            }
            arrayList.add(cVarA);
        }
        a2Var.getClass();
        a2Var.k(null, arrayList);
    }
}
