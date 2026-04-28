package kotlin.time;

import kotlin.Metadata;
import p80.a;
import p80.v;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/time/AbstractDoubleTimeSource;", "", "p80/a", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
@d
public abstract class AbstractDoubleTimeSource implements v {
    @Override // p80.v
    public final TimeMark a() {
        double dB = b();
        p80.d.f34559b.getClass();
        return new a(dB, this, 0L, null);
    }

    public abstract double b();
}
