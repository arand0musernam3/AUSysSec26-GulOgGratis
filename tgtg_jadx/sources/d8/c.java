package d8;

import android.app.Application;
import android.content.Context;
import com.app.tgtg.model.local.BasketManager;
import com.app.tgtg.model.local.GenericErrors;
import com.app.tgtg.model.remote.item.response.BasicItem;
import f0.f4;
import f0.q3;
import g3.d7;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.iana.AEADAlgorithm;
import v1.y1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f14582j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14583k;
    public Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f14584m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(Function2 function2, b bVar, x70.c cVar) {
        super(2, cVar);
        this.f14582j = 2;
        this.l = (z70.i) function2;
        this.f14584m = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.l
            g3.d7 r0 = (g3.d7) r0
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r12.f14583k
            r3 = 1
            if (r2 == 0) goto L19
            if (r2 != r3) goto L12
            ba0.g.M(r13)
            goto L86
        L12:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r13)
        L17:
            r13 = 0
            return r13
        L19:
            ba0.g.M(r13)
            if (r0 == 0) goto L89
            g3.e7 r13 = r0.f18461a
            g3.a7 r2 = r13.f18540d
            java.lang.String r13 = r13.f18538b
            if (r13 == 0) goto L28
            r13 = r3
            goto L29
        L28:
            r13 = 0
        L29:
            java.lang.Object r4 = r12.f14584m
            c5.g r4 = (c5.g) r4
            int[] r5 = g3.c7.$EnumSwitchMapping$0
            int r2 = r2.ordinal()
            r2 = r5[r2]
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r7 = 3
            if (r2 == r3) goto L4c
            r8 = 2
            if (r2 == r8) goto L49
            if (r2 != r7) goto L45
            r8 = 4000(0xfa0, double:1.9763E-320)
            goto L4d
        L45:
            e40.a.f()
            goto L17
        L49:
            r8 = 10000(0x2710, double:4.9407E-320)
            goto L4d
        L4c:
            r8 = r5
        L4d:
            if (r4 != 0) goto L50
            goto L7d
        L50:
            c5.h r4 = (c5.h) r4
            android.view.accessibility.AccessibilityManager r2 = r4.f7243a
            r10 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 < 0) goto L5c
            goto L7b
        L5c:
            if (r13 == 0) goto L5f
            r7 = 7
        L5f:
            int r4 = android.os.Build.VERSION.SDK_INT
            r10 = 29
            if (r4 < r10) goto L72
            int r13 = (int) r8
            int r13 = c5.k1.a(r2, r13, r7)
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r13 != r2) goto L70
            goto L7c
        L70:
            long r5 = (long) r13
            goto L7c
        L72:
            if (r13 == 0) goto L7b
            boolean r13 = r2.isTouchExplorationEnabled()
            if (r13 == 0) goto L7b
            goto L7c
        L7b:
            r5 = r8
        L7c:
            r8 = r5
        L7d:
            r12.f14583k = r3
            java.lang.Object r13 = v80.f0.o(r8, r12)
            if (r13 != r1) goto L86
            return r1
        L86:
            r0.a()
        L89:
            kotlin.Unit r13 = kotlin.Unit.f26487a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.c.a(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [kotlin.jvm.functions.Function2, z70.i] */
    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f14582j) {
            case 0:
                c cVar2 = new c((List) this.f14584m, cVar, 0);
                cVar2.l = obj;
                return cVar2;
            case 1:
                return new c((y) this.l, (l0) this.f14584m, cVar, 1);
            case 2:
                return new c((Function2) this.l, (b) this.f14584m, cVar);
            case 3:
                c cVar3 = new c((y) this.f14584m, cVar, 3);
                cVar3.l = obj;
                return cVar3;
            case 4:
                return new c((com.google.firebase.messaging.a0) this.f14584m, cVar, 4);
            case 5:
                return new c((Function1) this.f14584m, cVar, (y9.v) this.l);
            case 6:
                return new c((dk.f) this.l, (BasicItem) this.f14584m, cVar, 6);
            case 7:
                return new c((gj.c0) this.l, (y1) this.f14584m, cVar, 7);
            case 8:
                return new c((en.o) this.l, (BasketManager) this.f14584m, cVar, 8);
            case 9:
                return new c((LinkedHashSet) this.l, (en.o) this.f14584m, cVar, 9);
            case 10:
                return new c((ep.d0) this.l, (g9.f0) this.f14584m, cVar, 10);
            case 11:
                return new c((ep.d0) this.l, (hp.g) this.f14584m, cVar, 11);
            case 12:
                return new c((ep.d0) this.l, (GenericErrors) this.f14584m, cVar, 12);
            case 13:
                return new c((ep.d0) this.l, (ib.a0) this.f14584m, cVar, 13);
            case 14:
                return new c((ep.d0) this.l, (String) this.f14584m, cVar, 14);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                c cVar4 = new c((com.google.firebase.messaging.a0) this.f14584m, cVar, 15);
                cVar4.l = obj;
                return cVar4;
            case 16:
                c cVar5 = new c((f0.v0) this.f14584m, cVar, 16);
                cVar5.l = obj;
                return cVar5;
            case 17:
                c cVar6 = new c((f0.c1) this.f14584m, cVar, 17);
                cVar6.l = obj;
                return cVar6;
            case 18:
                c cVar7 = new c((q3) this.f14584m, cVar, 18);
                cVar7.l = obj;
                return cVar7;
            case 19:
                return new c((y80.i) this.l, (f4) this.f14584m, cVar, 19);
            case 20:
                c cVar8 = new c((f3.a) this.f14584m, cVar, 20);
                cVar8.l = obj;
                return cVar8;
            case 21:
                return new c((ae.c) this.l, (t1.i) this.f14584m, cVar, 21);
            case 22:
                c cVar9 = new c((f50.c) this.f14584m, cVar, 22);
                cVar9.l = obj;
                return cVar9;
            case 23:
                return new c((f70.g) this.l, (f70.h) this.f14584m, cVar, 23);
            case 24:
                return new c((fn.c) this.l, (List) this.f14584m, cVar, 24);
            case 25:
                return new c((fn.c) this.f14584m, cVar, 25);
            case 26:
                return new c((Context) this.l, (fr.i) this.f14584m, cVar, 26);
            case 27:
                return new c((b2.k) this.l, (m3.h1) this.f14584m, cVar, 27);
            case 28:
                return new c((d7) this.l, (c5.g) this.f14584m, cVar, 28);
            default:
                return new c((gf.i) this.l, (Application) this.f14584m, cVar, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14582j) {
        }
        return ((c) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:29|(1:(1:(7:33|48|(1:50)|51|(1:53)|54|55)(2:34|620))(1:35))(4:36|(0)|46|621)|39|592|40|(1:42)(1:43)|44|(7:47|48|(0)|51|(0)|54|55)|46|621) */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x05d6, code lost:
    
        if (r0.emit(r2, r25) == r1) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x0b01, code lost:
    
        if (r2.invoke(r3, r25) != r1) goto L514;
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x0bc3, code lost:
    
        if (r0 == r2) goto L575;
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:0x0c0a, code lost:
    
        if (r0 != r2) goto L554;
     */
    /* JADX WARN: Code restructure failed: missing block: B:675:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:446:0x097e  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0ac7 A[PHI: r2 r3
      0x0ac7: PHI (r2v15 d8.c) = (r2v21 d8.c), (r2v28 d8.c) binds: [B:509:0x0af6, B:504:0x0abe] A[DONT_GENERATE, DONT_INLINE]
      0x0ac7: PHI (r3v3 java.lang.Object) = (r3v6 java.lang.Object), (r3v7 java.lang.Object) binds: [B:509:0x0af6, B:504:0x0abe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011c  */
    /* JADX WARN: Type inference failed for: r1v9, types: [kotlin.jvm.functions.Function2, z70.i] */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.jvm.functions.Function2, z70.i] */
    /* JADX WARN: Type inference failed for: r5v10, types: [kotlin.jvm.functions.Function2, z70.i] */
    /* JADX WARN: Type inference failed for: r9v0, types: [x70.c] */
    /* JADX WARN: Type inference failed for: r9v79 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:512:0x0b01 -> B:514:0x0b05). Please report as a decompilation issue!!! */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, x70.c cVar, int i11) {
        super(2, cVar);
        this.f14582j = i11;
        this.f14584m = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Function1 function1, x70.c cVar, y9.v vVar) {
        super(2, cVar);
        this.f14582j = 5;
        this.l = vVar;
        this.f14584m = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Object obj2, x70.c cVar, int i11) {
        super(2, cVar);
        this.f14582j = i11;
        this.l = obj;
        this.f14584m = obj2;
    }
}
