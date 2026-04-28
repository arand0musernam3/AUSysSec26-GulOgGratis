package tg;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import b2.j;
import b2.l;
import b2.m;
import com.app.tgtg.feature.locationpicker.newlocationpicker.NewLocationPicker;
import com.app.tgtg.model.local.BasketManager;
import com.app.tgtg.model.remote.item.LatLngInfo;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.ItemType;
import com.app.tgtg.model.remote.order.OrderRatingItem;
import com.app.tgtg.model.remote.payment.PaymentMethods;
import com.app.tgtg.model.remote.user.response.Address;
import com.braze.h2;
import f2.c0;
import g3.w6;
import i80.n;
import i80.o;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.i1;
import m3.t1;
import org.bouncycastle.iana.AEADAlgorithm;
import ti.s;
import um.u;
import v1.j1;
import v1.l1;
import v80.r0;
import w4.y;
import x2.w;
import x80.x;
import xj.k;
import y9.e0;
import y9.p0;
import z1.b0;
import z1.d1;
import z1.f0;
import z1.g0;
import z1.g1;
import z1.k1;
import z1.q2;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f40156j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f40157k;
    public Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f40158m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f40159n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(n nVar, x70.c cVar, r rVar) {
        super(2, cVar);
        this.f40156j = 23;
        this.f40158m = (z70.i) nVar;
        this.f40159n = rVar;
    }

    private final Object a(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f40157k;
        if (i11 == 0) {
            ba0.g.M(obj);
            g0 g0Var = (g0) this.l;
            l1 l1Var = g0Var.f46516c;
            f0 f0Var = g0Var.f46515b;
            j1 j1Var = (j1) this.f40158m;
            g gVar = new g(g0Var, (Function2) this.f40159n, null, 26);
            this.f40157k = 1;
            l1Var.getClass();
            if (v80.f0.n(new qj.g(j1Var, l1Var, gVar, f0Var, null), this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba0.g.M(obj);
        }
        return Unit.f26487a;
    }

    private final Object b(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f40157k;
        if (i11 == 0) {
            ba0.g.M(obj);
            b0 b0Var = (b0) this.l;
            d1 d1Var = (d1) this.f40158m;
            xq.a aVar2 = new xq.a(9, b0Var, (k1) this.f40159n);
            this.f40157k = 1;
            if (d1Var.invoke(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba0.g.M(obj);
        }
        return Unit.f26487a;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [i80.n, z70.i] */
    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f40156j) {
            case 0:
                return new g((i) this.l, (String) this.f40158m, (Address) this.f40159n, cVar, 0);
            case 1:
                return new g((s) this.f40159n, cVar, 1);
            case 2:
                return new g((u9.a) this.l, (Uri) this.f40158m, (InputEvent) this.f40159n, cVar, 2);
            case 3:
                return new g((LatLngInfo) this.l, (LatLngInfo) this.f40158m, (uk.r) this.f40159n, cVar, 3);
            case 4:
                return new g((l) this.l, (m) this.f40158m, (r0) this.f40159n, cVar, 4);
            case 5:
                return new g((l) this.l, (j) this.f40158m, (r0) this.f40159n, cVar, 5);
            case 6:
                return new g((BasketManager) this.l, (u) this.f40158m, (i1) this.f40159n, cVar, 6);
            case 7:
                return new g((w) this.l, (y) this.f40158m, (us.j) this.f40159n, cVar, 7);
            case 8:
                return new g((CoroutineContext) this.l, (y80.i) this.f40158m, (t1) this.f40159n, cVar, 8);
            case 9:
                g gVar = new g((x) this.f40158m, this.f40159n, cVar, 9);
                gVar.l = obj;
                return gVar;
            case 10:
                return new g((k) this.l, (String) this.f40158m, (List) this.f40159n, cVar, 10);
            case 11:
                return new g((k) this.f40158m, (BasicItem) this.f40159n, cVar, 11);
            case 12:
                return new g((k) this.f40158m, (BasicItem) this.f40159n, cVar, 12);
            case 13:
                g gVar2 = new g((p0) this.f40159n, cVar, 13);
                gVar2.f40158m = obj;
                return gVar2;
            case 14:
                return new g((ye.b) this.f40158m, (ye.b0) this.f40159n, cVar, 14);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new g((yi.f0) this.l, (PaymentMethods) this.f40158m, (Executor) this.f40159n, cVar, 15);
            case 16:
                return new g((c0) this.l, (k) this.f40158m, (Context) this.f40159n, cVar, 16);
            case 17:
                return new g((i) this.l, (w6) this.f40158m, (NewLocationPicker) this.f40159n, cVar, 17);
            case 18:
                return new g((yl.i) this.l, (Function1) this.f40158m, (Context) this.f40159n, cVar, 18);
            case 19:
                return new g((ym.w) this.l, (String) this.f40158m, (OrderRatingItem) this.f40159n, cVar, 19);
            case 20:
                return new g((yo.d) this.l, (List) this.f40158m, (ItemType) this.f40159n, cVar, 20);
            case 21:
                g gVar3 = new g((ys.a) this.f40159n, cVar, 21);
                gVar3.f40158m = obj;
                return gVar3;
            case 22:
                return new g((Function2) this.l, this.f40158m, (v80.b0) this.f40159n, cVar, 22);
            case 23:
                g gVar4 = new g((n) this.f40158m, cVar, (r) this.f40159n);
                gVar4.l = obj;
                return gVar4;
            case 24:
                g gVar5 = new g((o) this.f40158m, (r) this.f40159n, cVar, 24);
                gVar5.l = obj;
                return gVar5;
            case 25:
                return new g((z1.c0) this.l, (j1) this.f40158m, (g) this.f40159n, cVar, 25);
            case 26:
                g gVar6 = new g((g0) this.f40158m, (Function2) this.f40159n, cVar, 26);
                gVar6.l = obj;
                return gVar6;
            case 27:
                return new g((g0) this.l, (j1) this.f40158m, (Function2) this.f40159n, cVar, 27);
            case 28:
                g gVar7 = new g((d1) this.f40158m, (k1) this.f40159n, cVar, 28);
                gVar7.l = obj;
                return gVar7;
            default:
                g gVar8 = new g((k1) this.f40158m, (z1.p0) this.f40159n, cVar, 29);
                gVar8.l = obj;
                return gVar8;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f40156j) {
            case 0:
                return ((g) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 1:
                return ((g) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 2:
                return ((g) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 3:
                return ((g) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 4:
                return ((g) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 5:
                return ((g) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 6:
                return ((g) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 7:
                return ((g) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 8:
                return ((g) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 9:
                return ((g) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 10:
                return ((g) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 11:
                return ((g) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 12:
                return ((g) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 13:
                return ((g) create((e0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 14:
                return ((g) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return ((g) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 16:
                return ((g) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 17:
                return ((g) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 18:
                return ((g) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 19:
                return ((g) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 20:
                return ((g) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 21:
                return ((g) create((y80.j) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 22:
                return ((g) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 23:
                return ((g) create((g1) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 24:
                return ((g) create((Pair) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 25:
                return ((g) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 26:
                return ((g) create((q2) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 27:
                return ((g) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 28:
                return ((g) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            default:
                return ((g) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:188:0x03f5, code lost:
    
        if (r7.m(r23) == r3) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x060a, code lost:
    
        if (kotlin.Unit.f26487a != r7) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0692, code lost:
    
        if (kotlin.Unit.f26487a == r6) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x078b, code lost:
    
        if (r2.collect(r3, r23) == r4) goto L372;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x079a, code lost:
    
        if (v80.f0.K(r3, r5, r23) == r4) goto L372;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0b32, code lost:
    
        if (r2.emit(r3, r23) == r5) goto L497;
     */
    /* JADX WARN: Code restructure failed: missing block: B:594:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01c2, code lost:
    
        if (r0.emit(r3, r23) == r2) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0439 A[PHI: r0 r5
      0x0439: PHI (r0v88 java.lang.Object) = (r0v94 java.lang.Object), (r0v97 java.lang.Object) binds: [B:192:0x0436, B:185:0x03db] A[DONT_GENERATE, DONT_INLINE]
      0x0439: PHI (r5v33 x80.b) = (r5v34 x80.b), (r5v35 x80.b) binds: [B:192:0x0436, B:185:0x03db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x04f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v76, types: [i80.n, z70.i] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:197:0x044f -> B:191:0x042e). Please report as a decompilation issue!!! */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3058
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, Object obj2, Object obj3, x70.c cVar, int i11) {
        super(2, cVar);
        this.f40156j = i11;
        this.l = obj;
        this.f40158m = obj2;
        this.f40159n = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, Object obj2, x70.c cVar, int i11) {
        super(2, cVar);
        this.f40156j = i11;
        this.f40158m = obj;
        this.f40159n = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, x70.c cVar, int i11) {
        super(2, cVar);
        this.f40156j = i11;
        this.f40159n = obj;
    }
}
