package gn;

import android.content.Context;
import androidx.lifecycle.l1;
import f2.c0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m3.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class w extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f20681j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ boolean f20682k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f20683m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f20684n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Context context, boolean z11, Function0 function0, l1 l1Var, x70.c cVar, int i11) {
        super(2, cVar);
        this.f20681j = i11;
        this.l = context;
        this.f20682k = z11;
        this.f20683m = function0;
        this.f20684n = l1Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f20681j) {
            case 0:
                w wVar = new w((c0) this.l, (dn.k) this.f20683m, (z3.u) this.f20684n, cVar);
                wVar.f20682k = ((Boolean) obj).booleanValue();
                return wVar;
            case 1:
                return new w(this.f20682k, (hs.h) this.l, (b1) this.f20683m, (b1) this.f20684n, cVar, 1);
            case 2:
                return new w(this.f20682k, (ry.c) this.l, (b1) this.f20683m, (b1) this.f20684n, cVar, 2);
            case 3:
                return new w((Context) this.l, this.f20682k, (Function0) this.f20683m, (np.b) this.f20684n, cVar, 3);
            case 4:
                return new w((Context) this.l, this.f20682k, (Function0) this.f20683m, (tg.i) this.f20684n, cVar, 4);
            default:
                w wVar2 = new w((x2.w) this.f20683m, (w4.y) this.f20684n, this.f20682k, cVar);
                wVar2.l = obj;
                return wVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20681j) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                break;
        }
        return ((w) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00df  */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gn.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(c0 c0Var, dn.k kVar, z3.u uVar, x70.c cVar) {
        super(2, cVar);
        this.f20681j = 0;
        this.l = c0Var;
        this.f20683m = kVar;
        this.f20684n = uVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x2.w wVar, w4.y yVar, boolean z11, x70.c cVar) {
        super(2, cVar);
        this.f20681j = 5;
        this.f20683m = wVar;
        this.f20684n = yVar;
        this.f20682k = z11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(boolean z11, Object obj, b1 b1Var, b1 b1Var2, x70.c cVar, int i11) {
        super(2, cVar);
        this.f20681j = i11;
        this.f20682k = z11;
        this.l = obj;
        this.f20683m = b1Var;
        this.f20684n = b1Var2;
    }
}
