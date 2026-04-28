package defpackage;

import android.content.res.Resources;
import android.graphics.DashPathEffect;
import android.util.Log;
import androidx.datastore.core.CorruptionException;
import cb.k;
import com.app.tgtg.model.remote.item.ItemTagInfo;
import e0.k0;
import e0.n1;
import h4.b;
import i4.i;
import j5.a0;
import j5.b0;
import j5.x;
import j5.z;
import k4.d;
import k4.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import lv.s;
import org.bouncycastle.iana.AEADAlgorithm;
import t1.l;
import wd.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17994a;

    public /* synthetic */ g(int i11) {
        this.f17994a = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f17994a) {
            case 0:
                ((d) obj).getClass();
                break;
            case 1:
                b bVar = (b) obj;
                long j9 = bVar.f21378a;
                if ((9223372034707292159L & j9) == 9205357640488583168L) {
                }
                break;
            case 2:
                l lVar = (l) obj;
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                Resources resources = (Resources) obj;
                resources.getClass();
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                ((k0) obj).getClass();
                break;
            case 9:
                if (a.B(3, "CXCP")) {
                    Log.d("CXCP", "setTorchIfRequired: torch control completed");
                }
                break;
            case 10:
                if (a.B(3, "CXCP")) {
                    Log.d("CXCP", "setExternalFlashAeModeAsync: state3AControl.updateSignal completed");
                }
                break;
            case 11:
                ((n1) obj).getClass();
                break;
            case 12:
                KProperty[] kPropertyArr = z.f24734a;
                a0 a0Var = x.l;
                KProperty kProperty = z.f24734a[5];
                ((b0) obj).b(a0Var, Boolean.TRUE);
                break;
            case 13:
                ((ItemTagInfo) obj).getClass();
                break;
            case 14:
                ((ItemTagInfo) obj).getClass();
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                ((String) obj).getClass();
                break;
            case 16:
                CorruptionException corruptionException = (CorruptionException) obj;
                corruptionException.getClass();
                Log.w("FirebaseSessions", "CorruptionException in session configs DataStore", corruptionException);
                break;
            case 17:
                break;
            case 18:
                k kVar = (k) obj;
                kVar.getClass();
                break;
            case 19:
                break;
            case 20:
                b0 b0Var = (b0) obj;
                b0Var.getClass();
                z.k(b0Var, 0);
                break;
            case 21:
                ((Integer) obj).getClass();
                break;
            case 22:
                break;
            case 23:
                ((Boolean) obj).booleanValue();
                break;
            case 24:
                ((Boolean) obj).booleanValue();
                break;
            case 25:
                ((Boolean) obj).booleanValue();
                break;
            case 26:
                ((Boolean) obj).booleanValue();
                break;
            case 27:
                ((Boolean) obj).booleanValue();
                break;
            case 28:
                ((Boolean) obj).booleanValue();
                break;
            default:
                d dVar = (d) obj;
                dVar.getClass();
                long j11 = s.f28217b;
                h hVar = new h(d70.b.d(2), 0.0f, 0, 0, new i(new DashPathEffect(new float[]{15.0f, 15.0f}, 0.0f)), 14);
                float fC0 = dVar.c0(12);
                d.M(dVar, j11, 0L, 0L, (((long) Float.floatToRawIntBits(fC0)) << 32) | (((long) Float.floatToRawIntBits(fC0)) & 4294967295L), hVar, 230);
                break;
        }
        return Unit.f26487a;
    }
}
