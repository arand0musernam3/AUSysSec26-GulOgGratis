package q5;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f35995j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a0 f35996k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f35997m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f35998n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ c f35999o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f36000p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, z70.c cVar2) {
        super(cVar2);
        this.f35999o = cVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f35998n = obj;
        this.f36000p |= Integer.MIN_VALUE;
        return this.f35999o.b(this);
    }
}
