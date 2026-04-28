package ni;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;
import z3.r;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public r f30883j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Iterator f30884k;
    public t1.b l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f30885m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f30886n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f30887o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f30888p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f30889q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ t1.b f30890r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ t1.b f30891s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ t1.b f30892t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ t1.b f30893u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ t1.b f30894v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t1.b f30895w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r f30896x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(t1.b bVar, t1.b bVar2, t1.b bVar3, t1.b bVar4, t1.b bVar5, t1.b bVar6, r rVar, x70.c cVar) {
        super(2, cVar);
        this.f30890r = bVar;
        this.f30891s = bVar2;
        this.f30892t = bVar3;
        this.f30893u = bVar4;
        this.f30894v = bVar5;
        this.f30895w = bVar6;
        this.f30896x = rVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new f(this.f30890r, this.f30891s, this.f30892t, this.f30893u, this.f30894v, this.f30895w, this.f30896x, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0138  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0121 -> B:30:0x0127). Please report as a decompilation issue!!! */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
