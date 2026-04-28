package a60;

import android.view.View;
import androidx.core.view.ViewCompat;
import com.app.tgtg.model.remote.brief.BriefOrder;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.user.response.charity.LocalDivergenceDay;
import com.app.tgtg.model.remote.voucher.DiscountVoucher;
import com.google.android.gms.common.api.Scope;
import hp.p1;
import java.io.File;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ r f907b = new r(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f908a;

    public /* synthetic */ r(int i11) {
        this.f908a = i11;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Long lValueOf;
        switch (this.f908a) {
            case 0:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 1:
                return w70.a.a(((DiscountVoucher) obj).getValidToUtc(), ((DiscountVoucher) obj2).getValidToUtc());
            case 2:
                return w70.a.a((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 3:
                return w70.a.a((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 4:
                return w70.a.a(((da.k) obj).f14832a, ((da.k) obj2).f14832a);
            case 5:
                return w70.a.a(((da.m) obj).f14844a, ((da.m) obj2).f14844a);
            case 6:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 7:
                ((sd.e) obj2).getClass();
                ((sd.e) obj).getClass();
                return w70.a.a(2, 2);
            case 8:
                ((wd.b) obj2).getClass();
                ((wd.b) obj).getClass();
                return w70.a.a(0, 0);
            case 9:
                return ((g6.h) obj).f20045b - ((g6.h) obj2).f20045b;
            case 10:
                return w70.a.a((String) ((Pair) obj).f26485a, (String) ((Pair) obj2).f26485a);
            case 11:
                return w70.a.a(Long.valueOf(((Order) obj).getTimeLeftToCollectWithGracePeriod()), Long.valueOf(((Order) obj2).getTimeLeftToCollectWithGracePeriod()));
            case 12:
                return w70.a.a(Long.valueOf(((Order) obj).getTimeLeftToCollectWithGracePeriod()), Long.valueOf(((Order) obj2).getTimeLeftToCollectWithGracePeriod()));
            case 13:
                return Integer.compare(((i6.f) obj).f23417a, ((i6.f) obj2).f23417a);
            case 14:
                return w70.a.a(((ja0.l) obj).f24817a, ((ja0.l) obj2).f24817a);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                Map.Entry entry = (Map.Entry) obj;
                Map.Entry entry2 = (Map.Entry) obj2;
                Objects.requireNonNull(entry);
                Objects.requireNonNull(entry2);
                Comparable comparable = (Comparable) entry.getKey();
                Comparable comparable2 = (Comparable) entry2.getKey();
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            case 16:
                return ((Scope) obj).f11053b.compareTo(((Scope) obj2).f11053b);
            case 17:
                return ((Scope) obj).f11053b.compareTo(((Scope) obj2).f11053b);
            case 18:
                Iterator it = ((List) ((Pair) obj2).f26486b).iterator();
                Long l = null;
                if (it.hasNext()) {
                    lValueOf = Long.valueOf(((p1) it.next()).f22318b);
                    while (it.hasNext()) {
                        Long lValueOf2 = Long.valueOf(((p1) it.next()).f22318b);
                        if (lValueOf.compareTo(lValueOf2) < 0) {
                            lValueOf = lValueOf2;
                        }
                    }
                } else {
                    lValueOf = null;
                }
                Long lValueOf3 = Long.valueOf(lValueOf != null ? lValueOf.longValue() : 0L);
                Iterator it2 = ((List) ((Pair) obj).f26486b).iterator();
                if (it2.hasNext()) {
                    Long lValueOf4 = Long.valueOf(((p1) it2.next()).f22318b);
                    while (true) {
                        l = lValueOf4;
                        while (it2.hasNext()) {
                            lValueOf4 = Long.valueOf(((p1) it2.next()).f22318b);
                            if (l.compareTo(lValueOf4) < 0) {
                            }
                            break;
                        }
                    }
                }
                return w70.a.a(lValueOf3, Long.valueOf(l != null ? l.longValue() : 0L));
            case 19:
                return w70.a.a(Long.valueOf(((p1) obj2).f22318b), Long.valueOf(((p1) obj).f22318b));
            case 20:
                return w70.a.a(((DiscountVoucher) obj).getValidToUtc(), ((DiscountVoucher) obj2).getValidToUtc());
            case 21:
                return w70.a.a(((File) obj).getName(), ((File) obj2).getName());
            case 22:
                return ((p50.e) obj).f34493d - ((p50.e) obj2).f34493d;
            case 23:
                float fD = ViewCompat.D((View) obj);
                float fD2 = ViewCompat.D((View) obj2);
                if (fD > fD2) {
                    return -1;
                }
                return fD < fD2 ? 1 : 0;
            case 24:
                return w70.a.a((String) ((Pair) obj2).f26485a, (String) ((Pair) obj).f26485a);
            case 25:
                return w70.a.a(((BriefOrder) obj2).getTimeOfPurchase(), ((BriefOrder) obj).getTimeOfPurchase());
            case 26:
                return ((ta.d) obj).f39888a - ((ta.d) obj2).f39888a;
            case 27:
                return w70.a.a(((LocalDivergenceDay) obj).getDate(), ((LocalDivergenceDay) obj2).getDate());
            default:
                return w70.a.a(Long.valueOf(((Order) obj2).getTimeLeftToCollect()), Long.valueOf(((Order) obj).getTimeLeftToCollect()));
        }
    }
}
