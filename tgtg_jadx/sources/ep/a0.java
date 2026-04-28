package ep;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m3.b1;
import m3.h1;
import no.m0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f16216j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f16217k;
    public final /* synthetic */ boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f16218m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f16219n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f16220o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.google.firebase.messaging.a0 a0Var, int i11, boolean z11, h1 h1Var, h1 h1Var2, x70.c cVar) {
        super(2, cVar);
        this.f16216j = 6;
        this.f16218m = a0Var;
        this.f16217k = i11;
        this.l = z11;
        this.f16219n = h1Var;
        this.f16220o = h1Var2;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f16216j) {
            case 0:
                return new a0(this.l, (hp.g) this.f16219n, (d0) this.f16220o, cVar);
            case 1:
                return new a0(this.l, (b1) this.f16218m, (t1.b) this.f16219n, (t1.b) this.f16220o, cVar, 1);
            case 2:
                return new a0((t1.b) this.f16218m, this.l, (t1.b1) this.f16219n, (Function0) this.f16220o, cVar);
            case 3:
                return new a0(this.l, (h2.b0) this.f16218m, (t1.x) this.f16219n, (l4.b) this.f16220o, cVar, 3);
            case 4:
                return new a0((b1) this.f16219n, this.l, (b2.l) this.f16220o, cVar);
            case 5:
                return new a0((m0) this.f16218m, (String) this.f16219n, this.l, (String) this.f16220o, cVar, 5);
            case 6:
                return new a0((com.google.firebase.messaging.a0) this.f16218m, this.f16217k, this.l, (h1) this.f16219n, (h1) this.f16220o, cVar);
            case 7:
                return new a0(this.l, (tm.e) this.f16218m, (com.google.firebase.messaging.a0) this.f16219n, (b1) this.f16220o, cVar, 7);
            default:
                return new a0((b2.l) this.f16218m, (b2.n) this.f16219n, this.l, (v1.g) this.f16220o, cVar, 8);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f16216j) {
        }
        return ((a0) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0283, code lost:
    
        if (r0 == r13) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (r1.b(r11, r20) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0382, code lost:
    
        if (v80.f0.o(200, r20) != r14) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ab, code lost:
    
        if (r11.Q(r20) == r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b4, code lost:
    
        if (r11.G(r20) == r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bd, code lost:
    
        if (r11.N(r20) == r0) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03e9  */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 1046
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ep.a0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(Object obj, Object obj2, boolean z11, Object obj3, x70.c cVar, int i11) {
        super(2, cVar);
        this.f16216j = i11;
        this.f16218m = obj;
        this.f16219n = obj2;
        this.l = z11;
        this.f16220o = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b1 b1Var, boolean z11, b2.l lVar, x70.c cVar) {
        super(2, cVar);
        this.f16216j = 4;
        this.f16219n = b1Var;
        this.l = z11;
        this.f16220o = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(t1.b bVar, boolean z11, t1.b1 b1Var, Function0 function0, x70.c cVar) {
        super(2, cVar);
        this.f16216j = 2;
        this.f16218m = bVar;
        this.l = z11;
        this.f16219n = b1Var;
        this.f16220o = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(boolean z11, hp.g gVar, d0 d0Var, x70.c cVar) {
        super(2, cVar);
        this.f16216j = 0;
        this.l = z11;
        this.f16219n = gVar;
        this.f16220o = d0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(boolean z11, Object obj, Object obj2, Object obj3, x70.c cVar, int i11) {
        super(2, cVar);
        this.f16216j = i11;
        this.l = z11;
        this.f16218m = obj;
        this.f16219n = obj2;
        this.f16220o = obj3;
    }
}
