package org.bouncycastle.pqc.crypto.xmss;

import c50.w;
import i4.a;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.pqc.crypto.xmss.OTSHashAddress;
import org.bouncycastle.util.Arrays;
import r8.k;

/* JADX INFO: loaded from: classes3.dex */
final class WOTSPlus {
    private final KeyedHashFunctions khf;
    private final WOTSPlusParameters params;
    private byte[] publicSeed;
    private byte[] secretKeySeed;

    public WOTSPlus(WOTSPlusParameters wOTSPlusParameters) {
        if (wOTSPlusParameters == null) {
            w.l("params == null");
            throw null;
        }
        this.params = wOTSPlusParameters;
        int treeDigestSize = wOTSPlusParameters.getTreeDigestSize();
        this.khf = new KeyedHashFunctions(wOTSPlusParameters.getTreeDigest(), treeDigestSize);
        this.secretKeySeed = new byte[treeDigestSize];
        this.publicSeed = new byte[treeDigestSize];
    }

    private byte[] chain(byte[] bArr, int i11, int i12, OTSHashAddress oTSHashAddress) {
        int treeDigestSize = this.params.getTreeDigestSize();
        if (bArr == null) {
            w.l("startHash == null");
            return null;
        }
        if (bArr.length != treeDigestSize) {
            a.f(k.h(treeDigestSize, "startHash needs to be ", "bytes"));
            return null;
        }
        if (oTSHashAddress == null) {
            w.l("otsHashAddress == null");
            return null;
        }
        if (oTSHashAddress.toByteArray() == null) {
            w.l("otsHashAddress byte array == null");
            return null;
        }
        int i13 = i11 + i12;
        if (i13 > this.params.getWinternitzParameter() - 1) {
            a.f("max chain length must not be greater than w");
            return null;
        }
        if (i12 == 0) {
            return bArr;
        }
        byte[] bArrChain = chain(bArr, i11, i12 - 1, oTSHashAddress);
        OTSHashAddress oTSHashAddress2 = (OTSHashAddress) new OTSHashAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).withOTSAddress(oTSHashAddress.getOTSAddress()).withChainAddress(oTSHashAddress.getChainAddress()).withHashAddress(i13 - 1).withKeyAndMask(0).build();
        byte[] bArrPRF = this.khf.PRF(this.publicSeed, oTSHashAddress2.toByteArray());
        byte[] bArrPRF2 = this.khf.PRF(this.publicSeed, ((OTSHashAddress) new OTSHashAddress.Builder().withLayerAddress(oTSHashAddress2.getLayerAddress()).withTreeAddress(oTSHashAddress2.getTreeAddress()).withOTSAddress(oTSHashAddress2.getOTSAddress()).withChainAddress(oTSHashAddress2.getChainAddress()).withHashAddress(oTSHashAddress2.getHashAddress()).withKeyAndMask(1).build()).toByteArray());
        byte[] bArr2 = new byte[treeDigestSize];
        for (int i14 = 0; i14 < treeDigestSize; i14++) {
            bArr2[i14] = (byte) (bArrChain[i14] ^ bArrPRF2[i14]);
        }
        return this.khf.F(bArrPRF, bArr2);
    }

    private List<Integer> convertToBaseW(byte[] bArr, int i11, int i12) {
        String str;
        if (bArr == null) {
            w.l("msg == null");
            return null;
        }
        if (i11 == 4 || i11 == 16) {
            int iLog2 = XMSSUtil.log2(i11);
            if (i12 <= (bArr.length * 8) / iLog2) {
                ArrayList arrayList = new ArrayList();
                loop0: for (int i13 : bArr) {
                    for (int i14 = 8 - iLog2; i14 >= 0; i14 -= iLog2) {
                        arrayList.add(Integer.valueOf((i13 >> i14) & (i11 - 1)));
                        if (arrayList.size() == i12) {
                            break loop0;
                        }
                    }
                }
                return arrayList;
            }
            str = "outLength too big";
        } else {
            str = "w needs to be 4 or 16";
        }
        a.f(str);
        return null;
    }

    private byte[] expandSecretKeySeed(int i11) {
        if (i11 >= 0 && i11 < this.params.getLen()) {
            return this.khf.PRF(this.secretKeySeed, XMSSUtil.toBytesBigEndian(i11, 32));
        }
        a.f("index out of bounds");
        return null;
    }

    public KeyedHashFunctions getKhf() {
        return this.khf;
    }

    public WOTSPlusParameters getParams() {
        return this.params;
    }

    public WOTSPlusPrivateKeyParameters getPrivateKey() {
        int len = this.params.getLen();
        byte[][] bArr = new byte[len][];
        for (int i11 = 0; i11 < len; i11++) {
            bArr[i11] = expandSecretKeySeed(i11);
        }
        return new WOTSPlusPrivateKeyParameters(this.params, bArr);
    }

    public WOTSPlusPublicKeyParameters getPublicKey(OTSHashAddress oTSHashAddress) {
        if (oTSHashAddress == null) {
            w.l("otsHashAddress == null");
            return null;
        }
        byte[][] bArr = new byte[this.params.getLen()][];
        for (int i11 = 0; i11 < this.params.getLen(); i11++) {
            oTSHashAddress = (OTSHashAddress) new OTSHashAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).withOTSAddress(oTSHashAddress.getOTSAddress()).withChainAddress(i11).withHashAddress(oTSHashAddress.getHashAddress()).withKeyAndMask(oTSHashAddress.getKeyAndMask()).build();
            bArr[i11] = chain(expandSecretKeySeed(i11), 0, this.params.getWinternitzParameter() - 1, oTSHashAddress);
        }
        return new WOTSPlusPublicKeyParameters(this.params, bArr);
    }

    public WOTSPlusPublicKeyParameters getPublicKeyFromSignature(byte[] bArr, WOTSPlusSignature wOTSPlusSignature, OTSHashAddress oTSHashAddress) {
        WOTSPlusParameters wOTSPlusParameters;
        if (bArr == null) {
            w.l("messageDigest == null");
            return null;
        }
        if (bArr.length != this.params.getTreeDigestSize()) {
            a.f("size of messageDigest needs to be equal to size of digest");
            return null;
        }
        if (wOTSPlusSignature == null) {
            w.l("signature == null");
            return null;
        }
        if (oTSHashAddress == null) {
            w.l("otsHashAddress == null");
            return null;
        }
        List<Integer> listConvertToBaseW = convertToBaseW(bArr, this.params.getWinternitzParameter(), this.params.getLen1());
        int i11 = 0;
        int winternitzParameter = 0;
        while (true) {
            int len1 = this.params.getLen1();
            wOTSPlusParameters = this.params;
            if (i11 >= len1) {
                break;
            }
            winternitzParameter += (wOTSPlusParameters.getWinternitzParameter() - 1) - listConvertToBaseW.get(i11).intValue();
            i11++;
        }
        listConvertToBaseW.addAll(convertToBaseW(XMSSUtil.toBytesBigEndian(winternitzParameter << (8 - ((XMSSUtil.log2(this.params.getWinternitzParameter()) * wOTSPlusParameters.getLen2()) % 8)), (int) Math.ceil(((double) (XMSSUtil.log2(this.params.getWinternitzParameter()) * this.params.getLen2())) / 8.0d)), this.params.getWinternitzParameter(), this.params.getLen2()));
        byte[][] bArr2 = new byte[this.params.getLen()][];
        for (int i12 = 0; i12 < this.params.getLen(); i12++) {
            oTSHashAddress = (OTSHashAddress) new OTSHashAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).withOTSAddress(oTSHashAddress.getOTSAddress()).withChainAddress(i12).withHashAddress(oTSHashAddress.getHashAddress()).withKeyAndMask(oTSHashAddress.getKeyAndMask()).build();
            bArr2[i12] = chain(wOTSPlusSignature.toByteArray()[i12], listConvertToBaseW.get(i12).intValue(), (this.params.getWinternitzParameter() - 1) - listConvertToBaseW.get(i12).intValue(), oTSHashAddress);
        }
        return new WOTSPlusPublicKeyParameters(this.params, bArr2);
    }

    public byte[] getPublicSeed() {
        return Arrays.clone(this.publicSeed);
    }

    public byte[] getSecretKeySeed() {
        return Arrays.clone(this.secretKeySeed);
    }

    public byte[] getWOTSPlusSecretKey(byte[] bArr, OTSHashAddress oTSHashAddress) {
        return this.khf.PRF(bArr, ((OTSHashAddress) new OTSHashAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).withOTSAddress(oTSHashAddress.getOTSAddress()).build()).toByteArray());
    }

    public void importKeys(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            w.l("secretKeySeed == null");
            return;
        }
        if (bArr.length != this.params.getTreeDigestSize()) {
            a.f("size of secretKeySeed needs to be equal to size of digest");
            return;
        }
        if (bArr2 == null) {
            w.l("publicSeed == null");
        } else if (bArr2.length != this.params.getTreeDigestSize()) {
            a.f("size of publicSeed needs to be equal to size of digest");
        } else {
            this.secretKeySeed = bArr;
            this.publicSeed = bArr2;
        }
    }

    public WOTSPlusSignature sign(byte[] bArr, OTSHashAddress oTSHashAddress) {
        WOTSPlusParameters wOTSPlusParameters;
        if (bArr == null) {
            w.l("messageDigest == null");
            return null;
        }
        if (bArr.length != this.params.getTreeDigestSize()) {
            a.f("size of messageDigest needs to be equal to size of digest");
            return null;
        }
        if (oTSHashAddress == null) {
            w.l("otsHashAddress == null");
            return null;
        }
        List<Integer> listConvertToBaseW = convertToBaseW(bArr, this.params.getWinternitzParameter(), this.params.getLen1());
        int i11 = 0;
        int winternitzParameter = 0;
        while (true) {
            int len1 = this.params.getLen1();
            wOTSPlusParameters = this.params;
            if (i11 >= len1) {
                break;
            }
            winternitzParameter += (wOTSPlusParameters.getWinternitzParameter() - 1) - listConvertToBaseW.get(i11).intValue();
            i11++;
        }
        listConvertToBaseW.addAll(convertToBaseW(XMSSUtil.toBytesBigEndian(winternitzParameter << (8 - ((XMSSUtil.log2(this.params.getWinternitzParameter()) * wOTSPlusParameters.getLen2()) % 8)), (int) Math.ceil(((double) (XMSSUtil.log2(this.params.getWinternitzParameter()) * this.params.getLen2())) / 8.0d)), this.params.getWinternitzParameter(), this.params.getLen2()));
        byte[][] bArr2 = new byte[this.params.getLen()][];
        for (int i12 = 0; i12 < this.params.getLen(); i12++) {
            oTSHashAddress = (OTSHashAddress) new OTSHashAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).withOTSAddress(oTSHashAddress.getOTSAddress()).withChainAddress(i12).withHashAddress(oTSHashAddress.getHashAddress()).withKeyAndMask(oTSHashAddress.getKeyAndMask()).build();
            bArr2[i12] = chain(expandSecretKeySeed(i12), 0, listConvertToBaseW.get(i12).intValue(), oTSHashAddress);
        }
        return new WOTSPlusSignature(this.params, bArr2);
    }
}
