package pe;

import h2.s0;
import java.util.List;
import ke.f;
import ke.j;
import ke.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends s0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f34719c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(List list, int i11) {
        super(list, 1);
        this.f34719c = i11;
    }

    @Override // pe.e
    public final ke.e g() {
        switch (this.f34719c) {
            case 0:
                return new f((List) this.f21216b, 0);
            case 1:
                return new j((List) this.f21216b, 0);
            case 2:
                return new f((List) this.f21216b, 1);
            case 3:
                return new j((List) this.f21216b, 1);
            case 4:
                return new j((List) this.f21216b, 2);
            case 5:
                return new n((List) this.f21216b);
            default:
                return new f((List) this.f21216b, 2);
        }
    }
}
