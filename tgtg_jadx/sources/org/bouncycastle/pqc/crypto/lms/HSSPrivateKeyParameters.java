package org.bouncycastle.pqc.crypto.lms;

import a40.d0;
import com.braze.h2;
import i4.a;
import j4.s;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.io.Streams;
import wy.o;

/* JADX INFO: loaded from: classes3.dex */
public class HSSPrivateKeyParameters extends LMSKeyParameters implements LMSContextBasedSigner {
    private long index;
    private final long indexLimit;
    private final boolean isShard;
    private List<LMSPrivateKeyParameters> keys;
    private final int l;
    private HSSPublicKeyParameters publicKey;
    private List<LMSSignature> sig;

    public HSSPrivateKeyParameters(int i11, List<LMSPrivateKeyParameters> list, List<LMSSignature> list2, long j9, long j11) {
        super(true);
        this.index = 0L;
        this.l = i11;
        this.keys = Collections.unmodifiableList(list);
        this.sig = Collections.unmodifiableList(list2);
        this.index = j9;
        this.indexLimit = j11;
        this.isShard = false;
        resetKeyToIndex();
    }

    public static HSSPrivateKeyParameters getInstance(Object obj) throws Throwable {
        Throwable th2;
        if (obj instanceof HSSPrivateKeyParameters) {
            return (HSSPrivateKeyParameters) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            if (dataInputStream.readInt() != 0) {
                h2.b("unknown version for hss private key");
                return null;
            }
            int i11 = dataInputStream.readInt();
            long j9 = dataInputStream.readLong();
            long j11 = dataInputStream.readLong();
            boolean z11 = dataInputStream.readBoolean();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i12 = 0; i12 < i11; i12++) {
                arrayList.add(LMSPrivateKeyParameters.getInstance(obj));
            }
            for (int i13 = 0; i13 < i11 - 1; i13++) {
                arrayList2.add(LMSSignature.getInstance(obj));
            }
            return new HSSPrivateKeyParameters(i11, arrayList, arrayList2, j9, j11, z11);
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return getInstance(Streams.readAll((InputStream) obj));
            }
            a.f(s.j(obj, "cannot parse "));
            return null;
        }
        DataInputStream dataInputStream2 = null;
        try {
            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                try {
                    HSSPrivateKeyParameters hSSPrivateKeyParameters = getInstance(dataInputStream3);
                    dataInputStream3.close();
                    return hSSPrivateKeyParameters;
                } catch (Exception unused) {
                    HSSPrivateKeyParameters hSSPrivateKeyParameters2 = new HSSPrivateKeyParameters(LMSPrivateKeyParameters.getInstance(obj), r4.getIndex(), r4.getIndexLimit());
                    dataInputStream3.close();
                    return hSSPrivateKeyParameters2;
                }
            } catch (Throwable th3) {
                th2 = th3;
                dataInputStream2 = dataInputStream3;
                if (dataInputStream2 == null) {
                    throw th2;
                }
                dataInputStream2.close();
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    private static HSSPrivateKeyParameters makeCopy(HSSPrivateKeyParameters hSSPrivateKeyParameters) {
        try {
            return getInstance(hSSPrivateKeyParameters.getEncoded());
        } catch (Exception e5) {
            d0.o(e5.getMessage(), e5);
            return null;
        }
    }

    public Object clone() throws CloneNotSupportedException {
        return makeCopy(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HSSPrivateKeyParameters hSSPrivateKeyParameters = (HSSPrivateKeyParameters) obj;
        if (this.l == hSSPrivateKeyParameters.l && this.isShard == hSSPrivateKeyParameters.isShard && this.indexLimit == hSSPrivateKeyParameters.indexLimit && this.index == hSSPrivateKeyParameters.index && this.keys.equals(hSSPrivateKeyParameters.keys)) {
            return this.sig.equals(hSSPrivateKeyParameters.sig);
        }
        return false;
    }

    public HSSPrivateKeyParameters extractKeyShard(int i11) {
        HSSPrivateKeyParameters hSSPrivateKeyParametersMakeCopy;
        synchronized (this) {
            try {
                if (i11 < 0) {
                    throw new IllegalArgumentException("usageCount cannot be negative");
                }
                long j9 = i11;
                long j11 = this.indexLimit;
                long j12 = this.index;
                if (j9 > j11 - j12) {
                    throw new IllegalArgumentException("usageCount exceeds usages remaining in current leaf");
                }
                long j13 = j12 + j9;
                this.index = j13;
                hSSPrivateKeyParametersMakeCopy = makeCopy(new HSSPrivateKeyParameters(this.l, new ArrayList(getKeys()), new ArrayList(getSig()), j12, j13, true));
                resetKeyToIndex();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hSSPrivateKeyParametersMakeCopy;
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedSigner
    public LMSContext generateLMSContext() {
        LMSPrivateKeyParameters lMSPrivateKeyParameters;
        LMSSignedPubKey[] lMSSignedPubKeyArr;
        int l = getL();
        synchronized (this) {
            try {
                HSS.rangeTestKeys(this);
                List<LMSPrivateKeyParameters> keys = getKeys();
                List<LMSSignature> sig = getSig();
                int i11 = l - 1;
                lMSPrivateKeyParameters = getKeys().get(i11);
                lMSSignedPubKeyArr = new LMSSignedPubKey[i11];
                int i12 = 0;
                while (i12 < i11) {
                    int i13 = i12 + 1;
                    lMSSignedPubKeyArr[i12] = new LMSSignedPubKey(sig.get(i12), keys.get(i13).getPublicKey());
                    i12 = i13;
                }
                incIndex();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lMSPrivateKeyParameters.generateLMSContext().withSignedPublicKeys(lMSSignedPubKeyArr);
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedSigner
    public byte[] generateSignature(LMSContext lMSContext) {
        try {
            return HSS.generateSignature(getL(), lMSContext).getEncoded();
        } catch (IOException e5) {
            o.k(s.g(e5, new StringBuilder("unable to encode signature: ")), e5);
            return null;
        }
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSKeyParameters, org.bouncycastle.util.Encodable
    public synchronized byte[] getEncoded() throws IOException {
        Composer composerBool;
        try {
            composerBool = Composer.compose().u32str(0).u32str(this.l).u64str(this.index).u64str(this.indexLimit).bool(this.isShard);
            Iterator<LMSPrivateKeyParameters> it = this.keys.iterator();
            while (it.hasNext()) {
                composerBool.bytes(it.next());
            }
            Iterator<LMSSignature> it2 = this.sig.iterator();
            while (it2.hasNext()) {
                composerBool.bytes(it2.next());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return composerBool.build();
    }

    public synchronized long getIndex() {
        return this.index;
    }

    public long getIndexLimit() {
        return this.indexLimit;
    }

    public synchronized List<LMSPrivateKeyParameters> getKeys() {
        return this.keys;
    }

    public int getL() {
        return this.l;
    }

    public synchronized LMSParameters[] getLMSParameters() {
        LMSParameters[] lMSParametersArr;
        int size = this.keys.size();
        lMSParametersArr = new LMSParameters[size];
        for (int i11 = 0; i11 < size; i11++) {
            LMSPrivateKeyParameters lMSPrivateKeyParameters = this.keys.get(i11);
            lMSParametersArr[i11] = new LMSParameters(lMSPrivateKeyParameters.getSigParameters(), lMSPrivateKeyParameters.getOtsParameters());
        }
        return lMSParametersArr;
    }

    public synchronized HSSPublicKeyParameters getPublicKey() {
        return new HSSPublicKeyParameters(this.l, getRootKey().getPublicKey());
    }

    public LMSPrivateKeyParameters getRootKey() {
        return this.keys.get(0);
    }

    public synchronized List<LMSSignature> getSig() {
        return this.sig;
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedSigner
    public long getUsagesRemaining() {
        return getIndexLimit() - getIndex();
    }

    public int hashCode() {
        int iHashCode = (this.sig.hashCode() + ((this.keys.hashCode() + (((this.l * 31) + (this.isShard ? 1 : 0)) * 31)) * 31)) * 31;
        long j9 = this.indexLimit;
        int i11 = (iHashCode + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        long j11 = this.index;
        return i11 + ((int) (j11 ^ (j11 >>> 32)));
    }

    public synchronized void incIndex() {
        this.index++;
    }

    public boolean isShard() {
        return this.isShard;
    }

    public void replaceConsumedKey(int i11) {
        int i12 = i11 - 1;
        LMOtsPrivateKey currentOTSKey = this.keys.get(i12).getCurrentOTSKey();
        int n11 = currentOTSKey.getParameter().getN();
        SeedDerive derivationFunction = currentOTSKey.getDerivationFunction();
        derivationFunction.setJ(-2);
        byte[] bArr = new byte[n11];
        derivationFunction.deriveSeed(bArr, true);
        byte[] bArr2 = new byte[n11];
        derivationFunction.deriveSeed(bArr2, false);
        byte[] bArr3 = new byte[16];
        System.arraycopy(bArr2, 0, bArr3, 0, 16);
        ArrayList arrayList = new ArrayList(this.keys);
        LMSPrivateKeyParameters lMSPrivateKeyParameters = this.keys.get(i11);
        arrayList.set(i11, LMS.generateKeys(lMSPrivateKeyParameters.getSigParameters(), lMSPrivateKeyParameters.getOtsParameters(), 0, bArr3, bArr));
        ArrayList arrayList2 = new ArrayList(this.sig);
        arrayList2.set(i12, LMS.generateSign((LMSPrivateKeyParameters) arrayList.get(i12), ((LMSPrivateKeyParameters) arrayList.get(i11)).getPublicKey().toByteArray()));
        this.keys = Collections.unmodifiableList(arrayList);
        this.sig = Collections.unmodifiableList(arrayList2);
    }

    public void resetKeyToIndex() {
        boolean z11;
        List<LMSPrivateKeyParameters> keys = getKeys();
        int size = keys.size();
        long[] jArr = new long[size];
        long index = getIndex();
        for (int size2 = keys.size() - 1; size2 >= 0; size2--) {
            LMSigParameters sigParameters = keys.get(size2).getSigParameters();
            jArr[size2] = ((long) ((1 << sigParameters.getH()) - 1)) & index;
            index >>>= sigParameters.getH();
        }
        LMSPrivateKeyParameters[] lMSPrivateKeyParametersArr = (LMSPrivateKeyParameters[]) keys.toArray(new LMSPrivateKeyParameters[keys.size()]);
        List<LMSSignature> list = this.sig;
        LMSSignature[] lMSSignatureArr = (LMSSignature[]) list.toArray(new LMSSignature[list.size()]);
        LMSPrivateKeyParameters rootKey = getRootKey();
        if (lMSPrivateKeyParametersArr[0].getIndex() - 1 != jArr[0]) {
            lMSPrivateKeyParametersArr[0] = LMS.generateKeys(rootKey.getSigParameters(), rootKey.getOtsParameters(), (int) jArr[0], rootKey.getI(), rootKey.getMasterSecret());
            z11 = true;
        } else {
            z11 = false;
        }
        int i11 = 1;
        while (i11 < size) {
            int i12 = i11 - 1;
            LMSPrivateKeyParameters lMSPrivateKeyParameters = lMSPrivateKeyParametersArr[i12];
            int n11 = lMSPrivateKeyParameters.getOtsParameters().getN();
            byte[] bArr = new byte[16];
            byte[] bArr2 = new byte[n11];
            SeedDerive seedDerive = new SeedDerive(lMSPrivateKeyParameters.getI(), lMSPrivateKeyParameters.getMasterSecret(), DigestUtil.getDigest(lMSPrivateKeyParameters.getOtsParameters()));
            seedDerive.setQ((int) jArr[i12]);
            seedDerive.setJ(-2);
            seedDerive.deriveSeed(bArr2, true);
            byte[] bArr3 = new byte[n11];
            seedDerive.deriveSeed(bArr3, false);
            System.arraycopy(bArr3, 0, bArr, 0, 16);
            boolean z12 = i11 >= size + (-1) ? jArr[i11] == ((long) lMSPrivateKeyParametersArr[i11].getIndex()) : jArr[i11] == ((long) (lMSPrivateKeyParametersArr[i11].getIndex() - 1));
            if (!Arrays.areEqual(bArr, lMSPrivateKeyParametersArr[i11].getI()) || !Arrays.areEqual(bArr2, lMSPrivateKeyParametersArr[i11].getMasterSecret())) {
                LMSPrivateKeyParameters lMSPrivateKeyParametersGenerateKeys = LMS.generateKeys(keys.get(i11).getSigParameters(), keys.get(i11).getOtsParameters(), (int) jArr[i11], bArr, bArr2);
                lMSPrivateKeyParametersArr[i11] = lMSPrivateKeyParametersGenerateKeys;
                lMSSignatureArr[i12] = LMS.generateSign(lMSPrivateKeyParametersArr[i12], lMSPrivateKeyParametersGenerateKeys.getPublicKey().toByteArray());
            } else if (z12) {
                i11++;
            } else {
                lMSPrivateKeyParametersArr[i11] = LMS.generateKeys(keys.get(i11).getSigParameters(), keys.get(i11).getOtsParameters(), (int) jArr[i11], bArr, bArr2);
            }
            z11 = true;
            i11++;
        }
        if (z11) {
            updateHierarchy(lMSPrivateKeyParametersArr, lMSSignatureArr);
        }
    }

    public void updateHierarchy(LMSPrivateKeyParameters[] lMSPrivateKeyParametersArr, LMSSignature[] lMSSignatureArr) {
        synchronized (this) {
            this.keys = Collections.unmodifiableList(java.util.Arrays.asList(lMSPrivateKeyParametersArr));
            this.sig = Collections.unmodifiableList(java.util.Arrays.asList(lMSSignatureArr));
        }
    }

    private HSSPrivateKeyParameters(int i11, List<LMSPrivateKeyParameters> list, List<LMSSignature> list2, long j9, long j11, boolean z11) {
        super(true);
        this.index = 0L;
        this.l = i11;
        this.keys = Collections.unmodifiableList(list);
        this.sig = Collections.unmodifiableList(list2);
        this.index = j9;
        this.indexLimit = j11;
        this.isShard = z11;
    }

    public HSSPrivateKeyParameters(LMSPrivateKeyParameters lMSPrivateKeyParameters, long j9, long j11) {
        super(true);
        this.index = 0L;
        this.l = 1;
        this.keys = Collections.singletonList(lMSPrivateKeyParameters);
        this.sig = Collections.EMPTY_LIST;
        this.index = j9;
        this.indexLimit = j11;
        this.isShard = false;
        resetKeyToIndex();
    }

    public static HSSPrivateKeyParameters getInstance(byte[] bArr, byte[] bArr2) throws Throwable {
        HSSPrivateKeyParameters hSSPrivateKeyParameters = getInstance(bArr);
        hSSPrivateKeyParameters.publicKey = HSSPublicKeyParameters.getInstance(bArr2);
        return hSSPrivateKeyParameters;
    }
}
