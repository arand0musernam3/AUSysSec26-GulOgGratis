package hm;

import com.app.tgtg.feature.main.MainActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f22121j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22122k;
    public final /* synthetic */ MainActivity l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(MainActivity mainActivity, x70.c cVar, int i11) {
        super(2, cVar);
        this.f22121j = i11;
        this.l = mainActivity;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f22121j) {
            case 0:
                return new k(this.l, cVar, 0);
            default:
                return new k(this.l, cVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f22121j) {
        }
        return ((k) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0156, code lost:
    
        if (com.app.tgtg.feature.main.MainActivity.a0(r4, r21) == r1) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0163, code lost:
    
        if (com.app.tgtg.feature.main.MainActivity.b0(r4, r21) == r1) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f8  */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hm.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
