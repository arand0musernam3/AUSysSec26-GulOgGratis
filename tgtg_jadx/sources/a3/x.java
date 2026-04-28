package a3;

import android.view.View;
import android.view.textclassifier.TextClassifier;
import com.app.tgtg.model.remote.UserData;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.user.requests.UserAddress;
import com.app.tgtg.model.remote.voucher.DiscountVoucher;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f613j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f614k;
    public Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f615m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x(Function1 function1, v80.q qVar, x70.c cVar) {
        super(2, cVar);
        this.f613j = 15;
        this.f615m = (z70.i) function1;
        this.l = qVar;
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [kotlin.jvm.functions.Function1, z70.i] */
    /* JADX WARN: Type inference failed for: r0v8, types: [kotlin.jvm.functions.Function2, z70.i] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function2, z70.i] */
    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f613j) {
            case 0:
                return new x((TextClassifier) this.l, (Function2) this.f615m, cVar);
            case 1:
                return new x((c5.t1) this.l, (m5.h) this.f615m, cVar, 1);
            case 2:
                return new x((Function2) this.l, (aa.i0) this.f615m, cVar, 2);
            case 3:
                return new x((Function2) this.f615m, (aa.u) this.l, cVar);
            case 4:
                return new x((al.p) this.l, (String) this.f615m, cVar, 4);
            case 5:
                return new x((al.p) this.l, (androidx.fragment.app.o0) this.f615m, cVar, 5);
            case 6:
                return new x((al.c0) this.f615m, cVar, 6);
            case 7:
                x xVar = new x((zw.q2) this.f615m, cVar, 7);
                xVar.l = obj;
                return xVar;
            case 8:
                return new x((y80.i) this.l, (x80.u) this.f615m, cVar, 8);
            case 9:
                return new x((androidx.lifecycle.l0) this.l, this.f615m, cVar, 9);
            case 10:
                x xVar2 = new x((Function2) this.f615m, cVar, 10);
                xVar2.l = obj;
                return xVar2;
            case 11:
                return new x((ao.g3) this.l, (UserData) this.f615m, cVar, 11);
            case 12:
                return new x((b0.v1) this.l, (b0.r0) this.f615m, cVar, 12);
            case 13:
                return new x((a8.h) this.l, (b0.k) this.f615m, cVar, 13);
            case 14:
                return new x((List) this.l, (b0.y1) this.f615m, cVar, 14);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new x((Function1) this.f615m, (v80.q) this.l, cVar);
            case 16:
                return new x((b0.s2) this.l, (ArrayList) this.f615m, cVar, 16);
            case 17:
                return new x((bm.p) this.l, (ib.a0) this.f615m, cVar, 17);
            case 18:
                return new x((bs.o) this.l, (BasicItem) this.f615m, cVar, 18);
            case 19:
                return new x((bs.o) this.l, (String) this.f615m, cVar, 19);
            case 20:
                x xVar3 = new x((c5.x0) this.f615m, cVar, 20);
                xVar3.l = obj;
                return xVar3;
            case 21:
                return new x((m3.b2) this.l, (View) this.f615m, cVar, 21);
            case 22:
                return new x((y80.y1) this.l, (c5.u2) this.f615m, cVar, 22);
            case 23:
                return new x((c50.o) this.l, (c50.z0) this.f615m, cVar, 23);
            case 24:
                return new x((c50.f1) this.l, (c50.l0) this.f615m, cVar, 24);
            case 25:
                return new x((c6.t) this.l, (h4.c) this.f615m, cVar, 25);
            case 26:
                return new x((cj.q) this.l, (DiscountVoucher) this.f615m, cVar, 26);
            case 27:
                return new x((cj.e0) this.l, (UserAddress) this.f615m, cVar, 27);
            case 28:
                return new x((cn.a) this.l, (Function2) this.f615m, cVar, 28);
            default:
                x xVar4 = new x((d6.g0) this.f615m, cVar, 29);
                xVar4.l = obj;
                return xVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f613j) {
        }
        return ((x) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x01c9, code lost:
    
        if (kotlin.Unit.f26487a == r3) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01db, code lost:
    
        if (kotlin.Unit.f26487a == r3) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0248, code lost:
    
        if (r0.a(r10, r30) == r9) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0290, code lost:
    
        if (c50.f1.a(r6, r0, r2, r30) == r9) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x02fc, code lost:
    
        if (r3.b(r30) == r4) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x050e, code lost:
    
        if (r3.collect(r4, r30) == r2) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:551:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:?, code lost:
    
        return r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Type inference failed for: r2v16, types: [kotlin.jvm.functions.Function2, z70.i] */
    /* JADX WARN: Type inference failed for: r2v90, types: [kotlin.jvm.functions.Function1, z70.i] */
    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.jvm.functions.Function2, z70.i] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0050 -> B:17:0x0054). Please report as a decompilation issue!!! */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instruction units count: 2900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.x.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(Object obj, Object obj2, x70.c cVar, int i11) {
        super(2, cVar);
        this.f613j = i11;
        this.l = obj;
        this.f615m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(Object obj, x70.c cVar, int i11) {
        super(2, cVar);
        this.f613j = i11;
        this.f615m = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x(TextClassifier textClassifier, Function2 function2, x70.c cVar) {
        super(2, cVar);
        this.f613j = 0;
        this.l = textClassifier;
        this.f615m = (z70.i) function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x(Function2 function2, aa.u uVar, x70.c cVar) {
        super(2, cVar);
        this.f613j = 3;
        this.f615m = (z70.i) function2;
        this.l = uVar;
    }
}
