package o3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o80.k;
import q1.n1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends z70.h implements Function2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f31833k;
    public long[] l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f31834m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f31835n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f31836o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f31837p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f31838q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f31839r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f31840s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f31841t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f31842u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, x70.c cVar, int i11) {
        super(2, cVar);
        this.f31833k = i11;
        this.f31842u = obj;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f31833k) {
            case 0:
                g gVar = new g((h) this.f31842u, cVar, 0);
                gVar.f31840s = obj;
                return gVar;
            case 1:
                g gVar2 = new g((q1.g) this.f31842u, cVar, 1);
                gVar2.f31840s = obj;
                return gVar2;
            case 2:
                g gVar3 = new g((q1.g) this.f31842u, cVar, 2);
                gVar3.f31840s = obj;
                return gVar3;
            default:
                g gVar4 = new g((n1) this.f31842u, cVar, 3);
                gVar4.f31840s = obj;
                return gVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        k kVar = (k) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f31833k) {
        }
        return ((g) create(kVar, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x028e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005b -> B:24:0x00a0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x005d -> B:15:0x006e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0077 -> B:21:0x0097). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0094 -> B:21:0x0097). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00fa -> B:48:0x013f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00fc -> B:39:0x010d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0116 -> B:45:0x0136). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0133 -> B:45:0x0136). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0198 -> B:63:0x01aa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x01b3 -> B:69:0x01e3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x01e0 -> B:70:0x01e5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x01f3 -> B:75:0x01f4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x024f -> B:99:0x0294). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x0251 -> B:90:0x0262). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x026b -> B:96:0x028b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x0288 -> B:96:0x028b). Please report as a decompilation issue!!! */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
