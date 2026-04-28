package org.bouncycastle.jcajce.provider.symmetric.util;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Hashtable;
import java.util.Map;
import javax.crypto.MacSpi;
import javax.crypto.SecretKey;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import m0.i1;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.RC2Parameters;
import org.bouncycastle.crypto.params.SkeinParameters;
import org.bouncycastle.jcajce.PKCS12Key;
import org.bouncycastle.jcajce.provider.symmetric.util.PBE;
import org.bouncycastle.jcajce.spec.AEADParameterSpec;
import org.bouncycastle.jcajce.spec.SkeinParameterSpec;
import org.bouncycastle.jce.provider.a;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import r8.k;

/* JADX INFO: loaded from: classes3.dex */
public class BaseMac extends MacSpi implements PBE {
    private int keySize;
    private Mac macEngine;
    private int pbeHash;
    private int scheme;

    public BaseMac(Mac mac) {
        this.scheme = 2;
        this.pbeHash = 1;
        this.keySize = 160;
        this.macEngine = mac;
    }

    private static Hashtable copyMap(Map map) {
        Hashtable hashtable = new Hashtable();
        for (Object obj : map.keySet()) {
            hashtable.put(obj, map.get(obj));
        }
        return hashtable;
    }

    @Override // javax.crypto.MacSpi
    public byte[] engineDoFinal() {
        byte[] bArr = new byte[engineGetMacLength()];
        this.macEngine.doFinal(bArr, 0);
        return bArr;
    }

    @Override // javax.crypto.MacSpi
    public int engineGetMacLength() {
        return this.macEngine.getMacSize();
    }

