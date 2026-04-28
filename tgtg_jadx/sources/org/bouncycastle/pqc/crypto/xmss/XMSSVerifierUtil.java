package org.bouncycastle.pqc.crypto.xmss;

import c50.w;
import i4.a;
import org.bouncycastle.pqc.crypto.xmss.HashTreeAddress;
import org.bouncycastle.pqc.crypto.xmss.LTreeAddress;

/* JADX INFO: loaded from: classes3.dex */
class XMSSVerifierUtil {
    public static XMSSNode getRootNodeFromSignature(WOTSPlus wOTSPlus, int i11, byte[] bArr, XMSSReducedSignature xMSSReducedSignature, OTSHashAddress oTSHashAddress, int i12) {
        String str;
        if (bArr.length != wOTSPlus.getParams().getTreeDigestSize()) {
            a.f("size of messageDigest needs to be equal to size of digest");
            return null;
        }
        if (xMSSReducedSignature == null) {
            str = "signature == null";
        } else {
            if (oTSHashAddress != null) {
                LTreeAddress lTreeAddress = (LTreeAddress) new LTreeAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).withLTreeAddress(oTSHashAddress.getOTSAddress()).build();
                HashTreeAddress hashTreeAddress = (HashTreeAddress) new HashTreeAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).withTreeIndex(oTSHashAddress.getOTSAddress()).build();
                XMSSNode[] xMSSNodeArr = new XMSSNode[2];
                xMSSNodeArr[0] = XMSSNodeUtil.lTree(wOTSPlus, wOTSPlus.getPublicKeyFromSignature(bArr, xMSSReducedSignature.getWOTSPlusSignature(), oTSHashAddress), lTreeAddress);
                for (int i13 = 0; i13 < i11; i13++) {
                    HashTreeAddress hashTreeAddress2 = (HashTreeAddress) new HashTreeAddress.Builder().withLayerAddress(hashTreeAddress.getLayerAddress()).withTreeAddress(hashTreeAddress.getTreeAddress()).withTreeHeight(i13).withTreeIndex(hashTreeAddress.getTreeIndex()).withKeyAndMask(hashTreeAddress.getKeyAndMask()).build();
                    if (Math.floor(i12 / (1 << i13)) % 2.0d == 0.0d) {
                        hashTreeAddress = (HashTreeAddress) new HashTreeAddress.Builder().withLayerAddress(hashTreeAddress2.getLayerAddress()).withTreeAddress(hashTreeAddress2.getTreeAddress()).withTreeHeight(hashTreeAddress2.getTreeHeight()).withTreeIndex(hashTreeAddress2.getTreeIndex() / 2).withKeyAndMask(hashTreeAddress2.getKeyAndMask()).build();
                        XMSSNode xMSSNodeRandomizeHash = XMSSNodeUtil.randomizeHash(wOTSPlus, xMSSNodeArr[0], xMSSReducedSignature.getAuthPath().get(i13), hashTreeAddress);
                        xMSSNodeArr[1] = xMSSNodeRandomizeHash;
                        xMSSNodeArr[1] = new XMSSNode(xMSSNodeRandomizeHash.getHeight() + 1, xMSSNodeArr[1].getValue());
                    } else {
                        hashTreeAddress = (HashTreeAddress) new HashTreeAddress.Builder().withLayerAddress(hashTreeAddress2.getLayerAddress()).withTreeAddress(hashTreeAddress2.getTreeAddress()).withTreeHeight(hashTreeAddress2.getTreeHeight()).withTreeIndex((hashTreeAddress2.getTreeIndex() - 1) / 2).withKeyAndMask(hashTreeAddress2.getKeyAndMask()).build();
                        XMSSNode xMSSNodeRandomizeHash2 = XMSSNodeUtil.randomizeHash(wOTSPlus, xMSSReducedSignature.getAuthPath().get(i13), xMSSNodeArr[0], hashTreeAddress);
                        xMSSNodeArr[1] = xMSSNodeRandomizeHash2;
                        xMSSNodeArr[1] = new XMSSNode(xMSSNodeRandomizeHash2.getHeight() + 1, xMSSNodeArr[1].getValue());
                    }
                    xMSSNodeArr[0] = xMSSNodeArr[1];
                }
                return xMSSNodeArr[0];
            }
            str = "otsHashAddress == null";
        }
        w.l(str);
        return null;
    }
}
