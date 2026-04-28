package xv;

import com.braze.images.DefaultBrazeImageLoader;
import com.braze.images.g;
import com.braze.managers.g0;
import com.braze.managers.j;
import com.braze.managers.k0;
import com.braze.managers.l0;
import com.braze.managers.n;
import com.braze.managers.r;
import com.braze.managers.v0;
import com.braze.managers.w;
import com.braze.managers.x;
import com.braze.managers.y0;
import com.braze.ui.support.UriUtils;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f44497b;

    public /* synthetic */ a(String str, int i11) {
        this.f44496a = i11;
        this.f44497b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f44496a) {
            case 0:
                return DefaultBrazeImageLoader.putBitmapIntoCache$lambda$21(this.f44497b);
            case 1:
                return DefaultBrazeImageLoader.putBitmapIntoCache$lambda$23$lambda$22(this.f44497b);
            case 2:
                return g.a(this.f44497b);
            case 3:
                return UriUtils.isActivityRegisteredInManifest$lambda$3(this.f44497b);
            case 4:
                return com.braze.managers.g.a(this.f44497b);
            case 5:
                return g0.a(this.f44497b);
            case 6:
                return j.g(this.f44497b);
            case 7:
                return j.h(this.f44497b);
            case 8:
                return j.b(this.f44497b);
            case 9:
                return j.c(this.f44497b);
            case 10:
                return j.e(this.f44497b);
            case 11:
                return j.d(this.f44497b);
            case 12:
                return k0.b(this.f44497b);
            case 13:
                return k0.e(this.f44497b);
            case 14:
                return l0.b(this.f44497b);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return l0.d(this.f44497b);
            case 16:
                return n.b(this.f44497b);
            case 17:
                return n.c(this.f44497b);
            case 18:
                return n.d(this.f44497b);
            case 19:
                return r.b(this.f44497b);
            case 20:
                return v0.b(this.f44497b);
            case 21:
                return w.b(this.f44497b);
            case 22:
                return w.d(this.f44497b);
            case 23:
                return x.a(this.f44497b);
            default:
                return y0.b(this.f44497b);
        }
    }
}
