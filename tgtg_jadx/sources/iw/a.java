package iw;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import x90.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24204a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f24206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f24207d;

    public /* synthetic */ a(com.braze.requests.framework.h hVar, long j9, int i11) {
        this.f24207d = hVar;
        this.f24206c = j9;
        this.f24205b = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f24204a) {
            case 0:
                return com.braze.requests.framework.b.a((com.braze.requests.framework.h) this.f24207d, this.f24206c, this.f24205b);
            default:
                n nVar = (n) this.f24207d;
                try {
                    nVar.f44153w.A(this.f24205b, this.f24206c);
                    break;
                } catch (IOException e5) {
                    x90.b bVar = x90.b.PROTOCOL_ERROR;
                    nVar.a(bVar, bVar, e5);
                }
                return Unit.f26487a;
        }
    }

    public /* synthetic */ a(n nVar, int i11, long j9) {
        this.f24207d = nVar;
        this.f24205b = i11;
        this.f24206c = j9;
    }
}
