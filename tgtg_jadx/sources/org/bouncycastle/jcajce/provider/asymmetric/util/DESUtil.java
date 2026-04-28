package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.internal.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes3.dex */
public class DESUtil {
    private static final Set<String> des;

    static {
        HashSet hashSet = new HashSet();
        des = hashSet;
        hashSet.add("DES");
        hashSet.add("DESEDE");
        hashSet.add(OIWObjectIdentifiers.desCBC.getId());
        hashSet.add(PKCSObjectIdentifiers.des_EDE3_CBC.getId());
        hashSet.add(PKCSObjectIdentifiers.id_alg_CMS3DESwrap.getId());
    }

    public static boolean isDES(String str) {
        return des.contains(Strings.toUpperCase(str));
    }

    public static void setOddParity(byte[] bArr) {
        for (int i11 = 0; i11 < bArr.length; i11++) {
            byte b8 = bArr[i11];
            bArr[i11] = (byte) (((((b8 >> 7) ^ ((((((b8 >> 1) ^ (b8 >> 2)) ^ (b8 >> 3)) ^ (b8 >> 4)) ^ (b8 >> 5)) ^ (b8 >> 6))) ^ 1) & 1) | (b8 & 254));
        }
    }
}
