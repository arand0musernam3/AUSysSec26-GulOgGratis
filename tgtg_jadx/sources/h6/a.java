package h6;

import b3.i;
import com.adyen.checkout.components.core.Address;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f21494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f21497d;

    public static String a(int i11) {
        return "#".concat(("00000000" + Integer.toHexString(i11)).substring(r2.length() - 8));
    }

    public final String toString() {
        String strF = l1.f(new StringBuilder(), this.f21494a, ':');
        switch (this.f21495b) {
            case 900:
                StringBuilder sbO = i.o(strF);
                sbO.append(this.f21496c);
                return sbO.toString();
            case 901:
                StringBuilder sbO2 = i.o(strF);
                sbO2.append(this.f21497d);
                return sbO2.toString();
            case 902:
                return strF.concat(a(this.f21496c));
            case 903:
                return strF.concat(Address.ADDRESS_NULL_PLACEHOLDER);
            default:
                return strF.concat("????");
        }
    }
}
