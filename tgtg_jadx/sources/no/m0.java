package no;

import androidx.lifecycle.c1;
import androidx.lifecycle.m1;
import ao.f2;
import ao.g3;
import ao.r1;
import ao.y0;
import b0.c2;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.order.OrderState;
import com.google.android.gms.internal.measurement.cg;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.SourceDebugExtension;
import y80.a2;
import y80.h1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lno/m0;", "Lho/j;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSurpriseBagOrderViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SurpriseBagOrderViewModel.kt\ncom/app/tgtg/feature/orderview/surprisebag/SurpriseBagOrderViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,905:1\n1#2:906\n*E\n"})
public final class m0 extends ho.j {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final h8.e f31245u0 = new h8.e("hasTooltipBeenSeen");

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final h8.e f31246v0 = new h8.e("hasCollectionReminderTooltipBeenSeen");
    public final g3 A;
    public final r1 B;
    public final y0 C;
    public final f2 D;
    public final gv.b E;
    public final gt.w F;
    public final gt.j G;
    public final hv.b H;
    public final ko.b I;
    public final at.c0 J;
    public final d8.f K;
    public String L;
    public final a2 M;
    public final h1 N;
    public final a2 O;
    public final h1 P;
    public final a2 Q;
    public final h1 R;
    public final a2 S;
    public final h1 T;
    public final a2 U;
    public final h1 V;
    public final a2 W;
    public final h1 X;
    public final a2 Y;
    public final h1 Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final a2 f31247a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final h1 f31248b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final x80.i f31249c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final y80.d f31250d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final a2 f31251e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final a2 f31252f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final a2 f31253g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final a2 f31254h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final a2 f31255i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final h1 f31256j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final a2 f31257k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final h1 f31258l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final a2 f31259m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final h1 f31260n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final a2 f31261o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final h1 f31262p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final a2 f31263q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final h1 f31264r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f31265s0;
    public boolean t0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final c1 f31266y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final et.z f31267z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(c1 c1Var, et.z zVar, g3 g3Var, r1 r1Var, y0 y0Var, f2 f2Var, gs.a aVar, cv.b bVar, gv.b bVar2, gt.w wVar, gt.j jVar, hv.b bVar3, ko.b bVar4, at.c0 c0Var, d8.f fVar) {
        String strE;
        super(c1Var, zVar, g3Var, aVar, bVar, jVar, bVar4);
        c1Var.getClass();
        zVar.getClass();
        g3Var.getClass();
        r1Var.getClass();
        y0Var.getClass();
        f2Var.getClass();
        aVar.getClass();
        bVar.getClass();
        bVar2.getClass();
        bVar3.getClass();
        bVar4.getClass();
        c0Var.getClass();
        fVar.getClass();
        this.f31266y = c1Var;
        this.f31267z = zVar;
        this.A = g3Var;
        this.B = r1Var;
        this.C = y0Var;
        this.D = f2Var;
        this.E = bVar2;
        this.F = wVar;
        this.G = jVar;
        this.H = bVar3;
        this.I = bVar4;
        this.J = c0Var;
        this.K = fVar;
        x70.c cVar = null;
        a2 a2VarC = y80.r.c(null);
        this.M = a2VarC;
        this.N = new h1(a2VarC);
        Boolean bool = Boolean.FALSE;
        a2 a2VarC2 = y80.r.c(bool);
        this.O = a2VarC2;
        this.P = new h1(a2VarC2);
        a2 a2VarC3 = y80.r.c(bool);
        this.Q = a2VarC3;
        this.R = new h1(a2VarC3);
        a2 a2VarC4 = y80.r.c(bool);
        this.S = a2VarC4;
        this.T = new h1(a2VarC4);
        a2 a2VarC5 = y80.r.c(bool);
        this.U = a2VarC5;
        this.V = new h1(a2VarC5);
        a2 a2VarC6 = y80.r.c(bool);
        this.W = a2VarC6;
        this.X = new h1(a2VarC6);
        a2 a2VarC7 = y80.r.c(null);
        this.Y = a2VarC7;
        this.Z = new h1(a2VarC7);
        a2 a2VarC8 = y80.r.c(null);
        this.f31247a0 = a2VarC8;
        this.f31248b0 = new h1(a2VarC8);
        x80.i iVarA = cg.a(0, null, null, 7);
        this.f31249c0 = iVarA;
        this.f31250d0 = y80.r.w(iVarA);
        a2 a2VarC9 = y80.r.c(null);
        this.f31251e0 = a2VarC9;
        this.f31252f0 = a2VarC9;
        a2 a2VarC10 = y80.r.c(null);
        this.f31253g0 = a2VarC10;
        this.f31254h0 = a2VarC10;
        a2 a2VarC11 = y80.r.c(d.f31182a);
        this.f31255i0 = a2VarC11;
        this.f31256j0 = new h1(a2VarC11);
        a2 a2VarC12 = y80.r.c(bool);
        this.f31257k0 = a2VarC12;
        this.f31258l0 = new h1(a2VarC12);
        a2 a2VarC13 = y80.r.c(0);
        this.f31259m0 = a2VarC13;
        this.f31260n0 = new h1(a2VarC13);
        a2 a2VarC14 = y80.r.c(bool);
        this.f31261o0 = a2VarC14;
        this.f31262p0 = new h1(a2VarC14);
        a2 a2VarC15 = y80.r.c(bool);
        this.f31263q0 = a2VarC15;
        this.f31264r0 = new h1(a2VarC15);
        this.f31265s0 = true;
        this.t0 = true;
        if (((String) c1Var.a("INVITATION_ID")) == null && (strE = e()) != null) {
            b(strE);
        }
        String str = (String) c1Var.a("INVITATION_FROM_DEEPLINK");
        if (str != null) {
            v80.f0.B(m1.d(this), null, null, new nk.j(this, str, cVar, 5), 3);
            this.f31265s0 = false;
        }
        String str2 = (String) c1Var.a("INVITATION_ID");
        if (str2 != null) {
            v80.f0.B(m1.d(this), null, null, new g0(this, str2, false, null), 3);
            this.f31265s0 = false;
            this.t0 = false;
        }
        if (e() == null && ((String) c1Var.a("INVITATION_FROM_DEEPLINK")) == null && ((String) c1Var.a("INVITATION_ID")) == null) {
            v80.f0.B(m1.d(this), null, null, new y(this, cVar, 0), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object n(no.m0 r4, java.lang.String r5, z70.c r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof no.d0
            if (r0 == 0) goto L16
            r0 = r6
            no.d0 r0 = (no.d0) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.l = r1
            goto L1b
        L16:
            no.d0 r0 = new no.d0
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.f31183j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L2a
            ba0.g.M(r6)
            goto L51
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r4)
            r4 = 0
            return r4
        L31:
            ba0.g.M(r6)
            kotlin.jvm.internal.StringCompanionObject r6 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r3)
            java.lang.String r6 = "https://share.toogoodtogo.com/invitation/order/%s"
            java.lang.String r5 = java.lang.String.format(r6, r5)
            r4.L = r5
            x80.i r6 = r4.f31249c0
            r0.l = r3
            java.lang.Object r5 = r6.f(r5, r0)
            if (r5 != r1) goto L51
            return r1
        L51:
            r5 = 0
            r4.j(r5)
            kotlin.Unit r4 = kotlin.Unit.f26487a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: no.m0.n(no.m0, java.lang.String, z70.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
    
        if (kotlin.Unit.f26487a == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o(no.m0 r6, com.app.tgtg.model.remote.order.Order r7, z70.c r8) {
        /*
            boolean r0 = r8 instanceof no.h0
            if (r0 == 0) goto L13
            r0 = r8
            no.h0 r0 = (no.h0) r0
            int r1 = r0.f31214n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31214n = r1
            goto L18
        L13:
            no.h0 r0 = new no.h0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.l
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f31214n
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r8)     // Catch: java.lang.Exception -> L7d
            goto L7a
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L32:
            int r7 = r0.f31212k
            ba0.g.M(r8)     // Catch: java.lang.Exception -> L7d
            u70.q r8 = (u70.q) r8     // Catch: java.lang.Exception -> L7d
            java.lang.Object r8 = r8.f40851a     // Catch: java.lang.Exception -> L7d
            goto L53
        L3c:
            ba0.g.M(r8)
            java.lang.String r7 = r7.m428getItemIdRWxzYZM()
            if (r7 == 0) goto L86
            ao.r1 r8 = r6.B     // Catch: java.lang.Exception -> L7d
            r0.f31212k = r5     // Catch: java.lang.Exception -> L7d
            r0.f31214n = r4     // Catch: java.lang.Exception -> L7d
            java.lang.Object r8 = r8.a(r7, r0)     // Catch: java.lang.Exception -> L7d
            if (r8 != r1) goto L52
            goto L79
        L52:
            r7 = r5
        L53:
            u70.o r2 = u70.q.f40850b     // Catch: java.lang.Exception -> L7d
            boolean r2 = r8 instanceof u70.p     // Catch: java.lang.Exception -> L7d
            if (r2 != 0) goto L7a
            r2 = r8
            com.app.tgtg.model.remote.item.response.SameTimeCloseByResponse r2 = (com.app.tgtg.model.remote.item.response.SameTimeCloseByResponse) r2     // Catch: java.lang.Exception -> L7d
            java.util.List r2 = r2.recommendedItems()     // Catch: java.lang.Exception -> L7d
            boolean r4 = r2.isEmpty()     // Catch: java.lang.Exception -> L7d
            if (r4 != 0) goto L7a
            y80.a2 r6 = r6.f31247a0     // Catch: java.lang.Exception -> L7d
            java.lang.Object r2 = r2.get(r5)     // Catch: java.lang.Exception -> L7d
            r0.f31211j = r8     // Catch: java.lang.Exception -> L7d
            r0.f31212k = r7     // Catch: java.lang.Exception -> L7d
            r0.f31214n = r3     // Catch: java.lang.Exception -> L7d
            r6.j(r2)     // Catch: java.lang.Exception -> L7d
            kotlin.Unit r6 = kotlin.Unit.f26487a     // Catch: java.lang.Exception -> L7d
            if (r6 != r1) goto L7a
        L79:
            return r1
        L7a:
            u70.o r6 = u70.q.f40850b     // Catch: java.lang.Exception -> L7d
            goto L86
        L7d:
            mv.m0 r6 = sa0.a.f38953a
            java.lang.String r7 = "Error fetching recommendations"
            java.lang.Object[] r8 = new java.lang.Object[r5]
            r6.c(r7, r8)
        L86:
            kotlin.Unit r6 = kotlin.Unit.f26487a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: no.m0.o(no.m0, com.app.tgtg.model.remote.order.Order, z70.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a2, code lost:
    
        if (kotlin.Unit.f26487a == r2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d3, code lost:
    
        if (kotlin.Unit.f26487a == r2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d5, code lost:
    
        return r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object p(no.m0 r8, com.app.tgtg.model.remote.invitation.InvitationFromDeeplinkResponse r9, z70.c r10) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: no.m0.p(no.m0, com.app.tgtg.model.remote.invitation.InvitationFromDeeplinkResponse, z70.c):java.lang.Object");
    }

    public static boolean s(Order order) {
        if ((order != null ? order.getState() : null) == OrderState.COLLECTION_DELEGATED) {
            return true;
        }
        if ((order != null ? order.getState() : null) != OrderState.COLLECTION_OFFERED) {
            return (order != null ? order.getState() : null) == OrderState.ACTIVE;
        }
        return true;
    }

    @Override // ho.j
    public final void b(String str) {
        str.getClass();
        v80.f0.B(m1.d(this), null, null, new al.j(this, str, (x70.c) null), 3);
    }

    public final void q() {
        Order order = (Order) this.f22215i.f45488a.getValue();
        if (order != null) {
            v80.f0.B(m1.d(this), null, null, new a0(this, order, null, 0), 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (kotlin.Unit.f26487a == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        if (kotlin.Unit.f26487a == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(qg.a r7, z70.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof no.i0
            if (r0 == 0) goto L13
            r0 = r8
            no.i0 r0 = (no.i0) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            no.i0 r0 = new no.i0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f31220j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 0
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r5) goto L2b
            ba0.g.M(r8)
            goto L73
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L32:
            ba0.g.M(r8)
            goto L54
        L36:
            ba0.g.M(r8)
            java.lang.String r8 = r7.f37046a
            java.lang.String r2 = "ENTITY_NOT_FOUND_IN_REGION"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r2)
            if (r2 == 0) goto L5a
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r0.l = r4
            y80.a2 r8 = r6.Q
            r8.getClass()
            r8.k(r3, r7)
            kotlin.Unit r7 = kotlin.Unit.f26487a
            if (r7 != r1) goto L54
            goto L72
        L54:
            cv.i r7 = cv.i.SCREEN_ERROR_INVITATION_RECEIVED
            r6.l(r7, r3)
            goto L79
        L5a:
            java.lang.String r2 = "ENTITY_NOT_FOUND"
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r2)
            if (r8 == 0) goto L76
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r0.l = r5
            y80.a2 r8 = r6.S
            r8.getClass()
            r8.k(r3, r7)
            kotlin.Unit r7 = kotlin.Unit.f26487a
            if (r7 != r1) goto L73
        L72:
            return r1
        L73:
            kotlin.Unit r7 = kotlin.Unit.f26487a
            return r7
        L76:
            r6.i(r7)
        L79:
            kotlin.Unit r7 = kotlin.Unit.f26487a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: no.m0.r(qg.a, z70.c):java.lang.Object");
    }

    public final void t(String str) {
        h1 h1Var = this.f22215i;
        Order order = (Order) h1Var.f45488a.getValue();
        x70.c cVar = null;
        String invitationId = order != null ? order.getInvitationId() : null;
        Order order2 = (Order) h1Var.f45488a.getValue();
        String strM429getOrderIdreIZeYA = order2 != null ? order2.m429getOrderIdreIZeYA() : null;
        Order order3 = (Order) h1Var.f45488a.getValue();
        Boolean boolValueOf = order3 != null ? Boolean.valueOf(order3.isEligibleForReward()) : null;
        if (invitationId != null) {
            v80.f0.B(m1.d(this), null, null, new c2(this, invitationId, str, (x70.c) null), 3);
        } else if (strM429getOrderIdreIZeYA != null) {
            v80.f0.B(m1.d(this), null, null, new ep.a0(this, strM429getOrderIdreIZeYA, boolValueOf != null ? boolValueOf.booleanValue() : false, str, (x70.c) null, 5), 3);
        } else {
            v80.f0.B(m1.d(this), null, null, new y(this, cVar, 1), 3);
        }
    }

    public final void u(String str) {
        str.getClass();
        cv.i iVar = cv.i.ACTION_CLICK_RECOMMENDED_ITEM;
        dv.a aVar = dv.a.SCREEN;
        dv.d dVar = dv.d.SCREEN_ORDER;
        Pair pair = new Pair(aVar, new dv.c(dVar != null ? dVar.a() : null));
        Pair pair2 = new Pair(dv.a.ITEM_ID, new dv.c(str));
        dv.a aVar2 = dv.a.TYPE;
        dv.d dVar2 = dv.d.SAME_TIME_CLOSE_BY;
        l(iVar, h0.g.E(pair, pair2, new Pair(aVar2, new dv.c(dVar2 != null ? dVar2.a() : null))));
    }
}
