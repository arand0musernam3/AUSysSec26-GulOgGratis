package org.bouncycastle.pqc.crypto.lms;

import com.braze.h2;
import i4.a;
import j4.s;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.WeakHashMap;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.pqc.crypto.ExhaustedPrivateKeyException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.io.Streams;
import wy.o;

/* JADX INFO: loaded from: classes3.dex */
public class LMSPrivateKeyParameters extends LMSKeyParameters implements LMSContextBasedSigner {
    private static CacheKey T1;
    private static CacheKey[] internedKeys;
    private final byte[] I;
    private final byte[] masterSecret;
    private final int maxCacheR;
    private final int maxQ;
    private final LMOtsParameters otsParameters;
    private final LMSigParameters parameters;
    private LMSPublicKeyParameters publicKey;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f33529q;
    private final Map<CacheKey, byte[]> tCache;
    private final Digest tDigest;

    public static class CacheKey {
        private final int index;

        public CacheKey(int i11) {
            this.index = i11;
        }

        public boolean equals(Object obj) {
            return (obj instanceof CacheKey) && ((CacheKey) obj).index == this.index;
        }

        public int hashCode() {
            return this.index;
        }
    }

    static {
        CacheKey cacheKey = new CacheKey(1);
        T1 = cacheKey;
        CacheKey[] cacheKeyArr = new CacheKey[129];
        internedKeys = cacheKeyArr;
        cacheKeyArr[1] = cacheKey;
        int i11 = 2;
        while (true) {
            CacheKey[] cacheKeyArr2 = internedKeys;
            if (i11 >= cacheKeyArr2.length) {
                return;
            }
            cacheKeyArr2[i11] = new CacheKey(i11);
            i11++;
        }
    }

    private LMSPrivateKeyParameters(LMSPrivateKeyParameters lMSPrivateKeyParameters, int i11, int i12) {
        super(true);
        LMSigParameters lMSigParameters = lMSPrivateKeyParameters.parameters;
        this.parameters = lMSigParameters;
        this.otsParameters = lMSPrivateKeyParameters.otsParameters;
        this.f33529q = i11;
        this.I = lMSPrivateKeyParameters.I;
        this.maxQ = i12;
        this.masterSecret = lMSPrivateKeyParameters.masterSecret;
        this.maxCacheR = 1 << lMSigParameters.getH();
        this.tCache = lMSPrivateKeyParameters.tCache;
        this.tDigest = DigestUtil.getDigest(lMSigParameters);
        this.publicKey = lMSPrivateKeyParameters.publicKey;
    }

    private byte[] calcT(int i11) {
        int h11 = 1 << getSigParameters().getH();
        if (i11 >= h11) {
            LmsUtils.byteArray(getI(), this.tDigest);
            LmsUtils.u32str(i11, this.tDigest);
            LmsUtils.u16str((short) -32126, this.tDigest);
            LmsUtils.byteArray(LM_OTS.lms_ots_generatePublicKey(getOtsParameters(), getI(), i11 - h11, getMasterSecret()), this.tDigest);
            byte[] bArr = new byte[this.tDigest.getDigestSize()];
            this.tDigest.doFinal(bArr, 0);
            return bArr;
        }
        int i12 = i11 * 2;
        byte[] bArrFindT = findT(i12);
        byte[] bArrFindT2 = findT(i12 + 1);
        LmsUtils.byteArray(getI(), this.tDigest);
        LmsUtils.u32str(i11, this.tDigest);
        LmsUtils.u16str((short) -31869, this.tDigest);
        LmsUtils.byteArray(bArrFindT, this.tDigest);
        LmsUtils.byteArray(bArrFindT2, this.tDigest);
        byte[] bArr2 = new byte[this.tDigest.getDigestSize()];
        this.tDigest.doFinal(bArr2, 0);
        return bArr2;
    }

