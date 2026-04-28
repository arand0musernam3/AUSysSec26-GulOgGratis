package b0;

import androidx.core.util.Consumer;
import g3.w6;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f5442j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5443k;
    public final /* synthetic */ boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f5444m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f5445n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(Object obj, x70.c cVar, boolean z11, Object obj2, int i11) {
        super(2, cVar);
        this.f5442j = i11;
        this.f5444m = obj;
        this.l = z11;
        this.f5445n = obj2;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f5442j) {
            case 0:
                return new v((List) this.f5444m, cVar, this.l, (r0) this.f5445n, 0);
            case 1:
                return new v((b1) this.f5444m, cVar, this.l, (LinkedHashSet) this.f5445n, 1);
            case 2:
                v vVar = new v((fn.c) this.f5445n, this.l, cVar, 2);
                vVar.f5444m = obj;
                return vVar;
            case 3:
                return new v((ft.j) this.f5444m, this.l, (Consumer) this.f5445n, cVar, 3);
            case 4:
                return new v((t1.b) this.f5444m, this.l, (t1.b1) this.f5445n, cVar, 4);
            case 5:
                return new v((ho.j) this.f5445n, this.l, cVar, 5);
            case 6:
                return new v(this.l, (f2.c0) this.f5444m, (m3.b1) this.f5445n, cVar, 6);
            case 7:
                return new v(this.l, (w6) this.f5444m, (t5.a) this.f5445n, cVar, 7);
            case 8:
                return new v(this.l, (g4.v) this.f5444m, (c5.f3) this.f5445n, cVar, 8);
            default:
                return new v((uo.h) this.f5445n, this.l, cVar, 9);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f5442j) {
        }
        return ((v) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x021d, code lost:
    
        if (v80.f0.K(r1, r2, r14) == r0) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0230, code lost:
    
        if (v80.f0.K(r15, r2, r14) == r0) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0351, code lost:
    
        if (b0.r0.e((b0.r0) r6, 1000000000, r14) == r0) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        if (r0.collect(r15, r14) == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d8, code lost:
    
        if (r15.e(r14) == r0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0193, code lost:
    
        if (r15.collect(r1, r14) == r0) goto L86;
     */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 890
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(androidx.lifecycle.l1 l1Var, boolean z11, x70.c cVar, int i11) {
        super(2, cVar);
        this.f5442j = i11;
        this.f5445n = l1Var;
        this.l = z11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(Object obj, boolean z11, Object obj2, x70.c cVar, int i11) {
        super(2, cVar);
        this.f5442j = i11;
        this.f5444m = obj;
        this.l = z11;
        this.f5445n = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(boolean z11, Object obj, Object obj2, x70.c cVar, int i11) {
        super(2, cVar);
        this.f5442j = i11;
        this.l = z11;
        this.f5444m = obj;
        this.f5445n = obj2;
    }
}
