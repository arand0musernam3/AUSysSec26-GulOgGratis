package en;

import androidx.lifecycle.z;
import java.util.List;
import q6.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f16123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f16124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16125d;

    public /* synthetic */ d(Object obj, List list, z zVar, int i11) {
        this.f16122a = i11;
        this.f16125d = obj;
        this.f16123b = list;
        this.f16124c = zVar;
    }

    @Override // q6.y
    public final void a() {
        switch (this.f16122a) {
            case 0:
                e eVar = (e) this.f16125d;
                if (!eVar.f16131f) {
                    eVar.b(this.f16123b, this.f16124c);
                }
                break;
            default:
                vh.d dVar = (vh.d) this.f16125d;
                if (!dVar.f42334f) {
                    dVar.b(this.f16123b, this.f16124c);
                }
                break;
        }
    }
}
