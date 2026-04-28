package oq;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f32931j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f32932k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n f32933m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(n nVar, x70.c cVar) {
        super(2, cVar);
        this.f32933m = nVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        i iVar = new i(this.f32933m, cVar);
        iVar.l = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((y80.j) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b8, code lost:
    
        if (r0.emit(r3, r11) == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0  */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.l
            y80.j r0 = (y80.j) r0
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r11.f32932k
            oq.n r3 = r11.f32933m
            r4 = 4
            r5 = 3
            r6 = 0
            r7 = 2
            r8 = 1
            if (r2 == 0) goto L38
            if (r2 == r8) goto L34
            if (r2 == r7) goto L2b
            if (r2 == r5) goto L24
            if (r2 != r4) goto L1e
            ba0.g.M(r12)
            goto Lbb
        L1e:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r12)
            return r6
        L24:
            java.lang.Object r2 = r11.f32931j
            ba0.g.M(r12)
            goto L9a
        L2b:
            ba0.g.M(r12)
            u70.q r12 = (u70.q) r12
            java.lang.Object r12 = r12.f40851a
        L32:
            r2 = r12
            goto L56
        L34:
            ba0.g.M(r12)
            goto L49
        L38:
            ba0.g.M(r12)
            r11.l = r0
            r11.f32932k = r8
            oq.t r12 = oq.t.f32954a
            java.lang.Object r12 = r0.emit(r12, r11)
            if (r12 != r1) goto L49
            goto Lba
        L49:
            qq.c r12 = r3.f32942a
            r11.l = r0
            r11.f32932k = r7
            java.lang.Object r12 = r12.a(r11)
            if (r12 != r1) goto L32
            goto Lba
        L56:
            u70.o r12 = u70.q.f40850b
            boolean r12 = r2 instanceof u70.p
            if (r12 != 0) goto L9a
            r12 = r2
            com.app.tgtg.model.remote.user.response.C2CReferralResponse r12 = (com.app.tgtg.model.remote.user.response.C2CReferralResponse) r12
            qq.c r3 = r3.f32942a
            ao.g3 r3 = r3.f37234b
            com.app.tgtg.model.remote.UserSettings r3 = r3.n()
            boolean r3 = r3.getShowManufacturerItems()
            com.app.tgtg.model.remote.user.response.C2CReferralType r9 = r12.getType()
            int[] r10 = oq.h.$EnumSwitchMapping$0
            int r9 = r9.ordinal()
            r9 = r10[r9]
            if (r9 == r8) goto L87
            if (r9 == r7) goto L81
            oq.p r3 = new oq.p
            r3.<init>(r12)
            goto L8d
        L81:
            oq.r r3 = new oq.r
            r3.<init>(r12)
            goto L8d
        L87:
            oq.s r7 = new oq.s
            r7.<init>(r12, r3)
            r3 = r7
        L8d:
            r11.l = r0
            r11.f32931j = r2
            r11.f32932k = r5
            java.lang.Object r12 = r0.emit(r3, r11)
            if (r12 != r1) goto L9a
            goto Lba
        L9a:
            java.lang.Throwable r12 = u70.q.a(r2)
            if (r12 == 0) goto Lbb
            oq.q r3 = new oq.q
            boolean r12 = r12 instanceof java.net.UnknownHostException
            if (r12 == 0) goto La9
            com.app.tgtg.model.local.GenericErrors$Offline r12 = com.app.tgtg.model.local.GenericErrors.Offline.INSTANCE
            goto Lab
        La9:
            com.app.tgtg.model.local.GenericErrors$Generic r12 = com.app.tgtg.model.local.GenericErrors.Generic.INSTANCE
        Lab:
            r3.<init>(r12)
            r11.l = r6
            r11.f32931j = r2
            r11.f32932k = r4
            java.lang.Object r12 = r0.emit(r3, r11)
            if (r12 != r1) goto Lbb
        Lba:
            return r1
        Lbb:
            kotlin.Unit r12 = kotlin.Unit.f26487a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: oq.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
