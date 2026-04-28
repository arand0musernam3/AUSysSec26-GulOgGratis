package gf;

import a3.l3;
import android.app.Activity;
import com.app.tgtg.model.local.DeeplinkC2CReferralData;
import com.app.tgtg.model.remote.brief.BriefOrder;
import com.app.tgtg.model.remote.item.response.Item;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.order.OrderState;
import com.app.tgtg.services.notifications.TGTGMessagingService;
import com.google.firebase.messaging.y;
import e.n;
import ep.d0;
import go.v;
import i2.e0;
import ii.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import lo.m;
import m3.b1;
import m3.t1;
import org.bouncycastle.iana.AEADAlgorithm;
import v80.b0;
import x80.u;
import zw.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f20414j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f20415k;
    public Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f20416m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, Object obj2, x70.c cVar, int i11) {
        super(2, cVar);
        this.f20414j = i11;
        this.l = obj;
        this.f20416m = obj2;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f20414j) {
            case 0:
                return new g((i) this.f20416m, cVar, 0);
            case 1:
                return new g((v) this.l, (Order) this.f20416m, cVar, 1);
            case 2:
                return new g((TGTGMessagingService) this.l, (String) this.f20416m, cVar, 2);
            case 3:
                return new g((q2) this.l, this.f20416m, cVar, 3);
            case 4:
                return new g((hm.v) this.l, (BriefOrder) this.f20416m, cVar, 4);
            case 5:
                return new g((DeeplinkC2CReferralData) this.l, (hm.v) this.f20416m, cVar, 5);
            case 6:
                return new g((hm.v) this.l, (String) this.f20416m, cVar, 6);
            case 7:
                return new g((ho.j) this.l, (OrderState) this.f20416m, cVar, 7);
            case 8:
                return new g((ho.j) this.l, (Throwable) this.f20416m, cVar, 8);
            case 9:
                return new g((hv.j) this.l, (y) this.f20416m, cVar, 9);
            case 10:
                return new g((hv.j) this.l, (Function1) this.f20416m, cVar, 10);
            case 11:
                return new g((w4.y) this.l, (e0) this.f20416m, cVar, 11);
            case 12:
                return new g((i5.d) this.l, (Runnable) this.f20416m, cVar, 12);
            case 13:
                return new g((ih.i) this.l, (Item) this.f20416m, cVar, 13);
            case 14:
                return new g((j0) this.l, (Activity) this.f20416m, cVar, 14);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new g((j0) this.f20416m, cVar, 15);
            case 16:
                return new g((j0) this.l, (String) this.f20416m, cVar, 16);
            case 17:
                return new g((j2.g) this.l, (a0.g) this.f20416m, cVar, 17);
            case 18:
                return new g((k40.b) this.l, (Function1) this.f20416m, cVar, 18);
            case 19:
                return new g((k40.b) this.l, (h8.e) this.f20416m, cVar, 19);
            case 20:
                return new g((ki.i) this.l, (ki.a) this.f20416m, cVar, 20);
            case 21:
                return new g((ks.h) this.f20416m, cVar, 21);
            case 22:
                g gVar = new g((t1) this.f20416m, cVar, 22);
                gVar.l = obj;
                return gVar;
            case 23:
                g gVar2 = new g((b1) this.f20416m, cVar, 23);
                gVar2.l = obj;
                return gVar2;
            case 24:
                return new g((li.g) this.f20416m, cVar, 24);
            case 25:
                return new g((ll.g) this.f20416m, cVar, 25);
            case 26:
                return new g((m) this.l, (Activity) this.f20416m, cVar, 26);
            case 27:
                return new g((d0) this.l, (n) this.f20416m, cVar, 27);
            case 28:
                return new g((w4.y) this.l, (l3) this.f20416m, cVar, 28);
            default:
                return new g((mb.e) this.l, (u) this.f20416m, cVar, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20414j) {
        }
        return ((g) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x020b, code lost:
    
        if (kotlin.Unit.f26487a == r1) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x039f, code lost:
    
        if (kotlin.Unit.f26487a != r4) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x05be, code lost:
    
        if (r2.emit(r3, r15) == r0) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0104, code lost:
    
        if (kotlin.Unit.f26487a != r13) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x037d A[PHI: r7
      0x037d: PHI (r7v4 java.lang.Object) = (r7v3 java.lang.Object), (r7v5 java.lang.Object) binds: [B:168:0x0345, B:179:0x037c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x059d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0955  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x095f  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x09a5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c3  */
    /* JADX WARN: Type inference failed for: r11v0, types: [x70.c] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:495:0x0953 -> B:497:0x0957). Please report as a decompilation issue!!! */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, x70.c cVar, int i11) {
        super(2, cVar);
        this.f20414j = i11;
        this.f20416m = obj;
    }
}
