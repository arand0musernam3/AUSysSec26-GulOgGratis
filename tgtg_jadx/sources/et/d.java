package et;

import java.util.List;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f16361j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Ref.IntRef f16362k;
    public Ref.ObjectRef l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f16363m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f16364n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f16365o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f16366p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ z f16367q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f16368r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(z zVar, z70.c cVar) {
        super(cVar);
        this.f16367q = zVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f16366p = obj;
        this.f16368r |= Integer.MIN_VALUE;
        return this.f16367q.c(null, this);
    }
}
