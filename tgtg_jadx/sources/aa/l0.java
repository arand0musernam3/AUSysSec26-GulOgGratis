package aa;

import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import androidx.core.util.Consumer;
import b0.o1;
import b0.w1;
import com.app.tgtg.feature.charity.ui.model.CharityIdError;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.order.Changes;
import d8.e1;
import f0.c1;
import f0.f4;
import f0.k1;
import f0.s2;
import g3.u7;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import m3.b1;
import org.bouncycastle.iana.AEADAlgorithm;
import pg.x0;
import zw.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1137j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f1138k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l0(Function2 function2, x70.c cVar) {
        super(2, cVar);
        this.f1137j = 0;
        this.l = (z70.i) function2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function2, z70.i] */
    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f1137j) {
            case 0:
                l0 l0Var = new l0((z70.i) this.l, cVar);
                l0Var.f1138k = obj;
                return l0Var;
            case 1:
                l0 l0Var2 = new l0((ah.k) this.l, cVar, 1);
                l0Var2.f1138k = obj;
                return l0Var2;
            case 2:
                return new l0((Throwable) this.f1138k, (ah.k) this.l, cVar, 2);
            case 3:
                l0 l0Var3 = new l0((x0) this.l, cVar, 3);
                l0Var3.f1138k = obj;
                return l0Var3;
            case 4:
                return new l0((o1) this.f1138k, (List) this.l, cVar, 4);
            case 5:
                return new l0(cVar, (Set) this.f1138k, (w1) this.l, 5);
            case 6:
                return new l0(cVar, (w1) this.f1138k, (Ref.LongRef) this.l, 6);
            case 7:
                return new l0((w.l0) this.f1138k, (DeferrableSurface$SurfaceClosedException) this.l, cVar, 7);
            case 8:
                l0 l0Var4 = new l0((br.g) this.l, cVar, 8);
                l0Var4.f1138k = obj;
                return l0Var4;
            case 9:
                return new l0((Function1) this.f1138k, (v2.h) this.l, cVar, 9);
            case 10:
                return new l0((cj.e0) this.f1138k, (String) this.l, cVar, 10);
            case 11:
                l0 l0Var5 = new l0((e1) this.l, cVar, 11);
                l0Var5.f1138k = obj;
                return l0Var5;
            case 12:
                l0 l0Var6 = new l0((dt.c) this.l, cVar, 12);
                l0Var6.f1138k = obj;
                return l0Var6;
            case 13:
                return new l0((Throwable) this.f1138k, (dt.c) this.l, cVar, 13);
            case 14:
                return new l0((f0.d) this.f1138k, (e0.c) this.l, cVar, 14);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new l0((f0.d0) this.f1138k, (e0.c) this.l, cVar, 15);
            case 16:
                return new l0((s2) this.f1138k, (f4) this.l, cVar, 16);
            case 17:
                return new l0((String) this.f1138k, (c1) this.l, cVar, 17);
            case 18:
                return new l0((k1) this.f1138k, (String) this.l, cVar, 18);
            case 19:
                return new l0((BasicItem) this.f1138k, (b1) this.l, cVar, 19);
            case 20:
                return new l0((CharityIdError) this.f1138k, (g4.v) this.l, cVar, 20);
            case 21:
                return new l0((Consumer) this.f1138k, (st.b) this.l, cVar, 21);
            case 22:
                return new l0((u7) this.f1138k, (Function1) this.l, cVar, 22);
            case 23:
                l0 l0Var7 = new l0((Set) this.l, cVar, 23);
                l0Var7.f1138k = obj;
                return l0Var7;
            case 24:
                return new l0((ye.b) this.f1138k, (dn.k) this.l, cVar, 24);
            case 25:
                l0 l0Var8 = new l0((gl.l) this.l, cVar, 25);
                l0Var8.f1138k = obj;
                return l0Var8;
            case 26:
                return new l0((Function1) this.f1138k, (b1) this.l, cVar, 26);
            case 27:
                return new l0((go.v) this.f1138k, (Changes) this.l, cVar, 27);
            case 28:
                l0 l0Var9 = new l0((q2) this.l, cVar, 28);
                l0Var9.f1138k = obj;
                return l0Var9;
            default:
                l0 l0Var10 = new l0((String) this.l, cVar, 29);
                l0Var10.f1138k = obj;
                return l0Var10;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1137j) {
            case 0:
                return ((l0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 1:
                return ((l0) create((xg.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 2:
                return ((l0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 3:
                return ((l0) create((String) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 4:
                return ((l0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 5:
                return ((l0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 6:
                return ((l0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 7:
                return ((l0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 8:
                return ((l0) create((String) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 9:
                return ((l0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 10:
                return ((l0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 11:
                return ((l0) create((e1) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 12:
                return ((l0) create((at.h0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 13:
                return ((l0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 14:
                return ((l0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return ((l0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 16:
                return ((l0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 17:
                return ((l0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 18:
                return ((l0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 19:
                return ((l0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 20:
                return ((l0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 21:
                return ((l0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 22:
                return ((l0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 23:
                return ((l0) create((h8.g) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 24:
                return ((l0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 25:
                return ((l0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 26:
                return ((l0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 27:
                return ((l0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 28:
                return ((l0) create(obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            default:
                return ((l0) create((h8.a) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x01a2, code lost:
    
        if (r0.hasTransport(0) == false) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x065b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.jvm.functions.Function2, z70.i] */
    /* JADX WARN: Type inference failed for: r5v0, types: [x70.c] */
    /* JADX WARN: Type inference failed for: r5v2 */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1978
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aa.l0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(Object obj, x70.c cVar, int i11) {
        super(2, cVar);
        this.f1137j = i11;
        this.l = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(Object obj, Object obj2, x70.c cVar, int i11) {
        super(2, cVar);
        this.f1137j = i11;
        this.f1138k = obj;
        this.l = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(x70.c cVar, Object obj, Object obj2, int i11) {
        super(2, cVar);
        this.f1137j = i11;
        this.f1138k = obj;
        this.l = obj2;
    }
}
