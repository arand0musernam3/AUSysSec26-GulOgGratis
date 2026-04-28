package lw;

import com.braze.storage.u0;
import com.braze.storage.u3;
import com.braze.storage.v0;
import com.braze.storage.w;
import com.braze.storage.w2;
import com.braze.storage.x1;
import com.braze.storage.y0;
import i4.g0;
import i4.x0;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import m2.a0;
import m3.d3;
import m3.v;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28330a;

    public /* synthetic */ p(int i11) {
        this.f28330a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f28330a) {
            case 0:
                return u0.c();
            case 1:
                return u0.d();
            case 2:
                return u0.a();
            case 3:
                return u3.i();
            case 4:
                return u3.d();
            case 5:
                return u3.k();
            case 6:
                return u3.e();
            case 7:
                return u3.f();
            case 8:
                return v0.h();
            case 9:
                return v0.i();
            case 10:
                return v0.j();
            case 11:
                return v0.f();
            case 12:
                return v0.d();
            case 13:
                return w.a();
            case 14:
                return w.a("Failed to clear all data in file.");
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return w2.a();
            case 16:
                return w2.c();
            case 17:
                return w2.b();
            case 18:
                return x1.a();
            case 19:
                return x1.b();
            case 20:
                return x1.d();
            case 21:
                return y0.a();
            case 22:
                return new x0(g0.c(1308617531));
            case 23:
                d3 d3Var = a0.f28759a;
                return null;
            case 24:
                return new z5.j(0L);
            case 25:
                return new z5.j(0L);
            case 26:
                v.b("Unexpected call to default provider");
                throw new KotlinNothingValueException();
            case 27:
                return Unit.f26487a;
            case 28:
                return Unit.f26487a;
            default:
                return Unit.f26487a;
        }
    }
}