    @Override // javax.crypto.MacSpi
    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i11;
        CipherParameters cipherParametersMakePBEMacParameters;
        if (key == null) {
            a.i("key is null");
            return;
        }
        if (key instanceof PKCS12Key) {
            try {
                SecretKey secretKey = (SecretKey) key;
                try {
                    PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
                    if ((secretKey instanceof PBEKey) && pBEParameterSpec == null) {
                        PBEKey pBEKey = (PBEKey) secretKey;
                        pBEParameterSpec = new PBEParameterSpec(pBEKey.getSalt(), pBEKey.getIterationCount());
                    }
                    int i12 = 256;
                    if (this.macEngine.getAlgorithmName().startsWith("GOST")) {
                        i11 = 6;
                    } else {
                        Mac mac = this.macEngine;
                        if (!(mac instanceof HMac) || mac.getAlgorithmName().startsWith(McElieceCCA2KeyGenParameterSpec.SHA1)) {
                            i11 = 1;
                        } else if (this.macEngine.getAlgorithmName().startsWith(McElieceCCA2KeyGenParameterSpec.SHA224)) {
                            i11 = 7;
                            i12 = BERTags.FLAGS;
                        } else if (this.macEngine.getAlgorithmName().startsWith("SHA-256")) {
                            i11 = 4;
                        } else if (this.macEngine.getAlgorithmName().startsWith(McElieceCCA2KeyGenParameterSpec.SHA384)) {
                            i11 = 8;
                            i12 = MLKEMEngine.KyberPolyBytes;
                        } else if (this.macEngine.getAlgorithmName().startsWith("SHA-512")) {
                            i11 = 9;
                            i12 = 512;
                        } else {
                            if (!this.macEngine.getAlgorithmName().startsWith("RIPEMD160")) {
                                throw new InvalidAlgorithmParameterException("no PKCS12 mapping for HMAC: " + this.macEngine.getAlgorithmName());
                            }
                            i11 = 2;
                        }
                        i12 = 160;
                    }
                    cipherParametersMakePBEMacParameters = PBE.Util.makePBEMacParameters(secretKey, 2, i11, i12, pBEParameterSpec);
                } catch (Exception unused) {
                    i1.v("PKCS12 requires a PBEParameterSpec");
                    return;
                }
            } catch (Exception unused2) {
                a.i("PKCS12 requires a SecretKey/PBEKey");
                return;
            }
        } else if (key instanceof BCPBEKey) {
            BCPBEKey bCPBEKey = (BCPBEKey) key;
            if (bCPBEKey.getParam() != null) {
                cipherParametersMakePBEMacParameters = bCPBEKey.getParam();
            } else {
                if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                    i1.v("PBE requires PBE parameters to be set.");
                    return;
                }
                cipherParametersMakePBEMacParameters = PBE.Util.makePBEMacParameters(bCPBEKey, algorithmParameterSpec);
            }
        } else {
            if (algorithmParameterSpec instanceof PBEParameterSpec) {
                throw new InvalidAlgorithmParameterException("inappropriate parameter type: ".concat(algorithmParameterSpec.getClass().getName()));
            }
            cipherParametersMakePBEMacParameters = new KeyParameter(key.getEncoded());
        }
        KeyParameter keyParameter = cipherParametersMakePBEMacParameters instanceof ParametersWithIV ? (KeyParameter) ((ParametersWithIV) cipherParametersMakePBEMacParameters).getParameters() : (KeyParameter) cipherParametersMakePBEMacParameters;
        if (algorithmParameterSpec instanceof AEADParameterSpec) {
            AEADParameterSpec aEADParameterSpec = (AEADParameterSpec) algorithmParameterSpec;
            cipherParametersMakePBEMacParameters = new AEADParameters(keyParameter, aEADParameterSpec.getMacSizeInBits(), aEADParameterSpec.getNonce(), aEADParameterSpec.getAssociatedData());
        } else if (algorithmParameterSpec instanceof IvParameterSpec) {
            cipherParametersMakePBEMacParameters = new ParametersWithIV(keyParameter, ((IvParameterSpec) algorithmParameterSpec).getIV());
        } else if (algorithmParameterSpec instanceof RC2ParameterSpec) {
            RC2ParameterSpec rC2ParameterSpec = (RC2ParameterSpec) algorithmParameterSpec;
            cipherParametersMakePBEMacParameters = new ParametersWithIV(new RC2Parameters(keyParameter.getKey(), rC2ParameterSpec.getEffectiveKeyBits()), rC2ParameterSpec.getIV());
        } else if (algorithmParameterSpec instanceof SkeinParameterSpec) {
            cipherParametersMakePBEMacParameters = new SkeinParameters.Builder(copyMap(((SkeinParameterSpec) algorithmParameterSpec).getParameters())).setKey(keyParameter.getKey()).build();
        } else if (algorithmParameterSpec == null) {
            cipherParametersMakePBEMacParameters = new KeyParameter(key.getEncoded());
        } else if (GcmSpecUtil.isGcmSpec(algorithmParameterSpec)) {
            cipherParametersMakePBEMacParameters = GcmSpecUtil.extractAeadParameters(keyParameter, algorithmParameterSpec);
        } else if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
            throw new InvalidAlgorithmParameterException("unknown parameter type: ".concat(algorithmParameterSpec.getClass().getName()));
        }
        try {
            this.macEngine.init(cipherParametersMakePBEMacParameters);
        } catch (Exception e5) {
            throw new InvalidAlgorithmParameterException(k.j(e5, new StringBuilder("cannot initialize MAC: ")));
        }
    }

    @Override // javax.crypto.MacSpi
    public void engineReset() {
        this.macEngine.reset();
    }

    @Override // javax.crypto.MacSpi
    public void engineUpdate(byte b8) {
        this.macEngine.update(b8);
    }

    @Override // javax.crypto.MacSpi
    public void engineUpdate(byte[] bArr, int i11, int i12) {
        this.macEngine.update(bArr, i11, i12);
    }

    public BaseMac(int i11, Mac mac) {
        this.scheme = 2;
        this.pbeHash = 1;
        this.keySize = i11;
        this.macEngine = mac;
    }

    public BaseMac(Mac mac, int i11, int i12, int i13) {
        this.macEngine = mac;
        this.scheme = i11;
        this.pbeHash = i12;
        this.keySize = i13;
    }
}
