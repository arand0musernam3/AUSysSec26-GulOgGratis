package mv;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f30163j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f30164k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Function1 f30165m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f30166n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ LinearLayoutManager f30167o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ List f30168p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ e0 f30169q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ cv.g f30170r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f30171s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f30172t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Function1 f30173u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(LinearLayoutManager linearLayoutManager, List list, e0 e0Var, cv.g gVar, int i11, String str, Function1 function1, x70.c cVar) {
        super(2, cVar);
        this.f30167o = linearLayoutManager;
        this.f30168p = list;
        this.f30169q = e0Var;
        this.f30170r = gVar;
        this.f30171s = i11;
        this.f30172t = str;
        this.f30173u = function1;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new d0(this.f30167o, this.f30168p, this.f30169q, this.f30170r, this.f30171s, this.f30172t, this.f30173u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004a -> B:38:0x00c7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0050 -> B:38:0x00c7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005a -> B:38:0x00c7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00bd -> B:35:0x00c0). Please report as a decompilation issue!!! */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mv.d0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
