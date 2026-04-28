package hb0;

import androidx.datastore.core.CorruptionException;
import b5.q2;
import com.app.tgtg.model.remote.item.response.CharityItem;
import com.app.tgtg.model.remote.order.response.OrdersData;
import i3.e0;
import j5.b0;
import j5.z;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.bouncycastle.iana.AEADAlgorithm;
import y9.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21782a;

    public /* synthetic */ q(int i11) {
        this.f21782a = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws IllegalAccessException, InvocationTargetException {
        int i11 = 1;
        switch (this.f21782a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                ((List) obj).getClass();
                break;
            case 5:
                break;
            case 6:
                int i12 = hq.u.f22406h;
                ((List) obj).getClass();
                break;
            case 7:
                break;
            case 8:
                List list = (List) obj;
                Object obj2 = list.get(0);
                obj2.getClass();
                int iIntValue = ((Integer) obj2).intValue();
                Object obj3 = list.get(1);
                obj3.getClass();
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
                q2 q2Var = (q2) obj;
                q2Var.getClass();
                e0 e0Var = (e0) q2Var;
                e0Var.f23111p = false;
                b5.m.g(e0Var).G();
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
                KClass kClass = (KClass) obj;
                kClass.getClass();
                KSerializer kSerializerK = ba0.g.K(kClass);
                if (kSerializerK == null) {
                    if (w.v(kClass).isInterface()) {
                    }
                }
                break;
            case 21:
                KClass kClass2 = (KClass) obj;
                kClass2.getClass();
                KSerializer kSerializerK2 = ba0.g.K(kClass2);
                if (kSerializerK2 == null) {
                    kSerializerK2 = w.v(kClass2).isInterface() ? new i90.d(kClass2) : null;
                }
                if (kSerializerK2 != null) {
                }
                break;
            case 22:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                StringBuilder sbR = e0.f.r(str, " : ");
                if (value instanceof Object[]) {
                    value = Arrays.toString((Object[]) value);
                    value.getClass();
                }
                sbR.append(value);
                break;
            case 23:
                break;
            case 24:
                CharityItem charityItem = (CharityItem) obj;
                charityItem.getClass();
                break;
            case 25:
                OrdersData ordersData = (OrdersData) obj;
                ordersData.getClass();
                break;
            case 26:
                b0 b0Var = (b0) obj;
                b0Var.getClass();
                z.m(b0Var, 1);
                break;
            case 27:
                ((CorruptionException) obj).getClass();
                break;
            case 28:
                ((CorruptionException) obj).getClass();
                break;
            default:
                ((CorruptionException) obj).getClass();
                break;
        }
        return w0.e.o();
    }
}
