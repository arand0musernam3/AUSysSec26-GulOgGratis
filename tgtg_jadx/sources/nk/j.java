package nk;

import ao.r1;
import com.app.tgtg.feature.itemview.ui.ItemViewActivity;
import com.app.tgtg.feature.main.fragments.browse.map.bottomSheet.MapBottomSheet;
import com.app.tgtg.feature.postpurchase.PostPurchaseActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.contactus.ContactUsViewModel;
import com.app.tgtg.model.remote.item.LatLngInfo;
import com.app.tgtg.model.remote.specialrewards.SpecialReward;
import com.braze.h2;
import f0.f2;
import g3.g7;
import g3.w6;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m3.b1;
import org.bouncycastle.iana.AEADAlgorithm;
import ss.g1;
import ss.w0;
import t1.q1;
import t1.t1;
import t1.y0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f31003j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f31004k;
    public Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f31005m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f31006n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, Object obj2, Object obj3, x70.c cVar, int i11) {
        super(2, cVar);
        this.f31003j = i11;
        this.l = obj;
        this.f31006n = obj2;
        this.f31005m = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        if (r0.emit(r13, r12) == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        if (r0.emit(r13, r12) == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.l
            y80.j r0 = (y80.j) r0
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r12.f31004k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L1c
            if (r2 == r4) goto L18
            if (r2 != r3) goto L11
            goto L18
        L11:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r13)
            r13 = 0
            return r13
        L18:
            ba0.g.M(r13)
            goto L58
        L1c:
            ba0.g.M(r13)
            java.lang.Object r13 = r12.f31006n
            ss.w r13 = (ss.w) r13
            y80.a2 r13 = r13.f39260h
            java.lang.Object r13 = r13.getValue()
            ss.e1 r13 = (ss.e1) r13
            boolean r2 = r13 instanceof ss.d1
            r5 = 0
            if (r2 == 0) goto L4d
            r6 = r13
            ss.d1 r6 = (ss.d1) r6
            java.lang.Object r13 = r12.f31005m
            ts.a0 r13 = (ts.a0) r13
            com.app.tgtg.model.remote.specialrewards.SpecialReward r8 = r13.f40437a
            r10 = 0
            r11 = 639(0x27f, float:8.95E-43)
            r7 = 0
            r9 = 0
            ss.d1 r13 = ss.d1.a(r6, r7, r8, r9, r10, r11)
            r12.l = r5
            r12.f31004k = r4
            java.lang.Object r13 = r0.emit(r13, r12)
            if (r13 != r1) goto L58
            goto L57
        L4d:
            r12.l = r5
            r12.f31004k = r3
            java.lang.Object r13 = r0.emit(r13, r12)
            if (r13 != r1) goto L58
        L57:
            return r1
        L58:
            kotlin.Unit r13 = kotlin.Unit.f26487a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: nk.j.a(java.lang.Object):java.lang.Object");
    }

    private final Object b(Object obj) {
        y80.j jVar = (y80.j) this.l;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f31004k;
        if (i11 == 0) {
            ba0.g.M(obj);
            this.l = null;
            this.f31004k = 1;
            if (jVar.emit(g1.f39180a, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba0.g.M(obj);
        }
        ts.e eVar = (ts.e) this.f31006n;
        String str = eVar.f40444b;
        w0 w0Var = (w0) this.f31005m;
        if (str != null) {
            w0Var.f39263c.i(new ts.g(w0Var.f39266f, str));
        } else {
            w0Var.f39263c.i(new ts.h(eVar.f40443a, w0Var.f39266f, true));
        }
        return Unit.f26487a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
    
        if (r4.emit(r10, r19) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a4, code lost:
    
        if (v80.f0.n(r2, r19) != r1) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            java.lang.Object r1 = r0.f31005m
            r5 = r1
            ts.h r5 = (ts.h) r5
            java.lang.Object r1 = r0.f31006n
            r3 = r1
            ss.w0 r3 = (ss.w0) r3
            java.lang.Object r1 = r0.l
            r4 = r1
            y80.j r4 = (y80.j) r4
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f31004k
            r8 = 3
            r6 = 2
            r7 = 1
            r9 = 0
            if (r2 == 0) goto L35
            if (r2 == r7) goto L31
            if (r2 == r6) goto L2d
            if (r2 != r8) goto L26
            ba0.g.M(r20)
            goto La7
        L26:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r1)
            r1 = 0
            return r1
        L2d:
            ba0.g.M(r20)
            goto L94
        L31:
            ba0.g.M(r20)
            goto L84
        L35:
            ba0.g.M(r20)
            com.app.tgtg.model.remote.voucher.VoucherMode r2 = r5.f40449b
            r3.f39266f = r2
            boolean r2 = r5.f40450c
            if (r2 != 0) goto L87
            java.util.List r2 = r3.f39264d
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L50
            java.util.List r2 = r3.f39265e
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L87
        L50:
            ss.k1 r10 = new ss.k1
            com.app.tgtg.model.remote.voucher.VoucherMode r2 = r3.f39266f
            com.app.tgtg.model.remote.voucher.VoucherMode r6 = com.app.tgtg.model.remote.voucher.VoucherMode.REGULAR
            if (r2 != r6) goto L5c
            java.util.List r2 = r3.f39264d
        L5a:
            r11 = r2
            goto L5f
        L5c:
            java.util.List r2 = r3.f39265e
            goto L5a
        L5f:
            java.util.List r2 = r3.f39264d
            int r12 = r2.size()
            java.util.List r2 = r3.f39265e
            int r13 = r2.size()
            com.app.tgtg.model.remote.voucher.VoucherMode r15 = r3.f39266f
            java.lang.String r2 = r5.f40448a
            r18 = 168(0xa8, float:2.35E-43)
            r14 = 0
            r16 = 0
            r17 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            r0.l = r9
            r0.f31004k = r7
            java.lang.Object r2 = r4.emit(r10, r0)
            if (r2 != r1) goto L84
            goto La6
        L84:
            kotlin.Unit r1 = kotlin.Unit.f26487a
            return r1
        L87:
            r0.l = r4
            r0.f31004k = r6
            ss.g1 r2 = ss.g1.f39180a
            java.lang.Object r2 = r4.emit(r2, r0)
            if (r2 != r1) goto L94
            goto La6
        L94:
            af.b r2 = new af.b
            r7 = 15
            r6 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            r0.l = r6
            r0.f31004k = r8
            java.lang.Object r2 = v80.f0.n(r2, r0)
            if (r2 != r1) goto La7
        La6:
            return r1
        La7:
            kotlin.Unit r1 = kotlin.Unit.f26487a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: nk.j.c(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, u70.j] */
    private final Object d(Object obj) {
        e90.c cVar;
        h2.s0 s0Var = (h2.s0) this.f31005m;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f31004k;
        if (i11 == 0) {
            ba0.g.M(obj);
            y0 y0Var = (y0) s0Var;
            y0Var.getClass();
            ((z3.x) t1.f39574b.getValue()).d(y0Var, t1.f39573a, y0Var.f39611h);
            e90.c cVar2 = y0Var.f39614k;
            this.l = cVar2;
            this.f31006n = s0Var;
            this.f31004k = 1;
            if (cVar2.g(this) == aVar) {
                return aVar;
            }
            cVar = cVar2;
        } else {
            if (i11 != 1) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            s0Var = (h2.s0) this.f31006n;
            cVar = (e90.c) this.l;
            ba0.g.M(obj);
        }
        try {
            ((y0) s0Var).f39608e = ((y0) s0Var).f39606c.getValue();
            v80.l lVar = ((y0) s0Var).f39613j;
            if (lVar != null) {
                u70.o oVar = u70.q.f40850b;
                lVar.resumeWith(((y0) s0Var).f39606c.getValue());
            }
            ((y0) s0Var).f39613j = null;
            cVar.e(null);
            return Unit.f26487a;
        } catch (Throwable th2) {
            cVar.e(null);
            throw th2;
        }
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f31003j) {
            case 0:
                j jVar = new j((ok.b) this.f31006n, (f2) this.f31005m, cVar, 0);
                jVar.l = obj;
                return jVar;
            case 1:
                j jVar2 = new j((f2) this.f31005m, this.f31006n, cVar, 1);
                jVar2.l = obj;
                return jVar2;
            case 2:
                j jVar3 = new j((f2) this.f31005m, cVar, 2);
                jVar3.l = obj;
                return jVar3;
            case 3:
                j jVar4 = new j((f2) this.f31005m, this.f31006n, cVar, 3);
                jVar4.l = obj;
                return jVar4;
            case 4:
                j jVar5 = new j((f2) this.f31005m, this.f31006n, cVar, 4);
                jVar5.l = obj;
                return jVar5;
            case 5:
                return new j((no.m0) this.f31006n, (String) this.f31005m, cVar, 5);
            case 6:
                return new j((ns.g) this.l, (SpecialReward) this.f31006n, (b1) this.f31005m, cVar, 6);
            case 7:
                return new j((q1) this.l, (z3.u) this.f31006n, (q1.m0) this.f31005m, cVar, 7);
            case 8:
                j jVar6 = new j((zc.k) this.f31006n, (pc.h) this.f31005m, cVar, 8);
                jVar6.l = obj;
                return jVar6;
            case 9:
                return new j((i2.e0) this.f31006n, (pi.m) this.f31005m, cVar, 9);
            case 10:
                return new j((r1) this.l, (String) this.f31006n, (LatLngInfo) this.f31005m, cVar, 10);
            case 11:
                return new j((MapBottomSheet) this.l, (com.google.firebase.messaging.a0) this.f31006n, (tm.e) this.f31005m, cVar, 11);
            case 12:
                return new j((tm.e) this.l, (com.google.firebase.messaging.a0) this.f31006n, (b1) this.f31005m, cVar, 12);
            case 13:
                return new j((ItemViewActivity) this.l, (g7) this.f31006n, (b1) this.f31005m, cVar, 13);
            case 14:
                j jVar7 = new j((PostPurchaseActivity) this.f31006n, (g9.b0) this.f31005m, cVar, 14);
                jVar7.l = obj;
                return jVar7;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new j((t5.a) this.l, (w6) this.f31006n, (Function0) this.f31005m, cVar, 15);
            case 16:
                return new j((t5.a) this.l, (w6) this.f31006n, (Function0) this.f31005m, cVar, 16);
            case 17:
                j jVar8 = new j((q1) this.f31006n, (b1) this.f31005m, cVar, 17);
                jVar8.l = obj;
                return jVar8;
            case 18:
                return new j((s2.j) this.f31006n, (t2.e) this.f31005m, cVar, 18);
            case 19:
                return new j((ContactUsViewModel) this.l, (String) this.f31006n, (String) this.f31005m, cVar, 19);
            case 20:
                j jVar9 = new j((ts.q) this.f31006n, (ss.w) this.f31005m, cVar, 20);
                jVar9.l = obj;
                return jVar9;
            case 21:
                j jVar10 = new j((ts.t) this.f31006n, (ss.w) this.f31005m, cVar, 21);
                jVar10.l = obj;
                return jVar10;
            case 22:
                j jVar11 = new j((ss.w) this.f31006n, (ts.v) this.f31005m, cVar, 22);
                jVar11.l = obj;
                return jVar11;
            case 23:
                j jVar12 = new j((ss.w) this.f31006n, (ts.y) this.f31005m, cVar, 23);
                jVar12.l = obj;
                return jVar12;
            case 24:
                j jVar13 = new j((ss.w) this.f31006n, (ts.a0) this.f31005m, cVar, 24);
                jVar13.l = obj;
                return jVar13;
            case 25:
                j jVar14 = new j((ts.e) this.f31006n, (w0) this.f31005m, cVar, 25);
                jVar14.l = obj;
                return jVar14;
            case 26:
                j jVar15 = new j((w0) this.f31006n, (ts.h) this.f31005m, cVar, 26);
                jVar15.l = obj;
                return jVar15;
            case 27:
                j jVar16 = new j((w0) this.f31006n, (ts.j) this.f31005m, cVar, 27);
                jVar16.l = obj;
                return jVar16;
            case 28:
                return new j((h2.s0) this.f31005m, cVar, 28);
            default:
                return new j((tg.i) this.l, (String) this.f31006n, (LatLngInfo) this.f31005m, cVar, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f31003j) {
        }
        return ((j) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x02d7, code lost:
    
        if (com.app.tgtg.feature.tabprofile.manageaccount.contactus.ContactUsViewModel.b(r1, r0, r25) == r2) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0337, code lost:
    
        if (r0.invoke(r25) == r2) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03c3, code lost:
    
        if (v80.f0.o(500, r25) == r0) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x040a, code lost:
    
        if (v80.f0.o(500, r25) == r0) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0522, code lost:
    
        if (r0.G(r25) == r1) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x054d, code lost:
    
        if (r0.G(r25) == r1) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0556, code lost:
    
        if (r0.Q(r25) == r1) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x055f, code lost:
    
        if (r0.N(r25) == r1) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0606, code lost:
    
        if (r1.f(r2, t1.c.j(0.0f, 0.0f, null, 7), r25) == r0) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0739, code lost:
    
        if (r2 == r1) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x07d6, code lost:
    
        if (r1.emit(r0, r25) == r2) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x0880, code lost:
    
        if (r3.g(r6, true, r25) == r1) goto L461;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x08b3, code lost:
    
        if (r0.emit(r2, r25) == r1) goto L461;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x094c, code lost:
    
        if (r1 == r2) goto L501;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x09d1, code lost:
    
        if (r1.emit(r0, r25) == r2) goto L501;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0121, code lost:
    
        if (r0.emit(r2, r25) == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x0a78, code lost:
    
        if (r1.emit(r0, r25) == r2) goto L539;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x012c, code lost:
    
        if (r0.emit(r2, r25) == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0209, code lost:
    
        if (r1.emit(r16, r25) == r2) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0231, code lost:
    
        if (v80.f0.n(r14, r25) != r2) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x09b7  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x09c8  */
    /* JADX WARN: Type inference failed for: r0v99, types: [kotlin.jvm.functions.Function1, z70.i] */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nk.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(f2 f2Var, Object obj, x70.c cVar, int i11) {
        super(2, cVar);
        this.f31003j = i11;
        this.f31005m = f2Var;
        this.f31006n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, Object obj2, x70.c cVar, int i11) {
        super(2, cVar);
        this.f31003j = i11;
        this.f31006n = obj;
        this.f31005m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, x70.c cVar, int i11) {
        super(2, cVar);
        this.f31003j = i11;
        this.f31005m = obj;
    }
}
