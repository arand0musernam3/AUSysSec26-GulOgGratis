package x2;

import kotlin.jvm.internal.Ref;
import m2.t0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Ref.LongRef f43763j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Ref.LongRef f43764k;
    public t0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f43765m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ w f43766n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f43767o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(w wVar, z70.c cVar) {
        super(cVar);
        this.f43766n = wVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f43765m = obj;
        this.f43767o |= Integer.MIN_VALUE;
        return w.b(this.f43766n, null, false, this);
    }
}
