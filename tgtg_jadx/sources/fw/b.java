package fw;

import com.braze.models.response.m;
import d2.b2;
import g2.b0;
import g3.d1;
import g3.e1;
import g3.e5;
import g3.ga;
import g3.i;
import g3.j4;
import g3.k6;
import g3.ka;
import g3.la;
import g3.o2;
import g3.r0;
import g3.r5;
import g3.t2;
import g3.w0;
import g3.x0;
import g3.z3;
import i4.v;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import m3.d3;
import m3.e0;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.iana.AEADAlgorithm;
import z4.o;
import z5.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17971a;

    public /* synthetic */ b(int i11) {
        this.f17971a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f17971a) {
            case 0:
                return m.d();
            case 1:
                return m.i();
            case 2:
                return m.h();
            case 3:
                return m.f();
            case 4:
                return m.e();
            case 5:
                return m.b();
            case 6:
                return m.c();
            case 7:
                return m.a();
            case 8:
                return m.g();
            case 9:
                return new b0(0, 0);
            case 10:
                float f11 = g3.a.f18299a;
                return w0.f19674a;
            case 11:
                e0 e0Var = i.f18791a;
                return d1.f18440a;
            case 12:
                e0 e0Var2 = i.f18791a;
                return e1.f18509a;
            case 13:
                return new ka(-3.4028235E38f, 0.0f, 0.0f);
            case 14:
                return r0.f(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                d3 d3Var = r0.f19375a;
                return Boolean.TRUE;
            case 16:
                return Float.valueOf(1.0f);
            case 17:
                o oVar = o2.f19198a;
                return Boolean.TRUE;
            case 18:
                return new f(48);
            case 19:
                d3 d3Var2 = t2.f19507a;
                return Boolean.FALSE;
            case 20:
                return z3.f19876a;
            case 21:
                return UUID.randomUUID();
            case 22:
                float f12 = j4.f18882a;
                return x0.f19745a;
            case 23:
                int i11 = e5.f18525a;
                return Boolean.FALSE;
            case 24:
                return new r5(v.f23315h, null);
            case 25:
                return new k6();
            case 26:
                return new f(0);
            case 27:
                return l3.e1.f26950a;
            case 28:
                b2 b2Var = ga.f18696a;
                return Boolean.TRUE;
            default:
                return new la();
        }
    }
}
