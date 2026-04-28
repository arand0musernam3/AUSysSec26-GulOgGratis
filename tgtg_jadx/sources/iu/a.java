package iu;

import android.database.sqlite.SQLiteDatabase;
import android.os.StatFs;
import com.app.tgtg.customview.manufactureaddressfragment.AddressEditText;
import com.app.tgtg.feature.tabdiscover.discoverbuckets.loyaltycardpromo.DiscoverLoyaltyCardPromoView;
import ia0.a0;
import ia0.m;
import ia0.w;
import ja.b;
import java.io.File;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import n80.p;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24199a;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, u70.j] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f24199a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                } catch (Throwable unused) {
                    return null;
                }
                break;
            case 22:
                try {
                    Method method = (Method) b.f24768d.getValue();
                    if (method != null && (r0 = method.getReturnType()) != null) {
                        Class cls = Integer.TYPE;
                        break;
                    }
                } catch (Throwable unused2) {
                    return null;
                }
                break;
            case 23:
                break;
            case 24:
                w wVar = m.f23661a;
                g gVar = g.f26549a;
                a0 a0VarF = m.f23662b.f("coil3_disk_cache");
                long jD = 10485760;
                try {
                    File file = a0VarF.toFile();
                    file.mkdir();
                    StatFs statFs = new StatFs(file.getAbsolutePath());
                    jD = p.d((long) (0.02d * statFs.getBlockSizeLong() * statFs.getBlockCountLong()), 10485760L, 262144000L);
                    break;
                } catch (Exception unused3) {
                }
                break;
            case 25:
                int i11 = AddressEditText.f8926f;
                break;
            case 26:
                sa0.a.f38953a.a("Badges: Wiggle", new Object[0]);
                break;
            case 27:
                sa0.a.f38953a.a("Badges: Snap", new Object[0]);
                break;
            case 28:
                sa0.a.f38953a.a("Badges: Clap", new Object[0]);
                break;
            default:
                int i12 = DiscoverLoyaltyCardPromoView.l;
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ a(int i11) {
        this.f24199a = i11;
    }
}
