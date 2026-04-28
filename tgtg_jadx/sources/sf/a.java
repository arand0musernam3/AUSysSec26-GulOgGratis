package sf;

import com.app.tgtg.feature.tabprofile.manageaccount.contactus.ContactUsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import oa0.m0;
import org.bouncycastle.iana.AEADAlgorithm;
import t1.y0;
import tf.j;
import ti.s;
import uf.g;
import uo.h;
import v1.h0;
import v1.h1;
import v1.p0;
import v80.b0;
import v80.i0;
import ye.q;
import yi.r;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f39014j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f39015k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, x70.c cVar, int i11) {
        super(2, cVar);
        this.f39014j = i11;
        this.l = obj;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f39014j) {
            case 0:
                return new a((b) this.l, cVar, 0);
            case 1:
                return new a((ContactUsViewModel) this.l, cVar, 1);
            case 2:
                return new a((y0) this.l, cVar, 2);
            case 3:
                return new a((j) this.l, cVar, 3);
            case 4:
                return new a((s) this.l, cVar, 4);
            case 5:
                return new a((u9.a) this.l, cVar, 5);
            case 6:
                return new a((g) this.l, cVar, 6);
            case 7:
                return new a((uh.g) this.l, cVar, 7);
            case 8:
                return new a((h) this.l, cVar, 8);
            case 9:
                return new a((h0) this.l, cVar, 9);
            case 10:
                return new a((p0) this.l, cVar, 10);
            case 11:
                return new a((h1) this.l, cVar, 11);
            case 12:
                return new a((i0) this.l, cVar, 12);
            case 13:
                return new a((m0) this.l, cVar, 13);
            case 14:
                return new a((w4.m0) this.l, cVar, 14);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new a((y80.i) this.l, cVar, 15);
            case 16:
                return new a((y9.p0) this.l, cVar, 16);
            case 17:
                return new a((q) this.l, cVar, 17);
            case 18:
                return new a((r) this.l, cVar, 18);
            default:
                return new a((yl.i) this.l, cVar, 19);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f39014j) {
        }
        return ((a) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02b7  */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v120, types: [kotlin.collections.n0] */
    /* JADX WARN: Type inference failed for: r11v121, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v129, types: [java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:145:0x0293 -> B:139:0x0284). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:147:0x02b0 -> B:149:0x02b3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 1544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sf.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
