package i0;

import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Long f22638j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Ref.ObjectRef f22639k;
    public a0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f22640m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f22641n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ h f22642o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f22643p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, z70.c cVar) {
        super(cVar);
        this.f22642o = hVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f22641n = obj;
        this.f22643p |= Integer.MIN_VALUE;
        return this.f22642o.a(null, null, 0, null, null, this);
    }
}
