package jv;

import ao.l;
import com.app.tgtg.services.user.AuthPolling;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f25414j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f25415k;
    public Ref.ObjectRef l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Ref.BooleanRef f25416m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public l f25417n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Ref.ObjectRef f25418o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f25419p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ AuthPolling f25420q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f25421r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AuthPolling authPolling, z70.c cVar) {
        super(cVar);
        this.f25420q = authPolling;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f25419p = obj;
        this.f25421r |= Integer.MIN_VALUE;
        return this.f25420q.g(null, null, this);
    }
}
