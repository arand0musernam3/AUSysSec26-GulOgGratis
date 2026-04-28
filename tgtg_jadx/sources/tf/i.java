package tf;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f40128j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public v70.i f40129k;
    public long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f40130m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ j f40131n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, v70.i iVar, long j9, x70.c cVar) {
        super(2, cVar);
        this.f40131n = jVar;
        this.f40129k = iVar;
        this.l = j9;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f40128j) {
            case 0:
                return new i(this.f40131n, this.f40129k, this.l, cVar);
            default:
                return new i(this.f40131n, cVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f40128j) {
        }
        return ((i) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0092 A[Catch: all -> 0x001f, Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:9:0x001a, B:36:0x0084, B:37:0x008c, B:39:0x0092, B:41:0x00ae, B:42:0x00b2, B:44:0x00b8, B:16:0x002f, B:26:0x004f, B:28:0x0057, B:29:0x005f, B:31:0x0067, B:32:0x006a, B:19:0x0036, B:21:0x003a, B:23:0x0045), top: B:68:0x0010, outer: #1 }] */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tf.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, x70.c cVar) {
        super(2, cVar);
        this.f40131n = jVar;
    }
}
