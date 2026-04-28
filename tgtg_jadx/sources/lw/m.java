package lw;

import com.braze.storage.m1;
import com.braze.storage.n0;
import com.braze.storage.s;
import com.braze.storage.t2;
import com.braze.storage.u;
import com.braze.storage.u3;
import com.braze.storage.w1;
import com.braze.storage.w2;
import com.braze.storage.x1;
import com.braze.storage.z2;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeImageUtils;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f28323b;

    public /* synthetic */ m(String str, int i11) {
        this.f28322a = i11;
        this.f28323b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f28322a) {
            case 0:
                return com.braze.storage.j.a(this.f28323b);
            case 1:
                return m1.a(this.f28323b);
            case 2:
                return n0.a(this.f28323b);
            case 3:
                return com.braze.storage.p.c(this.f28323b);
            case 4:
                return com.braze.storage.p.l(this.f28323b);
            case 5:
                return com.braze.storage.p.m(this.f28323b);
            case 6:
                return com.braze.storage.p.n(this.f28323b);
            case 7:
                return com.braze.storage.p.e(this.f28323b);
            case 8:
                return com.braze.storage.p.g(this.f28323b);
            case 9:
                return com.braze.storage.p.h(this.f28323b);
            case 10:
                return com.braze.storage.p.j(this.f28323b);
            case 11:
                return com.braze.storage.p.d(this.f28323b);
            case 12:
                return com.braze.storage.p.o(this.f28323b);
            case 13:
                return com.braze.storage.p.p(this.f28323b);
            case 14:
                return com.braze.storage.p.k(this.f28323b);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return com.braze.storage.r.a(this.f28323b);
            case 16:
                return s.a(this.f28323b);
            case 17:
                return t2.b(this.f28323b);
            case 18:
                return u.a(this.f28323b);
            case 19:
                return u3.a(this.f28323b);
            case 20:
                return w1.a(this.f28323b);
            case 21:
                return w2.a(this.f28323b);
            case 22:
                return w2.b(this.f28323b);
            case 23:
                return w2.c(this.f28323b);
            case 24:
                return x1.a(this.f28323b);
            case 25:
                return z2.a(this.f28323b);
            case 26:
                return BrazeFileUtils.downloadFileToPath$lambda$14(this.f28323b);
            case 27:
                return BrazeFileUtils.downloadFileToPath$lambda$7(this.f28323b);
            case 28:
                return BrazeImageUtils.getRemoteBitmap$lambda$17(this.f28323b);
            default:
                return BrazeLogger.d$lambda$3(this.f28323b);
        }
    }
}
