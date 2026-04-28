package mn;

import android.app.Activity;
import android.widget.LinearLayout;
import ao.c0;
import c5.t1;
import com.app.tgtg.feature.orderview.surprisebag.SurpriseBagOrderActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.contactus.ContactUsViewModel;
import com.app.tgtg.model.remote.brief.BriefOrder;
import com.app.tgtg.model.remote.profile.response.ProfileFeatureType;
import com.app.tgtg.model.remote.support.response.ConsumerRefundChoiceRequest;
import com.braze.h2;
import g3.w6;
import i2.e0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m3.b1;
import mr.r;
import no.m0;
import of.v;
import org.bouncycastle.iana.AEADAlgorithm;
import pg.y2;
import pi.m;
import ss.g1;
import ss.w0;
import ti.s;
import u70.o;
import u70.p;
import u70.q;
import v80.b0;
import x80.u;
import z4.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f30010j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f30011k;
    public Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f30012m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, Object obj2, x70.c cVar, int i11) {
        super(2, cVar);
        this.f30010j = i11;
        this.l = obj;
        this.f30012m = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b4, code lost:
    
        if (r0.emit(r1, r11) == r3) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f30012m
            si.b r0 = (si.b) r0
            y80.a2 r1 = r0.f39031b
            m3.h1 r2 = r0.f39034e
            y70.a r3 = y70.a.COROUTINE_SUSPENDED
            int r4 = r11.f30011k
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L28
            if (r4 == r6) goto L20
            if (r4 != r5) goto L19
            ba0.g.M(r12)
            goto Lb7
        L19:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r12)
            r12 = 0
            return r12
        L20:
            ba0.g.M(r12)
            u70.q r12 = (u70.q) r12
            java.lang.Object r12 = r12.f40851a
            goto L3b
        L28:
            ba0.g.M(r12)
            w2.z r12 = r0.f39030a
            int r4 = r2.h()
            r11.f30011k = r6
            java.lang.Object r12 = r12.A(r4, r11)
            if (r12 != r3) goto L3b
            goto Lb6
        L3b:
            u70.o r4 = u70.q.f40850b
            boolean r4 = r12 instanceof u70.p
            if (r4 != 0) goto La2
            r4 = r12
            com.app.tgtg.model.remote.order.response.CharityOrderHistoryResponse r4 = (com.app.tgtg.model.remote.order.response.CharityOrderHistoryResponse) r4
            java.util.List r7 = r4.getData()
            java.util.Iterator r7 = r7.iterator()
        L4c:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L82
            java.lang.Object r8 = r7.next()
            com.app.tgtg.model.remote.order.response.OrdersData r8 = (com.app.tgtg.model.remote.order.response.OrdersData) r8
            java.lang.Object r9 = r1.getValue()
            java.util.HashMap r9 = (java.util.HashMap) r9
            java.lang.String r10 = r8.getPeriod()
            java.lang.Object r9 = r9.get(r10)
            java.util.List r9 = (java.util.List) r9
            if (r9 != 0) goto L6c
            kotlin.collections.n0 r9 = kotlin.collections.n0.f26529a
        L6c:
            java.util.List r10 = r8.getOrders()
            java.util.ArrayList r9 = kotlin.collections.CollectionsKt.d0(r10, r9)
            java.lang.Object r10 = r1.getValue()
            java.util.Map r10 = (java.util.Map) r10
            java.lang.String r8 = r8.getPeriod()
            r10.put(r8, r9)
            goto L4c
        L82:
            com.app.tgtg.model.remote.user.response.ItemsListPaging r1 = r4.getPaging()
            int r1 = r1.getPage()
            int r1 = r1 + r6
            r2.i(r1)
            com.app.tgtg.model.remote.user.response.ItemsListPaging r1 = r4.getPaging()
            int r1 = r1.getTotalPages()
            m3.h1 r2 = r0.f39035f
            r2.i(r1)
            m3.k1 r1 = r0.f39033d
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.setValue(r2)
        La2:
            java.lang.Throwable r1 = u70.q.a(r12)
            if (r1 == 0) goto Lb7
            y80.m1 r0 = r0.f39036g
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r11.l = r12
            r11.f30011k = r5
            java.lang.Object r12 = r0.emit(r1, r11)
            if (r12 != r3) goto Lb7
        Lb6:
            return r3
        Lb7:
            kotlin.Unit r12 = kotlin.Unit.f26487a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: mn.g.a(java.lang.Object):java.lang.Object");
    }

    private final Object b(Object obj) {
        Object objE;
        ContactUsViewModel contactUsViewModel = (ContactUsViewModel) this.l;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f30011k;
        if (i11 == 0) {
            ba0.g.M(obj);
            c0 c0Var = contactUsViewModel.f9385e;
            ConsumerRefundChoiceRequest consumerRefundChoiceRequest = (ConsumerRefundChoiceRequest) this.f30012m;
            this.f30011k = 1;
            objE = c0Var.e(consumerRefundChoiceRequest, this);
            if (objE == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba0.g.M(obj);
            objE = ((q) obj).f40851a;
        }
        o oVar = q.f40850b;
        if (!(objE instanceof p)) {
            contactUsViewModel.e().k(Boolean.FALSE);
            ((av.e) contactUsViewModel.f9398s.getValue()).k(sr.f.EMAIL_CONFIRMED);
        }
        Throwable thA = q.a(objE);
        if (thA != null) {
            contactUsViewModel.e().k(Boolean.FALSE);
            contactUsViewModel.c().k(thA);
        }
        return Unit.f26487a;
    }

    private final Object c(Object obj) {
        y80.j jVar = (y80.j) this.l;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f30011k;
        if (i11 == 0) {
            ba0.g.M(obj);
            this.l = null;
            this.f30011k = 1;
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
        w0 w0Var = (w0) this.f30012m;
        w0Var.f39263c.i(new ts.h(null, w0Var.f39266f, false));
        return Unit.f26487a;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f30010j) {
            case 0:
                return new g((l) this.l, (ProfileFeatureType) this.f30012m, cVar, 0);
            case 1:
                return new g((r) this.l, (or.f) this.f30012m, cVar, 1);
            case 2:
                return new g((r) this.l, (mr.c) this.f30012m, cVar, 2);
            case 3:
                return new g((r) this.l, (Runnable) this.f30012m, cVar, 3);
            case 4:
                g gVar = new g((nb.b) this.f30012m, cVar, 4);
                gVar.l = obj;
                return gVar;
            case 5:
                return new g((ye.b) this.l, (ye.b) this.f30012m, cVar, 5);
            case 6:
                return new g((ni.e) this.l, (Function0) this.f30012m, cVar, 6);
            case 7:
                return new g((b1) this.l, (SurpriseBagOrderActivity) this.f30012m, cVar, 7);
            case 8:
                return new g((m0) this.l, (Activity) this.f30012m, cVar, 8);
            case 9:
                return new g((m0) this.l, (BriefOrder) this.f30012m, cVar, 9);
            case 10:
                return new g((np.b) this.l, (op.c) this.f30012m, cVar, 10);
            case 11:
                g gVar2 = new g((of.l) this.f30012m, cVar, 11);
                gVar2.l = obj;
                return gVar2;
            case 12:
                g gVar3 = new g((v) this.f30012m, cVar, 12);
                gVar3.l = obj;
                return gVar3;
            case 13:
                return new g((LinearLayout) this.l, (y2) this.f30012m, cVar, 13);
            case 14:
                g gVar4 = new g((pd.o) this.f30012m, cVar, 14);
                gVar4.l = obj;
                return gVar4;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new g((e0) this.l, (m) this.f30012m, cVar, 15);
            case 16:
                return new g((Long) this.l, (f2.c0) this.f30012m, cVar, 16);
            case 17:
                g gVar5 = new g((qf.a) this.f30012m, cVar, 17);
                gVar5.l = obj;
                return gVar5;
            case 18:
                return new g((w6) this.l, (m1.a) this.f30012m, cVar, 18);
            case 19:
                return new g((t1) this.l, (b1) this.f30012m, cVar, 19);
            case 20:
                return new g((t1) this.l, (String) this.f30012m, cVar, 20);
            case 21:
                return new g((z) this.l, (b1) this.f30012m, cVar, 21);
            case 22:
                return new g((w6) this.l, (t5.a) this.f30012m, cVar, 22);
            case 23:
                return new g((sf.b) this.l, (pf.a) this.f30012m, cVar, 23);
            case 24:
                return new g((si.b) this.l, (Activity) this.f30012m, cVar, 24);
            case 25:
                return new g((f2.c0) this.l, (si.b) this.f30012m, cVar, 25);
            case 26:
                return new g((si.b) this.f30012m, cVar, 26);
            case 27:
                return new g((ContactUsViewModel) this.l, (ConsumerRefundChoiceRequest) this.f30012m, cVar, 27);
            case 28:
                g gVar6 = new g((w0) this.f30012m, cVar, 28);
                gVar6.l = obj;
                return gVar6;
            default:
                return new g((s) this.l, (Activity) this.f30012m, cVar, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f30010j) {
            case 0:
                return ((g) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 1:
                return ((g) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 2:
                return ((g) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 3:
                return ((g) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 4:
                return ((g) create((u) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 5:
                return ((g) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 6:
                return ((g) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 7:
                return ((g) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 8:
                return ((g) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 9:
                return ((g) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 10:
                return ((g) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 11:
                return ((g) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 12:
                return ((g) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 13:
                return ((g) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 14:
                return ((g) create((pd.r) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return ((g) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 16:
                return ((g) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 17:
                return ((g) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 18:
                return ((g) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 19:
                return ((g) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 20:
                return ((g) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 21:
                return ((g) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 22:
                return ((g) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 23:
                return ((g) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 24:
                return ((g) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 25:
                return ((g) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 26:
                return ((g) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 27:
                return ((g) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 28:
                return ((g) create((y80.j) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            default:
                return ((g) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:250:0x0522, code lost:
    
        if (r0 == r2) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x066a, code lost:
    
        if (v80.f0.o(zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView.NEW_MESSAGE_VIEW_DELAY, r17) == r0) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x07dc, code lost:
    
        if (mr.r.c(r1, r17) == r0) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x0911, code lost:
    
        if (r0.a(r17) == r2) goto L447;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0142, code lost:
    
        if (v80.f0.o(250, r17) == r0) goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04e5 A[Catch: Exception -> 0x04bb, CancellationException -> 0x04be, TRY_ENTER, TryCatch #7 {CancellationException -> 0x04be, Exception -> 0x04bb, blocks: (B:226:0x04b4, B:252:0x0526, B:254:0x052a, B:239:0x04e5, B:241:0x04ef, B:244:0x04ff, B:246:0x0503, B:248:0x050b, B:249:0x050f, B:255:0x052e, B:257:0x0534, B:259:0x053c, B:234:0x04cd), top: B:455:0x04a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0503 A[Catch: Exception -> 0x04bb, CancellationException -> 0x04be, TryCatch #7 {CancellationException -> 0x04be, Exception -> 0x04bb, blocks: (B:226:0x04b4, B:252:0x0526, B:254:0x052a, B:239:0x04e5, B:241:0x04ef, B:244:0x04ff, B:246:0x0503, B:248:0x050b, B:249:0x050f, B:255:0x052e, B:257:0x0534, B:259:0x053c, B:234:0x04cd), top: B:455:0x04a9 }] */
    /* JADX WARN: Type inference failed for: r9v0, types: [x70.c] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v67 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:191:0x0425 -> B:185:0x03fe). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:247:0x0509 -> B:237:0x04df). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:248:0x050b -> B:237:0x04df). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:250:0x0522 -> B:252:0x0526). Please report as a decompilation issue!!! */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 2390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mn.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, x70.c cVar, int i11) {
        super(2, cVar);
        this.f30010j = i11;
        this.f30012m = obj;
    }
}
