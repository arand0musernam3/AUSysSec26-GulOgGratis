package org.bouncycastle.pqc.crypto.xmss;

import c50.w;
import com.braze.h2;
import org.bouncycastle.pqc.crypto.xmss.HashTreeAddress;
import org.bouncycastle.pqc.crypto.xmss.LTreeAddress;

/* JADX INFO: loaded from: classes3.dex */
class XMSSNodeUtil {
    public static XMSSNode lTree(WOTSPlus wOTSPlus, WOTSPlusPublicKeyParameters wOTSPlusPublicKeyParameters, LTreeAddress lTreeAddress) {
        String str;
        double d3;
        if (wOTSPlusPublicKeyParameters == null) {
            str = "publicKey == null";
        } else if (lTreeAddress != null) {
            int len = wOTSPlus.getParams().getLen();
            byte[][] byteArray = wOTSPlusPublicKeyParameters.toByteArray();
            XMSSNode[] xMSSNodeArr = new XMSSNode[byteArray.length];
            for (int i11 = 0; i11 < byteArray.length; i11++) {
                xMSSNodeArr[i11] = new XMSSNode(0, byteArray[i11]);
            }
            LTreeAddress.Builder builderWithKeyAndMask = new LTreeAddress.Builder().withLayerAddress(lTreeAddress.getLayerAddress()).withTreeAddress(lTreeAddress.getTreeAddress()).withLTreeAddress(lTreeAddress.getLTreeAddress()).withTreeHeight(0).withTreeIndex(lTreeAddress.getTreeIndex()).withKeyAndMask(lTreeAddress.getKeyAndMask());
            while (true) {
                LTreeAddress lTreeAddress2 = (LTreeAddress) builderWithKeyAndMask.build();
                if (len <= 1) {
                    return xMSSNodeArr[0];
                }
                int i12 = 0;
                while (true) {
                    d3 = len / 2;
                    if (i12 >= ((int) Math.floor(d3))) {
                        break;
                    }
                    lTreeAddress2 = (LTreeAddress) new LTreeAddress.Builder().withLayerAddress(lTreeAddress2.getLayerAddress()).withTreeAddress(lTreeAddress2.getTreeAddress()).withLTreeAddress(lTreeAddress2.getLTreeAddress()).withTreeHeight(lTreeAddress2.getTreeHeight()).withTreeIndex(i12).withKeyAndMask(lTreeAddress2.getKeyAndMask()).build();
                    int i13 = i12 * 2;
                    xMSSNodeArr[i12] = randomizeHash(wOTSPlus, xMSSNodeArr[i13], xMSSNodeArr[i13 + 1], lTreeAddress2);
                    i12++;
                }
                if (len % 2 == 1) {
                    xMSSNodeArr[(int) Math.floor(d3)] = xMSSNodeArr[len - 1];
                }
                len = (int) Math.ceil(((double) len) / 2.0d);
                builderWithKeyAndMask = new LTreeAddress.Builder().withLayerAddress(lTreeAddress2.getLayerAddress()).withTreeAddress(lTreeAddress2.getTreeAddress()).withLTreeAddress(lTreeAddress2.getLTreeAddress()).withTreeHeight(lTreeAddress2.getTreeHeight() + 1).withTreeIndex(lTreeAddress2.getTreeIndex()).withKeyAndMask(lTreeAddress2.getKeyAndMask());
            }
        } else {
            str = "address == null";
        }
        w.l(str);
        return null;
    }

