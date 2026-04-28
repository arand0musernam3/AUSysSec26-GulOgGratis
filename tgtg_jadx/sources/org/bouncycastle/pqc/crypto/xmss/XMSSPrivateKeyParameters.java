package org.bouncycastle.pqc.crypto.xmss;

import c50.w;
import i4.a;
import java.io.IOException;
import org.bouncycastle.pqc.crypto.xmss.OTSHashAddress;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Encodable;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public final class XMSSPrivateKeyParameters extends XMSSKeyParameters implements XMSSStoreableObjectInterface, Encodable {
    private volatile BDS bdsState;
    private final XMSSParameters params;
    private final byte[] publicSeed;
    private final byte[] root;
    private final byte[] secretKeyPRF;
    private final byte[] secretKeySeed;

    public static class Builder {
        private final XMSSParameters params;
        private int index = 0;
        private int maxIndex = -1;
        private byte[] secretKeySeed = null;
        private byte[] secretKeyPRF = null;
        private byte[] publicSeed = null;
        private byte[] root = null;
        private BDS bdsState = null;
        private byte[] privateKey = null;

        public Builder(XMSSParameters xMSSParameters) {
            this.params = xMSSParameters;
        }

        public XMSSPrivateKeyParameters build() {
            return new XMSSPrivateKeyParameters(this);
        }

        public Builder withBDSState(BDS bds) {
            this.bdsState = bds;
            return this;
        }

        public Builder withIndex(int i11) {
            this.index = i11;
            return this;
        }

        public Builder withMaxIndex(int i11) {
            this.maxIndex = i11;
            return this;
        }

        public Builder withPrivateKey(byte[] bArr) {
            this.privateKey = XMSSUtil.cloneArray(bArr);
            return this;
        }

        public Builder withPublicSeed(byte[] bArr) {
            this.publicSeed = XMSSUtil.cloneArray(bArr);
            return this;
        }

        public Builder withRoot(byte[] bArr) {
            this.root = XMSSUtil.cloneArray(bArr);
            return this;
        }

        public Builder withSecretKeyPRF(byte[] bArr) {
            this.secretKeyPRF = XMSSUtil.cloneArray(bArr);
            return this;
        }

        public Builder withSecretKeySeed(byte[] bArr) {
            this.secretKeySeed = XMSSUtil.cloneArray(bArr);
            return this;
        }
    }

    private XMSSPrivateKeyParameters(Builder builder) {
        super(true, builder.params.getTreeDigest());
        XMSSParameters xMSSParameters = builder.params;
        this.params = xMSSParameters;
        if (xMSSParameters == null) {
            w.l("params == null");
            throw null;
        }
        int treeDigestSize = xMSSParameters.getTreeDigestSize();
        byte[] bArr = builder.privateKey;
        if (bArr != null) {
            int height = xMSSParameters.getHeight();
            int iBigEndianToInt = Pack.bigEndianToInt(bArr, 0);
            if (!XMSSUtil.isIndexValid(height, iBigEndianToInt)) {
                a.f("index out of bounds");
                throw null;
            }
            this.secretKeySeed = XMSSUtil.extractBytesAtOffset(bArr, 4, treeDigestSize);
            int i11 = 4 + treeDigestSize;
            this.secretKeyPRF = XMSSUtil.extractBytesAtOffset(bArr, i11, treeDigestSize);
            int i12 = i11 + treeDigestSize;
            this.publicSeed = XMSSUtil.extractBytesAtOffset(bArr, i12, treeDigestSize);
            int i13 = i12 + treeDigestSize;
            this.root = XMSSUtil.extractBytesAtOffset(bArr, i13, treeDigestSize);
            int i14 = i13 + treeDigestSize;
            try {
                BDS bds = (BDS) XMSSUtil.deserialize(XMSSUtil.extractBytesAtOffset(bArr, i14, bArr.length - i14), BDS.class);
                if (bds.getIndex() != iBigEndianToInt) {
                    throw new IllegalStateException("serialized BDS has wrong index");
                }
                this.bdsState = bds.withWOTSDigest(builder.params.getTreeDigestOID());
                return;
            } catch (IOException e5) {
                throw new IllegalArgumentException(e5.getMessage(), e5);
            } catch (ClassNotFoundException e11) {
                throw new IllegalArgumentException(e11.getMessage(), e11);
            }
        }
        byte[] bArr2 = builder.secretKeySeed;
        if (bArr2 == null) {
            this.secretKeySeed = new byte[treeDigestSize];
        } else {
            if (bArr2.length != treeDigestSize) {
                a.f("size of secretKeySeed needs to be equal size of digest");
                throw null;
            }
            this.secretKeySeed = bArr2;
        }
        byte[] bArr3 = builder.secretKeyPRF;
        if (bArr3 == null) {
            this.secretKeyPRF = new byte[treeDigestSize];
        } else {
            if (bArr3.length != treeDigestSize) {
                a.f("size of secretKeyPRF needs to be equal size of digest");
                throw null;
            }
            this.secretKeyPRF = bArr3;
        }
        byte[] bArr4 = builder.publicSeed;
        if (bArr4 == null) {
            this.publicSeed = new byte[treeDigestSize];
        } else {
            if (bArr4.length != treeDigestSize) {
                a.f("size of publicSeed needs to be equal size of digest");
                throw null;
            }
            this.publicSeed = bArr4;
        }
        byte[] bArr5 = builder.root;
        if (bArr5 == null) {
            this.root = new byte[treeDigestSize];
        } else {
            if (bArr5.length != treeDigestSize) {
                a.f("size of root needs to be equal size of digest");
                throw null;
            }
            this.root = bArr5;
        }
        BDS bds2 = builder.bdsState;
        if (bds2 != null) {
            this.bdsState = bds2;
        } else if (builder.index >= (1 << xMSSParameters.getHeight()) - 2 || bArr4 == null || bArr2 == null) {
            bds2 = new BDS(xMSSParameters, (1 << xMSSParameters.getHeight()) - 1, builder.index);
            this.bdsState = bds2;
        } else {
            this.bdsState = new BDS(xMSSParameters, bArr4, bArr2, (OTSHashAddress) new OTSHashAddress.Builder().build(), builder.index);
        }
        if (builder.maxIndex < 0 || builder.maxIndex == this.bdsState.getMaxIndex()) {
            return;
        }
        a.f("maxIndex set but not reflected in state");
        throw null;
    }

    public XMSSPrivateKeyParameters extractKeyShard(int i11) {
        XMSSPrivateKeyParameters xMSSPrivateKeyParametersBuild;
        if (i11 < 1) {
            a.f("cannot ask for a shard with 0 keys");
            return null;
        }
        synchronized (this) {
            long j9 = i11;
            try {
                if (j9 > getUsagesRemaining()) {
                    throw new IllegalArgumentException("usageCount exceeds usages remaining");
                }
                xMSSPrivateKeyParametersBuild = new Builder(this.params).withSecretKeySeed(this.secretKeySeed).withSecretKeyPRF(this.secretKeyPRF).withPublicSeed(this.publicSeed).withRoot(this.root).withIndex(getIndex()).withBDSState(this.bdsState.withMaxIndex((this.bdsState.getIndex() + i11) - 1, this.params.getTreeDigestOID())).build();
                if (j9 == getUsagesRemaining()) {
                    this.bdsState = new BDS(this.params, this.bdsState.getMaxIndex(), getIndex() + i11);
                } else {
                    OTSHashAddress oTSHashAddress = (OTSHashAddress) new OTSHashAddress.Builder().build();
                    for (int i12 = 0; i12 != i11; i12++) {
                        this.bdsState = this.bdsState.getNextState(this.publicSeed, this.secretKeySeed, oTSHashAddress);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return xMSSPrivateKeyParametersBuild;
    }

    public BDS getBDSState() {
        return this.bdsState;
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws IOException {
        byte[] byteArray;
        synchronized (this) {
            byteArray = toByteArray();
        }
        return byteArray;
    }

    public int getIndex() {
        return this.bdsState.getIndex();
    }

    public XMSSPrivateKeyParameters getNextKey() {
        XMSSPrivateKeyParameters xMSSPrivateKeyParametersExtractKeyShard;
        synchronized (this) {
            xMSSPrivateKeyParametersExtractKeyShard = extractKeyShard(1);
        }
        return xMSSPrivateKeyParametersExtractKeyShard;
    }

    public XMSSParameters getParameters() {
        return this.params;
    }

    public byte[] getPublicSeed() {
        return XMSSUtil.cloneArray(this.publicSeed);
    }

    public byte[] getRoot() {
        return XMSSUtil.cloneArray(this.root);
    }

    public byte[] getSecretKeyPRF() {
        return XMSSUtil.cloneArray(this.secretKeyPRF);
    }

    public byte[] getSecretKeySeed() {
        return XMSSUtil.cloneArray(this.secretKeySeed);
    }

    public long getUsagesRemaining() {
        long maxIndex;
        synchronized (this) {
            maxIndex = (this.bdsState.getMaxIndex() - getIndex()) + 1;
        }
        return maxIndex;
    }

    public XMSSPrivateKeyParameters rollKey() {
        synchronized (this) {
            try {
                this.bdsState = this.bdsState.getIndex() < this.bdsState.getMaxIndex() ? this.bdsState.getNextState(this.publicSeed, this.secretKeySeed, (OTSHashAddress) new OTSHashAddress.Builder().build()) : new BDS(this.params, this.bdsState.getMaxIndex(), this.bdsState.getMaxIndex() + 1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this;
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSStoreableObjectInterface
    public byte[] toByteArray() {
        byte[] bArrConcatenate;
        synchronized (this) {
            try {
                int treeDigestSize = this.params.getTreeDigestSize();
                byte[] bArr = new byte[treeDigestSize + 4 + treeDigestSize + treeDigestSize + treeDigestSize];
                Pack.intToBigEndian(this.bdsState.getIndex(), bArr, 0);
                XMSSUtil.copyBytesAtOffset(bArr, this.secretKeySeed, 4);
                int i11 = 4 + treeDigestSize;
                XMSSUtil.copyBytesAtOffset(bArr, this.secretKeyPRF, i11);
                int i12 = i11 + treeDigestSize;
                XMSSUtil.copyBytesAtOffset(bArr, this.publicSeed, i12);
                XMSSUtil.copyBytesAtOffset(bArr, this.root, i12 + treeDigestSize);
                try {
                    bArrConcatenate = Arrays.concatenate(bArr, XMSSUtil.serialize(this.bdsState));
                } catch (IOException e5) {
                    throw new RuntimeException("error serializing bds state: " + e5.getMessage());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bArrConcatenate;
    }
}
