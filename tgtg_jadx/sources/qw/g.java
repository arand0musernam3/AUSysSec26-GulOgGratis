package qw;

import com.braze.events.IEventSubscriber;
import com.braze.events.internal.c0;
import com.braze.events.internal.p;
import com.braze.events.internal.y;
import com.braze.managers.n;
import com.braze.managers.y0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements IEventSubscriber {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f37290b;

    public /* synthetic */ g(Object obj, int i11) {
        this.f37289a = i11;
        this.f37290b = obj;
    }

    @Override // com.braze.events.IEventSubscriber
    public final void trigger(Object obj) {
        switch (this.f37289a) {
            case 0:
                com.braze.triggers.managers.f.a((com.braze.triggers.managers.f) this.f37290b, (c0) obj);
                break;
            case 1:
                com.braze.dispatch.h.a((com.braze.dispatch.h) this.f37290b, (com.braze.events.internal.dispatchmanager.c) obj);
                break;
            case 2:
                n.a((n) this.f37290b, (y) obj);
                break;
            default:
                y0.a((y0) this.f37290b, (p) obj);
                break;
        }
    }
}
