package h2;

import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.order.OrderRatingItem;
import com.app.tgtg.model.remote.profile.response.ProfileScreenResponse;
import g3.ea;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.a2;
import org.bouncycastle.iana.AEADAlgorithm;
import v1.y1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f21028j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f21029k;
    public Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f21030m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f21031n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a0(Function2 function2, Function1 function1, Function0 function0, x70.c cVar) {
        super(2, cVar);
        this.f21028j = 26;
        this.l = (z70.i) function2;
        this.f21030m = function1;
        this.f21031n = function0;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.l
            mr.r r0 = (mr.r) r0
            androidx.lifecycle.o0 r1 = r0.f30115g
            y70.a r2 = y70.a.COROUTINE_SUSPENDED
            int r3 = r6.f21029k
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L1e
            if (r3 != r4) goto L18
            ba0.g.M(r7)
            u70.q r7 = (u70.q) r7
            java.lang.Object r7 = r7.f40851a
            goto L30
        L18:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            return r5
        L1e:
            ba0.g.M(r7)
            ao.g3 r7 = r0.f30110b
            java.lang.Object r0 = r6.f21030m
            java.lang.String r0 = (java.lang.String) r0
            r6.f21029k = r4
            java.lang.Object r7 = r7.q(r0, r6)
            if (r7 != r2) goto L30
            return r2
        L30:
            java.lang.Object r0 = r6.f21031n
            or.b r0 = (or.b) r0
            u70.o r2 = u70.q.f40850b
            boolean r2 = r7 instanceof u70.p
            if (r2 != 0) goto L45
            r2 = r7
            q90.r0 r2 = (q90.r0) r2
            or.c r2 = new or.c
            r2.<init>(r4, r0)
            r1.i(r2)
        L45:
            java.lang.Throwable r7 = u70.q.a(r7)
            if (r7 == 0) goto L83
            boolean r0 = r7 instanceof retrofit2.HttpException
            if (r0 == 0) goto L53
            r0 = r7
            retrofit2.HttpException r0 = (retrofit2.HttpException) r0
            goto L54
        L53:
            r0 = r5
        L54:
            if (r0 == 0) goto L5d
            int r0 = r0.f37956a
            r2 = 400(0x190, float:5.6E-43)
            if (r0 != r2) goto L5d
            goto L74
        L5d:
            boolean r0 = r7 instanceof qg.a
            if (r0 == 0) goto L65
            r0 = r7
            qg.a r0 = (qg.a) r0
            goto L66
        L65:
            r0 = r5
        L66:
            if (r0 == 0) goto L6b
            java.lang.String r0 = r0.f37046a
            goto L6c
        L6b:
            r0 = r5
        L6c:
            java.lang.String r2 = "INVALID_EMAIL_CHANGE_REQUEST"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r0 == 0) goto L7e
        L74:
            or.c r7 = new or.c
            r0 = 0
            r7.<init>(r0, r5)
            r1.i(r7)
            goto L83
        L7e:
            mv.m0 r0 = sa0.a.f38953a
            r0.j(r7)
        L83:
            kotlin.Unit r7 = kotlin.Unit.f26487a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.a0.a(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
    
        if (r1.emit((q90.r0) r10, r9) == r2) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f21031n
            com.app.tgtg.model.remote.item.response.BasicItem r0 = (com.app.tgtg.model.remote.item.response.BasicItem) r0
            java.lang.Object r1 = r9.l
            y80.j r1 = (y80.j) r1
            y70.a r2 = y70.a.COROUTINE_SUSPENDED
            int r3 = r9.f21029k
            r4 = 2
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L24
            if (r3 == r6) goto L20
            if (r3 != r4) goto L19
            ba0.g.M(r10)
            goto L61
        L19:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r10)
            r10 = 0
            return r10
        L20:
            ba0.g.M(r10)
            goto L54
        L24:
            ba0.g.M(r10)
            java.lang.Object r10 = r9.f21030m
            nh.b r10 = (nh.b) r10
            mh.a r10 = r10.f30852b
            com.app.tgtg.model.remote.item.BasicItemInformation r3 = r0.getInformation()
            java.lang.String r3 = r3.mo340getItemIdFvU5WIY()
            com.app.tgtg.model.remote.item.requests.SetFavoriteRequest r7 = new com.app.tgtg.model.remote.item.requests.SetFavoriteRequest
            boolean r8 = r0.getFavorite()
            r8 = r8 ^ r6
            com.app.tgtg.model.remote.item.StoreInformation r0 = mv.d.m(r0)
            java.lang.String r0 = r0.m370getStoreId7QsYvu8()
            r7.<init>(r8, r0, r5)
            r9.l = r1
            r9.f21029k = r6
            mh.b r10 = r10.f29958a
            java.lang.Object r10 = r10.a(r3, r7, r9)
            if (r10 != r2) goto L54
            goto L60
        L54:
            q90.r0 r10 = (q90.r0) r10
            r9.l = r5
            r9.f21029k = r4
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r2) goto L61
        L60:
            return r2
        L61:
            kotlin.Unit r10 = kotlin.Unit.f26487a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.a0.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (r1.emit(r3, r7) == r2) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f21031n
            nj.t r0 = (nj.t) r0
            java.lang.Object r1 = r7.f21030m
            y80.j r1 = (y80.j) r1
            y70.a r2 = y70.a.COROUTINE_SUSPENDED
            int r3 = r7.f21029k
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L28
            if (r3 == r5) goto L20
            if (r3 != r4) goto L19
            ba0.g.M(r8)
            goto L67
        L19:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L20:
            java.lang.Object r3 = r7.l
            nj.w r3 = (nj.w) r3
            ba0.g.M(r8)
            goto L4e
        L28:
            ba0.g.M(r8)
            y80.a2 r8 = r0.f30956h
            java.lang.Object r8 = r8.getValue()
            boolean r3 = r8 instanceof nj.w
            if (r3 == 0) goto L39
            nj.w r8 = (nj.w) r8
            r3 = r8
            goto L3a
        L39:
            r3 = r6
        L3a:
            if (r3 != 0) goto L3f
            kotlin.Unit r8 = kotlin.Unit.f26487a
            return r8
        L3f:
            dv.d r8 = dv.d.DISMISSED
            r7.f21030m = r1
            r7.l = r3
            r7.f21029k = r5
            java.lang.Object r8 = nj.t.b(r0, r3, r8, r7)
            if (r8 != r2) goto L4e
            goto L66
        L4e:
            nj.u r8 = r0.f30952d
            f70.g r8 = r8.f30957a
            f70.a r0 = new f70.a
            r0.<init>()
            r8.a(r0)
            r7.f21030m = r6
            r7.l = r6
            r7.f21029k = r4
            java.lang.Object r8 = r1.emit(r3, r7)
            if (r8 != r2) goto L67
        L66:
            return r2
        L67:
            kotlin.Unit r8 = kotlin.Unit.f26487a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.a0.c(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.jvm.functions.Function2, z70.i] */
    /* JADX WARN: Type inference failed for: r0v24, types: [kotlin.jvm.functions.Function2, z70.i] */
    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f21028j) {
            case 0:
                return new a0((b0) this.l, (t1.x) this.f21030m, (l4.b) this.f21031n, cVar, 0);
            case 1:
                a0 a0Var = new a0((hh.a) this.f21031n, cVar, 1);
                a0Var.f21030m = obj;
                return a0Var;
            case 2:
                return new a0((hm.v) this.f21030m, (String) this.f21031n, cVar, 2);
            case 3:
                return new a0((hm.v) this.l, (String) this.f21030m, (hb0.o) this.f21031n, cVar, 3);
            case 4:
                return new a0((hm.v) this.l, (Activity) this.f21030m, (hm.f) this.f21031n, cVar, 4);
            case 5:
                return new a0((hm.v) this.f21030m, (String) this.f21031n, cVar, 5);
            case 6:
                return new a0((hr.i) this.l, (Activity) this.f21030m, (hr.b) this.f21031n, cVar, 6);
            case 7:
                return new a0((y80.f1) this.f21030m, (ea) this.f21031n, cVar, 7);
            case 8:
                return new a0((g4.z) this.l, (m3.b1) this.f21030m, (ea) this.f21031n, cVar, 8);
            case 9:
                return new a0((t1.y0) this.l, (m3.b1) this.f21030m, (m3.g1) this.f21031n, cVar, 9);
            case 10:
                a0 a0Var2 = new a0((Function2) this.f21030m, (e6.i) this.f21031n, cVar);
                a0Var2.l = obj;
                return a0Var2;
            case 11:
                return new a0((y1) this.l, (Function0) this.f21030m, (m3.b1) this.f21031n, cVar, 11);
            case 12:
                a0 a0Var3 = new a0((Function2) this.f21030m, (m1.i) this.f21031n, cVar, 12);
                a0Var3.l = obj;
                return a0Var3;
            case 13:
                return new a0((j2.g) this.l, (b5.s1) this.f21030m, (b5.r1) this.f21031n, cVar, 13);
            case 14:
                return new a0((jb.d0) this.l, (ib.v) this.f21030m, (rb.o) this.f21031n, cVar, 14);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                a0 a0Var4 = new a0((k1.b) this.f21030m, (k1.c) this.f21031n, cVar, 15);
                a0Var4.l = obj;
                return a0Var4;
            case 16:
                return new a0((k40.b) this.l, (h8.e) this.f21030m, (Long) this.f21031n, cVar, 16);
            case 17:
                return new a0((Function2) this.l, (v2.h) this.f21030m, (m3.i1) this.f21031n, cVar, 17);
            case 18:
                return new a0((lo.m) this.l, (String) this.f21030m, (OrderRatingItem) this.f21031n, cVar, 18);
            case 19:
                return new a0((mp.c) this.l, (LifecycleOwner) this.f21030m, (z3.r) this.f21031n, cVar, 19);
            case 20:
                a0 a0Var5 = new a0((a2) this.f21030m, (m3.x0) this.f21031n, cVar, 20);
                a0Var5.l = obj;
                return a0Var5;
            case 21:
                a0 a0Var6 = new a0((CoroutineContext) this.f21030m, (y80.i) this.f21031n, cVar, 21);
                a0Var6.l = obj;
                return a0Var6;
            case 22:
                a0 a0Var7 = new a0((ib.e) this.f21030m, (mb.e) this.f21031n, cVar, 22);
                a0Var7.l = obj;
                return a0Var7;
            case 23:
                return new a0((ax.g0) this.l, (qb.o) this.f21030m, (mb.g) this.f21031n, cVar, 23);
            case 24:
                a0 a0Var8 = new a0((ProfileScreenResponse) this.f21030m, (mn.l) this.f21031n, cVar, 24);
                a0Var8.l = obj;
                return a0Var8;
            case 25:
                return new a0((mr.r) this.l, (String) this.f21030m, (or.b) this.f21031n, cVar, 25);
            case 26:
                return new a0((Function2) this.l, (Function1) this.f21030m, (Function0) this.f21031n, cVar);
            case 27:
                a0 a0Var9 = new a0((nh.b) this.f21030m, (BasicItem) this.f21031n, cVar, 27);
                a0Var9.l = obj;
                return a0Var9;
            case 28:
                a0 a0Var10 = new a0((nj.t) this.f21031n, cVar, 28);
                a0Var10.f21030m = obj;
                return a0Var10;
            default:
                a0 a0Var11 = new a0((nj.t) this.f21030m, (nj.a) this.f21031n, cVar, 29);
                a0Var11.l = obj;
                return a0Var11;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f21028j) {
        }
        return ((a0) create((y80.j) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x037c, code lost:
    
        if (r0.collect(r1, r19) == r2) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x038a, code lost:
    
        if (v80.f0.K(r1, r4, r19) == r2) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0505, code lost:
    
        if (r3.invokeSuspend(kotlin.Unit.f26487a) == r1) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0091, code lost:
    
        if (r0 == r6) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x0847, code lost:
    
        if (y80.r.i(r1, r0, r19) == r3) goto L397;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x08c0, code lost:
    
        if (kotlin.Unit.f26487a != r11) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x0921, code lost:
    
        if (r0 == r2) goto L440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0a2b, code lost:
    
        if (r0.emit(r2, r19) == r1) goto L495;
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0133, code lost:
    
        if (kotlin.Unit.f26487a == r3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0663  */
    /* JADX WARN: Type inference failed for: r1v94, types: [kotlin.jvm.functions.Function2, z70.i] */
    /* JADX WARN: Type inference failed for: r3v25, types: [kotlin.jvm.functions.Function2, z70.i] */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.a0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(Object obj, Object obj2, x70.c cVar, int i11) {
        super(2, cVar);
        this.f21028j = i11;
        this.f21030m = obj;
        this.f21031n = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(Object obj, x70.c cVar, int i11) {
        super(2, cVar);
        this.f21028j = i11;
        this.f21031n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a0(Function2 function2, e6.i iVar, x70.c cVar) {
        super(2, cVar);
        this.f21028j = 10;
        this.f21030m = (z70.i) function2;
        this.f21031n = iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(Object obj, Object obj2, Object obj3, x70.c cVar, int i11) {
        super(2, cVar);
        this.f21028j = i11;
        this.l = obj;
        this.f21030m = obj2;
        this.f21031n = obj3;
    }
}
