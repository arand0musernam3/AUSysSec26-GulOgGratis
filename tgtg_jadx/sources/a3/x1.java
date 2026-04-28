package a3;

import android.content.Context;
import androidx.activity.ComponentActivity;
import com.app.tgtg.feature.tabprofile.legal.privacy.privacyaction.PrivacyActionActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.hiddenstores.network.model.request.RemoveHiddenStoreRequest;
import com.app.tgtg.model.remote.order.Order;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f618j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f619k;
    public Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f620m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f621n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(m3.b1 b1Var, ap.n nVar, int i11, m3.b1 b1Var2, x70.c cVar) {
        super(2, cVar);
        this.f618j = 17;
        this.l = b1Var;
        this.f620m = nVar;
        this.f619k = i11;
        this.f621n = b1Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        if (r7 == r2) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f621n
            gd.c r0 = (gd.c) r0
            java.lang.Object r1 = r6.f620m
            gd.i r1 = (gd.i) r1
            y70.a r2 = y70.a.COROUTINE_SUSPENDED
            int r3 = r6.f619k
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L27
            if (r3 == r5) goto L23
            if (r3 != r4) goto L1c
            java.lang.Object r0 = r6.l
            gd.i r0 = (gd.i) r0
            ba0.g.M(r7)
            goto L57
        L1c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L23:
            ba0.g.M(r7)
            goto L3f
        L27:
            ba0.g.M(r7)
            gd.k r7 = r1.f20383q
            if (r7 == 0) goto L42
            td.i r3 = r0.f20364b
            td.i r3 = gd.i.j(r1, r3, r5)
            fd.t r0 = r0.f20363a
            r6.f619k = r5
            java.lang.Object r7 = r7.a(r0, r3, r6)
            if (r7 != r2) goto L3f
            goto L55
        L3f:
            gd.h r7 = (gd.h) r7
            goto L91
        L42:
            td.i r7 = r0.f20364b
            r3 = 0
            td.i r7 = gd.i.j(r1, r7, r3)
            fd.t r0 = r0.f20363a
            r6.l = r1
            r6.f619k = r4
            java.lang.Object r7 = r0.c(r7, r6)
            if (r7 != r2) goto L56
        L55:
            return r2
        L56:
            r0 = r1
        L57:
            td.l r7 = (td.l) r7
            r0.getClass()
            boolean r2 = r7 instanceof td.q
            if (r2 == 0) goto L75
            gd.g r2 = new gd.g
            td.q r7 = (td.q) r7
            fd.l r3 = r7.f40040a
            td.i r4 = r7.f40041b
            android.content.Context r4 = r4.f39996a
            int r0 = r0.f20382p
            n4.b r0 = gd.o.d(r3, r4, r0)
            r2.<init>(r0, r7)
        L73:
            r7 = r2
            goto L91
        L75:
            boolean r2 = r7 instanceof td.d
            if (r2 == 0) goto L97
            gd.e r2 = new gd.e
            td.d r7 = (td.d) r7
            fd.l r3 = r7.f39954a
            if (r3 == 0) goto L8c
            td.i r4 = r7.f39955b
            android.content.Context r4 = r4.f39996a
            int r0 = r0.f20382p
            n4.b r0 = gd.o.d(r3, r4, r0)
            goto L8d
        L8c:
            r0 = 0
        L8d:
            r2.<init>(r0, r7)
            goto L73
        L91:
            gd.i.k(r1, r7)
            kotlin.Unit r7 = kotlin.Unit.f26487a
            return r7
        L97:
            e40.a.f()
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.x1.a(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f621n
            gl.q r0 = (gl.q) r0
            y80.a2 r1 = r0.f20573g
            y70.a r2 = y70.a.COROUTINE_SUSPENDED
            int r3 = r10.f619k
            r4 = 2
            r5 = 1
            java.lang.String r6 = "OnboardingSurvey"
            r7 = 0
            r8 = 0
            if (r3 == 0) goto L2f
            if (r3 == r5) goto L26
            if (r3 != r4) goto L20
            java.lang.Object r2 = r10.f620m
            gl.q r2 = (gl.q) r2
            java.lang.Object r3 = r10.l
            ba0.g.M(r11)
            goto L76
        L20:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r11)
            return r7
        L26:
            ba0.g.M(r11)
            u70.q r11 = (u70.q) r11
            java.lang.Object r11 = r11.f40851a
        L2d:
            r3 = r11
            goto L53
        L2f:
            ba0.g.M(r11)
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            r1.getClass()
            r1.k(r7, r11)
            mv.m0 r11 = sa0.a.f38953a
            r11.h(r6)
            java.lang.String r3 = "Calling onboarding/save API"
            java.lang.Object[] r9 = new java.lang.Object[r8]
            r11.c(r3, r9)
            gl.o r11 = r0.f20567a
            java.util.ArrayList r3 = r0.f20572f
            r10.f619k = r5
            java.lang.Object r11 = r11.a(r3, r10)
            if (r11 != r2) goto L2d
            goto L74
        L53:
            u70.o r11 = u70.q.f40850b
            boolean r11 = r3 instanceof u70.p
            if (r11 != 0) goto L79
            r11 = r3
            q90.r0 r11 = (q90.r0) r11
            mv.m0 r11 = sa0.a.f38953a
            r11.h(r6)
            java.lang.String r5 = "onboarding/save success (200)"
            java.lang.Object[] r9 = new java.lang.Object[r8]
            r11.c(r5, r9)
            r10.l = r3
            r10.f620m = r0
            r10.f619k = r4
            java.lang.Object r11 = gl.q.a(r0, r10)
            if (r11 != r2) goto L75
        L74:
            return r2
        L75:
            r2 = r0
        L76:
            r2.c()
        L79:
            java.lang.Throwable r11 = u70.q.a(r3)
            if (r11 == 0) goto Lb0
            boolean r2 = r11 instanceof retrofit2.HttpException
            if (r2 == 0) goto L86
            retrofit2.HttpException r11 = (retrofit2.HttpException) r11
            goto L87
        L86:
            r11 = r7
        L87:
            if (r11 == 0) goto L8c
            int r11 = r11.f37956a
            goto L8d
        L8c:
            r11 = r8
        L8d:
            mv.m0 r2 = sa0.a.f38953a
            r2.h(r6)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "onboarding/save failed: HTTP "
            r3.<init>(r4)
            r3.append(r11)
            java.lang.String r11 = r3.toString()
            java.lang.Object[] r3 = new java.lang.Object[r8]
            r2.c(r11, r3)
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            r1.getClass()
            r1.k(r7, r11)
            r0.c()
        Lb0:
            kotlin.Unit r11 = kotlin.Unit.f26487a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.x1.b(java.lang.Object):java.lang.Object");
    }

    private final Object c(Object obj) {
        Object objF;
        t1.i iVar;
        Object obj2 = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f619k;
        if (i11 == 0) {
            ba0.g.M(obj);
            if (((Boolean) ((m3.b1) this.f621n).getValue()).booleanValue()) {
                dn.k kVar = (dn.k) this.l;
                this.f619k = 1;
                z1.r rVar = (z1.r) kVar.f15019c;
                z1.g1 g1VarD = rVar.d();
                gn.a0 a0Var = gn.a0.Expanded;
                if (((z1.a0) g1VarD).c(a0Var)) {
                    if (rVar.e()) {
                        iVar = rVar.f46649d;
                        if (iVar == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("snapAnimationSpec");
                            iVar = null;
                        }
                    } else {
                        iVar = z1.a.f46388a;
                    }
                    objF = z1.k.f(rVar, a0Var, iVar, this);
                    if (objF != obj2) {
                        objF = Unit.f26487a;
                    }
                    if (objF != obj2) {
                        objF = Unit.f26487a;
                    }
                } else {
                    objF = Unit.f26487a;
                }
                if (objF == obj2) {
                    return obj2;
                }
            }
            return Unit.f26487a;
        }
        if (i11 != 1) {
            com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ba0.g.M(obj);
        y80.a2 a2Var = ((fn.c) this.f620m).H;
        Boolean bool = Boolean.FALSE;
        a2Var.getClass();
        a2Var.k(null, bool);
        return Unit.f26487a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x037c  */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.collections.n0] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.x1.d(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [kotlin.jvm.functions.Function2, z70.i] */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.jvm.functions.Function2, z70.i] */
    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f618j) {
            case 0:
                x1 x1Var = new x1((m3.c3) this.f620m, (t1.b) this.f621n, cVar, 0);
                x1Var.l = obj;
                return x1Var;
            case 1:
                x1 x1Var2 = new x1((v80.q) this.f620m, (Function2) this.f621n, cVar);
                x1Var2.l = obj;
                return x1Var2;
            case 2:
                return new x1((al.p) this.f621n, cVar, 2);
            case 3:
                x1 x1Var3 = new x1((ao.c) this.f621n, cVar, 3);
                x1Var3.f620m = obj;
                return x1Var3;
            case 4:
                return new x1((cv.e) this.f620m, (ao.m0) this.f621n, cVar, 4);
            case 5:
                return new x1((ap.n) this.l, (Order) this.f620m, (q90.a0) this.f621n, cVar, 5);
            case 6:
                x1 x1Var4 = new x1((as.b) this.f620m, (RemoveHiddenStoreRequest) this.f621n, cVar, 6);
                x1Var4.l = obj;
                return x1Var4;
            case 7:
                return new x1((b0.b1) this.l, cVar, (List) this.f620m, (b0.n2) this.f621n, 7);
            case 8:
                return new x1((b0.b1) this.l, cVar, (b0.b) this.f620m, (Map) this.f621n, 8);
            case 9:
                return new x1((b0.d2) this.f621n, cVar, 9);
            case 10:
                return new x1((bm.p) this.l, (Function1) this.f620m, (Context) this.f621n, cVar, 10);
            case 11:
                return new x1((x80.i) this.f621n, cVar, 11);
            case 12:
                x1 x1Var5 = new x1((cb.b) this.f620m, (Context) this.f621n, cVar, 12);
                x1Var5.l = obj;
                return x1Var5;
            case 13:
                return new x1((cj.s0) this.l, (String) this.f620m, (String) this.f621n, cVar, 13);
            case 14:
                x1 x1Var6 = new x1((d8.y) this.f621n, cVar, 14);
                x1Var6.l = obj;
                return x1Var6;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                x1 x1Var7 = new x1((d8.y) this.f620m, (Function2) this.f621n, cVar);
                x1Var7.l = obj;
                return x1Var7;
            case 16:
                x1 x1Var8 = new x1((File) this.f621n, cVar, 16);
                x1Var8.l = obj;
                return x1Var8;
            case 17:
                return new x1((m3.b1) this.l, (ap.n) this.f620m, this.f619k, (m3.b1) this.f621n, cVar);
            case 18:
                return new x1((e70.c) this.l, (Function1) this.f620m, (ComponentActivity) this.f621n, cVar, 18);
            case 19:
                return new x1((hp.g) this.l, (ep.d0) this.f620m, (String) this.f621n, cVar, 19);
            case 20:
                return new x1((f0.g0) this.f621n, cVar, 20);
            case 21:
                return new x1((com.google.firebase.messaging.a0) this.l, (String) this.f620m, (f0.j0) this.f621n, cVar, 21);
            case 22:
                return new x1((f0.f2) this.l, (String) this.f620m, (f0.h) this.f621n, cVar, 22);
            case 23:
                x1 x1Var9 = new x1((fd.t) this.f620m, (td.i) this.f621n, cVar, 23);
                x1Var9.l = obj;
                return x1Var9;
            case 24:
                return new x1((PrivacyActionActivity) this.l, (String) this.f620m, (fr.i) this.f621n, cVar, 24);
            case 25:
                return new x1((gd.i) this.f620m, (gd.c) this.f621n, cVar, 25);
            case 26:
                return new x1((gl.q) this.f621n, cVar, 26);
            case 27:
                return new x1((dn.k) this.l, (fn.c) this.f620m, (m3.b1) this.f621n, cVar, 27);
            case 28:
                return new x1((go.v) this.f620m, (String) this.f621n, cVar, 28);
            default:
                x1 x1Var10 = new x1((gs.a) this.f621n, cVar, 29);
                x1Var10.l = obj;
                return x1Var10;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f618j) {
            case 0:
                return ((x1) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 1:
                return ((x1) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 2:
                return ((x1) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 3:
                return ((x1) create((y80.j) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 4:
                return ((x1) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 5:
                return ((x1) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 6:
                return ((x1) create((y80.j) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 7:
                return ((x1) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 8:
                return ((x1) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 9:
                return ((x1) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 10:
                return ((x1) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 11:
                return ((x1) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 12:
                return ((x1) create((x80.u) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 13:
                return ((x1) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 14:
                return ((x1) create((y80.j) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return ((x1) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 16:
                return ((x1) create((x80.u) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 17:
                return ((x1) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 18:
                return ((x1) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 19:
                return ((x1) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 20:
                return ((x1) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 21:
                return ((x1) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 22:
                return ((x1) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 23:
                return ((x1) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 24:
                return ((x1) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 25:
                return ((x1) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 26:
                return ((x1) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 27:
                return ((x1) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 28:
                return ((x1) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            default:
                return ((x1) create((y80.j) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:33|(1:(1:(7:37|52|(1:54)|55|(1:57)|58|59)(2:38|549))(1:39))(4:40|(0)|50|550)|43|535|44|(1:46)(1:47)|48|(7:51|52|(0)|55|(0)|58|59)|50|550) */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0264, code lost:
    
        if (r4 == r0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02cf, code lost:
    
        if (r2 == r0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0307, code lost:
    
        if (ep.d0.e(r7, r3, r0, r21) == r2) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0310, code lost:
    
        if (ep.d0.d(r7, r3, r0, r21) == r2) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0423, code lost:
    
        if (o30.e0.p(r3, r4, r21) == r0) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        if (r2.emit(r0, r21) != r4) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0566, code lost:
    
        if (y80.r.n(r10, r4, r21) != r9) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x07df, code lost:
    
        if (r3 == r2) goto L378;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x0896, code lost:
    
        if (r0 == r3) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x08ff, code lost:
    
        if (r0.emit(r3, r21) == r4) goto L441;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x0902, code lost:
    
        r3 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x0911, code lost:
    
        if (r0.emit(r5, r21) == r4) goto L441;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x0926, code lost:
    
        if (r0.emit(r3, r21) == r4) goto L441;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0661 A[Catch: all -> 0x0635, TryCatch #3 {all -> 0x0635, blocks: (B:281:0x062f, B:291:0x0659, B:293:0x0661, B:294:0x066e, B:301:0x067e, B:288:0x064b, B:303:0x0681, B:305:0x0686, B:306:0x0687, B:287:0x0646, B:295:0x066f, B:297:0x0675), top: B:527:0x0623, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x091a  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x09ee  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x09fe  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0a29  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010c  */
    /* JADX WARN: Type inference failed for: r11v12, types: [kotlin.jvm.functions.Function2, z70.i] */
    /* JADX WARN: Type inference failed for: r2v149, types: [android.hardware.camera2.CameraDevice$StateCallback, f0.h] */
    /* JADX WARN: Type inference failed for: r2v150, types: [f0.h] */
    /* JADX WARN: Type inference failed for: r2v152 */
    /* JADX WARN: Type inference failed for: r2v165 */
    /* JADX WARN: Type inference failed for: r2v166 */
    /* JADX WARN: Type inference failed for: r2v167 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v111 */
    /* JADX WARN: Type inference failed for: r3v112 */
    /* JADX WARN: Type inference failed for: r3v50, types: [x80.w] */
    /* JADX WARN: Type inference failed for: r3v52, types: [x80.i] */
    /* JADX WARN: Type inference failed for: r3v53, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v54, types: [x80.w] */
    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.jvm.functions.Function2, z70.i] */
    /* JADX WARN: Type inference failed for: r4v49, types: [dn.k] */
    /* JADX WARN: Type inference failed for: r7v0, types: [x70.c] */
    /* JADX WARN: Type inference failed for: r7v61, types: [android.hardware.camera2.CameraDevice] */
    /* JADX WARN: Type inference failed for: r7v62, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v63 */
    /* JADX WARN: Type inference failed for: r7v64 */
    /* JADX WARN: Type inference failed for: r7v72 */
    /* JADX WARN: Type inference failed for: r7v73 */
    /* JADX WARN: Type inference failed for: r7v74 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:112:0x0264 -> B:114:0x0267). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:289:0x0655 -> B:291:0x0659). Please report as a decompilation issue!!! */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.x1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x1(d8.y yVar, Function2 function2, x70.c cVar) {
        super(2, cVar);
        this.f618j = 15;
        this.f620m = yVar;
        this.f621n = (z70.i) function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x1(Object obj, Object obj2, Object obj3, x70.c cVar, int i11) {
        super(2, cVar);
        this.f618j = i11;
        this.l = obj;
        this.f620m = obj2;
        this.f621n = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x1(Object obj, Object obj2, x70.c cVar, int i11) {
        super(2, cVar);
        this.f618j = i11;
        this.f620m = obj;
        this.f621n = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x1(Object obj, x70.c cVar, int i11) {
        super(2, cVar);
        this.f618j = i11;
        this.f621n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x1(b0.b1 b1Var, x70.c cVar, Object obj, Object obj2, int i11) {
        super(2, cVar);
        this.f618j = i11;
        this.l = b1Var;
        this.f620m = obj;
        this.f621n = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x1(v80.q qVar, Function2 function2, x70.c cVar) {
        super(2, cVar);
        this.f618j = 1;
        this.f620m = qVar;
        this.f621n = (z70.i) function2;
    }
}