    private byte[] findT(CacheKey cacheKey) {
        byte[] bArrCalcT;
        synchronized (this.tCache) {
            try {
                bArrCalcT = this.tCache.get(cacheKey);
                if (bArrCalcT == null) {
                    bArrCalcT = calcT(cacheKey.index);
                    this.tCache.put(cacheKey, bArrCalcT);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bArrCalcT;
    }

    public static LMSPrivateKeyParameters getInstance(Object obj) throws Throwable {
        Throwable th2;
        if (obj instanceof LMSPrivateKeyParameters) {
            return (LMSPrivateKeyParameters) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            if (dataInputStream.readInt() != 0) {
                h2.b("expected version 0 lms private key");
                return null;
            }
            LMSigParameters parametersForType = LMSigParameters.getParametersForType(dataInputStream.readInt());
            LMOtsParameters parametersForType2 = LMOtsParameters.getParametersForType(dataInputStream.readInt());
            byte[] bArr = new byte[16];
            dataInputStream.readFully(bArr);
            int i11 = dataInputStream.readInt();
            int i12 = dataInputStream.readInt();
            int i13 = dataInputStream.readInt();
            if (i13 < 0) {
                h2.b("secret length less than zero");
                return null;
            }
            if (i13 > dataInputStream.available()) {
                o.e(dataInputStream.available(), "secret length exceeded ");
                return null;
            }
            byte[] bArr2 = new byte[i13];
            dataInputStream.readFully(bArr2);
            return new LMSPrivateKeyParameters(parametersForType, parametersForType2, i11, bArr, i12, bArr2);
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
                LMSPrivateKeyParameters lMSPrivateKeyParameters = getInstance(dataInputStream3);
                dataInputStream3.close();
                return lMSPrivateKeyParameters;
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LMSPrivateKeyParameters lMSPrivateKeyParameters = (LMSPrivateKeyParameters) obj;
        if (this.f33529q != lMSPrivateKeyParameters.f33529q || this.maxQ != lMSPrivateKeyParameters.maxQ || !Arrays.areEqual(this.I, lMSPrivateKeyParameters.I)) {
            return false;
        }
        LMSigParameters lMSigParameters = this.parameters;
        LMSigParameters lMSigParameters2 = lMSPrivateKeyParameters.parameters;
        if (lMSigParameters == null ? lMSigParameters2 != null : !lMSigParameters.equals(lMSigParameters2)) {
            return false;
        }
        LMOtsParameters lMOtsParameters = this.otsParameters;
        LMOtsParameters lMOtsParameters2 = lMSPrivateKeyParameters.otsParameters;
        if (lMOtsParameters == null ? lMOtsParameters2 == null : lMOtsParameters.equals(lMOtsParameters2)) {
            return Arrays.areEqual(this.masterSecret, lMSPrivateKeyParameters.masterSecret);
        }
        return false;
    }

    public LMSPrivateKeyParameters extractKeyShard(int i11) {
        LMSPrivateKeyParameters lMSPrivateKeyParameters;
        synchronized (this) {
            try {
                if (i11 < 0) {
                    throw new IllegalArgumentException("usageCount cannot be negative");
                }
                int i12 = this.maxQ;
                int i13 = this.f33529q;
                if (i11 > i12 - i13) {
                    throw new IllegalArgumentException("usageCount exceeds usages remaining");
                }
                int i14 = i11 + i13;
                this.f33529q = i14;
                lMSPrivateKeyParameters = new LMSPrivateKeyParameters(this, i13, i14);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lMSPrivateKeyParameters;
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedSigner
    public LMSContext generateLMSContext() {
        int h11 = getSigParameters().getH();
        int index = getIndex();
        LMOtsPrivateKey nextOtsPrivateKey = getNextOtsPrivateKey();
        int i11 = (1 << h11) + index;
        byte[][] bArr = new byte[h11][];
        for (int i12 = 0; i12 < h11; i12++) {
            bArr[i12] = findT((i11 / (1 << i12)) ^ 1);
        }
        return nextOtsPrivateKey.getSignatureContext(getSigParameters(), bArr);
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedSigner
    public byte[] generateSignature(LMSContext lMSContext) {
        try {
            return LMS.generateSign(lMSContext).getEncoded();
        } catch (IOException e5) {
            o.k(s.g(e5, new StringBuilder("unable to encode signature: ")), e5);
            return null;
        }
    }

    public LMOtsPrivateKey getCurrentOTSKey() {
        LMOtsPrivateKey lMOtsPrivateKey;
        synchronized (this) {
            try {
                int i11 = this.f33529q;
                if (i11 >= this.maxQ) {
                    throw new ExhaustedPrivateKeyException("ots private keys expired");
                }
                lMOtsPrivateKey = new LMOtsPrivateKey(this.otsParameters, this.I, i11, this.masterSecret);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lMOtsPrivateKey;
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSKeyParameters, org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws IOException {
        return Composer.compose().u32str(0).u32str(this.parameters.getType()).u32str(this.otsParameters.getType()).bytes(this.I).u32str(this.f33529q).u32str(this.maxQ).u32str(this.masterSecret.length).bytes(this.masterSecret).build();
    }

    public byte[] getI() {
        return Arrays.clone(this.I);
    }

    public synchronized int getIndex() {
        return this.f33529q;
    }

    public int getIndexLimit() {
        return this.maxQ;
    }

    public byte[] getMasterSecret() {
        return Arrays.clone(this.masterSecret);
    }

    public LMOtsPrivateKey getNextOtsPrivateKey() {
        LMOtsPrivateKey lMOtsPrivateKey;
        synchronized (this) {
            try {
                int i11 = this.f33529q;
                if (i11 >= this.maxQ) {
                    throw new ExhaustedPrivateKeyException("ots private key exhausted");
                }
                lMOtsPrivateKey = new LMOtsPrivateKey(this.otsParameters, this.I, i11, this.masterSecret);
                incIndex();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lMOtsPrivateKey;
    }

    public LMOtsParameters getOtsParameters() {
        return this.otsParameters;
    }

    public LMSPublicKeyParameters getPublicKey() {
        LMSPublicKeyParameters lMSPublicKeyParameters;
        synchronized (this) {
            try {
                if (this.publicKey == null) {
                    this.publicKey = new LMSPublicKeyParameters(this.parameters, this.otsParameters, findT(T1), this.I);
                }
                lMSPublicKeyParameters = this.publicKey;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lMSPublicKeyParameters;
    }

    public LMSigParameters getSigParameters() {
        return this.parameters;
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedSigner
    public long getUsagesRemaining() {
        return getIndexLimit() - getIndex();
    }

    public int hashCode() {
        int iHashCode = (Arrays.hashCode(this.I) + (this.f33529q * 31)) * 31;
        LMSigParameters lMSigParameters = this.parameters;
        int iHashCode2 = (iHashCode + (lMSigParameters != null ? lMSigParameters.hashCode() : 0)) * 31;
        LMOtsParameters lMOtsParameters = this.otsParameters;
        return Arrays.hashCode(this.masterSecret) + ((((iHashCode2 + (lMOtsParameters != null ? lMOtsParameters.hashCode() : 0)) * 31) + this.maxQ) * 31);
    }

    public synchronized void incIndex() {
        this.f33529q++;
    }

    public byte[] findT(int i11) {
        if (i11 >= this.maxCacheR) {
            return calcT(i11);
        }
        CacheKey[] cacheKeyArr = internedKeys;
        return findT(i11 < cacheKeyArr.length ? cacheKeyArr[i11] : new CacheKey(i11));
    }

    public LMSPrivateKeyParameters(LMSigParameters lMSigParameters, LMOtsParameters lMOtsParameters, int i11, byte[] bArr, int i12, byte[] bArr2) {
        super(true);
        this.parameters = lMSigParameters;
        this.otsParameters = lMOtsParameters;
        this.f33529q = i11;
        this.I = Arrays.clone(bArr);
        this.maxQ = i12;
        this.masterSecret = Arrays.clone(bArr2);
        this.maxCacheR = 1 << (lMSigParameters.getH() + 1);
        this.tCache = new WeakHashMap();
        this.tDigest = DigestUtil.getDigest(lMSigParameters);
    }

    public static LMSPrivateKeyParameters getInstance(byte[] bArr, byte[] bArr2) throws Throwable {
        LMSPrivateKeyParameters lMSPrivateKeyParameters = getInstance(bArr);
        lMSPrivateKeyParameters.publicKey = LMSPublicKeyParameters.getInstance(bArr2);
        return lMSPrivateKeyParameters;
    }
}
