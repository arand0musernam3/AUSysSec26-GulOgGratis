package e0;

import android.util.Size;
import com.adyen.checkout.components.core.Address;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Size f15314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d1 f15317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c1 f15318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f1 f15319f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g1 f15320g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f15321h;

    public b1(Size size, int i11, String str, d1 d1Var, c1 c1Var, f1 f1Var, g1 g1Var, List list) {
        size.getClass();
        this.f15314a = size;
        this.f15315b = i11;
        this.f15316c = str;
        this.f15317d = d1Var;
        this.f15318e = c1Var;
        this.f15319f = f1Var;
        this.f15320g = g1Var;
        this.f15321h = list;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Config(size=");
        sb2.append(this.f15314a);
        sb2.append(", format=");
        sb2.append((Object) o1.b(this.f15315b));
        sb2.append(", camera=");
        String str = this.f15316c;
        sb2.append((Object) (str == null ? Address.ADDRESS_NULL_PLACEHOLDER : s.b(str)));
        sb2.append(", mirrorMode=");
        sb2.append(this.f15317d);
        sb2.append(", timestampBase=null, dynamicRangeProfile=");
        sb2.append(this.f15318e);
        sb2.append(", streamUseCase=");
        sb2.append(this.f15319f);
        sb2.append(", streamUseHint=");
        sb2.append(this.f15320g);
        sb2.append(", sensorPixelModes=");
        sb2.append(this.f15321h);
        sb2.append(')');
        return sb2.toString();
    }
}
