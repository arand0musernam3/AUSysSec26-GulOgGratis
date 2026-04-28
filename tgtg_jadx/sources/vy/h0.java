package vy;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public enum h0 {
    MOBILE(0),
    WIFI(1),
    MOBILE_MMS(2),
    MOBILE_SUPL(3),
    MOBILE_DUN(4),
    MOBILE_HIPRI(5),
    WIMAX(6),
    BLUETOOTH(7),
    DUMMY(8),
    ETHERNET(9),
    MOBILE_FOTA(10),
    MOBILE_IMS(11),
    MOBILE_CBS(12),
    WIFI_P2P(13),
    MOBILE_IA(14),
    MOBILE_EMERGENCY(15),
    PROXY(16),
    VPN(17),
    NONE(-1);

    private static final SparseArray<h0> valueMap;
    private final int value;

    static {
        h0 h0Var = MOBILE;
        h0 h0Var2 = WIFI;
        h0 h0Var3 = MOBILE_MMS;
        h0 h0Var4 = MOBILE_SUPL;
        h0 h0Var5 = MOBILE_DUN;
        h0 h0Var6 = MOBILE_HIPRI;
        h0 h0Var7 = WIMAX;
        h0 h0Var8 = BLUETOOTH;
        h0 h0Var9 = DUMMY;
        h0 h0Var10 = ETHERNET;
        h0 h0Var11 = MOBILE_FOTA;
        h0 h0Var12 = MOBILE_IMS;
        h0 h0Var13 = MOBILE_CBS;
        h0 h0Var14 = WIFI_P2P;
        h0 h0Var15 = MOBILE_IA;
        h0 h0Var16 = MOBILE_EMERGENCY;
        h0 h0Var17 = PROXY;
        h0 h0Var18 = VPN;
        h0 h0Var19 = NONE;
        SparseArray<h0> sparseArray = new SparseArray<>();
        valueMap = sparseArray;
        sparseArray.put(0, h0Var);
        sparseArray.put(1, h0Var2);
        sparseArray.put(2, h0Var3);
        sparseArray.put(3, h0Var4);
        sparseArray.put(4, h0Var5);
        sparseArray.put(5, h0Var6);
        sparseArray.put(6, h0Var7);
        sparseArray.put(7, h0Var8);
        sparseArray.put(8, h0Var9);
        sparseArray.put(9, h0Var10);
        sparseArray.put(10, h0Var11);
        sparseArray.put(11, h0Var12);
        sparseArray.put(12, h0Var13);
        sparseArray.put(13, h0Var14);
        sparseArray.put(14, h0Var15);
        sparseArray.put(15, h0Var16);
        sparseArray.put(16, h0Var17);
        sparseArray.put(17, h0Var18);
        sparseArray.put(-1, h0Var19);
    }

    h0(int i11) {
        this.value = i11;
    }

    public static h0 a(int i11) {
        return valueMap.get(i11);
    }

    public final int c() {
        return this.value;
    }
}
