package a3;

import com.app.tgtg.feature.orderview.charity.CharityOrderActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b2 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f276j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f277k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b2(z1.h3 h3Var, int i11, x70.c cVar, int i12) {
        super(2, cVar);
        this.f276j = i12;
        this.l = h3Var;
        this.f277k = i11;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f276j) {
            case 0:
                b2 b2Var = new b2((j2) this.l, cVar, 0);
                long j9 = ((h4.b) obj).f21378a;
                return b2Var;
            case 1:
                return new b2((ah.k) this.l, cVar, 1);
            case 2:
                return new b2((zw.q2) this.l, cVar, 2);
            case 3:
                return new b2((ao.h) this.l, cVar, 3);
            case 4:
                return new b2((ap.n) this.l, cVar, 4);
            case 5:
                return new b2((b0.v1) this.l, cVar, 5);
            case 6:
                return new b2(cVar, (b0.l2) this.l);
            case 7:
                return new b2((List) this.l, cVar, 7);
            case 8:
                return new b2((bm.p) this.l, cVar, 8);
            case 9:
                return new b2((cn.a) this.l, cVar, 9);
            case 10:
                return new b2((dk.f) this.l, cVar, 10);
            case 11:
                return new b2((dt.c) this.l, cVar, 11);
            case 12:
                return new b2((ei.a) this.l, cVar, 12);
            case 13:
                return new b2((v1.y1) this.l, cVar, 13);
            case 14:
                return new b2((em.j) this.l, cVar, 14);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new b2((en.o) this.l, cVar, 15);
            case 16:
                return new b2((f0.a) this.l, cVar, 16);
            case 17:
                return new b2((f0.v0) this.l, cVar, 17);
            case 18:
                return new b2((f0.f2) this.l, cVar, 18);
            case 19:
                return new b2((f0.h) this.l, cVar, 19);
            case 20:
                return new b2((f2.c0) this.l, this.f277k, cVar, 20);
            case 21:
                return new b2((ft.j) this.l, cVar, 21);
            case 22:
                return new b2((g2.b0) this.l, this.f277k, cVar, 22);
            case 23:
                return new b2((g3.d3) this.l, cVar, 23);
            case 24:
                return new b2((c2) this.l, cVar, 24);
            case 25:
                return new b2((CharityOrderActivity) this.l, cVar, 25);
            case 26:
                return new b2((androidx.lifecycle.n1) this.l, cVar, 26);
            case 27:
                return new b2((zw.q2) this.l, cVar, 27);
            case 28:
                return new b2((v80.j0) this.l, cVar, 28);
            default:
                return new b2((b5.j1) this.l, cVar, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f276j) {
            case 0:
                long j9 = ((h4.b) obj).f21378a;
                break;
        }
        return ((b2) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x02a5, code lost:
    
        if (v80.f0.o(zendesk.messaging.android.internal.conversationscreen.ConversationFragment.COORDINATOR_INITIALIZATION_TIMEOUT, r21) == r0) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0474, code lost:
    
        if (r2.s(r21) != r1) goto L259;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03ec  */
    /* JADX WARN: Type inference failed for: r0v122 */
    /* JADX WARN: Type inference failed for: r0v123 */
    /* JADX WARN: Type inference failed for: r0v124 */
    /* JADX WARN: Type inference failed for: r0v38, types: [dk.f] */
    /* JADX WARN: Type inference failed for: r0v39, types: [dk.f] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r1v67, types: [kotlin.collections.n0] */
    /* JADX WARN: Type inference failed for: r1v68, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v71, types: [java.util.ArrayList] */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.b2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(x70.c cVar, b0.l2 l2Var) {
        super(2, cVar);
        this.f276j = 6;
        this.l = l2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b2(Object obj, x70.c cVar, int i11) {
        super(2, cVar);
        this.f276j = i11;
        this.l = obj;
    }
}
