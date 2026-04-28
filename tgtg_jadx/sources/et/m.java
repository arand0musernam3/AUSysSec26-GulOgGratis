package et;

import com.app.tgtg.model.remote.brief.BriefOrder;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public BriefOrder f16407j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public BriefOrder f16408k;
    public List l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f16409m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ z f16410n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f16411o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(z zVar, z70.c cVar) {
        super(cVar);
        this.f16410n = zVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f16409m = obj;
        this.f16411o |= Integer.MIN_VALUE;
        return this.f16410n.l(null, null, null, this);
    }
}
