package cj;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class s extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f8380j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e0 f8381k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8382m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e0 f8383n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f8384o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(e0 e0Var, String str, x70.c cVar) {
        super(2, cVar);
        this.f8383n = e0Var;
        this.f8384o = str;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new s(this.f8383n, this.f8384o, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c6, code lost:
    
        if (kotlin.Unit.f26487a != r0) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cj.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
