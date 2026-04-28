package org.bouncycastle.pqc.crypto.xmss;

import c50.w;
import com.app.tgtg.model.local.AppConstants;
import e0.f;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class WOTSPlusOid implements XMSSOid {
    private static final Map<String, WOTSPlusOid> oidLookupTable;
    private final int oid;
    private final String stringRepresentation;

    static {
        HashMap map = new HashMap();
        map.put(createKey("SHA-256", 32, 16, 67), new WOTSPlusOid(16777217, "WOTSP_SHA2-256_W16"));
        map.put(createKey("SHA-512", 64, 16, AppConstants.RESULT_CODE_ORDER_NOT_COLLECTED), new WOTSPlusOid(33554434, "WOTSP_SHA2-512_W16"));
        map.put(createKey("SHAKE128", 32, 16, 67), new WOTSPlusOid(50331651, "WOTSP_SHAKE128_W16"));
        map.put(createKey("SHAKE256", 64, 16, AppConstants.RESULT_CODE_ORDER_NOT_COLLECTED), new WOTSPlusOid(67108868, "WOTSP_SHAKE256_W16"));
        oidLookupTable = Collections.unmodifiableMap(map);
    }

    private WOTSPlusOid(int i11, String str) {
        this.oid = i11;
        this.stringRepresentation = str;
    }

    private static String createKey(String str, int i11, int i12, int i13) {
        if (str == null) {
            w.l("algorithmName == null");
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("-");
        sb2.append(i11);
        sb2.append("-");
        sb2.append(i12);
        return f.h(i13, "-", sb2);
    }

    public static WOTSPlusOid lookup(String str, int i11, int i12, int i13) {
        if (str != null) {
            return oidLookupTable.get(createKey(str, i11, i12, i13));
        }
        w.l("algorithmName == null");
        return null;
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSOid
    public int getOid() {
        return this.oid;
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSOid
    public String toString() {
        return this.stringRepresentation;
    }
}