    public static XMSSNode randomizeHash(WOTSPlus wOTSPlus, XMSSNode xMSSNode, XMSSNode xMSSNode2, XMSSAddress xMSSAddress) {
        String str;
        if (xMSSNode == null) {
            str = "left == null";
        } else if (xMSSNode2 == null) {
            str = "right == null";
        } else {
            if (xMSSNode.getHeight() != xMSSNode2.getHeight()) {
                h2.b("height of both nodes must be equal");
                return null;
            }
            if (xMSSAddress != null) {
                byte[] publicSeed = wOTSPlus.getPublicSeed();
                if (xMSSAddress instanceof LTreeAddress) {
                    LTreeAddress lTreeAddress = (LTreeAddress) xMSSAddress;
                    xMSSAddress = (LTreeAddress) new LTreeAddress.Builder().withLayerAddress(lTreeAddress.getLayerAddress()).withTreeAddress(lTreeAddress.getTreeAddress()).withLTreeAddress(lTreeAddress.getLTreeAddress()).withTreeHeight(lTreeAddress.getTreeHeight()).withTreeIndex(lTreeAddress.getTreeIndex()).withKeyAndMask(0).build();
                } else if (xMSSAddress instanceof HashTreeAddress) {
                    HashTreeAddress hashTreeAddress = (HashTreeAddress) xMSSAddress;
                    xMSSAddress = (HashTreeAddress) new HashTreeAddress.Builder().withLayerAddress(hashTreeAddress.getLayerAddress()).withTreeAddress(hashTreeAddress.getTreeAddress()).withTreeHeight(hashTreeAddress.getTreeHeight()).withTreeIndex(hashTreeAddress.getTreeIndex()).withKeyAndMask(0).build();
                }
                byte[] bArrPRF = wOTSPlus.getKhf().PRF(publicSeed, xMSSAddress.toByteArray());
                if (xMSSAddress instanceof LTreeAddress) {
                    LTreeAddress lTreeAddress2 = (LTreeAddress) xMSSAddress;
                    xMSSAddress = (LTreeAddress) new LTreeAddress.Builder().withLayerAddress(lTreeAddress2.getLayerAddress()).withTreeAddress(lTreeAddress2.getTreeAddress()).withLTreeAddress(lTreeAddress2.getLTreeAddress()).withTreeHeight(lTreeAddress2.getTreeHeight()).withTreeIndex(lTreeAddress2.getTreeIndex()).withKeyAndMask(1).build();
                } else if (xMSSAddress instanceof HashTreeAddress) {
                    HashTreeAddress hashTreeAddress2 = (HashTreeAddress) xMSSAddress;
                    xMSSAddress = (HashTreeAddress) new HashTreeAddress.Builder().withLayerAddress(hashTreeAddress2.getLayerAddress()).withTreeAddress(hashTreeAddress2.getTreeAddress()).withTreeHeight(hashTreeAddress2.getTreeHeight()).withTreeIndex(hashTreeAddress2.getTreeIndex()).withKeyAndMask(1).build();
                }
                byte[] bArrPRF2 = wOTSPlus.getKhf().PRF(publicSeed, xMSSAddress.toByteArray());
                if (xMSSAddress instanceof LTreeAddress) {
                    LTreeAddress lTreeAddress3 = (LTreeAddress) xMSSAddress;
                    xMSSAddress = (LTreeAddress) new LTreeAddress.Builder().withLayerAddress(lTreeAddress3.getLayerAddress()).withTreeAddress(lTreeAddress3.getTreeAddress()).withLTreeAddress(lTreeAddress3.getLTreeAddress()).withTreeHeight(lTreeAddress3.getTreeHeight()).withTreeIndex(lTreeAddress3.getTreeIndex()).withKeyAndMask(2).build();
                } else if (xMSSAddress instanceof HashTreeAddress) {
                    HashTreeAddress hashTreeAddress3 = (HashTreeAddress) xMSSAddress;
                    xMSSAddress = (HashTreeAddress) new HashTreeAddress.Builder().withLayerAddress(hashTreeAddress3.getLayerAddress()).withTreeAddress(hashTreeAddress3.getTreeAddress()).withTreeHeight(hashTreeAddress3.getTreeHeight()).withTreeIndex(hashTreeAddress3.getTreeIndex()).withKeyAndMask(2).build();
                }
                byte[] bArrPRF3 = wOTSPlus.getKhf().PRF(publicSeed, xMSSAddress.toByteArray());
                int treeDigestSize = wOTSPlus.getParams().getTreeDigestSize();
                byte[] bArr = new byte[treeDigestSize * 2];
                for (int i11 = 0; i11 < treeDigestSize; i11++) {
                    bArr[i11] = (byte) (xMSSNode.getValue()[i11] ^ bArrPRF2[i11]);
                }
                for (int i12 = 0; i12 < treeDigestSize; i12++) {
                    bArr[i12 + treeDigestSize] = (byte) (xMSSNode2.getValue()[i12] ^ bArrPRF3[i12]);
                }
                return new XMSSNode(xMSSNode.getHeight(), wOTSPlus.getKhf().H(bArrPRF, bArr));
            }
            str = "address == null";
        }
        w.l(str);
        return null;
    }
}
