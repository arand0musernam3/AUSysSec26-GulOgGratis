package f0;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p3 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f16841j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public u3 f16842k;
    public Iterator l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a f16843m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f16844n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ q3 f16845o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f16846p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(q3 q3Var, z70.c cVar) {
        super(cVar);
        this.f16845o = q3Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f16844n = obj;
        this.f16846p |= Integer.MIN_VALUE;
        return this.f16845o.i(null, null, this);
    }
}
