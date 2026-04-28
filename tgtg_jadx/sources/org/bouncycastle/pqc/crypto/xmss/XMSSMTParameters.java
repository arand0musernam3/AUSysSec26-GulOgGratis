package org.bouncycastle.pqc.crypto.xmss;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes3.dex */
public final class XMSSMTParameters {
    private static final Map<Integer, XMSSMTParameters> paramsLookupTable;
    private final int height;
    private final int layers;
    private final XMSSOid oid;
    private final XMSSParameters xmssParams;

    static {
        HashMap map = new HashMap();
        Integer numValueOf = Integers.valueOf(1);
        ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.id_sha256;
        map.put(numValueOf, new XMSSMTParameters(20, 2, aSN1ObjectIdentifier));
        a.u(20, 4, aSN1ObjectIdentifier, map, Integers.valueOf(2));
        a.u(40, 2, aSN1ObjectIdentifier, map, Integers.valueOf(3));
        a.u(40, 4, aSN1ObjectIdentifier, map, Integers.valueOf(4));
        a.u(40, 8, aSN1ObjectIdentifier, map, Integers.valueOf(5));
        a.u(60, 3, aSN1ObjectIdentifier, map, Integers.valueOf(6));
        a.u(60, 6, aSN1ObjectIdentifier, map, Integers.valueOf(7));
        a.u(60, 12, aSN1ObjectIdentifier, map, Integers.valueOf(8));
        Integer numValueOf2 = Integers.valueOf(9);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_sha512;
        map.put(numValueOf2, new XMSSMTParameters(20, 2, aSN1ObjectIdentifier2));
        a.u(20, 4, aSN1ObjectIdentifier2, map, Integers.valueOf(10));
        a.u(40, 2, aSN1ObjectIdentifier2, map, Integers.valueOf(11));
        a.u(40, 4, aSN1ObjectIdentifier2, map, Integers.valueOf(12));
        a.u(40, 8, aSN1ObjectIdentifier2, map, Integers.valueOf(13));
        a.u(60, 3, aSN1ObjectIdentifier2, map, Integers.valueOf(14));
        a.u(60, 6, aSN1ObjectIdentifier2, map, Integers.valueOf(15));
        a.u(60, 12, aSN1ObjectIdentifier2, map, Integers.valueOf(16));
        Integer numValueOf3 = Integers.valueOf(17);
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.id_shake128;
        map.put(numValueOf3, new XMSSMTParameters(20, 2, aSN1ObjectIdentifier3));
        a.u(20, 4, aSN1ObjectIdentifier3, map, Integers.valueOf(18));
        a.u(40, 2, aSN1ObjectIdentifier3, map, Integers.valueOf(19));
        a.u(40, 4, aSN1ObjectIdentifier3, map, Integers.valueOf(20));
        a.u(40, 8, aSN1ObjectIdentifier3, map, Integers.valueOf(21));
        a.u(60, 3, aSN1ObjectIdentifier3, map, Integers.valueOf(22));
        a.u(60, 6, aSN1ObjectIdentifier3, map, Integers.valueOf(23));
        a.u(60, 12, aSN1ObjectIdentifier3, map, Integers.valueOf(24));
        Integer numValueOf4 = Integers.valueOf(25);
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NISTObjectIdentifiers.id_shake256;
        map.put(numValueOf4, new XMSSMTParameters(20, 2, aSN1ObjectIdentifier4));
        a.u(20, 4, aSN1ObjectIdentifier4, map, Integers.valueOf(26));
        a.u(40, 2, aSN1ObjectIdentifier4, map, Integers.valueOf(27));
        a.u(40, 4, aSN1ObjectIdentifier4, map, Integers.valueOf(28));
        a.u(40, 8, aSN1ObjectIdentifier4, map, Integers.valueOf(29));
        a.u(60, 3, aSN1ObjectIdentifier4, map, Integers.valueOf(30));
        a.u(60, 6, aSN1ObjectIdentifier4, map, Integers.valueOf(31));
        a.u(60, 12, aSN1ObjectIdentifier4, map, Integers.valueOf(32));
        paramsLookupTable = Collections.unmodifiableMap(map);
    }

    public XMSSMTParameters(int i11, int i12, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.height = i11;
        this.layers = i12;
        this.xmssParams = new XMSSParameters(xmssTreeHeight(i11, i12), aSN1ObjectIdentifier);
        this.oid = DefaultXMSSMTOid.lookup(getTreeDigest(), getTreeDigestSize(), getWinternitzParameter(), getLen(), getHeight(), i12);
    }

    public static XMSSMTParameters lookupByOID(int i11) {
        return paramsLookupTable.get(Integers.valueOf(i11));
    }

    private static int xmssTreeHeight(int i11, int i12) throws IllegalArgumentException {
        String str;
        if (i11 < 2) {
            str = "totalHeight must be > 1";
        } else if (i11 % i12 == 0) {
            int i13 = i11 / i12;
            if (i13 != 1) {
                return i13;
            }
            str = "height / layers must be greater than 1";
        } else {
            str = "layers must divide totalHeight without remainder";
        }
        i4.a.f(str);
        return 0;
    }

    public int getHeight() {
        return this.height;
    }

    public int getLayers() {
        return this.layers;
    }

    public int getLen() {
        return this.xmssParams.getLen();
    }

    public XMSSOid getOid() {
        return this.oid;
    }

    public String getTreeDigest() {
        return this.xmssParams.getTreeDigest();
    }

    public ASN1ObjectIdentifier getTreeDigestOID() {
        return this.xmssParams.getTreeDigestOID();
    }

    public int getTreeDigestSize() {
        return this.xmssParams.getTreeDigestSize();
    }

    public WOTSPlus getWOTSPlus() {
        return this.xmssParams.getWOTSPlus();
    }

    public int getWinternitzParameter() {
        return this.xmssParams.getWinternitzParameter();
    }

    public XMSSParameters getXMSSParameters() {
        return this.xmssParams;
    }

    public XMSSMTParameters(int i11, int i12, Digest digest) {
        this(i11, i12, DigestUtil.getDigestOID(digest.getAlgorithmName()));
    }
}
