package iw;

import com.braze.requests.framework.queue.i;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.braze.requests.framework.h f24209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f24210c;

    public /* synthetic */ b(long j9, com.braze.requests.framework.h hVar) {
        this.f24208a = 2;
        this.f24210c = j9;
        this.f24209b = hVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f24208a) {
            case 0:
                return com.braze.requests.framework.b.a(this.f24209b, this.f24210c);
            case 1:
                return com.braze.requests.framework.e.a(this.f24209b, this.f24210c);
            case 2:
                return com.braze.requests.framework.g.b(this.f24210c, this.f24209b);
            case 3:
                return com.braze.requests.framework.h.a(this.f24209b, this.f24210c);
            case 4:
                return i.b(this.f24209b, this.f24210c);
            default:
                return i.c(this.f24209b, this.f24210c);
        }
    }

    public /* synthetic */ b(com.braze.requests.framework.h hVar, long j9, int i11) {
        this.f24208a = i11;
        this.f24209b = hVar;
        this.f24210c = j9;
    }
}
