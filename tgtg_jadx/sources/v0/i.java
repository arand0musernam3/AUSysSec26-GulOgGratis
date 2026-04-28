package v0;

import android.util.Pair;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f41607c = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f41608d = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f41609e = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ArrayList f41610f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f41611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ByteOrder f41612b;

    static {
        g gVar = new g(0);
        gVar.f41605b = 0;
        f41610f = Collections.list(gVar);
    }

    public i() {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        g gVar = new g(1);
        gVar.f41605b = 0;
        this.f41611a = Collections.list(gVar);
        this.f41612b = byteOrder;
    }

    public static Pair a(String str) {
        if (str.contains(MessageLogView.COMMA_SEPARATOR)) {
            String[] strArrSplit = str.split(MessageLogView.COMMA_SEPARATOR, -1);
            Pair pairA = a(strArrSplit[0]);
            if (((Integer) pairA.first).intValue() == 2) {
                return pairA;
            }
            for (int i11 = 1; i11 < strArrSplit.length; i11++) {
                Pair pairA2 = a(strArrSplit[i11]);
                int iIntValue = (((Integer) pairA2.first).equals(pairA.first) || ((Integer) pairA2.second).equals(pairA.first)) ? ((Integer) pairA.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairA.second).intValue() == -1 || !(((Integer) pairA2.first).equals(pairA.second) || ((Integer) pairA2.second).equals(pairA.second))) ? -1 : ((Integer) pairA.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (iIntValue == -1) {
                    pairA = new Pair(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairA = new Pair(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairA;
        }
        if (!str.contains(ExpiryDateInput.SEPARATOR)) {
            try {
                try {
                    long j9 = Long.parseLong(str);
                    return (j9 < 0 || j9 > 65535) ? j9 < 0 ? new Pair(9, -1) : new Pair(4, -1) : new Pair(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair(12, -1);
            }
        }
        String[] strArrSplit2 = str.split(ExpiryDateInput.SEPARATOR, -1);
        if (strArrSplit2.length == 2) {
            try {
                long j11 = (long) Double.parseDouble(strArrSplit2[0]);
                long j12 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j11 >= 0 && j12 >= 0) {
                    if (j11 <= 2147483647L && j12 <= 2147483647L) {
                        return new Pair(10, 5);
                    }
                    return new Pair(5, -1);
                }
                return new Pair(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair(2, -1);
    }

    public final void b(String str, String str2, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((Map) it.next()).containsKey(str)) {
                return;
            }
        }
        c(str, str2, arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0174, code lost:
    
        if (r6 != 2) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.String r20, java.lang.String r21, java.util.List r22) {
        /*
            Method dump skipped, instruction units count: 1050
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.i.c(java.lang.String, java.lang.String, java.util.List):void");
    }

    public final void d(int i11) {
        int i12;
        if (i11 == 0) {
            i12 = 1;
        } else if (i11 == 90) {
            i12 = 6;
        } else if (i11 == 180) {
            i12 = 3;
        } else if (i11 != 270) {
            wd.a.I("ExifData", "Unexpected orientation value: " + i11 + ". Must be one of 0, 90, 180, 270.");
            i12 = 0;
        } else {
            i12 = 8;
        }
        c("Orientation", String.valueOf(i12), this.f41611a);
    }
}
